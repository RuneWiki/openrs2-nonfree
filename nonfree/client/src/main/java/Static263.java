import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!jb", name = "Q", descriptor = "Lclient!iv;")
	public static Class170 aClass170_2;

	@OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
	public static int anInt4574;

	@OriginalMember(owner = "client!jb", name = "P", descriptor = "Lclient!ov;")
	public static Class263 aClass263_1 = new Class263(8);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[B")
	public static byte[] method3891(@OriginalArg(1) int arg0) {
		@Pc(12) Class6_Sub4_Sub8 local12 = (Class6_Sub4_Sub8) Static355.aClass189_4.method4279((long) arg0);
		if (local12 == null) {
			@Pc(21) byte[] local21 = new byte[512];
			@Pc(27) Random local27 = new Random((long) arg0);
			for (@Pc(29) int local29 = 0; local29 < 255; local29++) {
				local21[local29] = (byte) local29;
			}
			for (@Pc(42) int local42 = 0; local42 < 255; local42++) {
				@Pc(49) int local49 = 255 - local42;
				@Pc(54) int local54 = Static316.method4556(local27, local49);
				@Pc(58) byte local58 = local21[local54];
				local21[local54] = local21[local49];
				local21[local49] = local21[511 - local42] = local58;
			}
			local12 = new Class6_Sub4_Sub8(local21);
			Static355.aClass189_4.method4278(local12, (long) arg0);
		}
		return local12.aByteArray52;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILjava/lang/String;IIIII)V")
	public static void method3892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(19) Class2_Sub7 local19 = new Class2_Sub7();
		local19.anInt3611 = arg1;
		local19.anInt3613 = arg0;
		local19.anInt3618 = arg5;
		local19.anInt3620 = arg6;
		local19.aString36 = arg2;
		local19.anInt3612 = arg4;
		local19.anInt3617 = Static90.anInt1698 + arg3;
		Static214.aClass43_7.method1084(local19);
	}
}
