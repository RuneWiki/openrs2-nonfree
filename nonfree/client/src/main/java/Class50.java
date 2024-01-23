import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class50 {

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "J")
	private long aLong62;

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "Lclient!rb;")
	private Class1 aClass1_69;

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "Lclient!rb;")
	private Class1 aClass1_70;

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
	private int anInt1747 = 0;

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "[Lclient!rb;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
	private int anInt1738;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(I)V")
	public Class50(@OriginalArg(0) int arg0) {
		this.aClass1Array1 = new Class1[arg0];
		this.anInt1738 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_203 = local23;
			local23.aClass1_204 = local23;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Lclient!rb;")
	public Class1 method1358() {
		this.anInt1747 = 0;
		return this.method1361();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)I")
	public int method1359() {
		return this.anInt1738;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	public void method1360() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1738; local7++) {
			@Pc(14) Class1 local14 = this.aClass1Array1[local7];
			while (true) {
				@Pc(17) Class1 local17 = local14.aClass1_203;
				if (local14 == local17) {
					break;
				}
				local17.method3735();
			}
		}
		this.aClass1_69 = null;
		this.aClass1_70 = null;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)Lclient!rb;")
	public Class1 method1361() {
		@Pc(27) Class1 local27;
		if (this.anInt1747 > 0 && this.aClass1Array1[this.anInt1747 - 1] != this.aClass1_70) {
			local27 = this.aClass1_70;
			this.aClass1_70 = local27.aClass1_203;
			return local27;
		}
		while (this.anInt1747 < this.anInt1738) {
			local27 = this.aClass1Array1[this.anInt1747++].aClass1_203;
			if (this.aClass1Array1[this.anInt1747 - 1] != local27) {
				this.aClass1_70 = local27.aClass1_203;
				return local27;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(JLclient!rb;I)V")
	public void method1362(@OriginalArg(0) long arg0, @OriginalArg(1) Class1 arg1) {
		if (arg1.aClass1_204 != null) {
			arg1.method3735();
		}
		@Pc(17) Class1 local17 = this.aClass1Array1[(int) ((long) (this.anInt1738 - 1) & arg0)];
		arg1.aClass1_204 = local17.aClass1_204;
		arg1.aClass1_203 = local17;
		arg1.aClass1_204.aClass1_203 = arg1;
		arg1.aClass1_203.aClass1_204 = arg1;
		arg1.aLong177 = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(Z)Lclient!rb;")
	public Class1 method1363() {
		if (this.aClass1_69 == null) {
			return null;
		}
		@Pc(29) Class1 local29 = this.aClass1Array1[(int) ((long) (this.anInt1738 - 1) & this.aLong62)];
		while (this.aClass1_69 != local29) {
			if (this.aClass1_69.aLong177 == this.aLong62) {
				@Pc(44) Class1 local44 = this.aClass1_69;
				this.aClass1_69 = this.aClass1_69.aClass1_203;
				return local44;
			}
			this.aClass1_69 = this.aClass1_69.aClass1_203;
		}
		this.aClass1_69 = null;
		return null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZJ)Lclient!rb;")
	public Class1 method1364(@OriginalArg(1) long arg0) {
		this.aLong62 = arg0;
		@Pc(18) Class1 local18 = this.aClass1Array1[(int) ((long) (this.anInt1738 - 1) & arg0)];
		for (this.aClass1_69 = local18.aClass1_203; this.aClass1_69 != local18; this.aClass1_69 = this.aClass1_69.aClass1_203) {
			if (this.aClass1_69.aLong177 == arg0) {
				@Pc(32) Class1 local32 = this.aClass1_69;
				this.aClass1_69 = this.aClass1_69.aClass1_203;
				return local32;
			}
		}
		this.aClass1_69 = null;
		return null;
	}
}
