import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XWMRKIHQ")
public final class Class45 {

	@OriginalMember(owner = "client!XWMRKIHQ", name = "a", descriptor = "I")
	private int anInt660 = 3;

	@OriginalMember(owner = "client!XWMRKIHQ", name = "b", descriptor = "Z")
	private boolean aBoolean162 = true;

	@OriginalMember(owner = "client!XWMRKIHQ", name = "c", descriptor = "I")
	private int anInt661;

	@OriginalMember(owner = "client!XWMRKIHQ", name = "d", descriptor = "[Lclient!MRGQMKFG;")
	private Class3[] aClass3Array1;

	@OriginalMember(owner = "client!XWMRKIHQ", name = "<init>", descriptor = "(II)V")
	public Class45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt661 = arg0;
			this.aClass3Array1 = new Class3[arg0];
			for (@Pc(16) int local16 = 0; local16 < arg0; local16++) {
				@Pc(26) Class3 local26 = this.aClass3Array1[local16] = new Class3();
				local26.aClass3_41 = local26;
				local26.aClass3_42 = local26;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("54196, " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWMRKIHQ", name = "a", descriptor = "(J)Lclient!MRGQMKFG;")
	public Class3 method482(@OriginalArg(0) long arg0) {
		@Pc(11) Class3 local11 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt661 - 1))];
		for (@Pc(14) Class3 local14 = local11.aClass3_41; local14 != local11; local14 = local14.aClass3_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!XWMRKIHQ", name = "a", descriptor = "(BLclient!MRGQMKFG;J)V")
	public void method483(@OriginalArg(1) Class3 arg0, @OriginalArg(2) long arg1) {
		try {
			if (arg0.aClass3_42 != null) {
				arg0.method547();
			}
			@Pc(18) Class3 local18 = this.aClass3Array1[(int) (arg1 & (long) (this.anInt661 - 1))];
			arg0.aClass3_42 = local18.aClass3_42;
			arg0.aClass3_41 = local18;
			arg0.aClass3_42.aClass3_41 = arg0;
			arg0.aClass3_41.aClass3_42 = arg0;
			arg0.aLong26 = arg1;
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("93248, " + 5 + ", " + arg0 + ", " + arg1 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}
}
