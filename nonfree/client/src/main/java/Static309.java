import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!kha", name = "y", descriptor = "[I")
	public static final int[] anIntArray293 = new int[13];

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(I)I")
	public static int method4443() {
		return Static471.anInt7481 == 1 ? Static233.anInt4125 : Static8.anInt105;
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(IILjava/net/Socket;)Lclient!qia;")
	public static Class26 method4444(@OriginalArg(2) Socket arg0) throws IOException {
		return new Class26_Sub1(arg0, 15000);
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(III)Z")
	public static boolean method4445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static315.method4516(arg0, arg1) | (arg1 & 0x70000) != 0 || Static371.method5293(arg0, arg1);
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "([Lclient!fq;II)V")
	public static void method4446(@OriginalArg(0) Class34_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class34_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt9617;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt9617 < local27 + (local29 & 0x1)) {
				@Pc(44) Class34_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method4446(arg0, arg1, local10 - 1);
		method4446(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(IBIII)V")
	public static void method4447(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class3_Sub5_Sub20 local17 = Static447.method6065((long) arg1, 4);
		local17.method8832();
		local17.anInt10756 = arg0;
		local17.anInt10754 = arg2;
		local17.anInt10757 = arg3;
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(B[BI)[B")
	public static byte[] method4448(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static681.method4034(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
