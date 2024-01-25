import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_87 = new Class44(42, -1);

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "[I")
	public static final int[] anIntArray352 = new int[6];

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)V")
	public static void method3785() {
		Static327.anInt6185 = Static586.aClass158_12.anInt4347 + Static586.aClass158_12.anInt4354 + 2;
		Static286.aStringArray14 = new String[500];
		Static676.anInt11192 = Static48.aClass158_1.anInt4354 + Static48.aClass158_1.anInt4347 + 2;
		for (@Pc(27) int local27 = 0; local27 < Static286.aStringArray14.length; local27++) {
			Static286.aStringArray14[local27] = "";
		}
		Static466.method6830(Static514.aClass303_3.method7473(Static232.anInt4258));
	}

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "(I)V")
	public static void method3786() {
		if (Static436.aByteArray90 != null) {
			Static548.method7713();
		} else if (Static242.anInt4374 == -1) {
			Static531.method7616(Static238.aString49, Static12.aString1);
		} else {
			Static298.method4395();
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!wia;Ljava/lang/String;IZ)Lclient!raa;")
	public static Class294 method3787(@OriginalArg(0) Class386 arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = arg0.method9213(arg1);
		if (local10 == -1) {
			return new Class294(0);
		}
		@Pc(28) int[] local28 = arg0.method9205(local10);
		@Pc(34) Class294 local34 = new Class294(local28.length);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		while (true) {
			while (local34.anInt8833 > local36) {
				@Pc(52) Class14_Sub29 local52 = new Class14_Sub29(arg0.method9196(local28[local38++], local10));
				@Pc(58) int local58 = local52.method5878();
				@Pc(62) int local62 = local52.method5900();
				@Pc(66) int local66 = local52.method5866();
				if (!arg2 && local66 == 1) {
					local34.anInt8833--;
				} else {
					local34.anIntArray654[local36] = local58;
					local34.anIntArray655[local36] = local62;
					local36++;
				}
			}
			return local34;
		}
	}
}
