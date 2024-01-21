import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class89 {

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "[I")
	private final int[] anIntArray422;

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "[I")
	private final int[] anIntArray423;

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "Lclient!ha;")
	private final Class2_Sub2 aClass2_Sub2_1;

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "Lclient!ha;")
	private final Class2_Sub2 aClass2_Sub2_2;

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "[Lclient!ha;")
	private final Class2_Sub2[] aClass2_Sub2Array39;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
	public Class89() {
		this.anIntArray422 = new int[0];
		this.anIntArray423 = new int[0];
		this.aClass2_Sub2_1 = new Class2_Sub2_Sub8();
		this.aClass2_Sub2_2 = new Class2_Sub2_Sub8();
		this.aClass2_Sub2Array39 = new Class2_Sub2[] { this.aClass2_Sub2_1, this.aClass2_Sub2_2 };
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!va;)V")
	public Class89(@OriginalArg(0) Class2_Sub11 arg0) {
		@Pc(7) int local7 = arg0.method1461();
		@Pc(12) Class18 local12 = new Class18(64);
		@Pc(17) Class18 local17 = new Class18(64);
		@Pc(20) int[][] local20 = new int[local7][];
		@Pc(25) Class18 local25 = new Class18(64);
		this.aClass2_Sub2Array39 = new Class2_Sub2[local7];
		@Pc(45) int local45;
		@Pc(94) int local94;
		@Pc(101) int local101;
		for (@Pc(31) int local31 = 0; local31 < local7; local31++) {
			@Pc(37) Class2_Sub2 local37 = Static140.method2218(arg0);
			@Pc(41) int local41 = local37.method2576();
			local45 = local37.method2578();
			if (local41 >= 0 && local41 >= 0 && local17.method683((long) local41) == null) {
				local17.method685((long) local41, new Class2_Sub8(local41));
			}
			if (local45 >= 0 && local45 >= 0 && local25.method683((long) local45) == null) {
				local25.method685((long) local45, new Class2_Sub8(local45));
			}
			local94 = local37.aClass2_Sub2Array38.length;
			local20[local31] = new int[local94];
			for (local101 = 0; local101 < local94; local101++) {
				local20[local31][local101] = arg0.method1461();
			}
			local12.method685((long) local37.anInt3643, local37);
			this.aClass2_Sub2Array39[local31] = local37;
		}
		for (@Pc(141) int local141 = 0; local141 < local7; local141++) {
			@Pc(148) Class2_Sub2 local148 = this.aClass2_Sub2Array39[local141];
			local45 = local148.aClass2_Sub2Array38.length;
			for (local94 = 0; local94 < local45; local94++) {
				@Pc(167) Class2_Sub2 local167 = (Class2_Sub2) local12.method683((long) local20[local141][local94]);
				local148.aClass2_Sub2Array38[local94] = local167;
			}
			local20[local141] = null;
		}
		this.aClass2_Sub2_1 = (Class2_Sub2) local12.method683((long) arg0.method1461());
		this.aClass2_Sub2_2 = (Class2_Sub2) local12.method683((long) arg0.method1461());
		this.anIntArray422 = new int[local17.method676()];
		this.anIntArray423 = new int[local25.method676()];
		@Pc(229) Class2[] local229 = new Class2[local17.method676()];
		@Pc(234) Class2[] local234 = new Class2[local25.method676()];
		local17.method679(local229);
		local25.method679(local234);
		for (local94 = 0; local94 < local229.length; local94++) {
			this.anIntArray422[local94] = ((Class2_Sub8) local229[local94]).anInt1253;
		}
		for (local101 = 0; local101 < local234.length; local101++) {
			this.anIntArray423[local101] = ((Class2_Sub8) local234[local101]).anInt1253;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!hh;IIZIFLclient!kh;)[I")
	public int[] method2714(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) Class29 arg5) {
		Static149.aClass29_61 = arg5;
		Static141.anInterface2_2 = arg0;
		@Pc(14) int[] local14 = new int[arg3 * arg1];
		Static178.method2703(arg1, arg3);
		for (@Pc(20) int local20 = 0; local20 < this.aClass2_Sub2Array39.length; local20++) {
			this.aClass2_Sub2Array39[local20].method2583(arg1, arg3);
		}
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(44) byte local44;
		if (arg2) {
			local44 = -1;
			local48 = arg3 - 1;
			local50 = -1;
		} else {
			local44 = 1;
			local48 = 0;
			local50 = arg3;
		}
		@Pc(60) int local60 = 0;
		for (@Pc(62) int local62 = 0; local62 < arg1; local62++) {
			@Pc(78) int[] local78;
			@Pc(80) int[] local80;
			@Pc(82) int[] local82;
			if (this.aClass2_Sub2_1.aBoolean160) {
				@Pc(76) int[] local76 = this.aClass2_Sub2_1.method2575(local62);
				local78 = local76;
				local80 = local76;
				local82 = local76;
			} else {
				@Pc(90) int[][] local90 = this.aClass2_Sub2_1.method2579(local62);
				local78 = local90[0];
				local80 = local90[1];
				local82 = local90[2];
			}
			for (@Pc(104) int local104 = local48; local104 != local50; local104 += local44) {
				@Pc(112) int local112 = local78[local104] >> 4;
				if (local112 > 255) {
					local112 = 255;
				}
				if (local112 < 0) {
					local112 = 0;
				}
				@Pc(129) int local129 = local80[local104] >> 4;
				@Pc(135) int local135 = local82[local104] >> 4;
				if (local129 > 255) {
					local129 = 255;
				}
				if (local135 > 255) {
					local135 = 255;
				}
				if (local135 < 0) {
					local135 = 0;
				}
				if (local129 < 0) {
					local129 = 0;
				}
				local14[local60++] = Static125.method2038(local135 + (local112 << 16) + (local129 << 8), arg4);
			}
		}
		for (@Pc(188) int local188 = 0; local188 < this.aClass2_Sub2Array39.length; local188++) {
			this.aClass2_Sub2Array39[local188].method2581();
		}
		return local14;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!kh;BLclient!hh;)Z")
	public boolean method2717(@OriginalArg(0) Class29 arg0, @OriginalArg(2) Interface2 arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray422.length; local7++) {
			if (!arg0.method1015(this.anIntArray422[local7])) {
				return false;
			}
		}
		for (@Pc(31) int local31 = 0; local31 < this.anIntArray423.length; local31++) {
			if (!arg1.method252(this.anIntArray423[local31])) {
				return false;
			}
		}
		return true;
	}
}
