import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class105 {

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "Lclient!mn;")
	private final Class163 aClass163_15 = new Class163(256);

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "Lclient!mn;")
	private final Class163 aClass163_16 = new Class163(256);

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "Lclient!mg;")
	private final Class160 aClass160_21;

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "Lclient!mg;")
	private final Class160 aClass160_22;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!mg;Lclient!mg;)V")
	public Class105(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Class160 arg1) {
		this.aClass160_21 = arg1;
		this.aClass160_22 = arg0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[III)Lclient!ck;")
	private Class2_Sub10_Sub1 method2405(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = (arg2 >>> 12 | (arg2 & 0xFFF) << 4) ^ arg0;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class2_Sub10_Sub1 local33 = (Class2_Sub10_Sub1) this.aClass163_16.method3769(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(52) Class2_Sub41 local52 = (Class2_Sub41) this.aClass163_15.method3769(local26);
			if (local52 == null) {
				local52 = Static403.method5307(this.aClass160_21, arg2, arg0);
				if (local52 == null) {
					return null;
				}
				this.aClass163_15.method3764(local26, local52);
			}
			local33 = local52.method5304(arg1);
			if (local33 == null) {
				return null;
			} else {
				local52.method5866();
				this.aClass163_16.method3764(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[II)Lclient!ck;")
	public Class2_Sub10_Sub1 method2408(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass160_22.method3715() == 1) {
			return this.method2409(0, arg1, arg0);
		} else if (this.aClass160_22.method3722(arg1) == 1) {
			return this.method2409(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II[II)Lclient!ck;")
	private Class2_Sub10_Sub1 method2409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(21) int local21 = arg1 ^ (arg0 >>> 12 | arg0 << 4 & 0xFFFD);
		@Pc(27) int local27 = local21 | arg0 << 16;
		@Pc(30) long local30 = (long) local27;
		@Pc(39) Class2_Sub10_Sub1 local39 = (Class2_Sub10_Sub1) this.aClass163_16.method3769(local30);
		if (local39 != null) {
			return local39;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(57) Class222 local57 = Static464.method4830(this.aClass160_22, arg0, arg1);
			if (local57 == null) {
				return null;
			}
			local39 = local57.method4829();
			this.aClass163_16.method3764(local30, local39);
			if (arg2 != null) {
				arg2[0] -= local39.aByteArray23.length;
			}
			return local39;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I[II)Lclient!ck;")
	public Class2_Sub10_Sub1 method2410(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass160_21.method3715() == 1) {
			return this.method2405(arg0, arg1, 0);
		} else if (this.aClass160_21.method3722(arg0) == 1) {
			return this.method2405(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
