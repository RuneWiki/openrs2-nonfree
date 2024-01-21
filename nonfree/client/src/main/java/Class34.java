import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class34 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	private int anInt1428;

	@OriginalMember(owner = "client!g", name = "m", descriptor = "I")
	private int anInt1435;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!g", name = "s", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!g", name = "p", descriptor = "[B")
	private final byte[] aByteArray6 = new byte[4];

	@OriginalMember(owner = "client!g", name = "l", descriptor = "Lclient!nc;")
	private final Class65 aClass65_3;

	@OriginalMember(owner = "client!g", name = "r", descriptor = "I")
	private int anInt1438;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "J")
	private final long aLong65;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!d;Ljava/net/URL;)V")
	public Class34(@OriginalArg(0) Class24 arg0, @OriginalArg(1) URL arg1) {
		this.aClass65_3 = arg0.method556(arg1);
		this.anInt1438 = 0;
		this.aLong65 = Static124.method1828() + 30000L;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)[B")
	public byte[] method974() throws IOException {
		if (Static124.method1828() > this.aLong65) {
			throw new IOException("fdt");
		}
		if (this.anInt1438 == 0) {
			if (this.aClass65_3.anInt2681 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass65_3.anInt2681 == 1) {
				this.anInt1438 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass65_3.anObject3;
			}
		}
		@Pc(59) int local59;
		if (this.anInt1438 == 1) {
			local59 = this.aDataInputStream1.available();
			if (local59 > 0) {
				if (this.anInt1435 + local59 > 4) {
					local59 = 4 - this.anInt1435;
				}
				this.anInt1435 += this.aDataInputStream1.read(this.aByteArray6, this.anInt1435, local59);
				if (this.anInt1435 == 4) {
					@Pc(104) int local104 = (new Class1_Sub14(this.aByteArray6)).method3058();
					this.anInt1438 = 2;
					this.aByteArray7 = new byte[local104];
				}
			}
		}
		if (this.anInt1438 == 2) {
			local59 = this.aDataInputStream1.available();
			if (local59 > 0) {
				if (local59 + this.anInt1428 > this.aByteArray7.length) {
					local59 = this.aByteArray7.length - this.anInt1428;
				}
				this.anInt1428 += this.aDataInputStream1.read(this.aByteArray7, this.anInt1428, local59);
				if (this.aByteArray7.length == this.anInt1428) {
					return this.aByteArray7;
				}
			}
		}
		return null;
	}
}
