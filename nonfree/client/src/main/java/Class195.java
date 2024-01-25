import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class195 {

	@OriginalMember(owner = "client!km", name = "g", descriptor = "Lclient!gca;")
	private final Class118 aClass118_29 = new Class118(256);

	@OriginalMember(owner = "client!km", name = "o", descriptor = "Lclient!gca;")
	private final Class118 aClass118_30 = new Class118(256);

	@OriginalMember(owner = "client!km", name = "h", descriptor = "Lclient!wu;")
	private final Class380 aClass380_71;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "Lclient!wu;")
	private final Class380 aClass380_70;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!wu;Lclient!wu;)V")
	public Class195(@OriginalArg(0) Class380 arg0, @OriginalArg(1) Class380 arg1) {
		this.aClass380_71 = arg0;
		this.aClass380_70 = arg1;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IB[II)Lclient!aaa;")
	private Class2_Sub1_Sub1 method4100(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ ((arg0 & 0xFFF) << 4 | arg0 >>> 12);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class2_Sub1_Sub1 local31 = (Class2_Sub1_Sub1) this.aClass118_30.method2595(local24);
		if (local31 != null) {
			return local31;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(49) Class88 local49 = Static647.method1810(this.aClass380_71, arg0, arg2);
			if (local49 == null) {
				return null;
			}
			local31 = local49.method1813();
			this.aClass118_30.method2601(local31, local24);
			if (arg1 != null) {
				arg1[0] -= local31.aByteArray1.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I[III)Lclient!aaa;")
	private Class2_Sub1_Sub1 method4101(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg0 ^ (arg2 << 4 & 0xFFF7 | arg2 >>> 12);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class2_Sub1_Sub1 local33 = (Class2_Sub1_Sub1) this.aClass118_30.method2595(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(64) Class2_Sub39 local64 = (Class2_Sub39) this.aClass118_29.method2595(local26);
			if (local64 == null) {
				local64 = Static477.method6427(this.aClass380_70, arg2, arg0);
				if (local64 == null) {
					return null;
				}
				this.aClass118_29.method2601(local64, local26);
			}
			local33 = local64.method6420(arg1);
			if (local33 == null) {
				return null;
			} else {
				local64.method8653();
				this.aClass118_30.method2601(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I[II)Lclient!aaa;")
	public Class2_Sub1_Sub1 method4103(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass380_70.method8639() == 1) {
			return this.method4101(arg0, arg1, 0);
		} else if (this.aClass380_70.method8631(arg0) == 1) {
			return this.method4101(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BI[I)Lclient!aaa;")
	public Class2_Sub1_Sub1 method4104(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass380_71.method8639() == 1) {
			return this.method4100(0, arg1, arg0);
		} else if (this.aClass380_71.method8631(arg0) == 1) {
			return this.method4100(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
