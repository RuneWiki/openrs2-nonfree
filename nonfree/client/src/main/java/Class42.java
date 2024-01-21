import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class42 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "I")
	private int anInt920 = 32;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "I")
	private int anInt921 = 917;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "[Lclient!u;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V")
	public Class42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt922 = arg0;
			this.aClass1Array1 = new Class1[arg0];
			for (@Pc(23) int local23 = 0; local23 < arg0; local23++) {
				@Pc(33) Class1 local33 = this.aClass1Array1[local23] = new Class1();
				local33.aClass1_43 = local33;
				local33.aClass1_44 = local33;
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("97481, " + arg0 + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!u;")
	public Class1 method617(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt922 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_43; local14 != local11; local14 = local14.aClass1_43) {
			if (local14.aLong34 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!u;IJ)V")
	public void method618(@OriginalArg(0) Class1 arg0, @OriginalArg(2) long arg1) {
		try {
			if (arg0.aClass1_44 != null) {
				arg0.method690();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt922 - 1))];
			arg0.aClass1_44 = local18.aClass1_44;
			arg0.aClass1_43 = local18;
			arg0.aClass1_44.aClass1_43 = arg0;
			arg0.aClass1_43.aClass1_44 = arg0;
			arg0.aLong34 = arg1;
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("72727, " + arg0 + ", " + 8 + ", " + arg1 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}
}
