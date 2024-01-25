import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!af", name = "c", descriptor = "I")
	public static int anInt221;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray7 = new Rectangle[100];

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_5 = new Class208(44, 4);

	@OriginalMember(owner = "client!af", name = "f", descriptor = "I")
	public static int anInt223 = 0;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!ha;Lclient!tl;Lclient!fo;)V")
	public static void method215(@OriginalArg(1) Class100 arg0, @OriginalArg(2) Class6_Sub45 arg1, @OriginalArg(3) Class105 arg2) {
		@Pc(10) Class32 local10 = arg2.method3040(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method5072();
		if (local16 < local10.method5077()) {
			local16 = local10.method5077();
		}
		@Pc(40) int local40 = arg1.anInt9418;
		@Pc(43) int local43 = arg1.anInt9416;
		@Pc(45) int local45 = 0;
		@Pc(47) int local47 = 0;
		@Pc(49) int local49 = 0;
		@Pc(63) int local63;
		@Pc(86) int local86;
		if (arg2.aString35 != null) {
			local45 = Static545.aClass133_42.method3640(Static174.aStringArray30, (int[]) null, arg2.aString35, (Class32[]) null);
			for (local63 = 0; local63 < local45; local63++) {
				@Pc(69) String local69 = Static174.aStringArray30[local63];
				if (local45 - 1 > local63) {
					local69 = local69.substring(0, local69.length() - 4);
				}
				local86 = Static408.aClass276_5.method7127(local69);
				if (local86 > local47) {
					local47 = local86;
				}
			}
			local49 = Static408.aClass276_5.method7128() * local45 + Static408.aClass276_5.method7129() / 2;
		}
		local63 = arg1.anInt9418 + local16 / 2;
		@Pc(120) int local120 = arg1.anInt9416;
		if (local16 + Static487.anInt7458 > local40) {
			local40 = Static487.anInt7458;
			local63 = local47 / 2 + Static487.anInt7458 + local16 / 2 + 10 + 5;
		} else if (Static487.anInt7452 - local16 < local40) {
			local63 = Static487.anInt7452 - local16 / 2 - local47 / 2 - 5 - 10;
			local40 = Static487.anInt7452 - local16;
		}
		if (local43 < Static487.anInt7456 + local16) {
			local43 = Static487.anInt7456;
			local120 = local16 / 2 + Static487.anInt7456 + 10;
		} else if (Static487.anInt7454 - local16 < local43) {
			local120 = Static487.anInt7454 - local49 - local16 / 2 - 10;
			local43 = Static487.anInt7454 - local16;
		}
		local86 = (int) (Math.atan2((double) (local40 - arg1.anInt9418), (double) (local43 - arg1.anInt9416)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5087((float) local16 / 2.0F + (float) local40, (float) local43 + (float) local16 / 2.0F, 4096, local86);
		@Pc(253) int local253 = -2;
		@Pc(255) int local255 = -2;
		@Pc(257) int local257 = -2;
		@Pc(259) int local259 = -2;
		if (arg2.aString35 != null) {
			local253 = local63 - local47 / 2 - 5;
			local255 = local120;
			local257 = local253 + local47 + 10;
			local259 = local45 * Static408.aClass276_5.method7128() + local120 + 3;
			if (arg2.anInt3390 != 0) {
				arg0.method8815(local253, arg2.anInt3390, local257 - local253, local120, local259 - local120);
			}
			if (arg2.anInt3387 != 0) {
				arg0.method8814(arg2.anInt3387, local253, local120, local257 - local253, -local120 + local259);
			}
			for (@Pc(333) int local333 = 0; local333 < local45; local333++) {
				@Pc(339) String local339 = Static174.aStringArray30[local333];
				if (local45 - 1 > local333) {
					local339 = local339.substring(0, local339.length() - 4);
				}
				Static408.aClass276_5.method7124(arg0, local339, local63, local120, arg2.anInt3404);
				local120 += Static408.aClass276_5.method7128();
			}
		}
		if (arg2.anInt3413 == -1 && arg2.aString35 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(391) Class6_Sub31 local391 = new Class6_Sub31(arg1);
		local391.anInt6719 = local16 + local43;
		local391.anInt6722 = local40 + local16;
		local391.anInt6721 = local255;
		local391.anInt6728 = local257;
		local391.anInt6725 = local259;
		local391.anInt6729 = local253;
		local391.anInt6727 = local40 - local16;
		local391.anInt6720 = local43 - local16;
		Static485.aClass8_56.method157(local391);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method217(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static344.method5576(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static60.anInt1289; local29++) {
			@Pc(35) String local35 = Static123.aStringArray27[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static344.method5576(local35);
			if (local35 != null && local35.equals(local20)) {
				Static60.anInt1289--;
				for (@Pc(59) int local59 = local29; local59 < Static60.anInt1289; local59++) {
					Static123.aStringArray27[local59] = Static123.aStringArray27[local59 + 1];
					Static447.aStringArray56[local59] = Static447.aStringArray56[local59 + 1];
					Static253.anIntArray289[local59] = Static253.anIntArray289[local59 + 1];
					Static333.aStringArray67[local59] = Static333.aStringArray67[local59 + 1];
					Static208.anIntArray243[local59] = Static208.anIntArray243[local59 + 1];
					Static592.aBooleanArray54[local59] = Static592.aBooleanArray54[local59 + 1];
				}
				Static533.anInt9234 = Static320.anInt6118;
				@Pc(128) Class6_Sub9 local128 = Static560.method8089(Static391.aClass126_1, Static614.aClass208_95);
				local128.aClass6_Sub40_Sub2_1.method8589(Static583.method8194(arg0));
				local128.aClass6_Sub40_Sub2_1.method8551(arg0);
				Static263.method4681(local128);
				return;
			}
		}
	}
}
