import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
	public static int anInt2413;

	@OriginalMember(owner = "client!ds", name = "t", descriptor = "Lclient!mq;")
	public static Class217 aClass217_2;

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "Lclient!ds;")
	public static final Class68 aClass68_1 = new Class68(0, 3, Static461.aClass292_18);

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "Lclient!ds;")
	public static final Class68 aClass68_2 = new Class68(1, 3, Static461.aClass292_18);

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "Lclient!ds;")
	public static final Class68 aClass68_3 = new Class68(2, 4, Static461.aClass292_14);

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "Lclient!ds;")
	public static final Class68 aClass68_4 = new Class68(3, 1, Static461.aClass292_18);

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "Lclient!ds;")
	public static final Class68 aClass68_5 = new Class68(4, 2, Static461.aClass292_18);

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "Lclient!ds;")
	public static final Class68 aClass68_6 = new Class68(5, 3, Static461.aClass292_18);

	@OriginalMember(owner = "client!ds", name = "o", descriptor = "Lclient!ds;")
	public static final Class68 aClass68_7 = new Class68(6, 4, Static461.aClass292_18);

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
	public static final int anInt2412 = Static328.method5090(16);

	@OriginalMember(owner = "client!ds", name = "q", descriptor = "Z")
	public static boolean aBoolean197 = false;

	@OriginalMember(owner = "client!ds", name = "r", descriptor = "Lclient!kj;")
	public static final Class187 aClass187_6 = new Class187(4, 6);

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)I")
	public static int method2161() {
		return Static268.aClass366_1.method7803();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "([BIB)[B")
	public static byte[] method2163(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static604.method5910(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BI)Lclient!ds;")
	public static Class68 method2164(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return aClass68_1;
		} else if (arg0 == 1) {
			return aClass68_2;
		} else if (arg0 == 2) {
			return aClass68_3;
		} else if (arg0 == 3) {
			return aClass68_4;
		} else if (arg0 == 4) {
			return aClass68_5;
		} else if (arg0 == 5) {
			return aClass68_6;
		} else if (arg0 == 6) {
			return aClass68_7;
		} else {
			return null;
		}
	}
}
