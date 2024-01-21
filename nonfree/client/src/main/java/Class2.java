import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ARZPHHDH")
public final class Class2 {

	@OriginalMember(owner = "client!ARZPHHDH", name = "a", descriptor = "Z")
	private boolean aBoolean10 = false;

	@OriginalMember(owner = "client!ARZPHHDH", name = "b", descriptor = "I")
	private int anInt14 = -373;

	@OriginalMember(owner = "client!ARZPHHDH", name = "c", descriptor = "I")
	private int anInt15;

	@OriginalMember(owner = "client!ARZPHHDH", name = "d", descriptor = "[Lclient!PKVMXVTO;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!ARZPHHDH", name = "<init>", descriptor = "(II)V")
	public Class2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt15 = arg1;
			this.aClass1Array1 = new Class1[arg1];
			for (@Pc(22) int local22 = 0; local22 < arg1; local22++) {
				@Pc(32) Class1 local32 = this.aClass1Array1[local22] = new Class1();
				local32.aClass1_41 = local32;
				local32.aClass1_42 = local32;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("52921, " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ARZPHHDH", name = "a", descriptor = "(J)Lclient!PKVMXVTO;")
	public Class1 method18(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt15 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ARZPHHDH", name = "a", descriptor = "(Lclient!PKVMXVTO;JB)V")
	public void method19(@OriginalArg(0) Class1 arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method526();
			}
			@Pc(16) Class1 local16 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt15 - 1))];
			arg0.aClass1_42 = local16.aClass1_42;
			arg0.aClass1_41 = local16;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
			arg0.aLong26 = arg1;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("91499, " + arg0 + ", " + arg1 + ", " + 7 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}
}
