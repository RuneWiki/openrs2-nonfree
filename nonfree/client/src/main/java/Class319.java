import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public final class Class319 {

	@OriginalMember(owner = "client!qw", name = "h", descriptor = "[I")
	public static final int[] anIntArray609 = new int[120];

	@OriginalMember(owner = "client!qw", name = "f", descriptor = "Lclient!vc;")
	private Class9 aClass9_58;

	@OriginalMember(owner = "client!qw", name = "l", descriptor = "Lclient!vc;")
	private final Class9 aClass9_57 = new Class9();

	static {
		@Pc(88) int local88 = 0;
		for (@Pc(90) int local90 = 0; local90 < 120; local90++) {
			@Pc(95) int local95 = local90 + 1;
			@Pc(108) int local108 = (int) ((double) local95 + Math.pow(2.0D, (double) local95 / 7.0D) * 300.0D);
			local88 += local108;
			anIntArray609[local90] = local88 / 4;
		}
	}

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "()V")
	public Class319() {
		this.aClass9_57.aClass9_67 = this.aClass9_57;
		this.aClass9_57.aClass9_68 = this.aClass9_57;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Z)Lclient!vc;")
	public Class9 method7188() {
		@Pc(6) Class9 local6 = this.aClass9_58;
		if (this.aClass9_57 == local6) {
			this.aClass9_58 = null;
			return null;
		} else {
			this.aClass9_58 = local6.aClass9_67;
			return local6;
		}
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(I)Z")
	public boolean method7190() {
		return this.aClass9_57.aClass9_67 == this.aClass9_57;
	}

	@OriginalMember(owner = "client!qw", name = "f", descriptor = "(I)I")
	public int method7191() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class9 local11 = this.aClass9_57.aClass9_67;
		while (this.aClass9_57 != local11) {
			local11 = local11.aClass9_67;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!qw", name = "e", descriptor = "(I)V")
	public void method7192() {
		while (true) {
			@Pc(9) Class9 local9 = this.aClass9_57.aClass9_67;
			if (local9 == this.aClass9_57) {
				this.aClass9_58 = null;
				return;
			}
			local9.method9182();
		}
	}

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "(I)Lclient!vc;")
	public Class9 method7193() {
		@Pc(14) Class9 local14 = this.aClass9_57.aClass9_68;
		if (local14 == this.aClass9_57) {
			this.aClass9_58 = null;
			return null;
		} else {
			this.aClass9_58 = local14.aClass9_68;
			return local14;
		}
	}

	@OriginalMember(owner = "client!qw", name = "d", descriptor = "(I)Lclient!vc;")
	public Class9 method7195() {
		@Pc(7) Class9 local7 = this.aClass9_57.aClass9_67;
		if (local7 == this.aClass9_57) {
			this.aClass9_58 = null;
			return null;
		} else {
			this.aClass9_58 = local7.aClass9_67;
			return local7;
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILclient!vc;)V")
	public void method7196(@OriginalArg(1) Class9 arg0) {
		if (arg0.aClass9_68 != null) {
			arg0.method9182();
		}
		arg0.aClass9_68 = this.aClass9_57.aClass9_68;
		arg0.aClass9_67 = this.aClass9_57;
		arg0.aClass9_68.aClass9_67 = arg0;
		arg0.aClass9_67.aClass9_68 = arg0;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)Lclient!vc;")
	public Class9 method7197() {
		@Pc(14) Class9 local14 = this.aClass9_57.aClass9_67;
		if (this.aClass9_57 == local14) {
			return null;
		} else {
			local14.method9182();
			return local14;
		}
	}
}
