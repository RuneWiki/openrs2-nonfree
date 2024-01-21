import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BCCRZRYI")
public final class Class5 {

	@OriginalMember(owner = "client!BCCRZRYI", name = "a", descriptor = "I")
	private int anInt82 = 616;

	@OriginalMember(owner = "client!BCCRZRYI", name = "b", descriptor = "Z")
	private boolean aBoolean19 = true;

	@OriginalMember(owner = "client!BCCRZRYI", name = "c", descriptor = "I")
	private int anInt83;

	@OriginalMember(owner = "client!BCCRZRYI", name = "d", descriptor = "[Lclient!BEBSUZBY;")
	private Class3[] aClass3Array1;

	@OriginalMember(owner = "client!BCCRZRYI", name = "<init>", descriptor = "(II)V")
	public Class5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt83 = arg0;
			this.aClass3Array1 = new Class3[arg0];
			for (@Pc(16) int local16 = 0; local16 < arg0; local16++) {
				@Pc(26) Class3 local26 = this.aClass3Array1[local16] = new Class3();
				local26.aClass3_41 = local26;
				local26.aClass3_42 = local26;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("69866, " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BCCRZRYI", name = "a", descriptor = "(J)Lclient!BEBSUZBY;")
	public Class3 method41(@OriginalArg(0) long arg0) {
		@Pc(11) Class3 local11 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt83 - 1))];
		for (@Pc(14) Class3 local14 = local11.aClass3_41; local14 != local11; local14 = local14.aClass3_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!BCCRZRYI", name = "a", descriptor = "(JBLclient!BEBSUZBY;)V")
	public void method42(@OriginalArg(0) long arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class3 arg2) {
		try {
			if (arg2.aClass3_42 != null) {
				arg2.method545();
			}
			@Pc(18) Class3 local18 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt83 - 1))];
			arg2.aClass3_42 = local18.aClass3_42;
			arg2.aClass3_41 = local18;
			arg2.aClass3_42.aClass3_41 = arg2;
			if (arg1 == 5) {
				@Pc(34) boolean local34 = false;
				arg2.aClass3_41.aClass3_42 = arg2;
				arg2.aLong26 = arg0;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("4738, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}
}
