import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MPNPHMKJ")
public final class Class24 {

	@OriginalMember(owner = "client!MPNPHMKJ", name = "a", descriptor = "I")
	private int anInt371;

	@OriginalMember(owner = "client!MPNPHMKJ", name = "b", descriptor = "I")
	private int anInt372 = 850;

	@OriginalMember(owner = "client!MPNPHMKJ", name = "c", descriptor = "I")
	private int anInt373;

	@OriginalMember(owner = "client!MPNPHMKJ", name = "d", descriptor = "[Lclient!NQPZRHXK;")
	private Class6[] aClass6Array1;

	@OriginalMember(owner = "client!MPNPHMKJ", name = "<init>", descriptor = "(II)V")
	public Class24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt373 = arg1;
			this.aClass6Array1 = new Class6[arg1];
			for (@Pc(19) int local19 = 0; local19 < arg1; local19++) {
				@Pc(29) Class6 local29 = this.aClass6Array1[local19] = new Class6();
				local29.aClass6_41 = local29;
				local29.aClass6_42 = local29;
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("51607, " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MPNPHMKJ", name = "a", descriptor = "(J)Lclient!NQPZRHXK;")
	public Class6 method185(@OriginalArg(0) long arg0) {
		@Pc(11) Class6 local11 = this.aClass6Array1[(int) (arg0 & (long) (this.anInt373 - 1))];
		for (@Pc(14) Class6 local14 = local11.aClass6_41; local14 != local11; local14 = local14.aClass6_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!MPNPHMKJ", name = "a", descriptor = "(JLclient!NQPZRHXK;I)V")
	public void method186(@OriginalArg(0) long arg0, @OriginalArg(1) Class6 arg1) {
		try {
			if (arg1.aClass6_42 != null) {
				arg1.method545();
			}
			@Pc(18) Class6 local18 = this.aClass6Array1[(int) (arg0 & (long) (this.anInt373 - 1))];
			arg1.aClass6_42 = local18.aClass6_42;
			arg1.aClass6_41 = local18;
			arg1.aClass6_42.aClass6_41 = arg1;
			arg1.aClass6_41.aClass6_42 = arg1;
			arg1.aLong26 = arg0;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("88657, " + arg0 + ", " + arg1 + ", " + 850 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}
}
