import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class148 {

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "Lclient!mo;")
	private Class1_Sub1 aClass1_Sub1_45;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "J")
	private long aLong151;

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "[Lclient!mo;")
	private final Class1_Sub1[] aClass1_Sub1Array1;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
	private final int anInt4458;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(I)V")
	public Class148(@OriginalArg(0) int arg0) {
		this.aClass1_Sub1Array1 = new Class1_Sub1[arg0];
		this.anInt4458 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class1_Sub1 local20 = this.aClass1_Sub1Array1[local10] = new Class1_Sub1();
			local20.aClass1_Sub1_61 = local20;
			local20.aClass1_Sub1_62 = local20;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IJ)Lclient!mo;")
	public Class1_Sub1 method4108(@OriginalArg(1) long arg0) {
		this.aLong151 = arg0;
		@Pc(20) Class1_Sub1 local20 = this.aClass1_Sub1Array1[(int) (arg0 & (long) (this.anInt4458 - 1))];
		for (this.aClass1_Sub1_45 = local20.aClass1_Sub1_61; this.aClass1_Sub1_45 != local20; this.aClass1_Sub1_45 = this.aClass1_Sub1_45.aClass1_Sub1_61) {
			if (this.aClass1_Sub1_45.aLong208 == arg0) {
				@Pc(35) Class1_Sub1 local35 = this.aClass1_Sub1_45;
				this.aClass1_Sub1_45 = this.aClass1_Sub1_45.aClass1_Sub1_61;
				return local35;
			}
		}
		this.aClass1_Sub1_45 = null;
		return null;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(JLclient!mo;I)V")
	public void method4110(@OriginalArg(0) long arg0, @OriginalArg(1) Class1_Sub1 arg1) {
		if (arg1.aClass1_Sub1_62 != null) {
			arg1.method5564();
		}
		@Pc(29) Class1_Sub1 local29 = this.aClass1_Sub1Array1[(int) (arg0 & (long) (this.anInt4458 - 1))];
		arg1.aClass1_Sub1_61 = local29;
		arg1.aClass1_Sub1_62 = local29.aClass1_Sub1_62;
		arg1.aClass1_Sub1_62.aClass1_Sub1_61 = arg1;
		arg1.aClass1_Sub1_61.aClass1_Sub1_62 = arg1;
		arg1.aLong208 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)Lclient!mo;")
	public Class1_Sub1 method4112() {
		if (this.aClass1_Sub1_45 == null) {
			return null;
		}
		@Pc(29) Class1_Sub1 local29 = this.aClass1_Sub1Array1[(int) (this.aLong151 & (long) (this.anInt4458 - 1))];
		while (this.aClass1_Sub1_45 != local29) {
			if (this.aLong151 == this.aClass1_Sub1_45.aLong208) {
				@Pc(41) Class1_Sub1 local41 = this.aClass1_Sub1_45;
				this.aClass1_Sub1_45 = this.aClass1_Sub1_45.aClass1_Sub1_61;
				return local41;
			}
			this.aClass1_Sub1_45 = this.aClass1_Sub1_45.aClass1_Sub1_61;
		}
		this.aClass1_Sub1_45 = null;
		return null;
	}
}
