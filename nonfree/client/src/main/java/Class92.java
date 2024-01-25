import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eia")
public final class Class92 {

	@OriginalMember(owner = "client!eia", name = "c", descriptor = "Lclient!baa;")
	private final Class25 aClass25_10 = new Class25(256);

	@OriginalMember(owner = "client!eia", name = "l", descriptor = "Lclient!baa;")
	private final Class25 aClass25_11 = new Class25(256);

	@OriginalMember(owner = "client!eia", name = "h", descriptor = "Lclient!uu;")
	private final Class343 aClass343_66;

	@OriginalMember(owner = "client!eia", name = "f", descriptor = "Lclient!uu;")
	private final Class343 aClass343_65;

	@OriginalMember(owner = "client!eia", name = "<init>", descriptor = "(Lclient!uu;Lclient!uu;)V")
	public Class92(@OriginalArg(0) Class343 arg0, @OriginalArg(1) Class343 arg1) {
		this.aClass343_66 = arg1;
		this.aClass343_65 = arg0;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "([IIII)Lclient!wo;")
	private Class3_Sub18_Sub1 method2302(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg1 >>> 12 | arg1 << 4 & 0xFFFE) ^ arg2;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class3_Sub18_Sub1 local31 = (Class3_Sub18_Sub1) this.aClass25_11.method426(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(54) Class120 local54 = Static654.method2849(this.aClass343_65, arg1, arg2);
			if (local54 == null) {
				return null;
			}
			local31 = local54.method2850();
			this.aClass25_11.method434(local24, local31);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray106.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(Z[III)Lclient!wo;")
	private Class3_Sub18_Sub1 method2303(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = ((arg2 & 0x40000FFF) << 4 | arg2 >>> 12) ^ arg1;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class3_Sub18_Sub1 local33 = (Class3_Sub18_Sub1) this.aClass25_11.method426(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(57) Class3_Sub28 local57 = (Class3_Sub28) this.aClass25_10.method426(local26);
			if (local57 == null) {
				local57 = Static288.method4661(this.aClass343_66, arg2, arg1);
				if (local57 == null) {
					return null;
				}
				this.aClass25_10.method434(local26, local57);
			}
			local33 = local57.method4672(arg0);
			if (local33 == null) {
				return null;
			} else {
				local57.method8682();
				this.aClass25_11.method434(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(IB[I)Lclient!wo;")
	public Class3_Sub18_Sub1 method2304(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass343_66.method8144() == 1) {
			return this.method2303(arg1, arg0, 0);
		} else if (this.aClass343_66.method8157(arg0) == 1) {
			return this.method2303(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "([IIB)Lclient!wo;")
	public Class3_Sub18_Sub1 method2308(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass343_65.method8144() == 1) {
			return this.method2302(arg0, 0, arg1);
		} else if (this.aClass343_65.method8157(arg1) == 1) {
			return this.method2302(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
