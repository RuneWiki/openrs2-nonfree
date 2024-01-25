import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_191 = new Class163(48, 8);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method6091(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(17) int local17 = 0;
		@Pc(23) int local23 = arg0 ? 32768 : 0;
		@Pc(33) int local33 = (arg0 ? Static141.aClass61_1.anInt1703 : Static141.aClass61_1.anInt1706) + local23;
		for (@Pc(35) int local35 = local23; local35 < local33; local35++) {
			@Pc(42) Class3_Sub3_Sub18 local42 = Static141.aClass61_1.method1599(local35);
			if (local42.aBoolean503 && local42.method6105().toLowerCase().indexOf(local8) != -1) {
				if (local17 >= 50) {
					Static48.anInt871 = -1;
					Static11.aShortArray2 = null;
					return;
				}
				if (local17 >= local11.length) {
					@Pc(72) short[] local72 = new short[local11.length * 2];
					for (@Pc(74) int local74 = 0; local74 < local17; local74++) {
						local72[local74] = local11[local74];
					}
					local11 = local72;
				}
				local11[local17++] = (short) local35;
			}
		}
		Static48.anInt871 = local17;
		Static11.aShortArray2 = local11;
		Static336.anInt5622 = 0;
		@Pc(115) String[] local115 = new String[Static48.anInt871];
		for (@Pc(117) int local117 = 0; local117 < Static48.anInt871; local117++) {
			local115[local117] = Static141.aClass61_1.method1599(local11[local117]).method6105();
		}
		Static382.method5290(local115, Static11.aShortArray2);
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
	public static void method6092() {
		Static276.anInt4608 = 0;
		Static325.aClass193_54.method4524();
		Static325.aClass193_54.method4527(Static346.aClass3_Sub38_2);
		Static276.anInt4608++;
	}
}
