import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class33 {

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "Lclient!jn;")
	private Class1_Sub5 aClass1_Sub5_6;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
	private final int anInt737;

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "[Lclient!jn;")
	private final Class1_Sub5[] aClass1_Sub5Array1;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(I)V")
	public Class33(@OriginalArg(0) int arg0) {
		this.anInt737 = arg0;
		this.aClass1_Sub5Array1 = new Class1_Sub5[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class1_Sub5 local20 = this.aClass1_Sub5Array1[local10] = new Class1_Sub5();
			local20.aClass1_Sub5_58 = local20;
			local20.aClass1_Sub5_57 = local20;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Lclient!jn;")
	public Class1_Sub5 method618() {
		if (this.aClass1_Sub5_6 == null) {
			return null;
		}
		@Pc(23) Class1_Sub5 local23 = this.aClass1_Sub5Array1[(int) (this.aLong27 & (long) (this.anInt737 - 1))];
		while (this.aClass1_Sub5_6 != local23) {
			if (this.aLong27 == this.aClass1_Sub5_6.aLong211) {
				@Pc(35) Class1_Sub5 local35 = this.aClass1_Sub5_6;
				this.aClass1_Sub5_6 = this.aClass1_Sub5_6.aClass1_Sub5_57;
				return local35;
			}
			this.aClass1_Sub5_6 = this.aClass1_Sub5_6.aClass1_Sub5_57;
		}
		this.aClass1_Sub5_6 = null;
		return null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IJ)Lclient!jn;")
	public Class1_Sub5 method620(@OriginalArg(1) long arg0) {
		this.aLong27 = arg0;
		@Pc(20) Class1_Sub5 local20 = this.aClass1_Sub5Array1[(int) ((long) (this.anInt737 - 1) & arg0)];
		for (this.aClass1_Sub5_6 = local20.aClass1_Sub5_57; this.aClass1_Sub5_6 != local20; this.aClass1_Sub5_6 = this.aClass1_Sub5_6.aClass1_Sub5_57) {
			if (arg0 == this.aClass1_Sub5_6.aLong211) {
				@Pc(35) Class1_Sub5 local35 = this.aClass1_Sub5_6;
				this.aClass1_Sub5_6 = this.aClass1_Sub5_6.aClass1_Sub5_57;
				return local35;
			}
		}
		this.aClass1_Sub5_6 = null;
		return null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!jn;BJ)V")
	public void method621(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_Sub5_58 != null) {
			arg0.method5305();
		}
		@Pc(25) Class1_Sub5 local25 = this.aClass1_Sub5Array1[(int) ((long) (this.anInt737 - 1) & arg1)];
		arg0.aClass1_Sub5_57 = local25;
		arg0.aClass1_Sub5_58 = local25.aClass1_Sub5_58;
		arg0.aClass1_Sub5_58.aClass1_Sub5_57 = arg0;
		arg0.aLong211 = arg1;
		arg0.aClass1_Sub5_57.aClass1_Sub5_58 = arg0;
	}
}
