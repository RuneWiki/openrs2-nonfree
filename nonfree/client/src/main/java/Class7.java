import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EKGZTZOT")
public final class Class7 {

	@OriginalMember(owner = "client!EKGZTZOT", name = "a", descriptor = "Z")
	private boolean aBoolean41 = false;

	@OriginalMember(owner = "client!EKGZTZOT", name = "b", descriptor = "I")
	private int anInt171 = -971;

	@OriginalMember(owner = "client!EKGZTZOT", name = "c", descriptor = "I")
	private int anInt172;

	@OriginalMember(owner = "client!EKGZTZOT", name = "d", descriptor = "[Lclient!AJSSLSFA;")
	private Class2[] aClass2Array1;

	@OriginalMember(owner = "client!EKGZTZOT", name = "<init>", descriptor = "(II)V")
	public Class7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt172 = arg1;
			this.aClass2Array1 = new Class2[arg1];
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(26) Class2 local26 = this.aClass2Array1[local16] = new Class2();
				local26.aClass2_39 = local26;
				local26.aClass2_40 = local26;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("56137, " + arg0 + ", " + arg1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EKGZTZOT", name = "a", descriptor = "(J)Lclient!AJSSLSFA;")
	public Class2 method132(@OriginalArg(0) long arg0) {
		@Pc(11) Class2 local11 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt172 - 1))];
		for (@Pc(14) Class2 local14 = local11.aClass2_39; local14 != local11; local14 = local14.aClass2_39) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!EKGZTZOT", name = "a", descriptor = "(Lclient!AJSSLSFA;JI)V")
	public void method133(@OriginalArg(0) Class2 arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg0.aClass2_40 != null) {
				arg0.method558();
			}
			@Pc(18) Class2 local18 = this.aClass2Array1[(int) (arg1 & (long) (this.anInt172 - 1))];
			arg0.aClass2_40 = local18.aClass2_40;
			arg0.aClass2_39 = local18;
			arg0.aClass2_40.aClass2_39 = arg0;
			arg0.aClass2_39.aClass2_40 = arg0;
			arg0.aLong26 = arg1;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("22952, " + arg0 + ", " + arg1 + ", " + -485 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}
}
