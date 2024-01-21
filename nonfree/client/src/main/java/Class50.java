import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZZGAIEMG")
public final class Class50 {

	@OriginalMember(owner = "client!ZZGAIEMG", name = "a", descriptor = "I")
	private int anInt800 = 180;

	@OriginalMember(owner = "client!ZZGAIEMG", name = "b", descriptor = "Z")
	private boolean aBoolean204 = true;

	@OriginalMember(owner = "client!ZZGAIEMG", name = "c", descriptor = "I")
	private int anInt801 = -420;

	@OriginalMember(owner = "client!ZZGAIEMG", name = "d", descriptor = "Z")
	private boolean aBoolean205 = true;

	@OriginalMember(owner = "client!ZZGAIEMG", name = "e", descriptor = "I")
	private int anInt802;

	@OriginalMember(owner = "client!ZZGAIEMG", name = "f", descriptor = "[Lclient!CZLFLPZK;")
	private Class6[] aClass6Array1;

	@OriginalMember(owner = "client!ZZGAIEMG", name = "<init>", descriptor = "(II)V")
	public Class50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt802 = arg0;
			this.aClass6Array1 = new Class6[arg0];
			for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
				@Pc(32) Class6 local32 = this.aClass6Array1[local22] = new Class6();
				local32.aClass6_41 = local32;
				local32.aClass6_42 = local32;
			}
			@Pc(46) int local46 = 95 / arg1;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("29345, " + arg0 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZZGAIEMG", name = "a", descriptor = "(J)Lclient!CZLFLPZK;")
	public Class6 method572(@OriginalArg(0) long arg0) {
		@Pc(11) Class6 local11 = this.aClass6Array1[(int) (arg0 & (long) (this.anInt802 - 1))];
		for (@Pc(14) Class6 local14 = local11.aClass6_41; local14 != local11; local14 = local14.aClass6_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ZZGAIEMG", name = "a", descriptor = "(IJLclient!CZLFLPZK;)V")
	public void method573(@OriginalArg(1) long arg0, @OriginalArg(2) Class6 arg1) {
		try {
			if (arg1.aClass6_42 != null) {
				arg1.method542();
			}
			@Pc(18) Class6 local18 = this.aClass6Array1[(int) (arg0 & (long) (this.anInt802 - 1))];
			arg1.aClass6_42 = local18.aClass6_42;
			arg1.aClass6_41 = local18;
			arg1.aClass6_42.aClass6_41 = arg1;
			arg1.aClass6_41.aClass6_42 = arg1;
			arg1.aLong26 = arg0;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("67110, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}
}
