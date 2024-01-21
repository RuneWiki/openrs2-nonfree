import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class28 {

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
	private int anInt1140;

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
	private int anInt1143;

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "[B")
	private final byte[] aByteArray19 = new byte[4];

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
	private int anInt1142 = 0;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "Lclient!ef;")
	private final Class22 aClass22_5;

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
	private int anInt1136;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!ba;Ljava/net/URL;)V")
	public Class28(@OriginalArg(0) Class6 arg0, @OriginalArg(1) URL arg1) {
		this.aClass22_5 = arg0.method127(arg1);
		this.anInt1136 = 0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)[B")
	public byte[] method779() throws IOException {
		this.anInt1142++;
		if (this.anInt1142 > 250) {
			throw new IOException();
		}
		if (this.anInt1136 == 0) {
			if (this.aClass22_5.anInt864 == 2) {
				throw new IOException();
			}
			if (this.aClass22_5.anInt864 == 1) {
				this.anInt1136 = 1;
				this.anInt1142 = 0;
				this.aDataInputStream1 = (DataInputStream) this.aClass22_5.anObject2;
			}
		}
		@Pc(60) int local60;
		if (this.anInt1136 == 1) {
			local60 = this.aDataInputStream1.available();
			if (local60 > 0) {
				if (local60 + this.anInt1143 > 4) {
					local60 = 4 - this.anInt1143;
				}
				this.anInt1143 += this.aDataInputStream1.read(this.aByteArray19, this.anInt1143, local60);
				if (this.anInt1143 == 4) {
					@Pc(99) int local99 = (new Class3_Sub7(this.aByteArray19)).method638();
					this.aByteArray20 = new byte[local99];
					this.anInt1136 = 2;
					this.anInt1142 = 0;
				}
			}
		}
		if (this.anInt1136 == 2) {
			local60 = this.aDataInputStream1.available();
			if (local60 > 0) {
				if (this.anInt1140 + local60 > this.aByteArray20.length) {
					local60 = this.aByteArray20.length - this.anInt1140;
				}
				this.anInt1140 += this.aDataInputStream1.read(this.aByteArray20, this.anInt1140, local60);
				if (this.anInt1140 == this.aByteArray20.length) {
					return this.aByteArray20;
				}
			}
		}
		return null;
	}
}
