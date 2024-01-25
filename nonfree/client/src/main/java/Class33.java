import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class33 {

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "J")
	private long aLong55;

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "Lclient!uq;")
	private Class1_Sub3 aClass1_Sub3_13;

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "[Lclient!uq;")
	private final Class1_Sub3[] aClass1_Sub3Array1;

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
	private final int anInt1106;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(I)V")
	public Class33(@OriginalArg(0) int arg0) {
		this.aClass1_Sub3Array1 = new Class1_Sub3[arg0];
		this.anInt1106 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class1_Sub3 local20 = this.aClass1_Sub3Array1[local10] = new Class1_Sub3();
			local20.aClass1_Sub3_62 = local20;
			local20.aClass1_Sub3_61 = local20;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!uq;IJ)V")
	public void method1007(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_Sub3_61 != null) {
			arg0.method7811();
		}
		@Pc(21) Class1_Sub3 local21 = this.aClass1_Sub3Array1[(int) (arg1 & (long) (this.anInt1106 - 1))];
		arg0.aClass1_Sub3_61 = local21.aClass1_Sub3_61;
		arg0.aClass1_Sub3_62 = local21;
		arg0.aClass1_Sub3_61.aClass1_Sub3_62 = arg0;
		arg0.aLong420 = arg1;
		arg0.aClass1_Sub3_62.aClass1_Sub3_61 = arg0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IJ)Lclient!uq;")
	public Class1_Sub3 method1008(@OriginalArg(1) long arg0) {
		this.aLong55 = arg0;
		@Pc(28) Class1_Sub3 local28 = this.aClass1_Sub3Array1[(int) (arg0 & (long) (this.anInt1106 - 1))];
		for (this.aClass1_Sub3_13 = local28.aClass1_Sub3_62; this.aClass1_Sub3_13 != local28; this.aClass1_Sub3_13 = this.aClass1_Sub3_13.aClass1_Sub3_62) {
			if (this.aClass1_Sub3_13.aLong420 == arg0) {
				@Pc(47) Class1_Sub3 local47 = this.aClass1_Sub3_13;
				this.aClass1_Sub3_13 = this.aClass1_Sub3_13.aClass1_Sub3_62;
				return local47;
			}
		}
		this.aClass1_Sub3_13 = null;
		return null;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)Lclient!uq;")
	public Class1_Sub3 method1010() {
		if (this.aClass1_Sub3_13 == null) {
			return null;
		}
		@Pc(23) Class1_Sub3 local23 = this.aClass1_Sub3Array1[(int) (this.aLong55 & (long) (this.anInt1106 - 1))];
		while (local23 != this.aClass1_Sub3_13) {
			if (this.aLong55 == this.aClass1_Sub3_13.aLong420) {
				@Pc(35) Class1_Sub3 local35 = this.aClass1_Sub3_13;
				this.aClass1_Sub3_13 = this.aClass1_Sub3_13.aClass1_Sub3_62;
				return local35;
			}
			this.aClass1_Sub3_13 = this.aClass1_Sub3_13.aClass1_Sub3_62;
		}
		this.aClass1_Sub3_13 = null;
		return null;
	}
}
