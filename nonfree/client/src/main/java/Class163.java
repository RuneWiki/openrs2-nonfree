import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class163 {

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "[I")
	public static final int[] anIntArray430 = new int[32];

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "Lclient!uc;")
	private final Class198 aClass198_31 = new Class198(256);

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "Lclient!uc;")
	private final Class198 aClass198_32 = new Class198(256);

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "Lclient!am;")
	private final Class11 aClass11_109;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "Lclient!am;")
	private final Class11 aClass11_108;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray430[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!am;Lclient!am;)V")
	public Class163(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1) {
		this.aClass11_109 = arg0;
		this.aClass11_108 = arg1;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z[III)Lclient!wo;")
	private Class4_Sub5_Sub1 method4350(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg1 >>> 12 | (arg1 & 0xC0000FFF) << 4) ^ arg2;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class4_Sub5_Sub1 local31 = (Class4_Sub5_Sub1) this.aClass198_32.method5261(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(57) Class112 local57 = Static362.method3033(this.aClass11_109, arg1, arg2);
			if (local57 == null) {
				return null;
			}
			local31 = local57.method3031();
			this.aClass198_32.method5267(local24, local31);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray94.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([III)Lclient!wo;")
	public Class4_Sub5_Sub1 method4354(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass11_108.method277() == 1) {
			return this.method4355(0, arg0, arg1);
		} else if (this.aClass11_108.method292(arg1) == 1) {
			return this.method4355(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II[II)Lclient!wo;")
	private Class4_Sub5_Sub1 method4355(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = arg2 ^ ((arg0 & 0xC0000FFF) << 4 | arg0 >>> 12);
		@Pc(27) int local27 = local21 | arg0 << 16;
		@Pc(32) long local32 = (long) local27 ^ 0x100000000L;
		@Pc(39) Class4_Sub5_Sub1 local39 = (Class4_Sub5_Sub1) this.aClass198_32.method5261(local32);
		if (local39 != null) {
			return local39;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(58) Class4_Sub38 local58 = (Class4_Sub38) this.aClass198_31.method5261(local32);
			if (local58 == null) {
				local58 = Static300.method5078(this.aClass11_108, arg0, arg2);
				if (local58 == null) {
					return null;
				}
				this.aClass198_31.method5267(local32, local58);
			}
			local39 = local58.method5082(arg1);
			if (local39 == null) {
				return null;
			} else {
				local58.method5667();
				this.aClass198_32.method5267(local32, local39);
				return local39;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "([III)Lclient!wo;")
	public Class4_Sub5_Sub1 method4356(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass11_109.method277() == 1) {
			return this.method4350(arg0, 0, arg1);
		} else if (this.aClass11_109.method292(arg1) == 1) {
			return this.method4350(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
