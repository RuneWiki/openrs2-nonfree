import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class23 {

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "Lclient!sq;")
	private Class1_Sub1 aClass1_Sub1_7;

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "J")
	private long aLong20;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "[Lclient!sq;")
	private final Class1_Sub1[] aClass1_Sub1Array1;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
	private final int anInt454;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(I)V")
	public Class23(@OriginalArg(0) int arg0) {
		this.aClass1_Sub1Array1 = new Class1_Sub1[arg0];
		this.anInt454 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class1_Sub1 local20 = this.aClass1_Sub1Array1[local10] = new Class1_Sub1();
			local20.aClass1_Sub1_57 = local20;
			local20.aClass1_Sub1_58 = local20;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(JI)Lclient!sq;")
	public Class1_Sub1 method380(@OriginalArg(0) long arg0) {
		this.aLong20 = arg0;
		@Pc(20) Class1_Sub1 local20 = this.aClass1_Sub1Array1[(int) (arg0 & (long) (this.anInt454 - 1))];
		for (this.aClass1_Sub1_7 = local20.aClass1_Sub1_58; this.aClass1_Sub1_7 != local20; this.aClass1_Sub1_7 = this.aClass1_Sub1_7.aClass1_Sub1_58) {
			if (this.aClass1_Sub1_7.aLong231 == arg0) {
				@Pc(35) Class1_Sub1 local35 = this.aClass1_Sub1_7;
				this.aClass1_Sub1_7 = this.aClass1_Sub1_7.aClass1_Sub1_58;
				return local35;
			}
		}
		this.aClass1_Sub1_7 = null;
		return null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Lclient!sq;")
	public Class1_Sub1 method382() {
		if (this.aClass1_Sub1_7 == null) {
			return null;
		}
		@Pc(28) Class1_Sub1 local28 = this.aClass1_Sub1Array1[(int) ((long) (this.anInt454 - 1) & this.aLong20)];
		while (local28 != this.aClass1_Sub1_7) {
			if (this.aClass1_Sub1_7.aLong231 == this.aLong20) {
				@Pc(44) Class1_Sub1 local44 = this.aClass1_Sub1_7;
				this.aClass1_Sub1_7 = this.aClass1_Sub1_7.aClass1_Sub1_58;
				return local44;
			}
			this.aClass1_Sub1_7 = this.aClass1_Sub1_7.aClass1_Sub1_58;
		}
		this.aClass1_Sub1_7 = null;
		return null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!sq;IJ)V")
	public void method384(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_Sub1_57 != null) {
			arg0.method5893();
		}
		@Pc(21) Class1_Sub1 local21 = this.aClass1_Sub1Array1[(int) ((long) (this.anInt454 - 1) & arg1)];
		arg0.aClass1_Sub1_58 = local21;
		arg0.aClass1_Sub1_57 = local21.aClass1_Sub1_57;
		arg0.aClass1_Sub1_57.aClass1_Sub1_58 = arg0;
		arg0.aClass1_Sub1_58.aClass1_Sub1_57 = arg0;
		arg0.aLong231 = arg1;
	}
}
