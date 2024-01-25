import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class100 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "Lclient!aj;")
	private final Class10 aClass10_20 = new Class10(256);

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "Lclient!aj;")
	private final Class10 aClass10_21 = new Class10(256);

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "Lclient!rk;")
	private final Class180 aClass180_34;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "Lclient!rk;")
	private final Class180 aClass180_33;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!rk;Lclient!rk;)V")
	public Class100(@OriginalArg(0) Class180 arg0, @OriginalArg(1) Class180 arg1) {
		this.aClass180_34 = arg1;
		this.aClass180_33 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II[II)Lclient!kf;")
	private Class7_Sub20_Sub1 method2638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ (arg1 << 4 & 0xFFFC | arg1 >>> 12);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class7_Sub20_Sub1 local31 = (Class7_Sub20_Sub1) this.aClass10_21.method163(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(49) Class68 local49 = Static359.method1607(this.aClass180_33, arg1, arg0);
			if (local49 == null) {
				return null;
			}
			local31 = local49.method1606();
			this.aClass10_21.method161(local24, local31);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray50.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II[II)Lclient!kf;")
	private Class7_Sub20_Sub1 method2640(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg0 >>> 12 | (arg0 & 0x70000FFF) << 4);
		@Pc(26) int local26 = local15 | arg0 << 16;
		@Pc(31) long local31 = (long) local26 ^ 0x100000000L;
		@Pc(38) Class7_Sub20_Sub1 local38 = (Class7_Sub20_Sub1) this.aClass10_21.method163(local31);
		if (local38 != null) {
			return local38;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(59) Class7_Sub22 local59 = (Class7_Sub22) this.aClass10_20.method163(local31);
			if (local59 == null) {
				local59 = Static181.method3326(this.aClass180_34, arg0, arg2);
				if (local59 == null) {
					return null;
				}
				this.aClass10_20.method161(local31, local59);
			}
			local38 = local59.method3327(arg1);
			if (local38 == null) {
				return null;
			} else {
				local59.method5648();
				this.aClass10_21.method161(local31, local38);
				return local38;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II[I)Lclient!kf;")
	public Class7_Sub20_Sub1 method2641(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass180_33.method4576() == 1) {
			return this.method2638(arg0, 0, arg1);
		} else if (this.aClass180_33.method4553(arg0) == 1) {
			return this.method2638(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I[II)Lclient!kf;")
	public Class7_Sub20_Sub1 method2642(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass180_34.method4576() == 1) {
			return this.method2640(0, arg1, arg0);
		} else if (this.aClass180_34.method4553(arg0) == 1) {
			return this.method2640(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
