import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class187 {

	@OriginalMember(owner = "client!ou", name = "h", descriptor = "Lclient!d;")
	private final Class44 aClass44_49 = new Class44(256);

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "Lclient!tt;")
	private final Class200_Sub2 aClass200_Sub2_30;

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "Lclient!l;")
	private final Interface8 anInterface8_89;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!tt;Lclient!l;)V")
	public Class187(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) Interface8 arg1) {
		this.aClass200_Sub2_30 = arg0;
		this.anInterface8_89 = arg1;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
	public void method3821() {
		this.aClass44_49.method1031();
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)Lclient!cd;")
	public Class31_Sub1 method3823(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass44_49.method1028((long) arg0);
		if (local12 != null) {
			return (Class31_Sub1) local12;
		} else if (this.anInterface8_89.method4123(arg0)) {
			@Pc(31) Class178 local31 = this.anInterface8_89.method4125(arg0);
			@Pc(40) int local40 = local31.aBoolean324 ? 64 : this.aClass200_Sub2_30.anInt6708;
			@Pc(94) Class31_Sub1 local94;
			if (local31.aBoolean322 && this.aClass200_Sub2_30.method5839()) {
				@Pc(106) float[] local106 = this.anInterface8_89.method4127(0.7F, local40, arg0, local40);
				local94 = new Class31_Sub1(this.aClass200_Sub2_30, 3553, 34842, local40, local40, local31.aByte51 != 0, local106, 6408);
			} else {
				@Pc(62) int[] local62;
				if (local31.aBoolean323) {
					local62 = this.anInterface8_89.method4124(arg0, local40, local40, 0.7F);
				} else {
					local62 = this.anInterface8_89.method4126(local40, arg0, local40, false, 0.7F);
				}
				local94 = new Class31_Sub1(this.aClass200_Sub2_30, 3553, 6408, local40, local40, local31.aByte51 != 0, local62, false);
			}
			local94.method1520(local31.aBoolean327, local31.aBoolean319);
			this.aClass44_49.method1017((long) arg0, local94);
			return local94;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V")
	public void method3825() {
		this.aClass44_49.method1025(5);
	}
}
