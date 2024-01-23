import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class2_Sub3_Sub2 extends Class2_Sub3 {

	@OriginalMember(owner = "client!al", name = "J", descriptor = "Lclient!ii;")
	private Class79 aClass79_2;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IBI)I")
	public int method272(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass79_2 == null) {
			return arg1;
		} else {
			@Pc(22) Class2_Sub21 local22 = (Class2_Sub21) this.aClass79_2.method2002((long) arg0);
			return local22 == null ? arg1 : local22.anInt4234;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!wm;I)V")
	public void method273(@OriginalArg(0) Class2_Sub26 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4261();
			if (local14 == 0) {
				return;
			}
			this.method276(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IZLjava/lang/String;)Ljava/lang/String;")
	public String method274(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass79_2 == null) {
			return arg1;
		} else {
			@Pc(17) Class2_Sub16 local17 = (Class2_Sub16) this.aClass79_2.method2002((long) arg0);
			return local17 == null ? arg1 : local17.aString160;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IILclient!wm;)V")
	private void method276(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub26 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(11) int local11 = arg1.method4261();
		@Pc(19) int local19;
		if (this.aClass79_2 == null) {
			local19 = Static7.method217(local11);
			this.aClass79_2 = new Class79(local19);
		}
		for (local19 = 0; local19 < local11; local19++) {
			@Pc(39) boolean local39 = arg1.method4261() == 1;
			@Pc(43) int local43 = arg1.method4245();
			@Pc(52) Class2 local52;
			if (local39) {
				local52 = new Class2_Sub16(arg1.method4265());
			} else {
				local52 = new Class2_Sub21(arg1.method4228());
			}
			this.aClass79_2.method1994((long) local43, local52);
		}
	}
}
