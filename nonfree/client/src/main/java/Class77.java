import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class77 {

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "Lclient!mt;")
	private final Class164 aClass164_13 = new Class164(256);

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "Lclient!mt;")
	private final Class164 aClass164_14 = new Class164(256);

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "Lclient!ok;")
	private final Class178 aClass178_36;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "Lclient!ok;")
	private final Class178 aClass178_35;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lclient!ok;Lclient!ok;)V")
	public Class77(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class178 arg1) {
		this.aClass178_36 = arg0;
		this.aClass178_35 = arg1;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([III)Lclient!lv;")
	public Class7_Sub31_Sub1 method1913(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass178_36.method3832() == 1) {
			return this.method1919(arg0, 0, arg1);
		} else if (this.aClass178_36.method3833(arg1) == 1) {
			return this.method1919(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II[I)Lclient!lv;")
	public Class7_Sub31_Sub1 method1915(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass178_35.method3832() == 1) {
			return this.method1918(arg0, arg1, 0);
		} else if (this.aClass178_35.method3833(arg0) == 1) {
			return this.method1918(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II[II)Lclient!lv;")
	private Class7_Sub31_Sub1 method1918(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = ((arg2 & 0xB0000FFF) << 4 | arg2 >>> 12) ^ arg0;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class7_Sub31_Sub1 local33 = (Class7_Sub31_Sub1) this.aClass164_14.method3512(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(58) Class7_Sub35 local58 = (Class7_Sub35) this.aClass164_13.method3512(local26);
			if (local58 == null) {
				local58 = Static306.method4056(this.aClass178_35, arg2, arg0);
				if (local58 == null) {
					return null;
				}
				this.aClass164_13.method3508(local26, local58);
			}
			local33 = local58.method4059(arg1);
			if (local33 == null) {
				return null;
			} else {
				local58.method5802();
				this.aClass164_14.method3508(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I[III)Lclient!lv;")
	private Class7_Sub31_Sub1 method1919(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ ((arg1 & 0x20000FFF) << 4 | arg1 >>> 12);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class7_Sub31_Sub1 local31 = (Class7_Sub31_Sub1) this.aClass164_14.method3512(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(52) Class23 local52 = Static461.method295(this.aClass178_36, arg1, arg2);
			if (local52 == null) {
				return null;
			}
			local31 = local52.method297();
			this.aClass164_14.method3508(local24, local31);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray56.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
