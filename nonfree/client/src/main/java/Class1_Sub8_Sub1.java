import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public final class Class1_Sub8_Sub1 extends Class1_Sub8 {

	@OriginalMember(owner = "client!cj", name = "s", descriptor = "Z")
	public boolean aBoolean105;

	@OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
	public int anInt755;

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
	public int anInt753;

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
	public int anInt754;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub8_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt755 = arg0;
		this.aByteArray12 = arg1;
		this.anInt753 = arg2;
		this.anInt754 = arg3;
	}

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub8_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt755 = arg0;
		this.aByteArray12 = arg1;
		this.anInt753 = arg2;
		this.anInt754 = arg3;
		this.aBoolean105 = arg4;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!cb;)Lclient!cj;")
	public Class1_Sub8_Sub1 method697(@OriginalArg(0) Class35 arg0) {
		this.aByteArray12 = arg0.method631(this.aByteArray12);
		this.anInt755 = arg0.method633(this.anInt755);
		if (this.anInt753 == this.anInt754) {
			this.anInt753 = this.anInt754 = arg0.method630(this.anInt753);
		} else {
			this.anInt753 = arg0.method630(this.anInt753);
			this.anInt754 = arg0.method630(this.anInt754);
			if (this.anInt753 == this.anInt754) {
				this.anInt753--;
			}
		}
		return this;
	}
}
