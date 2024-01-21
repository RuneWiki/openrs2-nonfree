import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class6 {

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "[I")
	private final int[] anIntArray37;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "[I")
	private final int[] anIntArray36;

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "Lclient!h;")
	private final Class2_Sub1 aClass2_Sub1_2;

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "Lclient!h;")
	private final Class2_Sub1 aClass2_Sub1_1;

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "[Lclient!h;")
	private final Class2_Sub1[] aClass2_Sub1Array3;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public Class6() {
		this.anIntArray37 = new int[0];
		this.anIntArray36 = new int[0];
		this.aClass2_Sub1_2 = new Class2_Sub1_Sub10();
		this.aClass2_Sub1_1 = new Class2_Sub1_Sub10();
		this.aClass2_Sub1Array3 = new Class2_Sub1[] { this.aClass2_Sub1_2, this.aClass2_Sub1_1 };
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!oa;)V")
	public Class6(@OriginalArg(0) Class2_Sub18 arg0) {
		@Pc(7) int local7 = arg0.method2387();
		@Pc(12) Class74 local12 = new Class74(64);
		@Pc(17) Class74 local17 = new Class74(64);
		@Pc(22) Class74 local22 = new Class74(64);
		@Pc(25) int[][] local25 = new int[local7][];
		this.aClass2_Sub1Array3 = new Class2_Sub1[local7];
		@Pc(45) int local45;
		@Pc(100) int local100;
		@Pc(107) int local107;
		for (@Pc(31) int local31 = 0; local31 < local7; local31++) {
			@Pc(37) Class2_Sub1 local37 = Static54.method1028(arg0);
			@Pc(41) int local41 = local37.method2984();
			local45 = local37.method2979();
			if (local41 >= 0 && local41 >= 0 && local17.method2433((long) local41) == null) {
				local17.method2432((long) local41, new Class2_Sub3(local41));
			}
			if (local45 >= 0 && local45 >= 0 && local22.method2433((long) local45) == null) {
				local22.method2432((long) local45, new Class2_Sub3(local45));
			}
			local100 = local37.aClass2_Sub1Array40.length;
			local25[local31] = new int[local100];
			for (local107 = 0; local107 < local100; local107++) {
				local25[local31][local107] = arg0.method2387();
			}
			local12.method2432((long) local37.anInt4541, local37);
			this.aClass2_Sub1Array3[local31] = local37;
		}
		for (@Pc(143) int local143 = 0; local143 < local7; local143++) {
			@Pc(150) Class2_Sub1 local150 = this.aClass2_Sub1Array3[local143];
			local45 = local150.aClass2_Sub1Array40.length;
			for (local100 = 0; local100 < local45; local100++) {
				@Pc(169) Class2_Sub1 local169 = (Class2_Sub1) local12.method2433((long) local25[local143][local100]);
				local150.aClass2_Sub1Array40[local100] = local169;
			}
			local25[local143] = null;
		}
		this.aClass2_Sub1_2 = (Class2_Sub1) local12.method2433((long) arg0.method2387());
		this.aClass2_Sub1_1 = (Class2_Sub1) local12.method2433((long) arg0.method2387());
		this.anIntArray36 = new int[local17.method2438()];
		this.anIntArray37 = new int[local22.method2438()];
		@Pc(227) Class2[] local227 = new Class2[local17.method2438()];
		@Pc(232) Class2[] local232 = new Class2[local22.method2438()];
		local17.method2431(local227);
		local22.method2431(local232);
		for (local100 = 0; local100 < local227.length; local100++) {
			this.anIntArray36[local100] = ((Class2_Sub3) local227[local100]).anInt178;
		}
		for (local107 = 0; local107 < local232.length; local107++) {
			this.anIntArray37[local107] = ((Class2_Sub3) local232[local107]).anInt178;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ke;IIIDZLclient!qb;)[I")
	public int[] method146(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) double arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Interface2 arg5) {
		Static170.anInterface2_2 = arg5;
		Static118.aClass43_29 = arg0;
		Static17.method434(arg2, arg1);
		@Pc(18) int[] local18 = new int[arg1 * arg2];
		for (@Pc(20) int local20 = 0; local20 < this.aClass2_Sub1Array3.length; local20++) {
			this.aClass2_Sub1Array3[local20].method2993(arg1, arg2);
		}
		@Pc(44) int local44 = 0;
		@Pc(50) int local50;
		@Pc(52) int local52;
		@Pc(54) byte local54;
		if (arg4) {
			local50 = arg1 - 1;
			local52 = -1;
			local54 = -1;
		} else {
			local50 = 0;
			local54 = 1;
			local52 = arg1;
		}
		for (@Pc(70) int local70 = 0; local70 < arg2; local70++) {
			@Pc(84) int[] local84;
			@Pc(88) int[] local88;
			@Pc(86) int[] local86;
			if (this.aClass2_Sub1_2.aBoolean183) {
				@Pc(82) int[] local82 = this.aClass2_Sub1_2.method2986(local70);
				local84 = local82;
				local86 = local82;
				local88 = local82;
			} else {
				@Pc(96) int[][] local96 = this.aClass2_Sub1_2.method2982(local70);
				local84 = local96[0];
				local88 = local96[1];
				local86 = local96[2];
			}
			for (@Pc(110) int local110 = local50; local110 != local52; local110 += local54) {
				@Pc(121) double local121 = Math.pow((double) local84[local110] / 4096.0D, arg3);
				@Pc(130) double local130 = Math.pow((double) local88[local110] / 4096.0D, arg3);
				@Pc(139) double local139 = Math.pow((double) local86[local110] / 4096.0D, arg3);
				@Pc(144) int local144 = (int) (local130 * 256.0D);
				@Pc(149) int local149 = (int) (local121 * 256.0D);
				if (local149 > 255) {
					local149 = 255;
				}
				@Pc(161) int local161 = (int) (local139 * 256.0D);
				if (local161 > 255) {
					local161 = 255;
				}
				if (local161 < 0) {
					local161 = 0;
				}
				if (local149 < 0) {
					local149 = 0;
				}
				if (local144 > 255) {
					local144 = 255;
				}
				if (local144 < 0) {
					local144 = 0;
				}
				local18[local44++] = (local149 << 16) + (local144 << 8) + local161;
			}
		}
		for (@Pc(222) int local222 = 0; local222 < this.aClass2_Sub1Array3.length; local222++) {
			this.aClass2_Sub1Array3[local222].method2983();
		}
		return local18;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!qb;Lclient!ke;B)Z")
	public boolean method148(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Class43 arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray36.length; local7++) {
			if (!arg1.method2213(this.anIntArray36[local7])) {
				return false;
			}
		}
		for (@Pc(31) int local31 = 0; local31 < this.anIntArray37.length; local31++) {
			if (!arg0.method1658(this.anIntArray37[local31])) {
				return false;
			}
		}
		return true;
	}
}
