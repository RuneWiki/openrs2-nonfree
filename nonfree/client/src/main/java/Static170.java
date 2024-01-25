import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
	public static int anInt5083;

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
	public static int anInt5086 = 0;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method4318(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(35) int local35 = local19 + (arg0 ? Static269.anInt6660 : Static265.anInt5517);
		for (@Pc(37) int local37 = local19; local37 < local35; local37++) {
			@Pc(43) Class2_Sub9_Sub8 local43 = Static332.method5409(local37);
			if (local43.aBoolean268 && local43.method2569().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static228.aShortArray87 = null;
					Static229.anInt4967 = -1;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(79) short[] local79 = new short[local11.length * 2];
					for (@Pc(81) int local81 = 0; local81 < local13; local81++) {
						local79[local81] = local11[local81];
					}
					local11 = local79;
				}
				local11[local13++] = (short) local37;
			}
		}
		Static229.anInt4967 = local13;
		Static228.aShortArray87 = local11;
		Static174.anInt5326 = 0;
		@Pc(122) String[] local122 = new String[Static229.anInt4967];
		for (@Pc(124) int local124 = 0; local124 < Static229.anInt4967; local124++) {
			local122[local124] = Static332.method5409(local11[local124]).method2569();
		}
		Static10.method152(Static228.aShortArray87, local122);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!kq;B)V")
	public static void method4320(@OriginalArg(0) Class57_Sub5 arg0) {
		arg0.aClass1_1 = null;
		@Pc(12) int local12 = arg0.aClass57_Sub4Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass57_Sub4Array1[local14].aBoolean273 = false;
		}
		@Pc(40) Class193[] local40 = Class49.aClass193Array3;
		synchronized (Class49.aClass193Array3) {
			if (local12 < Class49.aClass193Array3.length && Static331.anIntArray497[local12] < 200) {
				Class49.aClass193Array3[local12].method5222(arg0);
				@Pc(67) int local67 = Static331.anIntArray497[local12]++;
			}
		}
	}
}
