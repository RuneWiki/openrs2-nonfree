import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class82 {

	@OriginalMember(owner = "client!fj", name = "k", descriptor = "Lclient!fa;")
	private final Class77 aClass77_12 = new Class77(256);

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "Lclient!fa;")
	private final Class77 aClass77_13 = new Class77(256);

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "Lclient!ui;")
	private final Class230 aClass230_33;

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "Lclient!ui;")
	private final Class230 aClass230_34;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!ui;Lclient!ui;)V")
	public Class82(@OriginalArg(0) Class230 arg0, @OriginalArg(1) Class230 arg1) {
		this.aClass230_33 = arg1;
		this.aClass230_34 = arg0;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I[II)Lclient!uk;")
	public Class1_Sub31_Sub1 method1459(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass230_33.method4969() == 1) {
			return this.method1461(0, arg0, arg1);
		} else if (this.aClass230_33.method4956(arg0) == 1) {
			return this.method1461(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z[III)Lclient!uk;")
	private Class1_Sub31_Sub1 method1460(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = ((arg2 & 0x70000FFF) << 4 | arg2 >>> 12) ^ arg1;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub31_Sub1 local31 = (Class1_Sub31_Sub1) this.aClass77_13.method1368(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(52) Class159 local52 = Static403.method3166(this.aClass230_34, arg2, arg1);
			if (local52 == null) {
				return null;
			}
			local31 = local52.method3168();
			this.aClass77_13.method1370(local24, local31);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray84.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBI[I)Lclient!uk;")
	private Class1_Sub31_Sub1 method1461(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg1 ^ (arg0 >>> 12 | arg0 << 4 & 0xFFFA);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub31_Sub1 local33 = (Class1_Sub31_Sub1) this.aClass77_13.method1368(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(62) Class1_Sub26 local62 = (Class1_Sub26) this.aClass77_12.method1368(local26);
			if (local62 == null) {
				local62 = Static217.method3026(this.aClass230_33, arg0, arg1);
				if (local62 == null) {
					return null;
				}
				this.aClass77_12.method1370(local26, local62);
			}
			local33 = local62.method3033(arg2);
			if (local33 == null) {
				return null;
			} else {
				local62.method5577();
				this.aClass77_13.method1370(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "([IIB)Lclient!uk;")
	public Class1_Sub31_Sub1 method1463(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass230_34.method4969() == 1) {
			return this.method1460(arg0, arg1, 0);
		} else if (this.aClass230_34.method4956(arg1) == 1) {
			return this.method1460(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
