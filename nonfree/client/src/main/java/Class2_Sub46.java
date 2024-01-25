import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class2_Sub46 extends Class2 {

	@OriginalMember(owner = "client!rw", name = "n", descriptor = "I")
	private int anInt9304;

	@OriginalMember(owner = "client!rw", name = "t", descriptor = "Z")
	private boolean aBoolean674;

	@OriginalMember(owner = "client!rw", name = "v", descriptor = "[[B")
	private byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!rw", name = "y", descriptor = "I")
	private int anInt9305;

	@OriginalMember(owner = "client!rw", name = "A", descriptor = "Z")
	private boolean aBoolean675;

	@OriginalMember(owner = "client!rw", name = "G", descriptor = "I")
	private int anInt9307;

	@OriginalMember(owner = "client!rw", name = "O", descriptor = "I")
	private int anInt9311;

	@OriginalMember(owner = "client!rw", name = "P", descriptor = "[F")
	private float[] aFloatArray67;

	@OriginalMember(owner = "client!rw", name = "R", descriptor = "I")
	private int anInt9312;

	@OriginalMember(owner = "client!rw", name = "S", descriptor = "I")
	private int anInt9313;

	@OriginalMember(owner = "client!rw", name = "T", descriptor = "[B")
	private byte[] aByteArray84;

	@OriginalMember(owner = "client!rw", name = "U", descriptor = "I")
	private int anInt9314;

	@OriginalMember(owner = "client!rw", name = "V", descriptor = "I")
	private int anInt9315;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "([B)V")
	public Class2_Sub46(@OriginalArg(0) byte[] arg0) {
		this.method8214(arg0);
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(I)[F")
	private float[] method8213(@OriginalArg(0) int arg0) {
		Static529.method8220(this.aByteArrayArray20[arg0]);
		Static529.method8211();
		@Pc(15) int local15 = Static529.method8219(Static8.method135(Static529.anIntArray476.length - 1));
		@Pc(19) boolean local19 = Static529.aBooleanArray53[local15];
		@Pc(25) int local25 = local19 ? Static529.anInt9308 : Static529.anInt9306;
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		if (local19) {
			local27 = Static529.method8211() != 0;
			local29 = Static529.method8211() != 0;
		}
		@Pc(47) int local47 = local25 >> 1;
		@Pc(59) int local59;
		@Pc(67) int local67;
		@Pc(71) int local71;
		if (local19 && !local27) {
			local59 = (local25 >> 2) - (Static529.anInt9306 >> 2);
			local67 = (local25 >> 2) + (Static529.anInt9306 >> 2);
			local71 = Static529.anInt9306 >> 1;
		} else {
			local59 = 0;
			local67 = local47;
			local71 = local25 >> 1;
		}
		@Pc(94) int local94;
		@Pc(104) int local104;
		@Pc(108) int local108;
		if (local19 && !local29) {
			local94 = local25 - (local25 >> 2) - (Static529.anInt9306 >> 2);
			local104 = local25 + (Static529.anInt9306 >> 2) - (local25 >> 2);
			local108 = Static529.anInt9306 >> 1;
		} else {
			local94 = local47;
			local104 = local25;
			local108 = local25 >> 1;
		}
		@Pc(123) Class117 local123 = Static529.aClass117Array1[Static529.anIntArray476[local15]];
		@Pc(126) int local126 = local123.anInt3826;
		@Pc(131) int local131 = local123.anIntArray173[local126];
		@Pc(140) boolean local140 = !Static529.aClass377Array1[local131].method9363();
		@Pc(154) float[] local154;
		for (@Pc(144) int local144 = 0; local144 < local123.anInt3827; local144++) {
			@Pc(152) Class121 local152 = Static529.aClass121Array1[local123.anIntArray174[local144]];
			local154 = Static529.aFloatArray65;
			local152.method3575(local154, local25 >> 1, local140);
		}
		@Pc(171) int local171;
		@Pc(176) int local176;
		if (!local140) {
			local171 = local123.anInt3826;
			local176 = local123.anIntArray173[local171];
			Static529.aClass377Array1[local176].method9365(Static529.aFloatArray65, local25 >> 1);
		}
		@Pc(212) int local212;
		if (local140) {
			for (local171 = local25 >> 1; local171 < local25; local171++) {
				Static529.aFloatArray65[local171] = 0.0F;
			}
		} else {
			local171 = local25 >> 1;
			local176 = local25 >> 2;
			local212 = local25 >> 3;
			@Pc(214) float[] local214 = Static529.aFloatArray65;
			for (@Pc(216) int local216 = 0; local216 < local171; local216++) {
				local214[local216] *= 0.5F;
			}
			for (@Pc(230) int local230 = local171; local230 < local25; local230++) {
				local214[local230] = -local214[local25 - local230 - 1];
			}
			@Pc(252) float[] local252 = local19 ? Static529.aFloatArray63 : Static529.aFloatArray60;
			@Pc(258) float[] local258 = local19 ? Static529.aFloatArray64 : Static529.aFloatArray62;
			@Pc(264) float[] local264 = local19 ? Static529.aFloatArray66 : Static529.aFloatArray61;
			@Pc(270) int[] local270 = local19 ? Static529.anIntArray475 : Static529.anIntArray477;
			@Pc(307) float local307;
			@Pc(313) float local313;
			@Pc(321) float local321;
			for (@Pc(272) int local272 = 0; local272 < local176; local272++) {
				@Pc(289) float local289 = local214[local272 * 4] - local214[local25 - local272 * 4 - 1];
				local307 = local214[local272 * 4 + 2] - local214[local25 - local272 * 4 - 3];
				local313 = local252[local272 * 2];
				local321 = local252[local272 * 2 + 1];
				local214[local25 - local272 * 4 - 1] = local289 * local313 - local307 * local321;
				local214[local25 - local272 * 4 - 3] = local289 * local321 + local307 * local313;
			}
			for (@Pc(359) int local359 = 0; local359 < local212; local359++) {
				local307 = local214[local171 + local359 * 4 + 3];
				local313 = local214[local171 + local359 * 4 + 1];
				local321 = local214[local359 * 4 + 3];
				@Pc(396) float local396 = local214[local359 * 4 + 1];
				local214[local171 + local359 * 4 + 3] = local307 + local321;
				local214[local171 + local359 * 4 + 1] = local313 + local396;
				@Pc(430) float local430 = local252[local171 - local359 * 4 - 4];
				@Pc(440) float local440 = local252[local171 - local359 * 4 - 3];
				local214[local359 * 4 + 3] = (local307 - local321) * local430 - (local313 - local396) * local440;
				local214[local359 * 4 + 1] = (local313 - local396) * local430 + (local307 - local321) * local440;
			}
			@Pc(486) int local486 = Static8.method135(local25 - 1);
			@Pc(520) int local520;
			@Pc(522) int local522;
			@Pc(527) int local527;
			@Pc(535) float local535;
			@Pc(543) float local543;
			@Pc(551) float local551;
			@Pc(559) float local559;
			@Pc(585) float local585;
			@Pc(495) int local495;
			@Pc(499) int local499;
			@Pc(501) int local501;
			@Pc(510) int local510;
			for (@Pc(488) int local488 = 0; local488 < local486 - 3; local488++) {
				local495 = local25 >> local488 + 2;
				local499 = 0x8 << local488;
				for (local501 = 0; local501 < 0x2 << local488; local501++) {
					local510 = local25 - local495 * 2 * local501;
					local520 = local25 - local495 * (local501 * 2 + 1);
					for (local522 = 0; local522 < local25 >> local488 + 4; local522++) {
						local527 = local522 * 4;
						local535 = local214[local510 - local527 - 1];
						local543 = local214[local510 - local527 - 3];
						local551 = local214[local520 - local527 - 1];
						local559 = local214[local520 - local527 - 3];
						local214[local510 - local527 - 1] = local535 + local551;
						local214[local510 - local527 - 3] = local543 + local559;
						local585 = local252[local522 * local499];
						@Pc(593) float local593 = local252[local522 * local499 + 1];
						local214[local520 - local527 - 1] = (local535 - local551) * local585 - (local543 - local559) * local593;
						local214[local520 - local527 - 3] = (local543 - local559) * local585 + (local535 - local551) * local593;
					}
				}
			}
			@Pc(673) float local673;
			for (local495 = 1; local495 < local212 - 1; local495++) {
				local499 = local270[local495];
				if (local495 < local499) {
					local501 = local495 * 8;
					local510 = local499 * 8;
					local673 = local214[local501 + 1];
					local214[local501 + 1] = local214[local510 + 1];
					local214[local510 + 1] = local673;
					@Pc(695) float local695 = local214[local501 + 3];
					local214[local501 + 3] = local214[local510 + 3];
					local214[local510 + 3] = local695;
					@Pc(717) float local717 = local214[local501 + 5];
					local214[local501 + 5] = local214[local510 + 5];
					local214[local510 + 5] = local717;
					@Pc(739) float local739 = local214[local501 + 7];
					local214[local501 + 7] = local214[local510 + 7];
					local214[local510 + 7] = local739;
				}
			}
			for (local499 = 0; local499 < local171; local499++) {
				local214[local499] = local214[local499 * 2 + 1];
			}
			for (local501 = 0; local501 < local212; local501++) {
				local214[local25 - local501 * 2 - 1] = local214[local501 * 4];
				local214[local25 - local501 * 2 - 2] = local214[local501 * 4 + 1];
				local214[local25 - local176 - local501 * 2 - 1] = local214[local501 * 4 + 2];
				local214[local25 - local176 - local501 * 2 - 2] = local214[local501 * 4 + 3];
			}
			for (local510 = 0; local510 < local212; local510++) {
				local673 = local264[local510 * 2];
				@Pc(868) float local868 = local264[local510 * 2 + 1];
				@Pc(876) float local876 = local214[local171 + local510 * 2];
				local535 = local214[local171 + local510 * 2 + 1];
				local543 = local214[local25 - local510 * 2 - 2];
				local551 = local214[local25 - local510 * 2 - 1];
				local559 = local868 * (local876 - local543) + local673 * (local535 + local551);
				local214[local171 + local510 * 2] = (local876 + local543 + local559) * 0.5F;
				local214[local25 - local510 * 2 - 2] = (local876 + local543 - local559) * 0.5F;
				local559 = local868 * (local535 + local551) - local673 * (local876 - local543);
				local214[local171 + local510 * 2 + 1] = (local535 + local559 - local551) * 0.5F;
				local214[local25 - local510 * 2 - 1] = (local551 + local559 - local535) * 0.5F;
			}
			for (local520 = 0; local520 < local176; local520++) {
				local214[local520] = local214[local520 * 2 + local171] * local258[local520 * 2] + local214[local520 * 2 + local171 + 1] * local258[local520 * 2 + 1];
				local214[local171 - local520 - 1] = local214[local520 * 2 + local171] * local258[local520 * 2 + 1] - local214[local520 * 2 + local171 + 1] * local258[local520 * 2];
			}
			for (local522 = 0; local522 < local176; local522++) {
				local214[local25 + local522 - local176] = -local214[local522];
			}
			for (local527 = 0; local527 < local176; local527++) {
				local214[local527] = local214[local176 + local527];
			}
			for (@Pc(1111) int local1111 = 0; local1111 < local176; local1111++) {
				local214[local176 + local1111] = -local214[local176 - local1111 - 1];
			}
			for (@Pc(1131) int local1131 = 0; local1131 < local176; local1131++) {
				local214[local171 + local1131] = local214[local25 - local1131 - 1];
			}
			for (@Pc(1150) int local1150 = local59; local1150 < local67; local1150++) {
				local559 = (float) Math.sin(((double) (local1150 - local59) + 0.5D) / (double) local71 * 0.5D * 3.141592653589793D);
				Static529.aFloatArray65[local1150] *= (float) Math.sin((double) local559 * 1.5707963267948966D * (double) local559);
			}
			for (@Pc(1188) int local1188 = local94; local1188 < local104; local1188++) {
				local585 = (float) Math.sin(((double) (local1188 - local94) + 0.5D) / (double) local108 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				Static529.aFloatArray65[local1188] *= (float) Math.sin((double) local585 * 1.5707963267948966D * (double) local585);
			}
		}
		@Pc(1228) float[] local1228 = null;
		if (this.anInt9313 > 0) {
			local176 = this.anInt9313 + local25 >> 2;
			local1228 = new float[local176];
			@Pc(1254) int local1254;
			if (!this.aBoolean674) {
				for (local212 = 0; local212 < this.anInt9307; local212++) {
					local1254 = (this.anInt9313 >> 1) + local212;
					local1228[local212] += this.aFloatArray67[local1254];
				}
			}
			if (!local140) {
				for (local212 = local59; local212 < local25 >> 1; local212++) {
					local1254 = local1228.length + local212 - (local25 >> 1);
					local1228[local1254] += Static529.aFloatArray65[local212];
				}
			}
		}
		local154 = this.aFloatArray67;
		this.aFloatArray67 = Static529.aFloatArray65;
		Static529.aFloatArray65 = local154;
		this.anInt9313 = local25;
		this.anInt9307 = local104 - (local25 >> 1);
		this.aBoolean674 = local140;
		return local1228;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "([B)V")
	private void method8214(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub8 local4 = new Class2_Sub8(arg0);
		this.anInt9304 = local4.method5172();
		this.anInt9312 = local4.method5172();
		this.anInt9305 = local4.method5172();
		this.anInt9311 = local4.method5172();
		if (this.anInt9311 < 0) {
			this.anInt9311 = ~this.anInt9311;
			this.aBoolean675 = true;
		}
		@Pc(40) int local40 = local4.method5172();
		this.aByteArrayArray20 = new byte[local40][];
		for (@Pc(46) int local46 = 0; local46 < local40; local46++) {
			@Pc(49) int local49 = 0;
			@Pc(53) int local53;
			do {
				local53 = local4.method5203();
				local49 += local53;
			} while (local53 >= 255);
			@Pc(64) byte[] local64 = new byte[local49];
			local4.method5176(local64, 0, local49);
			this.aByteArrayArray20[local46] = local64;
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "([I)Lclient!ud;")
	public Class2_Sub44_Sub1 method8218(@OriginalArg(0) int[] arg0) {
		if (arg0 != null && arg0[0] <= 0) {
			return null;
		}
		if (this.aByteArray84 == null) {
			this.anInt9313 = 0;
			this.aFloatArray67 = new float[Static529.anInt9308];
			this.aByteArray84 = new byte[this.anInt9312];
			this.anInt9315 = 0;
			this.anInt9314 = 0;
		}
		while (this.anInt9314 < this.aByteArrayArray20.length) {
			if (arg0 != null && arg0[0] <= 0) {
				return null;
			}
			@Pc(42) float[] local42 = this.method8213(this.anInt9314);
			if (local42 != null) {
				@Pc(47) int local47 = this.anInt9315;
				@Pc(50) int local50 = local42.length;
				if (local50 > this.anInt9312 - local47) {
					local50 = this.anInt9312 - local47;
				}
				for (@Pc(63) int local63 = 0; local63 < local50; local63++) {
					@Pc(73) int local73 = (int) (local42[local63] * 128.0F + 128.0F);
					if ((local73 & 0xFFFFFF00) != 0) {
						local73 = ~local73 >> 31;
					}
					this.aByteArray84[local47++] = (byte) (local73 - 128);
				}
				if (arg0 != null) {
					arg0[0] -= local47 - this.anInt9315;
				}
				this.anInt9315 = local47;
			}
			this.anInt9314++;
		}
		this.aFloatArray67 = null;
		@Pc(129) byte[] local129 = this.aByteArray84;
		this.aByteArray84 = null;
		return new Class2_Sub44_Sub1(this.anInt9304, local129, this.anInt9305, this.anInt9311, this.aBoolean675);
	}
}
