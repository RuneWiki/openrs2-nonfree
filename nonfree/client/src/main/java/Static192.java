import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!gr", name = "q", descriptor = "I")
	public static int anInt3594;

	@OriginalMember(owner = "client!gr", name = "r", descriptor = "I")
	public static int anInt3595;

	@OriginalMember(owner = "client!gr", name = "z", descriptor = "F")
	public static float aFloat76;

	@OriginalMember(owner = "client!gr", name = "t", descriptor = "[I")
	public static final int[] anIntArray211 = new int[50];

	@OriginalMember(owner = "client!gr", name = "v", descriptor = "Lclient!st;")
	public static final Class314 aClass314_65 = new Class314(25, 7);

	@OriginalMember(owner = "client!gr", name = "w", descriptor = "I")
	public static int anInt3598 = 0;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIILclient!uu;)Lclient!de;")
	public static Class3_Sub7_Sub6 method3080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class343 arg2) {
		@Pc(19) Class3_Sub9 local19 = new Class3_Sub9(arg2.method8132(arg1, arg0));
		@Pc(54) Class3_Sub7_Sub6 local54 = new Class3_Sub7_Sub6(arg0, local19.method5607(), local19.method5607(), local19.method5585(), local19.method5585(), local19.method5633() == 1, local19.method5633(), local19.method5633());
		@Pc(58) int local58 = local19.method5633();
		for (@Pc(60) int local60 = 0; local60 < local58; local60++) {
			local54.aClass216_10.method5449(new Class3_Sub24(local19.method5633(), local19.method5610(), local19.method5610(), local19.method5610(), local19.method5610(), local19.method5610(), local19.method5610(), local19.method5610(), local19.method5610()));
		}
		local54.method1571();
		return local54;
	}
}
