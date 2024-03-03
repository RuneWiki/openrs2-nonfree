import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class2_Sub3_Sub9 extends Class2_Sub3 {

	@OriginalMember(owner = "client!dr", name = "S", descriptor = "I")
	public static int anInt1620 = 0;

	@OriginalMember(owner = "client!dr", name = "U", descriptor = "I")
	public static int anInt1622 = 0;

	@OriginalMember(owner = "client!dr", name = "N", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_34 = new Class79("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!dr", name = "V", descriptor = "I")
	public static int anInt1623 = 0;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "()V", line = 4)
	public Class2_Sub3_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!bt;I)V", line = 9)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			super.aBoolean487 = arg1.method4816() == 1;
		}
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(IB)[[I", line = 24)
	@Override
	public int[][] method6480(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass243_41.method6278(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static211.anInt4031; local34++) {
				this.method1766(local34, arg0);
				@Pc(47) int[][] local47 = this.method6484(0, Class153.anInt3794);
				local24[local34] = local47[0][Class2_Sub43.anInt7161];
				local28[local34] = local47[1][Class2_Sub43.anInt7161];
				local32[local34] = local47[2][Class2_Sub43.anInt7161];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(III)V", line = 81)
	private void method1766(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static311.anIntArray424[arg0];
		@Pc(13) int local13 = Static16.anIntArray322[arg1];
		@Pc(28) float local28 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Class2_Sub43.anInt7161 = arg0;
			Class153.anInt3794 = arg1;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Class2_Sub43.anInt7161 = arg1;
			Class153.anInt3794 = arg0;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Class2_Sub43.anInt7161 = Static211.anInt4031 - arg1;
			Class153.anInt3794 = arg0;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Class2_Sub43.anInt7161 = arg0;
			Class153.anInt3794 = Static23.anInt638 - arg1;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Class153.anInt3794 = Static23.anInt638 - arg1;
			Class2_Sub43.anInt7161 = Static211.anInt4031 - arg0;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Class2_Sub43.anInt7161 = Static211.anInt4031 - arg1;
			Class153.anInt3794 = Static23.anInt638 - arg0;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Class153.anInt3794 = Static23.anInt638 - arg0;
			Class2_Sub43.anInt7161 = arg1;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Class153.anInt3794 = arg1;
			Class2_Sub43.anInt7161 = Static211.anInt4031 - arg0;
		}
		Class153.anInt3794 &= Static139.anInt2715;
		Class2_Sub43.anInt7161 &= Static69.anInt1719;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BI)[I", line = 158)
	@Override
	public int[] method6486(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass158_41.method3997(arg0);
		if (super.aClass158_41.aBoolean265) {
			for (@Pc(25) int local25 = 0; local25 < Static211.anInt4031; local25++) {
				this.method1766(local25, arg0);
				@Pc(38) int[] local38 = this.method6474(0, Class153.anInt3794);
				local11[local25] = local38[Class2_Sub43.anInt7161];
			}
		}
		return local11;
	}
}
