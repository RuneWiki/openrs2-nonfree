import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class30 {

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "Lclient!tja;")
	private final Class352 aClass352_4 = new Class352(256);

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "Lclient!pc;")
	private final Class33_Sub3 aClass33_Sub3_2;

	@OriginalMember(owner = "client!bp", name = "g", descriptor = "Lclient!d;")
	private final Interface9 anInterface9_1;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!pc;Lclient!d;)V")
	public Class30(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Interface9 arg1) {
		this.aClass33_Sub3_2 = arg0;
		this.anInterface9_1 = arg1;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
	public void method1010() {
		this.aClass352_4.method7663(5);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BI)Lclient!ld;")
	public Class116_Sub2 method1011(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass352_4.method7653((long) arg0);
		if (local12 != null) {
			return (Class116_Sub2) local12;
		} else if (this.anInterface9_1.method1557(arg0)) {
			@Pc(31) Class130 local31 = this.anInterface9_1.method1558(arg0);
			@Pc(45) int local45 = local31.aBoolean236 ? 64 : this.aClass33_Sub3_2.anInt7256;
			@Pc(108) Class116_Sub2 local108;
			if (local31.aBoolean242 && this.aClass33_Sub3_2.method8136()) {
				@Pc(120) float[] local120 = this.anInterface9_1.method1556(local45, arg0, local45, 0.7F);
				local108 = new Class116_Sub2(this.aClass33_Sub3_2, 3553, 34842, local45, local45, local31.aByte37 != 0, local120, 6408);
			} else {
				@Pc(73) int[] local73;
				if (local31.anInt3119 != 2 && Static108.method2080(local31.aByte39)) {
					local73 = this.anInterface9_1.method1555(arg0, 0.7F, true, local45, local45);
				} else {
					local73 = this.anInterface9_1.method1559(arg0, local45, local45, 0.7F);
				}
				local108 = new Class116_Sub2(this.aClass33_Sub3_2, 3553, 6408, local45, local45, local31.aByte37 != 0, local73, 0, 0, false);
			}
			local108.method6838(local31.aBoolean239, local31.aBoolean235);
			this.aClass352_4.method7655((long) arg0, local108);
			return local108;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V")
	public void method1012() {
		this.aClass352_4.method7659();
	}
}
