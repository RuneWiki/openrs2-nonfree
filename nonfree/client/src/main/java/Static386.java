import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!tj", name = "m", descriptor = "Lclient!ei;")
	public static Class64 aClass64_1;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray45 = new boolean[200];

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "Lclient!tr;")
	public static final Class237 aClass237_14 = new Class237(0, -1);

	@OriginalMember(owner = "client!tj", name = "l", descriptor = "S")
	public static short aShort85 = 32767;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!od;Lclient!hp;IB)V")
	public static void method5214(@OriginalArg(0) Class180 arg0, @OriginalArg(1) Class1_Sub5 arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class1_Sub40 local9 = new Class1_Sub40();
		local9.anInt6376 = arg1.method5366();
		local9.anInt6371 = arg1.method5407();
		local9.aClass9Array1 = new Class9[local9.anInt6376];
		local9.anIntArray589 = new int[local9.anInt6376];
		local9.anIntArray587 = new int[local9.anInt6376];
		local9.anIntArray588 = new int[local9.anInt6376];
		local9.aClass9Array2 = new Class9[local9.anInt6376];
		local9.aByteArrayArrayArray17 = new byte[local9.anInt6376][][];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt6376; local56++) {
			try {
				@Pc(62) int local62 = arg1.method5366();
				@Pc(87) String local87;
				@Pc(91) String local91;
				@Pc(95) int local95;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local87 = arg1.method5401();
					local91 = arg1.method5401();
					local95 = 0;
					if (local62 == 1) {
						local95 = arg1.method5407();
					}
					local9.anIntArray587[local56] = local62;
					local9.anIntArray589[local56] = local95;
					local9.aClass9Array2[local56] = arg0.method4072(Static439.method5784(local87), local91);
				} else if (local62 == 3 || local62 == 4) {
					local87 = arg1.method5401();
					local91 = arg1.method5401();
					local95 = arg1.method5366();
					@Pc(98) String[] local98 = new String[local95];
					for (@Pc(100) int local100 = 0; local100 < local95; local100++) {
						local98[local100] = arg1.method5401();
					}
					@Pc(115) byte[][] local115 = new byte[local95][];
					@Pc(128) int local128;
					if (local62 == 3) {
						for (@Pc(122) int local122 = 0; local122 < local95; local122++) {
							local128 = arg1.method5407();
							local115[local122] = new byte[local128];
							arg1.method5391(local115[local122], local128);
						}
					}
					local9.anIntArray587[local56] = local62;
					@Pc(153) Class[] local153 = new Class[local95];
					for (local128 = 0; local128 < local95; local128++) {
						local153[local128] = Static439.method5784(local98[local128]);
					}
					local9.aClass9Array1[local56] = arg0.method4087(Static439.method5784(local87), local91, local153);
					local9.aByteArrayArrayArray17[local56] = local115;
				}
			} catch (@Pc(232) ClassNotFoundException local232) {
				local9.anIntArray588[local56] = -1;
			} catch (@Pc(239) SecurityException local239) {
				local9.anIntArray588[local56] = -2;
			} catch (@Pc(246) NullPointerException local246) {
				local9.anIntArray588[local56] = -3;
			} catch (@Pc(253) Exception local253) {
				local9.anIntArray588[local56] = -4;
			} catch (@Pc(260) Throwable local260) {
				local9.anIntArray588[local56] = -5;
			}
		}
		Static4.aClass181_1.method4102(local9);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIII)V")
	public static void method5216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class1_Sub2_Sub6 local16 = Static371.method5808(8, arg2);
		local16.method1778();
		local16.anInt2055 = arg0;
		local16.anInt2059 = arg1;
		local16.anInt2056 = arg3;
	}
}
