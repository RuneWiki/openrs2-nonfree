import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
	public static int anInt1042;

	@OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
	public static int anInt1046;

	@OriginalMember(owner = "client!ei", name = "F", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_498 = Static193.method3027("Mitglieder)2Welt");

	@OriginalMember(owner = "client!ei", name = "J", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_499 = Static193.method3027("k");

	@OriginalMember(owner = "client!ei", name = "M", descriptor = "Z")
	public static boolean aBoolean66 = false;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(SILclient!oc;ILclient!oc;JI)V")
	public static void method784(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class70 arg2, @OriginalArg(4) Class70 arg3, @OriginalArg(5) long arg4, @OriginalArg(6) int arg5) {
		if (Static134.aBoolean131 || Static35.anInt770 >= 500) {
			return;
		}
		Static136.aClass70Array48[Static35.anInt770] = arg2;
		Static49.aClass70Array21[Static35.anInt770] = arg3;
		Static55.aShortArray13[Static35.anInt770] = arg0;
		Static95.aLongArray3[Static35.anInt770] = arg4;
		Static155.anIntArray233[Static35.anInt770] = arg1;
		Static175.anIntArray293[Static35.anInt770] = arg5;
		Static35.anInt770++;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILclient!kh;Lclient!cg;I)V")
	public static void method785(@OriginalArg(0) int arg0, @OriginalArg(1) Class52_Sub1 arg1, @OriginalArg(2) Class18 arg2) {
		@Pc(7) Class3_Sub17 local7 = new Class3_Sub17();
		local7.aClass18_2 = arg2;
		local7.anInt2109 = 1;
		local7.aClass52_Sub1_16 = arg1;
		local7.aLong147 = arg0;
		@Pc(30) Class10 local30 = Static155.aClass10_87;
		synchronized (Static155.aClass10_87) {
			Static155.aClass10_87.method261(local7);
		}
		Static71.method1031();
	}
}
