import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class85 {

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "[I")
	private final int[] anIntArray454;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "[I")
	private final int[] anIntArray453;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "Lclient!db;")
	private final Class3_Sub5 aClass3_Sub5_1;

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "Lclient!db;")
	private final Class3_Sub5 aClass3_Sub5_2;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "[Lclient!db;")
	private final Class3_Sub5[] aClass3_Sub5Array31;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	public Class85() {
		this.anIntArray454 = new int[0];
		this.anIntArray453 = new int[0];
		this.aClass3_Sub5_1 = new Class3_Sub5_Sub31();
		this.aClass3_Sub5_1.anInt4489 = 1;
		this.aClass3_Sub5_2 = new Class3_Sub5_Sub31();
		this.aClass3_Sub5_2.anInt4489 = 1;
		this.aClass3_Sub5Array31 = new Class3_Sub5[] { this.aClass3_Sub5_1, this.aClass3_Sub5_2 };
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!mb;)V")
	public Class85(@OriginalArg(0) Class3_Sub17 arg0) {
		@Pc(7) int local7 = arg0.method2107();
		@Pc(12) Class54 local12 = new Class54(64);
		@Pc(17) Class54 local17 = new Class54(64);
		@Pc(22) Class54 local22 = new Class54(64);
		@Pc(25) int[][] local25 = new int[local7][];
		this.aClass3_Sub5Array31 = new Class3_Sub5[local7];
		@Pc(45) int local45;
		@Pc(94) int local94;
		@Pc(101) int local101;
		for (@Pc(31) int local31 = 0; local31 < local7; local31++) {
			@Pc(37) Class3_Sub5 local37 = Static110.method1714(arg0);
			@Pc(41) int local41 = local37.method3170();
			local45 = local37.method3162();
			if (local41 >= 0 && local41 >= 0 && local17.method1496((long) local41) == null) {
				local17.method1494((long) local41, new Class3_Sub11(local41));
			}
			if (local45 >= 0 && local45 >= 0 && local22.method1496((long) local45) == null) {
				local22.method1494((long) local45, new Class3_Sub11(local45));
			}
			local94 = local37.aClass3_Sub5Array42.length;
			local25[local31] = new int[local94];
			for (local101 = 0; local101 < local94; local101++) {
				local25[local31][local101] = arg0.method2107();
			}
			local12.method1494((long) local37.anInt4495, local37);
			this.aClass3_Sub5Array31[local31] = local37;
		}
		for (@Pc(137) int local137 = 0; local137 < local7; local137++) {
			@Pc(144) Class3_Sub5 local144 = this.aClass3_Sub5Array31[local137];
			local45 = local144.aClass3_Sub5Array42.length;
			for (local94 = 0; local94 < local45; local94++) {
				@Pc(163) Class3_Sub5 local163 = (Class3_Sub5) local12.method1496((long) local25[local137][local94]);
				local144.aClass3_Sub5Array42[local94] = local163;
			}
			local25[local137] = null;
		}
		this.aClass3_Sub5_1 = (Class3_Sub5) local12.method1496((long) arg0.method2107());
		this.aClass3_Sub5_2 = (Class3_Sub5) local12.method1496((long) arg0.method2107());
		this.anIntArray454 = new int[local17.method1500()];
		this.anIntArray453 = new int[local22.method1500()];
		@Pc(225) Class3[] local225 = new Class3[local17.method1500()];
		@Pc(230) Class3[] local230 = new Class3[local22.method1500()];
		local17.method1499(local225);
		local22.method1499(local230);
		for (local94 = 0; local94 < local225.length; local94++) {
			this.anIntArray454[local94] = ((Class3_Sub11) local225[local94]).anInt1537;
		}
		for (local101 = 0; local101 < local230.length; local101++) {
			this.anIntArray453[local101] = ((Class3_Sub11) local230[local101]).anInt1537;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IDLclient!aa;ZLclient!bc;IB)[I")
	public int[] method2631(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1, @OriginalArg(2) Interface1 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class1 arg4, @OriginalArg(5) int arg5) {
		Static126.method1865(arg1);
		Static150.aClass1_27 = arg4;
		Static54.anInterface1_1 = arg2;
		Static172.method2765(arg0, arg5);
		@Pc(21) int[] local21 = new int[arg5 * arg0];
		for (@Pc(36) int local36 = 0; local36 < this.aClass3_Sub5Array31.length; local36++) {
			this.aClass3_Sub5Array31[local36].method3165(arg5, arg0);
		}
		@Pc(58) int local58;
		@Pc(62) int local62;
		@Pc(60) byte local60;
		if (arg3) {
			local58 = arg0 - 1;
			local60 = -1;
			local62 = -1;
		} else {
			local62 = arg0;
			local58 = 0;
			local60 = 1;
		}
		@Pc(72) int local72 = 0;
		for (@Pc(74) int local74 = 0; local74 < arg5; local74++) {
			@Pc(98) int[] local98;
			@Pc(94) int[] local94;
			@Pc(90) int[] local90;
			if (this.aClass3_Sub5_1.aBoolean178) {
				@Pc(106) int[] local106 = this.aClass3_Sub5_1.method3173(local74);
				local90 = local106;
				local94 = local106;
				local98 = local106;
			} else {
				@Pc(86) int[][] local86 = this.aClass3_Sub5_1.method3172(local74);
				local90 = local86[2];
				local94 = local86[1];
				local98 = local86[0];
			}
			for (@Pc(114) int local114 = local58; local114 != local62; local114 += local60) {
				@Pc(122) int local122 = local98[local114] >> 4;
				if (local122 > 255) {
					local122 = 255;
				}
				if (local122 < 0) {
					local122 = 0;
				}
				local122 = Static27.anIntArray522[local122];
				@Pc(143) int local143 = local94[local114] >> 4;
				if (local143 > 255) {
					local143 = 255;
				}
				@Pc(156) int local156 = local90[local114] >> 4;
				if (local143 < 0) {
					local143 = 0;
				}
				if (local156 > 255) {
					local156 = 255;
				}
				local143 = Static27.anIntArray522[local143];
				if (local156 < 0) {
					local156 = 0;
				}
				local156 = Static27.anIntArray522[local156];
				local21[local72++] = (local122 << 16) + (local143 << 8) + local156;
			}
		}
		for (@Pc(213) int local213 = 0; local213 < this.aClass3_Sub5Array31.length; local213++) {
			this.aClass3_Sub5Array31[local213].method3166();
		}
		return local21;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!aa;Lclient!bc;I)Z")
	public boolean method2634(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class1 arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray454.length; local7++) {
			if (!arg1.method43(this.anIntArray454[local7])) {
				return false;
			}
		}
		for (@Pc(31) int local31 = 0; local31 < this.anIntArray453.length; local31++) {
			if (!arg0.method2653(this.anIntArray453[local31])) {
				return false;
			}
		}
		return true;
	}
}
