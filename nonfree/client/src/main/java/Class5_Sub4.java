import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "[B")
	public final byte[] aByteArray2 = new byte[128];

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
	public final int anInt345;

	@OriginalMember(owner = "client!bg", name = "x", descriptor = "[Lclient!jj;")
	public final Class51[] aClass51Array1 = new Class51[128];

	@OriginalMember(owner = "client!bg", name = "y", descriptor = "[Lclient!ne;")
	public final Class5_Sub7_Sub1[] aClass5_Sub7_Sub1Array1 = new Class5_Sub7_Sub1[128];

	@OriginalMember(owner = "client!bg", name = "B", descriptor = "[I")
	private int[] anIntArray24 = new int[128];

	@OriginalMember(owner = "client!bg", name = "D", descriptor = "[S")
	public final short[] aShortArray4 = new short[128];

	@OriginalMember(owner = "client!bg", name = "N", descriptor = "[B")
	public final byte[] aByteArray3 = new byte[128];

	@OriginalMember(owner = "client!bg", name = "O", descriptor = "[B")
	public final byte[] aByteArray4 = new byte[128];

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "([B)V")
	public Class5_Sub4(@OriginalArg(0) byte[] arg0) {
		@Pc(33) int local33 = 0;
		@Pc(38) Class5_Sub6 local38 = new Class5_Sub6(arg0);
		while (local38.aByteArray56[local33 + local38.anInt4050] != 0) {
			local33++;
		}
		@Pc(52) byte[] local52 = new byte[local33];
		for (@Pc(54) int local54 = 0; local54 < local33; local54++) {
			local52[local54] = local38.method3053();
		}
		local33++;
		local38.anInt4050++;
		@Pc(80) int local80 = local38.anInt4050;
		local38.anInt4050 += local33;
		@Pc(88) int local88;
		for (local88 = 0; local38.aByteArray56[local38.anInt4050 + local88] != 0; local88++) {
		}
		@Pc(102) byte[] local102 = new byte[local88];
		for (@Pc(104) int local104 = 0; local104 < local88; local104++) {
			local102[local104] = local38.method3053();
		}
		local88++;
		local38.anInt4050++;
		@Pc(130) int local130 = local38.anInt4050;
		local38.anInt4050 += local88;
		@Pc(138) int local138;
		for (local138 = 0; local38.aByteArray56[local38.anInt4050 + local138] != 0; local138++) {
		}
		@Pc(156) byte[] local156 = new byte[local138];
		for (@Pc(158) int local158 = 0; local158 < local138; local158++) {
			local156[local158] = local38.method3053();
		}
		local138++;
		local38.anInt4050++;
		@Pc(184) byte[] local184 = new byte[local138];
		@Pc(189) int local189;
		@Pc(197) int local197;
		@Pc(203) int local203;
		if (local138 > 1) {
			local189 = 2;
			local184[1] = 1;
			@Pc(195) int local195 = 1;
			for (local197 = 2; local197 < local138; local197++) {
				local203 = local38.method3062();
				if (local203 == 0) {
					local195 = local189++;
				} else {
					if (local195 >= local203) {
						local203--;
					}
					local195 = local203;
				}
				local184[local197] = (byte) local195;
			}
		} else {
			local189 = local138;
		}
		@Pc(236) Class51[] local236 = new Class51[local189];
		for (local197 = 0; local197 < local236.length; local197++) {
			@Pc(248) Class51 local248 = local236[local197] = new Class51();
			@Pc(252) int local252 = local38.method3062();
			if (local252 > 0) {
				local248.aByteArray26 = new byte[local252 * 2];
			}
			local252 = local38.method3062();
			if (local252 > 0) {
				local248.aByteArray27 = new byte[local252 * 2 + 2];
				local248.aByteArray27[1] = 64;
			}
		}
		local203 = local38.method3062();
		@Pc(293) int local293 = 0;
		@Pc(305) byte[] local305 = local203 <= 0 ? null : new byte[local203 * 2];
		local203 = local38.method3062();
		while (local38.aByteArray56[local293 + local38.anInt4050] != 0) {
			local293++;
		}
		@Pc(323) byte[] local323 = new byte[local293];
		for (@Pc(325) int local325 = 0; local325 < local293; local325++) {
			local323[local325] = local38.method3053();
		}
		@Pc(350) byte[] local350 = local203 <= 0 ? null : new byte[local203 * 2];
		local38.anInt4050++;
		local293++;
		@Pc(359) int local359 = 0;
		for (@Pc(361) int local361 = 0; local361 < 128; local361++) {
			local359 += local38.method3062();
			this.aShortArray4[local361] = (short) local359;
		}
		local359 = 0;
		for (@Pc(383) int local383 = 0; local383 < 128; local383++) {
			local359 += local38.method3062();
			this.aShortArray4[local383] = (short) (this.aShortArray4[local383] + (local359 << 8));
		}
		@Pc(410) int local410 = 0;
		@Pc(412) int local412 = 0;
		@Pc(414) int local414 = 0;
		for (@Pc(416) int local416 = 0; local416 < 128; local416++) {
			if (local410 == 0) {
				if (local323.length > local412) {
					local410 = local323[local412++];
				} else {
					local410 = -1;
				}
				local414 = local38.method3038();
			}
			local410--;
			this.aShortArray4[local416] = (short) (this.aShortArray4[local416] + ((local414 - 1 & 0x2) << 14));
			this.anIntArray24[local416] = local414;
		}
		local410 = 0;
		@Pc(472) int local472 = 0;
		local412 = 0;
		for (@Pc(476) int local476 = 0; local476 < 128; local476++) {
			if (this.anIntArray24[local476] != 0) {
				if (local410 == 0) {
					local472 = local38.aByteArray56[local80++] - 1;
					if (local412 < local52.length) {
						local410 = local52[local412++];
					} else {
						local410 = -1;
					}
				}
				this.aByteArray2[local476] = (byte) local472;
				local410--;
			}
		}
		local410 = 0;
		local412 = 0;
		@Pc(531) int local531 = 0;
		for (@Pc(533) int local533 = 0; local533 < 128; local533++) {
			if (this.anIntArray24[local533] != 0) {
				if (local410 == 0) {
					local531 = local38.aByteArray56[local130++] + 16 << 2;
					if (local102.length <= local412) {
						local410 = -1;
					} else {
						local410 = local102[local412++];
					}
				}
				local410--;
				this.aByteArray3[local533] = (byte) local531;
			}
		}
		@Pc(584) Class51 local584 = null;
		local410 = 0;
		local412 = 0;
		for (@Pc(590) int local590 = 0; local590 < 128; local590++) {
			if (this.anIntArray24[local590] != 0) {
				if (local410 == 0) {
					local584 = local236[local184[local412]];
					if (local412 >= local156.length) {
						local410 = -1;
					} else {
						local410 = local156[local412++];
					}
				}
				local410--;
				this.aClass51Array1[local590] = local584;
			}
		}
		local410 = 0;
		@Pc(637) int local637 = 0;
		local412 = 0;
		for (@Pc(641) int local641 = 0; local641 < 128; local641++) {
			if (local410 == 0) {
				if (local412 >= local323.length) {
					local410 = -1;
				} else {
					local410 = local323[local412++];
				}
				if (this.anIntArray24[local641] > 0) {
					local637 = local38.method3062() + 1;
				}
			}
			local410--;
			this.aByteArray4[local641] = (byte) local637;
		}
		this.anInt345 = local38.method3062() + 1;
		@Pc(703) int local703;
		for (@Pc(692) int local692 = 0; local692 < local189; local692++) {
			@Pc(698) Class51 local698 = local236[local692];
			if (local698.aByteArray26 != null) {
				for (local703 = 1; local703 < local698.aByteArray26.length; local703 += 2) {
					local698.aByteArray26[local703] = local38.method3053();
				}
			}
			if (local698.aByteArray27 != null) {
				for (local703 = 3; local703 < local698.aByteArray27.length - 2; local703 += 2) {
					local698.aByteArray27[local703] = local38.method3053();
				}
			}
		}
		@Pc(752) int local752;
		if (local305 != null) {
			for (local752 = 1; local752 < local305.length; local752 += 2) {
				local305[local752] = local38.method3053();
			}
		}
		if (local350 != null) {
			for (local752 = 1; local752 < local350.length; local752 += 2) {
				local350[local752] = local38.method3053();
			}
		}
		@Pc(805) int local805;
		for (local752 = 0; local752 < local189; local752++) {
			@Pc(798) Class51 local798 = local236[local752];
			if (local798.aByteArray27 != null) {
				local359 = 0;
				for (local805 = 2; local805 < local798.aByteArray27.length; local805 += 2) {
					local359 = local38.method3062() + local359 + 1;
					local798.aByteArray27[local805] = (byte) local359;
				}
			}
		}
		@Pc(846) int local846;
		for (local703 = 0; local703 < local189; local703++) {
			@Pc(839) Class51 local839 = local236[local703];
			if (local839.aByteArray26 != null) {
				local359 = 0;
				for (local846 = 2; local846 < local839.aByteArray26.length; local846 += 2) {
					local359 = local38.method3062() + local359 + 1;
					local839.aByteArray26[local846] = (byte) local359;
				}
			}
		}
		@Pc(915) int local915;
		@Pc(942) int local942;
		@Pc(954) byte local954;
		@Pc(968) int local968;
		@Pc(970) int local970;
		@Pc(980) int local980;
		@Pc(909) byte local909;
		@Pc(1016) int local1016;
		if (local305 != null) {
			local359 = local38.method3062();
			local305[0] = (byte) local359;
			for (local805 = 2; local805 < local305.length; local805 += 2) {
				local359 += local38.method3062() + 1;
				local305[local805] = (byte) local359;
			}
			local909 = local305[0];
			@Pc(913) byte local913 = local305[1];
			for (local915 = 0; local915 < local909; local915++) {
				this.aByteArray4[local915] = (byte) (local913 * this.aByteArray4[local915] + 32 >> 6);
			}
			local942 = 2;
			while (local305.length > local942) {
				@Pc(950) byte local950 = local305[local942 + 1];
				local954 = local305[local942];
				local968 = (local954 - local909) / 2 + local913 * (local954 - local909);
				for (local970 = local909; local970 < local954; local970++) {
					local980 = Static5.method128(local954 - local909, local968);
					this.aByteArray4[local970] = (byte) (this.aByteArray4[local970] * local980 + 32 >> 6);
					local968 += local950 - local913;
				}
				local942 += 2;
				local913 = local950;
				local909 = local954;
			}
			for (local1016 = local909; local1016 < 128; local1016++) {
				this.aByteArray4[local1016] = (byte) (this.aByteArray4[local1016] * local913 + 32 >> 6);
			}
		}
		@Pc(1080) int local1080;
		if (local350 != null) {
			local359 = local38.method3062();
			local350[0] = (byte) local359;
			for (local805 = 2; local805 < local350.length; local805 += 2) {
				local359 += local38.method3062() + 1;
				local350[local805] = (byte) local359;
			}
			local1080 = local350[1] << 1;
			local909 = local350[0];
			for (local915 = 0; local915 < local909; local915++) {
				local942 = (this.aByteArray3[local915] & 0xFF) + local1080;
				if (local942 < 0) {
					local942 = 0;
				}
				if (local942 > 128) {
					local942 = 128;
				}
				this.aByteArray3[local915] = (byte) local942;
			}
			local942 = 2;
			@Pc(1156) int local1156;
			while (local350.length > local942) {
				local954 = local350[local942];
				local968 = local1080 * (local954 - local909) + (local954 - local909) / 2;
				local1156 = local350[local942 + 1] << 1;
				for (local970 = local909; local970 < local954; local970++) {
					local980 = Static5.method128(local954 - local909, local968);
					local968 += local1156 - local1080;
					@Pc(1183) int local1183 = local980 + (this.aByteArray3[local970] & 0xFF);
					if (local1183 < 0) {
						local1183 = 0;
					}
					if (local1183 > 128) {
						local1183 = 128;
					}
					this.aByteArray3[local970] = (byte) local1183;
				}
				local942 += 2;
				local1080 = local1156;
				local909 = local954;
			}
			for (local1016 = local909; local1016 < 128; local1016++) {
				local1156 = local1080 + (this.aByteArray3[local1016] & 0xFF);
				if (local1156 < 0) {
					local1156 = 0;
				}
				if (local1156 > 128) {
					local1156 = 128;
				}
				this.aByteArray3[local1016] = (byte) local1156;
			}
		}
		for (local805 = 0; local805 < local189; local805++) {
			local236[local805].anInt2000 = local38.method3062();
		}
		for (local846 = 0; local846 < local189; local846++) {
			@Pc(1279) Class51 local1279 = local236[local846];
			if (local1279.aByteArray26 != null) {
				local1279.anInt1999 = local38.method3062();
			}
			if (local1279.aByteArray27 != null) {
				local1279.anInt1994 = local38.method3062();
			}
			if (local1279.anInt2000 > 0) {
				local1279.anInt2004 = local38.method3062();
			}
		}
		for (local1080 = 0; local1080 < local189; local1080++) {
			local236[local1080].anInt1996 = local38.method3062();
		}
		for (local915 = 0; local915 < local189; local915++) {
			@Pc(1341) Class51 local1341 = local236[local915];
			if (local1341.anInt1996 > 0) {
				local1341.anInt1995 = local38.method3062();
			}
		}
		for (local942 = 0; local942 < local189; local942++) {
			@Pc(1364) Class51 local1364 = local236[local942];
			if (local1364.anInt1995 > 0) {
				local1364.anInt2001 = local38.method3062();
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
	public void method286() {
		this.anIntArray24 = null;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([ILclient!da;[BI)Z")
	public boolean method288(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class5_Sub7_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg2 == null || arg2[local13] != 0) {
				@Pc(25) int local25 = this.anIntArray24[local13];
				if (local25 != 0) {
					if (local25 != local9) {
						local9 = local25--;
						if ((local25 & 0x1) == 0) {
							local11 = arg1.method536(local25 >> 2, arg0);
						} else {
							local11 = arg1.method542(arg0, local25 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass5_Sub7_Sub1Array1[local13] = local11;
						this.anIntArray24[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}
