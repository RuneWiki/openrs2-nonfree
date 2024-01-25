import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class264 {

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "[Lclient!sr;")
	public Class42_Sub1[] aClass42_Sub1Array4 = null;

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "Lclient!rg;")
	public Class42_Sub4 aClass42_Sub4_2 = null;

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "Lclient!rg;")
	public Class42_Sub4 aClass42_Sub4_1 = null;

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "[Lclient!sr;")
	public Class42_Sub1[] aClass42_Sub1Array3 = null;

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "Lclient!rg;")
	public Class42_Sub4 aClass42_Sub4_3 = null;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "Z")
	public final boolean aBoolean519;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!gk;)V")
	public Class264(@OriginalArg(0) Class75_Sub2 arg0) {
		this.aBoolean519 = arg0.aBoolean226;
		Static42.method926(arg0);
		if (this.aBoolean519) {
			@Pc(108) byte[] local108 = Static206.method3379(Static363.anObject10, false);
			this.aClass42_Sub4_3 = new Class42_Sub4(arg0, 6410, 128, 128, 16, local108, 6410);
			@Pc(125) byte[] local125 = Static206.method3379(Static52.anObject3, false);
			this.aClass42_Sub4_2 = new Class42_Sub4(arg0, 6410, 128, 128, 16, local125, 6410);
			@Pc(140) Class55 local140 = arg0.aClass55_1;
			if (local140.method1360()) {
				local108 = Static206.method3379(Static212.anObject4, false);
				this.aClass42_Sub4_1 = new Class42_Sub4(arg0, 6408, 128, 128, 16);
				@Pc(170) Class42_Sub4 local170 = new Class42_Sub4(arg0, 6409, 128, 128, 16, local108, 6409);
				if (local140.method1361(local170, 2.0F, this.aClass42_Sub4_1)) {
					this.aClass42_Sub4_1.method4917();
				} else {
					this.aClass42_Sub4_1.method4919();
					this.aClass42_Sub4_1 = null;
				}
				local170.method4919();
			}
		} else {
			this.aClass42_Sub1Array3 = new Class42_Sub1[16];
			for (@Pc(32) int local32 = 0; local32 < 16; local32++) {
				@Pc(41) byte[] local41 = Static158.method2736(local32 * 32768, Static363.anObject10);
				this.aClass42_Sub1Array3[local32] = new Class42_Sub1(arg0, 3553, 6410, 128, 128, true, local41, 6410, false);
			}
			this.aClass42_Sub1Array4 = new Class42_Sub1[16];
			for (@Pc(67) int local67 = 0; local67 < 16; local67++) {
				@Pc(80) byte[] local80 = Static158.method2736(2 * 128 * local67 * 128, Static52.anObject3);
				this.aClass42_Sub1Array4[local67] = new Class42_Sub1(arg0, 3553, 6410, 128, 128, true, local80, 6410, false);
			}
		}
	}
}
