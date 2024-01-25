import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!pi", name = "jb", descriptor = "F")
	public static float aFloat171;

	@OriginalMember(owner = "client!pi", name = "F", descriptor = "Lclient!rba;")
	public static final Class278 aClass278_12 = new Class278("", 13);

	@OriginalMember(owner = "client!pi", name = "bb", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_103 = new Class276(66, 6);

	@OriginalMember(owner = "client!pi", name = "nb", descriptor = "[I")
	public static final int[] anIntArray490 = new int[256];

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)Lclient!lga;")
	public static Class2_Sub4 method6578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class125 local7 = Static580.aClass125ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass2_Sub4_2;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!d;)V")
	public static void method6579(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
		Static224.aClass4Array3[arg0] = arg1;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!fd;I)Lclient!cca;")
	public static Class43_Sub1 method6581(@OriginalArg(0) Class3_Sub7 arg0) {
		return new Class43_Sub1(arg0.method6525(), arg0.method6525(), arg0.method6525(), arg0.method6525(), arg0.method6506(), arg0.method6506(), arg0.method6538());
	}
}
