import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "Z")
	public static boolean aBoolean463;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILclient!oh;B)Lclient!dba;")
	public static Class8_Sub5_Sub4 method5467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2) {
		@Pc(14) Class8_Sub8 local14 = new Class8_Sub8(arg2.method6314(arg0, arg1));
		@Pc(49) Class8_Sub5_Sub4 local49 = new Class8_Sub5_Sub4(arg1, local14.method8570(), local14.method8570(), local14.method8540(), local14.method8540(), local14.method8525() == 1, local14.method8525(), local14.method8525());
		@Pc(53) int local53 = local14.method8525();
		for (@Pc(55) int local55 = 0; local55 < local53; local55++) {
			local49.aClass43_18.method1424(new Class8_Sub14(local14.method8525(), local14.method8578(), local14.method8578(), local14.method8578(), local14.method8578(), local14.method8578(), local14.method8578(), local14.method8578(), local14.method8578()));
		}
		local49.method2128();
		return local49;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method5468(@OriginalArg(0) String arg0) {
		return Static585.aHashtable7.containsKey(arg0);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)Z")
	public static boolean method5469(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZIZIII)V")
	public static void method5470(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 ? Static155.aClass8_Sub25_6.aClass36_Sub6_4.method3331() : Static155.aClass8_Sub25_6.aClass36_Sub6_1.method3331()) != 0 && arg2 != 0 && Static55.anInt1863 < 50 && arg4 != -1) {
			Static63.aClass230Array1[Static55.anInt1863++] = new Class230((byte) (arg1 ? 3 : 2), arg4, arg2, arg0, arg5, 0, arg3, null);
		}
	}
}
