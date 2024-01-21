import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SMFBSJJD")
public final class Class39 {

	@OriginalMember(owner = "client!SMFBSJJD", name = "a", descriptor = "I")
	private int anInt722;

	@OriginalMember(owner = "client!SMFBSJJD", name = "b", descriptor = "B")
	private byte aByte18 = 8;

	@OriginalMember(owner = "client!SMFBSJJD", name = "c", descriptor = "I")
	private int anInt723;

	@OriginalMember(owner = "client!SMFBSJJD", name = "d", descriptor = "[Lclient!SSWDZUWQ;")
	private Class6[] aClass6Array1;

	@OriginalMember(owner = "client!SMFBSJJD", name = "<init>", descriptor = "(II)V")
	public Class39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt723 = arg1;
			this.aClass6Array1 = new Class6[arg1];
			@Pc(16) int local16;
			if (arg0 != 4) {
				for (local16 = 1; local16 > 0; local16++) {
				}
			}
			for (local16 = 0; local16 < arg1; local16++) {
				@Pc(32) Class6 local32 = this.aClass6Array1[local16] = new Class6();
				local32.aClass6_41 = local32;
				local32.aClass6_42 = local32;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("37493, " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SMFBSJJD", name = "a", descriptor = "(J)Lclient!SSWDZUWQ;")
	public Class6 method459(@OriginalArg(0) long arg0) {
		@Pc(11) Class6 local11 = this.aClass6Array1[(int) (arg0 & (long) (this.anInt723 - 1))];
		for (@Pc(14) Class6 local14 = local11.aClass6_41; local14 != local11; local14 = local14.aClass6_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!SMFBSJJD", name = "a", descriptor = "(JLclient!SSWDZUWQ;Z)V")
	public void method460(@OriginalArg(0) long arg0, @OriginalArg(1) Class6 arg1) {
		try {
			if (arg1.aClass6_42 != null) {
				arg1.method548();
			}
			@Pc(23) Class6 local23 = this.aClass6Array1[(int) (arg0 & (long) (this.anInt723 - 1))];
			arg1.aClass6_42 = local23.aClass6_42;
			arg1.aClass6_41 = local23;
			arg1.aClass6_42.aClass6_41 = arg1;
			arg1.aClass6_41.aClass6_42 = arg1;
			arg1.aLong26 = arg0;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("48738, " + arg0 + ", " + arg1 + ", " + true + ", " + local51.toString());
			throw new RuntimeException();
		}
	}
}
