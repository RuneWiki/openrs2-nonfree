import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class65 {

	@OriginalMember(owner = "client!et", name = "m", descriptor = "[I")
	public static final int[] anIntArray88 = new int[16384];

	@OriginalMember(owner = "client!et", name = "l", descriptor = "[I")
	public static final int[] anIntArray87 = new int[16384];

	@OriginalMember(owner = "client!et", name = "n", descriptor = "Lclient!uh;")
	private Class3_Sub3 aClass3_Sub3_22;

	@OriginalMember(owner = "client!et", name = "b", descriptor = "Lclient!uh;")
	private final Class3_Sub3 aClass3_Sub3_21 = new Class3_Sub3();

	static {
		@Pc(67) double local67 = 3.834951969714103E-4D;
		for (@Pc(69) int local69 = 0; local69 < 16384; local69++) {
			anIntArray88[local69] = (int) (Math.sin(local67 * (double) local69) * 32768.0D);
			anIntArray87[local69] = (int) (Math.cos(local67 * (double) local69) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V")
	public Class65() {
		this.aClass3_Sub3_21.aClass3_Sub3_58 = this.aClass3_Sub3_21;
		this.aClass3_Sub3_21.aClass3_Sub3_57 = this.aClass3_Sub3_21;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)Lclient!uh;")
	public Class3_Sub3 method1684() {
		@Pc(14) Class3_Sub3 local14 = this.aClass3_Sub3_21.aClass3_Sub3_57;
		if (this.aClass3_Sub3_21 == local14) {
			this.aClass3_Sub3_22 = null;
			return null;
		} else {
			this.aClass3_Sub3_22 = local14.aClass3_Sub3_57;
			return local14;
		}
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(I)Lclient!uh;")
	public Class3_Sub3 method1685() {
		@Pc(12) Class3_Sub3 local12 = this.aClass3_Sub3_21.aClass3_Sub3_57;
		if (this.aClass3_Sub3_21 == local12) {
			return null;
		} else {
			local12.method6102();
			return local12;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!uh;)V")
	public void method1686(@OriginalArg(1) Class3_Sub3 arg0) {
		if (arg0.aClass3_Sub3_58 != null) {
			arg0.method6102();
		}
		arg0.aClass3_Sub3_57 = this.aClass3_Sub3_21;
		arg0.aClass3_Sub3_58 = this.aClass3_Sub3_21.aClass3_Sub3_58;
		arg0.aClass3_Sub3_58.aClass3_Sub3_57 = arg0;
		arg0.aClass3_Sub3_57.aClass3_Sub3_58 = arg0;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V")
	public void method1687() {
		while (true) {
			@Pc(9) Class3_Sub3 local9 = this.aClass3_Sub3_21.aClass3_Sub3_57;
			if (local9 == this.aClass3_Sub3_21) {
				this.aClass3_Sub3_22 = null;
				return;
			}
			local9.method6102();
		}
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(I)Lclient!uh;")
	public Class3_Sub3 method1688() {
		@Pc(6) Class3_Sub3 local6 = this.aClass3_Sub3_22;
		if (local6 == this.aClass3_Sub3_21) {
			this.aClass3_Sub3_22 = null;
			return null;
		} else {
			this.aClass3_Sub3_22 = local6.aClass3_Sub3_57;
			return local6;
		}
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(I)I")
	public int method1689() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class3_Sub3 local11 = this.aClass3_Sub3_21.aClass3_Sub3_57;
		while (local11 != this.aClass3_Sub3_21) {
			local11 = local11.aClass3_Sub3_57;
			local7++;
		}
		return local7;
	}
}
