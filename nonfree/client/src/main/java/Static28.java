import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "Lclient!nk;")
	public static Class121 aClass121_14;

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
	public static int anInt497 = -1;

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "[I")
	public static int[] anIntArray28 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
	public static int anInt502 = 0;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!qb;Lclient!oe;I)Lclient!wb;")
	public static Class1_Sub31 method462(@OriginalArg(0) Class142 arg0, @OriginalArg(1) Class128 arg1) {
		@Pc(31) long local31 = (long) ((arg1.anInt3874 + 1 << 16) + arg1.anInt3870) + ((long) arg1.anInt3869 << 32) + ((long) arg1.anInt3873 << 56);
		@Pc(37) Class1_Sub31 local37 = (Class1_Sub31) arg0.method3543(local31);
		if (local37 == null) {
			local37 = new Class1_Sub31(arg1.anInt3874, (float) arg1.anInt3870, true, false, arg1.anInt3869);
			arg0.method3537(local37, local31);
		}
		return local37;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IJ)V")
	public static void method463(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static72.anInt5402; local12++) {
			if (arg0 == Static29.aLongArray3[local12]) {
				Static72.anInt5402--;
				for (@Pc(31) int local31 = local12; local31 < Static72.anInt5402; local31++) {
					Static29.aLongArray3[local31] = Static29.aLongArray3[local31 + 1];
					Static314.aStringArray2[local31] = Static314.aStringArray2[local31 + 1];
					Static279.aBooleanArray22[local31] = Static279.aBooleanArray22[local31 + 1];
				}
				Static70.anInt1491 = Static86.anInt1698;
				Static127.aClass1_Sub14_Sub1_3.method1408(28);
				Static127.aClass1_Sub14_Sub1_3.method1374(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
	public static void method464() {
		@Pc(2) Class54 local2 = Static133.aClass54_1;
		synchronized (Static133.aClass54_1) {
			Static281.anInt5089 = Static51.anInt1019;
			Static21.anInt387++;
			Static247.anInt4467 = Static302.anInt5358;
			Static222.anInt4105 = Static256.anInt4633;
			Static83.anInt1652 = Static29.anInt511;
			Static238.anInt4321 = Static50.anInt1010;
			Static282.anInt5092 = Static208.anInt3972;
			Static307.aLong206 = Static259.aLong173;
			Static29.anInt511 = 0;
		}
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
	public static void method465() {
		Static46.aClass187_25.method4525();
	}
}
