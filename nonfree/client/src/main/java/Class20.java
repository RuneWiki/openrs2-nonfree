import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class20 {

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "Lclient!sba;")
	private final Class297 aClass297_1 = new Class297(256);

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "Lclient!sba;")
	private final Class297 aClass297_2 = new Class297(256);

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "Lclient!ri;")
	private final Class284 aClass284_5;

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "Lclient!ri;")
	private final Class284 aClass284_6;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!ri;Lclient!ri;)V")
	public Class20(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Class284 arg1) {
		this.aClass284_5 = arg1;
		this.aClass284_6 = arg0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(III[I)Lclient!qr;")
	private Class3_Sub17_Sub1 method209(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(25) int local25 = (arg0 << 4 & 0xFFF9 | arg0 >>> 12) ^ arg1;
		@Pc(31) int local31 = local25 | arg0 << 16;
		@Pc(34) long local34 = (long) local31;
		@Pc(41) Class3_Sub17_Sub1 local41 = (Class3_Sub17_Sub1) this.aClass297_2.method6531(local34);
		if (local41 != null) {
			return local41;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(59) Class199 local59 = Static602.method4799(this.aClass284_6, arg0, arg1);
			if (local59 == null) {
				return null;
			}
			local41 = local59.method4797();
			this.aClass297_2.method6537(local34, local41);
			if (arg2 != null) {
				arg2[0] -= local41.aByteArray195.length;
			}
			return local41;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIZ[I)Lclient!qr;")
	private Class3_Sub17_Sub1 method214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ (arg1 >>> 12 | (arg1 & 0x40000FFF) << 4);
		@Pc(26) int local26 = local15 | arg1 << 16;
		@Pc(31) long local31 = (long) local26 ^ 0x100000000L;
		@Pc(38) Class3_Sub17_Sub1 local38 = (Class3_Sub17_Sub1) this.aClass297_2.method6531(local31);
		if (local38 != null) {
			return local38;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(60) Class3_Sub32 local60 = (Class3_Sub32) this.aClass297_1.method6531(local31);
			if (local60 == null) {
				local60 = Static281.method4244(this.aClass284_5, arg1, arg0);
				if (local60 == null) {
					return null;
				}
				this.aClass297_1.method6537(local31, local60);
			}
			local38 = local60.method4239(arg2);
			if (local38 == null) {
				return null;
			} else {
				local60.method8128();
				this.aClass297_2.method6537(local31, local38);
				return local38;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II[I)Lclient!qr;")
	public Class3_Sub17_Sub1 method215(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass284_5.method6322() == 1) {
			return this.method214(arg0, 0, arg1);
		} else if (this.aClass284_5.method6354(arg0) == 1) {
			return this.method214(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I[IB)Lclient!qr;")
	public Class3_Sub17_Sub1 method216(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass284_6.method6322() == 1) {
			return this.method209(0, arg0, arg1);
		} else if (this.aClass284_6.method6354(arg0) == 1) {
			return this.method209(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
