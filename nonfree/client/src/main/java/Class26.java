import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LTJSGGCA")
public final class Class26 {

	@OriginalMember(owner = "client!LTJSGGCA", name = "a", descriptor = "Z")
	private boolean aBoolean118 = true;

	@OriginalMember(owner = "client!LTJSGGCA", name = "b", descriptor = "I")
	private int anInt392 = -645;

	@OriginalMember(owner = "client!LTJSGGCA", name = "c", descriptor = "B")
	private byte aByte32 = -54;

	@OriginalMember(owner = "client!LTJSGGCA", name = "d", descriptor = "I")
	private int anInt393 = 9;

	@OriginalMember(owner = "client!LTJSGGCA", name = "e", descriptor = "Z")
	private boolean aBoolean119 = false;

	@OriginalMember(owner = "client!LTJSGGCA", name = "f", descriptor = "I")
	private int anInt394 = 866;

	@OriginalMember(owner = "client!LTJSGGCA", name = "g", descriptor = "I")
	private int anInt395;

	@OriginalMember(owner = "client!LTJSGGCA", name = "h", descriptor = "[Lclient!TVKHSKYG;")
	private Class2[] aClass2Array1;

	@OriginalMember(owner = "client!LTJSGGCA", name = "<init>", descriptor = "(II)V")
	public Class26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt395 = arg0;
			this.aClass2Array1 = new Class2[arg0];
			for (@Pc(28) int local28 = 0; local28 < arg0; local28++) {
				@Pc(38) Class2 local38 = this.aClass2Array1[local28] = new Class2();
				local38.aClass2_41 = local38;
				local38.aClass2_42 = local38;
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("74503, " + arg0 + ", " + arg1 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LTJSGGCA", name = "a", descriptor = "(J)Lclient!TVKHSKYG;")
	public Class2 method312(@OriginalArg(0) long arg0) {
		@Pc(11) Class2 local11 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt395 - 1))];
		for (@Pc(14) Class2 local14 = local11.aClass2_41; local14 != local11; local14 = local14.aClass2_41) {
			if (local14.aLong25 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!LTJSGGCA", name = "a", descriptor = "(ILclient!TVKHSKYG;J)V")
	public void method313(@OriginalArg(1) Class2 arg0, @OriginalArg(2) long arg1) {
		try {
			if (arg0.aClass2_42 != null) {
				arg0.method530();
			}
			@Pc(18) Class2 local18 = this.aClass2Array1[(int) (arg1 & (long) (this.anInt395 - 1))];
			if (this.anInt393 != 9) {
				this.aBoolean118 = !this.aBoolean118;
			}
			arg0.aClass2_42 = local18.aClass2_42;
			arg0.aClass2_41 = local18;
			arg0.aClass2_42.aClass2_41 = arg0;
			arg0.aClass2_41.aClass2_42 = arg0;
			arg0.aLong25 = arg1;
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("41625, " + 9 + ", " + arg0 + ", " + arg1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}
}
