import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
	public static int anInt1777 = 0;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "[S")
	private static final short[] aShortArray36 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "[S")
	private static final short[] aShortArray38 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "[S")
	private static final short[] aShortArray39 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "[S")
	private static final short[] aShortArray37 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "[[S")
	public static final short[][] aShortArrayArray1 = new short[][] { aShortArray36, aShortArray38, aShortArray39, aShortArray37 };

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "F")
	public static float aFloat22 = 0.0F;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!li;)V")
	public static void method1649(@OriginalArg(1) Class5_Sub4_Sub14 arg0) {
		if (Static251.aBoolean343) {
			return;
		}
		arg0.method8911();
		Static642.anInt10370--;
		if (!arg0.aBoolean472) {
			@Pc(85) long local85 = arg0.aLong164;
			@Pc(91) Class5_Sub4_Sub6 local91;
			for (local91 = (Class5_Sub4_Sub6) Static28.aClass81_7.method1599(local85); local91 != null && !local91.aString36.equals(arg0.aString91); local91 = (Class5_Sub4_Sub6) Static28.aClass81_7.method1605()) {
			}
			if (local91 != null && local91.method2114(arg0)) {
				Static153.method2233(local91);
			}
			return;
		}
		for (@Pc(30) Class5_Sub4_Sub6 local30 = (Class5_Sub4_Sub6) Static616.aClass80_12.method1538(); local30 != null; local30 = (Class5_Sub4_Sub6) Static616.aClass80_12.method1536()) {
			if (local30.aString36.equals(arg0.aString91)) {
				@Pc(40) boolean local40 = false;
				for (@Pc(46) Class5_Sub4_Sub14 local46 = (Class5_Sub4_Sub14) local30.aClass80_3.method1538(); local46 != null; local46 = (Class5_Sub4_Sub14) local30.aClass80_3.method1536()) {
					if (arg0 == local46) {
						local40 = true;
						if (local30.method2114(arg0)) {
							Static153.method2233(local30);
						}
						break;
					}
				}
				if (local40) {
					return;
				}
			}
		}
	}
}
