import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!an", name = "q", descriptor = "Z")
	private boolean aBoolean30;

	@OriginalMember(owner = "client!an", name = "r", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!an", name = "s", descriptor = "[F")
	private float[] aFloatArray1;

	@OriginalMember(owner = "client!an", name = "x", descriptor = "I")
	private int anInt381;

	@OriginalMember(owner = "client!an", name = "C", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!an", name = "G", descriptor = "Z")
	private boolean aBoolean32;

	@OriginalMember(owner = "client!an", name = "L", descriptor = "I")
	private int anInt384;

	@OriginalMember(owner = "client!an", name = "M", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!an", name = "Q", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!an", name = "U", descriptor = "I")
	private int anInt387;

	@OriginalMember(owner = "client!an", name = "V", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!an", name = "W", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "client!an", name = "X", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "([B)V")
	public Class1_Sub3(@OriginalArg(0) byte[] arg0) {
		this.method295(arg0);
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "([B)V")
	private void method295(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub18 local4 = new Class1_Sub18(arg0);
		this.anInt387 = local4.method3074();
		this.anInt384 = local4.method3074();
		this.anInt386 = local4.method3074();
		this.anInt381 = local4.method3074();
		if (this.anInt381 < 0) {
			this.anInt381 = ~this.anInt381;
			this.aBoolean30 = true;
		}
		@Pc(40) int local40 = local4.method3074();
		this.aByteArrayArray1 = new byte[local40][];
		for (@Pc(46) int local46 = 0; local46 < local40; local46++) {
			@Pc(51) int local51 = 0;
			@Pc(55) int local55;
			do {
				local55 = local4.method3122();
				local51 += local55;
			} while (local55 >= 255);
			@Pc(67) byte[] local67 = new byte[local51];
			local4.method3095(local67, local51);
			this.aByteArrayArray1[local46] = local67;
		}
	}

	@OriginalMember(owner = "client!an", name = "d", descriptor = "(I)[F")
	private float[] method296(@OriginalArg(0) int arg0) {
		Static15.method291(this.aByteArrayArray1[arg0]);
		Static15.method299();
		@Pc(15) int local15 = Static15.method297(Static171.method2598(Static15.anIntArray32.length - 1));
		@Pc(19) boolean local19 = Static15.aBooleanArray1[local15];
		@Pc(25) int local25 = local19 ? Static15.anInt378 : Static15.anInt383;
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		if (local19) {
			local27 = Static15.method299() != 0;
			local29 = Static15.method299() != 0;
		}
		@Pc(47) int local47 = local25 >> 1;
		@Pc(59) int local59;
		@Pc(67) int local67;
		@Pc(71) int local71;
		if (local19 && !local27) {
			local59 = (local25 >> 2) - (Static15.anInt383 >> 2);
			local67 = (local25 >> 2) + (Static15.anInt383 >> 2);
			local71 = Static15.anInt383 >> 1;
		} else {
			local59 = 0;
			local67 = local47;
			local71 = local25 >> 1;
		}
		@Pc(94) int local94;
		@Pc(104) int local104;
		@Pc(108) int local108;
		if (local19 && !local29) {
			local94 = local25 - (local25 >> 2) - (Static15.anInt383 >> 2);
			local104 = local25 + (Static15.anInt383 >> 2) - (local25 >> 2);
			local108 = Static15.anInt383 >> 1;
		} else {
			local94 = local47;
			local104 = local25;
			local108 = local25 >> 1;
		}
		@Pc(123) Class174 local123 = Static15.aClass174Array1[Static15.anIntArray32[local15]];
		@Pc(126) int local126 = local123.anInt5670;
		@Pc(131) int local131 = local123.anIntArray666[local126];
		@Pc(140) boolean local140 = !Static15.aClass47Array1[local131].method1084();
		for (@Pc(144) int local144 = 0; local144 < local123.anInt5671; local144++) {
			@Pc(155) Class155 local155 = Static15.aClass155Array1[local123.anIntArray667[local144]];
			@Pc(157) float[] local157 = Static15.aFloatArray5;
			local155.method3973(local157, local25 >> 1, local140);
		}
		@Pc(176) int local176;
		if (!local140) {
			local131 = local123.anInt5670;
			local176 = local123.anIntArray666[local131];
			Static15.aClass47Array1[local176].method1089(Static15.aFloatArray5, local25 >> 1);
		}
		@Pc(212) int local212;
		if (local140) {
			for (local131 = local25 >> 1; local131 < local25; local131++) {
				Static15.aFloatArray5[local131] = 0.0F;
			}
		} else {
			local131 = local25 >> 1;
			local176 = local25 >> 2;
			local212 = local25 >> 3;
			@Pc(214) float[] local214 = Static15.aFloatArray5;
			@Pc(216) int local216;
			for (local216 = 0; local216 < local131; local216++) {
				local214[local216] *= 0.5F;
			}
			for (local216 = local131; local216 < local25; local216++) {
				local214[local216] = -local214[local25 - local216 - 1];
			}
			@Pc(252) float[] local252 = local19 ? Static15.aFloatArray6 : Static15.aFloatArray2;
			@Pc(258) float[] local258 = local19 ? Static15.aFloatArray8 : Static15.aFloatArray4;
			@Pc(264) float[] local264 = local19 ? Static15.aFloatArray3 : Static15.aFloatArray7;
			@Pc(270) int[] local270 = local19 ? Static15.anIntArray34 : Static15.anIntArray33;
			@Pc(272) int local272;
			@Pc(291) float local291;
			@Pc(309) float local309;
			@Pc(315) float local315;
			@Pc(323) float local323;
			for (local272 = 0; local272 < local176; local272++) {
				local291 = local214[local272 * 4] - local214[local25 - local272 * 4 - 1];
				local309 = local214[local272 * 4 + 2] - local214[local25 - local272 * 4 - 3];
				local315 = local252[local272 * 2];
				local323 = local252[local272 * 2 + 1];
				local214[local25 - local272 * 4 - 1] = local291 * local315 - local309 * local323;
				local214[local25 - local272 * 4 - 3] = local291 * local323 + local309 * local315;
			}
			@Pc(432) float local432;
			@Pc(442) float local442;
			for (local272 = 0; local272 < local212; local272++) {
				local291 = local214[local131 + local272 * 4 + 3];
				local309 = local214[local131 + local272 * 4 + 1];
				local315 = local214[local272 * 4 + 3];
				local323 = local214[local272 * 4 + 1];
				local214[local131 + local272 * 4 + 3] = local291 + local315;
				local214[local131 + local272 * 4 + 1] = local309 + local323;
				local432 = local252[local131 - local272 * 4 - 4];
				local442 = local252[local131 - local272 * 4 - 3];
				local214[local272 * 4 + 3] = (local291 - local315) * local432 - (local309 - local323) * local442;
				local214[local272 * 4 + 1] = (local309 - local323) * local432 + (local291 - local315) * local442;
			}
			local272 = Static171.method2598(local25 - 1);
			@Pc(488) int local488;
			@Pc(499) int local499;
			@Pc(503) int local503;
			@Pc(505) int local505;
			for (local488 = 0; local488 < local272 - 3; local488++) {
				local499 = local25 >> local488 + 2;
				local503 = 0x8 << local488;
				for (local505 = 0; local505 < 0x2 << local488; local505++) {
					@Pc(518) int local518 = local25 - local499 * 2 * local505;
					@Pc(528) int local528 = local25 - local499 * (local505 * 2 + 1);
					for (@Pc(530) int local530 = 0; local530 < local25 >> local488 + 4; local530++) {
						@Pc(541) int local541 = local530 * 4;
						@Pc(549) float local549 = local214[local518 - local541 - 1];
						@Pc(557) float local557 = local214[local518 - local541 - 3];
						@Pc(565) float local565 = local214[local528 - local541 - 1];
						@Pc(573) float local573 = local214[local528 - local541 - 3];
						local214[local518 - local541 - 1] = local549 + local565;
						local214[local518 - local541 - 3] = local557 + local573;
						@Pc(599) float local599 = local252[local530 * local503];
						@Pc(607) float local607 = local252[local530 * local503 + 1];
						local214[local528 - local541 - 1] = (local549 - local565) * local599 - (local557 - local573) * local607;
						local214[local528 - local541 - 3] = (local557 - local573) * local599 + (local549 - local565) * local607;
					}
				}
			}
			for (local488 = 1; local488 < local212 - 1; local488++) {
				local499 = local270[local488];
				if (local488 < local499) {
					local503 = local488 * 8;
					local505 = local499 * 8;
					local432 = local214[local503 + 1];
					local214[local503 + 1] = local214[local505 + 1];
					local214[local505 + 1] = local432;
					local432 = local214[local503 + 3];
					local214[local503 + 3] = local214[local505 + 3];
					local214[local505 + 3] = local432;
					local432 = local214[local503 + 5];
					local214[local503 + 5] = local214[local505 + 5];
					local214[local505 + 5] = local432;
					local432 = local214[local503 + 7];
					local214[local503 + 7] = local214[local505 + 7];
					local214[local505 + 7] = local432;
				}
			}
			for (local488 = 0; local488 < local131; local488++) {
				local214[local488] = local214[local488 * 2 + 1];
			}
			for (local488 = 0; local488 < local212; local488++) {
				local214[local25 - local488 * 2 - 1] = local214[local488 * 4];
				local214[local25 - local488 * 2 - 2] = local214[local488 * 4 + 1];
				local214[local25 - local176 - local488 * 2 - 1] = local214[local488 * 4 + 2];
				local214[local25 - local176 - local488 * 2 - 2] = local214[local488 * 4 + 3];
			}
			for (local488 = 0; local488 < local212; local488++) {
				local309 = local264[local488 * 2];
				local315 = local264[local488 * 2 + 1];
				local323 = local214[local131 + local488 * 2];
				local432 = local214[local131 + local488 * 2 + 1];
				local442 = local214[local25 - local488 * 2 - 2];
				@Pc(908) float local908 = local214[local25 - local488 * 2 - 1];
				@Pc(920) float local920 = local315 * (local323 - local442) + local309 * (local432 + local908);
				local214[local131 + local488 * 2] = (local323 + local442 + local920) * 0.5F;
				local214[local25 - local488 * 2 - 2] = (local323 + local442 - local920) * 0.5F;
				@Pc(962) float local962 = local315 * (local432 + local908) - local309 * (local323 - local442);
				local214[local131 + local488 * 2 + 1] = (local432 + local962 - local908) * 0.5F;
				local214[local25 - local488 * 2 - 1] = (local908 + local962 - local432) * 0.5F;
			}
			for (local488 = 0; local488 < local176; local488++) {
				local214[local488] = local214[local488 * 2 + local131] * local258[local488 * 2] + local214[local488 * 2 + local131 + 1] * local258[local488 * 2 + 1];
				local214[local131 - local488 - 1] = local214[local488 * 2 + local131] * local258[local488 * 2 + 1] - local214[local488 * 2 + local131 + 1] * local258[local488 * 2];
			}
			for (local488 = 0; local488 < local176; local488++) {
				local214[local25 + local488 - local176] = -local214[local488];
			}
			for (local488 = 0; local488 < local176; local488++) {
				local214[local488] = local214[local176 + local488];
			}
			for (local488 = 0; local488 < local176; local488++) {
				local214[local176 + local488] = -local214[local176 - local488 - 1];
			}
			for (local488 = 0; local488 < local176; local488++) {
				local214[local131 + local488] = local214[local25 - local488 - 1];
			}
			for (local488 = local59; local488 < local67; local488++) {
				local309 = (float) Math.sin(((double) (local488 - local59) + 0.5D) / (double) local71 * 0.5D * 3.141592653589793D);
				Static15.aFloatArray5[local488] *= (float) Math.sin((double) local309 * 1.5707963267948966D * (double) local309);
			}
			for (local488 = local94; local488 < local104; local488++) {
				local309 = (float) Math.sin(((double) (local488 - local94) + 0.5D) / (double) local108 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				Static15.aFloatArray5[local488] *= (float) Math.sin((double) local309 * 1.5707963267948966D * (double) local309);
			}
		}
		@Pc(1228) float[] local1228 = null;
		if (this.anInt379 > 0) {
			local176 = this.anInt379 + local25 >> 2;
			local1228 = new float[local176];
			@Pc(1257) int local1257;
			if (!this.aBoolean32) {
				for (local212 = 0; local212 < this.anInt385; local212++) {
					local1257 = (this.anInt379 >> 1) + local212;
					local1228[local212] += this.aFloatArray1[local1257];
				}
			}
			if (!local140) {
				for (local212 = local59; local212 < local25 >> 1; local212++) {
					local1257 = local1228.length + local212 - (local25 >> 1);
					local1228[local1257] += Static15.aFloatArray5[local212];
				}
			}
		}
		@Pc(1301) float[] local1301 = this.aFloatArray1;
		this.aFloatArray1 = Static15.aFloatArray5;
		Static15.aFloatArray5 = local1301;
		this.anInt379 = local25;
		this.anInt385 = local104 - (local25 >> 1);
		this.aBoolean32 = local140;
		return local1228;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "([I)Lclient!om;")
	public Class1_Sub22_Sub1 method300(@OriginalArg(0) int[] arg0) {
		if (arg0 != null && arg0[0] <= 0) {
			return null;
		}
		if (this.aByteArray2 == null) {
			this.anInt379 = 0;
			this.aFloatArray1 = new float[Static15.anInt378];
			this.aByteArray2 = new byte[this.anInt384];
			this.anInt388 = 0;
			this.anInt389 = 0;
		}
		while (this.anInt389 < this.aByteArrayArray1.length) {
			if (arg0 != null && arg0[0] <= 0) {
				return null;
			}
			@Pc(47) float[] local47 = this.method296(this.anInt389);
			if (local47 != null) {
				@Pc(52) int local52 = this.anInt388;
				@Pc(55) int local55 = local47.length;
				if (local55 > this.anInt384 - local52) {
					local55 = this.anInt384 - local52;
				}
				for (@Pc(68) int local68 = 0; local68 < local55; local68++) {
					@Pc(80) int local80 = (int) (local47[local68] * 128.0F + 128.0F);
					if ((local80 & 0xFFFFFF00) != 0) {
						local80 = ~local80 >> 31;
					}
					this.aByteArray2[local52++] = (byte) (local80 - 128);
				}
				if (arg0 != null) {
					arg0[0] -= local52 - this.anInt388;
				}
				this.anInt388 = local52;
			}
			this.anInt389++;
		}
		this.aFloatArray1 = null;
		@Pc(129) byte[] local129 = this.aByteArray2;
		this.aByteArray2 = null;
		return new Class1_Sub22_Sub1(this.anInt387, local129, this.anInt386, this.anInt381, this.aBoolean30);
	}
}
