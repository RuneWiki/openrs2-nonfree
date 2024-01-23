import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class88 {

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "Lclient!sc;")
	private Class102 aClass102_16 = new Class102(256);

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "Lclient!sc;")
	private Class102 aClass102_17 = new Class102(256);

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "Lclient!mb;")
	private Class70 aClass70_32;

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "Lclient!mb;")
	private Class70 aClass70_33;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!mb;Lclient!mb;)V")
	public Class88(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class70 arg1) {
		this.aClass70_32 = arg0;
		this.aClass70_33 = arg1;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([IIZ)Lclient!oh;")
	public Class1_Sub6_Sub1 method2688(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass70_33.method3514() == 1) {
			return this.method2689(arg1, arg0, 0);
		} else if (this.aClass70_33.method3532(arg1) == 1) {
			return this.method2689(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II[II)Lclient!oh;")
	private Class1_Sub6_Sub1 method2689(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = ((arg2 & 0x60000FFF) << 4 | arg2 >>> 12) ^ arg0;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub6_Sub1 local33 = (Class1_Sub6_Sub1) this.aClass102_17.method3093(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(55) Class1_Sub20 local55 = (Class1_Sub20) this.aClass102_16.method3093(local26);
			if (local55 == null) {
				local55 = Static121.method2117(this.aClass70_33, arg2, arg0);
				if (local55 == null) {
					return null;
				}
				this.aClass102_16.method3083(local55, local26);
			}
			local33 = local55.method2125(arg1);
			if (local33 == null) {
				return null;
			} else {
				local55.method3758();
				this.aClass102_17.method3083(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II[I)Lclient!oh;")
	public Class1_Sub6_Sub1 method2694(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass70_32.method3514() == 1) {
			return this.method2695(arg0, 0, arg1);
		} else if (this.aClass70_32.method3532(arg0) == 1) {
			return this.method2695(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(II[II)Lclient!oh;")
	private Class1_Sub6_Sub1 method2695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ (arg1 << 4 & 0xFFF1 | arg1 >>> 12);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub6_Sub1 local31 = (Class1_Sub6_Sub1) this.aClass102_17.method3093(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(57) Class91 local57 = Static238.method2725(this.aClass70_32, arg1, arg0);
			if (local57 == null) {
				return null;
			}
			local31 = local57.method2724();
			this.aClass102_17.method3083(local31, local24);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray32.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
