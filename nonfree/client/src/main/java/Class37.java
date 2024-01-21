import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class37 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Z")
	private boolean aBoolean170 = false;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "I")
	private int anInt750;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "[Lclient!u;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V")
	public Class37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt750 = arg0;
			this.aClass1Array1 = new Class1[arg0];
			for (@Pc(19) int local19 = 0; local19 < arg0; local19++) {
				@Pc(29) Class1 local29 = this.aClass1Array1[local19] = new Class1();
				local29.aClass1_41 = local29;
				local29.aClass1_42 = local29;
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("69851, " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!u;")
	public Class1 method522(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt750 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(JLclient!u;I)V")
	public void method523(@OriginalArg(0) long arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg1.aClass1_42 != null) {
				arg1.method559();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt750 - 1))];
			arg1.aClass1_42 = local18.aClass1_42;
			arg1.aClass1_41 = local18;
			arg1.aClass1_42.aClass1_41 = arg1;
			arg1.aClass1_41.aClass1_42 = arg1;
			if (arg2 >= 0) {
				for (@Pc(37) int local37 = 1; local37 > 0; local37++) {
				}
			}
			arg1.aLong26 = arg0;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("27968, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}
}
