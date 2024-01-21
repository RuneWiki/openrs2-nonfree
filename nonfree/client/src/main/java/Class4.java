import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4 {

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "Lclient!aa;")
	private final Class2 aClass2_2 = new Class2(256);

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Lclient!ge;")
	private final Class7 aClass7_2;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "Lclient!ge;")
	private final Class7 aClass7_1;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!ge;Lclient!ge;)V")
	public Class4(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7 arg1) {
		this.aClass7_2 = arg0;
		this.aClass7_1 = arg1;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[I)Lclient!ta;")
	public Class6_Sub11_Sub1 method32(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(8) long local8 = (long) arg0 ^ 0x200000000L;
		@Pc(15) Class6_Sub11_Sub1 local15 = (Class6_Sub11_Sub1) this.aClass2_2.method20(local8);
		if (local15 != null) {
			return local15;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(35) Class62 local35 = Static130.method1731(this.aClass7_2, arg0);
			if (local35 == null) {
				return null;
			}
			local15 = local35.method1728();
			this.aClass2_2.method18(local15, local8);
			if (arg1 != null) {
				arg1[0] -= local15.aByteArray34.length;
			}
			return local15;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([III)Lclient!ta;")
	public Class6_Sub11_Sub1 method33(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(8) long local8 = (long) arg1 ^ 0x300000000L;
		@Pc(15) Class6_Sub11_Sub1 local15 = (Class6_Sub11_Sub1) this.aClass2_2.method20(local8);
		if (local15 != null) {
			return local15;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(35) Class76 local35 = Static122.method2153(this.aClass7_1, arg1);
			if (local35 == null) {
				return null;
			}
			local15 = local35.method2161();
			this.aClass2_2.method18(local15, local8);
			if (arg0 != null) {
				arg0[0] -= local15.aByteArray34.length;
			}
			return local15;
		} else {
			return null;
		}
	}
}
