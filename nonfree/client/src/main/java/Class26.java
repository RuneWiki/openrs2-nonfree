import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LJCRDSKE")
public final class Class26 {

	@OriginalMember(owner = "client!LJCRDSKE", name = "a", descriptor = "Z")
	private boolean aBoolean113 = false;

	@OriginalMember(owner = "client!LJCRDSKE", name = "b", descriptor = "I")
	private int anInt507 = -341;

	@OriginalMember(owner = "client!LJCRDSKE", name = "c", descriptor = "Z")
	private boolean aBoolean114 = true;

	@OriginalMember(owner = "client!LJCRDSKE", name = "d", descriptor = "I")
	private int anInt508;

	@OriginalMember(owner = "client!LJCRDSKE", name = "e", descriptor = "[Lclient!XNCSKJMM;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!LJCRDSKE", name = "<init>", descriptor = "(IZ)V")
	public Class26(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anInt508 = arg0;
			this.aClass1Array1 = new Class1[arg0];
			if (arg1) {
				this.anInt507 = -93;
			}
			for (@Pc(24) int local24 = 0; local24 < arg0; local24++) {
				@Pc(34) Class1 local34 = this.aClass1Array1[local24] = new Class1();
				local34.aClass1_41 = local34;
				local34.aClass1_42 = local34;
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("92763, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJCRDSKE", name = "a", descriptor = "(J)Lclient!XNCSKJMM;")
	public Class1 method327(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt508 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong24 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!LJCRDSKE", name = "a", descriptor = "(BLclient!XNCSKJMM;J)V")
	public void method328(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) long arg2) {
		try {
			if (arg1.aClass1_42 != null) {
				arg1.method507();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg2 & (long) (this.anInt508 - 1))];
			arg1.aClass1_42 = local18.aClass1_42;
			arg1.aClass1_41 = local18;
			@Pc(30) boolean local30 = false;
			arg1.aClass1_42.aClass1_41 = arg1;
			arg1.aClass1_41.aClass1_42 = arg1;
			arg1.aLong24 = arg2;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("24028, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}
}
