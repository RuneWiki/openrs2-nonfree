import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "Lclient!fea;")
	public static final Class104 aClass104_5 = new Class104("LOCAL", "", "local", 4);

	@OriginalMember(owner = "client!ec", name = "T", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLclient!ib;)I")
	public static int method1886(@OriginalArg(1) Class2_Sub1_Sub1_Sub3_Sub1 arg0) {
		@Pc(15) int local15 = arg0.anInt4203;
		@Pc(19) Class389 local19 = arg0.method4317();
		if (arg0.anInt5112 == -1 || arg0.aBoolean331) {
			local15 = arg0.anInt4185;
		} else if (arg0.anInt5112 == local19.anInt10709 || arg0.anInt5112 == local19.anInt10722 || arg0.anInt5112 == local19.anInt10714 || arg0.anInt5112 == local19.anInt10688) {
			local15 = arg0.anInt4204;
		} else if (arg0.anInt5112 == local19.anInt10710 || arg0.anInt5112 == local19.anInt10697 || local19.anInt10730 == arg0.anInt5112 || arg0.anInt5112 == local19.anInt10723) {
			local15 = arg0.anInt4190;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!gga;)Lclient!uo;")
	public static Class24_Sub4 method1887(@OriginalArg(1) Class6_Sub23 arg0) {
		return new Class24_Sub4(arg0.method8395(), arg0.method8395(), arg0.method8395(), arg0.method8395(), arg0.method8395(), arg0.method8395(), arg0.method8395(), arg0.method8395(), arg0.method8344(), arg0.method8374());
	}
}
