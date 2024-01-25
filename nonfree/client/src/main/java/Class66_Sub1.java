import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public final class Class66_Sub1 extends Class66 implements Interface1 {

	@OriginalMember(owner = "client!ft", name = "h", descriptor = "I")
	private int anInt2096;

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
	private int anInt2095;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lclient!ks;I[BIZ)V")
	public Class66_Sub1(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt2096 = arg1;
		this.anInt2095 = this.aClass63_Sub1_39.method3368(this.anInt2096);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "()I")
	@Override
	public int method5379() {
		return super.method5379();
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(III)V")
	@Override
	public void method2056(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass63_Sub1_39.anOpengl1.glDrawElements(4, arg1, this.anInt2096, (long) (arg0 * this.anInt2095));
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method2055(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method5378(arg0, arg1);
		this.anInt2096 = 5123;
		this.anInt2095 = this.aClass63_Sub1_39.method3368(this.anInt2096);
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "()V")
	@Override
	protected void method5380() {
		this.aClass63_Sub1_39.method3358(this);
	}
}
