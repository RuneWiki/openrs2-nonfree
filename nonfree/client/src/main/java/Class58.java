import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class58 {

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Lclient!tm;")
	private Class4_Sub1 aClass4_Sub1_18;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "J")
	private long aLong57;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "[Lclient!tm;")
	private final Class4_Sub1[] aClass4_Sub1Array1;

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
	private final int anInt1519;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I)V")
	public Class58(@OriginalArg(0) int arg0) {
		this.aClass4_Sub1Array1 = new Class4_Sub1[arg0];
		this.anInt1519 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class4_Sub1 local20 = this.aClass4_Sub1Array1[local10] = new Class4_Sub1();
			local20.aClass4_Sub1_61 = local20;
			local20.aClass4_Sub1_62 = local20;
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)Lclient!tm;")
	public Class4_Sub1 method1253() {
		if (this.aClass4_Sub1_18 == null) {
			return null;
		}
		@Pc(28) Class4_Sub1 local28 = this.aClass4_Sub1Array1[(int) ((long) (this.anInt1519 - 1) & this.aLong57)];
		while (local28 != this.aClass4_Sub1_18) {
			if (this.aLong57 == this.aClass4_Sub1_18.aLong254) {
				@Pc(40) Class4_Sub1 local40 = this.aClass4_Sub1_18;
				this.aClass4_Sub1_18 = this.aClass4_Sub1_18.aClass4_Sub1_61;
				return local40;
			}
			this.aClass4_Sub1_18 = this.aClass4_Sub1_18.aClass4_Sub1_61;
		}
		this.aClass4_Sub1_18 = null;
		return null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!tm;J)V")
	public void method1255(@OriginalArg(1) Class4_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass4_Sub1_62 != null) {
			arg0.method5555();
		}
		@Pc(29) Class4_Sub1 local29 = this.aClass4_Sub1Array1[(int) (arg1 & (long) (this.anInt1519 - 1))];
		arg0.aClass4_Sub1_62 = local29.aClass4_Sub1_62;
		arg0.aClass4_Sub1_61 = local29;
		arg0.aClass4_Sub1_62.aClass4_Sub1_61 = arg0;
		arg0.aLong254 = arg1;
		arg0.aClass4_Sub1_61.aClass4_Sub1_62 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(JI)Lclient!tm;")
	public Class4_Sub1 method1258(@OriginalArg(0) long arg0) {
		this.aLong57 = arg0;
		@Pc(18) Class4_Sub1 local18 = this.aClass4_Sub1Array1[(int) ((long) (this.anInt1519 - 1) & arg0)];
		for (this.aClass4_Sub1_18 = local18.aClass4_Sub1_61; this.aClass4_Sub1_18 != local18; this.aClass4_Sub1_18 = this.aClass4_Sub1_18.aClass4_Sub1_61) {
			if (arg0 == this.aClass4_Sub1_18.aLong254) {
				@Pc(36) Class4_Sub1 local36 = this.aClass4_Sub1_18;
				this.aClass4_Sub1_18 = this.aClass4_Sub1_18.aClass4_Sub1_61;
				return local36;
			}
		}
		this.aClass4_Sub1_18 = null;
		return null;
	}
}
