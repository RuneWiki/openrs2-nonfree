import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!sl", name = "U", descriptor = "[Lclient!f;")
	public static Class78[] aClass78Array11;

	@OriginalMember(owner = "client!sl", name = "M", descriptor = "I")
	public static int anInt6644 = 0;

	@OriginalMember(owner = "client!sl", name = "O", descriptor = "Lclient!el;")
	public static Class1_Sub14_Sub1 aClass1_Sub14_Sub1_3 = new Class1_Sub14_Sub1(8192);

	@OriginalMember(owner = "client!sl", name = "V", descriptor = "Lclient!cv;")
	public static final Class51 aClass51_30 = new Class51(16);

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(II)Z")
	public static boolean method5201(@OriginalArg(1) int arg0) {
		Static100.anInt1967 = arg0 + 1 & 0xFFFF;
		Static286.aBoolean380 = true;
		return true;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBI)V")
	public static void method5202(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub1_Sub1 local8 = Static190.method3007(0, 15);
		local8.method32();
		local8.anInt39 = arg1;
		local8.anInt35 = arg0;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILclient!ob;II)Lclient!ss;")
	public static Class1_Sub1_Sub14 method5204(@OriginalArg(1) Class179 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1 << 8 | arg0.anInt4703;
		@Pc(19) Class1_Sub1_Sub14 local19 = (Class1_Sub1_Sub14) Static413.aClass116_3.method2530((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static29.aClass109_14.method2346(Static29.aClass109_14.method2347(local10));
		if (local31 == null) {
			local10 = arg2 + 65536 << 8 | arg0.anInt4703;
			local19 = (Class1_Sub1_Sub14) Static413.aClass116_3.method2530((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static29.aClass109_14.method2346(Static29.aClass109_14.method2347(local10));
			if (local31 == null) {
				local10 = arg0.anInt4703 | 0xFFFF00;
				local19 = (Class1_Sub1_Sub14) Static413.aClass116_3.method2530((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static29.aClass109_14.method2346(Static29.aClass109_14.method2347(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					local19 = Static81.method1175(local31);
					local19.aClass179_8 = arg0;
					Static413.aClass116_3.method2526(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				local19 = Static81.method1175(local31);
				local19.aClass179_8 = arg0;
				Static413.aClass116_3.method2526(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			local19 = Static81.method1175(local31);
			local19.aClass179_8 = arg0;
			Static413.aClass116_3.method2526(local19, (long) local10 << 16);
			return local19;
		}
	}
}
