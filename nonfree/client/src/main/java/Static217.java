import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
	public static int anInt4817;

	@OriginalMember(owner = "client!nl", name = "A", descriptor = "Lclient!bl;")
	public static Class26 aClass26_6;

	@OriginalMember(owner = "client!nl", name = "m", descriptor = "Lclient!fj;")
	public static final Class69 aClass69_1 = new Class69(14, 1);

	@OriginalMember(owner = "client!nl", name = "p", descriptor = "Lclient!fj;")
	public static final Class69 aClass69_2 = new Class69(15, 4);

	@OriginalMember(owner = "client!nl", name = "q", descriptor = "Lclient!fj;")
	public static final Class69 aClass69_3 = new Class69(16, -2);

	@OriginalMember(owner = "client!nl", name = "r", descriptor = "Lclient!fj;")
	public static final Class69 aClass69_4 = new Class69(17, 0);

	@OriginalMember(owner = "client!nl", name = "s", descriptor = "Lclient!fj;")
	public static final Class69 aClass69_5 = new Class69(18, -2);

	@OriginalMember(owner = "client!nl", name = "t", descriptor = "Lclient!fj;")
	public static final Class69 aClass69_6 = new Class69(20, 6);

	@OriginalMember(owner = "client!nl", name = "u", descriptor = "Lclient!fj;")
	public static final Class69 aClass69_7 = new Class69(21, 8);

	@OriginalMember(owner = "client!nl", name = "v", descriptor = "Lclient!fj;")
	public static final Class69 aClass69_8 = new Class69(22, -2);

	@OriginalMember(owner = "client!nl", name = "w", descriptor = "Lclient!fj;")
	public static final Class69 aClass69_9 = new Class69(23, 4);

	@OriginalMember(owner = "client!nl", name = "x", descriptor = "Lclient!fj;")
	public static final Class69 aClass69_10 = new Class69(24, -1);

	@OriginalMember(owner = "client!nl", name = "z", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_141 = new Class157(5, -1);

	@OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
	public static int anInt4819 = -1;

	@OriginalMember(owner = "client!nl", name = "C", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_142 = new Class157(52, -1);

	@OriginalMember(owner = "client!nl", name = "D", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_29 = new Class107(260);

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4134(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)Lclient!o;")
	public static Class1_Sub4 method4135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class51 local7 = Static196.aClass51ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass1_Sub4_1 == null ? null : local7.aClass1_Sub4_1;
	}
}
