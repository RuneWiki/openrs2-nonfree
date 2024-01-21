import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class3_Sub1_Sub16 extends Class3_Sub1 {

	@OriginalMember(owner = "client!rf", name = "R", descriptor = "F")
	private float aFloat3;

	@OriginalMember(owner = "client!rf", name = "wb", descriptor = "[I")
	private int[] anIntArray346;

	@OriginalMember(owner = "client!rf", name = "O", descriptor = "Z")
	public boolean aBoolean217 = false;

	@OriginalMember(owner = "client!rf", name = "rb", descriptor = "Lclient!rg;")
	private final Class68 aClass68_1;

	@OriginalMember(owner = "client!rf", name = "M", descriptor = "Z")
	public boolean aBoolean216;

	@OriginalMember(owner = "client!rf", name = "P", descriptor = "Z")
	public final boolean aBoolean218;

	@OriginalMember(owner = "client!rf", name = "pb", descriptor = "I")
	public final int anInt3253;

	@OriginalMember(owner = "client!rf", name = "vb", descriptor = "I")
	public int anInt3257;

	@OriginalMember(owner = "client!rf", name = "ab", descriptor = "I")
	private int anInt3244;

	@OriginalMember(owner = "client!rf", name = "eb", descriptor = "I")
	private int anInt3247;

	@OriginalMember(owner = "client!rf", name = "W", descriptor = "I")
	private int anInt3243;

	@OriginalMember(owner = "client!rf", name = "cb", descriptor = "I")
	private int anInt3246;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!ff;)V")
	public Class3_Sub1_Sub16(@OriginalArg(0) Class3_Sub12 arg0) {
		this.aClass68_1 = new Class68(arg0);
		@Pc(14) int local14 = arg0.method1354();
		this.aBoolean216 = (local14 & 0x2) != 0;
		this.aBoolean218 = (local14 & 0x1) != 0;
		this.anInt3253 = arg0.method1354();
		this.anInt3257 = arg0.method1359();
		this.anInt3244 = arg0.method1354();
		if (this.anInt3244 == 255) {
			this.anInt3244 = 256;
		}
		@Pc(63) int local63 = arg0.method1354();
		@Pc(67) int local67 = arg0.method1354();
		this.anInt3247 = local67 >> 6 & 0x3;
		this.anInt3243 = local63 >> 6 & 0x3;
		this.anInt3246 = (local67 & 0x3F) - 6;
		arg0.method1354();
		arg0.method1354();
	}

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub16() {
		this.aClass68_1 = new Class68();
		this.anInt3253 = 1;
		this.aBoolean218 = true;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!og;FILclient!f;I)[I")
	public int[] method2352(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class13 arg3) {
		if (this.anIntArray346 == null || this.aFloat3 != arg1) {
			if (!this.aClass68_1.method2363(arg0, arg3)) {
				return null;
			}
			@Pc(33) int local33 = this.anInt3253 > arg2 ? arg2 : this.anInt3253;
			this.anIntArray346 = this.aClass68_1.method2361(arg0, local33, local33, arg3, true, (double) arg1);
			this.aFloat3 = arg1;
		}
		return this.anIntArray346;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)V")
	public void method2353(@OriginalArg(0) int arg0) {
		if (this.anIntArray346 == null) {
			return;
		}
		@Pc(38) short local38;
		@Pc(46) int local46;
		@Pc(53) int local53;
		@Pc(64) int local64;
		@Pc(66) int local66;
		@Pc(75) int local75;
		@Pc(89) int[] local89;
		if (this.anInt3247 != 0) {
			if (Static126.anIntArray310 == null || this.anIntArray346.length > Static126.anIntArray310.length) {
				Static126.anIntArray310 = new int[this.anIntArray346.length];
			}
			if (this.anIntArray346.length == 4096) {
				local38 = 64;
			} else {
				local38 = 128;
			}
			local46 = this.anIntArray346.length;
			local53 = arg0 * local38 * this.anInt3246;
			if (this.anInt3247 == 2) {
				local53 = -local53;
			}
			local64 = local46 - 1;
			for (local66 = 0; local66 < local46; local66++) {
				local75 = local64 & local66 + local53;
				Static126.anIntArray310[local66] = this.anIntArray346[local75];
			}
			local89 = this.anIntArray346;
			this.anIntArray346 = Static126.anIntArray310;
			Static126.anIntArray310 = local89;
		}
		if (this.anInt3243 == 0) {
			return;
		}
		if (Static126.anIntArray310 == null || Static126.anIntArray310.length < this.anIntArray346.length) {
			Static126.anIntArray310 = new int[this.anIntArray346.length];
		}
		if (this.anIntArray346.length == 4096) {
			local38 = 64;
		} else {
			local38 = 128;
		}
		local46 = this.anIntArray346.length;
		local64 = local38 - 1;
		local53 = this.anInt3246 * arg0;
		if (this.anInt3243 == 1) {
			local53 = -local53;
		}
		for (local66 = 0; local66 < local46; local66 += local38) {
			for (local75 = 0; local75 < local38; local75++) {
				@Pc(159) int local159 = local75 + local66;
				@Pc(169) int local169 = local66 + (local75 + local53 & local64);
				Static126.anIntArray310[local159] = this.anIntArray346[local169];
			}
		}
		local89 = this.anIntArray346;
		this.anIntArray346 = Static126.anIntArray310;
		Static126.anIntArray310 = local89;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!og;BILclient!f;)[I")
	public int[] method2354(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2) {
		if (this.aClass68_1.method2363(arg0, arg2)) {
			@Pc(32) int local32 = this.anInt3253 <= arg1 ? this.anInt3253 : arg1;
			return this.aClass68_1.method2361(arg0, local32, local32, arg2, false, 1.0D);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!og;Lclient!f;B)Z")
	public boolean method2355(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class13 arg1) {
		return this.aClass68_1.method2363(arg0, arg1);
	}

	@OriginalMember(owner = "client!rf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}
}
