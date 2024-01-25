import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class58 {

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "Lclient!qi;")
	private final Class208 aClass208_6 = new Class208(256);

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "Lclient!qi;")
	private final Class208 aClass208_7 = new Class208(256);

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "Lclient!oi;")
	private final Class185 aClass185_21;

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "Lclient!oi;")
	private final Class185 aClass185_22;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lclient!oi;Lclient!oi;)V")
	public Class58(@OriginalArg(0) Class185 arg0, @OriginalArg(1) Class185 arg1) {
		this.aClass185_21 = arg1;
		this.aClass185_22 = arg0;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I[II)Lclient!cj;")
	public Class1_Sub8_Sub1 method948(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass185_22.method4010() == 1) {
			return this.method950(0, arg1, arg0);
		} else if (this.aClass185_22.method4011(arg0) == 1) {
			return this.method950(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(III[I)Lclient!cj;")
	private Class1_Sub8_Sub1 method949(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = (arg0 >>> 12 | (arg0 & 0xFFF) << 4) ^ arg1;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(34) long local34 = (long) local21 ^ 0x100000000L;
		@Pc(41) Class1_Sub8_Sub1 local41 = (Class1_Sub8_Sub1) this.aClass208_7.method4405(local34);
		if (local41 != null) {
			return local41;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(60) Class1_Sub33 local60 = (Class1_Sub33) this.aClass208_6.method4405(local34);
			if (local60 == null) {
				local60 = Static287.method3806(this.aClass185_21, arg0, arg1);
				if (local60 == null) {
					return null;
				}
				this.aClass208_6.method4413(local34, local60);
			}
			local41 = local60.method3802(arg2);
			if (local41 == null) {
				return null;
			} else {
				local60.method5953();
				this.aClass208_7.method4413(local34, local41);
				return local41;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I[IBI)Lclient!cj;")
	private Class1_Sub8_Sub1 method950(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg0 >>> 12 | (arg0 & 0xFFF) << 4);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub8_Sub1 local31 = (Class1_Sub8_Sub1) this.aClass208_7.method4405(local24);
		if (local31 != null) {
			return local31;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(60) Class194 local60 = Static473.method4118(this.aClass185_22, arg0, arg2);
			if (local60 == null) {
				return null;
			}
			local31 = local60.method4120();
			this.aClass208_7.method4413(local24, local31);
			if (arg1 != null) {
				arg1[0] -= local31.aByteArray12.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "([IZI)Lclient!cj;")
	public Class1_Sub8_Sub1 method956(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass185_21.method4010() == 1) {
			return this.method949(0, arg1, arg0);
		} else if (this.aClass185_21.method4011(arg1) == 1) {
			return this.method949(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
