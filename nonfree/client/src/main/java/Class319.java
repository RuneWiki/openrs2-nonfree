import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class319 {

	@OriginalMember(owner = "client!um", name = "b", descriptor = "Lclient!jm;")
	public Class132_Sub2 aClass132_Sub2_1 = null;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "Lclient!jm;")
	public Class132_Sub2 aClass132_Sub2_2 = null;

	@OriginalMember(owner = "client!um", name = "e", descriptor = "Lclient!jm;")
	public Class132_Sub2 aClass132_Sub2_3 = null;

	@OriginalMember(owner = "client!um", name = "d", descriptor = "[Lclient!kp;")
	public Class132_Sub1[] aClass132_Sub1Array3 = null;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "[Lclient!kp;")
	public Class132_Sub1[] aClass132_Sub1Array2 = null;

	@OriginalMember(owner = "client!um", name = "f", descriptor = "Z")
	public final boolean aBoolean683;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!ap;)V")
	public Class319(@OriginalArg(0) Class9_Sub2 arg0) {
		this.aBoolean683 = arg0.aBoolean71;
		Static167.method3389(arg0);
		if (this.aBoolean683) {
			@Pc(114) byte[] local114 = Static439.method6701(false, Static319.anObject8);
			this.aClass132_Sub2_2 = new Class132_Sub2(arg0, 6410, 128, 128, 16, local114, 6410);
			@Pc(131) byte[] local131 = Static439.method6701(false, Static488.anObject19);
			this.aClass132_Sub2_1 = new Class132_Sub2(arg0, 6410, 128, 128, 16, local131, 6410);
			@Pc(146) Class84 local146 = arg0.aClass84_1;
			if (local146.method2329()) {
				local114 = Static439.method6701(false, Static489.anObject20);
				this.aClass132_Sub2_3 = new Class132_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(176) Class132_Sub2 local176 = new Class132_Sub2(arg0, 6409, 128, 128, 16, local114, 6409);
				if (local146.method2328(this.aClass132_Sub2_3, 2.0F, local176)) {
					this.aClass132_Sub2_3.method5610();
				} else {
					this.aClass132_Sub2_3.method5609();
					this.aClass132_Sub2_3 = null;
				}
				local176.method5609();
			}
		} else {
			this.aClass132_Sub1Array3 = new Class132_Sub1[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(46) byte[] local46 = Static4.method206(Static319.anObject8, local34 * 256 * 128);
				this.aClass132_Sub1Array3[local34] = new Class132_Sub1(arg0, 3553, 6410, 128, 128, true, local46, 6410, false);
			}
			this.aClass132_Sub1Array2 = new Class132_Sub1[16];
			for (@Pc(72) int local72 = 0; local72 < 16; local72++) {
				@Pc(86) byte[] local86 = Static4.method206(Static488.anObject19, 2 * 128 * local72 * 128);
				this.aClass132_Sub1Array2[local72] = new Class132_Sub1(arg0, 3553, 6410, 128, 128, true, local86, 6410, false);
			}
		}
	}
}
