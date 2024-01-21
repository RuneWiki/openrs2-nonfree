import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OAXQGLDV")
public final class Class24 {

	@OriginalMember(owner = "client!OAXQGLDV", name = "a", descriptor = "I")
	private int anInt466 = 33605;

	@OriginalMember(owner = "client!OAXQGLDV", name = "b", descriptor = "Z")
	private boolean aBoolean135 = false;

	@OriginalMember(owner = "client!OAXQGLDV", name = "c", descriptor = "Z")
	private boolean aBoolean136 = true;

	@OriginalMember(owner = "client!OAXQGLDV", name = "d", descriptor = "I")
	private int anInt467 = 7;

	@OriginalMember(owner = "client!OAXQGLDV", name = "e", descriptor = "I")
	private int anInt468;

	@OriginalMember(owner = "client!OAXQGLDV", name = "f", descriptor = "[Lclient!OKDOXVFL;")
	private Class6[] aClass6Array1;

	@OriginalMember(owner = "client!OAXQGLDV", name = "<init>", descriptor = "(IZ)V")
	public Class24(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anInt468 = arg0;
			this.aClass6Array1 = new Class6[arg0];
			for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
				@Pc(32) Class6 local32 = this.aClass6Array1[local22] = new Class6();
				local32.aClass6_41 = local32;
				local32.aClass6_42 = local32;
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("31632, " + arg0 + ", " + arg1 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OAXQGLDV", name = "a", descriptor = "(J)Lclient!OKDOXVFL;")
	public Class6 method297(@OriginalArg(0) long arg0) {
		@Pc(11) Class6 local11 = this.aClass6Array1[(int) (arg0 & (long) (this.anInt468 - 1))];
		for (@Pc(14) Class6 local14 = local11.aClass6_41; local14 != local11; local14 = local14.aClass6_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!OAXQGLDV", name = "a", descriptor = "(JLclient!OKDOXVFL;I)V")
	public void method298(@OriginalArg(0) long arg0, @OriginalArg(1) Class6 arg1) {
		try {
			if (arg1.aClass6_42 != null) {
				arg1.method512();
			}
			@Pc(18) Class6 local18 = this.aClass6Array1[(int) (arg0 & (long) (this.anInt468 - 1))];
			arg1.aClass6_42 = local18.aClass6_42;
			arg1.aClass6_41 = local18;
			arg1.aClass6_42.aClass6_41 = arg1;
			arg1.aClass6_41.aClass6_42 = arg1;
			arg1.aLong26 = arg0;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("86124, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}
}
