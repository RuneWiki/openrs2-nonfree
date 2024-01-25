import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class2_Sub2_Sub18 extends Class2_Sub2 {

	@OriginalMember(owner = "client!o", name = "w", descriptor = "Lclient!gca;")
	private Class118 aClass118_35;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method5244(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass118_35 == null) {
			return arg0;
		} else {
			@Pc(25) Class2_Sub29 local25 = (Class2_Sub29) this.aClass118_35.method2595((long) arg1);
			return local25 == null ? arg0 : local25.aString63;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!vj;I)V")
	public void method5245(@OriginalArg(0) Class2_Sub22 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method8547();
			if (local10 == 0) {
				return;
			}
			this.method5248(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)I")
	public int method5246(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass118_35 == null) {
			return arg0;
		} else {
			@Pc(21) Class2_Sub30 local21 = (Class2_Sub30) this.aClass118_35.method2595((long) arg1);
			return local21 == null ? arg0 : local21.anInt5508;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!vj;I)V")
	private void method5248(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub22 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(18) int local18 = arg1.method8547();
		@Pc(25) int local25;
		if (this.aClass118_35 == null) {
			local25 = Static350.method4699(local18);
			this.aClass118_35 = new Class118(local25);
		}
		for (local25 = 0; local25 < local18; local25++) {
			@Pc(46) boolean local46 = arg1.method8547() == 1;
			@Pc(50) int local50 = arg1.method8539();
			@Pc(59) Class2 local59;
			if (local46) {
				local59 = new Class2_Sub29(arg1.method8549());
			} else {
				local59 = new Class2_Sub30(arg1.method8542());
			}
			this.aClass118_35.method2601(local59, (long) local50);
		}
	}
}
