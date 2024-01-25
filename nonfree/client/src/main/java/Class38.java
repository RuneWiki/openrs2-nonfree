import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class38 {

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "Lclient!jn;")
	private Class4_Sub1 aClass4_Sub1_18;

	@OriginalMember(owner = "client!cq", name = "k", descriptor = "J")
	private long aLong35;

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
	private final int anInt1572;

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "[Lclient!jn;")
	private final Class4_Sub1[] aClass4_Sub1Array1;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(I)V")
	public Class38(@OriginalArg(0) int arg0) {
		this.anInt1572 = arg0;
		this.aClass4_Sub1Array1 = new Class4_Sub1[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class4_Sub1 local20 = this.aClass4_Sub1Array1[local10] = new Class4_Sub1();
			local20.aClass4_Sub1_58 = local20;
			local20.aClass4_Sub1_57 = local20;
		}
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)Lclient!jn;")
	public Class4_Sub1 method1179() {
		if (this.aClass4_Sub1_18 == null) {
			return null;
		}
		@Pc(23) Class4_Sub1 local23 = this.aClass4_Sub1Array1[(int) ((long) (this.anInt1572 - 1) & this.aLong35)];
		while (this.aClass4_Sub1_18 != local23) {
			if (this.aClass4_Sub1_18.aLong226 == this.aLong35) {
				@Pc(35) Class4_Sub1 local35 = this.aClass4_Sub1_18;
				this.aClass4_Sub1_18 = this.aClass4_Sub1_18.aClass4_Sub1_57;
				return local35;
			}
			this.aClass4_Sub1_18 = this.aClass4_Sub1_18.aClass4_Sub1_57;
		}
		this.aClass4_Sub1_18 = null;
		return null;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BJ)Lclient!jn;")
	public Class4_Sub1 method1181(@OriginalArg(1) long arg0) {
		this.aLong35 = arg0;
		@Pc(20) Class4_Sub1 local20 = this.aClass4_Sub1Array1[(int) ((long) (this.anInt1572 - 1) & arg0)];
		for (this.aClass4_Sub1_18 = local20.aClass4_Sub1_57; this.aClass4_Sub1_18 != local20; this.aClass4_Sub1_18 = this.aClass4_Sub1_18.aClass4_Sub1_57) {
			if (arg0 == this.aClass4_Sub1_18.aLong226) {
				@Pc(47) Class4_Sub1 local47 = this.aClass4_Sub1_18;
				this.aClass4_Sub1_18 = this.aClass4_Sub1_18.aClass4_Sub1_57;
				return local47;
			}
		}
		this.aClass4_Sub1_18 = null;
		return null;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(JBLclient!jn;)V")
	public void method1182(@OriginalArg(0) long arg0, @OriginalArg(2) Class4_Sub1 arg1) {
		if (arg1.aClass4_Sub1_58 != null) {
			arg1.method5863();
		}
		@Pc(25) Class4_Sub1 local25 = this.aClass4_Sub1Array1[(int) (arg0 & (long) (this.anInt1572 - 1))];
		arg1.aClass4_Sub1_57 = local25;
		arg1.aClass4_Sub1_58 = local25.aClass4_Sub1_58;
		arg1.aClass4_Sub1_58.aClass4_Sub1_57 = arg1;
		arg1.aClass4_Sub1_57.aClass4_Sub1_58 = arg1;
		arg1.aLong226 = arg0;
	}
}
