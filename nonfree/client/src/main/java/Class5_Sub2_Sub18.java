import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class5_Sub2_Sub18 extends Class5_Sub2 {

	@OriginalMember(owner = "client!wj", name = "t", descriptor = "Lclient!cb;")
	private Class42 aClass42_44;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!co;B)V")
	private void method7324(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub3 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(22) int local22 = arg1.method4220();
		@Pc(29) int local29;
		if (this.aClass42_44 == null) {
			local29 = Static179.method3071(local22);
			this.aClass42_44 = new Class42(local29);
		}
		for (local29 = 0; local29 < local22; local29++) {
			@Pc(48) boolean local48 = arg1.method4220() == 1;
			@Pc(52) int local52 = arg1.method4182();
			@Pc(61) Class5 local61;
			if (local48) {
				local61 = new Class5_Sub50(arg1.method4234());
			} else {
				local61 = new Class5_Sub27(arg1.method4230());
			}
			this.aClass42_44.method1106((long) local52, local61);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLclient!co;)V")
	public void method7326(@OriginalArg(1) Class5_Sub3 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4220();
			if (local15 == 0) {
				return;
			}
			this.method7324(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method7327(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass42_44 == null) {
			return arg1;
		} else {
			@Pc(16) Class5_Sub50 local16 = (Class5_Sub50) this.aClass42_44.method1109((long) arg0);
			return local16 == null ? arg1 : local16.aString83;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)I")
	public int method7329(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass42_44 == null) {
			return arg1;
		} else {
			@Pc(16) Class5_Sub27 local16 = (Class5_Sub27) this.aClass42_44.method1109((long) arg0);
			return local16 == null ? arg1 : local16.anInt4812;
		}
	}
}
