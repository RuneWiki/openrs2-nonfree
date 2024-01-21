import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class32 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "I")
	private int anInt560 = -36905;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "I")
	private int anInt561;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "[Lclient!t;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(ZI)V")
	public Class32(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.anInt561 = arg1;
		this.aClass1Array1 = new Class1[arg1];
		for (@Pc(21) int local21 = 0; local21 < arg1; local21++) {
			@Pc(31) Class1 local31 = this.aClass1Array1[local21] = new Class1();
			local31.aClass1_41 = local31;
			local31.aClass1_42 = local31;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(J)Lclient!t;")
	public Class1 method422(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt561 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong23 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(JLclient!t;I)V")
	public void method423(@OriginalArg(0) long arg0, @OriginalArg(1) Class1 arg1) {
		if (arg1.aClass1_42 != null) {
			arg1.method478();
		}
		@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt561 - 1))];
		arg1.aClass1_42 = local18.aClass1_42;
		arg1.aClass1_41 = local18;
		arg1.aClass1_42.aClass1_41 = arg1;
		arg1.aClass1_41.aClass1_42 = arg1;
		arg1.aLong23 = arg0;
	}
}
