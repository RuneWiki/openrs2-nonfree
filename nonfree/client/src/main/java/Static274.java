import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!rm", name = "fb", descriptor = "I")
	public static int anInt5608;

	@OriginalMember(owner = "client!rm", name = "db", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_156 = new Class34(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!rm", name = "eb", descriptor = "[S")
	public static short[] aShortArray112 = new short[256];

	@OriginalMember(owner = "client!rm", name = "gb", descriptor = "[[B")
	public static final byte[][] aByteArrayArray18 = new byte[1000][];

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIZ)Lclient!hr;")
	public static Class1_Sub19 method4804(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) long local17 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
		return (Class1_Sub19) Static190.aClass197_16.method5157(local17);
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(Z)V")
	public static void method4806() {
		Static133.aClass87_27.method2485();
		Static237.aClass87_41.method2485();
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!fe;)V")
	public static void method4807(@OriginalArg(0) Class17_Sub1 arg0) {
		for (@Pc(2) int local2 = arg0.aShort75; local2 <= arg0.aShort74; local2++) {
			for (@Pc(6) int local6 = arg0.aShort77; local6 <= arg0.aShort76; local6++) {
				@Pc(16) Class194 local16 = Static77.aClass194ArrayArrayArray1[arg0.aByte51][local2][local6];
				if (local16 != null) {
					@Pc(21) Class126 local21 = local16.aClass126_2;
					@Pc(23) Class126 local23 = null;
					while (local21 != null) {
						if (local21.aClass17_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass126_2 = local21.aClass126_1;
							} else {
								local23.aClass126_1 = local21.aClass126_1;
							}
							local21.method3468();
							break;
						}
						local23 = local21;
						local21 = local21.aClass126_1;
					}
					local16.aByte67 = 0;
					for (@Pc(56) Class126 local56 = local16.aClass126_2; local56 != null; local56 = local56.aClass126_1) {
						local16.aByte67 = (byte) (local16.aByte67 | local56.anInt3791);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BII)I")
	public static int method4808(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static268.anIntArray459[arg0 & 0x3] : Static200.anIntArray382[arg0 & 0x3];
	}
}
