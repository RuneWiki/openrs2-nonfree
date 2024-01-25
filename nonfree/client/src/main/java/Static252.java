import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!qe", name = "y", descriptor = "Lclient!wo;")
	public static Class216 aClass216_82;

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray55 = new int[128][128];

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
	public static int anInt5211 = 0;

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)I")
	public static int method4572() {
		return 6;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V")
	public static void method4573() {
		@Pc(5) Class87 local5 = Static190.aClass87_35;
		synchronized (Static190.aClass87_35) {
			Static190.aClass87_35.method2485();
		}
		local5 = Static5.aClass87_1;
		synchronized (Static5.aClass87_1) {
			Static5.aClass87_1.method2485();
		}
		local5 = Static56.aClass87_14;
		synchronized (Static56.aClass87_14) {
			Static56.aClass87_14.method2485();
		}
		local5 = Static101.aClass87_19;
		synchronized (Static101.aClass87_19) {
			Static101.aClass87_19.method2485();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)[B")
	public static byte[] method4575(@OriginalArg(0) int arg0) {
		@Pc(19) Class1_Sub4_Sub7 local19 = (Class1_Sub4_Sub7) Static15.aClass92_1.method2606((long) arg0);
		if (local19 == null) {
			@Pc(24) byte[] local24 = new byte[512];
			@Pc(30) Random local30 = new Random((long) arg0);
			for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
				local24[local32] = (byte) local32;
			}
			for (@Pc(47) int local47 = 0; local47 < 255; local47++) {
				@Pc(54) int local54 = 255 - local47;
				@Pc(59) int local59 = Static295.method4970(local30, local54);
				@Pc(63) byte local63 = local24[local59];
				local24[local59] = local24[local54];
				local24[local54] = local24[511 - local47] = local63;
			}
			local19 = new Class1_Sub4_Sub7(local24);
			Static15.aClass92_1.method2601((long) arg0, local19);
		}
		return local19.aByteArray20;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!la;)V")
	public static void method4576(@OriginalArg(1) Class1_Sub23 arg0) {
		if (!Static146.aBoolean308) {
			arg0.method5628();
			Static115.anInt2635--;
		}
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)I")
	public static int method4578() {
		if ((double) Static79.aFloat50 == 3.0D) {
			return 37;
		} else if ((double) Static79.aFloat50 == 4.0D) {
			return 50;
		} else if ((double) Static79.aFloat50 == 6.0D) {
			return 75;
		} else if ((double) Static79.aFloat50 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
