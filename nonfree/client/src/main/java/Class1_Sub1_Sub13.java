import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sn", name = "z", descriptor = "Lclient!cv;")
	private Class51 aClass51_31;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BLclient!ti;)V")
	public void method5226(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4548();
			if (local17 == 0) {
				return;
			}
			this.method5228(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!ti;BI)V")
	private void method5228(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(8) int local8 = arg0.method4548();
		@Pc(15) int local15;
		if (this.aClass51_31 == null) {
			local15 = Static30.method427(local8);
			this.aClass51_31 = new Class51(local15);
		}
		for (local15 = 0; local15 < local8; local15++) {
			@Pc(34) boolean local34 = arg0.method4548() == 1;
			@Pc(38) int local38 = arg0.method4496();
			@Pc(47) Class1 local47;
			if (local34) {
				local47 = new Class1_Sub18(arg0.method4509());
			} else {
				local47 = new Class1_Sub37(arg0.method4500());
			}
			this.aClass51_31.method931(local47, (long) local38);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIZ)I")
	public int method5229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass51_31 == null) {
			return arg0;
		} else {
			@Pc(21) Class1_Sub37 local21 = (Class1_Sub37) this.aClass51_31.method930((long) arg1);
			return local21 == null ? arg0 : local21.anInt6451;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method5231(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass51_31 == null) {
			return arg0;
		} else {
			@Pc(18) Class1_Sub18 local18 = (Class1_Sub18) this.aClass51_31.method930((long) arg1);
			return local18 == null ? arg0 : local18.aString47;
		}
	}
}
