import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
	public static int anInt4063;

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_50 = new Class44(33, 11);

	@OriginalMember(owner = "client!kn", name = "o", descriptor = "[I")
	public static final int[] anIntArray263 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)I")
	public static int method3258() {
		return 16;
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(B)V")
	public static void method3261() {
		@Pc(15) Class224 local15 = null;
		try {
			@Pc(20) Class128 local20 = Static303.aClass131_4.method3058("2");
			while (local20.anInt3727 == 0) {
				Static443.method5991(1L);
			}
			if (local20.anInt3727 == 1) {
				local15 = (Class224) local20.anObject4;
				@Pc(46) Class2_Sub20 local46 = new Class2_Sub20(Static403.anInt7008 * 6 + 3);
				local46.method3699(1);
				local46.method3745(Static403.anInt7008);
				for (@Pc(56) int local56 = 0; local56 < Static299.anIntArray357.length; local56++) {
					if (Static381.aBooleanArray48[local56]) {
						local46.method3745(local56);
						local46.method3713(Static299.anIntArray357[local56]);
					}
				}
				local15.method5140(0, local46.aByteArray136, local46.anInt4608);
			}
		} catch (@Pc(91) Exception local91) {
		}
		try {
			if (local15 != null) {
				local15.method5141();
			}
		} catch (@Pc(98) Exception local98) {
		}
		Static256.aLong143 = Static208.method3182();
		Static442.aBoolean663 = false;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILclient!md;)Lclient!qk;")
	public static Class2_Sub1 method3262(@OriginalArg(1) Class2_Sub20 arg0) {
		arg0.method3737();
		@Pc(15) int local15 = arg0.method3737();
		@Pc(19) Class2_Sub1 local19 = Static12.method216(local15);
		local19.anInt7781 = arg0.method3737();
		@Pc(28) int local28 = arg0.method3737();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(36) int local36 = arg0.method3737();
			local19.method6039(local36, arg0);
		}
		local19.method6034();
		return local19;
	}
}
