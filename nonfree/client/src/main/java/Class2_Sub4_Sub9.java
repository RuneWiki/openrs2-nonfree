import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class2_Sub4_Sub9 extends Class2_Sub4 {

	@OriginalMember(owner = "client!e", name = "R", descriptor = "[I")
	public static final int[] anIntArray282 = new int[99];

	@OriginalMember(owner = "client!e", name = "lb", descriptor = "I")
	public static int lb;

	@OriginalMember(owner = "client!e", name = "O", descriptor = "I")
	private int anInt1320;

	@OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
	private int anInt1326;

	@OriginalMember(owner = "client!e", name = "Z", descriptor = "I")
	private int anInt1327;

	@OriginalMember(owner = "client!e", name = "cb", descriptor = "I")
	private int anInt1329;

	@OriginalMember(owner = "client!e", name = "db", descriptor = "I")
	private int anInt1330;

	@OriginalMember(owner = "client!e", name = "hb", descriptor = "I")
	private int anInt1334;

	@OriginalMember(owner = "client!e", name = "eb", descriptor = "I")
	private int anInt1331 = 0;

	@OriginalMember(owner = "client!e", name = "fb", descriptor = "I")
	private int anInt1332 = 0;

	@OriginalMember(owner = "client!e", name = "ib", descriptor = "I")
	private int anInt1335 = 0;

	static {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < 99; local9++) {
			@Pc(14) int local14 = local9 + 1;
			@Pc(27) int local27 = (int) (Math.pow(2.0D, (double) local14 / 7.0D) * 300.0D + (double) local14);
			local7 += local27;
			anIntArray282[local9] = local7 / 4;
		}
		lb = 0;
	}

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method5594(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass170_41.method3736(arg0);
		if (super.aClass170_41.aBoolean309) {
			@Pc(26) int[][] local26 = this.method5591(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static76.anInt1458; local52++) {
				this.method1082(local30[local52], local34[local52], local38[local52]);
				this.anInt1329 += this.anInt1331;
				this.anInt1326 += this.anInt1335;
				for (this.anInt1327 += this.anInt1332; this.anInt1327 < 0; this.anInt1327 += 4096) {
				}
				while (this.anInt1327 > 4096) {
					this.anInt1327 -= 4096;
				}
				if (this.anInt1326 < 0) {
					this.anInt1326 = 0;
				}
				if (this.anInt1326 > 4096) {
					this.anInt1326 = 4096;
				}
				if (this.anInt1329 < 0) {
					this.anInt1329 = 0;
				}
				if (this.anInt1329 > 4096) {
					this.anInt1329 = 4096;
				}
				this.method1083(this.anInt1327, this.anInt1326, this.anInt1329);
				local42[local52] = this.anInt1330;
				local46[local52] = this.anInt1320;
				local50[local52] = this.anInt1334;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1332 = arg0.method5341();
		} else if (arg1 == 1) {
			this.anInt1335 = (arg0.method5330() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt1331 = (arg0.method5330() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZI)V")
	private void method1082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = arg0 > arg1 ? arg0 : arg1;
		@Pc(31) int local31 = arg0 < arg1 ? arg0 : arg1;
		@Pc(38) int local38 = local20 >= arg2 ? local20 : arg2;
		@Pc(49) int local49 = arg2 < local31 ? arg2 : local31;
		this.anInt1329 = (local38 + local49) / 2;
		@Pc(61) int local61 = local38 - local49;
		if (local61 <= 0) {
			this.anInt1327 = 0;
		} else {
			@Pc(77) int local77 = (local38 - arg0 << 12) / local61;
			@Pc(85) int local85 = (local38 - arg1 << 12) / local61;
			@Pc(94) int local94 = (local38 - arg2 << 12) / local61;
			if (local38 == arg0) {
				this.anInt1327 = arg1 == local49 ? local94 + 20480 : 4096 - local85;
			} else if (arg1 == local38) {
				this.anInt1327 = arg2 == local49 ? local77 + 4096 : -local94 + 12288;
			} else {
				this.anInt1327 = local49 == arg0 ? local85 + 12288 : 20480 - local77;
			}
			this.anInt1327 /= 6;
		}
		if (this.anInt1329 > 0 && this.anInt1329 < 4096) {
			this.anInt1326 = (local61 << 12) / (this.anInt1329 > 2048 ? 8192 - (this.anInt1329 * 2) : this.anInt1329 * 2);
		} else {
			this.anInt1326 = 0;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IBII)V")
	private void method1083(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(29) int local29 = arg2 > 2048 ? arg1 + arg2 - (arg2 * arg1 >> 12) : (arg1 + 4096) * arg2 >> 12;
		if (local29 <= 0) {
			this.anInt1330 = this.anInt1320 = this.anInt1334 = arg2;
			return;
		}
		@Pc(49) int local49 = arg0 * 6;
		@Pc(56) int local56 = arg2 + arg2 - local29;
		@Pc(65) int local65 = (local29 - local56 << 12) / local29;
		@Pc(69) int local69 = local49 >> 12;
		@Pc(76) int local76 = local49 - (local69 << 12);
		@Pc(84) int local84 = local65 * local29 >> 12;
		@Pc(90) int local90 = local84 * local76 >> 12;
		@Pc(94) int local94 = local90 + local56;
		@Pc(98) int local98 = local29 - local90;
		if (local69 == 0) {
			this.anInt1334 = local56;
			this.anInt1330 = local29;
			this.anInt1320 = local94;
		} else if (local69 == 1) {
			this.anInt1320 = local29;
			this.anInt1330 = local98;
			this.anInt1334 = local56;
		} else if (local69 == 2) {
			this.anInt1334 = local94;
			this.anInt1330 = local56;
			this.anInt1320 = local29;
		} else if (local69 == 3) {
			this.anInt1330 = local56;
			this.anInt1320 = local98;
			this.anInt1334 = local29;
		} else if (local69 == 4) {
			this.anInt1334 = local29;
			this.anInt1330 = local94;
			this.anInt1320 = local56;
		} else if (local69 == 5) {
			this.anInt1334 = local98;
			this.anInt1320 = local56;
			this.anInt1330 = local29;
		}
	}
}
