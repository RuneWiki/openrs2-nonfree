import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class105 {

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "Lclient!vi;")
	private final Class332 aClass332_66 = new Class332(256);

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "Lclient!e;")
	private final Interface7 anInterface7_3;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "Lclient!sv;")
	private final Class121_Sub2 aClass121_Sub2_6;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!sv;Lclient!e;)V")
	public Class105(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) Interface7 arg1) {
		this.anInterface7_3 = arg1;
		this.aClass121_Sub2_6 = arg0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	public void method2146() {
		this.aClass332_66.method7497(5);
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
	public void method2150() {
		this.aClass332_66.method7510();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZI)Lclient!sd;")
	public Interface20 method2151(@OriginalArg(1) int arg0) {
		@Pc(10) Object local10 = this.aClass332_66.method7502((long) arg0);
		if (local10 != null) {
			return (Interface20) local10;
		} else if (this.anInterface7_3.method5207(arg0)) {
			@Pc(34) Class76 local34 = this.anInterface7_3.method5209(arg0);
			@Pc(43) int local43 = local34.aBoolean105 ? 64 : this.aClass121_Sub2_6.anInt8927;
			@Pc(78) Interface20 local78;
			if (local34.aBoolean104 && this.aClass121_Sub2_6.method7141()) {
				@Pc(60) float[] local60 = this.anInterface7_3.method5211(arg0, local43, local43, 0.7F);
				local78 = this.aClass121_Sub2_6.method7271(Static255.aClass214_8, local43, local34.aByte18 != 0, local60, local43);
			} else {
				@Pc(103) int[] local103 = local34.aBoolean113 ? this.anInterface7_3.method5206(local43, 0.7F, local43, arg0) : this.anInterface7_3.method5208(true, 0.7F, local43, local43, arg0);
				local78 = this.aClass121_Sub2_6.method7248(local43, local43, local103, local34.aByte18 != 0);
			}
			local78.method7531(local34.aBoolean109, local34.aBoolean106);
			this.aClass332_66.method7498((long) arg0, local78);
			return local78;
		} else {
			return null;
		}
	}
}
