import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class169 {

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "J")
	private long aLong194;

	@OriginalMember(owner = "client!tj", name = "n", descriptor = "Lclient!r;")
	private Class2_Sub8 aClass2_Sub8_67;

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "[Lclient!r;")
	private Class2_Sub8[] aClass2_Sub8Array1;

	@OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
	private int anInt5427;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(I)V")
	public Class169(@OriginalArg(0) int arg0) {
		this.aClass2_Sub8Array1 = new Class2_Sub8[arg0];
		this.anInt5427 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(22) Class2_Sub8 local22 = this.aClass2_Sub8Array1[local10] = new Class2_Sub8();
			local22.aClass2_Sub8_74 = local22;
			local22.aClass2_Sub8_75 = local22;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BJ)Lclient!r;")
	public Class2_Sub8 method4310(@OriginalArg(1) long arg0) {
		this.aLong194 = arg0;
		@Pc(20) Class2_Sub8 local20 = this.aClass2_Sub8Array1[(int) (arg0 & (long) (this.anInt5427 - 1))];
		for (this.aClass2_Sub8_67 = local20.aClass2_Sub8_74; this.aClass2_Sub8_67 != local20; this.aClass2_Sub8_67 = this.aClass2_Sub8_67.aClass2_Sub8_74) {
			if (arg0 == this.aClass2_Sub8_67.aLong212) {
				@Pc(41) Class2_Sub8 local41 = this.aClass2_Sub8_67;
				this.aClass2_Sub8_67 = this.aClass2_Sub8_67.aClass2_Sub8_74;
				return local41;
			}
		}
		this.aClass2_Sub8_67 = null;
		return null;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZLclient!r;J)V")
	public void method4312(@OriginalArg(1) Class2_Sub8 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_Sub8_75 != null) {
			arg0.method4686();
		}
		@Pc(17) Class2_Sub8 local17 = this.aClass2_Sub8Array1[(int) (arg1 & (long) (this.anInt5427 - 1))];
		arg0.aClass2_Sub8_75 = local17.aClass2_Sub8_75;
		arg0.aLong212 = arg1;
		arg0.aClass2_Sub8_74 = local17;
		arg0.aClass2_Sub8_75.aClass2_Sub8_74 = arg0;
		arg0.aClass2_Sub8_74.aClass2_Sub8_75 = arg0;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)Lclient!r;")
	public Class2_Sub8 method4316() {
		if (this.aClass2_Sub8_67 == null) {
			return null;
		}
		@Pc(29) Class2_Sub8 local29 = this.aClass2_Sub8Array1[(int) (this.aLong194 & (long) (this.anInt5427 - 1))];
		while (this.aClass2_Sub8_67 != local29) {
			if (this.aClass2_Sub8_67.aLong212 == this.aLong194) {
				@Pc(47) Class2_Sub8 local47 = this.aClass2_Sub8_67;
				this.aClass2_Sub8_67 = this.aClass2_Sub8_67.aClass2_Sub8_74;
				return local47;
			}
			this.aClass2_Sub8_67 = this.aClass2_Sub8_67.aClass2_Sub8_74;
		}
		this.aClass2_Sub8_67 = null;
		return null;
	}
}
