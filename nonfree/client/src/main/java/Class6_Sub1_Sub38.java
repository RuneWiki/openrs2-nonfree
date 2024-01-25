import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class6_Sub1_Sub38 extends Class6_Sub1 {

	@OriginalMember(owner = "client!w", name = "I", descriptor = "[Lclient!cs;")
	private Class24[] aClass24Array1;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			this.method8876(super.aClass135_41.method3063());
		}
		return local14;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8957(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass54_41.method1386(arg0);
		if (super.aClass54_41.aBoolean81) {
			@Pc(21) int local21 = Static479.anInt8231;
			@Pc(23) int local23 = Static434.anInt7425;
			@Pc(27) int[][] local27 = new int[local23][local21];
			@Pc(32) int[][][] local32 = super.aClass54_41.method1387();
			this.method8876(local27);
			for (@Pc(38) int local38 = 0; local38 < Static434.anInt7425; local38++) {
				@Pc(44) int[] local44 = local27[local38];
				@Pc(48) int[][] local48 = local32[local38];
				@Pc(52) int[] local52 = local48[0];
				@Pc(56) int[] local56 = local48[1];
				@Pc(60) int[] local60 = local48[2];
				for (@Pc(62) int local62 = 0; local62 < Static479.anInt8231; local62++) {
					@Pc(68) int local68 = local44[local62];
					local60[local62] = (local68 & 0xFF) << 4;
					local56[local62] = local68 >> 4 & 0xFF0;
					local52[local62] = local68 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B[[I)V")
	private void method8876(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static479.anInt8231;
		@Pc(9) int local9 = Static434.anInt7425;
		Static94.method1545(arg0);
		Static123.method1902(Static413.anInt7225, Static476.anInt8174);
		if (this.aClass24Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass24Array1.length; local28++) {
			@Pc(35) Class24 local35 = this.aClass24Array1[local28];
			@Pc(38) int local38 = local35.anInt9952;
			@Pc(41) int local41 = local35.anInt9953;
			if (local38 < 0) {
				if (local41 >= 0) {
					local35.method8414(local7, local9);
				}
			} else if (local41 >= 0) {
				local35.method8413(local9, local7);
			} else {
				local35.method8409(local7, local9);
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aClass24Array1 = new Class24[arg0.method8374()];
			for (@Pc(37) int local37 = 0; local37 < this.aClass24Array1.length; local37++) {
				@Pc(43) int local43 = arg0.method8374();
				if (local43 == 0) {
					this.aClass24Array1[local37] = Static75.method1316(arg0);
				} else if (local43 == 1) {
					this.aClass24Array1[local37] = Static120.method1887(arg0);
				} else if (local43 == 2) {
					this.aClass24Array1[local37] = Static94.method1542(arg0);
				} else if (local43 == 3) {
					this.aClass24Array1[local37] = Static430.method8455(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean736 = arg0.method8374() == 1;
			return;
		}
	}
}
