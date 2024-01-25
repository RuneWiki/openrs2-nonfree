import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class204 {

	@OriginalMember(owner = "client!un", name = "a", descriptor = "Lclient!fi;")
	private final Class66 aClass66_100 = new Class66(256);

	@OriginalMember(owner = "client!un", name = "b", descriptor = "Lclient!bm;")
	private final Interface1 anInterface1_7;

	@OriginalMember(owner = "client!un", name = "c", descriptor = "Lclient!po;")
	private final Class59_Sub1 aClass59_Sub1_36;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!po;Lclient!bm;)V")
	public Class204(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) Interface1 arg1) {
		this.anInterface1_7 = arg1;
		this.aClass59_Sub1_36 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)Lclient!fc;")
	public Class11_Sub1 method5431(@OriginalArg(0) int arg0) {
		@Pc(8) Object local8 = this.aClass66_100.method1939((long) arg0);
		if (local8 != null) {
			return (Class11_Sub1) local8;
		} else if (this.anInterface1_7.method2003(arg0)) {
			@Pc(28) Class84 local28 = this.anInterface1_7.method2005(arg0);
			@Pc(35) int local35 = local28.aBoolean170 ? 64 : 128;
			@Pc(73) Class11_Sub1 local73;
			if (local28.aBoolean171 && this.aClass59_Sub1_36.method4844()) {
				@Pc(52) float[] local52 = this.anInterface1_7.method2004(arg0, local35, 0.7F, local35);
				local73 = new Class11_Sub1(this.aClass59_Sub1_36, 3553, 34842, local35, local35, local28.aByte25 != 0, local52, 6408);
			} else {
				@Pc(86) int[] local86 = this.anInterface1_7.method2006(local35, arg0, 0.7F, local35);
				local73 = new Class11_Sub1(this.aClass59_Sub1_36, 3553, 6408, local35, local35, local28.aByte25 != 0, local86, false);
			}
			local73.method387(local28.aBoolean166, local28.aBoolean165);
			this.aClass66_100.method1936((long) arg0, local73);
			return local73;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
	public void method5432() {
		this.aClass66_100.method1933();
	}
}
