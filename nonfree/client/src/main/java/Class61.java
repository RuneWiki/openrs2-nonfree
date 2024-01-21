import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class61 {

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "Lclient!gj;")
	private final Class40 aClass40_7 = new Class40(256);

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "Lclient!gj;")
	private final Class40 aClass40_8 = new Class40(256);

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "Lclient!ke;")
	private final Class52 aClass52_30;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "Lclient!ke;")
	private final Class52 aClass52_31;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!ke;Lclient!ke;)V")
	public Class61(@OriginalArg(0) Class52 arg0, @OriginalArg(1) Class52 arg1) {
		this.aClass52_30 = arg0;
		this.aClass52_31 = arg1;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZI[I)Lclient!tb;")
	private Class3_Sub24_Sub1 method1761(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(20) int local20 = (arg0 << 4 & 0xFFF4 | arg0 >>> 12) ^ arg1;
		@Pc(26) int local26 = local20 | arg0 << 16;
		@Pc(29) long local29 = (long) local26;
		@Pc(36) Class3_Sub24_Sub1 local36 = (Class3_Sub24_Sub1) this.aClass40_8.method1029(local29);
		if (local36 != null) {
			return local36;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(54) Class7 local54 = Static214.method241(this.aClass52_30, arg0, arg1);
			if (local54 == null) {
				return null;
			}
			local36 = local54.method242();
			this.aClass40_8.method1027(local36, local29);
			if (arg2 != null) {
				arg2[0] -= local36.aByteArray47.length;
			}
			return local36;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II[I)Lclient!tb;")
	public Class3_Sub24_Sub1 method1763(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass52_31.method1550() == 1) {
			return this.method1765(arg1, arg0, 0);
		} else if (this.aClass52_31.method1575(arg0) == 1) {
			return this.method1765(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([IIII)Lclient!tb;")
	private Class3_Sub24_Sub1 method1765(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = (arg2 >>> 12 | (arg2 & 0xA0000FFF) << 4) ^ arg1;
		@Pc(26) int local26 = local20 | arg2 << 16;
		@Pc(31) long local31 = (long) local26 ^ 0x100000000L;
		@Pc(40) Class3_Sub24_Sub1 local40 = (Class3_Sub24_Sub1) this.aClass40_8.method1029(local31);
		if (local40 != null) {
			return local40;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(62) Class3_Sub14 local62 = (Class3_Sub14) this.aClass40_7.method1029(local31);
			if (local62 == null) {
				local62 = Static100.method1420(this.aClass52_31, arg2, arg1);
				if (local62 == null) {
					return null;
				}
				this.aClass40_7.method1027(local62, local31);
			}
			local40 = local62.method1424(arg0);
			if (local40 == null) {
				return null;
			} else {
				local62.method3320();
				this.aClass40_8.method1027(local40, local31);
				return local40;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI[I)Lclient!tb;")
	public Class3_Sub24_Sub1 method1767(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass52_30.method1550() == 1) {
			return this.method1761(0, arg0, arg1);
		} else if (this.aClass52_30.method1575(arg0) == 1) {
			return this.method1761(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
