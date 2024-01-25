import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class262 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "Lclient!tj;")
	public Class116_Sub3 aClass116_Sub3_1 = null;

	@OriginalMember(owner = "client!od", name = "f", descriptor = "[Lclient!ld;")
	public Class116_Sub2[] aClass116_Sub2Array4 = null;

	@OriginalMember(owner = "client!od", name = "e", descriptor = "Lclient!tj;")
	public Class116_Sub3 aClass116_Sub3_2 = null;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "[Lclient!ld;")
	public Class116_Sub2[] aClass116_Sub2Array3 = null;

	@OriginalMember(owner = "client!od", name = "g", descriptor = "Lclient!tj;")
	public Class116_Sub3 aClass116_Sub3_3 = null;

	@OriginalMember(owner = "client!od", name = "d", descriptor = "Z")
	public final boolean aBoolean519;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!pc;)V")
	public Class262(@OriginalArg(0) Class33_Sub3 arg0) {
		this.aBoolean519 = arg0.aBoolean558;
		Static6.method113(arg0);
		if (this.aBoolean519) {
			@Pc(33) byte[] local33 = Static418.method5746(Static404.anObject10, false);
			this.aClass116_Sub3_3 = new Class116_Sub3(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static418.method5746(Static300.anObject5, false);
			this.aClass116_Sub3_1 = new Class116_Sub3(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class295 local65 = arg0.aClass295_1;
			if (local65.method6556()) {
				local33 = Static418.method5746(Static242.anObject4, false);
				this.aClass116_Sub3_2 = new Class116_Sub3(arg0, 6408, 128, 128, 16);
				@Pc(95) Class116_Sub3 local95 = new Class116_Sub3(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method6555(this.aClass116_Sub3_2, 2.0F, local95)) {
					this.aClass116_Sub3_2.method8343();
				} else {
					this.aClass116_Sub3_2.method8345();
					this.aClass116_Sub3_2 = null;
				}
				local95.method8345();
				return;
			}
		} else {
			this.aClass116_Sub2Array4 = new Class116_Sub2[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(139) byte[] local139 = Static181.method2896(local127 * 16384 * 2, Static404.anObject10);
				this.aClass116_Sub2Array4[local127] = new Class116_Sub2(arg0, 3553, 6410, 128, 128, true, local139, 6410, false);
			}
			this.aClass116_Sub2Array3 = new Class116_Sub2[16];
			for (@Pc(165) int local165 = 0; local165 < 16; local165++) {
				@Pc(179) byte[] local179 = Static181.method2896(2 * 128 * local165 * 128, Static300.anObject5);
				this.aClass116_Sub2Array3[local165] = new Class116_Sub2(arg0, 3553, 6410, 128, 128, true, local179, 6410, false);
			}
		}
	}
}
