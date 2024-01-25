import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class226 {

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "Lclient!fw;")
	private final Class125 aClass125_23 = new Class125(256);

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "Lclient!fw;")
	private final Class125 aClass125_24 = new Class125(256);

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "Lclient!rg;")
	private final Class310 aClass310_74;

	@OriginalMember(owner = "client!ls", name = "m", descriptor = "Lclient!rg;")
	private final Class310 aClass310_75;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!rg;Lclient!rg;)V")
	public Class226(@OriginalArg(0) Class310 arg0, @OriginalArg(1) Class310 arg1) {
		this.aClass310_74 = arg0;
		this.aClass310_75 = arg1;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I[IB)Lclient!pd;")
	public Class14_Sub19_Sub1 method5457(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass310_75.method7800() == 1) {
			return this.method5458(arg1, 0, arg0);
		} else if (this.aClass310_75.method7773(arg0) == 1) {
			return this.method5458(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I[III)Lclient!pd;")
	private Class14_Sub19_Sub1 method5458(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = ((arg1 & 0xE0000FFF) << 4 | arg1 >>> 12) ^ arg2;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class14_Sub19_Sub1 local33 = (Class14_Sub19_Sub1) this.aClass125_24.method2630(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(56) Class14_Sub53 local56 = (Class14_Sub53) this.aClass125_23.method2630(local26);
			if (local56 == null) {
				local56 = Static659.method9198(this.aClass310_75, arg1, arg2);
				if (local56 == null) {
					return null;
				}
				this.aClass125_23.method2626(local56, local26);
			}
			local33 = local56.method9197(arg0);
			if (local33 == null) {
				return null;
			} else {
				local56.method9513();
				this.aClass125_24.method2626(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(I[III)Lclient!pd;")
	private Class14_Sub19_Sub1 method5461(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0 ^ (arg2 >>> 12 | arg2 << 4 & 0xFFFD);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class14_Sub19_Sub1 local31 = (Class14_Sub19_Sub1) this.aClass125_24.method2630(local24);
		if (local31 != null) {
			return local31;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(53) Class15 local53 = Static693.method239(this.aClass310_74, arg2, arg0);
			if (local53 == null) {
				return null;
			}
			local31 = local53.method242();
			this.aClass125_24.method2626(local31, local24);
			if (arg1 != null) {
				arg1[0] -= local31.aByteArray83.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(I[IB)Lclient!pd;")
	public Class14_Sub19_Sub1 method5463(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass310_74.method7800() == 1) {
			return this.method5461(arg0, arg1, 0);
		} else if (this.aClass310_74.method7773(arg0) == 1) {
			return this.method5461(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
