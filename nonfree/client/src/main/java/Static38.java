import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ge", name = "O", descriptor = "Lclient!jb;")
	public static Class25 aClass25_7;

	@OriginalMember(owner = "client!ge", name = "P", descriptor = "Lclient!qf;")
	public static Class60 aClass60_515 = Static59.method1195("Fertigkeit)2");

	@OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
	public static int anInt1281 = -1;

	@OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
	public static int anInt1282 = 1;

	@OriginalMember(owner = "client!ge", name = "W", descriptor = "Lclient!qf;")
	public static Class60 aClass60_516 = Static59.method1195("<col=ffffff>");

	@OriginalMember(owner = "client!ge", name = "Y", descriptor = "Lclient!qf;")
	public static Class60 aClass60_517 = Static59.method1195("<col=ffb000>");

	@OriginalMember(owner = "client!ge", name = "cb", descriptor = "I")
	public static int anInt1287 = 0;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4 method872() {
		@Pc(7) Class3_Sub1_Sub2_Sub4 local7 = new Class3_Sub1_Sub2_Sub4();
		local7.aByteArray75 = Static2.aByteArrayArray3[0];
		local7.anInt2858 = Static33.anIntArray138[0];
		local7.anInt2861 = Static81.anInt2533;
		local7.anInt2857 = Static111.anInt3100;
		local7.anInt2860 = Static15.anIntArray74[0];
		local7.anIntArray305 = Static123.anIntArray378;
		local7.anInt2862 = Static32.anIntArray133[0];
		local7.anInt2859 = Static97.anIntArray302[0];
		Static60.method1206();
		return local7;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!qf;Lclient!qf;Lclient!jb;)[Lclient!ma;")
	public static Class3_Sub1_Sub2_Sub3[] method873(@OriginalArg(1) Class60 arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) Class25 arg2) {
		@Pc(14) int local14 = arg2.method920(arg1);
		@Pc(20) int local20 = arg2.method922(local14, arg0);
		return Static125.method2255(local20, arg2, local14);
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)V")
	public static void method875() {
		aClass25_7 = null;
		aClass60_515 = null;
		aClass60_517 = null;
		aClass60_516 = null;
	}
}
