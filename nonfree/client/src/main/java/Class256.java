import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class256 {

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "Lclient!sp;")
	public Class11_Sub4 aClass11_Sub4_1 = null;

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "Lclient!sp;")
	public Class11_Sub4 aClass11_Sub4_2 = null;

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "[Lclient!vga;")
	public Class11_Sub2[] aClass11_Sub2Array3 = null;

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "[Lclient!vga;")
	public Class11_Sub2[] aClass11_Sub2Array4 = null;

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "Lclient!sp;")
	public Class11_Sub4 aClass11_Sub4_3 = null;

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "Z")
	public final boolean aBoolean664;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class256(@OriginalArg(0) Class15_Sub3 arg0) {
		this.aBoolean664 = arg0.aBoolean453;
		Static1.method127(arg0);
		if (this.aBoolean664) {
			@Pc(110) byte[] local110 = Static135.method2792(false, Static10.anObject1);
			this.aClass11_Sub4_1 = new Class11_Sub4(arg0, 6410, 128, 128, 16, local110, 6410);
			@Pc(127) byte[] local127 = Static135.method2792(false, Static520.anObject17);
			this.aClass11_Sub4_3 = new Class11_Sub4(arg0, 6410, 128, 128, 16, local127, 6410);
			@Pc(142) Class124 local142 = arg0.aClass124_1;
			if (local142.method3094()) {
				local110 = Static135.method2792(false, Static435.anObject15);
				this.aClass11_Sub4_2 = new Class11_Sub4(arg0, 6408, 128, 128, 16);
				@Pc(172) Class11_Sub4 local172 = new Class11_Sub4(arg0, 6409, 128, 128, 16, local110, 6409);
				if (local142.method3096(local172, this.aClass11_Sub4_2, 2.0F)) {
					this.aClass11_Sub4_2.method7413();
				} else {
					this.aClass11_Sub4_2.method7411();
					this.aClass11_Sub4_2 = null;
				}
				local172.method7411();
			}
		} else {
			this.aClass11_Sub2Array3 = new Class11_Sub2[16];
			for (@Pc(32) int local32 = 0; local32 < 16; local32++) {
				@Pc(45) byte[] local45 = Static504.method7606(Static10.anObject1, 2 * 128 * 128 * local32);
				this.aClass11_Sub2Array3[local32] = new Class11_Sub2(arg0, 3553, 6410, 128, 128, true, local45, 6410, false);
			}
			this.aClass11_Sub2Array4 = new Class11_Sub2[16];
			for (@Pc(73) int local73 = 0; local73 < 16; local73++) {
				@Pc(84) byte[] local84 = Static504.method7606(Static520.anObject17, local73 * 256 * 128);
				this.aClass11_Sub2Array4[local73] = new Class11_Sub2(arg0, 3553, 6410, 128, 128, true, local84, 6410, false);
			}
		}
	}
}
