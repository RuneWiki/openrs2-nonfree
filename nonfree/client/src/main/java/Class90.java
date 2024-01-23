import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class90 {

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Lclient!sa;")
	private Class1 aClass1_167;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "J")
	private long aLong139;

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "Lclient!sa;")
	private Class1 aClass1_168;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
	private int anInt3502 = 0;

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
	private int anInt3501;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "[Lclient!sa;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V")
	public Class90(@OriginalArg(0) int arg0) {
		this.anInt3501 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_204 = local23;
			local23.aClass1_203 = local23;
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)Lclient!sa;")
	public Class1 method2816() {
		if (this.aClass1_167 == null) {
			return null;
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) ((long) (this.anInt3501 - 1) & this.aLong139)];
		while (this.aClass1_167 != local21) {
			if (this.aLong139 == this.aClass1_167.aLong173) {
				@Pc(36) Class1 local36 = this.aClass1_167;
				this.aClass1_167 = this.aClass1_167.aClass1_203;
				return local36;
			}
			this.aClass1_167 = this.aClass1_167.aClass1_203;
		}
		this.aClass1_167 = null;
		return null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!sa;ZJ)V")
	public void method2817(@OriginalArg(0) Class1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_204 != null) {
			arg0.method3525();
		}
		@Pc(27) Class1 local27 = this.aClass1Array1[(int) ((long) (this.anInt3501 - 1) & arg1)];
		arg0.aClass1_204 = local27.aClass1_204;
		arg0.aLong173 = arg1;
		arg0.aClass1_203 = local27;
		arg0.aClass1_204.aClass1_203 = arg0;
		arg0.aClass1_203.aClass1_204 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	public void method2818() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt3501; local15++) {
			@Pc(22) Class1 local22 = this.aClass1Array1[local15];
			while (true) {
				@Pc(25) Class1 local25 = local22.aClass1_203;
				if (local22 == local25) {
					break;
				}
				local25.method3525();
			}
		}
		this.aClass1_168 = null;
		this.aClass1_167 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(JZ)Lclient!sa;")
	public Class1 method2819(@OriginalArg(0) long arg0) {
		this.aLong139 = arg0;
		@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt3501 - 1))];
		for (this.aClass1_167 = local18.aClass1_203; this.aClass1_167 != local18; this.aClass1_167 = this.aClass1_167.aClass1_203) {
			if (this.aClass1_167.aLong173 == arg0) {
				@Pc(37) Class1 local37 = this.aClass1_167;
				this.aClass1_167 = this.aClass1_167.aClass1_203;
				return local37;
			}
		}
		this.aClass1_167 = null;
		return null;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)Lclient!sa;")
	public Class1 method2821() {
		@Pc(21) Class1 local21;
		if (this.anInt3502 > 0 && this.aClass1_168 != this.aClass1Array1[this.anInt3502 - 1]) {
			local21 = this.aClass1_168;
			this.aClass1_168 = local21.aClass1_203;
			return local21;
		}
		while (this.anInt3501 > this.anInt3502) {
			local21 = this.aClass1Array1[this.anInt3502++].aClass1_203;
			if (local21 != this.aClass1Array1[this.anInt3502 - 1]) {
				this.aClass1_168 = local21.aClass1_203;
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)I")
	public int method2822() {
		return this.anInt3501;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)Lclient!sa;")
	public Class1 method2823() {
		this.anInt3502 = 0;
		return this.method2821();
	}
}
