import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class79 {

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "Lclient!wd;")
	private final Class97 aClass97_19 = new Class97(256);

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "Lclient!wd;")
	private final Class97 aClass97_20 = new Class97(256);

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "Lclient!ab;")
	private final Class3 aClass3_29;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "Lclient!ab;")
	private final Class3 aClass3_30;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!ab;Lclient!ab;)V")
	public Class79(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		this.aClass3_29 = arg0;
		this.aClass3_30 = arg1;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[II)Lclient!qc;")
	public Class1_Sub22_Sub1 method2477(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass3_30.method3266() == 1) {
			return this.method2480(arg1, 0, arg0);
		} else if (this.aClass3_30.method3270(arg0) == 1) {
			return this.method2480(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I[II)Lclient!qc;")
	public Class1_Sub22_Sub1 method2478(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass3_29.method3266() == 1) {
			return this.method2481(arg0, arg1, 0);
		} else if (this.aClass3_29.method3270(arg1) == 1) {
			return this.method2481(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[III)Lclient!qc;")
	private Class1_Sub22_Sub1 method2480(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg1 << 4 & 0xFFFD | arg1 >>> 12) ^ arg2;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub22_Sub1 local33 = (Class1_Sub22_Sub1) this.aClass97_20.method3375(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(60) Class1_Sub18 local60 = (Class1_Sub18) this.aClass97_19.method3375(local26);
			if (local60 == null) {
				local60 = Static125.method1842(this.aClass3_30, arg1, arg2);
				if (local60 == null) {
					return null;
				}
				this.aClass97_19.method3374(local60, local26);
			}
			local33 = local60.method1849(arg0);
			if (local33 == null) {
				return null;
			} else {
				local60.method3414();
				this.aClass97_20.method3374(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I[III)Lclient!qc;")
	private Class1_Sub22_Sub1 method2481(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = (arg2 >>> 12 | (arg2 & 0xD0000FFF) << 4) ^ arg1;
		@Pc(21) int local21 = local11 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub22_Sub1 local31 = (Class1_Sub22_Sub1) this.aClass97_20.method3375(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(56) Class4 local56 = Static211.method91(this.aClass3_29, arg2, arg1);
			if (local56 == null) {
				return null;
			}
			local31 = local56.method88();
			this.aClass97_20.method3374(local31, local24);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray43.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
