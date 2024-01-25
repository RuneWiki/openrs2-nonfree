import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class196 {

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "[I")
	public static final int[] anIntArray278 = new int[120];

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "Lclient!ia;")
	private Class11 aClass11_52;

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "Lclient!ia;")
	private final Class11 aClass11_51 = new Class11();

	static {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < 120; local15++) {
			@Pc(20) int local20 = local15 + 1;
			@Pc(33) int local33 = (int) ((double) local20 + Math.pow(2.0D, (double) local20 / 7.0D) * 300.0D);
			local13 += local33;
			anIntArray278[local15] = local13 / 4;
		}
	}

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "()V")
	public Class196() {
		this.aClass11_51.aClass11_68 = this.aClass11_51;
		this.aClass11_51.aClass11_67 = this.aClass11_51;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)Lclient!ia;")
	public Class11 method4024() {
		@Pc(12) Class11 local12 = this.aClass11_51.aClass11_67;
		if (this.aClass11_51 == local12) {
			this.aClass11_52 = null;
			return null;
		} else {
			this.aClass11_52 = local12.aClass11_67;
			return local12;
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)Lclient!ia;")
	public Class11 method4026() {
		@Pc(7) Class11 local7 = this.aClass11_51.aClass11_68;
		if (local7 == this.aClass11_51) {
			this.aClass11_52 = null;
			return null;
		} else {
			this.aClass11_52 = local7.aClass11_68;
			return local7;
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)Lclient!ia;")
	public Class11 method4027() {
		@Pc(11) Class11 local11 = this.aClass11_51.aClass11_67;
		if (local11 == this.aClass11_51) {
			return null;
		} else {
			local11.method7200();
			return local11;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)Lclient!ia;")
	public Class11 method4028() {
		@Pc(6) Class11 local6 = this.aClass11_52;
		if (local6 == this.aClass11_51) {
			this.aClass11_52 = null;
			return null;
		} else {
			this.aClass11_52 = local6.aClass11_67;
			return local6;
		}
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(B)I")
	public int method4029() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) Class11 local16 = this.aClass11_51.aClass11_67; local16 != this.aClass11_51; local16 = local16.aClass11_67) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(B)Z")
	public boolean method4030() {
		return this.aClass11_51 == this.aClass11_51.aClass11_67;
	}

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "(B)V")
	public void method4031() {
		while (true) {
			@Pc(5) Class11 local5 = this.aClass11_51.aClass11_67;
			if (this.aClass11_51 == local5) {
				this.aClass11_52 = null;
				return;
			}
			local5.method7200();
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!ia;B)V")
	public void method4032(@OriginalArg(0) Class11 arg0) {
		if (arg0.aClass11_68 != null) {
			arg0.method7200();
		}
		arg0.aClass11_68 = this.aClass11_51.aClass11_68;
		arg0.aClass11_67 = this.aClass11_51;
		arg0.aClass11_68.aClass11_67 = arg0;
		arg0.aClass11_67.aClass11_68 = arg0;
	}
}
