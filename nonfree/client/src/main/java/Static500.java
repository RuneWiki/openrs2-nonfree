import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
	public static int anInt8135;

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
	public static int anInt8131 = -1;

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "[I")
	public static final int[] anIntArray573 = new int[13];

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "Z")
	public static boolean aBoolean612 = false;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZILclient!wu;I)Lclient!fl;")
	public static Class2_Sub2_Sub9 method6904(@OriginalArg(1) int arg0, @OriginalArg(2) Class380 arg1, @OriginalArg(3) int arg2) {
		@Pc(19) Class2_Sub22 local19 = new Class2_Sub22(arg1.method8620(arg2, arg0));
		@Pc(50) Class2_Sub2_Sub9 local50 = new Class2_Sub2_Sub9(arg0, local19.method8549(), local19.method8549(), local19.method8542(), local19.method8542(), local19.method8547() == 1, local19.method8547(), local19.method8547());
		@Pc(54) int local54 = local19.method8547();
		for (@Pc(56) int local56 = 0; local56 < local54; local56++) {
			local50.aClass109_26.method2323(new Class2_Sub36(local19.method8547(), local19.method8546(), local19.method8546(), local19.method8546(), local19.method8546(), local19.method8546(), local19.method8546(), local19.method8546(), local19.method8546()));
		}
		local50.method2429();
		return local50;
	}

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(I)I")
	public static int method6906() {
		return Static504.anInt8146;
	}
}
