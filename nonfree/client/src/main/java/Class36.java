import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SOYNUDRE")
public final class Class36 {

	@OriginalMember(owner = "client!SOYNUDRE", name = "a", descriptor = "I")
	private int anInt600 = 568;

	@OriginalMember(owner = "client!SOYNUDRE", name = "b", descriptor = "Z")
	private boolean aBoolean148 = false;

	@OriginalMember(owner = "client!SOYNUDRE", name = "c", descriptor = "I")
	private int anInt601;

	@OriginalMember(owner = "client!SOYNUDRE", name = "d", descriptor = "[Lclient!BRISMNPP;")
	private Class2[] aClass2Array1;

	@OriginalMember(owner = "client!SOYNUDRE", name = "<init>", descriptor = "(IB)V")
	public Class36(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			this.anInt601 = arg0;
			this.aClass2Array1 = new Class2[arg0];
			for (@Pc(23) int local23 = 0; local23 < arg0; local23++) {
				@Pc(33) Class2 local33 = this.aClass2Array1[local23] = new Class2();
				local33.aClass2_41 = local33;
				local33.aClass2_42 = local33;
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("12214, " + arg0 + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SOYNUDRE", name = "a", descriptor = "(J)Lclient!BRISMNPP;")
	public Class2 method392(@OriginalArg(0) long arg0) {
		@Pc(11) Class2 local11 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt601 - 1))];
		for (@Pc(14) Class2 local14 = local11.aClass2_41; local14 != local11; local14 = local14.aClass2_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!SOYNUDRE", name = "a", descriptor = "(ZLclient!BRISMNPP;J)V")
	public void method393(@OriginalArg(1) Class2 arg0, @OriginalArg(2) long arg1) {
		try {
			if (arg0.aClass2_42 != null) {
				arg0.method507();
			}
			@Pc(18) Class2 local18 = this.aClass2Array1[(int) (arg1 & (long) (this.anInt601 - 1))];
			arg0.aClass2_42 = local18.aClass2_42;
			arg0.aClass2_41 = local18;
			arg0.aClass2_42.aClass2_41 = arg0;
			arg0.aClass2_41.aClass2_42 = arg0;
			arg0.aLong26 = arg1;
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("46373, " + false + ", " + arg0 + ", " + arg1 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}
}
