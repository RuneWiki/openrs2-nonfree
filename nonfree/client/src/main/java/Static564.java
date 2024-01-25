import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static564 {

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray72 = new String[100];

	@OriginalMember(owner = "client!tba", name = "d", descriptor = "I")
	public static int anInt9878 = 1;

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IZI)Lclient!hga;")
	public static Class23_Sub6 method8406(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) Class105[] local12 = Class328.aClass105Array1;
		synchronized (Class328.aClass105Array1) {
			@Pc(31) Class23_Sub6 local31;
			if (Class328.aClass105Array1.length <= arg0 || Class328.aClass105Array1[arg0].method2440()) {
				local31 = new Class23_Sub6();
				local31.aClass23_Sub4Array1 = new Class23_Sub4[arg0];
				for (@Pc(53) int local53 = 0; local53 < arg0; local53++) {
					local31.aClass23_Sub4Array1[local53] = new Class23_Sub4();
				}
			} else {
				local31 = (Class23_Sub6) Class328.aClass105Array1[arg0].method2441();
				local31.method8588();
				@Pc(38) int local38 = Static176.anIntArray230[arg0]--;
			}
			local31.aBoolean307 = arg1;
			return local31;
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(III)B")
	public static byte method8410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIILclient!kh;)V")
	public static void method8415(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class208 arg2) {
		if (Static329.aBoolean166) {
			@Pc(18) Class328 local18 = Static104.anInt2203 == -1 ? null : Static145.aClass165_1.method3812(Static104.anInt2203);
			if (Static82.method1754(arg2).method37() && (Static7.anInt94 & 0x20) != 0 && (local18 == null || arg2.method4727(Static104.anInt2203, local18.anInt8911) != local18.anInt8911)) {
				Static225.method3514(true, false, arg2.anInt5645, Static158.anInt2968, arg2.anInt5653, 0L, Static542.aString107 + " -> " + arg2.aString70, 2, Static46.aString12, (long) (arg2.anInt5608 << 0 | arg2.anInt5653), false, arg2.anInt5608);
			}
		}
		@Pc(96) String local96;
		for (@Pc(89) int local89 = 9; local89 >= 5; local89--) {
			local96 = Static373.method5516(local89, arg2);
			if (local96 != null) {
				Static225.method3514(true, false, arg2.anInt5645, Static667.method8673(local89, arg2), arg2.anInt5653, (long) (local89 + 1), arg2.aString70, 1001, local96, (long) (arg2.anInt5653 | arg2.anInt5608 << 0), false, arg2.anInt5608);
			}
		}
		local96 = Static630.method8308(arg2);
		if (local96 != null) {
			Static225.method3514(true, false, arg2.anInt5645, arg2.anInt5667, arg2.anInt5653, 0L, arg2.aString70, 8, local96, (long) (arg2.anInt5608 << 0 | arg2.anInt5653), false, arg2.anInt5608);
		}
		for (@Pc(179) int local179 = 4; local179 >= 0; local179--) {
			@Pc(188) String local188 = Static373.method5516(local179, arg2);
			if (local188 != null) {
				Static225.method3514(true, false, arg2.anInt5645, Static667.method8673(local179, arg2), arg2.anInt5653, (long) (local179 + 1), arg2.aString70, 23, local188, (long) (arg2.anInt5608 << 0 | arg2.anInt5653), false, arg2.anInt5608);
			}
		}
		if (!Static82.method1754(arg2).method35()) {
			return;
		}
		if (arg2.aString67 == null) {
			Static225.method3514(true, false, arg2.anInt5645, -1, arg2.anInt5653, 0L, "", 6, Static569.aClass335_10.method7694(Static319.anInt5939), (long) (arg2.anInt5653 | arg2.anInt5608 << 0), false, arg2.anInt5608);
		} else {
			Static225.method3514(true, false, arg2.anInt5645, -1, arg2.anInt5653, 0L, "", 6, arg2.aString67, (long) (arg2.anInt5608 << 0 | arg2.anInt5653), false, arg2.anInt5608);
		}
	}
}
