import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class321 {

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "Lclient!hc;")
	private Class4_Sub5 aClass4_Sub5_57;

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "J")
	private long aLong249;

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "[Lclient!hc;")
	private final Class4_Sub5[] aClass4_Sub5Array1;

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "I")
	private final int anInt8250;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(I)V")
	public Class321(@OriginalArg(0) int arg0) {
		this.aClass4_Sub5Array1 = new Class4_Sub5[arg0];
		this.anInt8250 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class4_Sub5 local20 = this.aClass4_Sub5Array1[local10] = new Class4_Sub5();
			local20.aClass4_Sub5_67 = local20;
			local20.aClass4_Sub5_66 = local20;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)Lclient!hc;")
	public Class4_Sub5 method7157() {
		if (this.aClass4_Sub5_57 == null) {
			return null;
		}
		@Pc(23) Class4_Sub5 local23 = this.aClass4_Sub5Array1[(int) ((long) (this.anInt8250 - 1) & this.aLong249)];
		while (this.aClass4_Sub5_57 != local23) {
			if (this.aClass4_Sub5_57.aLong306 == this.aLong249) {
				@Pc(35) Class4_Sub5 local35 = this.aClass4_Sub5_57;
				this.aClass4_Sub5_57 = this.aClass4_Sub5_57.aClass4_Sub5_67;
				return local35;
			}
			this.aClass4_Sub5_57 = this.aClass4_Sub5_57.aClass4_Sub5_67;
		}
		this.aClass4_Sub5_57 = null;
		return null;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(JI)Lclient!hc;")
	public Class4_Sub5 method7161(@OriginalArg(0) long arg0) {
		this.aLong249 = arg0;
		@Pc(26) Class4_Sub5 local26 = this.aClass4_Sub5Array1[(int) (arg0 & (long) (this.anInt8250 - 1))];
		for (this.aClass4_Sub5_57 = local26.aClass4_Sub5_67; this.aClass4_Sub5_57 != local26; this.aClass4_Sub5_57 = this.aClass4_Sub5_57.aClass4_Sub5_67) {
			if (arg0 == this.aClass4_Sub5_57.aLong306) {
				@Pc(45) Class4_Sub5 local45 = this.aClass4_Sub5_57;
				this.aClass4_Sub5_57 = this.aClass4_Sub5_57.aClass4_Sub5_67;
				return local45;
			}
		}
		this.aClass4_Sub5_57 = null;
		return null;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLclient!hc;J)V")
	public void method7164(@OriginalArg(1) Class4_Sub5 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass4_Sub5_66 != null) {
			arg0.method8990();
		}
		@Pc(27) Class4_Sub5 local27 = this.aClass4_Sub5Array1[(int) (arg1 & (long) (this.anInt8250 - 1))];
		arg0.aClass4_Sub5_67 = local27;
		arg0.aClass4_Sub5_66 = local27.aClass4_Sub5_66;
		arg0.aClass4_Sub5_66.aClass4_Sub5_67 = arg0;
		arg0.aLong306 = arg1;
		arg0.aClass4_Sub5_67.aClass4_Sub5_66 = arg0;
	}
}
