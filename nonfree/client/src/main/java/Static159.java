import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "Lclient!wu;")
	public static Class384 aClass384_40;

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "Lclient!ee;")
	public static final Class5_Sub12 aClass5_Sub12_1 = new Class5_Sub12(1350);

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "Lclient!mha;")
	public static final Class228 aClass228_2 = new Class228(5, 1);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
	public static void method2410() {
		@Pc(7) Class62 local7 = null;
		try {
			local7 = Static295.method4330("2");
			@Pc(29) Class5_Sub12 local29 = new Class5_Sub12(Static184.anInt3327 * 6 + 3);
			local29.method8647(1);
			local29.method8655(Static184.anInt3327);
			for (@Pc(39) int local39 = 0; local39 < Static605.anIntArray802.length; local39++) {
				if (Static361.aBooleanArray42[local39]) {
					local29.method8655(local39);
					local29.method8622(Static605.anIntArray802[local39]);
				}
			}
			local7.method1259(0, local29.anInt10154, local29.aByteArray104);
		} catch (@Pc(74) Exception local74) {
		}
		try {
			if (local7 != null) {
				local7.method1255();
			}
		} catch (@Pc(81) Exception local81) {
		}
		Static27.aLong14 = Static205.method3179();
		Static383.aBoolean558 = false;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!pda;Lclient!ha;Lclient!dh;I)V")
	public static void method2411(@OriginalArg(0) Class5_Sub39 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) Class72 arg2) {
		@Pc(10) Class44 local10 = arg2.method1444(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method5319();
		if (local16 < local10.method5320()) {
			local16 = local10.method5320();
		}
		@Pc(32) int local32 = arg0.anInt7219;
		@Pc(35) int local35 = arg0.anInt7222;
		@Pc(37) int local37 = 0;
		@Pc(47) int local47 = 0;
		@Pc(49) int local49 = 0;
		@Pc(63) int local63;
		@Pc(90) int local90;
		if (arg2.aString22 != null) {
			local37 = Static363.aClass298_7.method6970(arg2.aString22, (int[]) null, Static157.aStringArray11, (Class44[]) null);
			for (local63 = 0; local63 < local37; local63++) {
				@Pc(69) String local69 = Static157.aStringArray11[local63];
				if (local37 - 1 > local63) {
					local69 = local69.substring(0, local69.length() - 4);
				}
				local90 = Static639.aClass262_8.method6267(local69);
				if (local47 < local90) {
					local47 = local90;
				}
			}
			local49 = Static639.aClass262_8.method6266() * local37 + Static639.aClass262_8.method6265() / 2;
		}
		local63 = local16 / 2 + arg0.anInt7219;
		@Pc(124) int local124 = arg0.anInt7222;
		if (local32 < local16 + Static203.anInt133) {
			local32 = Static203.anInt133;
			local63 = local47 / 2 + Static203.anInt133 + local16 / 2 + 15;
		} else if (Static203.anInt135 - local16 < local32) {
			local32 = Static203.anInt135 - local16;
			local63 = Static203.anInt135 - local47 / 2 - local16 / 2 - 5 - 10;
		}
		if (Static203.anInt138 + local16 > local35) {
			local124 = Static203.anInt138 + local16 / 2 + 10;
			local35 = Static203.anInt138;
		} else if (local35 > Static203.anInt129 - local16) {
			local124 = Static203.anInt129 - local49 - local16 / 2 - 10;
			local35 = Static203.anInt129 - local16;
		}
		local90 = (int) (Math.atan2((double) (local32 - arg0.anInt7219), (double) (local35 - arg0.anInt7222)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5306((float) local16 / 2.0F + (float) local32, (float) local16 / 2.0F + (float) local35, 4096, local90);
		@Pc(273) int local273 = -2;
		@Pc(275) int local275 = -2;
		@Pc(277) int local277 = -2;
		@Pc(279) int local279 = -2;
		if (arg2.aString22 != null) {
			local275 = local124;
			local273 = local63 - local47 / 2 - 5;
			local277 = local47 + local273 + 10;
			local279 = Static639.aClass262_8.method6266() * local37 + local124 + 3;
			if (arg2.anInt1510 != 0) {
				arg1.method7045(local277 - local273, -local124 + local279, local124, local273, arg2.anInt1510);
			}
			if (arg2.anInt1522 != 0) {
				arg1.method7005(local279 - local124, arg2.anInt1522, local277 - local273, local124, local273);
			}
			for (@Pc(352) int local352 = 0; local352 < local37; local352++) {
				@Pc(358) String local358 = Static157.aStringArray11[local352];
				if (local37 - 1 > local352) {
					local358 = local358.substring(0, local358.length() - 4);
				}
				Static639.aClass262_8.method6269(arg1, local358, local63, local124, arg2.anInt1536);
				local124 += Static639.aClass262_8.method6266();
			}
		}
		if (arg2.anInt1509 == -1 && arg2.aString22 == null) {
			return;
		}
		@Pc(405) Class5_Sub26 local405 = new Class5_Sub26(arg0);
		local16 >>= 0x1;
		local405.anInt4730 = local279;
		local405.anInt4722 = local35 - local16;
		local405.anInt4729 = local273;
		local405.anInt4723 = local275;
		local405.anInt4727 = local16 + local35;
		local405.anInt4725 = local32 + local16;
		local405.anInt4728 = local277;
		local405.anInt4721 = local32 - local16;
		Static173.aClass306_13.method7303(local405);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBLjava/net/Socket;)Lclient!gn;")
	public static Class30 method2412(@OriginalArg(2) Socket arg0) throws IOException {
		return new Class30_Sub1(arg0, 7500);
	}
}
