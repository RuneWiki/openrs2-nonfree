import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class149 {

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "[I")
	public int[] anIntArray471 = new int[2];

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12 = new int[2][2][4];

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11 = new int[2][2][4];

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "[I")
	private int[] anIntArray472 = new int[2];

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIF)F")
	private float method3675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray11[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray11[arg0][1][arg1] - this.anIntArrayArrayArray11[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IF)I")
	public int method3677(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray472[0] + (float) (this.anIntArray472[1] - this.anIntArray472[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static232.aFloat107 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static232.anInt4426 = (int) (Static232.aFloat107 * 65536.0F);
		}
		if (this.anIntArray471[arg0] == 0) {
			return 0;
		}
		local20 = this.method3675(arg0, 0, arg1);
		Static232.aFloatArrayArray2[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method3680(arg0, 0, arg1));
		Static232.aFloatArrayArray2[arg0][1] = local20 * local20;
		@Pc(77) int local77;
		for (local77 = 1; local77 < this.anIntArray471[arg0]; local77++) {
			local20 = this.method3675(arg0, local77, arg1);
			@Pc(102) float local102 = -2.0F * local20 * (float) Math.cos((double) this.method3680(arg0, local77, arg1));
			@Pc(106) float local106 = local20 * local20;
			Static232.aFloatArrayArray2[arg0][local77 * 2 + 1] = Static232.aFloatArrayArray2[arg0][local77 * 2 - 1] * local106;
			Static232.aFloatArrayArray2[arg0][local77 * 2] = Static232.aFloatArrayArray2[arg0][local77 * 2 - 1] * local102 + Static232.aFloatArrayArray2[arg0][local77 * 2 - 2] * local106;
			for (@Pc(162) int local162 = local77 * 2 - 1; local162 >= 2; local162--) {
				Static232.aFloatArrayArray2[arg0][local162] += Static232.aFloatArrayArray2[arg0][local162 - 1] * local102 + Static232.aFloatArrayArray2[arg0][local162 - 2] * local106;
			}
			Static232.aFloatArrayArray2[arg0][1] += Static232.aFloatArrayArray2[arg0][0] * local102 + local106;
			Static232.aFloatArrayArray2[arg0][0] += local102;
		}
		if (arg0 == 0) {
			for (local77 = 0; local77 < this.anIntArray471[0] * 2; local77++) {
				Static232.aFloatArrayArray2[0][local77] *= Static232.aFloat107;
			}
		}
		for (local77 = 0; local77 < this.anIntArray471[arg0] * 2; local77++) {
			Static232.anIntArrayArray38[arg0][local77] = (int) (Static232.aFloatArrayArray2[arg0][local77] * 65536.0F);
		}
		return this.anIntArray471[arg0] * 2;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!fd;Lclient!h;)V")
	public void method3679(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(1) Class73 arg1) {
		@Pc(3) int local3 = arg0.method4666();
		this.anIntArray471[0] = local3 >> 4;
		this.anIntArray471[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray472[0] = this.anIntArray472[1] = 0;
			return;
		}
		this.anIntArray472[0] = arg0.method4653();
		this.anIntArray472[1] = arg0.method4653();
		@Pc(37) int local37 = arg0.method4666();
		@Pc(39) int local39;
		@Pc(44) int local44;
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray471[local39]; local44++) {
				this.anIntArrayArrayArray12[local39][0][local44] = arg0.method4653();
				this.anIntArrayArrayArray11[local39][0][local44] = arg0.method4653();
			}
		}
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray471[local39]; local44++) {
				if ((local37 & 0x1 << local39 * 4 << local44) == 0) {
					this.anIntArrayArrayArray12[local39][1][local44] = this.anIntArrayArrayArray12[local39][0][local44];
					this.anIntArrayArrayArray11[local39][1][local44] = this.anIntArrayArrayArray11[local39][0][local44];
				} else {
					this.anIntArrayArrayArray12[local39][1][local44] = arg0.method4653();
					this.anIntArrayArrayArray11[local39][1][local44] = arg0.method4653();
				}
			}
		}
		if (local37 != 0 || this.anIntArray472[1] != this.anIntArray472[0]) {
			arg1.method1676(arg0);
		}
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(IIF)F")
	private float method3680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray12[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray12[arg0][1][arg1] - this.anIntArrayArrayArray12[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static232.method3678(local34);
	}
}
