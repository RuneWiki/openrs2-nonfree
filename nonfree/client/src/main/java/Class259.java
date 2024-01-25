import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class259 {

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "Lclient!bu;")
	private final Class38 aClass38_36 = new Class38(256);

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "Lclient!bu;")
	private final Class38 aClass38_37 = new Class38(256);

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "Lclient!qs;")
	private final Class211 aClass211_86;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "Lclient!qs;")
	private final Class211 aClass211_87;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!qs;Lclient!qs;)V")
	public Class259(@OriginalArg(0) Class211 arg0, @OriginalArg(1) Class211 arg1) {
		this.aClass211_86 = arg0;
		this.aClass211_87 = arg1;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "([III)Lclient!mg;")
	public Class1_Sub12_Sub1 method5777(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass211_87.method4751() == 1) {
			return this.method5783(0, arg1, arg0);
		} else if (this.aClass211_87.method4772(arg1) == 1) {
			return this.method5783(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[II)Lclient!mg;")
	public Class1_Sub12_Sub1 method5781(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass211_86.method4751() == 1) {
			return this.method5782(arg1, 0, arg0);
		} else if (this.aClass211_86.method4772(arg0) == 1) {
			return this.method5782(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "([IIII)Lclient!mg;")
	private Class1_Sub12_Sub1 method5782(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(24) int local24 = arg2 ^ (arg1 >>> 12 | (arg1 & 0xF0000FFF) << 4);
		@Pc(30) int local30 = local24 | arg1 << 16;
		@Pc(33) long local33 = (long) local30;
		@Pc(40) Class1_Sub12_Sub1 local40 = (Class1_Sub12_Sub1) this.aClass38_37.method765(local33);
		if (local40 != null) {
			return local40;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(61) Class112 local61 = Static463.method2688(this.aClass211_86, arg1, arg2);
			if (local61 == null) {
				return null;
			}
			local40 = local61.method2690();
			this.aClass38_37.method766(local40, local33);
			if (arg0 != null) {
				arg0[0] -= local40.aByteArray54.length;
			}
			return local40;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(III[I)Lclient!mg;")
	private Class1_Sub12_Sub1 method5783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(20) int local20 = arg1 ^ ((arg0 & 0xC0000FFF) << 4 | arg0 >>> 12);
		@Pc(26) int local26 = local20 | arg0 << 16;
		@Pc(31) long local31 = (long) local26 ^ 0x100000000L;
		@Pc(38) Class1_Sub12_Sub1 local38 = (Class1_Sub12_Sub1) this.aClass38_37.method765(local31);
		if (local38 != null) {
			return local38;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(62) Class1_Sub6 local62 = (Class1_Sub6) this.aClass38_36.method765(local31);
			if (local62 == null) {
				local62 = Static40.method763(this.aClass211_87, arg0, arg1);
				if (local62 == null) {
					return null;
				}
				this.aClass38_36.method766(local62, local31);
			}
			local38 = local62.method760(arg2);
			if (local38 == null) {
				return null;
			} else {
				local62.method6178();
				this.aClass38_37.method766(local38, local31);
				return local38;
			}
		} else {
			return null;
		}
	}
}
