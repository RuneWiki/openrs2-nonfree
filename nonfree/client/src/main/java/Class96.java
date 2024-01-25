import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class96 {

	@OriginalMember(owner = "client!ij", name = "o", descriptor = "Lclient!dj;")
	private final Class43 aClass43_17 = new Class43(256);

	@OriginalMember(owner = "client!ij", name = "q", descriptor = "Lclient!dj;")
	private final Class43 aClass43_18 = new Class43(256);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "Lclient!tj;")
	private final Class193 aClass193_48;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "Lclient!tj;")
	private final Class193 aClass193_49;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!tj;Lclient!tj;)V")
	public Class96(@OriginalArg(0) Class193 arg0, @OriginalArg(1) Class193 arg1) {
		this.aClass193_48 = arg1;
		this.aClass193_49 = arg0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "([IBI)Lclient!bg;")
	public Class4_Sub7_Sub1 method2840(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass193_48.method5037() == 1) {
			return this.method2843(arg1, arg0, 0);
		} else if (this.aClass193_48.method5055(arg1) == 1) {
			return this.method2843(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZI[I)Lclient!bg;")
	private Class4_Sub7_Sub1 method2842(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = (arg1 << 4 & 0xFFF7 | arg1 >>> 12) ^ arg0;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class4_Sub7_Sub1 local31 = (Class4_Sub7_Sub1) this.aClass43_18.method1273(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(52) Class152 local52 = Static365.method4183(this.aClass193_49, arg1, arg0);
			if (local52 == null) {
				return null;
			}
			local31 = local52.method4185();
			this.aClass43_18.method1276(local31, local24);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray5.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI[II)Lclient!bg;")
	private Class4_Sub7_Sub1 method2843(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0 ^ (arg2 << 4 & 0xFFF9 | arg2 >>> 12);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(34) long local34 = (long) local21 ^ 0x100000000L;
		@Pc(41) Class4_Sub7_Sub1 local41 = (Class4_Sub7_Sub1) this.aClass43_18.method1273(local34);
		if (local41 != null) {
			return local41;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(63) Class4_Sub23 local63 = (Class4_Sub23) this.aClass43_17.method1273(local34);
			if (local63 == null) {
				local63 = Static163.method3184(this.aClass193_48, arg2, arg0);
				if (local63 == null) {
					return null;
				}
				this.aClass43_17.method1276(local63, local34);
			}
			local41 = local63.method3176(arg1);
			if (local41 == null) {
				return null;
			} else {
				local63.method5687();
				this.aClass43_18.method1276(local41, local34);
				return local41;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB[I)Lclient!bg;")
	public Class4_Sub7_Sub1 method2845(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass193_49.method5037() == 1) {
			return this.method2842(arg0, 0, arg1);
		} else if (this.aClass193_49.method5055(arg0) == 1) {
			return this.method2842(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
