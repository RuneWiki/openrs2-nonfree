import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class2_Sub27 extends Class2 {

	@OriginalMember(owner = "client!pf", name = "F", descriptor = "Z")
	public static boolean aBoolean368 = false;

	@OriginalMember(owner = "client!pf", name = "t", descriptor = "[[B")
	private byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
	private int anInt4908;

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
	private int anInt4909;

	@OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
	private int anInt4910;

	@OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
	private int anInt4911;

	@OriginalMember(owner = "client!pf", name = "D", descriptor = "Z")
	private boolean aBoolean367;

	@OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
	private int anInt4914;

	@OriginalMember(owner = "client!pf", name = "V", descriptor = "I")
	private int anInt4917;

	@OriginalMember(owner = "client!pf", name = "W", descriptor = "Z")
	private boolean aBoolean369;

	@OriginalMember(owner = "client!pf", name = "X", descriptor = "[F")
	private float[] aFloatArray29;

	@OriginalMember(owner = "client!pf", name = "Y", descriptor = "[B")
	private byte[] aByteArray59;

	@OriginalMember(owner = "client!pf", name = "Z", descriptor = "I")
	private int anInt4918;

	@OriginalMember(owner = "client!pf", name = "ab", descriptor = "I")
	private int anInt4919;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "([B)V", line = 803)
	public Class2_Sub27(@OriginalArg(0) byte[] arg0) {
		this.method4517(arg0);
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)[F", line = 197)
	private float[] method4516(@OriginalArg(0) int arg0) {
		Static246.method4518(this.aByteArrayArray14[arg0]);
		Static246.method4523();
		@Pc(15) int local15 = Static246.method4514(Static264.method4930(Static246.anIntArray336.length - 1));
		@Pc(19) boolean local19 = Static246.aBooleanArray43[local15];
		@Pc(25) int local25 = local19 ? Static246.anInt4913 : Static246.anInt4916;
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		if (local19) {
			local27 = Static246.method4523() != 0;
			local29 = Static246.method4523() != 0;
		}
		@Pc(47) int local47 = local25 >> 1;
		@Pc(59) int local59;
		@Pc(67) int local67;
		@Pc(71) int local71;
		if (local19 && !local27) {
			local59 = (local25 >> 2) - (Static246.anInt4916 >> 2);
			local67 = (local25 >> 2) + (Static246.anInt4916 >> 2);
			local71 = Static246.anInt4916 >> 1;
		} else {
			local59 = 0;
			local67 = local47;
			local71 = local25 >> 1;
		}
		@Pc(94) int local94;
		@Pc(104) int local104;
		@Pc(108) int local108;
		if (local19 && !local29) {
			local94 = local25 - (local25 >> 2) - (Static246.anInt4916 >> 2);
			local104 = local25 + (Static246.anInt4916 >> 2) - (local25 >> 2);
			local108 = Static246.anInt4916 >> 1;
		} else {
			local94 = local47;
			local104 = local25;
			local108 = local25 >> 1;
		}
		@Pc(123) Class88 local123 = Static246.aClass88Array1[Static246.anIntArray336[local15]];
		@Pc(126) int local126 = local123.anInt2386;
		@Pc(131) int local131 = local123.anIntArray153[local126];
		@Pc(140) boolean local140 = !Static246.aClass238Array1[local131].method6062();
		@Pc(154) float[] local154;
		for (@Pc(144) int local144 = 0; local144 < local123.anInt2385; local144++) {
			@Pc(152) Class186 local152 = Static246.aClass186Array1[local123.anIntArray154[local144]];
			local154 = Static246.aFloatArray23;
			local152.method4678(local154, local25 >> 1, local140);
		}
		@Pc(171) int local171;
		@Pc(176) int local176;
		if (!local140) {
			local171 = local123.anInt2386;
			local176 = local123.anIntArray153[local171];
			Static246.aClass238Array1[local176].method6058(Static246.aFloatArray23, local25 >> 1);
		}
		@Pc(212) int local212;
		if (local140) {
			for (local171 = local25 >> 1; local171 < local25; local171++) {
				Static246.aFloatArray23[local171] = 0.0F;
			}
		} else {
			local171 = local25 >> 1;
			local176 = local25 >> 2;
			local212 = local25 >> 3;
			@Pc(214) float[] local214 = Static246.aFloatArray23;
			for (@Pc(216) int local216 = 0; local216 < local171; local216++) {
				local214[local216] *= 0.5F;
			}
			for (@Pc(230) int local230 = local171; local230 < local25; local230++) {
				local214[local230] = -local214[local25 - local230 - 1];
			}
			@Pc(252) float[] local252 = local19 ? Static246.aFloatArray28 : Static246.aFloatArray26;
			@Pc(258) float[] local258 = local19 ? Static246.aFloatArray24 : Static246.aFloatArray27;
			@Pc(264) float[] local264 = local19 ? Static246.aFloatArray22 : Static246.aFloatArray25;
			@Pc(270) int[] local270 = local19 ? Static246.anIntArray337 : Static246.anIntArray335;
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
			@Pc(486) int local486 = Static264.method4930(local25 - 1);
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
				Static246.aFloatArray23[local1150] *= (float) Math.sin((double) local559 * 1.5707963267948966D * (double) local559);
			}
			for (@Pc(1188) int local1188 = local94; local1188 < local104; local1188++) {
				local585 = (float) Math.sin(((double) (local1188 - local94) + 0.5D) / (double) local108 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				Static246.aFloatArray23[local1188] *= (float) Math.sin((double) local585 * 1.5707963267948966D * (double) local585);
			}
		}
		@Pc(1228) float[] local1228 = null;
		if (this.anInt4914 > 0) {
			local176 = this.anInt4914 + local25 >> 2;
			local1228 = new float[local176];
			@Pc(1254) int local1254;
			if (!this.aBoolean367) {
				for (local212 = 0; local212 < this.anInt4909; local212++) {
					local1254 = (this.anInt4914 >> 1) + local212;
					local1228[local212] += this.aFloatArray29[local1254];
				}
			}
			if (!local140) {
				for (local212 = local59; local212 < local25 >> 1; local212++) {
					local1254 = local1228.length + local212 - (local25 >> 1);
					local1228[local1254] += Static246.aFloatArray23[local212];
				}
			}
		}
		local154 = this.aFloatArray29;
		this.aFloatArray29 = Static246.aFloatArray23;
		Static246.aFloatArray23 = local154;
		this.anInt4914 = local25;
		this.anInt4909 = local104 - (local25 >> 1);
		this.aBoolean367 = local140;
		return local1228;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "([B)V", line = 613)
	private void method4517(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub4 local4 = new Class2_Sub4(arg0);
		this.anInt4917 = local4.method4837();
		this.anInt4910 = local4.method4837();
		this.anInt4911 = local4.method4837();
		this.anInt4908 = local4.method4837();
		if (this.anInt4908 < 0) {
			this.anInt4908 = ~this.anInt4908;
			this.aBoolean369 = true;
		}
		@Pc(40) int local40 = local4.method4837();
		this.aByteArrayArray14 = new byte[local40][];
		for (@Pc(46) int local46 = 0; local46 < local40; local46++) {
			@Pc(49) int local49 = 0;
			@Pc(53) int local53;
			do {
				local53 = local4.method4816();
				local49 += local53;
			} while (local53 >= 255);
			@Pc(64) byte[] local64 = new byte[local49];
			local4.method4800(local64, local49);
			this.aByteArrayArray14[local46] = local64;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([I)Lclient!jn;", line = 682)
	public Class2_Sub21_Sub1 method4520(@OriginalArg(0) int[] arg0) {
		if (arg0 != null && arg0[0] <= 0) {
			return null;
		}
		if (this.aByteArray59 == null) {
			this.anInt4914 = 0;
			this.aFloatArray29 = new float[Static246.anInt4913];
			this.aByteArray59 = new byte[this.anInt4910];
			this.anInt4918 = 0;
			this.anInt4919 = 0;
		}
		while (this.anInt4919 < this.aByteArrayArray14.length) {
			if (arg0 != null && arg0[0] <= 0) {
				return null;
			}
			@Pc(42) float[] local42 = this.method4516(this.anInt4919);
			if (local42 != null) {
				@Pc(47) int local47 = this.anInt4918;
				@Pc(50) int local50 = local42.length;
				if (local50 > this.anInt4910 - local47) {
					local50 = this.anInt4910 - local47;
				}
				for (@Pc(63) int local63 = 0; local63 < local50; local63++) {
					@Pc(73) int local73 = (int) (local42[local63] * 128.0F + 128.0F);
					if ((local73 & 0xFFFFFF00) != 0) {
						local73 = ~local73 >> 31;
					}
					this.aByteArray59[local47++] = (byte) (local73 - 128);
				}
				if (arg0 != null) {
					arg0[0] -= local47 - this.anInt4918;
				}
				this.anInt4918 = local47;
			}
			this.anInt4919++;
		}
		this.aFloatArray29 = null;
		@Pc(129) byte[] local129 = this.aByteArray59;
		this.aByteArray59 = null;
		return new Class2_Sub21_Sub1(this.anInt4917, local129, this.anInt4911, this.anInt4908, this.aBoolean369);
	}
}
