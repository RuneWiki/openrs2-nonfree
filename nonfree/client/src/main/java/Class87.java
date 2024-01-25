import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class87 {

	@OriginalMember(owner = "client!et", name = "g", descriptor = "Lclient!ld;")
	private Class1_Sub1 aClass1_Sub1_15;

	@OriginalMember(owner = "client!et", name = "j", descriptor = "J")
	private long aLong102;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "I")
	private final int anInt2394;

	@OriginalMember(owner = "client!et", name = "f", descriptor = "[Lclient!ld;")
	private final Class1_Sub1[] aClass1_Sub1Array1;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(I)V")
	public Class87(@OriginalArg(0) int arg0) {
		this.anInt2394 = arg0;
		this.aClass1_Sub1Array1 = new Class1_Sub1[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class1_Sub1 local20 = this.aClass1_Sub1Array1[local10] = new Class1_Sub1();
			local20.aClass1_Sub1_59 = local20;
			local20.aClass1_Sub1_60 = local20;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)Lclient!ld;")
	public Class1_Sub1 method2018() {
		if (this.aClass1_Sub1_15 == null) {
			return null;
		}
		@Pc(29) Class1_Sub1 local29 = this.aClass1_Sub1Array1[(int) ((long) (this.anInt2394 - 1) & this.aLong102)];
		while (local29 != this.aClass1_Sub1_15) {
			if (this.aLong102 == this.aClass1_Sub1_15.aLong394) {
				@Pc(41) Class1_Sub1 local41 = this.aClass1_Sub1_15;
				this.aClass1_Sub1_15 = this.aClass1_Sub1_15.aClass1_Sub1_59;
				return local41;
			}
			this.aClass1_Sub1_15 = this.aClass1_Sub1_15.aClass1_Sub1_59;
		}
		this.aClass1_Sub1_15 = null;
		return null;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(JLclient!ld;Z)V")
	public void method2019(@OriginalArg(0) long arg0, @OriginalArg(1) Class1_Sub1 arg1) {
		if (arg1.aClass1_Sub1_60 != null) {
			arg1.method7528();
		}
		@Pc(29) Class1_Sub1 local29 = this.aClass1_Sub1Array1[(int) ((long) (this.anInt2394 - 1) & arg0)];
		arg1.aClass1_Sub1_60 = local29.aClass1_Sub1_60;
		arg1.aClass1_Sub1_59 = local29;
		arg1.aClass1_Sub1_60.aClass1_Sub1_59 = arg1;
		arg1.aClass1_Sub1_59.aClass1_Sub1_60 = arg1;
		arg1.aLong394 = arg0;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IJ)Lclient!ld;")
	public Class1_Sub1 method2021(@OriginalArg(1) long arg0) {
		this.aLong102 = arg0;
		@Pc(28) Class1_Sub1 local28 = this.aClass1_Sub1Array1[(int) (arg0 & (long) (this.anInt2394 - 1))];
		for (this.aClass1_Sub1_15 = local28.aClass1_Sub1_59; this.aClass1_Sub1_15 != local28; this.aClass1_Sub1_15 = this.aClass1_Sub1_15.aClass1_Sub1_59) {
			if (arg0 == this.aClass1_Sub1_15.aLong394) {
				@Pc(47) Class1_Sub1 local47 = this.aClass1_Sub1_15;
				this.aClass1_Sub1_15 = this.aClass1_Sub1_15.aClass1_Sub1_59;
				return local47;
			}
		}
		this.aClass1_Sub1_15 = null;
		return null;
	}
}
