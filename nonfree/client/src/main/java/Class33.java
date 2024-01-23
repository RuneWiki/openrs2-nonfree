import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class33 {

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "Lclient!b;")
	private Class1 aClass1_53;

	@OriginalMember(owner = "client!ff", name = "q", descriptor = "J")
	private long aLong45;

	@OriginalMember(owner = "client!ff", name = "r", descriptor = "Lclient!b;")
	private Class1 aClass1_54;

	@OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
	private int anInt1499 = 0;

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
	private int anInt1498;

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "[Lclient!b;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(I)V")
	public Class33(@OriginalArg(0) int arg0) {
		this.anInt1498 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_214 = local23;
			local23.aClass1_213 = local23;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)Lclient!b;")
	public Class1 method1067() {
		this.anInt1499 = 0;
		return this.method1070();
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)Lclient!b;")
	public Class1 method1069() {
		if (this.aClass1_53 == null) {
			return null;
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) ((long) (this.anInt1498 - 1) & this.aLong45)];
		while (this.aClass1_53 != local21) {
			if (this.aLong45 == this.aClass1_53.aLong150) {
				@Pc(32) Class1 local32 = this.aClass1_53;
				this.aClass1_53 = this.aClass1_53.aClass1_213;
				return local32;
			}
			this.aClass1_53 = this.aClass1_53.aClass1_213;
		}
		this.aClass1_53 = null;
		return null;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)Lclient!b;")
	public Class1 method1070() {
		@Pc(22) Class1 local22;
		if (this.anInt1499 > 0 && this.aClass1Array1[this.anInt1499 - 1] != this.aClass1_54) {
			local22 = this.aClass1_54;
			this.aClass1_54 = local22.aClass1_213;
			return local22;
		}
		while (this.anInt1499 < this.anInt1498) {
			local22 = this.aClass1Array1[this.anInt1499++].aClass1_213;
			if (this.aClass1Array1[this.anInt1499 - 1] != local22) {
				this.aClass1_54 = local22.aClass1_213;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(JI)Lclient!b;")
	public Class1 method1071(@OriginalArg(0) long arg0) {
		this.aLong45 = arg0;
		@Pc(26) Class1 local26 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt1498 - 1))];
		for (this.aClass1_53 = local26.aClass1_213; this.aClass1_53 != local26; this.aClass1_53 = this.aClass1_53.aClass1_213) {
			if (this.aClass1_53.aLong150 == arg0) {
				@Pc(40) Class1 local40 = this.aClass1_53;
				this.aClass1_53 = this.aClass1_53.aClass1_213;
				return local40;
			}
		}
		this.aClass1_53 = null;
		return null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(JBLclient!b;)V")
	public void method1072(@OriginalArg(0) long arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_214 != null) {
			arg1.method3530();
		}
		@Pc(17) Class1 local17 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt1498 - 1))];
		arg1.aClass1_213 = local17;
		arg1.aLong150 = arg0;
		arg1.aClass1_214 = local17.aClass1_214;
		arg1.aClass1_214.aClass1_213 = arg1;
		arg1.aClass1_213.aClass1_214 = arg1;
	}
}
