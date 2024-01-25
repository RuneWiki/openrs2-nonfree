import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public final class Class2_Sub12_Sub1 extends Class2_Sub12 {

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "Z")
	public boolean aBoolean117;

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
	public int anInt1415;

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
	public int anInt1416;

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
	public int anInt1414;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1415 = arg0;
		this.aByteArray21 = arg1;
		this.anInt1416 = arg2;
		this.anInt1414 = arg3;
	}

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1415 = arg0;
		this.aByteArray21 = arg1;
		this.anInt1416 = arg2;
		this.anInt1414 = arg3;
		this.aBoolean117 = arg4;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!ew;)Lclient!cj;")
	public Class2_Sub12_Sub1 method1266(@OriginalArg(0) Class101 arg0) {
		this.aByteArray21 = arg0.method2620(this.aByteArray21);
		this.anInt1415 = arg0.method2616(this.anInt1415);
		if (this.anInt1416 == this.anInt1414) {
			this.anInt1416 = this.anInt1414 = arg0.method2618(this.anInt1416);
		} else {
			this.anInt1416 = arg0.method2618(this.anInt1416);
			this.anInt1414 = arg0.method2618(this.anInt1414);
			if (this.anInt1416 == this.anInt1414) {
				this.anInt1416--;
			}
		}
		return this;
	}
}
