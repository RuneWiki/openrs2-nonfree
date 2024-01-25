import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pea")
public final class Class252 {

	@OriginalMember(owner = "client!pea", name = "e", descriptor = "[Lclient!pm;")
	public Class23_Sub1[] aClass23_Sub1Array4 = null;

	@OriginalMember(owner = "client!pea", name = "i", descriptor = "Lclient!gba;")
	public Class23_Sub2 aClass23_Sub2_3 = null;

	@OriginalMember(owner = "client!pea", name = "f", descriptor = "Lclient!gba;")
	public Class23_Sub2 aClass23_Sub2_1 = null;

	@OriginalMember(owner = "client!pea", name = "h", descriptor = "Lclient!gba;")
	public Class23_Sub2 aClass23_Sub2_2 = null;

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "[Lclient!pm;")
	public Class23_Sub1[] aClass23_Sub1Array3 = null;

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "Z")
	public final boolean aBoolean546;

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lclient!qj;)V")
	public Class252(@OriginalArg(0) Class100_Sub3 arg0) {
		this.aBoolean546 = arg0.aBoolean604;
		Static137.method2309(arg0);
		if (this.aBoolean546) {
			@Pc(118) byte[] local118 = Static583.method7909(false, Static143.anObject52);
			this.aClass23_Sub2_3 = new Class23_Sub2(arg0, 6410, 128, 128, 16, local118, 6410);
			@Pc(135) byte[] local135 = Static583.method7909(false, Static517.anObject45);
			this.aClass23_Sub2_1 = new Class23_Sub2(arg0, 6410, 128, 128, 16, local135, 6410);
			@Pc(150) Class125 local150 = arg0.aClass125_1;
			if (local150.method2991()) {
				local118 = Static583.method7909(false, Static36.anObject7);
				this.aClass23_Sub2_2 = new Class23_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(180) Class23_Sub2 local180 = new Class23_Sub2(arg0, 6409, 128, 128, 16, local118, 6409);
				if (local150.method2992(this.aClass23_Sub2_2, local180, 2.0F)) {
					this.aClass23_Sub2_2.method7781();
				} else {
					this.aClass23_Sub2_2.method7779();
					this.aClass23_Sub2_2 = null;
				}
				local180.method7779();
			}
		} else {
			this.aClass23_Sub1Array4 = new Class23_Sub1[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(48) byte[] local48 = Static216.method3476(128 * 128 * local34 * 2, Static143.anObject52);
				this.aClass23_Sub1Array4[local34] = new Class23_Sub1(arg0, 3553, 6410, 128, 128, true, local48, 6410, false);
			}
			this.aClass23_Sub1Array3 = new Class23_Sub1[16];
			for (@Pc(76) int local76 = 0; local76 < 16; local76++) {
				@Pc(90) byte[] local90 = Static216.method3476(local76 * 2 * 128 * 128, Static517.anObject45);
				this.aClass23_Sub1Array3[local76] = new Class23_Sub1(arg0, 3553, 6410, 128, 128, true, local90, 6410, false);
			}
		}
	}
}
