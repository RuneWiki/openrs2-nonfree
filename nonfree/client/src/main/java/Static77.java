import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
	public static int anInt2283 = 0;

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "Lclient!eh;")
	private static Class28 aClass28_695 = Static170.method3101("button near the top of that page)3");

	@OriginalMember(owner = "client!jg", name = "v", descriptor = "Lclient!eh;")
	public static Class28 aClass28_696 = Static170.method3101("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
	public static int anInt2284 = 0;

	@OriginalMember(owner = "client!jg", name = "z", descriptor = "Lclient!eh;")
	private static Class28 aClass28_697 = Static170.method3101("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!jg", name = "B", descriptor = "[I")
	public static int[] anIntArray370 = new int[256];

	@OriginalMember(owner = "client!jg", name = "C", descriptor = "Lclient!eh;")
	public static Class28 aClass28_698 = aClass28_697;

	@OriginalMember(owner = "client!jg", name = "E", descriptor = "Lclient!eh;")
	public static Class28 aClass28_699 = aClass28_695;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(III)V")
	public static void method1749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static163.aBoolean187 = true;
		Static55.anInt1552 = arg0;
		Static181.anInt4285 = arg1;
		Static166.anInt4029 = arg2;
		Static94.anInt2609 = -1;
		Static17.anInt512 = -1;
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
	public static void method1750() {
		aClass28_699 = null;
		aClass28_698 = null;
		anIntArray370 = null;
		aClass28_695 = null;
		aClass28_696 = null;
		aClass28_697 = null;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZBI)Lclient!eh;")
	public static Class28 method1751(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(24) int local24 = arg0 / 10;
		@Pc(26) int local26 = 1;
		while (local24 != 0) {
			local26++;
			local24 /= 10;
		}
		@Pc(43) int local43 = local26;
		if (arg0 < 0 || arg1) {
			local43 = local26 + 1;
		}
		@Pc(51) byte[] local51 = new byte[local43];
		if (arg0 < 0) {
			local51[0] = 45;
		} else if (arg1) {
			local51[0] = 43;
		}
		for (@Pc(69) int local69 = 0; local69 < local26; local69++) {
			@Pc(74) int local74 = arg0 % 10;
			if (local74 < 0) {
				local74 = -local74;
			}
			if (local74 > 9) {
				local74 += 39;
			}
			local51[local43 - local69 - 1] = (byte) (local74 + 48);
			arg0 /= 10;
		}
		@Pc(112) Class28 local112 = new Class28();
		local112.anInt1118 = local43;
		local112.aByteArray15 = local51;
		return local112;
	}
}
