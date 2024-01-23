import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class4_Sub6 extends Class4 {

	@OriginalMember(owner = "client!da", name = "j", descriptor = "Lclient!sk;")
	protected Class156 aClass156_41;

	@OriginalMember(owner = "client!da", name = "m", descriptor = "I")
	public int anInt5511;

	@OriginalMember(owner = "client!da", name = "q", descriptor = "Lclient!jn;")
	protected Class84 aClass84_41;

	@OriginalMember(owner = "client!da", name = "x", descriptor = "[Lclient!da;")
	public Class4_Sub6[] aClass4_Sub6Array42;

	@OriginalMember(owner = "client!da", name = "o", descriptor = "Z")
	public boolean aBoolean355;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(IZ)V")
	protected Class4_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass4_Sub6Array42 = new Class4_Sub6[arg0];
		this.aBoolean355 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)V")
	public void method4370() {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BII)[I")
	protected final int[] method4372(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass4_Sub6Array42[arg0].aBoolean355 ? this.aClass4_Sub6Array42[arg0].method4375(arg1) : this.aClass4_Sub6Array42[arg0].method4379(arg1)[0];
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
	public void method4373() {
		if (this.aBoolean355) {
			this.aClass156_41.method3762();
			this.aClass156_41 = null;
		} else {
			this.aClass84_41.method2155();
			this.aClass84_41 = null;
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(BI)[I")
	public int[] method4375(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)[[I")
	protected final int[][] method4377(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass4_Sub6Array42[arg1].aBoolean355) {
			@Pc(32) int[] local32 = this.aClass4_Sub6Array42[arg1].method4375(arg0);
			return new int[][] { local32, local32, local32 };
		} else {
			return this.aClass4_Sub6Array42[arg1].method4379(arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(I)I")
	public int method4378() {
		return -1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)[[I")
	public int[][] method4379(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!p;II)V")
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V")
	public final void method4383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anInt5511 == 255 ? arg0 : this.anInt5511;
		if (this.aBoolean355) {
			this.aClass156_41 = new Class156(local14, arg0, arg1);
		} else {
			this.aClass84_41 = new Class84(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(I)I")
	public int method4384() {
		return -1;
	}
}
