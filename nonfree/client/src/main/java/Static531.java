import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray54 = new boolean[100];

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "Z")
	public static boolean aBoolean677 = false;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!aa;Lclient!uf;Lclient!ha;IIIBI)V")
	public static void method8223(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) Class357 arg2, @OriginalArg(3) Class101 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) Class218 local10 = Static350.aClass5_3.method94(arg6);
		if (local10 == null || !local10.aBoolean508 || !local10.method6003(Static113.aClass282_1)) {
			return;
		}
		@Pc(30) int local30;
		if (local10.anIntArray319 != null) {
			@Pc(28) int[] local28 = new int[local10.anIntArray319.length];
			@Pc(40) int local40;
			@Pc(53) int local53;
			@Pc(57) int local57;
			for (local30 = 0; local30 < local28.length / 2; local30++) {
				if (Static484.anInt8685 == 4) {
					local40 = (int) Static278.aFloat108 & 0x3FFF;
				} else {
					local40 = Static275.anInt5119 + (int) Static278.aFloat108 & 0x3FFF;
				}
				local53 = Class12_Sub2.anIntArray204[local40];
				local57 = Class12_Sub2.anIntArray203[local40];
				if (Static484.anInt8685 != 4) {
					local57 = local57 * 256 / (Static199.anInt4199 + 256);
					local53 = local53 * 256 / (Static199.anInt4199 + 256);
				}
				local28[local30 * 2] = (local53 * (arg5 + local10.anIntArray319[local30 * 2 + 1] * 4) + (local10.anIntArray319[local30 * 2] * 4 + arg7) * local57 >> 14) + arg2.anInt10395 / 2 + arg4;
				local28[local30 * 2 + 1] = arg0 + arg2.anInt10465 / 2 - (local57 * (arg5 + local10.anIntArray319[local30 * 2 + 1] * 4) - (arg7 + local10.anIntArray319[local30 * 2] * 4) * local53 >> 14);
			}
			Static243.method4347(arg3, local28, local10.anInt6715, arg2.anIntArray543, arg2.anIntArray550);
			if (local10.anInt6686 > 0) {
				@Pc(216) int local216;
				@Pc(226) int local226;
				@Pc(237) int local237;
				@Pc(247) int local247;
				for (local40 = 0; local40 < local28.length / 2 - 1; local40++) {
					local53 = local28[local40 * 2];
					local57 = local28[local40 * 2 + 1];
					local216 = local28[local40 * 2 + 2];
					local226 = local28[(local40 + 1) * 2 + 1];
					if (local216 < local53) {
						local237 = local53;
						local247 = local57;
						local53 = local216;
						local57 = local226;
						local216 = local237;
						local226 = local247;
					} else if (local53 == local216 && local226 < local57) {
						local237 = local57;
						local57 = local226;
						local226 = local237;
					}
					arg3.method8126(local53, local57, local216, local226, local10.anIntArray320[local10.aByteArray64[local40] & 0xFF], arg1, arg4, arg0, local10.anInt6686, local10.anInt6704, local10.anInt6711);
				}
				local53 = local28[local28.length - 2];
				local57 = local28[local28.length - 1];
				local216 = local28[0];
				local226 = local28[1];
				if (local216 < local53) {
					local237 = local53;
					local53 = local216;
					local247 = local57;
					local216 = local237;
					local57 = local226;
					local226 = local247;
				} else if (local216 == local53 && local57 > local226) {
					local237 = local57;
					local57 = local226;
					local226 = local237;
				}
				arg3.method8126(local53, local57, local216, local226, local10.anIntArray320[local10.aByteArray64[local10.aByteArray64.length - 1] & 0xFF], arg1, arg4, arg0, local10.anInt6686, local10.anInt6704, local10.anInt6711);
			} else {
				for (local40 = 0; local40 < local28.length / 2 - 1; local40++) {
					arg3.method8073(local28[local40 * 2], local28[local40 * 2 + 1], local28[(local40 + 1) * 2], local28[local40 * 2 + 1 + 2], local10.anIntArray320[local10.aByteArray64[local40] & 0xFF], arg1, arg4, arg0);
				}
				arg3.method8073(local28[local28.length - 2], local28[local28.length - 1], local28[0], local28[1], local10.anIntArray320[local10.aByteArray64[local10.aByteArray64.length - 1] & 0xFF], arg1, arg4, arg0);
			}
		}
		@Pc(466) Class71 local466 = null;
		if (local10.anInt6690 != -1) {
			local466 = local10.method6005(false, arg3);
			if (local466 != null) {
				Static131.method2330(arg2, arg4, arg1, arg0, arg5, arg7, local466);
			}
		}
		if (local10.aString76 == null) {
			return;
		}
		local30 = 0;
		if (local466 != null) {
			local30 = local466.method7707();
		}
		@Pc(500) Class59 local500 = Static514.aClass59_13;
		@Pc(502) Class324 local502 = Static6.aClass324_1;
		if (local10.anInt6703 == 1) {
			local500 = Static230.aClass59_3;
			local502 = Static455.aClass324_11;
		}
		if (local10.anInt6703 == 2) {
			local500 = Static253.aClass59_5;
			local502 = Static648.aClass324_12;
		}
		Static251.method4426(local10.aString76, arg5, local10.anInt6706, arg2, local500, arg1, local30, arg0, arg7, local502, arg4);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!m;I)V")
	public static void method8225(@OriginalArg(0) Class2_Sub1_Sub13 arg0) {
		if (arg0 == null) {
			return;
		}
		Static61.aClass271_6.method7174(arg0);
		Static276.anInt5124++;
		@Pc(39) Class2_Sub1_Sub19 local39;
		if (arg0.aBoolean523 || "".equals(arg0.aString82)) {
			local39 = new Class2_Sub1_Sub19(arg0.aString82);
			Static488.anInt8750++;
		} else {
			@Pc(33) long local33 = arg0.aLong180;
			for (local39 = (Class2_Sub1_Sub19) Static539.aClass335_39.method8357(local33); local39 != null && !local39.aString113.equals(arg0.aString82); local39 = (Class2_Sub1_Sub19) Static539.aClass335_39.method8352()) {
			}
			if (local39 == null) {
				local39 = (Class2_Sub1_Sub19) Static130.aClass22_11.method462(local33);
				if (local39 != null && !local39.aString113.equals(arg0.aString82)) {
					local39 = null;
				}
				if (local39 == null) {
					local39 = new Class2_Sub1_Sub19(arg0.aString82);
				}
				Static539.aClass335_39.method8356(local39, local33);
				Static488.anInt8750++;
			}
		}
		if (local39.method8592(arg0)) {
			Static91.method1582(local39);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!jg;Lclient!ha;Lclient!ll;I)V")
	public static void method8226(@OriginalArg(0) Class2_Sub33 arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) Class218 arg2) {
		@Pc(10) Class71 local10 = arg2.method6006(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method7691();
		if (local10.method7707() > local16) {
			local16 = local10.method7707();
		}
		@Pc(28) int local28 = arg0.anInt5217;
		@Pc(31) int local31 = arg0.anInt5212;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(51) int local51;
		@Pc(74) int local74;
		if (arg2.aString76 != null) {
			local33 = Static6.aClass324_1.method8186(Static265.aStringArray27, (Class71[]) null, arg2.aString76, (int[]) null);
			for (local51 = 0; local51 < local33; local51++) {
				@Pc(57) String local57 = Static265.aStringArray27[local51];
				if (local51 < local33 - 1) {
					local57 = local57.substring(0, local57.length() - 4);
				}
				local74 = Static122.aClass144_1.method4125(local57);
				if (local74 > local35) {
					local35 = local74;
				}
			}
			local37 = local33 * Static122.aClass144_1.method4119() + Static122.aClass144_1.method4124() / 2;
		}
		local51 = arg0.anInt5217 + local16 / 2;
		if (local28 < local16 + Static331.anInt10591) {
			local51 = local16 / 2 + Static331.anInt10591 + local35 / 2 + 15;
			local28 = Static331.anInt10591;
		} else if (Static331.anInt10586 - local16 < local28) {
			local28 = Static331.anInt10586 - local16;
			local51 = Static331.anInt10586 - local16 / 2 - local35 / 2 - 5 - 10;
		}
		@Pc(167) int local167 = arg0.anInt5212;
		if (local16 + Static331.anInt10593 > local31) {
			local167 = local16 / 2 + Static331.anInt10593 + 10;
			local31 = Static331.anInt10593;
		} else if (local31 > Static331.anInt10595 - local16) {
			local31 = Static331.anInt10595 - local16;
			local167 = Static331.anInt10595 - local16 / 2 - local37 - 10;
		}
		local74 = (int) (Math.atan2((double) (local28 - arg0.anInt5217), (double) (local31 - arg0.anInt5212)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method7688((float) local16 / 2.0F + (float) local28, (float) local16 / 2.0F + (float) local31, 4096, local74);
		@Pc(250) int local250 = -2;
		@Pc(252) int local252 = -2;
		@Pc(254) int local254 = -2;
		@Pc(256) int local256 = -2;
		if (arg2.aString76 != null) {
			local250 = local51 - local35 / 2 - 5;
			local252 = local167;
			local254 = local250 + local35 + 10;
			local256 = local167 + Static122.aClass144_1.method4119() * local33 + 3;
			if (arg2.anInt6687 != 0) {
				arg1.method8061(local167, local256 - local167, arg2.anInt6687, local250, local254 - local250);
			}
			if (arg2.anInt6700 != 0) {
				arg1.method8103(local256 - local167, local250, arg2.anInt6700, local167, local254 - local250);
			}
			for (@Pc(332) int local332 = 0; local332 < local33; local332++) {
				@Pc(338) String local338 = Static265.aStringArray27[local332];
				if (local332 < local33 - 1) {
					local338 = local338.substring(0, local338.length() - 4);
				}
				Static122.aClass144_1.method4123(arg1, local338, local51, local167, arg2.anInt6706);
				local167 += Static122.aClass144_1.method4119();
			}
		}
		if (arg2.anInt6690 == -1 && arg2.aString76 == null) {
			return;
		}
		@Pc(389) Class2_Sub53 local389 = new Class2_Sub53(arg0);
		local16 >>= 0x1;
		local389.anInt10980 = local16 + local28;
		local389.anInt10981 = local250;
		local389.anInt10977 = local256;
		local389.anInt10985 = local254;
		local389.anInt10984 = local16 + local31;
		local389.anInt10979 = local252;
		local389.anInt10983 = local31 - local16;
		local389.anInt10976 = local28 - local16;
		Class15_Sub3_Sub3_Sub2.lb.method7174(local389);
	}
}
