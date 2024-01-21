import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BELQMOFW")
public final class Class1 {

	@OriginalMember(owner = "client!BELQMOFW", name = "a", descriptor = "I")
	private int anInt23 = -543;

	@OriginalMember(owner = "client!BELQMOFW", name = "b", descriptor = "I")
	private int anInt24;

	@OriginalMember(owner = "client!BELQMOFW", name = "c", descriptor = "[Lclient!CDEGFOQA;")
	private Class3[] aClass3Array1;

	@OriginalMember(owner = "client!BELQMOFW", name = "<init>", descriptor = "(BI)V")
	public Class1(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt24 = arg1;
			this.aClass3Array1 = new Class3[arg1];
			for (@Pc(13) int local13 = 0; local13 < arg1; local13++) {
				@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
				local23.aClass3_41 = local23;
				local23.aClass3_42 = local23;
			}
			if (arg0 != 52) {
				throw new NullPointerException();
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("11230, " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BELQMOFW", name = "a", descriptor = "(J)Lclient!CDEGFOQA;")
	public Class3 method14(@OriginalArg(0) long arg0) {
		@Pc(11) Class3 local11 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt24 - 1))];
		for (@Pc(14) Class3 local14 = local11.aClass3_41; local14 != local11; local14 = local14.aClass3_41) {
			if (local14.aLong25 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!BELQMOFW", name = "a", descriptor = "(JLclient!CDEGFOQA;B)V")
	public void method15(@OriginalArg(0) long arg0, @OriginalArg(1) Class3 arg1) {
		try {
			if (arg1.aClass3_42 != null) {
				arg1.method503();
			}
			@Pc(18) Class3 local18 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt24 - 1))];
			arg1.aClass3_42 = local18.aClass3_42;
			arg1.aClass3_41 = local18;
			arg1.aClass3_42.aClass3_41 = arg1;
			arg1.aClass3_41.aClass3_42 = arg1;
			arg1.aLong25 = arg0;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("63200, " + arg0 + ", " + arg1 + ", " + -18 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}
}
