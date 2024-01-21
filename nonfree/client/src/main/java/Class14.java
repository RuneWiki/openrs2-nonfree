import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class14 {

	@OriginalMember(owner = "client!c", name = "k", descriptor = "Lclient!l;")
	private final Class57 aClass57_7 = new Class57(256);

	@OriginalMember(owner = "client!c", name = "m", descriptor = "Lclient!l;")
	private final Class57 aClass57_8 = new Class57(256);

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Lclient!ve;")
	private final Class69 aClass69_2;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "Lclient!ve;")
	private final Class69 aClass69_3;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lclient!ve;Lclient!ve;)V")
	public Class14(@OriginalArg(0) Class69 arg0, @OriginalArg(1) Class69 arg1) {
		this.aClass69_2 = arg1;
		this.aClass69_3 = arg0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI[I)Lclient!ti;")
	public Class1_Sub9_Sub1 method434(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass69_2.method2220() == 1) {
			return this.method435(arg0, 0, arg1);
		} else if (this.aClass69_2.method2216(arg0) == 1) {
			return this.method435(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III[I)Lclient!ti;")
	private Class1_Sub9_Sub1 method435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ ((arg1 & 0x60000FFF) << 4 | arg1 >>> 12);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub9_Sub1 local33 = (Class1_Sub9_Sub1) this.aClass57_8.method1872(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(55) Class1_Sub4 local55 = (Class1_Sub4) this.aClass57_7.method1872(local26);
			if (local55 == null) {
				local55 = Static22.method490(this.aClass69_2, arg1, arg0);
				if (local55 == null) {
					return null;
				}
				this.aClass57_7.method1874(local55, local26);
			}
			local33 = local55.method493(arg2);
			if (local33 == null) {
				return null;
			} else {
				local55.method3563();
				this.aClass57_8.method1874(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[IB)Lclient!ti;")
	public Class1_Sub9_Sub1 method437(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass69_3.method2220() == 1) {
			return this.method440(0, arg0, arg1);
		} else if (this.aClass69_3.method2216(arg0) == 1) {
			return this.method440(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(III[I)Lclient!ti;")
	private Class1_Sub9_Sub1 method440(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(20) int local20 = (arg0 >>> 12 | (arg0 & 0x10000FFF) << 4) ^ arg1;
		@Pc(26) int local26 = local20 | arg0 << 16;
		@Pc(29) long local29 = (long) local26;
		@Pc(36) Class1_Sub9_Sub1 local36 = (Class1_Sub9_Sub1) this.aClass57_8.method1872(local29);
		if (local36 != null) {
			return local36;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(54) Class11 local54 = Static213.method324(this.aClass69_3, arg0, arg1);
			if (local54 == null) {
				return null;
			}
			local36 = local54.method321();
			this.aClass57_8.method1874(local36, local29);
			if (arg2 != null) {
				arg2[0] -= local36.aByteArray53.length;
			}
			return local36;
		} else {
			return null;
		}
	}
}
