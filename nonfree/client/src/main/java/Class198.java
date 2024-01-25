import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class198 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "[Lclient!km;")
	public Class10_Sub1[] aClass10_Sub1Array3 = null;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "Lclient!wt;")
	public Class10_Sub4 aClass10_Sub4_1 = null;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "[Lclient!km;")
	public Class10_Sub1[] aClass10_Sub1Array4 = null;

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "Lclient!wt;")
	public Class10_Sub4 aClass10_Sub4_2 = null;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "Lclient!wt;")
	public Class10_Sub4 aClass10_Sub4_3 = null;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "Z")
	public final boolean aBoolean630;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!ur;)V")
	public Class198(@OriginalArg(0) Class34_Sub2 arg0) {
		this.aBoolean630 = arg0.aBoolean764;
		Static133.method2051(arg0);
		if (this.aBoolean630) {
			@Pc(33) byte[] local33 = Static113.method1804(false, Static131.anObject4);
			this.aClass10_Sub4_2 = new Class10_Sub4(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static113.method1804(false, Static72.anObject2);
			this.aClass10_Sub4_1 = new Class10_Sub4(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class222 local65 = arg0.aClass222_1;
			if (local65.method4886()) {
				local33 = Static113.method1804(false, Static110.anObject3);
				this.aClass10_Sub4_3 = new Class10_Sub4(arg0, 6408, 128, 128, 16);
				@Pc(95) Class10_Sub4 local95 = new Class10_Sub4(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method4888(local95, this.aClass10_Sub4_3, 2.0F)) {
					this.aClass10_Sub4_3.method5934();
				} else {
					this.aClass10_Sub4_3.method5926();
					this.aClass10_Sub4_3 = null;
				}
				local95.method5926();
				return;
			}
		} else {
			this.aClass10_Sub1Array4 = new Class10_Sub1[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(139) byte[] local139 = Static295.method4033(Static131.anObject4, local127 * 256 * 128);
				this.aClass10_Sub1Array4[local127] = new Class10_Sub1(arg0, 3553, 6410, 128, 128, true, local139, 6410, false);
			}
			this.aClass10_Sub1Array3 = new Class10_Sub1[16];
			for (@Pc(165) int local165 = 0; local165 < 16; local165++) {
				@Pc(177) byte[] local177 = Static295.method4033(Static72.anObject2, local165 * 128 * 256);
				this.aClass10_Sub1Array3[local165] = new Class10_Sub1(arg0, 3553, 6410, 128, 128, true, local177, 6410, false);
			}
		}
	}
}
