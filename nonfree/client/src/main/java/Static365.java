import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!lj", name = "s", descriptor = "Lclient!fh;")
	public static final Class118 aClass118_17 = new Class118(1);

	@OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
	public static int anInt5846 = 0;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!ka;ILclient!cb;Lclient!cb;)V")
	public static void method5239(@OriginalArg(0) Class45 arg0, @OriginalArg(2) Class53 arg1, @OriginalArg(3) Class53 arg2) {
		if (arg2.method4095() && arg1.method4095()) {
			@Pc(16) Class307 local16 = arg2.aClass307_4;
			@Pc(19) Class307 local19 = arg1.aClass307_4;
			arg0.method5755(arg1.aClass331_8.anInt8896, local19.anIntArray582[arg1.anInt4482], arg2.aClass331_8.aClass2_Sub6_Sub14_1, arg2.aClass331_8.anInt8896, arg1.aClass331_8.anInt8889, arg2.anInt4479, arg2.aClass331_8.aClass2_Sub6_Sub14_2, arg1.aClass331_8.aClass2_Sub6_Sub14_2, local16.aBoolean700 | local19.aBoolean700, arg1.anInt4479, local16.anIntArray582[arg2.anInt4482], local16.aBooleanArray32, arg1.aClass331_8.aClass2_Sub6_Sub14_1, arg2.aClass331_8.anInt8889);
		}
	}
}
