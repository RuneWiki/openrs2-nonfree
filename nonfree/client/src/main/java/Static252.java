import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "[[B")
	public static final byte[][] aByteArrayArray21 = new byte[250][];

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
	public static int anInt4688 = -1;

	@OriginalMember(owner = "client!jk", name = "n", descriptor = "[F")
	public static final float[] aFloatArray41 = new float[4];

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
	public static void method3935(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(29) int local29 = (arg1 ? Static541.aClass304_2.anInt8226 : Static541.aClass304_2.anInt8228) + local19;
		for (@Pc(35) int local35 = local19; local35 < local29; local35++) {
			@Pc(42) Class2_Sub3_Sub18 local42 = Static541.aClass304_2.method6809(local35);
			if (local42.aBoolean679 && local42.method7363().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static537.anInt8790 = -1;
					Static384.aShortArray113 = null;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(73) short[] local73 = new short[local11.length * 2];
					for (@Pc(75) int local75 = 0; local75 < local13; local75++) {
						local73[local75] = local11[local75];
					}
					local11 = local73;
				}
				local11[local13++] = (short) local35;
			}
		}
		Static537.anInt8790 = local13;
		Static384.aShortArray113 = local11;
		Static524.anInt8648 = 0;
		@Pc(112) String[] local112 = new String[Static537.anInt8790];
		for (@Pc(114) int local114 = 0; local114 < Static537.anInt8790; local114++) {
			local112[local114] = Static541.aClass304_2.method6809(local11[local114]).method7363();
		}
		Static578.method7805(Static384.aShortArray113, local112);
	}
}
