import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class65 {

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "[B")
	private byte[] aByteArray37;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
	private int anInt2483;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
	private int anInt2484;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "[B")
	private byte[] aByteArray38 = new byte[4];

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "Lclient!ni;")
	private Class84 aClass84_6;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
	private int anInt2480;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "J")
	private long aLong97;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!ej;Ljava/net/URL;)V")
	public Class65(@OriginalArg(0) Class34 arg0, @OriginalArg(1) URL arg1) {
		this.aClass84_6 = arg0.method1062(arg1);
		this.anInt2480 = 0;
		this.aLong97 = Static209.method3309() + 30000L;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)[B")
	public byte[] method1952() throws IOException {
		if (Static209.method3309() > this.aLong97) {
			throw new IOException("fdt");
		}
		if (this.anInt2480 == 0) {
			if (this.aClass84_6.anInt3171 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass84_6.anInt3171 == 1) {
				this.anInt2480 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass84_6.anObject4;
			}
		}
		@Pc(58) int local58;
		if (this.anInt2480 == 1) {
			local58 = this.aDataInputStream1.available();
			if (local58 > 0) {
				if (this.anInt2483 + local58 > 4) {
					local58 = 4 - this.anInt2483;
				}
				this.anInt2483 += this.aDataInputStream1.read(this.aByteArray38, this.anInt2483, local58);
				if (this.anInt2483 == 4) {
					@Pc(99) int local99 = (new Class1_Sub26(this.aByteArray38)).method2958();
					this.aByteArray37 = new byte[local99];
					this.anInt2480 = 2;
				}
			}
		}
		if (this.anInt2480 == 2) {
			local58 = this.aDataInputStream1.available();
			if (local58 > 0) {
				if (this.aByteArray37.length < local58 + this.anInt2484) {
					local58 = this.aByteArray37.length - this.anInt2484;
				}
				this.anInt2484 += this.aDataInputStream1.read(this.aByteArray37, this.anInt2484, local58);
				if (this.aByteArray37.length == this.anInt2484) {
					return this.aByteArray37;
				}
			}
		}
		return null;
	}
}
