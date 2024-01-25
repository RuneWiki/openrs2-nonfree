import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class158 {

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "Lclient!lk;")
	private final Class209 aClass209_16 = new Class209(256);

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "Lclient!lk;")
	private final Class209 aClass209_17 = new Class209(256);

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "Lclient!ae;")
	private final Class8 aClass8_66;

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "Lclient!ae;")
	private final Class8 aClass8_65;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!ae;Lclient!ae;)V")
	public Class158(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8 arg1) {
		this.aClass8_66 = arg1;
		this.aClass8_65 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "([III)Lclient!fk;")
	public Class6_Sub21_Sub1 method3602(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass8_66.method279() == 1) {
			return this.method3604(arg1, 0, arg0);
		} else if (this.aClass8_66.method280(arg1) == 1) {
			return this.method3604(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II[IB)Lclient!fk;")
	private Class6_Sub21_Sub1 method3604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ (arg1 >>> 12 | (arg1 & 0xA0000FFF) << 4);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class6_Sub21_Sub1 local33 = (Class6_Sub21_Sub1) this.aClass209_17.method5038(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(52) Class6_Sub46 local52 = (Class6_Sub46) this.aClass209_16.method5038(local26);
			if (local52 == null) {
				local52 = Static495.method7150(this.aClass8_66, arg1, arg0);
				if (local52 == null) {
					return null;
				}
				this.aClass209_16.method5035(local26, local52);
			}
			local33 = local52.method7154(arg2);
			if (local33 == null) {
				return null;
			} else {
				local52.method9174();
				this.aClass209_17.method5035(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "([IIB)Lclient!fk;")
	public Class6_Sub21_Sub1 method3605(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass8_65.method279() == 1) {
			return this.method3606(arg1, arg0, 0);
		} else if (this.aClass8_65.method280(arg1) == 1) {
			return this.method3606(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[III)Lclient!fk;")
	private Class6_Sub21_Sub1 method3606(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0 ^ ((arg2 & 0x20000FFF) << 4 | arg2 >>> 12);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class6_Sub21_Sub1 local31 = (Class6_Sub21_Sub1) this.aClass209_17.method5038(local24);
		if (local31 != null) {
			return local31;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(53) Class133 local53 = Static682.method3029(this.aClass8_65, arg2, arg0);
			if (local53 == null) {
				return null;
			}
			local31 = local53.method3026();
			this.aClass209_17.method5035(local24, local31);
			if (arg1 != null) {
				arg1[0] -= local31.aByteArray29.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
