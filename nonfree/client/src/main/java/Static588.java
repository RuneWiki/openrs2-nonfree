import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static588 {

	@OriginalMember(owner = "client!uw", name = "h", descriptor = "Lclient!kea;")
	public static final Class188 aClass188_15 = new Class188(1);

	@OriginalMember(owner = "client!uw", name = "m", descriptor = "[I")
	public static final int[] anIntArray654 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!eda;BZZ)V")
	public static void method8013(@OriginalArg(0) Class2_Sub9 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg0.anInt2171;
		@Pc(12) int local12 = (int) arg0.aLong280;
		arg0.method8653();
		if (arg2) {
			Static555.method7632(local8);
		}
		Static434.method5973(local8);
		@Pc(31) Class261 local31 = Static357.method4826(local12);
		if (local31 != null) {
			Static624.method8351(local31);
		}
		Static493.method6850();
		if (!arg1 && Static38.anInt777 != -1) {
			Static170.method7974(Static38.anInt777, 1);
		}
		@Pc(52) Class50 local52 = new Class50(Static606.aClass118_47);
		for (@Pc(57) Class2_Sub9 local57 = (Class2_Sub9) local52.method952(); local57 != null; local57 = (Class2_Sub9) local52.method953()) {
			if (!local57.method8652()) {
				local57 = (Class2_Sub9) local52.method952();
				if (local57 == null) {
					return;
				}
			}
			if (local57.anInt2172 == 3) {
				@Pc(79) int local79 = (int) local57.aLong280;
				if (local8 == local79 >>> 16) {
					method8013(local57, arg1, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(B[BZ)V")
	public static void method8018(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1) {
		if (Static355.aClass2_Sub22_9 == null) {
			Static355.aClass2_Sub22_9 = new Class2_Sub22(20000);
		}
		Static355.aClass2_Sub22_9.method8508(0, arg0.length, arg0);
		if (!arg1) {
			return;
		}
		Static466.method6312(Static355.aClass2_Sub22_9.aByteArray115);
		Static1.aClass89_Sub1Array6 = new Class89_Sub1[Static620.anInt9962];
		@Pc(39) int local39 = 0;
		for (@Pc(41) int local41 = Static169.anInt3008; local41 <= Static57.anInt1132; local41++) {
			@Pc(47) Class89_Sub1 local47 = Static56.method4530(local41);
			if (local47 != null) {
				Static1.aClass89_Sub1Array6[local39++] = local47;
			}
		}
		Static527.aBoolean651 = false;
		Static525.aLong170 = Static476.method6413();
		Static355.aClass2_Sub22_9 = null;
	}
}
