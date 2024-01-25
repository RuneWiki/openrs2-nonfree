import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class5_Sub6_Sub7 extends Class5_Sub6 {

	@OriginalMember(owner = "client!dm", name = "H", descriptor = "[Lclient!gk;")
	private Class47[] aClass47Array1;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "([[II)V")
	private void method1798(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static421.anInt7443;
		@Pc(9) int local9 = Static378.anInt6579;
		Static259.method3613(arg0);
		Static480.method3954(Static575.anInt9380, Static442.anInt7781);
		if (this.aClass47Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass47Array1.length; local28++) {
			@Pc(35) Class47 local35 = this.aClass47Array1[local28];
			@Pc(38) int local38 = local35.anInt10094;
			@Pc(41) int local41 = local35.anInt10096;
			if (local38 < 0) {
				if (local41 >= 0) {
					local35.method8414(local7, local9);
				}
			} else if (local41 < 0) {
				local35.method8413(local9, local7);
			} else {
				local35.method8416(local7, local9);
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			this.method1798(super.aClass296_41.method7190());
		}
		return local15;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8122(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass242_41.method5691(arg0);
		if (super.aClass242_41.aBoolean487) {
			@Pc(24) int local24 = Static421.anInt7443;
			@Pc(26) int local26 = Static378.anInt6579;
			@Pc(30) int[][] local30 = new int[local26][local24];
			@Pc(35) int[][][] local35 = super.aClass242_41.method5693();
			this.method1798(local30);
			for (@Pc(43) int local43 = 0; local43 < Static378.anInt6579; local43++) {
				@Pc(49) int[] local49 = local30[local43];
				@Pc(53) int[][] local53 = local35[local43];
				@Pc(57) int[] local57 = local53[0];
				@Pc(61) int[] local61 = local53[1];
				@Pc(65) int[] local65 = local53[2];
				for (@Pc(67) int local67 = 0; local67 < Static421.anInt7443; local67++) {
					@Pc(73) int local73 = local49[local67];
					local65[local67] = (local73 & 0xFF) << 4;
					local61[local67] = local73 >> 4 & 0xFF0;
					local57[local67] = local73 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass47Array1 = new Class47[arg0.method3642()];
			for (@Pc(15) int local15 = 0; local15 < this.aClass47Array1.length; local15++) {
				@Pc(21) int local21 = arg0.method3642();
				if (local21 == 0) {
					this.aClass47Array1[local15] = Static536.method7427(arg0);
				} else if (local21 == 1) {
					this.aClass47Array1[local15] = Static285.method3926(arg0);
				} else if (local21 == 2) {
					this.aClass47Array1[local15] = Static107.method1768(arg0);
				} else if (local21 == 3) {
					this.aClass47Array1[local15] = Static413.method6080(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean718 = arg0.method3642() == 1;
		}
	}
}
