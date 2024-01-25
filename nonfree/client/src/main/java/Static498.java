import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!th", name = "m", descriptor = "Lclient!raa;")
	public static Class271 aClass271_1;

	@OriginalMember(owner = "client!th", name = "D", descriptor = "Lclient!he;")
	public static Class6_Sub19 aClass6_Sub19_2;

	@OriginalMember(owner = "client!th", name = "w", descriptor = "Lclient!fw;")
	public static final Class114 aClass114_11 = new Class114();

	@OriginalMember(owner = "client!th", name = "x", descriptor = "J")
	public static final long aLong219 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!th", name = "C", descriptor = "I")
	public static int anInt8676 = -1;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)Z")
	public static boolean method6894(@OriginalArg(0) int arg0) {
		Static132.anInt2509 = arg0 + 1 & 0xFFFF;
		Static356.aBoolean460 = true;
		return true;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IILclient!kw;I)V")
	public static void method6895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15_Sub2_Sub4_Sub1 arg2) {
		if (arg2.anInt8932 == arg1 && arg1 != -1) {
			@Pc(85) Class63 local85 = Static388.aClass324_2.method7265(arg1);
			@Pc(88) int local88 = local85.anInt1379;
			if (local88 == 1) {
				arg2.anInt8975 = 0;
				arg2.anInt8929 = 1;
				arg2.anInt8955 = arg0;
				arg2.anInt8944 = 0;
				arg2.anInt8969 = 0;
				Static32.method514(false, arg2.anInt8911, arg2.aByte98, local85, arg2.anInt8913, arg2.anInt8975);
			}
			if (local88 == 2) {
				arg2.anInt8969 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt8932 == -1 || Static388.aClass324_2.method7265(arg1).anInt1377 >= Static388.aClass324_2.method7265(arg2.anInt8932).anInt1377) {
			arg2.anInt8955 = arg0;
			arg2.anInt8929 = 1;
			arg2.anInt8969 = 0;
			arg2.anInt8975 = 0;
			arg2.anInt8944 = 0;
			arg2.anInt8932 = arg1;
			arg2.anInt8997 = arg2.anInt8998;
			if (arg2.anInt8932 != -1) {
				Static32.method514(false, arg2.anInt8911, arg2.aByte98, Static388.aClass324_2.method7265(arg2.anInt8932), arg2.anInt8913, arg2.anInt8975);
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I[Lclient!xa;)V")
	public static void method6896(@OriginalArg(1) Class71[] arg0) {
		Static223.anInt4110 = arg0.length;
		Static154.anIntArray283 = new int[Static223.anInt4110 + 10];
		Static241.aClass71Array29 = new Class71[Static223.anInt4110 + 10];
		Static596.method7721(arg0, 0, Static241.aClass71Array29, 0, Static223.anInt4110);
		for (@Pc(26) int local26 = 0; local26 < Static223.anInt4110; local26++) {
			Static154.anIntArray283[local26] = Static241.aClass71Array29[local26].a();
		}
		for (@Pc(45) int local45 = Static223.anInt4110; local45 < Static241.aClass71Array29.length; local45++) {
			Static154.anIntArray283[local45] = 12;
		}
	}
}
