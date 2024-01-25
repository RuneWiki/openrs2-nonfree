import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class20 {

	@OriginalMember(owner = "client!be", name = "d", descriptor = "I")
	public int anInt560 = 0;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "I")
	public int anInt564 = 0;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "Lclient!d;")
	private final Class44 aClass44_1 = new Class44(64);

	@OriginalMember(owner = "client!be", name = "m", descriptor = "Lclient!fu;")
	private Interface6 anInterface6_1 = null;

	@OriginalMember(owner = "client!be", name = "i", descriptor = "Lclient!um;")
	private final Class243 aClass243_25;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Lclient!um;")
	private final Class243 aClass243_23;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(ILclient!um;Lclient!um;Lclient!fu;)V")
	public Class20(@OriginalArg(0) int arg0, @OriginalArg(1) Class243 arg1, @OriginalArg(2) Class243 arg2, @OriginalArg(3) Interface6 arg3) {
		this.anInterface6_1 = arg3;
		this.aClass243_25 = arg1;
		this.aClass243_23 = arg2;
		if (this.aClass243_25 != null) {
			this.anInt564 = this.aClass243_25.method5472(1);
		}
		if (this.aClass243_23 != null) {
			this.anInt560 = this.aClass243_23.method5472(1);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lclient!rt;")
	public Class5_Sub2_Sub15 method458(@OriginalArg(1) int arg0) {
		@Pc(11) Class5_Sub2_Sub15 local11 = (Class5_Sub2_Sub15) this.aClass44_1.method1028((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(29) byte[] local29;
		if (arg0 >= 32768) {
			local29 = this.aClass243_23.method5455(arg0 & 0x7FFF, 1);
		} else {
			local29 = this.aClass243_25.method5455(arg0, 1);
		}
		local11 = new Class5_Sub2_Sub15();
		local11.aClass20_1 = this;
		if (local29 != null) {
			local11.method4698(new Class5_Sub15(local29));
		}
		if (arg0 >= 32768) {
			local11.method4696();
		}
		this.aClass44_1.method1017((long) arg0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([IJLclient!sc;I)Ljava/lang/String;")
	public String method461(@OriginalArg(0) int[] arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class220 arg2) {
		if (this.anInterface6_1 != null) {
			@Pc(19) String local19 = this.anInterface6_1.method992(arg2, arg1, arg0);
			if (local19 != null) {
				return local19;
			}
		}
		return Long.toString(arg1);
	}
}
