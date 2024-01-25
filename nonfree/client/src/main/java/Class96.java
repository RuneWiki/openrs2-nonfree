import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class96 {

	@OriginalMember(owner = "client!go", name = "b", descriptor = "[Lclient!qv;")
	public Class13_Sub1[] aClass13_Sub1Array2 = null;

	@OriginalMember(owner = "client!go", name = "c", descriptor = "Lclient!dw;")
	public Class13_Sub2 aClass13_Sub2_2 = null;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "Lclient!dw;")
	public Class13_Sub2 aClass13_Sub2_3 = null;

	@OriginalMember(owner = "client!go", name = "g", descriptor = "[Lclient!qv;")
	public Class13_Sub1[] aClass13_Sub1Array3 = null;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "Lclient!dw;")
	public Class13_Sub2 aClass13_Sub2_1 = null;

	@OriginalMember(owner = "client!go", name = "f", descriptor = "Z")
	public final boolean aBoolean124;

	static {
		new Class84("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
	}

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!ht;)V")
	public Class96(@OriginalArg(0) Class109_Sub1 arg0) {
		this.aBoolean124 = arg0.aBoolean158;
		Static36.method622(arg0);
		if (this.aBoolean124) {
			@Pc(116) byte[] local116 = Static420.method5638(false, Static202.anObject6);
			this.aClass13_Sub2_3 = new Class13_Sub2(arg0, 6410, 128, 128, 16, local116, 6410);
			@Pc(133) byte[] local133 = Static420.method5638(false, Static294.anObject9);
			this.aClass13_Sub2_2 = new Class13_Sub2(arg0, 6410, 128, 128, 16, local133, 6410);
			@Pc(148) Class86 local148 = arg0.aClass86_1;
			if (local148.method1704()) {
				local116 = Static420.method5638(false, Static439.anObject11);
				this.aClass13_Sub2_1 = new Class13_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(178) Class13_Sub2 local178 = new Class13_Sub2(arg0, 6409, 128, 128, 16, local116, 6409);
				if (local148.method1700(this.aClass13_Sub2_1, local178, 2.0F)) {
					this.aClass13_Sub2_1.method2740();
				} else {
					this.aClass13_Sub2_1.method2744();
					this.aClass13_Sub2_1 = null;
				}
				local178.method2744();
			}
		} else {
			this.aClass13_Sub1Array3 = new Class13_Sub1[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(48) byte[] local48 = Static78.method1355(Static202.anObject6, local34 * 2 * 128 * 128);
				this.aClass13_Sub1Array3[local34] = new Class13_Sub1(arg0, 3553, 6410, 128, 128, true, local48, 6410, false);
			}
			this.aClass13_Sub1Array2 = new Class13_Sub1[16];
			for (@Pc(76) int local76 = 0; local76 < 16; local76++) {
				@Pc(90) byte[] local90 = Static78.method1355(Static294.anObject9, 128 * 128 * local76 * 2);
				this.aClass13_Sub1Array2[local76] = new Class13_Sub1(arg0, 3553, 6410, 128, 128, true, local90, 6410, false);
			}
		}
	}
}
