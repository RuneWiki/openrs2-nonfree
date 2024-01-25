import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class144 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "Lclient!cf;")
	public Class6_Sub3 aClass6_Sub3_1 = null;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "Lclient!cf;")
	public Class6_Sub3 aClass6_Sub3_2 = null;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "[Lclient!af;")
	public Class6_Sub1[] aClass6_Sub1Array3 = null;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "Lclient!cf;")
	public Class6_Sub3 aClass6_Sub3_3 = null;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "[Lclient!af;")
	public Class6_Sub1[] aClass6_Sub1Array2 = null;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "Z")
	public final boolean aBoolean415;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class144(@OriginalArg(0) Class19_Sub2 arg0) {
		this.aBoolean415 = arg0.aBoolean211;
		Static267.method3829(arg0);
		if (this.aBoolean415) {
			@Pc(112) byte[] local112 = Static366.method4930(false, Static109.anObject33);
			this.aClass6_Sub3_3 = new Class6_Sub3(arg0, 6410, 128, 128, 16, local112, 6410);
			@Pc(129) byte[] local129 = Static366.method4930(false, Static113.anObject13);
			this.aClass6_Sub3_1 = new Class6_Sub3(arg0, 6410, 128, 128, 16, local129, 6410);
			@Pc(144) Class47 local144 = arg0.aClass47_1;
			if (local144.method1248()) {
				local112 = Static366.method4930(false, Static190.anObject19);
				this.aClass6_Sub3_2 = new Class6_Sub3(arg0, 6408, 128, 128, 16);
				@Pc(174) Class6_Sub3 local174 = new Class6_Sub3(arg0, 6409, 128, 128, 16, local112, 6409);
				if (local144.method1250(2.0F, local174, this.aClass6_Sub3_2)) {
					this.aClass6_Sub3_2.method4189();
				} else {
					this.aClass6_Sub3_2.method4183();
					this.aClass6_Sub3_2 = null;
				}
				local174.method4183();
			}
		} else {
			this.aClass6_Sub1Array3 = new Class6_Sub1[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(46) byte[] local46 = Static129.method2285(Static109.anObject33, local34 * 128 * 256);
				this.aClass6_Sub1Array3[local34] = new Class6_Sub1(arg0, 3553, 6410, 128, 128, true, local46, 6410, false);
			}
			this.aClass6_Sub1Array2 = new Class6_Sub1[16];
			for (@Pc(74) int local74 = 0; local74 < 16; local74++) {
				@Pc(84) byte[] local84 = Static129.method2285(Static113.anObject13, local74 * 32768);
				this.aClass6_Sub1Array2[local74] = new Class6_Sub1(arg0, 3553, 6410, 128, 128, true, local84, 6410, false);
			}
		}
	}
}
