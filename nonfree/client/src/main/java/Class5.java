import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class5 {

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "[I")
	private final int[] anIntArray33;

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "[I")
	private final int[] anIntArray34;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "Lclient!lf;")
	private final Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "Lclient!lf;")
	private final Class3_Sub1 aClass3_Sub1_2;

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "[Lclient!lf;")
	private final Class3_Sub1[] aClass3_Sub1Array4;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	public Class5() {
		this.anIntArray33 = new int[0];
		this.anIntArray34 = new int[0];
		this.aClass3_Sub1_1 = new Class3_Sub1_Sub36();
		this.aClass3_Sub1_2 = new Class3_Sub1_Sub36();
		this.aClass3_Sub1Array4 = new Class3_Sub1[] { this.aClass3_Sub1_1, this.aClass3_Sub1_2 };
	}

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class5(@OriginalArg(0) Class3_Sub8 arg0) {
		@Pc(7) int local7 = arg0.method1545();
		@Pc(12) Class87 local12 = new Class87(64);
		@Pc(17) Class87 local17 = new Class87(64);
		@Pc(22) Class87 local22 = new Class87(64);
		this.aClass3_Sub1Array4 = new Class3_Sub1[local7];
		@Pc(29) int[][] local29 = new int[local7][];
		@Pc(45) int local45;
		@Pc(94) int local94;
		@Pc(101) int local101;
		for (@Pc(31) int local31 = 0; local31 < local7; local31++) {
			@Pc(37) Class3_Sub1 local37 = Static112.method2251(arg0);
			@Pc(41) int local41 = local37.method3119();
			local45 = local37.method3128();
			if (local41 >= 0 && local41 >= 0 && local17.method3201((long) local41) == null) {
				local17.method3200((long) local41, new Class3_Sub24(local41));
			}
			if (local45 >= 0 && local45 >= 0 && local22.method3201((long) local45) == null) {
				local22.method3200((long) local45, new Class3_Sub24(local45));
			}
			local94 = local37.aClass3_Sub1Array40.length;
			local29[local31] = new int[local94];
			for (local101 = 0; local101 < local94; local101++) {
				local29[local31][local101] = arg0.method1545();
			}
			local12.method3200((long) local37.anInt4122, local37);
			this.aClass3_Sub1Array4[local31] = local37;
		}
		for (@Pc(137) int local137 = 0; local137 < local7; local137++) {
			@Pc(144) Class3_Sub1 local144 = this.aClass3_Sub1Array4[local137];
			local45 = local144.aClass3_Sub1Array40.length;
			for (local94 = 0; local94 < local45; local94++) {
				@Pc(163) Class3_Sub1 local163 = (Class3_Sub1) local12.method3201((long) local29[local137][local94]);
				local144.aClass3_Sub1Array40[local94] = local163;
			}
			local29[local137] = null;
		}
		this.aClass3_Sub1_1 = (Class3_Sub1) local12.method3201((long) arg0.method1545());
		this.aClass3_Sub1_2 = (Class3_Sub1) local12.method3201((long) arg0.method1545());
		this.anIntArray34 = new int[local17.method3195()];
		this.anIntArray33 = new int[local22.method3195()];
		@Pc(221) Class3[] local221 = new Class3[local17.method3195()];
		@Pc(226) Class3[] local226 = new Class3[local22.method3195()];
		local17.method3198(local221);
		local22.method3198(local226);
		for (local94 = 0; local94 < local221.length; local94++) {
			this.anIntArray34[local94] = ((Class3_Sub24) local221[local94]).anInt3994;
		}
		for (local101 = 0; local101 < local226.length; local101++) {
			this.anIntArray33[local101] = ((Class3_Sub24) local226[local101]).anInt3994;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!ah;Lclient!sf;DZII)[I")
	public int[] method102(@OriginalArg(1) Class7 arg0, @OriginalArg(2) Interface2 arg1, @OriginalArg(3) double arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static161.aClass7_64 = arg0;
		Static50.anInterface2_2 = arg1;
		Static173.method3145(arg5, arg4);
		for (@Pc(13) int local13 = 0; local13 < this.aClass3_Sub1Array4.length; local13++) {
			this.aClass3_Sub1Array4[local13].method3126(arg5, arg4);
		}
		@Pc(33) int[] local33 = new int[arg4 * arg5];
		@Pc(43) int local43;
		@Pc(39) int local39;
		@Pc(37) byte local37;
		if (arg3) {
			local37 = -1;
			local39 = -1;
			local43 = arg5 - 1;
		} else {
			local39 = arg5;
			local43 = 0;
			local37 = 1;
		}
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < arg4; local54++) {
			@Pc(69) int[] local69;
			@Pc(73) int[] local73;
			@Pc(77) int[] local77;
			if (this.aClass3_Sub1_1.aBoolean191) {
				@Pc(84) int[] local84 = this.aClass3_Sub1_1.method3130(local54);
				local69 = local84;
				local77 = local84;
				local73 = local84;
			} else {
				@Pc(65) int[][] local65 = this.aClass3_Sub1_1.method3121(local54);
				local69 = local65[0];
				local73 = local65[1];
				local77 = local65[2];
			}
			for (@Pc(92) int local92 = local43; local92 != local39; local92 += local37) {
				@Pc(102) double local102 = Math.pow((double) local69[local92] / 4096.0D, arg2);
				@Pc(111) double local111 = Math.pow((double) local73[local92] / 4096.0D, arg2);
				@Pc(120) double local120 = Math.pow((double) local77[local92] / 4096.0D, arg2);
				@Pc(125) int local125 = (int) (local102 * 256.0D);
				@Pc(130) int local130 = (int) (local111 * 256.0D);
				@Pc(135) int local135 = (int) (local120 * 256.0D);
				if (local125 > 255) {
					local125 = 255;
				}
				if (local135 > 255) {
					local135 = 255;
				}
				if (local135 < 0) {
					local135 = 0;
				}
				if (local125 < 0) {
					local125 = 0;
				}
				if (local130 > 255) {
					local130 = 255;
				}
				if (local130 < 0) {
					local130 = 0;
				}
				local33[local52++] = (local125 << 16) + (local130 << 8) + local135;
			}
		}
		for (@Pc(203) int local203 = 0; local203 < this.aClass3_Sub1Array4.length; local203++) {
			this.aClass3_Sub1Array4[local203].method3132();
		}
		return local33;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!ah;Lclient!sf;)Z")
	public boolean method104(@OriginalArg(1) Class7 arg0, @OriginalArg(2) Interface2 arg1) {
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray34.length; local13++) {
			if (!arg0.method1023(this.anIntArray34[local13])) {
				return false;
			}
		}
		for (@Pc(36) int local36 = 0; local36 < this.anIntArray33.length; local36++) {
			if (!arg1.method1826(this.anIntArray33[local36])) {
				return false;
			}
		}
		return true;
	}
}
