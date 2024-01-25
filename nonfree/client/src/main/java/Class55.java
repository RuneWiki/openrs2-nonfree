import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class55 {

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "Lclient!bn;")
	private final Class25 aClass25_4 = new Class25(256);

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "Lclient!bn;")
	private final Class25 aClass25_5 = new Class25(256);

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "Lclient!mo;")
	private final Class143 aClass143_47;

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "Lclient!mo;")
	private final Class143 aClass143_46;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!mo;Lclient!mo;)V")
	public Class55(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class143 arg1) {
		this.aClass143_47 = arg0;
		this.aClass143_46 = arg1;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I[IB)Lclient!kr;")
	public Class14_Sub11_Sub1 method1909(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass143_47.method3747() == 1) {
			return this.method1913(0, arg1, arg0);
		} else if (this.aClass143_47.method3732(arg0) == 1) {
			return this.method1913(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "([IIBI)Lclient!kr;")
	private Class14_Sub11_Sub1 method1912(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg2 << 4 & 0xFFF8 | arg2 >>> 12) ^ arg1;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(31) long local31 = (long) local21 ^ 0x100000000L;
		@Pc(38) Class14_Sub11_Sub1 local38 = (Class14_Sub11_Sub1) this.aClass25_5.method691(local31);
		if (local38 != null) {
			return local38;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(57) Class14_Sub26 local57 = (Class14_Sub26) this.aClass25_4.method691(local31);
			if (local57 == null) {
				local57 = Static268.method4579(this.aClass143_46, arg2, arg1);
				if (local57 == null) {
					return null;
				}
				this.aClass25_4.method687(local31, local57);
			}
			local38 = local57.method4571(arg0);
			if (local38 == null) {
				return null;
			} else {
				local57.method5986();
				this.aClass25_5.method687(local31, local38);
				return local38;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(II[II)Lclient!kr;")
	private Class14_Sub11_Sub1 method1913(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg0 >>> 12 | arg0 << 4 & 0xFFF8);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(32) long local32 = (long) local21;
		@Pc(39) Class14_Sub11_Sub1 local39 = (Class14_Sub11_Sub1) this.aClass25_5.method691(local32);
		if (local39 != null) {
			return local39;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(57) Class91 local57 = Static359.method2708(this.aClass143_47, arg0, arg2);
			if (local57 == null) {
				return null;
			}
			local39 = local57.method2706();
			this.aClass25_5.method687(local32, local39);
			if (arg1 != null) {
				arg1[0] -= local39.aByteArray98.length;
			}
			return local39;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "([III)Lclient!kr;")
	public Class14_Sub11_Sub1 method1914(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass143_46.method3747() == 1) {
			return this.method1912(arg0, arg1, 0);
		} else if (this.aClass143_46.method3732(arg1) == 1) {
			return this.method1912(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
