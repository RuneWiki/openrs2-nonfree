import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "Lclient!mr;")
	public static final Class223 aClass223_42 = new Class223();

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Ljava/io/File;IZ)V")
	public static void method5977(@OriginalArg(0) File arg0) {
		if (Static351.anObject13 == null) {
			Static599.method8385();
		}
		try {
			@Pc(14) Class local14 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(35) Method local35 = local14.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local35.invoke(Static351.anObject13, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(55) Exception local55) {
			System.out.println("HeapDump error:");
			local55.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(BI)I")
	public static int method5978(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "([J[IBII)V")
	public static void method5979(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(10) int local10 = (arg2 + arg3) / 2;
		@Pc(12) int local12 = arg3;
		@Pc(16) long local16 = arg0[local10];
		arg0[local10] = arg0[arg2];
		arg0[arg2] = local16;
		@Pc(30) int local30 = arg1[local10];
		arg1[local10] = arg1[arg2];
		arg1[arg2] = local30;
		@Pc(48) int local48 = local16 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(50) int local50 = arg3; local50 < arg2; local50++) {
			if (local16 + (long) (local48 & local50) > arg0[local50]) {
				@Pc(68) long local68 = arg0[local50];
				arg0[local50] = arg0[local12];
				arg0[local12] = local68;
				@Pc(82) int local82 = arg1[local50];
				arg1[local50] = arg1[local12];
				arg1[local12++] = local82;
			}
		}
		arg0[arg2] = arg0[local12];
		arg0[local12] = local16;
		arg1[arg2] = arg1[local12];
		arg1[local12] = local30;
		method5979(arg0, arg1, local12 - 1, arg3);
		method5979(arg0, arg1, arg2, local12 + 1);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!al;III)V")
	public static void method5982(@OriginalArg(0) Class16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static401.aClass16ArrayArray1[arg1][arg2] = arg0;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(CI)Z")
	public static boolean method5983(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
