import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class20 {

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Lclient!tm;")
	private Class163 aClass163_9 = new Class163(256);

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "Lclient!tm;")
	private Class163 aClass163_10 = new Class163(256);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "Lclient!cg;")
	private Class22 aClass22_14;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "Lclient!cg;")
	private Class22 aClass22_15;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!cg;Lclient!cg;)V")
	public Class20(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class22 arg1) {
		this.aClass22_14 = arg1;
		this.aClass22_15 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II[I)Lclient!ri;")
	public Class4_Sub5_Sub1 method642(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass22_15.method677() == 1) {
			return this.method649(arg1, 0, arg0);
		} else if (this.aClass22_15.method679(arg0) == 1) {
			return this.method649(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([III)Lclient!ri;")
	public Class4_Sub5_Sub1 method645(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass22_14.method677() == 1) {
			return this.method648(0, arg1, arg0);
		} else if (this.aClass22_14.method679(arg1) == 1) {
			return this.method648(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIZ[I)Lclient!ri;")
	private Class4_Sub5_Sub1 method648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg1 ^ (arg0 >>> 12 | (arg0 & 0x50000FFF) << 4);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(32) long local32 = (long) local21 ^ 0x100000000L;
		@Pc(39) Class4_Sub5_Sub1 local39 = (Class4_Sub5_Sub1) this.aClass163_10.method4188(local32);
		if (local39 != null) {
			return local39;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(64) Class4_Sub7 local64 = (Class4_Sub7) this.aClass163_9.method4188(local32);
			if (local64 == null) {
				local64 = Static24.method537(this.aClass22_14, arg0, arg1);
				if (local64 == null) {
					return null;
				}
				this.aClass163_9.method4181(local32, local64);
			}
			local39 = local64.method539(arg2);
			if (local39 == null) {
				return null;
			} else {
				local64.method4690();
				this.aClass163_10.method4181(local32, local39);
				return local39;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([IIII)Lclient!ri;")
	private Class4_Sub5_Sub1 method649(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(23) int local23 = arg2 ^ (arg1 << 4 & 0xFFF4 | arg1 >>> 12);
		@Pc(29) int local29 = local23 | arg1 << 16;
		@Pc(32) long local32 = (long) local29;
		@Pc(39) Class4_Sub5_Sub1 local39 = (Class4_Sub5_Sub1) this.aClass163_10.method4188(local32);
		if (local39 != null) {
			return local39;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(60) Class56 local60 = Static313.method1431(this.aClass22_15, arg1, arg2);
			if (local60 == null) {
				return null;
			}
			local39 = local60.method1434();
			this.aClass163_10.method4181(local32, local39);
			if (arg0 != null) {
				arg0[0] -= local39.aByteArray57.length;
			}
			return local39;
		} else {
			return null;
		}
	}
}
