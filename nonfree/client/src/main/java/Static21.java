import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!av", name = "t", descriptor = "[I")
	public static int[] anIntArray46;

	@OriginalMember(owner = "client!av", name = "H", descriptor = "F")
	public static float aFloat10;

	@OriginalMember(owner = "client!av", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString4 = "";

	@OriginalMember(owner = "client!av", name = "z", descriptor = "I")
	public static int anInt631 = 2;

	@OriginalMember(owner = "client!av", name = "C", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_23 = new Class92(79, 16);

	@OriginalMember(owner = "client!av", name = "G", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_24 = new Class175("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!av", name = "I", descriptor = "[I")
	public static final int[] anIntArray47 = new int[5];

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(III)V")
	public static void method587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static151.aClass217ArrayArrayArray3[0][arg1][arg2] != null && Static151.aClass217ArrayArrayArray3[0][arg1][arg2].aClass217_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static151.aClass217ArrayArrayArray3[local22][arg1][arg2] == null) {
				@Pc(46) Class217 local46 = Static151.aClass217ArrayArrayArray3[local22][arg1][arg2] = new Class217(local22, arg1, arg2);
				if (local20) {
					local46.aByte93++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(BIILclient!ib;I)V")
	public static void method589(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub22 arg2, @OriginalArg(4) int arg3) {
		@Pc(14) long local14 = (long) (arg1 | arg0 << 14 | arg3 << 28);
		@Pc(20) Class3_Sub44 local20 = (Class3_Sub44) Static157.aClass127_15.method3246(local14);
		if (local20 == null) {
			local20 = new Class3_Sub44();
			Static157.aClass127_15.method3257(local14, local20);
			local20.aClass229_46.method5321(arg2);
			return;
		}
		@Pc(48) Class191 local48 = Static89.aClass157_1.method3832(arg2.anInt3545);
		@Pc(51) int local51 = local48.anInt5805;
		if (local48.anInt5837 == 1) {
			local51 *= arg2.anInt3542 + 1;
		}
		for (@Pc(68) Class3_Sub22 local68 = (Class3_Sub22) local20.aClass229_46.method5328(); local68 != null; local68 = (Class3_Sub22) local20.aClass229_46.method5325()) {
			local48 = Static89.aClass157_1.method3832(local68.anInt3545);
			@Pc(78) int local78 = local48.anInt5805;
			if (local48.anInt5837 == 1) {
				local78 *= local68.anInt3542 + 1;
			}
			if (local51 > local78) {
				Static359.method5093(local68, arg2);
				return;
			}
		}
		local20.aClass229_46.method5321(arg2);
	}

	@OriginalMember(owner = "client!av", name = "f", descriptor = "(I)V")
	public static void method591() {
		if (Static97.aBoolean164) {
			return;
		}
		Static189.aBoolean300 = true;
		Static97.aBoolean164 = true;
		if (Static123.aClass21_Sub1_1.aBoolean72) {
			Static235.aFloat60 = (int) Static235.aFloat60 - 65 & 0xFFFFFF80;
		} else {
			Static393.aFloat92 += (-24.0F - Static393.aFloat92) / 2.0F;
		}
	}
}
