import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!de", name = "q", descriptor = "Lclient!tc;")
	public static Class3 aClass3_1;

	@OriginalMember(owner = "client!de", name = "r", descriptor = "Lclient!gh;")
	public static Class79 aClass79_1;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "I")
	public static int anInt1008 = 0;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "I")
	public static int anInt1013 = -1;

	@OriginalMember(owner = "client!de", name = "l", descriptor = "I")
	public static int anInt1019 = -1;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!wn;I)I")
	public static int method1228(@OriginalArg(0) Class1_Sub2_Sub3_Sub2 arg0) {
		@Pc(13) Class139 local13 = arg0.aClass139_1;
		if (local13.anIntArray350 != null) {
			local13 = local13.method4120();
			if (local13 == null) {
				return -1;
			}
		}
		@Pc(27) int local27 = local13.anInt4790;
		@Pc(31) Class142 local31 = arg0.method5778();
		if (arg0.aBoolean613) {
			local27 = local13.anInt4770;
		} else if (local31.anInt4869 == arg0.anInt6901 || local31.anInt4870 == arg0.anInt6901 || local31.anInt4881 == arg0.anInt6901 || local31.anInt4873 == arg0.anInt6901) {
			local27 = local13.anInt4785;
		} else if (arg0.anInt6901 == local31.anInt4879 || local31.anInt4895 == arg0.anInt6901 || local31.anInt4893 == arg0.anInt6901 || local31.anInt4866 == arg0.anInt6901) {
			local27 = local13.anInt4791;
		}
		return local27;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IZI)V")
	public static void method1229(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(14) Class2_Sub21 local14 = Static238.method4329(arg1, arg0);
		if (local14 != null) {
			for (@Pc(19) int local19 = 0; local19 < local14.anIntArray245.length; local19++) {
				local14.anIntArray245[local19] = -1;
				local14.anIntArray247[local19] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)Lclient!sg;")
	public static Class181 method1231(@OriginalArg(1) int arg0) {
		@Pc(17) Class181 local17 = (Class181) Static251.aClass107_32.method3021((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(29) byte[] local29 = Static149.aClass104_89.method2756(30, arg0);
		local17 = new Class181();
		if (local29 != null) {
			local17.method4929(arg0, new Class2_Sub12(local29));
		}
		Static251.aClass107_32.method3018((long) arg0, local17);
		return local17;
	}
}
