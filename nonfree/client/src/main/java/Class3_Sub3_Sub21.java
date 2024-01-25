import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class3_Sub3_Sub21 extends Class3_Sub3 {

	@OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
	private int anInt3785;

	@OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
	private int anInt3787;

	@OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
	private int anInt3790;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I)V")
	private Class3_Sub3_Sub21(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2992(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub21() {
		this(0);
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method5734(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass84_41.method2091(arg0);
		if (super.aClass84_41.aBoolean144) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static131.anInt2755; local34++) {
				local24[local34] = this.anInt3785;
				local28[local34] = this.anInt3787;
				local32[local34] = this.anInt3790;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)V")
	private void method2992(@OriginalArg(1) int arg0) {
		this.anInt3787 = arg0 >> 4 & 0xFF0;
		this.anInt3790 = (arg0 & 0xFF) << 4;
		this.anInt3785 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method2992(arg0.method3659());
		}
	}
}
