import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class266 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "[Lclient!sa;")
	public Class64_Sub4[] aClass64_Sub4Array3 = null;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "[Lclient!sa;")
	public Class64_Sub4[] aClass64_Sub4Array4 = null;

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "Lclient!er;")
	public Class64_Sub2 aClass64_Sub2_1 = null;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Lclient!er;")
	public Class64_Sub2 aClass64_Sub2_3 = null;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "Lclient!er;")
	public Class64_Sub2 aClass64_Sub2_2 = null;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "Z")
	public final boolean aBoolean507;

	static {
		new Class231("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!na;)V")
	public Class266(@OriginalArg(0) Class75_Sub2 arg0) {
		this.aBoolean507 = arg0.aBoolean355;
		Static226.method3101(arg0);
		if (this.aBoolean507) {
			@Pc(114) byte[] local114 = Static183.method2650(Static85.anObject5, false);
			this.aClass64_Sub2_2 = new Class64_Sub2(arg0, 6410, 128, 128, 16, local114, 6410);
			@Pc(131) byte[] local131 = Static183.method2650(Static150.anObject21, false);
			this.aClass64_Sub2_3 = new Class64_Sub2(arg0, 6410, 128, 128, 16, local131, 6410);
			@Pc(146) Class205 local146 = arg0.aClass205_1;
			if (local146.method4760()) {
				local114 = Static183.method2650(Static112.anObject8, false);
				this.aClass64_Sub2_1 = new Class64_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(176) Class64_Sub2 local176 = new Class64_Sub2(arg0, 6409, 128, 128, 16, local114, 6409);
				if (local146.method4761(local176, 2.0F, this.aClass64_Sub2_1)) {
					this.aClass64_Sub2_1.method3521();
				} else {
					this.aClass64_Sub2_1.method3518();
					this.aClass64_Sub2_1 = null;
				}
				local176.method3518();
			}
		} else {
			this.aClass64_Sub4Array3 = new Class64_Sub4[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(46) byte[] local46 = Static138.method2166(local34 * 128 * 256, Static85.anObject5);
				this.aClass64_Sub4Array3[local34] = new Class64_Sub4(arg0, 3553, 6410, 128, 128, true, local46, 6410, false);
			}
			this.aClass64_Sub4Array4 = new Class64_Sub4[16];
			for (@Pc(74) int local74 = 0; local74 < 16; local74++) {
				@Pc(86) byte[] local86 = Static138.method2166(local74 * 256 * 128, Static150.anObject21);
				this.aClass64_Sub4Array4[local74] = new Class64_Sub4(arg0, 3553, 6410, 128, 128, true, local86, 6410, false);
			}
		}
	}
}
