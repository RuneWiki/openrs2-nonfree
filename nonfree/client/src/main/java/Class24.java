import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LIHJZCBF")
public final class Class24 {

	@OriginalMember(owner = "client!LIHJZCBF", name = "a", descriptor = "I")
	private int anInt259 = 9;

	@OriginalMember(owner = "client!LIHJZCBF", name = "b", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!LIHJZCBF", name = "c", descriptor = "[Lclient!JBHJGXME;")
	private Class5[] aClass5Array1;

	@OriginalMember(owner = "client!LIHJZCBF", name = "<init>", descriptor = "(IB)V")
	public Class24(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			this.anInt260 = arg0;
			this.aClass5Array1 = new Class5[arg0];
			for (@Pc(20) int local20 = 0; local20 < arg0; local20++) {
				@Pc(30) Class5 local30 = this.aClass5Array1[local20] = new Class5();
				local30.aClass5_41 = local30;
				local30.aClass5_42 = local30;
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("44563, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LIHJZCBF", name = "a", descriptor = "(J)Lclient!JBHJGXME;")
	public Class5 method168(@OriginalArg(0) long arg0) {
		@Pc(11) Class5 local11 = this.aClass5Array1[(int) (arg0 & (long) (this.anInt260 - 1))];
		for (@Pc(14) Class5 local14 = local11.aClass5_41; local14 != local11; local14 = local14.aClass5_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!LIHJZCBF", name = "a", descriptor = "(Lclient!JBHJGXME;JI)V")
	public void method169(@OriginalArg(0) Class5 arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg0.aClass5_42 != null) {
				arg0.method542();
			}
			@Pc(18) Class5 local18 = this.aClass5Array1[(int) (arg1 & (long) (this.anInt260 - 1))];
			arg0.aClass5_42 = local18.aClass5_42;
			arg0.aClass5_41 = local18;
			arg0.aClass5_42.aClass5_41 = arg0;
			arg0.aClass5_41.aClass5_42 = arg0;
			arg0.aLong26 = arg1;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("52047, " + arg0 + ", " + arg1 + ", " + -24089 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}
}
