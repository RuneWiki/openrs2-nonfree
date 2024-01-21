import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class54 {

	@OriginalMember(owner = "client!p", name = "c", descriptor = "Lclient!sb;")
	private final Class65 aClass65_29 = new Class65(256);

	@OriginalMember(owner = "client!p", name = "t", descriptor = "Lclient!sb;")
	private final Class65 aClass65_30 = new Class65(256);

	@OriginalMember(owner = "client!p", name = "k", descriptor = "Lclient!sf;")
	private final Class5 aClass5_67;

	@OriginalMember(owner = "client!p", name = "j", descriptor = "Lclient!sf;")
	private final Class5 aClass5_66;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!sf;Lclient!sf;)V")
	public Class54(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1) {
		this.aClass5_67 = arg0;
		this.aClass5_66 = arg1;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "([IBI)Lclient!u;")
	public Class1_Sub14_Sub1 method1504(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass5_67.method130() == 1) {
			return this.method1511(arg1, 0, arg0);
		} else if (this.aClass5_67.method106(arg1) == 1) {
			return this.method1511(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IBI[I)Lclient!u;")
	private Class1_Sub14_Sub1 method1505(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = ((arg0 & 0x80000FFF) << 4 | arg0 >>> 12) ^ arg1;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub14_Sub1 local33 = (Class1_Sub14_Sub1) this.aClass65_30.method1802(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(55) Class1_Sub16 local55 = (Class1_Sub16) this.aClass65_29.method1802(local26);
			if (local55 == null) {
				local55 = Static69.method1393(this.aClass5_66, arg0, arg1);
				if (local55 == null) {
					return null;
				}
				this.aClass65_29.method1797(local55, local26);
			}
			local33 = local55.method1386(arg2);
			if (local33 == null) {
				return null;
			} else {
				local55.method2050();
				this.aClass65_30.method1797(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "([IBI)Lclient!u;")
	public Class1_Sub14_Sub1 method1510(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass5_66.method130() == 1) {
			return this.method1505(0, arg1, arg0);
		} else if (this.aClass5_66.method106(arg1) == 1) {
			return this.method1505(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II[II)Lclient!u;")
	private Class1_Sub14_Sub1 method1511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = (arg1 >>> 12 | arg1 << 4 & 0xFFF7) ^ arg0;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub14_Sub1 local31 = (Class1_Sub14_Sub1) this.aClass65_30.method1802(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(52) Class11 local52 = Static137.method389(this.aClass5_67, arg1, arg0);
			if (local52 == null) {
				return null;
			}
			local31 = local52.method388();
			this.aClass65_30.method1797(local31, local24);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray36.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
