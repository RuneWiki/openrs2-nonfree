import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "Lclient!wt;")
	public static Class271 aClass271_1;

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
	public static int anInt5596;

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_162 = new Class102(36, 7);

	@OriginalMember(owner = "client!qp", name = "n", descriptor = "J")
	public static long aLong175 = -1L;

	@OriginalMember(owner = "client!qp", name = "o", descriptor = "S")
	public static short aShort63 = 256;

	@OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
	public static int anInt5597 = 0;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "([BB)[B")
	public static byte[] method4431(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub13 local8 = new Class2_Sub13(arg0);
		@Pc(17) int local17 = local8.method3580();
		@Pc(23) int local23 = local8.method3574();
		if (local23 < 0 || Static15.anInt196 != 0 && local23 > Static15.anInt196) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(90) byte[] local90 = new byte[local23];
			local8.method3598(local90, local23);
			return local90;
		} else {
			@Pc(48) int local48 = local8.method3574();
			if (local48 < 0 || Static15.anInt196 != 0 && Static15.anInt196 < local48) {
				throw new RuntimeException();
			}
			@Pc(68) byte[] local68 = new byte[local48];
			if (local17 == 1) {
				Static374.method4872(local68, local48, arg0, local23);
			} else {
				Static364.aClass191_1.method4224(local68, local8);
			}
			return local68;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIILclient!oi;I)V")
	public static void method4432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub37 arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg1 << 14 | arg0 << 28 | arg3);
		@Pc(22) Class2_Sub12 local22 = (Class2_Sub12) Static201.aClass72_21.method1659(local16);
		if (local22 == null) {
			local22 = new Class2_Sub12();
			Static201.aClass72_21.method1653(local22, local16);
			local22.aClass156_9.method3157(arg2);
			return;
		}
		@Pc(45) Class208 local45 = Static384.aClass164_2.method3458(arg2.anInt4632);
		@Pc(48) int local48 = local45.anInt5653;
		if (local45.anInt5678 == 1) {
			local48 *= arg2.anInt4634 + 1;
		}
		for (@Pc(65) Class2_Sub37 local65 = (Class2_Sub37) local22.aClass156_9.method3155(); local65 != null; local65 = (Class2_Sub37) local22.aClass156_9.method3150()) {
			local45 = Static384.aClass164_2.method3458(local65.anInt4632);
			@Pc(76) int local76 = local45.anInt5653;
			if (local45.anInt5678 == 1) {
				local76 *= local65.anInt4634 + 1;
			}
			if (local48 > local76) {
				Static457.method5715(arg2, local65);
				return;
			}
		}
		local22.aClass156_9.method3157(arg2);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZIB)I")
	public static int method4433(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub36 local8 = Static382.method4911(arg1, arg2);
		if (local8 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray396.length) {
			return local8.anIntArray396[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
	public static void method4434() {
		Static137.anInt6647 = 0;
		Static261.aClass156_13.method3161();
		Static126.aBoolean52 = false;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(BIII)I")
	public static int method4435(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > arg0) {
			return arg2;
		} else if (arg0 > arg1) {
			return arg1;
		} else {
			return arg0;
		}
	}
}
