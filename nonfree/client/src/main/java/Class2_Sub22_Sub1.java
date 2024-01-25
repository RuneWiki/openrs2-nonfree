import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class2_Sub22_Sub1 extends Class2_Sub22 {

	@OriginalMember(owner = "client!he", name = "k", descriptor = "Z")
	public boolean aBoolean170;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "I")
	public int anInt2622;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "I")
	public int anInt2623;

	@OriginalMember(owner = "client!he", name = "j", descriptor = "I")
	public int anInt2621;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub22_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2622 = arg0;
		this.aByteArray18 = arg1;
		this.anInt2623 = arg2;
		this.anInt2621 = arg3;
	}

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub22_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2622 = arg0;
		this.aByteArray18 = arg1;
		this.anInt2623 = arg2;
		this.anInt2621 = arg3;
		this.aBoolean170 = arg4;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!ug;)Lclient!he;")
	public Class2_Sub22_Sub1 method2159(@OriginalArg(0) Class243 arg0) {
		this.aByteArray18 = arg0.method5147(this.aByteArray18);
		this.anInt2622 = arg0.method5149(this.anInt2622);
		if (this.anInt2623 == this.anInt2621) {
			this.anInt2623 = this.anInt2621 = arg0.method5144(this.anInt2623);
		} else {
			this.anInt2623 = arg0.method5144(this.anInt2623);
			this.anInt2621 = arg0.method5144(this.anInt2621);
			if (this.anInt2623 == this.anInt2621) {
				this.anInt2623--;
			}
		}
		return this;
	}
}
