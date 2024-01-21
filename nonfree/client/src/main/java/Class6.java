import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BVBAURNI")
public final class Class6 {

	@OriginalMember(owner = "client!BVBAURNI", name = "a", descriptor = "I")
	private int anInt76;

	@OriginalMember(owner = "client!BVBAURNI", name = "b", descriptor = "[Lclient!ICYTWAKR;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!BVBAURNI", name = "<init>", descriptor = "(BI)V")
	public Class6(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt76 = arg1;
			this.aClass1Array1 = new Class1[arg1];
			for (@Pc(17) int local17 = 0; local17 < arg1; local17++) {
				@Pc(27) Class1 local27 = this.aClass1Array1[local17] = new Class1();
				local27.aClass1_41 = local27;
				local27.aClass1_42 = local27;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("48072, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BVBAURNI", name = "a", descriptor = "(J)Lclient!ICYTWAKR;")
	public Class1 method90(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt76 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!BVBAURNI", name = "a", descriptor = "(Lclient!ICYTWAKR;JZ)V")
	public void method91(@OriginalArg(0) Class1 arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method544();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt76 - 1))];
			arg0.aClass1_42 = local18.aClass1_42;
			arg0.aClass1_41 = local18;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
			arg0.aLong26 = arg1;
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("87552, " + arg0 + ", " + arg1 + ", " + true + ", " + local49.toString());
			throw new RuntimeException();
		}
	}
}
