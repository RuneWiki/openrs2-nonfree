import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class287 {

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "[Lclient!ol;")
	public Class76_Sub3[] aClass76_Sub3Array2 = null;

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "Lclient!te;")
	public Class76_Sub4 aClass76_Sub4_2 = null;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "Lclient!te;")
	public Class76_Sub4 aClass76_Sub4_3 = null;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "[Lclient!ol;")
	public Class76_Sub3[] aClass76_Sub3Array3 = null;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!te;")
	public Class76_Sub4 aClass76_Sub4_1 = null;

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "Z")
	public final boolean aBoolean585;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!kw;)V")
	public Class287(@OriginalArg(0) Class5_Sub2 arg0) {
		this.aBoolean585 = arg0.aBoolean391;
		Static408.method6491(arg0);
		if (this.aBoolean585) {
			@Pc(33) byte[] local33 = Static483.method7202(false, Static357.anObject14);
			this.aClass76_Sub4_2 = new Class76_Sub4(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static483.method7202(false, Static540.anObject17);
			this.aClass76_Sub4_3 = new Class76_Sub4(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class326 local65 = arg0.aClass326_1;
			if (local65.method8010()) {
				local33 = Static483.method7202(false, Static558.anObject18);
				this.aClass76_Sub4_1 = new Class76_Sub4(arg0, 6408, 128, 128, 16);
				@Pc(95) Class76_Sub4 local95 = new Class76_Sub4(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method8009(this.aClass76_Sub4_1, local95, 2.0F)) {
					this.aClass76_Sub4_1.method7925();
				} else {
					this.aClass76_Sub4_1.method7926();
					this.aClass76_Sub4_1 = null;
				}
				local95.method7926();
				return;
			}
		} else {
			this.aClass76_Sub3Array3 = new Class76_Sub3[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(139) byte[] local139 = Static603.method8430(local127 * 256 * 128, Static357.anObject14);
				this.aClass76_Sub3Array3[local127] = new Class76_Sub3(arg0, 3553, 6410, 128, 128, true, local139, 6410, false);
			}
			this.aClass76_Sub3Array2 = new Class76_Sub3[16];
			for (@Pc(165) int local165 = 0; local165 < 16; local165++) {
				@Pc(179) byte[] local179 = Static603.method8430(local165 * 128 * 128 * 2, Static540.anObject17);
				this.aClass76_Sub3Array2[local165] = new Class76_Sub3(arg0, 3553, 6410, 128, 128, true, local179, 6410, false);
			}
		}
	}
}
