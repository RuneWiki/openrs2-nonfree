import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class36 {

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "[J")
	public static final long[] aLongArray3 = new long[256];

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "Lclient!vk;")
	private final Class207 aClass207_1 = new Class207(256);

	@OriginalMember(owner = "client!cp", name = "n", descriptor = "Lclient!vk;")
	private final Class207 aClass207_2 = new Class207(256);

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "Lclient!lm;")
	private final Class134 aClass134_22;

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "Lclient!lm;")
	private final Class134 aClass134_23;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(8) long local8 = (long) local4;
			for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
				if ((local8 & 0x1L) == 1L) {
					local8 = local8 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local8 >>>= 0x1;
				}
			}
			aLongArray3[local4] = local8;
		}
	}

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lclient!lm;Lclient!lm;)V")
	public Class36(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class134 arg1) {
		this.aClass134_22 = arg0;
		this.aClass134_23 = arg1;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "([III)Lclient!ig;")
	public Class1_Sub20_Sub1 method902(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass134_22.method3016() == 1) {
			return this.method904(arg1, 0, arg0);
		} else if (this.aClass134_22.method3020(arg1) == 1) {
			return this.method904(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I[IB)Lclient!ig;")
	public Class1_Sub20_Sub1 method903(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass134_23.method3016() == 1) {
			return this.method911(arg0, 0, arg1);
		} else if (this.aClass134_23.method3020(arg0) == 1) {
			return this.method911(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(III[I)Lclient!ig;")
	private Class1_Sub20_Sub1 method904(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(20) int local20 = arg0 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFFC);
		@Pc(26) int local26 = local20 | arg1 << 16;
		@Pc(29) long local29 = (long) local26;
		@Pc(36) Class1_Sub20_Sub1 local36 = (Class1_Sub20_Sub1) this.aClass207_2.method5555(local29);
		if (local36 != null) {
			return local36;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(54) Class110 local54 = Static362.method2217(this.aClass134_22, arg1, arg0);
			if (local54 == null) {
				return null;
			}
			local36 = local54.method2216();
			this.aClass207_2.method5552(local36, local29);
			if (arg2 != null) {
				arg2[0] -= local36.aByteArray23.length;
			}
			return local36;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(III[I)Lclient!ig;")
	private Class1_Sub20_Sub1 method911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(20) int local20 = (arg1 >>> 12 | arg1 << 4 & 0xFFF7) ^ arg0;
		@Pc(26) int local26 = local20 | arg1 << 16;
		@Pc(31) long local31 = (long) local26 ^ 0x100000000L;
		@Pc(38) Class1_Sub20_Sub1 local38 = (Class1_Sub20_Sub1) this.aClass207_2.method5555(local31);
		if (local38 != null) {
			return local38;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(57) Class1_Sub38 local57 = (Class1_Sub38) this.aClass207_1.method5555(local31);
			if (local57 == null) {
				local57 = Static255.method4561(this.aClass134_23, arg1, arg0);
				if (local57 == null) {
					return null;
				}
				this.aClass207_1.method5552(local57, local31);
			}
			local38 = local57.method4557(arg2);
			if (local38 == null) {
				return null;
			} else {
				local57.method5796();
				this.aClass207_2.method5552(local38, local31);
				return local38;
			}
		} else {
			return null;
		}
	}
}
