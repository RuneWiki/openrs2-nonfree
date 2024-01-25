import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class339 {

	@OriginalMember(owner = "client!to", name = "k", descriptor = "Lclient!eda;")
	private final Class87 aClass87_222 = new Class87(256);

	@OriginalMember(owner = "client!to", name = "b", descriptor = "Lclient!d;")
	private final Interface3 anInterface3_14;

	@OriginalMember(owner = "client!to", name = "j", descriptor = "Lclient!rs;")
	private final Class133_Sub3 aClass133_Sub3_33;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!rs;Lclient!d;)V")
	public Class339(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) Interface3 arg1) {
		this.anInterface3_14 = arg1;
		this.aClass133_Sub3_33 = arg0;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BI)Lclient!wo;")
	public Class167_Sub3 method7985(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass87_222.method1805((long) arg0);
		if (local12 != null) {
			return (Class167_Sub3) local12;
		} else if (this.anInterface3_14.method4654(arg0)) {
			@Pc(38) Class145 local38 = this.anInterface3_14.method4656(arg0);
			@Pc(47) int local47 = local38.aBoolean293 ? 64 : this.aClass133_Sub3_33.anInt8528;
			@Pc(108) Class167_Sub3 local108;
			if (local38.aBoolean295 && this.aClass133_Sub3_33.method7319()) {
				@Pc(122) float[] local122 = this.anInterface3_14.method4657(local47, 0.7F, local47, arg0);
				local108 = new Class167_Sub3(this.aClass133_Sub3_33, 3553, 34842, local47, local47, local38.aByte63 != 0, local122, 6408);
			} else {
				@Pc(73) int[] local73;
				if (local38.anInt3988 != 2 && Static516.method4854(local38.aByte68)) {
					local73 = this.anInterface3_14.method4653(0.7F, local47, arg0, local47, true);
				} else {
					local73 = this.anInterface3_14.method4658(0.7F, local47, local47, arg0);
				}
				local108 = new Class167_Sub3(this.aClass133_Sub3_33, 3553, 6408, local47, local47, local38.aByte63 != 0, local73, 0, 0, false);
			}
			local108.method7524(local38.aBoolean297, local38.aBoolean292);
			this.aClass87_222.method1792((long) arg0, local108);
			return local108;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)V")
	public void method7987() {
		this.aClass87_222.method1801();
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
	public void method7989() {
		this.aClass87_222.method1793(5);
	}
}
