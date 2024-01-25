import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!at", name = "p", descriptor = "Lclient!ba;")
	private Class17 aClass17_2;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method564(@OriginalArg(0) Class1_Sub6 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3922();
			if (local5 == 0) {
				return;
			}
			this.method569(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IZI)I")
	public int method566(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass17_2 == null) {
			return arg1;
		} else {
			@Pc(21) Class1_Sub9 local21 = (Class1_Sub9) this.aClass17_2.method738((long) arg0);
			return local21 == null ? arg1 : local21.anInt1173;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method568(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass17_2 == null) {
			return arg0;
		} else {
			@Pc(21) Class1_Sub25 local21 = (Class1_Sub25) this.aClass17_2.method738((long) arg1);
			return local21 == null ? arg0 : local21.aString37;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!ge;ZI)V")
	private void method569(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(10) int local10 = arg0.method3922();
		@Pc(17) int local17;
		if (this.aClass17_2 == null) {
			local17 = Static352.method5306(local10);
			this.aClass17_2 = new Class17(local17);
		}
		for (local17 = 0; local17 < local10; local17++) {
			@Pc(36) boolean local36 = arg0.method3922() == 1;
			@Pc(40) int local40 = arg0.method3920();
			@Pc(49) Class1 local49;
			if (local36) {
				local49 = new Class1_Sub25(arg0.method3954());
			} else {
				local49 = new Class1_Sub9(arg0.method3925());
			}
			this.aClass17_2.method737(local49, (long) local40);
		}
	}
}
