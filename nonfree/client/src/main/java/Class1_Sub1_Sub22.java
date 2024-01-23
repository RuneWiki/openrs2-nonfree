import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class1_Sub1_Sub22 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sd", name = "O", descriptor = "Lclient!ff;")
	private Class33 aClass33_14;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!nc;Z)V")
	public void method2850(@OriginalArg(0) Class1_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method895();
			if (local5 == 0) {
				return;
			}
			this.method2853(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)I")
	public int method2851(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass33_14 == null) {
			return arg1;
		} else {
			@Pc(16) Class1_Sub16 local16 = (Class1_Sub16) this.aClass33_14.method1071((long) arg0);
			return local16 == null ? arg1 : local16.anInt2543;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILclient!kh;)Lclient!kh;")
	public Class60 method2852(@OriginalArg(0) int arg0, @OriginalArg(2) Class60 arg1) {
		if (this.aClass33_14 == null) {
			return arg1;
		} else {
			@Pc(22) Class1_Sub6 local22 = (Class1_Sub6) this.aClass33_14.method1071((long) arg0);
			return local22 == null ? arg1 : local22.aClass60_251;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!nc;IB)V")
	private void method2853(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(15) int local15 = arg0.method895();
		@Pc(22) int local22;
		if (this.aClass33_14 == null) {
			local22 = Static61.method1102(local15);
			this.aClass33_14 = new Class33(local22);
		}
		for (local22 = 0; local22 < local15; local22++) {
			@Pc(41) boolean local41 = arg0.method895() == 1;
			@Pc(47) int local47 = arg0.method920();
			@Pc(56) Class1 local56;
			if (local41) {
				local56 = new Class1_Sub6(arg0.method935());
			} else {
				local56 = new Class1_Sub16(arg0.method915());
			}
			this.aClass33_14.method1072((long) local47, local56);
		}
	}
}
