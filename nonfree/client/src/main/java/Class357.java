import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class357 {

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "Lclient!pfa;")
	private final Class253 aClass253_42 = new Class253(256);

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "Lclient!pfa;")
	private final Class253 aClass253_43 = new Class253(256);

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "Lclient!oh;")
	private final Class237 aClass237_143;

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "Lclient!oh;")
	private final Class237 aClass237_142;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!oh;Lclient!oh;)V")
	public Class357(@OriginalArg(0) Class237 arg0, @OriginalArg(1) Class237 arg1) {
		this.aClass237_143 = arg1;
		this.aClass237_142 = arg0;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(III[I)Lclient!cba;")
	private Class8_Sub9_Sub1 method8273(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(26) int local26 = (arg0 >>> 12 | arg0 << 4 & 0xFFF6) ^ arg1;
		@Pc(32) int local32 = local26 | arg0 << 16;
		@Pc(35) long local35 = (long) local32;
		@Pc(42) Class8_Sub9_Sub1 local42 = (Class8_Sub9_Sub1) this.aClass253_43.method6594(local35);
		if (local42 != null) {
			return local42;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(63) Class354 local63 = Static653.method8222(this.aClass237_142, arg0, arg1);
			if (local63 == null) {
				return null;
			}
			local42 = local63.method8221();
			this.aClass253_43.method6591(local42, local35);
			if (arg2 != null) {
				arg2[0] -= local42.aByteArray8.length;
			}
			return local42;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II[I)Lclient!cba;")
	public Class8_Sub9_Sub1 method8274(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass237_142.method6311() == 1) {
			return this.method8273(0, arg0, arg1);
		} else if (this.aClass237_142.method6315(arg0) == 1) {
			return this.method8273(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "([IIII)Lclient!cba;")
	private Class8_Sub9_Sub1 method8275(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFFA);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class8_Sub9_Sub1 local33 = (Class8_Sub9_Sub1) this.aClass253_43.method6594(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(52) Class8_Sub13 local52 = (Class8_Sub13) this.aClass253_42.method6594(local26);
			if (local52 == null) {
				local52 = Static79.method2070(this.aClass237_143, arg1, arg2);
				if (local52 == null) {
					return null;
				}
				this.aClass253_42.method6591(local52, local26);
			}
			local33 = local52.method2074(arg0);
			if (local33 == null) {
				return null;
			} else {
				local52.method8640();
				this.aClass253_43.method6591(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B[II)Lclient!cba;")
	public Class8_Sub9_Sub1 method8276(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass237_143.method6311() == 1) {
			return this.method8275(arg0, 0, arg1);
		} else if (this.aClass237_143.method6315(arg1) == 1) {
			return this.method8275(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
