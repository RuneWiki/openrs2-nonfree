import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class2_Sub3_Sub37 extends Class2_Sub3 {

	@OriginalMember(owner = "client!vm", name = "N", descriptor = "[I")
	public static final int[] anIntArray479 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!vm", name = "S", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_144 = new Class79("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!vm", name = "Z", descriptor = "Z")
	public static boolean aBoolean471 = false;

	@OriginalMember(owner = "client!vm", name = "W", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_248 = new Class145(19, -1);

	@OriginalMember(owner = "client!vm", name = "X", descriptor = "[Lclient!pa;")
	private Class173[] aClass173Array1;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V", line = 3)
	public Class2_Sub3_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(IB)[[I", line = 6)
	@Override
	public int[][] method6480(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass243_41.method6278(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(22) int local22 = Static211.anInt4031;
			@Pc(24) int local24 = Static23.anInt638;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass243_41.method6281();
			this.method6219(local28);
			for (@Pc(39) int local39 = 0; local39 < Static23.anInt638; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static211.anInt4031; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILclient!bt;I)V", line = 69)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.aClass173Array1 = new Class173[arg1.method4816()];
			for (@Pc(33) int local33 = 0; local33 < this.aClass173Array1.length; local33++) {
				@Pc(39) int local39 = arg1.method4816();
				if (local39 == 0) {
					this.aClass173Array1[local33] = Static329.method1395(arg1);
				} else if (local39 == 1) {
					this.aClass173Array1[local33] = Static163.method1510(arg1);
				} else if (local39 == 2) {
					this.aClass173Array1[local33] = Static347.method6267(arg1);
				} else if (local39 == 3) {
					this.aClass173Array1[local33] = Static202.method3800(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean487 = arg1.method4816() == 1;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "([[II)V", line = 159)
	private void method6219(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static211.anInt4031;
		@Pc(9) int local9 = Static23.anInt638;
		Static36.method1133(arg0);
		Static19.method557(Static139.anInt2715, Static69.anInt1719);
		if (this.aClass173Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass173Array1.length; local28++) {
			@Pc(35) Class173 local35 = this.aClass173Array1[local28];
			@Pc(38) int local38 = local35.anInt6984;
			@Pc(41) int local41 = local35.anInt6983;
			if (local38 < 0) {
				if (local41 >= 0) {
					local35.method6251(local9, local7);
				}
			} else if (local41 >= 0) {
				local35.method6252(local7, local9);
			} else {
				local35.method6249(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)[I", line = 252)
	@Override
	public int[] method6486(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass158_41.method3997(arg0);
		if (super.aClass158_41.aBoolean265) {
			this.method6219(super.aClass158_41.method3999());
		}
		return local9;
	}
}
