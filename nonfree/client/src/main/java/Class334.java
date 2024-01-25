import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tia")
public final class Class334 {

	@OriginalMember(owner = "client!tia", name = "b", descriptor = "Lclient!eda;")
	private final Class87 aClass87_220 = new Class87(256);

	@OriginalMember(owner = "client!tia", name = "i", descriptor = "Lclient!d;")
	private final Interface3 anInterface3_13;

	@OriginalMember(owner = "client!tia", name = "c", descriptor = "Lclient!pj;")
	private final Class133_Sub1 aClass133_Sub1_16;

	@OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(Lclient!pj;Lclient!d;)V")
	public Class334(@OriginalArg(0) Class133_Sub1 arg0, @OriginalArg(1) Interface3 arg1) {
		this.anInterface3_13 = arg1;
		this.aClass133_Sub1_16 = arg0;
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(I)V")
	public void method7939() {
		this.aClass87_220.method1793(5);
	}

	@OriginalMember(owner = "client!tia", name = "b", descriptor = "(I)V")
	public void method7941() {
		this.aClass87_220.method1801();
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(II)Lclient!rm;")
	public Interface20 method7944(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass87_220.method1805((long) arg0);
		if (local12 != null) {
			return (Interface20) local12;
		} else if (this.anInterface3_13.method4654(arg0)) {
			@Pc(39) Class145 local39 = this.anInterface3_13.method4656(arg0);
			@Pc(48) int local48 = local39.aBoolean293 ? 64 : this.aClass133_Sub1_16.anInt6995;
			@Pc(102) Interface20 local102;
			if (local39.aBoolean295 && this.aClass133_Sub1_16.method7319()) {
				@Pc(114) float[] local114 = this.anInterface3_13.method4657(local48, 0.7F, local48, arg0);
				local102 = this.aClass133_Sub1_16.method6190(local48, local48, local114, local39.aByte63 != 0, Static576.aClass223_16);
			} else {
				@Pc(76) int[] local76;
				if (local39.anInt3988 != 2 && Static516.method4854(local39.aByte68)) {
					local76 = this.anInterface3_13.method4653(0.7F, local48, arg0, local48, true);
				} else {
					local76 = this.anInterface3_13.method4658(0.7F, local48, local48, arg0);
				}
				local102 = this.aClass133_Sub1_16.method6181(local48, local39.aByte63 != 0, local48, local76);
			}
			local102.method4639(local39.aBoolean292, local39.aBoolean297);
			this.aClass87_220.method1792((long) arg0, local102);
			return local102;
		} else {
			return null;
		}
	}
}
