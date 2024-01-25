import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class29 {

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "Lclient!rp;")
	private final Class220 aClass220_2 = new Class220(256);

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "Lclient!bl;")
	private final Class28_Sub1 aClass28_Sub1_6;

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "Lclient!vl;")
	private final Interface11 anInterface11_3;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!bl;Lclient!vl;)V")
	public Class29(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) Interface11 arg1) {
		this.aClass28_Sub1_6 = arg0;
		this.anInterface11_3 = arg1;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)Lclient!sg;")
	public Class40_Sub3 method728(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass220_2.method4990((long) arg0);
		if (local12 != null) {
			return (Class40_Sub3) local12;
		} else if (this.anInterface11_3.method2468(arg0)) {
			@Pc(31) Class229 local31 = this.anInterface11_3.method2466(arg0);
			@Pc(40) int local40 = local31.aBoolean405 ? 64 : this.aClass28_Sub1_6.anInt724;
			@Pc(75) Class40_Sub3 local75;
			if (local31.aBoolean401 && this.aClass28_Sub1_6.method3563()) {
				@Pc(57) float[] local57 = this.anInterface11_3.method2464(0.7F, local40, local40, arg0);
				local75 = new Class40_Sub3(this.aClass28_Sub1_6, 3553, 34842, local40, local40, local31.aByte86 != 0, local57, 6408);
			} else {
				@Pc(97) short local97;
				@Pc(95) int[] local95;
				if (local31.aBoolean406 && Static281.method4242(local31.aByte85)) {
					local95 = this.anInterface11_3.method2467(local40, false, arg0, 0.7F, local40);
					local97 = 6407;
				} else {
					local95 = this.anInterface11_3.method2465(local40, 0.7F, arg0, local40);
					local97 = 6408;
				}
				local75 = new Class40_Sub3(this.aClass28_Sub1_6, 3553, local97, local40, local40, local31.aByte86 != 0, local95, false);
			}
			local75.method3021(local31.aBoolean407, local31.aBoolean399);
			this.aClass220_2.method4996(local75, (long) arg0);
			return local75;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
	public void method729() {
		this.aClass220_2.method4998(5);
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V")
	public void method730() {
		this.aClass220_2.method4999();
	}
}
