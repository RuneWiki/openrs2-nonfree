import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DIFURFJI")
public final class Class8 {

	@OriginalMember(owner = "client!DIFURFJI", name = "a", descriptor = "I")
	private int anInt117 = 3;

	@OriginalMember(owner = "client!DIFURFJI", name = "b", descriptor = "Z")
	private boolean aBoolean51 = true;

	@OriginalMember(owner = "client!DIFURFJI", name = "c", descriptor = "I")
	private int anInt118;

	@OriginalMember(owner = "client!DIFURFJI", name = "d", descriptor = "[Lclient!OJTWJXEY;")
	private Class2[] aClass2Array1;

	@OriginalMember(owner = "client!DIFURFJI", name = "<init>", descriptor = "(II)V")
	public Class8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt118 = arg1;
			if (arg0 != 35268) {
				this.aBoolean51 = !this.aBoolean51;
			}
			this.aClass2Array1 = new Class2[arg1];
			for (@Pc(27) int local27 = 0; local27 < arg1; local27++) {
				@Pc(37) Class2 local37 = this.aClass2Array1[local27] = new Class2();
				local37.aClass2_41 = local37;
				local37.aClass2_42 = local37;
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("25701, " + arg0 + ", " + arg1 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIFURFJI", name = "a", descriptor = "(J)Lclient!OJTWJXEY;")
	public Class2 method79(@OriginalArg(0) long arg0) {
		@Pc(11) Class2 local11 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt118 - 1))];
		for (@Pc(14) Class2 local14 = local11.aClass2_41; local14 != local11; local14 = local14.aClass2_41) {
			if (local14.aLong23 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!DIFURFJI", name = "a", descriptor = "(JLclient!OJTWJXEY;Z)V")
	public void method80(@OriginalArg(0) long arg0, @OriginalArg(1) Class2 arg1) {
		try {
			if (arg1.aClass2_42 != null) {
				arg1.method466();
			}
			@Pc(19) Class2 local19 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt118 - 1))];
			arg1.aClass2_42 = local19.aClass2_42;
			arg1.aClass2_41 = local19;
			arg1.aClass2_42.aClass2_41 = arg1;
			arg1.aClass2_41.aClass2_42 = arg1;
			arg1.aLong23 = arg0;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("12821, " + arg0 + ", " + arg1 + ", " + true + ", " + local39.toString());
			throw new RuntimeException();
		}
	}
}
