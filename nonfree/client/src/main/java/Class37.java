import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class37 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Z")
	private boolean aBoolean150 = false;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "I")
	private int anInt757 = 44;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	private int anInt758;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "[Lclient!u;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V")
	public Class37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt758 = arg1;
			this.aClass1Array1 = new Class1[arg1];
			for (@Pc(30) int local30 = 0; local30 < arg1; local30++) {
				@Pc(40) Class1 local40 = this.aClass1Array1[local30] = new Class1();
				local40.aClass1_41 = local40;
				local40.aClass1_42 = local40;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("34734, " + arg0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!u;")
	public Class1 method530(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt758 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BJLclient!u;)V")
	public void method531(@OriginalArg(0) byte arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class1 arg2) {
		try {
			if (arg2.aClass1_42 != null) {
				arg2.method567();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt758 - 1))];
			arg2.aClass1_42 = local18.aClass1_42;
			arg2.aClass1_41 = local18;
			@Pc(30) boolean local30 = false;
			arg2.aClass1_42.aClass1_41 = arg2;
			arg2.aClass1_41.aClass1_42 = arg2;
			arg2.aLong26 = arg1;
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("1931, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}
}
