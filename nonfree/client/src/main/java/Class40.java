import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VWNUVMOR")
public final class Class40 {

	@OriginalMember(owner = "client!VWNUVMOR", name = "a", descriptor = "I")
	private int anInt726;

	@OriginalMember(owner = "client!VWNUVMOR", name = "b", descriptor = "I")
	private int anInt727;

	@OriginalMember(owner = "client!VWNUVMOR", name = "c", descriptor = "[Lclient!JZLLDEPM;")
	private Class2[] aClass2Array1;

	@OriginalMember(owner = "client!VWNUVMOR", name = "<init>", descriptor = "(II)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt727 = arg0;
			this.aClass2Array1 = new Class2[arg0];
			for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
				@Pc(20) Class2 local20 = this.aClass2Array1[local10] = new Class2();
				local20.aClass2_39 = local20;
				local20.aClass2_40 = local20;
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("19576, " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VWNUVMOR", name = "a", descriptor = "(J)Lclient!JZLLDEPM;")
	public Class2 method490(@OriginalArg(0) long arg0) {
		@Pc(11) Class2 local11 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt727 - 1))];
		for (@Pc(14) Class2 local14 = local11.aClass2_39; local14 != local11; local14 = local14.aClass2_39) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!VWNUVMOR", name = "a", descriptor = "(ZLclient!JZLLDEPM;J)V")
	public void method491(@OriginalArg(1) Class2 arg0, @OriginalArg(2) long arg1) {
		try {
			if (arg0.aClass2_40 != null) {
				arg0.method504();
			}
			@Pc(18) Class2 local18 = this.aClass2Array1[(int) (arg1 & (long) (this.anInt727 - 1))];
			arg0.aClass2_40 = local18.aClass2_40;
			arg0.aClass2_39 = local18;
			arg0.aClass2_40.aClass2_39 = arg0;
			arg0.aClass2_39.aClass2_40 = arg0;
			arg0.aLong26 = arg1;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("46280, " + true + ", " + arg0 + ", " + arg1 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}
}
