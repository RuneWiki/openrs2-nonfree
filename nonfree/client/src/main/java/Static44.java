import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!co", name = "i", descriptor = "I")
	public static int anInt818;

	@OriginalMember(owner = "client!co", name = "p", descriptor = "Lclient!fh;")
	public static Class58 aClass58_21;

	@OriginalMember(owner = "client!co", name = "r", descriptor = "[I")
	public static int[] anIntArray59;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([SI[Ljava/lang/String;)V")
	public static void method714(@OriginalArg(0) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static236.method3689(arg1, arg1.length - 1, arg0, 0);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
	public static void method715() {
		Static189.aClass85_17 = new Class85(32);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method716(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static292.method4445(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(45) int local45 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(48) int local48;
			do {
				local48 = arg0.nextInt();
			} while (local48 >= local45);
			return Static221.method3575(local48, arg1);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZI)Lclient!jl;")
	public static Class4_Sub3_Sub13 method718(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub3_Sub13 local10 = (Class4_Sub3_Sub13) Static207.aClass40_13.method889((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static165.aClass58_73.method1372(arg0, 0);
		if (local21 == null || local21.length <= 1) {
			return null;
		} else {
			local10 = Static203.method3260(local21);
			Static207.aClass40_13.method888((long) arg0, local10);
			return local10;
		}
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V")
	public static void method719() {
		Static243.aClass114_28 = new Class114();
	}
}
