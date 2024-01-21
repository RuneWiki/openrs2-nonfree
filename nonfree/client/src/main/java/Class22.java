import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JVZXLCGT")
public final class Class22 {

	@OriginalMember(owner = "client!JVZXLCGT", name = "a", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!JVZXLCGT", name = "b", descriptor = "I")
	private int anInt348 = 5;

	@OriginalMember(owner = "client!JVZXLCGT", name = "c", descriptor = "I")
	private int anInt349;

	@OriginalMember(owner = "client!JVZXLCGT", name = "d", descriptor = "[Lclient!ABHGPSRU;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!JVZXLCGT", name = "<init>", descriptor = "(BI)V")
	public Class22(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt349 = arg1;
			this.aClass1Array1 = new Class1[arg1];
			for (@Pc(25) int local25 = 0; local25 < arg1; local25++) {
				@Pc(35) Class1 local35 = this.aClass1Array1[local25] = new Class1();
				local35.aClass1_41 = local35;
				local35.aClass1_42 = local35;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("57929, " + arg0 + ", " + arg1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JVZXLCGT", name = "a", descriptor = "(J)Lclient!ABHGPSRU;")
	public Class1 method243(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt349 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!JVZXLCGT", name = "a", descriptor = "(ILclient!ABHGPSRU;J)V")
	public void method244(@OriginalArg(1) Class1 arg0, @OriginalArg(2) long arg1) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method552();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt349 - 1))];
			arg0.aClass1_42 = local18.aClass1_42;
			arg0.aClass1_41 = local18;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
			arg0.aLong26 = arg1;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("75673, " + 260 + ", " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}
}
