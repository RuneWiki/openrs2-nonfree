import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SAEPCADT")
public final class Class33 {

	@OriginalMember(owner = "client!SAEPCADT", name = "a", descriptor = "I")
	private int anInt449 = 38686;

	@OriginalMember(owner = "client!SAEPCADT", name = "b", descriptor = "I")
	private int anInt450 = 12314;

	@OriginalMember(owner = "client!SAEPCADT", name = "c", descriptor = "Z")
	private boolean aBoolean144 = true;

	@OriginalMember(owner = "client!SAEPCADT", name = "d", descriptor = "I")
	private int anInt451;

	@OriginalMember(owner = "client!SAEPCADT", name = "e", descriptor = "[Lclient!WYQNTERC;")
	private Class3[] aClass3Array1;

	@OriginalMember(owner = "client!SAEPCADT", name = "<init>", descriptor = "(II)V")
	public Class33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt451 = arg1;
			this.aClass3Array1 = new Class3[arg1];
			for (@Pc(19) int local19 = 0; local19 < arg1; local19++) {
				@Pc(29) Class3 local29 = this.aClass3Array1[local19] = new Class3();
				local29.aClass3_41 = local29;
				local29.aClass3_42 = local29;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("18040, " + arg0 + ", " + arg1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SAEPCADT", name = "a", descriptor = "(J)Lclient!WYQNTERC;")
	public Class3 method354(@OriginalArg(0) long arg0) {
		@Pc(11) Class3 local11 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt451 - 1))];
		for (@Pc(14) Class3 local14 = local11.aClass3_41; local14 != local11; local14 = local14.aClass3_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!SAEPCADT", name = "a", descriptor = "(IJLclient!WYQNTERC;)V")
	public void method355(@OriginalArg(1) long arg0, @OriginalArg(2) Class3 arg1) {
		try {
			if (arg1.aClass3_42 != null) {
				arg1.method535();
			}
			@Pc(24) Class3 local24 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt451 - 1))];
			arg1.aClass3_42 = local24.aClass3_42;
			arg1.aClass3_41 = local24;
			arg1.aClass3_42.aClass3_41 = arg1;
			arg1.aClass3_41.aClass3_42 = arg1;
			arg1.aLong26 = arg0;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("16567, " + -11582 + ", " + arg0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}
}
