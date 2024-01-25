import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
	public static int anInt6291;

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "Lclient!ir;")
	public static Class110 aClass110_7;

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
	public static int anInt6290 = 0;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5465(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) byte local13 = 2;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(21) char local21 = arg0.charAt(local15);
			if (local13 == 0) {
				local21 = Character.toLowerCase(local21);
			} else if (local13 == 2 || Character.isUpperCase(local21)) {
				local21 = Static356.method5237(local21);
			}
			if (Character.isLetter(local21)) {
				local13 = 0;
			} else if (local21 == '.' || local21 == '?' || local21 == '!') {
				local13 = 2;
			} else if (!Character.isSpaceChar(local21)) {
				local13 = 1;
			} else if (local13 != 2) {
				local13 = 1;
			}
			local11[local15] = local21;
		}
		return new String(local11);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(BLclient!kk;)Lclient!dr;")
	public static Class53 method5467(@OriginalArg(1) Class2_Sub16 arg0) {
		@Pc(14) Class53 local14 = new Class53();
		local14.anInt1274 = arg0.method5312();
		local14.aClass2_Sub10_Sub6_1 = Static3.method74(local14.anInt1274);
		return local14;
	}
}
