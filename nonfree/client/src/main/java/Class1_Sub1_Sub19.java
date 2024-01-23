import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class1_Sub1_Sub19 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wj", name = "M", descriptor = "Lclient!qc;")
	private Class90 aClass90_23;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!pg;I)V")
	public void method3536(@OriginalArg(0) Class1_Sub17 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method2142();
			if (local14 == 0) {
				return;
			}
			this.method3543(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!hh;BI)Lclient!hh;")
	public Class50 method3541(@OriginalArg(0) Class50 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass90_23 == null) {
			return arg0;
		} else {
			@Pc(16) Class1_Sub6 local16 = (Class1_Sub6) this.aClass90_23.method2819((long) arg1);
			return local16 == null ? arg0 : local16.aClass50_187;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIZ)I")
	public int method3542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass90_23 == null) {
			return arg1;
		} else {
			@Pc(23) Class1_Sub5 local23 = (Class1_Sub5) this.aClass90_23.method2819((long) arg0);
			return local23 == null ? arg1 : local23.anInt409;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLclient!pg;I)V")
	private void method3543(@OriginalArg(1) Class1_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(12) int local12 = arg0.method2142();
		@Pc(19) int local19;
		if (this.aClass90_23 == null) {
			local19 = Static194.method3146(local12);
			this.aClass90_23 = new Class90(local19);
		}
		for (local19 = 0; local19 < local12; local19++) {
			@Pc(40) boolean local40 = arg0.method2142() == 1;
			@Pc(44) int local44 = arg0.method2135();
			@Pc(53) Class1 local53;
			if (local40) {
				local53 = new Class1_Sub6(arg0.method2125());
			} else {
				local53 = new Class1_Sub5(arg0.method2140());
			}
			this.aClass90_23.method2817(local53, (long) local44);
		}
	}
}
