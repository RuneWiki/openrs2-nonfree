import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class199 {

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "Lclient!qr;")
	private final Class306 aClass306_22 = new Class306(256);

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "Lclient!qr;")
	private final Class306 aClass306_23 = new Class306(256);

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "Lclient!gda;")
	private final Class126 aClass126_142;

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "Lclient!gda;")
	private final Class126 aClass126_143;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!gda;Lclient!gda;)V")
	public Class199(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class126 arg1) {
		this.aClass126_142 = arg0;
		this.aClass126_143 = arg1;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B[II)Lclient!jg;")
	public Class5_Sub27_Sub1 method4648(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass126_142.method3082() == 1) {
			return this.method4652(arg0, 0, arg1);
		} else if (this.aClass126_142.method3062(arg1) == 1) {
			return this.method4652(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "([III)Lclient!jg;")
	public Class5_Sub27_Sub1 method4649(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass126_143.method3082() == 1) {
			return this.method4654(arg0, 0, arg1);
		} else if (this.aClass126_143.method3062(arg1) == 1) {
			return this.method4654(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B[III)Lclient!jg;")
	private Class5_Sub27_Sub1 method4652(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = ((arg1 & 0x40000FFF) << 4 | arg1 >>> 12) ^ arg2;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class5_Sub27_Sub1 local31 = (Class5_Sub27_Sub1) this.aClass306_23.method6943(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(56) Class115 local56 = Static685.method2837(this.aClass126_142, arg1, arg2);
			if (local56 == null) {
				return null;
			}
			local31 = local56.method2836();
			this.aClass306_23.method6944(local31, local24, -12002);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray46.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[III)Lclient!jg;")
	private Class5_Sub27_Sub1 method4654(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(23) int local23 = arg2 ^ (arg1 >>> 12 | (arg1 & 0xF0000FFF) << 4);
		@Pc(29) int local29 = local23 | arg1 << 16;
		@Pc(34) long local34 = (long) local29 ^ 0x100000000L;
		@Pc(41) Class5_Sub27_Sub1 local41 = (Class5_Sub27_Sub1) this.aClass306_23.method6943(local34);
		if (local41 != null) {
			return local41;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(67) Class5_Sub22 local67 = (Class5_Sub22) this.aClass306_22.method6943(local34);
			if (local67 == null) {
				local67 = Static182.method3146(this.aClass126_143, arg1, arg2);
				if (local67 == null) {
					return null;
				}
				this.aClass306_22.method6944(local67, local34, -12002);
			}
			local41 = local67.method3147(arg0);
			if (local41 == null) {
				return null;
			} else {
				local67.method9222();
				this.aClass306_23.method6944(local41, local34, -12002);
				return local41;
			}
		} else {
			return null;
		}
	}
}
