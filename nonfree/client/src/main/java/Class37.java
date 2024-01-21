import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class37 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "I")
	private int anInt764 = 4277;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "Z")
	private boolean aBoolean149 = false;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	private int anInt765;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "[Lclient!u;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V")
	public Class37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt765 = arg1;
			this.aClass1Array1 = new Class1[arg1];
			for (@Pc(30) int local30 = 0; local30 < arg1; local30++) {
				@Pc(40) Class1 local40 = this.aClass1Array1[local30] = new Class1();
				local40.aClass1_41 = local40;
				local40.aClass1_42 = local40;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("73766, " + arg0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!u;")
	public Class1 method530(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt765 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(JILclient!u;)V")
	public void method531(@OriginalArg(0) long arg0, @OriginalArg(2) Class1 arg1) {
		try {
			if (arg1.aClass1_42 != null) {
				arg1.method567();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt765 - 1))];
			arg1.aClass1_42 = local18.aClass1_42;
			arg1.aClass1_41 = local18;
			arg1.aClass1_42.aClass1_41 = arg1;
			arg1.aClass1_41.aClass1_42 = arg1;
			arg1.aLong26 = arg0;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("49205, " + arg0 + ", " + -566 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}
}
