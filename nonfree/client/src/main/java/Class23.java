import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OYARMXQN")
public final class Class23 {

	@OriginalMember(owner = "client!OYARMXQN", name = "a", descriptor = "I")
	private int anInt493 = 708;

	@OriginalMember(owner = "client!OYARMXQN", name = "b", descriptor = "I")
	private int anInt494;

	@OriginalMember(owner = "client!OYARMXQN", name = "c", descriptor = "[Lclient!OYTUMBCI;")
	private Class3[] aClass3Array1;

	@OriginalMember(owner = "client!OYARMXQN", name = "<init>", descriptor = "(II)V")
	public Class23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt494 = arg1;
			this.aClass3Array1 = new Class3[arg1];
			for (@Pc(18) int local18 = 0; local18 < arg1; local18++) {
				@Pc(28) Class3 local28 = this.aClass3Array1[local18] = new Class3();
				local28.aClass3_39 = local28;
				local28.aClass3_40 = local28;
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("51819, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OYARMXQN", name = "a", descriptor = "(J)Lclient!OYTUMBCI;")
	public Class3 method295(@OriginalArg(0) long arg0) {
		@Pc(11) Class3 local11 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt494 - 1))];
		for (@Pc(14) Class3 local14 = local11.aClass3_39; local14 != local11; local14 = local14.aClass3_39) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!OYARMXQN", name = "a", descriptor = "(Lclient!OYTUMBCI;JI)V")
	public void method296(@OriginalArg(0) Class3 arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg0.aClass3_40 != null) {
				arg0.method559();
			}
			@Pc(18) Class3 local18 = this.aClass3Array1[(int) (arg1 & (long) (this.anInt494 - 1))];
			arg0.aClass3_40 = local18.aClass3_40;
			arg0.aClass3_39 = local18;
			arg0.aClass3_40.aClass3_39 = arg0;
			arg0.aClass3_39.aClass3_40 = arg0;
			arg0.aLong26 = arg1;
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("86674, " + arg0 + ", " + arg1 + ", " + 5 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}
}
