import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class90 {

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "Lclient!vl;")
	private Class186 aClass186_12 = new Class186(256);

	@OriginalMember(owner = "client!jo", name = "m", descriptor = "Lclient!vl;")
	private Class186 aClass186_13 = new Class186(256);

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "Lclient!th;")
	private Class168 aClass168_104;

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "Lclient!th;")
	private Class168 aClass168_105;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!th;Lclient!th;)V")
	public Class90(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class168 arg1) {
		this.aClass168_104 = arg0;
		this.aClass168_105 = arg1;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "([IIIB)Lclient!h;")
	private Class1_Sub11_Sub1 method2296(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(23) int local23 = arg2 ^ (arg1 << 4 & 0xFFFD | arg1 >>> 12);
		@Pc(29) int local29 = local23 | arg1 << 16;
		@Pc(34) long local34 = (long) local29 ^ 0x100000000L;
		@Pc(41) Class1_Sub11_Sub1 local41 = (Class1_Sub11_Sub1) this.aClass186_13.method4570(local34);
		if (local41 != null) {
			return local41;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(65) Class1_Sub6 local65 = (Class1_Sub6) this.aClass186_12.method4570(local34);
			if (local65 == null) {
				local65 = Static51.method987(this.aClass168_105, arg1, arg2);
				if (local65 == null) {
					return null;
				}
				this.aClass186_12.method4575(local34, local65);
			}
			local41 = local65.method985(arg0);
			if (local41 == null) {
				return null;
			} else {
				local65.method4767();
				this.aClass186_13.method4575(local34, local41);
				return local41;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II[II)Lclient!h;")
	private Class1_Sub11_Sub1 method2298(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg2 >>> 12 | arg2 << 4 & 0xFFF1) ^ arg0;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(29) long local29 = (long) local21;
		@Pc(36) Class1_Sub11_Sub1 local36 = (Class1_Sub11_Sub1) this.aClass186_13.method4570(local29);
		if (local36 != null) {
			return local36;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(60) Class172 local60 = Static325.method4139(this.aClass168_104, arg2, arg0);
			if (local60 == null) {
				return null;
			}
			local36 = local60.method4136();
			this.aClass186_13.method4575(local29, local36);
			if (arg1 != null) {
				arg1[0] -= local36.aByteArray51.length;
			}
			return local36;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BI[I)Lclient!h;")
	public Class1_Sub11_Sub1 method2300(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass168_104.method4075() == 1) {
			return this.method2298(arg0, arg1, 0);
		} else if (this.aClass168_104.method4068(arg0) == 1) {
			return this.method2298(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I[II)Lclient!h;")
	public Class1_Sub11_Sub1 method2302(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass168_105.method4075() == 1) {
			return this.method2296(arg0, 0, arg1);
		} else if (this.aClass168_105.method4068(arg1) == 1) {
			return this.method2296(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
