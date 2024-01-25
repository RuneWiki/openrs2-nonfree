import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class202 {

	@OriginalMember(owner = "client!re", name = "b", descriptor = "[Lclient!wg;")
	public Class1_Sub3[] aClass1_Sub3Array3 = null;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "Lclient!pp;")
	public Class1_Sub4 aClass1_Sub4_2 = null;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Lclient!pp;")
	public Class1_Sub4 aClass1_Sub4_1 = null;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "[Lclient!wg;")
	public Class1_Sub3[] aClass1_Sub3Array4 = null;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "Lclient!pp;")
	public Class1_Sub4 aClass1_Sub4_3 = null;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "Z")
	public final boolean aBoolean411;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!bv;)V")
	public Class202(@OriginalArg(0) Class30_Sub1 arg0) {
		this.aBoolean411 = arg0.aBoolean82;
		Static180.method2643(arg0);
		if (this.aBoolean411) {
			@Pc(116) byte[] local116 = Static326.method2435(Static232.anObject6, false);
			this.aClass1_Sub4_1 = new Class1_Sub4(arg0, 6410, 128, 128, 16, local116, 6410);
			@Pc(133) byte[] local133 = Static326.method2435(Static100.anObject2, false);
			this.aClass1_Sub4_3 = new Class1_Sub4(arg0, 6410, 128, 128, 16, local133, 6410);
			@Pc(148) Class160 local148 = arg0.aClass160_1;
			if (local148.method3578()) {
				local116 = Static326.method2435(Static213.anObject5, false);
				this.aClass1_Sub4_2 = new Class1_Sub4(arg0, 6408, 128, 128, 16);
				@Pc(178) Class1_Sub4 local178 = new Class1_Sub4(arg0, 6409, 128, 128, 16, local116, 6409);
				if (local148.method3579(this.aClass1_Sub4_2, local178, 2.0F)) {
					this.aClass1_Sub4_2.method4274();
				} else {
					this.aClass1_Sub4_2.method4271();
					this.aClass1_Sub4_2 = null;
				}
				local178.method4271();
			}
		} else {
			this.aClass1_Sub3Array3 = new Class1_Sub3[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(46) byte[] local46 = Static370.method5087(Static232.anObject6, local34 * 128 * 256);
				this.aClass1_Sub3Array3[local34] = new Class1_Sub3(arg0, 3553, 6410, 128, 128, true, local46, 6410, false);
			}
			this.aClass1_Sub3Array4 = new Class1_Sub3[16];
			for (@Pc(74) int local74 = 0; local74 < 16; local74++) {
				@Pc(88) byte[] local88 = Static370.method5087(Static100.anObject2, local74 * 2 * 128 * 128);
				this.aClass1_Sub3Array4[local74] = new Class1_Sub3(arg0, 3553, 6410, 128, 128, true, local88, 6410, false);
			}
		}
	}
}
