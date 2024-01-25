import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "Lclient!ok;")
	public static Class178 aClass178_82;

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "[I")
	public static final int[] anIntArray417 = new int[2];

	@OriginalMember(owner = "client!nm", name = "t", descriptor = "[Z")
	public static final boolean[] aBooleanArray26 = new boolean[100];

	@OriginalMember(owner = "client!nm", name = "u", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_72 = new Class2(66, 2);

	@OriginalMember(owner = "client!nm", name = "v", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_103 = new Class253(61, 6);

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BILclient!sl;I)Lclient!tq;")
	public static Class7_Sub4_Sub16 method3647(@OriginalArg(1) int arg0, @OriginalArg(2) Class229 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1.anInt5883 | arg2 << 8;
		@Pc(19) Class7_Sub4_Sub16 local19 = (Class7_Sub4_Sub16) Static201.aClass86_2.method2019((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(36) byte[] local36 = Static78.aClass178_20.method3823(Static78.aClass178_20.method3829(local10));
		if (local36 == null) {
			local10 = arg0 + 65536 << 8 | arg1.anInt5883;
			local19 = (Class7_Sub4_Sub16) Static201.aClass86_2.method2019((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local36 = Static78.aClass178_20.method3823(Static78.aClass178_20.method3829(local10));
			if (local36 == null) {
				local10 = arg1.anInt5883 | 0xFFFF00;
				local19 = (Class7_Sub4_Sub16) Static201.aClass86_2.method2019((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local36 = Static78.aClass178_20.method3823(Static78.aClass178_20.method3829(local10));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					local19 = Static28.method312(local36);
					local19.aClass229_11 = arg1;
					Static201.aClass86_2.method2018(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local36.length <= 1) {
				return null;
			} else {
				local19 = Static28.method312(local36);
				local19.aClass229_11 = arg1;
				Static201.aClass86_2.method2018(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			local19 = Static28.method312(local36);
			local19.aClass229_11 = arg1;
			Static201.aClass86_2.method2018(local19, (long) local10 << 16);
			return local19;
		}
	}
}
