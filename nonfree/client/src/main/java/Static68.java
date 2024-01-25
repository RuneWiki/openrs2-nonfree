import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
	public static int anInt1012;

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "[I")
	public static final int[] anIntArray50 = new int[13];

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIB)Z")
	public static boolean method928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(JZ)I")
	public static int method929(@OriginalArg(0) long arg0) {
		Static493.method7070(arg0);
		return Static158.aCalendar2.get(1);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLclient!lfa;ZZ)V")
	public static void method931(@OriginalArg(1) Class5_Sub39 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(6) int local6 = arg0.anInt6238;
		@Pc(10) int local10 = (int) arg0.aLong307;
		arg0.method9052();
		if (arg1) {
			Static23.method296(local6);
		}
		Static34.method491(local6);
		@Pc(25) Class345 local25 = Static264.method4120(local10);
		if (local25 != null) {
			Static211.method3351(local25);
		}
		Static588.method8085();
		if (!arg2 && Static84.anInt2018 != -1) {
			Static162.method2876(Static84.anInt2018, 1);
		}
		@Pc(46) Class202 local46 = new Class202(Static452.aClass300_33);
		for (@Pc(51) Class5_Sub39 local51 = (Class5_Sub39) local46.method5025(); local51 != null; local51 = (Class5_Sub39) local46.method5027()) {
			if (!local51.method9048()) {
				local51 = (Class5_Sub39) local46.method5025();
				if (local51 == null) {
					break;
				}
			}
			if (local51.anInt6236 == 3) {
				@Pc(74) int local74 = (int) local51.aLong307;
				if (local74 >>> 16 == local6) {
					method931(local51, true, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/Object;III)[B")
	public static byte[] method933(@OriginalArg(0) Object arg0, @OriginalArg(3) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return Static640.method8650(arg1, local18);
		} else if (arg0 instanceof Class17) {
			@Pc(30) Class17 local30 = (Class17) arg0;
			return local30.method7121(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
