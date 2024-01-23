import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class109 {

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "Lclient!ik;")
	private Class70 aClass70_10 = new Class70(256);

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "Lclient!ik;")
	private Class70 aClass70_11 = new Class70(256);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Lclient!km;")
	private Class91 aClass91_139;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "Lclient!km;")
	private Class91 aClass91_140;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!km;Lclient!km;)V")
	public Class109(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1) {
		this.aClass91_139 = arg0;
		this.aClass91_140 = arg1;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[IB)Lclient!cc;")
	public Class1_Sub10_Sub1 method2933(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass91_140.method2492() == 1) {
			return this.method2938(0, arg1, arg0);
		} else if (this.aClass91_140.method2510(arg0) == 1) {
			return this.method2938(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[III)Lclient!cc;")
	private Class1_Sub10_Sub1 method2935(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg0 << 4 & 0xFFF2 | arg0 >>> 12);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub10_Sub1 local31 = (Class1_Sub10_Sub1) this.aClass70_11.method2075(local24);
		if (local31 != null) {
			return local31;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(58) Class169 local58 = Static310.method4228(this.aClass91_139, arg0, arg2);
			if (local58 == null) {
				return null;
			}
			local31 = local58.method4229();
			this.aClass70_11.method2084(local24, local31);
			if (arg1 != null) {
				arg1[0] -= local31.aByteArray10.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([IIB)Lclient!cc;")
	public Class1_Sub10_Sub1 method2937(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass91_139.method2492() == 1) {
			return this.method2935(0, arg0, arg1);
		} else if (this.aClass91_139.method2510(arg1) == 1) {
			return this.method2935(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB[II)Lclient!cc;")
	private Class1_Sub10_Sub1 method2938(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ ((arg0 & 0xE0000FFF) << 4 | arg0 >>> 12);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(35) Class1_Sub10_Sub1 local35 = (Class1_Sub10_Sub1) this.aClass70_11.method2075(local26);
		if (local35 != null) {
			return local35;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(55) Class1_Sub24 local55 = (Class1_Sub24) this.aClass70_10.method2075(local26);
			if (local55 == null) {
				local55 = Static182.method3050(this.aClass91_140, arg0, arg2);
				if (local55 == null) {
					return null;
				}
				this.aClass70_10.method2084(local26, local55);
			}
			local35 = local55.method3049(arg1);
			if (local35 == null) {
				return null;
			} else {
				local55.method4441();
				this.aClass70_11.method2084(local26, local35);
				return local35;
			}
		} else {
			return null;
		}
	}
}
