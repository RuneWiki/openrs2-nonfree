import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class9 {

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "[Lclient!sq;")
	public Class4_Sub1[] aClass4_Sub1Array1 = null;

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "[Lclient!sq;")
	public Class4_Sub1[] aClass4_Sub1Array2 = null;

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "Lclient!iq;")
	public Class4_Sub3 aClass4_Sub3_2 = null;

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "Lclient!iq;")
	public Class4_Sub3 aClass4_Sub3_1 = null;

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "Lclient!iq;")
	public Class4_Sub3 aClass4_Sub3_3 = null;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "Z")
	public final boolean aBoolean7;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class9(@OriginalArg(0) Class50_Sub1 arg0) {
		this.aBoolean7 = arg0.aBoolean83;
		Static261.method3761(arg0);
		if (this.aBoolean7) {
			@Pc(114) byte[] local114 = Static228.method3400(false, Static290.anObject7);
			this.aClass4_Sub3_2 = new Class4_Sub3(arg0, 6410, 128, 128, 16, local114, 6410);
			@Pc(131) byte[] local131 = Static228.method3400(false, Static51.anObject4);
			this.aClass4_Sub3_1 = new Class4_Sub3(arg0, 6410, 128, 128, 16, local131, 6410);
			@Pc(146) Class242 local146 = arg0.aClass242_1;
			if (local146.method5277()) {
				local114 = Static228.method3400(false, Static238.anObject6);
				this.aClass4_Sub3_3 = new Class4_Sub3(arg0, 6408, 128, 128, 16);
				@Pc(176) Class4_Sub3 local176 = new Class4_Sub3(arg0, 6409, 128, 128, 16, local114, 6409);
				if (local146.method5279(2.0F, this.aClass4_Sub3_3, local176)) {
					this.aClass4_Sub3_3.method4583();
				} else {
					this.aClass4_Sub3_3.method4575();
					this.aClass4_Sub3_3 = null;
				}
				local176.method4575();
			}
		} else {
			this.aClass4_Sub1Array2 = new Class4_Sub1[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(46) byte[] local46 = Static10.method121(256 * 128 * local34, Static290.anObject7);
				this.aClass4_Sub1Array2[local34] = new Class4_Sub1(arg0, 3553, 6410, 128, 128, true, local46, 6410, false);
			}
			this.aClass4_Sub1Array1 = new Class4_Sub1[16];
			for (@Pc(74) int local74 = 0; local74 < 16; local74++) {
				@Pc(88) byte[] local88 = Static10.method121(2 * 128 * local74 * 128, Static51.anObject4);
				this.aClass4_Sub1Array1[local74] = new Class4_Sub1(arg0, 3553, 6410, 128, 128, true, local88, 6410, false);
			}
		}
	}
}
