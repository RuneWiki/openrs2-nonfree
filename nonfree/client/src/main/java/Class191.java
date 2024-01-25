import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class191 {

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "Lclient!bd;")
	public Class21_Sub1 aClass21_Sub1_1 = null;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "[Lclient!jp;")
	public Class21_Sub2[] aClass21_Sub2Array2 = null;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "Lclient!bd;")
	public Class21_Sub1 aClass21_Sub1_2 = null;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "[Lclient!jp;")
	public Class21_Sub2[] aClass21_Sub2Array3 = null;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "Lclient!bd;")
	public Class21_Sub1 aClass21_Sub1_3 = null;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "Z")
	public final boolean aBoolean403;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!qg;)V")
	public Class191(@OriginalArg(0) Class121_Sub2 arg0) {
		this.aBoolean403 = arg0.aBoolean468;
		Static373.method5288(arg0);
		if (this.aBoolean403) {
			@Pc(112) byte[] local112 = Static100.method1623(Static98.anObject3, false);
			this.aClass21_Sub1_1 = new Class21_Sub1(arg0, 6410, 128, 128, 16, local112, 6410);
			@Pc(129) byte[] local129 = Static100.method1623(Static239.anObject6, false);
			this.aClass21_Sub1_2 = new Class21_Sub1(arg0, 6410, 128, 128, 16, local129, 6410);
			@Pc(144) Class188 local144 = arg0.aClass188_1;
			if (local144.method4068()) {
				local112 = Static100.method1623(Static262.anObject10, false);
				this.aClass21_Sub1_3 = new Class21_Sub1(arg0, 6408, 128, 128, 16);
				@Pc(174) Class21_Sub1 local174 = new Class21_Sub1(arg0, 6409, 128, 128, 16, local112, 6409);
				if (local144.method4071(this.aClass21_Sub1_3, local174, 2.0F)) {
					this.aClass21_Sub1_3.method3748();
				} else {
					this.aClass21_Sub1_3.method3752();
					this.aClass21_Sub1_3 = null;
				}
				local174.method3752();
			}
		} else {
			this.aClass21_Sub2Array3 = new Class21_Sub2[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(48) byte[] local48 = Static94.method1468(local34 * 2 * 128 * 128, Static98.anObject3);
				this.aClass21_Sub2Array3[local34] = new Class21_Sub2(arg0, 3553, 6410, 128, 128, true, local48, 6410, false);
			}
			this.aClass21_Sub2Array2 = new Class21_Sub2[16];
			for (@Pc(74) int local74 = 0; local74 < 16; local74++) {
				@Pc(86) byte[] local86 = Static94.method1468(local74 * 128 * 256, Static239.anObject6);
				this.aClass21_Sub2Array2[local74] = new Class21_Sub2(arg0, 3553, 6410, 128, 128, true, local86, 6410, false);
			}
		}
	}
}
