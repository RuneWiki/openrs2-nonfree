import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class100 {

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "J")
	private long aLong110;

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "Lclient!ac;")
	private Class4_Sub1 aClass4_Sub1_31;

	@OriginalMember(owner = "client!hu", name = "g", descriptor = "[Lclient!ac;")
	private final Class4_Sub1[] aClass4_Sub1Array1;

	@OriginalMember(owner = "client!hu", name = "i", descriptor = "I")
	private final int anInt3143;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(I)V")
	public Class100(@OriginalArg(0) int arg0) {
		this.aClass4_Sub1Array1 = new Class4_Sub1[arg0];
		this.anInt3143 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class4_Sub1 local20 = this.aClass4_Sub1Array1[local10] = new Class4_Sub1();
			local20.aClass4_Sub1_55 = local20;
			local20.aClass4_Sub1_56 = local20;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)Lclient!ac;")
	public Class4_Sub1 method2670() {
		if (this.aClass4_Sub1_31 == null) {
			return null;
		}
		@Pc(23) Class4_Sub1 local23 = this.aClass4_Sub1Array1[(int) ((long) (this.anInt3143 - 1) & this.aLong110)];
		while (this.aClass4_Sub1_31 != local23) {
			if (this.aClass4_Sub1_31.aLong198 == this.aLong110) {
				@Pc(35) Class4_Sub1 local35 = this.aClass4_Sub1_31;
				this.aClass4_Sub1_31 = this.aClass4_Sub1_31.aClass4_Sub1_55;
				return local35;
			}
			this.aClass4_Sub1_31 = this.aClass4_Sub1_31.aClass4_Sub1_55;
		}
		this.aClass4_Sub1_31 = null;
		return null;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(JI)Lclient!ac;")
	public Class4_Sub1 method2671(@OriginalArg(0) long arg0) {
		this.aLong110 = arg0;
		@Pc(20) Class4_Sub1 local20 = this.aClass4_Sub1Array1[(int) (arg0 & (long) (this.anInt3143 - 1))];
		for (this.aClass4_Sub1_31 = local20.aClass4_Sub1_55; this.aClass4_Sub1_31 != local20; this.aClass4_Sub1_31 = this.aClass4_Sub1_31.aClass4_Sub1_55) {
			if (this.aClass4_Sub1_31.aLong198 == arg0) {
				@Pc(39) Class4_Sub1 local39 = this.aClass4_Sub1_31;
				this.aClass4_Sub1_31 = this.aClass4_Sub1_31.aClass4_Sub1_55;
				return local39;
			}
		}
		this.aClass4_Sub1_31 = null;
		return null;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(BLclient!ac;J)V")
	public void method2674(@OriginalArg(1) Class4_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass4_Sub1_56 != null) {
			arg0.method4662();
		}
		@Pc(21) Class4_Sub1 local21 = this.aClass4_Sub1Array1[(int) (arg1 & (long) (this.anInt3143 - 1))];
		arg0.aClass4_Sub1_55 = local21;
		arg0.aClass4_Sub1_56 = local21.aClass4_Sub1_56;
		arg0.aClass4_Sub1_56.aClass4_Sub1_55 = arg0;
		arg0.aLong198 = arg1;
		arg0.aClass4_Sub1_55.aClass4_Sub1_56 = arg0;
	}
}
