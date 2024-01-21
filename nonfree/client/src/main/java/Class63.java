import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class63 {

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "[I")
	private final int[] anIntArray298;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "[I")
	private final int[] anIntArray300;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "[I")
	private final int[] anIntArray305;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "[I")
	private final int[] anIntArray303;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "[[I")
	private final int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
	private final int anInt2097;

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "[I")
	private final int[] anIntArray304;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
	public Class63() {
		@Pc(4) int local4 = Static118.method1747(16);
		if (local4 != 1) {
			throw new RuntimeException();
		}
		@Pc(14) int local14 = Static118.method1747(5);
		@Pc(16) int local16 = 0;
		this.anIntArray298 = new int[local14];
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < local14; local22++) {
			local26 = Static118.method1747(4);
			this.anIntArray298[local22] = local26;
			if (local26 >= local16) {
				local16 = local26 + 1;
			}
		}
		this.anIntArray300 = new int[local16];
		this.anIntArray305 = new int[local16];
		this.anIntArray303 = new int[local16];
		this.anIntArrayArray23 = new int[local16][];
		@Pc(77) int local77;
		@Pc(99) int local99;
		for (local26 = 0; local26 < local16; local26++) {
			this.anIntArray300[local26] = Static118.method1747(3) + 1;
			local77 = this.anIntArray305[local26] = Static118.method1747(2);
			if (local77 != 0) {
				this.anIntArray303[local26] = Static118.method1747(8);
			}
			local77 = 0x1 << local77;
			@Pc(92) int[] local92 = new int[local77];
			this.anIntArrayArray23[local26] = local92;
			for (local99 = 0; local99 < local77; local99++) {
				local92[local99] = Static118.method1747(8) - 1;
			}
		}
		this.anInt2097 = Static118.method1747(2) + 1;
		local77 = Static118.method1747(4);
		@Pc(126) int local126 = 2;
		for (local99 = 0; local99 < local14; local99++) {
			local126 += this.anIntArray300[this.anIntArray298[local99]];
		}
		this.anIntArray304 = new int[local126];
		this.anIntArray304[0] = 0;
		this.anIntArray304[1] = 0x1 << local77;
		local126 = 2;
		for (@Pc(163) int local163 = 0; local163 < local14; local163++) {
			@Pc(169) int local169 = this.anIntArray298[local163];
			for (@Pc(171) int local171 = 0; local171 < this.anIntArray300[local169]; local171++) {
				this.anIntArray304[local126++] = Static118.method1747(local77);
			}
		}
		if (Static96.anIntArray302 == null || Static96.anIntArray302.length < local126) {
			Static96.anIntArray302 = new int[local126];
			Static96.anIntArray301 = new int[local126];
			Static96.aBooleanArray8 = new boolean[local126];
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()Z")
	public boolean method1448() {
		@Pc(5) boolean local5 = Static118.method1756() != 0;
		if (!local5) {
			return false;
		}
		@Pc(13) int local13 = this.anIntArray304.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			Static96.anIntArray302[local15] = this.anIntArray304[local15];
		}
		@Pc(34) int local34 = Static96.anIntArray299[this.anInt2097 - 1];
		@Pc(40) int local40 = Static124.method1871(local34 - 1);
		Static96.anIntArray301[0] = Static118.method1747(local40);
		Static96.anIntArray301[1] = Static118.method1747(local40);
		@Pc(52) int local52 = 2;
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray298.length; local54++) {
			@Pc(60) int local60 = this.anIntArray298[local54];
			@Pc(65) int local65 = this.anIntArray300[local60];
			@Pc(70) int local70 = this.anIntArray305[local60];
			@Pc(76) int local76 = (0x1 << local70) - 1;
			@Pc(78) int local78 = 0;
			if (local70 > 0) {
				local78 = Static118.aClass38Array1[this.anIntArray303[local60]].method931();
			}
			for (@Pc(90) int local90 = 0; local90 < local65; local90++) {
				@Pc(100) int local100 = this.anIntArrayArray23[local60][local78 & local76];
				local78 >>>= local70;
				Static96.anIntArray301[local52++] = local100 >= 0 ? Static118.aClass38Array1[local100].method931() : 0;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)V")
	private void method1450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(9) int local9 = Static96.anIntArray302[arg0];
		@Pc(13) int local13 = Static96.anIntArray301[arg0];
		@Pc(17) boolean local17 = Static96.aBooleanArray8[arg0];
		for (@Pc(21) int local21 = arg0 + 1; local21 <= arg1; local21++) {
			@Pc(26) int local26 = Static96.anIntArray302[local21];
			if (local26 < local9) {
				Static96.anIntArray302[local5] = local26;
				Static96.anIntArray301[local5] = Static96.anIntArray301[local21];
				Static96.aBooleanArray8[local5] = Static96.aBooleanArray8[local21];
				local5++;
				Static96.anIntArray302[local21] = Static96.anIntArray302[local5];
				Static96.anIntArray301[local21] = Static96.anIntArray301[local5];
				Static96.aBooleanArray8[local21] = Static96.aBooleanArray8[local5];
			}
		}
		Static96.anIntArray302[local5] = local9;
		Static96.anIntArray301[local5] = local13;
		Static96.aBooleanArray8[local5] = local17;
		this.method1450(arg0, local5 - 1);
		this.method1450(local5 + 1, arg1);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII[FI)V")
	private void method1452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4[arg0] *= Static96.aFloatArray1[arg1];
		if (arg2 > arg5) {
			arg2 = arg5;
		}
		for (@Pc(61) int local61 = arg0 + 1; local61 < arg2; local61++) {
			local22 += local43;
			if (local22 >= local7) {
				local22 -= local7;
				local20 += local32;
			} else {
				local20 += local18;
			}
			arg4[local61] *= Static96.aFloatArray1[local20];
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([FI)V")
	public void method1453(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = this.anIntArray304.length;
		@Pc(10) int local10 = Static96.anIntArray299[this.anInt2097 - 1];
		Static96.aBooleanArray8[0] = Static96.aBooleanArray8[1] = true;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(55) int local55;
		for (@Pc(20) int local20 = 2; local20 < local3; local20++) {
			local25 = Static96.method1451(Static96.anIntArray302, local20);
			local29 = Static96.method1454(Static96.anIntArray302, local20);
			local47 = this.method1455(Static96.anIntArray302[local25], Static96.anIntArray301[local25], Static96.anIntArray302[local29], Static96.anIntArray301[local29], Static96.anIntArray302[local20]);
			local51 = Static96.anIntArray301[local20];
			local55 = local10 - local47;
			@Pc(66) int local66 = (local55 < local47 ? local55 : local47) << 1;
			if (local51 == 0) {
				Static96.aBooleanArray8[local20] = false;
				Static96.anIntArray301[local20] = local47;
			} else {
				Static96.aBooleanArray8[local25] = Static96.aBooleanArray8[local29] = true;
				Static96.aBooleanArray8[local20] = true;
				if (local51 >= local66) {
					Static96.anIntArray301[local20] = local55 > local47 ? local51 + local47 - local47 : local47 - local51 + local55 - 1;
				} else {
					Static96.anIntArray301[local20] = (local51 & 0x1) == 0 ? local47 + local51 / 2 : local47 - (local51 + 1) / 2;
				}
			}
		}
		this.method1450(0, local3 - 1);
		local25 = 0;
		local29 = Static96.anIntArray301[0] * this.anInt2097;
		for (local47 = 1; local47 < local3; local47++) {
			if (Static96.aBooleanArray8[local47]) {
				local51 = Static96.anIntArray302[local47];
				local55 = Static96.anIntArray301[local47] * this.anInt2097;
				this.method1452(local25, local29, local51, local55, arg0, arg1);
				if (local51 >= arg1) {
					return;
				}
				local25 = local51;
				local29 = local55;
			}
		}
		@Pc(193) float local193 = Static96.aFloatArray1[local29];
		for (local55 = local25; local55 < arg1; local55++) {
			arg0[local55] *= local193;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)I")
	private int method1455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}
}
