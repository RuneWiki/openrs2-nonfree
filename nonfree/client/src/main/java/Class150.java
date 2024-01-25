import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ica")
public final class Class150 {

	@OriginalMember(owner = "client!ica", name = "f", descriptor = "[Lclient!dga;")
	public Class52_Sub1[] aClass52_Sub1Array1 = null;

	@OriginalMember(owner = "client!ica", name = "e", descriptor = "Lclient!pd;")
	public Class52_Sub4 aClass52_Sub4_2 = null;

	@OriginalMember(owner = "client!ica", name = "l", descriptor = "[Lclient!dga;")
	public Class52_Sub1[] aClass52_Sub1Array2 = null;

	@OriginalMember(owner = "client!ica", name = "k", descriptor = "Lclient!pd;")
	public Class52_Sub4 aClass52_Sub4_3 = null;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "Lclient!pd;")
	public Class52_Sub4 aClass52_Sub4_1 = null;

	@OriginalMember(owner = "client!ica", name = "i", descriptor = "Z")
	public final boolean aBoolean339;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lclient!ag;)V")
	public Class150(@OriginalArg(0) Class12_Sub1 arg0) {
		this.aBoolean339 = arg0.aBoolean36;
		Static55.method1288(arg0);
		if (this.aBoolean339) {
			@Pc(118) byte[] local118 = Static114.method1984(Static546.anObject21, false);
			this.aClass52_Sub4_3 = new Class52_Sub4(arg0, 6410, 128, 128, 16, local118, 6410);
			@Pc(135) byte[] local135 = Static114.method1984(Static120.anObject4, false);
			this.aClass52_Sub4_2 = new Class52_Sub4(arg0, 6410, 128, 128, 16, local135, 6410);
			@Pc(150) Class359 local150 = arg0.aClass359_1;
			if (local150.method7838()) {
				local118 = Static114.method1984(Static387.anObject13, false);
				this.aClass52_Sub4_1 = new Class52_Sub4(arg0, 6408, 128, 128, 16);
				@Pc(180) Class52_Sub4 local180 = new Class52_Sub4(arg0, 6409, 128, 128, 16, local118, 6409);
				if (local150.method7841(local180, 2.0F, this.aClass52_Sub4_1)) {
					this.aClass52_Sub4_1.method5639();
				} else {
					this.aClass52_Sub4_1.method5643();
					this.aClass52_Sub4_1 = null;
				}
				local180.method5643();
			}
		} else {
			this.aClass52_Sub1Array2 = new Class52_Sub1[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(48) byte[] local48 = Static595.method7932(2 * 128 * local34 * 128, Static546.anObject21);
				this.aClass52_Sub1Array2[local34] = new Class52_Sub1(arg0, 3553, 6410, 128, 128, true, local48, 6410, false);
			}
			this.aClass52_Sub1Array1 = new Class52_Sub1[16];
			for (@Pc(76) int local76 = 0; local76 < 16; local76++) {
				@Pc(90) byte[] local90 = Static595.method7932(local76 * 128 * 128 * 2, Static120.anObject4);
				this.aClass52_Sub1Array1[local76] = new Class52_Sub1(arg0, 3553, 6410, 128, 128, true, local90, 6410, false);
			}
		}
	}
}
