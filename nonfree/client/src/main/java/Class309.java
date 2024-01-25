import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class309 {

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "[I")
	public static final int[] anIntArray604 = new int[120];

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "Lclient!ru;")
	private Class9 aClass9_62;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "Lclient!ru;")
	private final Class9 aClass9_61 = new Class9();

	static {
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 120; local8++) {
			@Pc(13) int local13 = local8 + 1;
			@Pc(26) int local26 = (int) (Math.pow(2.0D, (double) local13 / 7.0D) * 300.0D + (double) local13);
			local6 += local26;
			anIntArray604[local8] = local6 / 4;
		}
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
	public Class309() {
		this.aClass9_61.aClass9_68 = this.aClass9_61;
		this.aClass9_61.aClass9_67 = this.aClass9_61;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)Lclient!ru;")
	public Class9 method6587() {
		@Pc(7) Class9 local7 = this.aClass9_61.aClass9_68;
		if (this.aClass9_61 == local7) {
			return null;
		} else {
			local7.method7465();
			return local7;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
	public void method6588() {
		while (true) {
			@Pc(5) Class9 local5 = this.aClass9_61.aClass9_68;
			if (local5 == this.aClass9_61) {
				this.aClass9_62 = null;
				return;
			}
			local5.method7465();
		}
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)Lclient!ru;")
	public Class9 method6589() {
		@Pc(14) Class9 local14 = this.aClass9_61.aClass9_67;
		if (this.aClass9_61 == local14) {
			this.aClass9_62 = null;
			return null;
		} else {
			this.aClass9_62 = local14.aClass9_67;
			return local14;
		}
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)Lclient!ru;")
	public Class9 method6590() {
		@Pc(13) Class9 local13 = this.aClass9_61.aClass9_68;
		if (local13 == this.aClass9_61) {
			this.aClass9_62 = null;
			return null;
		} else {
			this.aClass9_62 = local13.aClass9_68;
			return local13;
		}
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)I")
	public int method6593() {
		@Pc(7) int local7 = 0;
		for (@Pc(18) Class9 local18 = this.aClass9_61.aClass9_68; local18 != this.aClass9_61; local18 = local18.aClass9_68) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "(I)Lclient!ru;")
	public Class9 method6594() {
		@Pc(6) Class9 local6 = this.aClass9_62;
		if (this.aClass9_61 == local6) {
			this.aClass9_62 = null;
			return null;
		} else {
			this.aClass9_62 = local6.aClass9_68;
			return local6;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!ru;I)V")
	public void method6595(@OriginalArg(0) Class9 arg0) {
		if (arg0.aClass9_67 != null) {
			arg0.method7465();
		}
		arg0.aClass9_67 = this.aClass9_61.aClass9_67;
		arg0.aClass9_68 = this.aClass9_61;
		arg0.aClass9_67.aClass9_68 = arg0;
		arg0.aClass9_68.aClass9_67 = arg0;
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)Z")
	public boolean method6596() {
		return this.aClass9_61.aClass9_68 == this.aClass9_61;
	}
}
