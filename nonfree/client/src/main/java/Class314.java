import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class314 {

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Lclient!ui;")
	public Class53_Sub4 aClass53_Sub4_1 = null;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "[Lclient!rq;")
	public Class53_Sub2[] aClass53_Sub2Array3 = null;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Lclient!ui;")
	public Class53_Sub4 aClass53_Sub4_2 = null;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "[Lclient!rq;")
	public Class53_Sub2[] aClass53_Sub2Array4 = null;

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Lclient!ui;")
	public Class53_Sub4 aClass53_Sub4_3 = null;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Z")
	public final boolean aBoolean614;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!pq;)V")
	public Class314(@OriginalArg(0) Class132_Sub3 arg0) {
		this.aBoolean614 = arg0.aBoolean530;
		Static169.method2431(arg0);
		if (this.aBoolean614) {
			@Pc(114) byte[] local114 = Static519.method7337(Static160.anObject10, false);
			this.aClass53_Sub4_2 = new Class53_Sub4(arg0, 6410, 128, 128, 16, local114, 6410);
			@Pc(131) byte[] local131 = Static519.method7337(Static46.anObject6, false);
			this.aClass53_Sub4_3 = new Class53_Sub4(arg0, 6410, 128, 128, 16, local131, 6410);
			@Pc(146) Class106 local146 = arg0.aClass106_1;
			if (local146.method2166()) {
				local114 = Static519.method7337(Static271.anObject25, false);
				this.aClass53_Sub4_1 = new Class53_Sub4(arg0, 6408, 128, 128, 16);
				@Pc(176) Class53_Sub4 local176 = new Class53_Sub4(arg0, 6409, 128, 128, 16, local114, 6409);
				if (local146.method2165(2.0F, local176, this.aClass53_Sub4_1)) {
					this.aClass53_Sub4_1.method8288();
				} else {
					this.aClass53_Sub4_1.method8292();
					this.aClass53_Sub4_1 = null;
				}
				local176.method8292();
			}
		} else {
			this.aClass53_Sub2Array3 = new Class53_Sub2[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(48) byte[] local48 = Static118.method1840(Static160.anObject10, local34 * 128 * 128 * 2);
				this.aClass53_Sub2Array3[local34] = new Class53_Sub2(arg0, 3553, 6410, 128, 128, true, local48, 6410, false);
			}
			this.aClass53_Sub2Array4 = new Class53_Sub2[16];
			for (@Pc(74) int local74 = 0; local74 < 16; local74++) {
				@Pc(88) byte[] local88 = Static118.method1840(Static46.anObject6, 2 * 128 * local74 * 128);
				this.aClass53_Sub2Array4[local74] = new Class53_Sub2(arg0, 3553, 6410, 128, 128, true, local88, 6410, false);
			}
		}
	}
}
