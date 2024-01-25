import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class55 {

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "Lclient!mt;")
	private Class1_Sub3 aClass1_Sub3_15;

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "J")
	private long aLong50;

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
	private final int anInt1461;

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "[Lclient!mt;")
	private final Class1_Sub3[] aClass1_Sub3Array1;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(I)V")
	public Class55(@OriginalArg(0) int arg0) {
		this.anInt1461 = arg0;
		this.aClass1_Sub3Array1 = new Class1_Sub3[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class1_Sub3 local20 = this.aClass1_Sub3Array1[local10] = new Class1_Sub3();
			local20.aClass1_Sub3_55 = local20;
			local20.aClass1_Sub3_56 = local20;
		}
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)Lclient!mt;")
	public Class1_Sub3 method1222() {
		if (this.aClass1_Sub3_15 == null) {
			return null;
		}
		@Pc(31) Class1_Sub3 local31 = this.aClass1_Sub3Array1[(int) ((long) (this.anInt1461 - 1) & this.aLong50)];
		while (this.aClass1_Sub3_15 != local31) {
			if (this.aLong50 == this.aClass1_Sub3_15.aLong216) {
				@Pc(47) Class1_Sub3 local47 = this.aClass1_Sub3_15;
				this.aClass1_Sub3_15 = this.aClass1_Sub3_15.aClass1_Sub3_56;
				return local47;
			}
			this.aClass1_Sub3_15 = this.aClass1_Sub3_15.aClass1_Sub3_56;
		}
		this.aClass1_Sub3_15 = null;
		return null;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!mt;JZ)V")
	public void method1223(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass1_Sub3_55 != null) {
			arg0.method5312();
		}
		@Pc(21) Class1_Sub3 local21 = this.aClass1_Sub3Array1[(int) (arg1 & (long) (this.anInt1461 - 1))];
		arg0.aClass1_Sub3_56 = local21;
		arg0.aClass1_Sub3_55 = local21.aClass1_Sub3_55;
		arg0.aClass1_Sub3_55.aClass1_Sub3_56 = arg0;
		arg0.aClass1_Sub3_56.aClass1_Sub3_55 = arg0;
		arg0.aLong216 = arg1;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(JI)Lclient!mt;")
	public Class1_Sub3 method1224(@OriginalArg(0) long arg0) {
		this.aLong50 = arg0;
		@Pc(20) Class1_Sub3 local20 = this.aClass1_Sub3Array1[(int) (arg0 & (long) (this.anInt1461 - 1))];
		for (this.aClass1_Sub3_15 = local20.aClass1_Sub3_56; this.aClass1_Sub3_15 != local20; this.aClass1_Sub3_15 = this.aClass1_Sub3_15.aClass1_Sub3_56) {
			if (this.aClass1_Sub3_15.aLong216 == arg0) {
				@Pc(43) Class1_Sub3 local43 = this.aClass1_Sub3_15;
				this.aClass1_Sub3_15 = this.aClass1_Sub3_15.aClass1_Sub3_56;
				return local43;
			}
		}
		this.aClass1_Sub3_15 = null;
		return null;
	}
}
