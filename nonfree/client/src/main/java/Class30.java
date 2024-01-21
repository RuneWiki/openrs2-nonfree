import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MCCUMEPE")
public final class Class30 {

	@OriginalMember(owner = "client!MCCUMEPE", name = "a", descriptor = "I")
	private int anInt422 = -27970;

	@OriginalMember(owner = "client!MCCUMEPE", name = "b", descriptor = "I")
	private int anInt423 = 831;

	@OriginalMember(owner = "client!MCCUMEPE", name = "c", descriptor = "I")
	private int anInt424 = 831;

	@OriginalMember(owner = "client!MCCUMEPE", name = "d", descriptor = "Z")
	private boolean aBoolean123 = true;

	@OriginalMember(owner = "client!MCCUMEPE", name = "e", descriptor = "I")
	private int anInt425 = -891;

	@OriginalMember(owner = "client!MCCUMEPE", name = "f", descriptor = "I")
	private int anInt426;

	@OriginalMember(owner = "client!MCCUMEPE", name = "g", descriptor = "[Lclient!OWNYSRQV;")
	private Class5[] aClass5Array1;

	@OriginalMember(owner = "client!MCCUMEPE", name = "<init>", descriptor = "(II)V")
	public Class30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt426 = arg0;
			this.aClass5Array1 = new Class5[arg0];
			for (@Pc(30) int local30 = 0; local30 < arg0; local30++) {
				@Pc(40) Class5 local40 = this.aClass5Array1[local30] = new Class5();
				local40.aClass5_41 = local40;
				local40.aClass5_42 = local40;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("31925, " + arg0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MCCUMEPE", name = "a", descriptor = "(J)Lclient!OWNYSRQV;")
	public Class5 method223(@OriginalArg(0) long arg0) {
		@Pc(13) Class5 local13 = this.aClass5Array1[(int) (arg0 & (long) (this.anInt426 - 1))];
		for (@Pc(16) Class5 local16 = local13.aClass5_41; local16 != local13; local16 = local16.aClass5_41) {
			if (local16.aLong26 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!MCCUMEPE", name = "a", descriptor = "(BLclient!OWNYSRQV;J)V")
	public void method224(@OriginalArg(1) Class5 arg0, @OriginalArg(2) long arg1) {
		try {
			if (arg0.aClass5_42 != null) {
				arg0.method423();
			}
			@Pc(16) Class5 local16 = this.aClass5Array1[(int) (arg1 & (long) (this.anInt426 - 1))];
			arg0.aClass5_42 = local16.aClass5_42;
			arg0.aClass5_41 = local16;
			arg0.aClass5_42.aClass5_41 = arg0;
			arg0.aClass5_41.aClass5_42 = arg0;
			arg0.aLong26 = arg1;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("41091, " + 87 + ", " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}
}
