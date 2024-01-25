import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class147 {

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "Lclient!tja;")
	private final Class352 aClass352_31 = new Class352(256);

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "Lclient!d;")
	private final Interface9 anInterface9_6;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "Lclient!wg;")
	private final Class33_Sub2 aClass33_Sub2_8;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!wg;Lclient!d;)V")
	public Class147(@OriginalArg(0) Class33_Sub2 arg0, @OriginalArg(1) Interface9 arg1) {
		this.anInterface9_6 = arg1;
		this.aClass33_Sub2_8 = arg0;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
	public void method3247() {
		this.aClass352_31.method7663(5);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	public void method3248() {
		this.aClass352_31.method7659();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)Lclient!ada;")
	public Interface1 method3249(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass352_31.method7653((long) arg0);
		if (local12 != null) {
			return (Interface1) local12;
		} else if (this.anInterface9_6.method1557(arg0)) {
			@Pc(33) Class130 local33 = this.anInterface9_6.method1558(arg0);
			@Pc(48) int local48 = local33.aBoolean236 ? 64 : this.aClass33_Sub2_8.anInt9672;
			@Pc(82) Interface1 local82;
			if (local33.aBoolean242 && this.aClass33_Sub2_8.method8136()) {
				@Pc(67) float[] local67 = this.anInterface9_6.method1556(local48, arg0, local48, 0.7F);
				local82 = this.aClass33_Sub2_8.method8269(local48, Static220.aClass276_11, local33.aByte37 != 0, local48, local67);
			} else {
				@Pc(105) int[] local105;
				if (local33.anInt3119 != 2 && Static108.method2080(local33.aByte39)) {
					local105 = this.anInterface9_6.method1555(arg0, 0.7F, true, local48, local48);
				} else {
					local105 = this.anInterface9_6.method1559(arg0, local48, local48, 0.7F);
				}
				local82 = this.aClass33_Sub2_8.method8273(local33.aByte37 != 0, local48, local48, local105);
			}
			local82.method8629(local33.aBoolean235, local33.aBoolean239);
			this.aClass352_31.method7655((long) arg0, local82);
			return local82;
		} else {
			return null;
		}
	}
}
