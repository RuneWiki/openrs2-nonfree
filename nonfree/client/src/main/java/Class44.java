import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YDNMMDSW")
public final class Class44 {

	@OriginalMember(owner = "client!YDNMMDSW", name = "a", descriptor = "I")
	private int anInt677 = -582;

	@OriginalMember(owner = "client!YDNMMDSW", name = "b", descriptor = "I")
	private int anInt678 = 964;

	@OriginalMember(owner = "client!YDNMMDSW", name = "c", descriptor = "I")
	private int anInt679;

	@OriginalMember(owner = "client!YDNMMDSW", name = "d", descriptor = "[Lclient!PXORWIXO;")
	private Class2[] aClass2Array1;

	@OriginalMember(owner = "client!YDNMMDSW", name = "<init>", descriptor = "(II)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt679 = arg1;
			this.aClass2Array1 = new Class2[arg1];
			@Pc(18) int local18 = 52 / arg0;
			for (@Pc(20) int local20 = 0; local20 < arg1; local20++) {
				@Pc(30) Class2 local30 = this.aClass2Array1[local20] = new Class2();
				local30.aClass2_41 = local30;
				local30.aClass2_42 = local30;
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("10463, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YDNMMDSW", name = "a", descriptor = "(J)Lclient!PXORWIXO;")
	public Class2 method508(@OriginalArg(0) long arg0) {
		@Pc(11) Class2 local11 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt679 - 1))];
		for (@Pc(14) Class2 local14 = local11.aClass2_41; local14 != local11; local14 = local14.aClass2_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!YDNMMDSW", name = "a", descriptor = "(JLclient!PXORWIXO;Z)V")
	public void method509(@OriginalArg(0) long arg0, @OriginalArg(1) Class2 arg1) {
		try {
			if (arg1.aClass2_42 != null) {
				arg1.method573();
			}
			@Pc(18) Class2 local18 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt679 - 1))];
			arg1.aClass2_42 = local18.aClass2_42;
			arg1.aClass2_41 = local18;
			arg1.aClass2_42.aClass2_41 = arg1;
			arg1.aClass2_41.aClass2_42 = arg1;
			arg1.aLong26 = arg0;
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("71390, " + arg0 + ", " + arg1 + ", " + true + ", " + local49.toString());
			throw new RuntimeException();
		}
	}
}
