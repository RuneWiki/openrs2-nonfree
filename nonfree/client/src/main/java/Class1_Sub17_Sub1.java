import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public final class Class1_Sub17_Sub1 extends Class1_Sub17 {

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "Z")
	public boolean aBoolean445;

	@OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
	public int anInt5538;

	@OriginalMember(owner = "client!mm", name = "l", descriptor = "[B")
	public byte[] aByteArray67;

	@OriginalMember(owner = "client!mm", name = "n", descriptor = "I")
	public int anInt5539;

	@OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
	public int anInt5540;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub17_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5538 = arg0;
		this.aByteArray67 = arg1;
		this.anInt5539 = arg2;
		this.anInt5540 = arg3;
	}

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub17_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5538 = arg0;
		this.aByteArray67 = arg1;
		this.anInt5539 = arg2;
		this.anInt5540 = arg3;
		this.aBoolean445 = arg4;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!eb;)Lclient!mm;")
	public Class1_Sub17_Sub1 method4526(@OriginalArg(0) Class80 arg0) {
		this.aByteArray67 = arg0.method1686(this.aByteArray67);
		this.anInt5538 = arg0.method1689(this.anInt5538);
		if (this.anInt5539 == this.anInt5540) {
			this.anInt5539 = this.anInt5540 = arg0.method1684(this.anInt5539);
		} else {
			this.anInt5539 = arg0.method1684(this.anInt5539);
			this.anInt5540 = arg0.method1684(this.anInt5540);
			if (this.anInt5539 == this.anInt5540) {
				this.anInt5539--;
			}
		}
		return this;
	}
}
