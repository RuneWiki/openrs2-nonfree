import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!cga", name = "fb", descriptor = "J")
	public static long aLong61;

	@OriginalMember(owner = "client!cga", name = "G", descriptor = "I")
	public static int anInt1227;

	@OriginalMember(owner = "client!cga", name = "W", descriptor = "J")
	public static long aLong62;

	@OriginalMember(owner = "client!cga", name = "Z", descriptor = "I")
	public static int anInt1228;

	@OriginalMember(owner = "client!cga", name = "K", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_23 = new Class186(115, 7);

	@OriginalMember(owner = "client!cga", name = "M", descriptor = "I")
	public static int anInt1225 = 0;

	@OriginalMember(owner = "client!cga", name = "O", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!cga", name = "I", descriptor = "I")
	public static int anInt1229 = 0;

	@OriginalMember(owner = "client!cga", name = "c", descriptor = "(II)I")
	public static int method1014(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method1016(@OriginalArg(1) Class67 arg0) {
		for (@Pc(14) Class19_Sub9 local14 = (Class19_Sub9) Static296.aClass66_5.method1381(); local14 != null; local14 = (Class19_Sub9) Static296.aClass66_5.method1380()) {
			if (local14.aBoolean617) {
				local14.method6780(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILclient!ej;)V")
	public static void method1017(@OriginalArg(1) Class3_Sub4_Sub5 arg0) {
		if (arg0 == null) {
			return;
		}
		Static562.aClass357_54.method8401(arg0);
		Static285.anInt5168++;
		@Pc(45) Class3_Sub4_Sub17 local45;
		if (arg0.aBoolean228 || "".equals(arg0.aString50)) {
			local45 = new Class3_Sub4_Sub17(arg0.aString50);
			Static332.anInt5826++;
		} else {
			@Pc(39) long local39 = arg0.aLong104;
			for (local45 = (Class3_Sub4_Sub17) Static228.aClass136_39.method3503(local39); local45 != null && !local45.aString112.equals(arg0.aString50); local45 = (Class3_Sub4_Sub17) Static228.aClass136_39.method3510()) {
			}
			if (local45 == null) {
				local45 = (Class3_Sub4_Sub17) Static81.aClass338_4.method8049(local39);
				if (local45 != null && !local45.aString112.equals(arg0.aString50)) {
					local45 = null;
				}
				if (local45 == null) {
					local45 = new Class3_Sub4_Sub17(arg0.aString50);
				}
				Static228.aClass136_39.method3508(local39, local45);
				Static332.anInt5826++;
			}
		}
		if (local45.method7231(arg0)) {
			Static507.method7251(local45);
		}
	}
}
