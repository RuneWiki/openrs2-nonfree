import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class52 {

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Lclient!bo;")
	private final Class24 aClass24_5 = new Class24(256);

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "Lclient!bo;")
	private final Class24 aClass24_6 = new Class24(256);

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "Lclient!ir;")
	private final Class100 aClass100_27;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "Lclient!ir;")
	private final Class100 aClass100_28;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!ir;Lclient!ir;)V")
	public Class52(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class100 arg1) {
		this.aClass100_27 = arg0;
		this.aClass100_28 = arg1;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II[I)Lclient!hh;")
	public Class3_Sub17_Sub1 method1111(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass100_27.method2306() == 1) {
			return this.method1118(arg0, 0, arg1);
		} else if (this.aClass100_27.method2309(arg0) == 1) {
			return this.method1118(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([III)Lclient!hh;")
	public Class3_Sub17_Sub1 method1114(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass100_28.method2306() == 1) {
			return this.method1117(arg0, 0, arg1);
		} else if (this.aClass100_28.method2309(arg1) == 1) {
			return this.method1117(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I[III)Lclient!hh;")
	private Class3_Sub17_Sub1 method1117(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg1 >>> 12 | (arg1 & 0xF0000FFF) << 4);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class3_Sub17_Sub1 local33 = (Class3_Sub17_Sub1) this.aClass24_6.method609(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(52) Class3_Sub19 local52 = (Class3_Sub19) this.aClass24_5.method609(local26);
			if (local52 == null) {
				local52 = Static96.method1629(this.aClass100_28, arg1, arg2);
				if (local52 == null) {
					return null;
				}
				this.aClass24_5.method598(local26, local52);
			}
			local33 = local52.method1633(arg0);
			if (local33 == null) {
				return null;
			} else {
				local52.method5717();
				this.aClass24_6.method598(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZII[I)Lclient!hh;")
	private Class3_Sub17_Sub1 method1118(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = (arg1 << 4 & 0xFFF5 | arg1 >>> 12) ^ arg0;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class3_Sub17_Sub1 local31 = (Class3_Sub17_Sub1) this.aClass24_6.method609(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(49) Class143 local49 = Static365.method3605(this.aClass100_27, arg1, arg0);
			if (local49 == null) {
				return null;
			}
			local31 = local49.method3607();
			this.aClass24_6.method598(local24, local31);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray48.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
