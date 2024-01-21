import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class82 {

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "[I")
	public static int[] anIntArray393 = new int[256];

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "Lclient!ka;")
	private Class3 aClass3_119;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "J")
	private long aLong109;

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "Lclient!ka;")
	private Class3 aClass3_120;

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
	private int anInt3487 = 0;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "[Lclient!ka;")
	private final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
	private final int anInt3478;

	static {
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			@Pc(35) int local35 = local32;
			for (@Pc(37) int local37 = 0; local37 < 8; local37++) {
				if ((local35 & 0x1) == 1) {
					local35 = local35 >>> 1 ^ 0xEDB88320;
				} else {
					local35 >>>= 0x1;
				}
			}
			anIntArray393[local32] = local35;
		}
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
	public Class82(@OriginalArg(0) int arg0) {
		this.aClass3Array1 = new Class3[arg0];
		this.anInt3478 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_117 = local23;
			local23.aClass3_118 = local23;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Lclient!ka;")
	public Class3 method2300() {
		@Pc(24) Class3 local24;
		if (this.anInt3487 > 0 && this.aClass3_120 != this.aClass3Array1[this.anInt3487 - 1]) {
			local24 = this.aClass3_120;
			this.aClass3_120 = local24.aClass3_117;
			return local24;
		}
		while (this.anInt3487 < this.anInt3478) {
			local24 = this.aClass3Array1[this.anInt3487++].aClass3_117;
			if (local24 != this.aClass3Array1[this.anInt3487 - 1]) {
				this.aClass3_120 = local24.aClass3_117;
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!ka;BJ)V")
	public void method2303(@OriginalArg(0) Class3 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass3_118 != null) {
			arg0.method2264();
		}
		@Pc(21) Class3 local21 = this.aClass3Array1[(int) (arg1 & (long) (this.anInt3478 - 1))];
		arg0.aClass3_117 = local21;
		arg0.aClass3_118 = local21.aClass3_118;
		arg0.aClass3_118.aClass3_117 = arg0;
		arg0.aClass3_117.aClass3_118 = arg0;
		arg0.aLong107 = arg1;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)Lclient!ka;")
	public Class3 method2304() {
		if (this.aClass3_119 == null) {
			return null;
		}
		@Pc(28) Class3 local28 = this.aClass3Array1[(int) (this.aLong109 & (long) (this.anInt3478 - 1))];
		while (this.aClass3_119 != local28) {
			if (this.aClass3_119.aLong107 == this.aLong109) {
				@Pc(39) Class3 local39 = this.aClass3_119;
				this.aClass3_119 = this.aClass3_119.aClass3_117;
				return local39;
			}
			this.aClass3_119 = this.aClass3_119.aClass3_117;
		}
		this.aClass3_119 = null;
		return null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IJ)Lclient!ka;")
	public Class3 method2305(@OriginalArg(1) long arg0) {
		this.aLong109 = arg0;
		@Pc(18) Class3 local18 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt3478 - 1))];
		for (this.aClass3_119 = local18.aClass3_117; this.aClass3_119 != local18; this.aClass3_119 = this.aClass3_119.aClass3_117) {
			if (this.aClass3_119.aLong107 == arg0) {
				@Pc(37) Class3 local37 = this.aClass3_119;
				this.aClass3_119 = this.aClass3_119.aClass3_117;
				return local37;
			}
		}
		this.aClass3_119 = null;
		return null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)Lclient!ka;")
	public Class3 method2306() {
		this.anInt3487 = 0;
		return this.method2300();
	}
}
