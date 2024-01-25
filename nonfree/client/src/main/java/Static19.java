import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!at", name = "e", descriptor = "Lclient!ks;")
	public static Class132 aClass132_1;

	@OriginalMember(owner = "client!at", name = "g", descriptor = "I")
	public static int anInt320;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "Lclient!wb;")
	public static final Class243 aClass243_1 = new Class243(32);

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V")
	public static void method212() {
		Static201.method3692();
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)[B")
	public static byte[] method213(@OriginalArg(0) int arg0) {
		@Pc(19) Class2_Sub7_Sub3 local19 = (Class2_Sub7_Sub3) Static300.aClass105_8.method2632((long) arg0);
		if (local19 == null) {
			@Pc(24) byte[] local24 = new byte[512];
			@Pc(30) Random local30 = new Random((long) arg0);
			for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
				local24[local32] = (byte) local32;
			}
			for (@Pc(47) int local47 = 0; local47 < 255; local47++) {
				@Pc(54) int local54 = 255 - local47;
				@Pc(59) int local59 = Static371.method5907(local54, local30);
				@Pc(63) byte local63 = local24[local59];
				local24[local59] = local24[local54];
				local24[local54] = local24[511 - local47] = local63;
			}
			local19 = new Class2_Sub7_Sub3(local24);
			Static300.aClass105_8.method2630(local19, (long) arg0);
		}
		return local19.aByteArray26;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!ve;II)V")
	public static void method214(@OriginalArg(0) Class2_Sub24_Sub2 arg0, @OriginalArg(1) int arg1) {
		Static177.aBoolean271 = false;
		Static70.anInt1556 = 0;
		Static319.method5151(arg0);
		Static198.method3600(arg0);
		if (Static177.aBoolean271) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt6669 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt6669 + " psize:" + arg1);
		}
	}
}
