import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class2_Sub1_Sub4 extends Class2_Sub1 {

	@OriginalMember(owner = "client!dj", name = "v", descriptor = "Lclient!ru;")
	private Class220 aClass220_3;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BII)I")
	public int method1117(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass220_3 == null) {
			return arg1;
		} else {
			@Pc(16) Class2_Sub5 local16 = (Class2_Sub5) this.aClass220_3.method5099((long) arg0);
			return local16 == null ? arg1 : local16.anInt603;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!hw;Z)V")
	public void method1118(@OriginalArg(0) Class2_Sub17 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method6138();
			if (local15 == 0) {
				return;
			}
			this.method1119(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!hw;II)V")
	private void method1119(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(8) int local8 = arg0.method6138();
		@Pc(17) int local17;
		if (this.aClass220_3 == null) {
			local17 = Static43.method654(local8);
			this.aClass220_3 = new Class220(local17);
		}
		for (local17 = 0; local17 < local8; local17++) {
			@Pc(40) boolean local40 = arg0.method6138() == 1;
			@Pc(46) int local46 = arg0.method6145();
			@Pc(55) Class2 local55;
			if (local40) {
				local55 = new Class2_Sub29(arg0.method6141());
			} else {
				local55 = new Class2_Sub5(arg0.method6129());
			}
			this.aClass220_3.method5104(local55, (long) local46);
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method1121(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass220_3 == null) {
			return arg0;
		} else {
			@Pc(21) Class2_Sub29 local21 = (Class2_Sub29) this.aClass220_3.method5099((long) arg1);
			return local21 == null ? arg0 : local21.aString43;
		}
	}
}
