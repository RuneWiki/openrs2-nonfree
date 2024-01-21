import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class14 {

	@OriginalMember(owner = "client!de", name = "c", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!de", name = "s", descriptor = "Lclient!sa;")
	private Class1 aClass1_23;

	@OriginalMember(owner = "client!de", name = "A", descriptor = "Lclient!sa;")
	private Class1 aClass1_24;

	@OriginalMember(owner = "client!de", name = "B", descriptor = "I")
	private int anInt705 = 0;

	@OriginalMember(owner = "client!de", name = "y", descriptor = "I")
	private final int anInt704;

	@OriginalMember(owner = "client!de", name = "z", descriptor = "[Lclient!sa;")
	private final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(I)V")
	public Class14(@OriginalArg(0) int arg0) {
		this.anInt704 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_102 = local23;
			local23.aClass1_101 = local23;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)Lclient!sa;")
	public Class1 method340() {
		this.anInt705 = 0;
		return this.method341();
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)Lclient!sa;")
	private Class1 method341() {
		@Pc(22) Class1 local22;
		if (this.anInt705 > 0 && this.aClass1Array1[this.anInt705 - 1] != this.aClass1_24) {
			local22 = this.aClass1_24;
			this.aClass1_24 = local22.aClass1_101;
			return local22;
		}
		while (this.anInt705 < this.anInt704) {
			local22 = this.aClass1Array1[this.anInt705++].aClass1_101;
			if (this.aClass1Array1[this.anInt705 - 1] != local22) {
				this.aClass1_24 = local22.aClass1_101;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(JI)Lclient!sa;")
	public Class1 method343(@OriginalArg(0) long arg0) {
		this.aLong14 = arg0;
		@Pc(18) Class1 local18 = this.aClass1Array1[(int) ((long) (this.anInt704 - 1) & arg0)];
		for (this.aClass1_23 = local18.aClass1_101; this.aClass1_23 != local18; this.aClass1_23 = this.aClass1_23.aClass1_101) {
			if (this.aClass1_23.aLong85 == arg0) {
				@Pc(45) Class1 local45 = this.aClass1_23;
				this.aClass1_23 = this.aClass1_23.aClass1_101;
				return local45;
			}
		}
		this.aClass1_23 = null;
		return null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!sa;JI)V")
	public void method345(@OriginalArg(0) Class1 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass1_102 != null) {
			arg0.method1913();
		}
		@Pc(26) Class1 local26 = this.aClass1Array1[(int) ((long) (this.anInt704 - 1) & arg1)];
		arg0.aLong85 = arg1;
		arg0.aClass1_101 = local26;
		arg0.aClass1_102 = local26.aClass1_102;
		arg0.aClass1_102.aClass1_101 = arg0;
		arg0.aClass1_101.aClass1_102 = arg0;
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)Lclient!sa;")
	public Class1 method351() {
		if (this.aClass1_23 == null) {
			return null;
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) ((long) (this.anInt704 - 1) & this.aLong14)];
		while (this.aClass1_23 != local21) {
			if (this.aClass1_23.aLong85 == this.aLong14) {
				@Pc(39) Class1 local39 = this.aClass1_23;
				this.aClass1_23 = this.aClass1_23.aClass1_101;
				return local39;
			}
			this.aClass1_23 = this.aClass1_23.aClass1_101;
		}
		this.aClass1_23 = null;
		return null;
	}
}
