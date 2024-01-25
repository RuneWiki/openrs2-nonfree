import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class219 {

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "Lclient!wa;")
	private final Class257 aClass257_25 = new Class257(256);

	@OriginalMember(owner = "client!rt", name = "o", descriptor = "Lclient!wa;")
	private final Class257 aClass257_26 = new Class257(256);

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "Lclient!ic;")
	private final Class113 aClass113_109;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "Lclient!ic;")
	private final Class113 aClass113_108;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lclient!ic;Lclient!ic;)V")
	public Class219(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class113 arg1) {
		this.aClass113_109 = arg1;
		this.aClass113_108 = arg0;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I[IB)Lclient!nq;")
	public Class1_Sub28_Sub1 method4566(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass113_108.method2272() == 1) {
			return this.method4568(arg1, 0, arg0);
		} else if (this.aClass113_108.method2271(arg0) == 1) {
			return this.method4568(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I[III)Lclient!nq;")
	private Class1_Sub28_Sub1 method4568(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg1 >>> 12 | (arg1 & 0xC0000FFF) << 4) ^ arg2;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub28_Sub1 local31 = (Class1_Sub28_Sub1) this.aClass257_26.method5503(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(54) Class39 local54 = Static456.method736(this.aClass113_108, arg1, arg2);
			if (local54 == null) {
				return null;
			}
			local31 = local54.method738();
			this.aClass257_26.method5504(local31, local24);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray48.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B[II)Lclient!nq;")
	public Class1_Sub28_Sub1 method4569(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass113_109.method2272() == 1) {
			return this.method4571(0, arg0, arg1);
		} else if (this.aClass113_109.method2271(arg1) == 1) {
			return this.method4571(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZ[II)Lclient!nq;")
	private Class1_Sub28_Sub1 method4571(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = arg2 ^ (arg0 >>> 12 | (arg0 & 0xD0000FFF) << 4);
		@Pc(26) int local26 = local20 | arg0 << 16;
		@Pc(31) long local31 = (long) local26 ^ 0x100000000L;
		@Pc(42) Class1_Sub28_Sub1 local42 = (Class1_Sub28_Sub1) this.aClass257_26.method5503(local31);
		if (local42 != null) {
			return local42;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(64) Class1_Sub16 local64 = (Class1_Sub16) this.aClass257_25.method5503(local31);
			if (local64 == null) {
				local64 = Static134.method1814(this.aClass113_109, arg0, arg2);
				if (local64 == null) {
					return null;
				}
				this.aClass257_25.method5504(local64, local31);
			}
			local42 = local64.method1808(arg1);
			if (local42 == null) {
				return null;
			} else {
				local64.method5617();
				this.aClass257_26.method5504(local42, local31);
				return local42;
			}
		} else {
			return null;
		}
	}
}
