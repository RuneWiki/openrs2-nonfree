import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!ri", name = "u", descriptor = "Lclient!il;")
	public static Class86 aClass86_29;

	@OriginalMember(owner = "client!ri", name = "A", descriptor = "[Lclient!el;")
	public static Class45[] aClass45Array3;

	@OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
	public static int anInt4493 = 0;

	@OriginalMember(owner = "client!ri", name = "w", descriptor = "Lclient!ui;")
	public static Class175 aClass175_36 = new Class175(64);

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)[Lclient!lj;")
	public static Class1_Sub5_Sub6[] method3848() {
		@Pc(13) Class1_Sub5_Sub6[] local13 = new Class1_Sub5_Sub6[Static48.anInt1075];
		for (@Pc(15) int local15 = 0; local15 < Static48.anInt1075; local15++) {
			@Pc(26) byte[] local26 = Static25.aByteArrayArray19[local15];
			@Pc(34) int local34 = Static206.anIntArray419[local15] * Static69.anIntArray119[local15];
			@Pc(37) int[] local37 = new int[local34];
			for (@Pc(39) int local39 = 0; local39 < local34; local39++) {
				local37[local39] = Static5.anIntArray17[local26[local39] & 0xFF];
			}
			if (Static71.aBoolean165) {
				local13[local15] = new Class1_Sub5_Sub6_Sub2(Static94.anInt1976, Static222.anInt4184, Static192.anIntArray398[local15], Static173.anIntArray353[local15], Static69.anIntArray119[local15], Static206.anIntArray419[local15], local37);
			} else {
				local13[local15] = new Class1_Sub5_Sub6_Sub1(Static94.anInt1976, Static222.anInt4184, Static192.anIntArray398[local15], Static173.anIntArray353[local15], Static69.anIntArray119[local15], Static206.anIntArray419[local15], local37);
			}
		}
		Static176.method3009();
		return local13;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BC)C")
	public static char method3849(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
