import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class67 {

	@OriginalMember(owner = "client!f", name = "f", descriptor = "Lclient!lp;")
	private final Class140 aClass140_17 = new Class140(256);

	@OriginalMember(owner = "client!f", name = "l", descriptor = "Lclient!lp;")
	private final Class140 aClass140_18 = new Class140(256);

	@OriginalMember(owner = "client!f", name = "j", descriptor = "Lclient!uu;")
	private final Class250 aClass250_36;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "Lclient!uu;")
	private final Class250 aClass250_35;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!uu;Lclient!uu;)V")
	public Class67(@OriginalArg(0) Class250 arg0, @OriginalArg(1) Class250 arg1) {
		this.aClass250_36 = arg0;
		this.aClass250_35 = arg1;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IB[I)Lclient!jp;")
	public Class3_Sub28_Sub1 method1722(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass250_35.method5819() == 1) {
			return this.method1725(arg1, 0, arg0);
		} else if (this.aClass250_35.method5815(arg0) == 1) {
			return this.method1725(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I[III)Lclient!jp;")
	private Class3_Sub28_Sub1 method1725(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = arg2 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFFA);
		@Pc(27) int local27 = local21 | arg1 << 16;
		@Pc(32) long local32 = (long) local27 ^ 0x100000000L;
		@Pc(39) Class3_Sub28_Sub1 local39 = (Class3_Sub28_Sub1) this.aClass140_18.method3490(local32);
		if (local39 != null) {
			return local39;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(61) Class3_Sub27 local61 = (Class3_Sub27) this.aClass140_17.method3490(local32);
			if (local61 == null) {
				local61 = Static196.method3049(this.aClass250_35, arg1, arg2);
				if (local61 == null) {
					return null;
				}
				this.aClass140_17.method3494(local32, local61);
			}
			local39 = local61.method3050(arg0);
			if (local39 == null) {
				return null;
			} else {
				local61.method6288();
				this.aClass140_18.method3494(local32, local39);
				return local39;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "([III)Lclient!jp;")
	public Class3_Sub28_Sub1 method1726(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass250_36.method5819() == 1) {
			return this.method1727(arg1, 0, arg0);
		} else if (this.aClass250_36.method5815(arg1) == 1) {
			return this.method1727(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II[II)Lclient!jp;")
	private Class3_Sub28_Sub1 method1727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ ((arg1 & 0x80000FFF) << 4 | arg1 >>> 12);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class3_Sub28_Sub1 local31 = (Class3_Sub28_Sub1) this.aClass140_18.method3490(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(52) Class204 local52 = Static472.method4861(this.aClass250_36, arg1, arg0);
			if (local52 == null) {
				return null;
			}
			local31 = local52.method4862();
			this.aClass140_18.method3494(local24, local31);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray70.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
