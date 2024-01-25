import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Class1_Sub2_Sub9 extends Class1_Sub2 {

	@OriginalMember(owner = "client!iba", name = "C", descriptor = "Lclient!pt;")
	private Class230 aClass230_23;

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "(III)I")
	public int method3687(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass230_23 == null) {
			return arg1;
		} else {
			@Pc(16) Class1_Sub14 local16 = (Class1_Sub14) this.aClass230_23.method6144((long) arg0);
			return local16 == null ? arg1 : local16.anInt2795;
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method3690(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass230_23 == null) {
			return arg0;
		} else {
			@Pc(21) Class1_Sub36 local21 = (Class1_Sub36) this.aClass230_23.method6144((long) arg1);
			return local21 == null ? arg0 : local21.aString138;
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILclient!os;I)V")
	private void method3692(@OriginalArg(1) Class1_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(8) int local8 = arg0.method4487();
		@Pc(15) int local15;
		if (this.aClass230_23 == null) {
			local15 = Static184.method3549(local8);
			this.aClass230_23 = new Class230(local15);
		}
		for (local15 = 0; local15 < local8; local15++) {
			@Pc(36) boolean local36 = arg0.method4487() == 1;
			@Pc(40) int local40 = arg0.method4486();
			@Pc(49) Class1 local49;
			if (local36) {
				local49 = new Class1_Sub36(arg0.method4491());
			} else {
				local49 = new Class1_Sub14(arg0.method4481());
			}
			this.aClass230_23.method6139((long) local40, local49);
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(BLclient!os;)V")
	public void method3694(@OriginalArg(1) Class1_Sub17 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4487();
			if (local14 == 0) {
				return;
			}
			this.method3692(arg0, local14);
		}
	}
}
