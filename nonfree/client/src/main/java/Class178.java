import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class178 {

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "Lclient!tm;")
	private Class4_Sub1 aClass4_Sub1_56;

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "Lclient!tm;")
	private final Class4_Sub1 aClass4_Sub1_55 = new Class4_Sub1();

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
	public Class178() {
		this.aClass4_Sub1_55.aClass4_Sub1_62 = this.aClass4_Sub1_55;
		this.aClass4_Sub1_55.aClass4_Sub1_61 = this.aClass4_Sub1_55;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
	public void method4765() {
		while (true) {
			@Pc(5) Class4_Sub1 local5 = this.aClass4_Sub1_55.aClass4_Sub1_61;
			if (local5 == this.aClass4_Sub1_55) {
				this.aClass4_Sub1_56 = null;
				return;
			}
			local5.method5555();
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)I")
	public int method4766() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class4_Sub1 local11 = this.aClass4_Sub1_55.aClass4_Sub1_61; local11 != this.aClass4_Sub1_55; local11 = local11.aClass4_Sub1_61) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLclient!tm;)V")
	public void method4767(@OriginalArg(1) Class4_Sub1 arg0) {
		if (arg0.aClass4_Sub1_62 != null) {
			arg0.method5555();
		}
		arg0.aClass4_Sub1_62 = this.aClass4_Sub1_55.aClass4_Sub1_62;
		arg0.aClass4_Sub1_61 = this.aClass4_Sub1_55;
		arg0.aClass4_Sub1_62.aClass4_Sub1_61 = arg0;
		arg0.aClass4_Sub1_61.aClass4_Sub1_62 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)Lclient!tm;")
	public Class4_Sub1 method4771() {
		@Pc(11) Class4_Sub1 local11 = this.aClass4_Sub1_56;
		if (local11 == this.aClass4_Sub1_55) {
			this.aClass4_Sub1_56 = null;
			return null;
		} else {
			this.aClass4_Sub1_56 = local11.aClass4_Sub1_61;
			return local11;
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)Lclient!tm;")
	public Class4_Sub1 method4772() {
		@Pc(14) Class4_Sub1 local14 = this.aClass4_Sub1_55.aClass4_Sub1_61;
		if (local14 == this.aClass4_Sub1_55) {
			return null;
		} else {
			local14.method5555();
			return local14;
		}
	}

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)Lclient!tm;")
	public Class4_Sub1 method4773() {
		@Pc(14) Class4_Sub1 local14 = this.aClass4_Sub1_55.aClass4_Sub1_61;
		if (this.aClass4_Sub1_55 == local14) {
			this.aClass4_Sub1_56 = null;
			return null;
		} else {
			this.aClass4_Sub1_56 = local14.aClass4_Sub1_61;
			return local14;
		}
	}
}
