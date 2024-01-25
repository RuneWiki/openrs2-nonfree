import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class228 {

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "Lclient!hn;")
	private final Class102 aClass102_48 = new Class102(256);

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "Lclient!ur;")
	private final Class34_Sub2 aClass34_Sub2_35;

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "Lclient!l;")
	private final Interface6 anInterface6_5;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lclient!ur;Lclient!l;)V")
	public Class228(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) Interface6 arg1) {
		this.aClass34_Sub2_35 = arg0;
		this.anInterface6_5 = arg1;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
	public void method4982() {
		this.aClass102_48.method2271();
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
	public void method4983() {
		this.aClass102_48.method2262(5);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BI)Lclient!km;")
	public Class10_Sub1 method4984(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass102_48.method2258((long) arg0);
		if (local12 != null) {
			return (Class10_Sub1) local12;
		} else if (this.anInterface6_5.method3934(arg0)) {
			@Pc(37) Class114 local37 = this.anInterface6_5.method3937(arg0);
			@Pc(46) int local46 = local37.aBoolean339 ? 64 : this.aClass34_Sub2_35.anInt7071;
			@Pc(81) Class10_Sub1 local81;
			if (local37.aBoolean344 && this.aClass34_Sub2_35.method5734()) {
				@Pc(63) float[] local63 = this.anInterface6_5.method3936(local46, local46, arg0, 0.7F);
				local81 = new Class10_Sub1(this.aClass34_Sub2_35, 3553, 34842, local46, local46, local37.aByte31 != 0, local63, 6408);
			} else {
				@Pc(93) short local93;
				@Pc(103) int[] local103;
				if (local37.aBoolean342 && Static222.method3247(local37.aByte30)) {
					local93 = 6407;
					local103 = this.anInterface6_5.method3933(0.7F, false, arg0, local46, local46);
				} else {
					local103 = this.anInterface6_5.method3935(local46, local46, arg0, 0.7F);
					local93 = 6408;
				}
				local81 = new Class10_Sub1(this.aClass34_Sub2_35, 3553, local93, local46, local46, local37.aByte31 != 0, local103, false);
			}
			local81.method201(local37.aBoolean343, local37.aBoolean345);
			this.aClass102_48.method2272((long) arg0, local81);
			return local81;
		} else {
			return null;
		}
	}
}
