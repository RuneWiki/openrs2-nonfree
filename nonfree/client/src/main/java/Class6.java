import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public final class Class6 {

	@OriginalMember(owner = "client!aea", name = "m", descriptor = "Lclient!lba;")
	private final Class218 aClass218_1 = new Class218(256);

	@OriginalMember(owner = "client!aea", name = "i", descriptor = "Lclient!lba;")
	private final Class218 aClass218_2 = new Class218(256);

	@OriginalMember(owner = "client!aea", name = "f", descriptor = "Lclient!nca;")
	private final Class254 aClass254_10;

	@OriginalMember(owner = "client!aea", name = "h", descriptor = "Lclient!nca;")
	private final Class254 aClass254_11;

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lclient!nca;Lclient!nca;)V")
	public Class6(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class254 arg1) {
		this.aClass254_10 = arg1;
		this.aClass254_11 = arg0;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IZI[I)Lclient!rb;")
	private Class2_Sub4_Sub1 method193(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(22) int local22 = arg1 ^ (arg0 >>> 12 | arg0 << 4 & 0xFFF3);
		@Pc(28) int local28 = local22 | arg0 << 16;
		@Pc(31) long local31 = (long) local28;
		@Pc(38) Class2_Sub4_Sub1 local38 = (Class2_Sub4_Sub1) this.aClass218_2.method5095(local31, 0);
		if (local38 != null) {
			return local38;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(63) Class250 local63 = Static735.method6017(this.aClass254_11, arg0, arg1);
			if (local63 == null) {
				return null;
			}
			local38 = local63.method6019();
			this.aClass218_2.method5099(local38, local31);
			if (arg2 != null) {
				arg2[0] -= local38.aByteArray102.length;
			}
			return local38;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(B[III)Lclient!rb;")
	private Class2_Sub4_Sub1 method196(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg1 >>> 12 | arg1 << 4 & 0xFFFB) ^ arg2;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class2_Sub4_Sub1 local33 = (Class2_Sub4_Sub1) this.aClass218_2.method5095(local26, 0);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(70) Class2_Sub17 local70 = (Class2_Sub17) this.aClass218_1.method5095(local26, 0);
			if (local70 == null) {
				local70 = Static115.method1663(this.aClass254_10, arg1, arg2);
				if (local70 == null) {
					return null;
				}
				this.aClass218_1.method5099(local70, local26);
			}
			local33 = local70.method1672(arg0);
			if (local33 == null) {
				return null;
			} else {
				local70.method9872();
				this.aClass218_2.method5099(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "([IZI)Lclient!rb;")
	public Class2_Sub4_Sub1 method197(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass254_11.method6094() == 1) {
			return this.method193(0, arg1, arg0);
		} else if (this.aClass254_11.method6101(arg1) == 1) {
			return this.method193(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "([III)Lclient!rb;")
	public Class2_Sub4_Sub1 method198(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass254_10.method6094() == 1) {
			return this.method196(arg0, 0, arg1);
		} else if (this.aClass254_10.method6101(arg1) == 1) {
			return this.method196(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
