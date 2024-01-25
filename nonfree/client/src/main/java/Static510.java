import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!vda", name = "L", descriptor = "Lclient!fm;")
	public static Class92 aClass92_2;

	@OriginalMember(owner = "client!vda", name = "B", descriptor = "Lclient!tf;")
	public static final Class279 aClass279_10 = new Class279();

	@OriginalMember(owner = "client!vda", name = "J", descriptor = "I")
	public static int anInt8899 = 0;

	@OriginalMember(owner = "client!vda", name = "M", descriptor = "I")
	public static final int anInt8901 = 52;

	@OriginalMember(owner = "client!vda", name = "g", descriptor = "(I)V")
	public static void method7311() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static400.aBooleanArray34[local3] = false;
		}
		Static99.anInt6726 = 0;
		Static515.anInt8982 = 0;
		Static305.anInt5998 = 1;
		Static443.anInt8112 = -1;
		Static418.anInt7807 = -1;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(BZII)I")
	public static int method7312(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub5 local8 = Static480.method7117(arg0, arg2);
		if (local8 == null) {
			return -1;
		} else if (arg1 >= 0 && local8.anIntArray120.length > arg1) {
			return local8.anIntArray120[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILclient!kr;B)V")
	public static void method7314(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub27_Sub1 arg1) {
		Static336.anInt6336 = 0;
		Static475.aBoolean634 = false;
		Static525.method7530(arg1);
		Static236.method1276(arg1);
		if (Static475.aBoolean634) {
			System.out.println("---endgpp---");
		}
		if (arg1.anInt9191 != arg0) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt9191 + " psize:" + arg0);
		}
	}
}
