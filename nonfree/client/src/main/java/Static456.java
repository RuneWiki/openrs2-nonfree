import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!po", name = "h", descriptor = "Lclient!po;")
	public static final Class281 aClass281_1 = new Class281(0, 3, Static120.aClass89_11);

	@OriginalMember(owner = "client!po", name = "i", descriptor = "Lclient!po;")
	public static final Class281 aClass281_2 = new Class281(1, 3, Static120.aClass89_11);

	@OriginalMember(owner = "client!po", name = "j", descriptor = "Lclient!po;")
	public static final Class281 aClass281_3 = new Class281(2, 4, Static120.aClass89_7);

	@OriginalMember(owner = "client!po", name = "k", descriptor = "Lclient!po;")
	public static final Class281 aClass281_4 = new Class281(3, 1, Static120.aClass89_11);

	@OriginalMember(owner = "client!po", name = "l", descriptor = "Lclient!po;")
	public static final Class281 aClass281_5 = new Class281(4, 2, Static120.aClass89_11);

	@OriginalMember(owner = "client!po", name = "m", descriptor = "Lclient!po;")
	public static final Class281 aClass281_6 = new Class281(5, 3, Static120.aClass89_11);

	@OriginalMember(owner = "client!po", name = "n", descriptor = "Lclient!po;")
	public static final Class281 aClass281_7 = new Class281(6, 4, Static120.aClass89_11);

	@OriginalMember(owner = "client!po", name = "o", descriptor = "I")
	public static final int anInt7745 = Static139.method2419(16);

	@OriginalMember(owner = "client!po", name = "p", descriptor = "I")
	public static int anInt7746 = 0;

	@OriginalMember(owner = "client!po", name = "q", descriptor = "Lclient!fca;")
	public static final Class114 aClass114_53 = new Class114();

	@OriginalMember(owner = "client!po", name = "r", descriptor = "Lclient!gp;")
	public static final Class139 aClass139_7 = new Class139(0, 1);

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II)Lclient!po;")
	public static Class281 method6541(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return aClass281_1;
		} else if (arg0 == 1) {
			return aClass281_2;
		} else if (arg0 == 2) {
			return aClass281_3;
		} else if (arg0 == 3) {
			return aClass281_4;
		} else if (arg0 == 4) {
			return aClass281_5;
		} else if (arg0 == 5) {
			return aClass281_6;
		} else if (arg0 == 6) {
			return aClass281_7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BLclient!jha;IIB)V")
	public static void method6543(@OriginalArg(1) Class28_Sub1_Sub4_Sub2_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray308[0];
		@Pc(15) int local15 = arg0.anIntArray307[0];
		if (local10 < 0 || local10 >= Static201.anInt3834 || local15 < 0 || Static626.anInt10238 <= local15 || (arg1 < 0 || arg1 >= Static201.anInt3834 || arg2 < 0 || Static626.anInt10238 <= arg2)) {
			return;
		}
		@Pc(82) int local82 = Static131.method2371(local10, -4, 0, 0, Static306.anIntArray326, local15, arg1, 0, 0, arg2, arg0.method4599(), true, Static300.anIntArray565, Static275.aClass106Array1[arg0.aByte145]);
		if (local82 >= 1 && local82 <= 3) {
			for (@Pc(94) int local94 = 0; local94 < local82 - 1; local94++) {
				arg0.method4606(Static300.anIntArray565[local94], Static306.anIntArray326[local94], (byte) 2);
			}
		}
	}
}
