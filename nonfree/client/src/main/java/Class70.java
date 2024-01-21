import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class70 {

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "[I")
	private final int[] anIntArray309;

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "[I")
	private final int[] anIntArray310;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "Lclient!ba;")
	private final Class1_Sub5 aClass1_Sub5_1;

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "Lclient!ba;")
	private final Class1_Sub5 aClass1_Sub5_2;

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "[Lclient!ba;")
	private final Class1_Sub5[] aClass1_Sub5Array29;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public Class70() {
		this.anIntArray309 = new int[0];
		this.anIntArray310 = new int[0];
		this.aClass1_Sub5_1 = new Class1_Sub5_Sub14();
		this.aClass1_Sub5_2 = new Class1_Sub5_Sub14();
		this.aClass1_Sub5Array29 = new Class1_Sub5[] { this.aClass1_Sub5_1, this.aClass1_Sub5_2 };
	}

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!ka;)V")
	public Class70(@OriginalArg(0) Class1_Sub8 arg0) {
		@Pc(7) int local7 = arg0.method336();
		@Pc(12) Class5 local12 = new Class5(64);
		@Pc(17) Class5 local17 = new Class5(64);
		@Pc(22) Class5 local22 = new Class5(64);
		@Pc(25) int[][] local25 = new int[local7][];
		this.aClass1_Sub5Array29 = new Class1_Sub5[local7];
		@Pc(45) int local45;
		@Pc(94) int local94;
		@Pc(101) int local101;
		for (@Pc(31) int local31 = 0; local31 < local7; local31++) {
			@Pc(37) Class1_Sub5 local37 = Static61.method1104(arg0);
			@Pc(41) int local41 = local37.method3151();
			local45 = local37.method3140();
			if (local41 >= 0 && local41 >= 0 && local17.method134((long) local41) == null) {
				local17.method138(new Class1_Sub9(local41), (long) local41);
			}
			if (local45 >= 0 && local45 >= 0 && local22.method134((long) local45) == null) {
				local22.method138(new Class1_Sub9(local45), (long) local45);
			}
			local94 = local37.aClass1_Sub5Array42.length;
			local25[local31] = new int[local94];
			for (local101 = 0; local101 < local94; local101++) {
				local25[local31][local101] = arg0.method336();
			}
			local12.method138(local37, (long) local37.anInt4136);
			this.aClass1_Sub5Array29[local31] = local37;
		}
		for (@Pc(137) int local137 = 0; local137 < local7; local137++) {
			@Pc(144) Class1_Sub5 local144 = this.aClass1_Sub5Array29[local137];
			local45 = local144.aClass1_Sub5Array42.length;
			for (local94 = 0; local94 < local45; local94++) {
				@Pc(163) Class1_Sub5 local163 = (Class1_Sub5) local12.method134((long) local25[local137][local94]);
				local144.aClass1_Sub5Array42[local94] = local163;
			}
			local25[local137] = null;
		}
		this.aClass1_Sub5_1 = (Class1_Sub5) local12.method134((long) arg0.method336());
		this.aClass1_Sub5_2 = (Class1_Sub5) local12.method134((long) arg0.method336());
		this.anIntArray309 = new int[local17.method139()];
		this.anIntArray310 = new int[local22.method139()];
		@Pc(229) Class1[] local229 = new Class1[local17.method139()];
		@Pc(234) Class1[] local234 = new Class1[local22.method139()];
		local17.method136(local229);
		local22.method136(local234);
		for (local94 = 0; local94 < local229.length; local94++) {
			this.anIntArray309[local94] = ((Class1_Sub9) local229[local94]).anInt508;
		}
		for (local101 = 0; local101 < local234.length; local101++) {
			this.anIntArray310[local101] = ((Class1_Sub9) local234[local101]).anInt508;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZLclient!vb;IDILclient!tf;Z)[I")
	public int[] method2244(@OriginalArg(1) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) double arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface3 arg4, @OriginalArg(6) boolean arg5) {
		Static15.anInterface3_1 = arg4;
		Static27.aClass82_13 = arg0;
		@Pc(10) int[] local10 = new int[arg3 * arg1];
		Static168.method2983(arg3, arg1);
		for (@Pc(20) int local20 = 0; local20 < this.aClass1_Sub5Array29.length; local20++) {
			this.aClass1_Sub5Array29[local20].method3150(arg3, arg1);
		}
		@Pc(42) int local42;
		@Pc(40) int local40;
		@Pc(44) byte local44;
		if (arg5) {
			local42 = arg1 - 1;
			local40 = -1;
			local44 = -1;
		} else {
			local40 = arg1;
			local42 = 0;
			local44 = 1;
		}
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < arg3; local58++) {
			@Pc(78) int[] local78;
			@Pc(74) int[] local74;
			@Pc(82) int[] local82;
			if (this.aClass1_Sub5_1.aBoolean173) {
				@Pc(90) int[] local90 = this.aClass1_Sub5_1.method3143(local58);
				local78 = local90;
				local82 = local90;
				local74 = local90;
			} else {
				@Pc(70) int[][] local70 = this.aClass1_Sub5_1.method3149(local58);
				local74 = local70[1];
				local78 = local70[0];
				local82 = local70[2];
			}
			for (@Pc(98) int local98 = local42; local98 != local40; local98 += local44) {
				@Pc(109) double local109 = Math.pow((double) local78[local98] / 4096.0D, arg2);
				@Pc(118) double local118 = Math.pow((double) local74[local98] / 4096.0D, arg2);
				@Pc(127) double local127 = Math.pow((double) local82[local98] / 4096.0D, arg2);
				@Pc(132) int local132 = (int) (local127 * 256.0D);
				if (local132 > 255) {
					local132 = 255;
				}
				@Pc(142) int local142 = (int) (local109 * 256.0D);
				@Pc(147) int local147 = (int) (local118 * 256.0D);
				if (local147 > 255) {
					local147 = 255;
				}
				if (local147 < 0) {
					local147 = 0;
				}
				if (local142 > 255) {
					local142 = 255;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				if (local132 < 0) {
					local132 = 0;
				}
				local10[local56++] = local132 + (local142 << 16) + (local147 << 8);
			}
		}
		for (@Pc(207) int local207 = 0; local207 < this.aClass1_Sub5Array29.length; local207++) {
			this.aClass1_Sub5Array29[local207].method3141();
		}
		return local10;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!tf;BLclient!vb;)Z")
	public boolean method2245(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) Class82 arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray309.length; local7++) {
			if (!arg1.method2965(this.anIntArray309[local7])) {
				return false;
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.anIntArray310.length; local27++) {
			if (!arg0.method1028(this.anIntArray310[local27])) {
				return false;
			}
		}
		return true;
	}
}
