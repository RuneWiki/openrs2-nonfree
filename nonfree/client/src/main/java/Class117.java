import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class117 {

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "Lclient!ka;")
	private final Class109 aClass109_38 = new Class109(256);

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "Lclient!gf;")
	private final Interface3 anInterface3_2;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "Lclient!mm;")
	private final Class55_Sub1 aClass55_Sub1_27;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!mm;Lclient!gf;)V")
	public Class117(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) Interface3 arg1) {
		this.anInterface3_2 = arg1;
		this.aClass55_Sub1_27 = arg0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
	public void method3127() {
		this.aClass109_38.method2858();
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)Lclient!hn;")
	public Class60_Sub4 method3128(@OriginalArg(0) int arg0) {
		@Pc(6) Object local6 = this.aClass109_38.method2857((long) arg0);
		if (local6 != null) {
			return (Class60_Sub4) local6;
		} else if (this.anInterface3_2.method1509(arg0)) {
			@Pc(33) Class200 local33 = this.anInterface3_2.method1511(arg0);
			@Pc(40) int local40 = local33.aBoolean539 ? 64 : 128;
			@Pc(80) Class60_Sub4 local80;
			if (local33.aBoolean543 && this.aClass55_Sub1_27.method5247()) {
				@Pc(91) float[] local91 = this.anInterface3_2.method1510(arg0, local40, local40, 0.7F);
				local80 = new Class60_Sub4(this.aClass55_Sub1_27, 3553, 34842, local40, local40, local33.aByte62 != 0, local91, 6408);
			} else {
				@Pc(59) int[] local59 = this.anInterface3_2.method1512(0.7F, local40, local40, arg0);
				local80 = new Class60_Sub4(this.aClass55_Sub1_27, 3553, 6408, local40, local40, local33.aByte62 != 0, local59, false);
			}
			local80.method5849(local33.aBoolean542, local33.aBoolean536);
			this.aClass109_38.method2855((long) arg0, local80);
			return local80;
		} else {
			return null;
		}
	}
}
