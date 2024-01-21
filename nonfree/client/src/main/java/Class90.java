import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class90 {

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "[I")
	private final int[] anIntArray370;

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "[I")
	private final int[] anIntArray371;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "Lclient!j;")
	private final Class2_Sub3 aClass2_Sub3_1;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "Lclient!j;")
	private final Class2_Sub3 aClass2_Sub3_2;

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "[Lclient!j;")
	private final Class2_Sub3[] aClass2_Sub3Array42;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
	public Class90() {
		this.anIntArray370 = new int[0];
		this.anIntArray371 = new int[0];
		this.aClass2_Sub3_1 = new Class2_Sub3_Sub27();
		this.aClass2_Sub3_2 = new Class2_Sub3_Sub27();
		this.aClass2_Sub3Array42 = new Class2_Sub3[] { this.aClass2_Sub3_1, this.aClass2_Sub3_2 };
	}

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!ja;)V")
	public Class90(@OriginalArg(0) Class2_Sub13 arg0) {
		@Pc(7) int local7 = arg0.method2962();
		@Pc(12) Class25 local12 = new Class25(64);
		@Pc(17) Class25 local17 = new Class25(64);
		@Pc(22) Class25 local22 = new Class25(64);
		@Pc(25) int[][] local25 = new int[local7][];
		this.aClass2_Sub3Array42 = new Class2_Sub3[local7];
		@Pc(45) int local45;
		@Pc(100) int local100;
		@Pc(107) int local107;
		for (@Pc(31) int local31 = 0; local31 < local7; local31++) {
			@Pc(37) Class2_Sub3 local37 = Static123.method2140(arg0);
			@Pc(41) int local41 = local37.method3021();
			local45 = local37.method3018();
			if (local41 >= 0 && local41 >= 0 && local17.method836((long) local41) == null) {
				local17.method838((long) local41, new Class2_Sub21(local41));
			}
			if (local45 >= 0 && local45 >= 0 && local22.method836((long) local45) == null) {
				local22.method838((long) local45, new Class2_Sub21(local45));
			}
			local100 = local37.aClass2_Sub3Array41.length;
			local25[local31] = new int[local100];
			for (local107 = 0; local107 < local100; local107++) {
				local25[local31][local107] = arg0.method2962();
			}
			local12.method838((long) local37.anInt4038, local37);
			this.aClass2_Sub3Array42[local31] = local37;
		}
		for (@Pc(139) int local139 = 0; local139 < local7; local139++) {
			@Pc(146) Class2_Sub3 local146 = this.aClass2_Sub3Array42[local139];
			local45 = local146.aClass2_Sub3Array41.length;
			for (local100 = 0; local100 < local45; local100++) {
				@Pc(165) Class2_Sub3 local165 = (Class2_Sub3) local12.method836((long) local25[local139][local100]);
				local146.aClass2_Sub3Array41[local100] = local165;
			}
			local25[local139] = null;
		}
		this.aClass2_Sub3_1 = (Class2_Sub3) local12.method836((long) arg0.method2962());
		this.aClass2_Sub3_2 = (Class2_Sub3) local12.method836((long) arg0.method2962());
		this.anIntArray371 = new int[local17.method835()];
		this.anIntArray370 = new int[local22.method835()];
		@Pc(231) Class2[] local231 = new Class2[local17.method835()];
		@Pc(236) Class2[] local236 = new Class2[local22.method835()];
		local17.method833(local231);
		local22.method833(local236);
		for (local100 = 0; local100 < local231.length; local100++) {
			this.anIntArray371[local100] = ((Class2_Sub21) local231[local100]).anInt2187;
		}
		for (local107 = 0; local107 < local236.length; local107++) {
			this.anIntArray370[local107] = ((Class2_Sub21) local236[local107]).anInt2187;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!aa;Lclient!bg;)Z")
	public boolean method3035(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) Class11 arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray371.length; local7++) {
			if (!arg1.method2065(this.anIntArray371[local7])) {
				return false;
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.anIntArray370.length; local27++) {
			if (!arg0.method189(this.anIntArray370[local27])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(DIIIZLclient!bg;Lclient!aa;)[I")
	public int[] method3040(@OriginalArg(0) double arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) Interface1 arg5) {
		Static100.anInterface1_1 = arg5;
		Static148.aClass11_113 = arg4;
		Static146.method2402(arg1, arg2);
		@Pc(18) int[] local18 = new int[arg2 * arg1];
		for (@Pc(20) int local20 = 0; local20 < this.aClass2_Sub3Array42.length; local20++) {
			this.aClass2_Sub3Array42[local20].method3020(arg2, arg1);
		}
		@Pc(42) int local42;
		@Pc(40) int local40;
		@Pc(44) byte local44;
		if (arg3) {
			local44 = -1;
			local42 = arg2 - 1;
			local40 = -1;
		} else {
			local40 = arg2;
			local42 = 0;
			local44 = 1;
		}
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < arg1; local58++) {
			@Pc(82) int[] local82;
			@Pc(78) int[] local78;
			@Pc(74) int[] local74;
			if (this.aClass2_Sub3_1.aBoolean175) {
				@Pc(90) int[] local90 = this.aClass2_Sub3_1.method3016(local58);
				local82 = local90;
				local74 = local90;
				local78 = local90;
			} else {
				@Pc(70) int[][] local70 = this.aClass2_Sub3_1.method3023(local58);
				local74 = local70[2];
				local78 = local70[1];
				local82 = local70[0];
			}
			for (@Pc(98) int local98 = local42; local98 != local40; local98 += local44) {
				@Pc(109) double local109 = Math.pow((double) local82[local98] / 4096.0D, arg0);
				@Pc(118) double local118 = Math.pow((double) local78[local98] / 4096.0D, arg0);
				@Pc(123) int local123 = (int) (local109 * 256.0D);
				if (local123 > 255) {
					local123 = 255;
				}
				@Pc(137) double local137 = Math.pow((double) local74[local98] / 4096.0D, arg0);
				@Pc(142) int local142 = (int) (local118 * 256.0D);
				if (local142 > 255) {
					local142 = 255;
				}
				if (local123 < 0) {
					local123 = 0;
				}
				@Pc(159) int local159 = (int) (local137 * 256.0D);
				if (local142 < 0) {
					local142 = 0;
				}
				if (local159 > 255) {
					local159 = 255;
				}
				if (local159 < 0) {
					local159 = 0;
				}
				local18[local56++] = (local142 << 8) + (local123 << 16) + local159;
			}
		}
		for (@Pc(203) int local203 = 0; local203 < this.aClass2_Sub3Array42.length; local203++) {
			this.aClass2_Sub3Array42[local203].method3022();
		}
		return local18;
	}
}
