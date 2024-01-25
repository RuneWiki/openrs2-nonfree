import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class69 {

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "Lclient!ep;")
	public Class51_Sub2 aClass51_Sub2_1 = null;

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "[Lclient!co;")
	public Class51_Sub1[] aClass51_Sub1Array2 = null;

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "[Lclient!co;")
	public Class51_Sub1[] aClass51_Sub1Array1 = null;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "Lclient!ep;")
	public Class51_Sub2 aClass51_Sub2_3 = null;

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "Lclient!ep;")
	public Class51_Sub2 aClass51_Sub2_2 = null;

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "Z")
	public final boolean aBoolean127;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!jaa;)V")
	public Class69(@OriginalArg(0) Class14_Sub3 arg0) {
		this.aBoolean127 = arg0.aBoolean318;
		Static150.method2879(arg0);
		if (this.aBoolean127) {
			@Pc(33) byte[] local33 = Static36.method965(Static138.anObject5, false);
			this.aClass51_Sub2_1 = new Class51_Sub2(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static36.method965(Static494.anObject12, false);
			this.aClass51_Sub2_2 = new Class51_Sub2(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class238 local65 = arg0.aClass238_1;
			if (local65.method5547()) {
				local33 = Static36.method965(Static498.anObject13, false);
				this.aClass51_Sub2_3 = new Class51_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(95) Class51_Sub2 local95 = new Class51_Sub2(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method5548(this.aClass51_Sub2_3, local95, 2.0F)) {
					this.aClass51_Sub2_3.method7736();
				} else {
					this.aClass51_Sub2_3.method7730();
					this.aClass51_Sub2_3 = null;
				}
				local95.method7730();
				return;
			}
		} else {
			this.aClass51_Sub1Array1 = new Class51_Sub1[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(139) byte[] local139 = Static597.method7851(256 * 128 * local127, Static138.anObject5);
				this.aClass51_Sub1Array1[local127] = new Class51_Sub1(arg0, 3553, 6410, 128, 128, true, local139, 6410, false);
			}
			this.aClass51_Sub1Array2 = new Class51_Sub1[16];
			for (@Pc(165) int local165 = 0; local165 < 16; local165++) {
				@Pc(179) byte[] local179 = Static597.method7851(local165 * 2 * 128 * 128, Static494.anObject12);
				this.aClass51_Sub1Array2[local165] = new Class51_Sub1(arg0, 3553, 6410, 128, 128, true, local179, 6410, false);
			}
		}
	}
}
