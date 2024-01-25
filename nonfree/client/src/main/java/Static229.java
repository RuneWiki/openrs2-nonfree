import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!oe", name = "P", descriptor = "I")
	public static int anInt4966;

	@OriginalMember(owner = "client!oe", name = "Q", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
	public static int anInt4967;

	@OriginalMember(owner = "client!oe", name = "L", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_149 = new Class157(62, 8);

	@OriginalMember(owner = "client!oe", name = "N", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_150 = new Class157(80, 3);

	@OriginalMember(owner = "client!oe", name = "R", descriptor = "[I")
	public static final int[] anIntArray391 = new int[13];

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
	public static void method4236() {
		@Pc(1) Class107 local1 = Static217.aClass107_29;
		synchronized (Static217.aClass107_29) {
			Static217.aClass107_29.method3012();
		}
		local1 = Static258.aClass107_38;
		synchronized (Static258.aClass107_38) {
			Static258.aClass107_38.method3012();
		}
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(II)Lclient!km;")
	public static Class121 method4237(@OriginalArg(0) int arg0) {
		@Pc(12) Class121 local12 = (Class121) Static63.aClass107_8.method3021((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static307.aClass104_161.method2756(1, arg0);
		local12 = new Class121();
		if (local22 != null) {
			local12.method3375(new Class2_Sub12(local22), arg0);
		}
		Static63.aClass107_8.method3018((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)[Lclient!fj;")
	public static Class69[] method4239() {
		return new Class69[] { Static217.aClass69_1, Static217.aClass69_2, Static217.aClass69_3, Static217.aClass69_4, Static217.aClass69_5, Static217.aClass69_6, Static217.aClass69_7, Static217.aClass69_8, Static217.aClass69_9, Static217.aClass69_10 };
	}
}
