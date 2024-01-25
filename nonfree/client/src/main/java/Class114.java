import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class114 {

	@OriginalMember(owner = "client!it", name = "d", descriptor = "J")
	private long aLong119;

	@OriginalMember(owner = "client!it", name = "h", descriptor = "Lclient!pg;")
	private Class4_Sub1 aClass4_Sub1_41;

	@OriginalMember(owner = "client!it", name = "c", descriptor = "[Lclient!pg;")
	private final Class4_Sub1[] aClass4_Sub1Array1;

	@OriginalMember(owner = "client!it", name = "g", descriptor = "I")
	private final int anInt3457;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(I)V")
	public Class114(@OriginalArg(0) int arg0) {
		this.aClass4_Sub1Array1 = new Class4_Sub1[arg0];
		this.anInt3457 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class4_Sub1 local20 = this.aClass4_Sub1Array1[local10] = new Class4_Sub1();
			local20.aClass4_Sub1_58 = local20;
			local20.aClass4_Sub1_57 = local20;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(B)Lclient!pg;")
	public Class4_Sub1 method3074() {
		if (this.aClass4_Sub1_41 == null) {
			return null;
		}
		@Pc(23) Class4_Sub1 local23 = this.aClass4_Sub1Array1[(int) ((long) (this.anInt3457 - 1) & this.aLong119)];
		while (local23 != this.aClass4_Sub1_41) {
			if (this.aLong119 == this.aClass4_Sub1_41.aLong219) {
				@Pc(43) Class4_Sub1 local43 = this.aClass4_Sub1_41;
				this.aClass4_Sub1_41 = this.aClass4_Sub1_41.aClass4_Sub1_57;
				return local43;
			}
			this.aClass4_Sub1_41 = this.aClass4_Sub1_41.aClass4_Sub1_57;
		}
		this.aClass4_Sub1_41 = null;
		return null;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IJ)Lclient!pg;")
	public Class4_Sub1 method3075(@OriginalArg(1) long arg0) {
		this.aLong119 = arg0;
		@Pc(20) Class4_Sub1 local20 = this.aClass4_Sub1Array1[(int) ((long) (this.anInt3457 - 1) & arg0)];
		for (this.aClass4_Sub1_41 = local20.aClass4_Sub1_57; this.aClass4_Sub1_41 != local20; this.aClass4_Sub1_41 = this.aClass4_Sub1_41.aClass4_Sub1_57) {
			if (arg0 == this.aClass4_Sub1_41.aLong219) {
				@Pc(46) Class4_Sub1 local46 = this.aClass4_Sub1_41;
				this.aClass4_Sub1_41 = this.aClass4_Sub1_41.aClass4_Sub1_57;
				return local46;
			}
		}
		this.aClass4_Sub1_41 = null;
		return null;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!pg;IJ)V")
	public void method3080(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass4_Sub1_58 != null) {
			arg0.method5985();
		}
		@Pc(21) Class4_Sub1 local21 = this.aClass4_Sub1Array1[(int) (arg1 & (long) (this.anInt3457 - 1))];
		arg0.aClass4_Sub1_57 = local21;
		arg0.aClass4_Sub1_58 = local21.aClass4_Sub1_58;
		arg0.aClass4_Sub1_58.aClass4_Sub1_57 = arg0;
		arg0.aLong219 = arg1;
		arg0.aClass4_Sub1_57.aClass4_Sub1_58 = arg0;
	}
}
