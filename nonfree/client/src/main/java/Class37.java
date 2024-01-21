import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class37 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "I")
	private int anInt741 = 171;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "I")
	private int anInt742 = 22945;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	private int anInt743;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "[Lclient!u;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(BI)V")
	public Class37(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt743 = arg1;
			this.aClass1Array1 = new Class1[arg1];
			for (@Pc(25) int local25 = 0; local25 < arg1; local25++) {
				@Pc(35) Class1 local35 = this.aClass1Array1[local25] = new Class1();
				local35.aClass1_41 = local35;
				local35.aClass1_42 = local35;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("55655, " + arg0 + ", " + arg1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!u;")
	public Class1 method510(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt743 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(JILclient!u;)V")
	public void method511(@OriginalArg(0) long arg0, @OriginalArg(2) Class1 arg1) {
		try {
			if (arg1.aClass1_42 != null) {
				arg1.method547();
			}
			@Pc(19) Class1 local19 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt743 - 1))];
			arg1.aClass1_42 = local19.aClass1_42;
			arg1.aClass1_41 = local19;
			arg1.aClass1_42.aClass1_41 = arg1;
			arg1.aClass1_41.aClass1_42 = arg1;
			arg1.aLong26 = arg0;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("17411, " + arg0 + ", " + -856 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}
}
