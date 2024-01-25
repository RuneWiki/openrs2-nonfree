import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class145 {

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "Lclient!ij;")
	public Class114_Sub2 aClass114_Sub2_2 = null;

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "[Lclient!gaa;")
	public Class114_Sub1[] aClass114_Sub1Array1 = null;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "Lclient!ij;")
	public Class114_Sub2 aClass114_Sub2_1 = null;

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "Lclient!ij;")
	public Class114_Sub2 aClass114_Sub2_3 = null;

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "[Lclient!gaa;")
	public Class114_Sub1[] aClass114_Sub1Array2 = null;

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "Z")
	public final boolean aBoolean315;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!no;)V")
	public Class145(@OriginalArg(0) Class66_Sub3 arg0) {
		this.aBoolean315 = arg0.aBoolean487;
		Static149.method3046(arg0);
		if (this.aBoolean315) {
			@Pc(110) byte[] local110 = Static557.method92(false, Static165.anObject15);
			this.aClass114_Sub2_2 = new Class114_Sub2(arg0, 6410, 128, 128, 16, local110, 6410);
			@Pc(127) byte[] local127 = Static557.method92(false, Static433.anObject37);
			this.aClass114_Sub2_3 = new Class114_Sub2(arg0, 6410, 128, 128, 16, local127, 6410);
			@Pc(142) Class203 local142 = arg0.aClass203_1;
			if (local142.method4527()) {
				local110 = Static557.method92(false, Static83.anObject49);
				this.aClass114_Sub2_1 = new Class114_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(172) Class114_Sub2 local172 = new Class114_Sub2(arg0, 6409, 128, 128, 16, local110, 6409);
				if (local142.method4531(2.0F, local172, this.aClass114_Sub2_1)) {
					this.aClass114_Sub2_1.method5003();
				} else {
					this.aClass114_Sub2_1.method5006();
					this.aClass114_Sub2_1 = null;
				}
				local172.method5006();
			}
		} else {
			this.aClass114_Sub1Array2 = new Class114_Sub1[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(46) byte[] local46 = Static357.method5255(local34 * 256 * 128, Static165.anObject15);
				this.aClass114_Sub1Array2[local34] = new Class114_Sub1(arg0, 3553, 6410, 128, 128, true, local46, 6410, false);
			}
			this.aClass114_Sub1Array1 = new Class114_Sub1[16];
			for (@Pc(72) int local72 = 0; local72 < 16; local72++) {
				@Pc(84) byte[] local84 = Static357.method5255(local72 * 128 * 256, Static433.anObject37);
				this.aClass114_Sub1Array1[local72] = new Class114_Sub1(arg0, 3553, 6410, 128, 128, true, local84, 6410, false);
			}
		}
	}
}
