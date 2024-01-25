import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class290 {

	@OriginalMember(owner = "client!qk", name = "m", descriptor = "[I")
	public static final int[] anIntArray547 = new int[16384];

	@OriginalMember(owner = "client!qk", name = "k", descriptor = "[I")
	public static final int[] anIntArray546 = new int[16384];

	@OriginalMember(owner = "client!qk", name = "l", descriptor = "Lclient!rg;")
	private Class2_Sub7 aClass2_Sub7_49;

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "Lclient!rg;")
	public final Class2_Sub7 aClass2_Sub7_48 = new Class2_Sub7();

	static {
		@Pc(38) double local38 = 3.834951969714103E-4D;
		for (@Pc(40) int local40 = 0; local40 < 16384; local40++) {
			anIntArray546[local40] = (int) (Math.sin(local38 * (double) local40) * 16384.0D);
			anIntArray547[local40] = (int) (Math.cos((double) local40 * local38) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
	public Class290() {
		this.aClass2_Sub7_48.aClass2_Sub7_66 = this.aClass2_Sub7_48;
		this.aClass2_Sub7_48.aClass2_Sub7_67 = this.aClass2_Sub7_48;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)Lclient!rg;")
	public Class2_Sub7 method6673() {
		@Pc(6) Class2_Sub7 local6 = this.aClass2_Sub7_49;
		if (local6 == this.aClass2_Sub7_48) {
			this.aClass2_Sub7_49 = null;
			return null;
		} else {
			this.aClass2_Sub7_49 = local6.aClass2_Sub7_66;
			return local6;
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
	public void method6675() {
		while (true) {
			@Pc(7) Class2_Sub7 local7 = this.aClass2_Sub7_48.aClass2_Sub7_66;
			if (local7 == this.aClass2_Sub7_48) {
				this.aClass2_Sub7_49 = null;
				return;
			}
			local7.method8504();
		}
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)Lclient!rg;")
	public Class2_Sub7 method6676() {
		@Pc(15) Class2_Sub7 local15 = this.aClass2_Sub7_48.aClass2_Sub7_66;
		if (this.aClass2_Sub7_48 == local15) {
			return null;
		} else {
			local15.method8504();
			return local15;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)I")
	public int method6677() {
		@Pc(7) int local7 = 0;
		@Pc(19) Class2_Sub7 local19 = this.aClass2_Sub7_48.aClass2_Sub7_66;
		while (local19 != this.aClass2_Sub7_48) {
			local19 = local19.aClass2_Sub7_66;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!rg;I)V")
	public void method6678(@OriginalArg(0) Class2_Sub7 arg0) {
		if (arg0.aClass2_Sub7_67 != null) {
			arg0.method8504();
		}
		arg0.aClass2_Sub7_66 = this.aClass2_Sub7_48;
		arg0.aClass2_Sub7_67 = this.aClass2_Sub7_48.aClass2_Sub7_67;
		arg0.aClass2_Sub7_67.aClass2_Sub7_66 = arg0;
		arg0.aClass2_Sub7_66.aClass2_Sub7_67 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)Lclient!rg;")
	public Class2_Sub7 method6680() {
		@Pc(7) Class2_Sub7 local7 = this.aClass2_Sub7_48.aClass2_Sub7_66;
		if (this.aClass2_Sub7_48 == local7) {
			this.aClass2_Sub7_49 = null;
			return null;
		} else {
			this.aClass2_Sub7_49 = local7.aClass2_Sub7_66;
			return local7;
		}
	}
}
