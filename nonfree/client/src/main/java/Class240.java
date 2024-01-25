import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class240 {

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "Lclient!cv;")
	private final Class51 aClass51_35 = new Class51(256);

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "Lclient!cv;")
	private final Class51 aClass51_36 = new Class51(256);

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "Lclient!hh;")
	private final Class109 aClass109_91;

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "Lclient!hh;")
	private final Class109 aClass109_90;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!hh;Lclient!hh;)V")
	public Class240(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class109 arg1) {
		this.aClass109_91 = arg0;
		this.aClass109_90 = arg1;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(III[I)Lclient!bv;")
	private Class1_Sub6_Sub1 method5488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = (arg0 >>> 12 | (arg0 & 0x70000FFF) << 4) ^ arg1;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub6_Sub1 local33 = (Class1_Sub6_Sub1) this.aClass51_36.method930(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(57) Class1_Sub29 local57 = (Class1_Sub29) this.aClass51_35.method930(local26);
			if (local57 == null) {
				local57 = Static258.method3657(this.aClass109_90, arg0, arg1);
				if (local57 == null) {
					return null;
				}
				this.aClass51_35.method931(local57, local26);
			}
			local33 = local57.method3656(arg2);
			if (local33 == null) {
				return null;
			} else {
				local57.method5965();
				this.aClass51_36.method931(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "([IIII)Lclient!bv;")
	private Class1_Sub6_Sub1 method5489(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg1 << 4 & 0xFFFB | arg1 >>> 12);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub6_Sub1 local31 = (Class1_Sub6_Sub1) this.aClass51_36.method930(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(49) Class215 local49 = Static463.method5099(this.aClass109_91, arg1, arg2);
			if (local49 == null) {
				return null;
			}
			local31 = local49.method5098();
			this.aClass51_36.method931(local31, local24);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray6.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "([IZI)Lclient!bv;")
	public Class1_Sub6_Sub1 method5491(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass109_91.method2324() == 1) {
			return this.method5489(arg0, 0, arg1);
		} else if (this.aClass109_91.method2322(arg1) == 1) {
			return this.method5489(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II[I)Lclient!bv;")
	public Class1_Sub6_Sub1 method5493(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass109_90.method2324() == 1) {
			return this.method5488(0, arg0, arg1);
		} else if (this.aClass109_90.method2322(arg0) == 1) {
			return this.method5488(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
