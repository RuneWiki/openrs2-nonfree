import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class58 {

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "Lclient!tba;")
	private final Class323 aClass323_8 = new Class323(256);

	@OriginalMember(owner = "client!cm", name = "p", descriptor = "Lclient!tba;")
	private final Class323 aClass323_9 = new Class323(256);

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "Lclient!nd;")
	private final Class238 aClass238_43;

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "Lclient!nd;")
	private final Class238 aClass238_42;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!nd;Lclient!nd;)V")
	public Class58(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class238 arg1) {
		this.aClass238_43 = arg0;
		this.aClass238_42 = arg1;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I[IBI)Lclient!ct;")
	private Class2_Sub14_Sub1 method1742(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0 ^ ((arg2 & 0xB0000FFF) << 4 | arg2 >>> 12);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class2_Sub14_Sub1 local31 = (Class2_Sub14_Sub1) this.aClass323_9.method7484(local24);
		if (local31 != null) {
			return local31;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(49) Class134 local49 = Static652.method3295(this.aClass238_43, arg2, arg0);
			if (local49 == null) {
				return null;
			}
			local31 = local49.method3296();
			this.aClass323_9.method7477(local31, local24);
			if (arg1 != null) {
				arg1[0] -= local31.aByteArray17.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "([IIB)Lclient!ct;")
	public Class2_Sub14_Sub1 method1743(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass238_42.method5569() == 1) {
			return this.method1748(arg0, 0, arg1);
		} else if (this.aClass238_42.method5592(arg1) == 1) {
			return this.method1748(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I[IB)Lclient!ct;")
	public Class2_Sub14_Sub1 method1745(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass238_43.method5569() == 1) {
			return this.method1742(arg0, arg1, 0);
		} else if (this.aClass238_43.method5592(arg0) == 1) {
			return this.method1742(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "([IIBI)Lclient!ct;")
	private Class2_Sub14_Sub1 method1748(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(23) int local23 = (arg1 << 4 & 0xFFFD | arg1 >>> 12) ^ arg2;
		@Pc(29) int local29 = local23 | arg1 << 16;
		@Pc(34) long local34 = (long) local29 ^ 0x100000000L;
		@Pc(41) Class2_Sub14_Sub1 local41 = (Class2_Sub14_Sub1) this.aClass323_9.method7484(local34);
		if (local41 != null) {
			return local41;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(63) Class2_Sub38 local63 = (Class2_Sub38) this.aClass323_8.method7484(local34);
			if (local63 == null) {
				local63 = Static504.method7038(this.aClass238_42, arg1, arg2);
				if (local63 == null) {
					return null;
				}
				this.aClass323_8.method7477(local63, local34);
			}
			local41 = local63.method7032(arg0);
			if (local41 == null) {
				return null;
			} else {
				local63.method8920();
				this.aClass323_9.method7477(local41, local34);
				return local41;
			}
		} else {
			return null;
		}
	}
}
