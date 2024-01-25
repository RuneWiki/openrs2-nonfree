import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class52 {

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "Lclient!qp;")
	private final Class280 aClass280_6 = new Class280(256);

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "Lclient!qp;")
	private final Class280 aClass280_7 = new Class280(256);

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "Lclient!la;")
	private final Class196 aClass196_20;

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "Lclient!la;")
	private final Class196 aClass196_21;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!la;Lclient!la;)V")
	public Class52(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class196 arg1) {
		this.aClass196_20 = arg1;
		this.aClass196_21 = arg0;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI[II)Lclient!jda;")
	private Class3_Sub30_Sub1 method1760(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg2 >>> 12 | (arg2 & 0xFFF) << 4) ^ arg0;
		@Pc(26) int local26 = local15 | arg2 << 16;
		@Pc(29) long local29 = (long) local26;
		@Pc(36) Class3_Sub30_Sub1 local36 = (Class3_Sub30_Sub1) this.aClass280_7.method7107(local29);
		if (local36 != null) {
			return local36;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(54) Class217 local54 = Static651.method5786(this.aClass196_21, arg2, arg0);
			if (local54 == null) {
				return null;
			}
			local36 = local54.method5785();
			this.aClass280_7.method7109(local36, local29);
			if (arg1 != null) {
				arg1[0] -= local36.aByteArray55.length;
			}
			return local36;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "([IIB)Lclient!jda;")
	public Class3_Sub30_Sub1 method1761(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass196_20.method5125() == 1) {
			return this.method1764(arg0, arg1, 0);
		} else if (this.aClass196_20.method5118(arg1) == 1) {
			return this.method1764(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(B[III)Lclient!jda;")
	private Class3_Sub30_Sub1 method1764(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1 ^ ((arg2 & 0x20000FFF) << 4 | arg2 >>> 12);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(31) long local31 = (long) local21 ^ 0x100000000L;
		@Pc(38) Class3_Sub30_Sub1 local38 = (Class3_Sub30_Sub1) this.aClass280_7.method7107(local31);
		if (local38 != null) {
			return local38;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(60) Class3_Sub43 local60 = (Class3_Sub43) this.aClass280_6.method7107(local31);
			if (local60 == null) {
				local60 = Static425.method6657(this.aClass196_20, arg2, arg1);
				if (local60 == null) {
					return null;
				}
				this.aClass280_6.method7109(local60, local31);
			}
			local38 = local60.method6658(arg0);
			if (local38 == null) {
				return null;
			} else {
				local60.method8769();
				this.aClass280_7.method7109(local38, local31);
				return local38;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "([IZI)Lclient!jda;")
	public Class3_Sub30_Sub1 method1766(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass196_21.method5125() == 1) {
			return this.method1760(arg1, arg0, 0);
		} else if (this.aClass196_21.method5118(arg1) == 1) {
			return this.method1760(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
