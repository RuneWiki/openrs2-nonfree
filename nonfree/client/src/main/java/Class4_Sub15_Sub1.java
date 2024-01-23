import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public final class Class4_Sub15_Sub1 extends Class4_Sub15 {

	@OriginalMember(owner = "client!gl", name = "m", descriptor = "Z")
	public boolean aBoolean143;

	@OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
	public int anInt1904;

	@OriginalMember(owner = "client!gl", name = "l", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
	public int anInt1906;

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
	public int anInt1905;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(I[BII)V")
	public Class4_Sub15_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1904 = arg0;
		this.aByteArray26 = arg1;
		this.anInt1906 = arg2;
		this.anInt1905 = arg3;
	}

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class4_Sub15_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1904 = arg0;
		this.aByteArray26 = arg1;
		this.anInt1906 = arg2;
		this.anInt1905 = arg3;
		this.aBoolean143 = arg4;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!h;)Lclient!gl;")
	public Class4_Sub15_Sub1 method1487(@OriginalArg(0) Class56 arg0) {
		this.aByteArray26 = arg0.method1497(this.aByteArray26);
		this.anInt1904 = arg0.method1493(this.anInt1904);
		if (this.anInt1906 == this.anInt1905) {
			this.anInt1906 = this.anInt1905 = arg0.method1491(this.anInt1906);
		} else {
			this.anInt1906 = arg0.method1491(this.anInt1906);
			this.anInt1905 = arg0.method1491(this.anInt1905);
			if (this.anInt1906 == this.anInt1905) {
				this.anInt1906--;
			}
		}
		return this;
	}
}
