import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!na", name = "N", descriptor = "Lclient!ln;")
	public static Class2_Sub2_Sub3 aClass2_Sub2_Sub3_2;

	@OriginalMember(owner = "client!na", name = "P", descriptor = "[[Lclient!ms;")
	public static Class155[][] aClass155ArrayArray1;

	@OriginalMember(owner = "client!na", name = "S", descriptor = "Lclient!fl;")
	public static final Class75 aClass75_1 = new Class75("WIP", 2);

	@OriginalMember(owner = "client!na", name = "X", descriptor = "Lclient!ll;")
	public static final Class143 aClass143_20 = new Class143("WTWIP", 3);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!jr;)V")
	public static void method3796(@OriginalArg(1) Class2_Sub22 arg0) {
		if (Static297.aClass227ArrayArrayArray7 == null) {
			return;
		}
		@Pc(8) Interface11 local8 = null;
		if (arg0.anInt3089 == 0) {
			local8 = (Interface11) Static252.method4000(arg0.anInt3088, arg0.anInt3082, arg0.anInt3087);
		}
		if (arg0.anInt3089 == 1) {
			local8 = (Interface11) Static221.method3733(arg0.anInt3088, arg0.anInt3082, arg0.anInt3087);
		}
		if (arg0.anInt3089 == 2) {
			local8 = (Interface11) Static86.method4712(arg0.anInt3088, arg0.anInt3082, arg0.anInt3087, wk.class);
		}
		if (arg0.anInt3089 == 3) {
			local8 = (Interface11) Static240.method3889(arg0.anInt3088, arg0.anInt3082, arg0.anInt3087);
		}
		if (local8 == null) {
			arg0.anInt3080 = -1;
			arg0.anInt3091 = 0;
			arg0.anInt3092 = 0;
		} else {
			arg0.anInt3080 = local8.method5025();
			arg0.anInt3091 = local8.method5027();
			arg0.anInt3092 = local8.method5024();
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V")
	public static void method3797() {
		@Pc(5) Class154 local5 = Static285.aClass154_38;
		synchronized (Static285.aClass154_38) {
			Static285.aClass154_38.method3758(5);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method3798(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static244.anInt1014; local16++) {
			if (arg0.equalsIgnoreCase(Static340.aStringArray38[local16])) {
				return local16;
			}
		}
		return -1;
	}
}
