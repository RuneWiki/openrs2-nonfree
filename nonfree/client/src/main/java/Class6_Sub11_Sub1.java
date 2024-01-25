import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public final class Class6_Sub11_Sub1 extends Class6_Sub11 {

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "Z")
	public boolean aBoolean188;

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
	public int anInt2222;

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
	public int anInt2220;

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
	public int anInt2221;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(I[BII)V")
	public Class6_Sub11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2222 = arg0;
		this.aByteArray47 = arg1;
		this.anInt2220 = arg2;
		this.anInt2221 = arg3;
	}

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class6_Sub11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2222 = arg0;
		this.aByteArray47 = arg1;
		this.anInt2220 = arg2;
		this.anInt2221 = arg3;
		this.aBoolean188 = arg4;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!en;)Lclient!hk;")
	public Class6_Sub11_Sub1 method2389(@OriginalArg(0) Class63 arg0) {
		this.aByteArray47 = arg0.method1313(this.aByteArray47);
		this.anInt2222 = arg0.method1314(this.anInt2222);
		if (this.anInt2220 == this.anInt2221) {
			this.anInt2220 = this.anInt2221 = arg0.method1310(this.anInt2220);
		} else {
			this.anInt2220 = arg0.method1310(this.anInt2220);
			this.anInt2221 = arg0.method1310(this.anInt2221);
			if (this.anInt2220 == this.anInt2221) {
				this.anInt2220--;
			}
		}
		return this;
	}
}
