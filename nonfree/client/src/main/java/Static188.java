import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
	public static int anInt4006;

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "Lclient!tk;")
	public static final Class2_Sub40 aClass2_Sub40_2 = new Class2_Sub40(0, 0);

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
	public static int anInt4005 = -1;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!hb;Ljava/lang/String;IIIILclient!th;IILclient!sj;Lclient!on;I)V")
	public static void method3699(@OriginalArg(0) Class77 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class188 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class37 arg8, @OriginalArg(10) Class146 arg9, @OriginalArg(11) int arg10) {
		@Pc(14) int local14;
		if (Static182.anInt3602 == 4) {
			local14 = (int) Static92.aFloat28 & 0x3FFF;
		} else {
			local14 = (int) Static92.aFloat28 + Static256.anInt5068 & 0x3FFF;
		}
		@Pc(33) int local33 = Math.max(arg9.anInt4468 / 2, arg9.anInt4414 / 2) + 10;
		@Pc(41) int local41 = arg3 * arg3 + arg10 * arg10;
		if (local33 * local33 < local41) {
			return;
		}
		@Pc(51) int local51 = Class24.anIntArray35[local14];
		@Pc(55) int local55 = Class24.anIntArray36[local14];
		if (Static182.anInt3602 != 4) {
			local55 = local55 * 256 / (Static331.anInt3201 + 256);
			local51 = local51 * 256 / (Static331.anInt3201 + 256);
		}
		@Pc(84) int local84 = arg3 * local55 + arg10 * local51 >> 15;
		@Pc(94) int local94 = arg10 * local55 - arg3 * local51 >> 15;
		@Pc(101) int local101 = arg5.method5315(null, arg1, 100);
		@Pc(107) int local107 = local84 - local101 / 2;
		@Pc(115) int local115 = arg5.method5311(null, arg1);
		if (local107 >= -arg9.anInt4468 && local107 <= arg9.anInt4468 && -arg9.anInt4414 <= local94 && local94 <= arg9.anInt4414) {
			arg8.method5251(arg9.anInt4468 / 2 + arg2 + local107, arg0, 50, arg6, arg9.anInt4414 / 2 + arg6 - local115 - arg4 - local94, 0, null, null, 0, arg2, arg7, local101, arg1, 0, 1);
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method3700(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static12.method427(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(37) int local37 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(48) int local48;
			do {
				local48 = arg0.nextInt();
			} while (local37 <= local48);
			return Static301.method4607(arg1, local48);
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
	public static void method3702() {
		@Pc(5) Class119 local5 = Static153.aClass119_97;
		synchronized (Static153.aClass119_97) {
			Static153.aClass119_97.method3312();
		}
		@Pc(26) Class119 local26 = Static218.aClass119_129;
		synchronized (Static218.aClass119_129) {
			Static218.aClass119_129.method3312();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!fs;ZLclient!fs;)V")
	public static void method3703(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0.aClass2_Sub11_61 != null) {
			arg0.method5914();
		}
		arg0.aClass2_Sub11_61 = arg1;
		arg0.aClass2_Sub11_62 = arg1.aClass2_Sub11_62;
		arg0.aClass2_Sub11_61.aClass2_Sub11_62 = arg0;
		arg0.aClass2_Sub11_62.aClass2_Sub11_61 = arg0;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!ae;)V")
	public static void method3704(@OriginalArg(1) Class4 arg0) {
		if (Static97.aBoolean602) {
			Static316.method5556(arg0);
		} else {
			Static333.method5783(arg0);
		}
	}
}
