import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class36 {

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "Lclient!qh;")
	private final Class199 aClass199_32 = new Class199(256);

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "Lclient!qh;")
	private final Class199 aClass199_33 = new Class199(256);

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "Lclient!fo;")
	private final Class82 aClass82_13;

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "Lclient!fo;")
	private final Class82 aClass82_14;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!fo;Lclient!fo;)V")
	public Class36(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class82 arg1) {
		this.aClass82_13 = arg0;
		this.aClass82_14 = arg1;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[II)Lclient!jj;")
	public Class1_Sub25_Sub1 method824(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass82_14.method1825() == 1) {
			return this.method825(0, arg0, arg1);
		} else if (this.aClass82_14.method1823(arg0) == 1) {
			return this.method825(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III[I)Lclient!jj;")
	private Class1_Sub25_Sub1 method825(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg1 ^ ((arg0 & 0xC0000FFF) << 4 | arg0 >>> 12);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub25_Sub1 local33 = (Class1_Sub25_Sub1) this.aClass199_33.method4387(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(61) Class1_Sub29 local61 = (Class1_Sub29) this.aClass199_32.method4387(local26);
			if (local61 == null) {
				local61 = Static212.method3134(this.aClass82_14, arg0, arg1);
				if (local61 == null) {
					return null;
				}
				this.aClass199_32.method4383(local26, local61);
			}
			local33 = local61.method3135(arg2);
			if (local33 == null) {
				return null;
			} else {
				local61.method5915();
				this.aClass199_33.method4383(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([IBI)Lclient!jj;")
	public Class1_Sub25_Sub1 method827(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass82_13.method1825() == 1) {
			return this.method830(arg0, arg1, 0);
		} else if (this.aClass82_13.method1823(arg1) == 1) {
			return this.method830(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([IIBI)Lclient!jj;")
	private Class1_Sub25_Sub1 method830(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = ((arg2 & 0xE0000FFF) << 4 | arg2 >>> 12) ^ arg1;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub25_Sub1 local31 = (Class1_Sub25_Sub1) this.aClass199_33.method4387(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(54) Class211 local54 = Static467.method4741(this.aClass82_13, arg2, arg1);
			if (local54 == null) {
				return null;
			}
			local31 = local54.method4738();
			this.aClass199_33.method4383(local24, local31);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray37.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
