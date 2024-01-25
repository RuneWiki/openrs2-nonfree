import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bda")
public final class Class2_Sub6_Sub1 extends Class2_Sub6 {

	@OriginalMember(owner = "client!bda", name = "C", descriptor = "Lclient!eq;")
	private Class99 aClass99_14;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIB)I")
	public int method823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass99_14 == null) {
			return arg1;
		} else {
			@Pc(16) Class2_Sub43 local16 = (Class2_Sub43) this.aClass99_14.method3056((long) arg0);
			return local16 == null ? arg1 : local16.anInt9046;
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILclient!cea;B)V")
	private void method824(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub11 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(18) int local18 = arg1.method8383();
		@Pc(25) int local25;
		if (this.aClass99_14 == null) {
			local25 = Static231.method4407(local18);
			this.aClass99_14 = new Class99(local25);
		}
		for (local25 = 0; local25 < local18; local25++) {
			@Pc(46) boolean local46 = arg1.method8383() == 1;
			@Pc(50) int local50 = arg1.method8347();
			@Pc(59) Class2 local59;
			if (local46) {
				local59 = new Class2_Sub12(arg1.method8373());
			} else {
				local59 = new Class2_Sub43(arg1.method8381());
			}
			this.aClass99_14.method3059((long) local50, local59);
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!cea;B)V")
	public void method825(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8383();
			if (local5 == 0) {
				return;
			}
			this.method824(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method827(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass99_14 == null) {
			return arg0;
		} else {
			@Pc(21) Class2_Sub12 local21 = (Class2_Sub12) this.aClass99_14.method3056((long) arg1);
			return local21 == null ? arg0 : local21.aString18;
		}
	}
}
