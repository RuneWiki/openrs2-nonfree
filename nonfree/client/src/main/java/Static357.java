import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
	public static int anInt4327;

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
	public static int anInt4330;

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "Lclient!gd;")
	public static Interface2 anInterface2_7;

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "Z")
	public static boolean aBoolean413;

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "Lclient!bf;")
	public static final Class18 aClass18_3 = new Class18(100);

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "I")
	public static int anInt4331 = 0;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IB)Lclient!kd;")
	public static Class1_Sub4_Sub15 method3867(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub4_Sub15 local10 = (Class1_Sub4_Sub15) Static356.aClass92_10.method2606((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static14.aClass216_2.method5648(11, arg0);
		local10 = new Class1_Sub4_Sub15();
		if (local20 != null) {
			local10.method3097(new Class1_Sub8(local20));
		}
		Static356.aClass92_10.method2601((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIBII)Lclient!vp;")
	public static Class212 method3872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class36[] local7 = null;
		@Pc(16) Class188 local16 = Static54.method1415(arg2);
		if (local16.anIntArray480 != null) {
			local7 = new Class36[local16.anIntArray480.length];
			for (@Pc(26) int local26 = 0; local26 < local7.length; local26++) {
				@Pc(35) Class201 local35 = Static91.method1965(local16.anIntArray480[local26]);
				local7[local26] = new Class36(local35.anInt6083, local35.anInt6082, local35.anInt6088, local35.anInt6077, local35.anInt6087, local35.anInt6084, local35.anInt6079, local35.aBoolean587);
			}
		}
		return new Class212(local16.anInt5730, local7, local16.anInt5731, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "(I)I")
	public static int method3877() {
		if (Static1.aBoolean7) {
			return 0;
		} else if (Static40.method953()) {
			return Static221.aBoolean435 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!aq;ILclient!uo;)V")
	public static void method3878(@OriginalArg(0) Class12 arg0, @OriginalArg(2) Class32 arg1) {
		@Pc(34) boolean local34 = Static345.method5541(arg0.anInt406, arg0.anInt452, arg1, arg0.anInt407, arg0.aBoolean42 ? Static198.aClass17_Sub1_Sub1_Sub1_3.aClass60_1 : null, arg0.anInt463 | 0xFF000000, arg0.anInt454) == null;
		if (local34) {
			Static163.aClass16_16.method416(new Class1_Sub10(arg0.anInt406, arg0.anInt454, arg0.anInt407, arg0.anInt463 | 0xFF000000, arg0.anInt452, arg0.aBoolean42));
		}
	}
}
