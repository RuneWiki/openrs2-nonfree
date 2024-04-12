import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class2_Sub2_Sub14 extends Class2_Sub2 {

	@OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
	public static int anInt2061 = 0;

	@OriginalMember(owner = "client!sb", name = "fb", descriptor = "I")
	public static int anInt2066 = 0;

	@OriginalMember(owner = "client!sb", name = "cb", descriptor = "Lclient!o;")
	public static Class40 aClass40_600 = Static12.method257("Last password change:*6n@gre@Never changed");

	@OriginalMember(owner = "client!sb", name = "gb", descriptor = "Lclient!o;")
	public static Class40 aClass40_601 = null;

	@OriginalMember(owner = "client!sb", name = "ab", descriptor = "[Lclient!jb;")
	public final Class28[] aClass28Array1;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)Z", line = 158)
	public boolean method1403(@OriginalArg(1) int arg0) {
		return this.aClass28Array1[arg0].aBoolean88;
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!ud;Lclient!ud;IZ)V", line = 205)
	public Class2_Sub2_Sub14(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class44 local7 = new Class44();
		@Pc(12) int local12 = arg0.method76(arg2);
		this.aClass28Array1 = new Class28[local12];
		@Pc(21) int[] local21 = arg0.method81(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method68(local21[local23], arg2);
			@Pc(47) int local47 = (local33[0] & 0xFF) << 8 | local33[1] & 0xFF;
			@Pc(49) Class2_Sub5 local49 = null;
			for (@Pc(54) Class2_Sub5 local54 = (Class2_Sub5) local7.method1224(); local54 != null; local54 = (Class2_Sub5) local7.method1231()) {
				if (local54.anInt738 == local47) {
					local49 = local54;
					break;
				}
			}
			if (local49 == null) {
				@Pc(80) byte[] local80 = arg1.method60(local47, 0);
				local49 = new Class2_Sub5(local47, local80);
				local7.method1221(local49);
			}
			this.aClass28Array1[local21[local23]] = new Class28(local33, local49);
		}
	}
}
