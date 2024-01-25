import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class184 {

	@OriginalMember(owner = "client!os", name = "l", descriptor = "[I")
	public static final int[] anIntArray349 = new int[16384];

	@OriginalMember(owner = "client!os", name = "o", descriptor = "[I")
	public static final int[] anIntArray350 = new int[16384];

	@OriginalMember(owner = "client!os", name = "n", descriptor = "Lclient!fi;")
	private Class38 aClass38_22;

	@OriginalMember(owner = "client!os", name = "h", descriptor = "Lclient!fi;")
	private final Class38 aClass38_21 = new Class38();

	static {
		@Pc(18) double local18 = 3.834951969714103E-4D;
		for (@Pc(20) int local20 = 0; local20 < 16384; local20++) {
			anIntArray349[local20] = (int) (Math.sin((double) local20 * local18) * 32768.0D);
			anIntArray350[local20] = (int) (Math.cos((double) local20 * local18) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V")
	public Class184() {
		this.aClass38_21.aClass38_23 = this.aClass38_21;
		this.aClass38_21.aClass38_24 = this.aClass38_21;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)Lclient!fi;")
	public Class38 method4206() {
		@Pc(12) Class38 local12 = this.aClass38_21.aClass38_23;
		if (local12 == this.aClass38_21) {
			this.aClass38_22 = null;
			return null;
		} else {
			this.aClass38_22 = local12.aClass38_23;
			return local12;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BLclient!fi;)V")
	public void method4207(@OriginalArg(1) Class38 arg0) {
		if (arg0.aClass38_23 != null) {
			arg0.method5069();
		}
		arg0.aClass38_24 = this.aClass38_21;
		arg0.aClass38_23 = this.aClass38_21.aClass38_23;
		arg0.aClass38_23.aClass38_24 = arg0;
		arg0.aClass38_24.aClass38_23 = arg0;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(B)Lclient!fi;")
	public Class38 method4208() {
		@Pc(7) Class38 local7 = this.aClass38_21.aClass38_24;
		if (this.aClass38_21 == local7) {
			return null;
		} else {
			local7.method5069();
			return local7;
		}
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(I)I")
	public int method4209() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class38 local11 = this.aClass38_21.aClass38_24;
		while (this.aClass38_21 != local11) {
			local11 = local11.aClass38_24;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(I)Lclient!fi;")
	public Class38 method4212() {
		@Pc(7) Class38 local7 = this.aClass38_21.aClass38_24;
		if (this.aClass38_21 == local7) {
			this.aClass38_22 = null;
			return null;
		} else {
			this.aClass38_22 = local7.aClass38_24;
			return local7;
		}
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(B)Z")
	public boolean method4214() {
		return this.aClass38_21 == this.aClass38_21.aClass38_24;
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(B)Lclient!fi;")
	public Class38 method4215() {
		@Pc(6) Class38 local6 = this.aClass38_22;
		if (this.aClass38_21 == local6) {
			this.aClass38_22 = null;
			return null;
		} else {
			this.aClass38_22 = local6.aClass38_24;
			return local6;
		}
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(B)V")
	public void method4216() {
		while (true) {
			@Pc(14) Class38 local14 = this.aClass38_21.aClass38_24;
			if (this.aClass38_21 == local14) {
				this.aClass38_22 = null;
				return;
			}
			local14.method5069();
		}
	}
}
