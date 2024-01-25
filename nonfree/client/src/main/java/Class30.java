import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class30 {

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "[Lclient!ud;")
	public Class59_Sub3[] aClass59_Sub3Array1 = null;

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "[Lclient!ud;")
	public Class59_Sub3[] aClass59_Sub3Array2 = null;

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "Lclient!jk;")
	public Class59_Sub2 aClass59_Sub2_1 = null;

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "Lclient!jk;")
	public Class59_Sub2 aClass59_Sub2_2 = null;

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "Lclient!jk;")
	public Class59_Sub2 aClass59_Sub2_3 = null;

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "Z")
	public final boolean aBoolean30;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lclient!vd;)V")
	public Class30(@OriginalArg(0) Class51_Sub2 arg0) {
		this.aBoolean30 = arg0.aBoolean455;
		Static179.method5737(arg0);
		if (this.aBoolean30) {
			@Pc(33) byte[] local33 = Static333.method2749(false, Static163.anObject5);
			this.aClass59_Sub2_2 = new Class59_Sub2(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static333.method2749(false, Static5.anObject1);
			this.aClass59_Sub2_1 = new Class59_Sub2(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class3 local65 = arg0.aClass3_1;
			if (local65.method10()) {
				local33 = Static333.method2749(false, Static438.anObject11);
				this.aClass59_Sub2_3 = new Class59_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(95) Class59_Sub2 local95 = new Class59_Sub2(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method12(2.0F, local95, this.aClass59_Sub2_3)) {
					this.aClass59_Sub2_3.method5761();
				} else {
					this.aClass59_Sub2_3.method5763();
					this.aClass59_Sub2_3 = null;
				}
				local95.method5763();
				return;
			}
		} else {
			this.aClass59_Sub3Array2 = new Class59_Sub3[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(141) byte[] local141 = Static286.method3224(local127 * 128 * 128 * 2, Static163.anObject5);
				this.aClass59_Sub3Array2[local127] = new Class59_Sub3(arg0, 3553, 6410, 128, 128, true, local141, 6410, false);
			}
			this.aClass59_Sub3Array1 = new Class59_Sub3[16];
			for (@Pc(169) int local169 = 0; local169 < 16; local169++) {
				@Pc(181) byte[] local181 = Static286.method3224(local169 * 256 * 128, Static5.anObject1);
				this.aClass59_Sub3Array1[local169] = new Class59_Sub3(arg0, 3553, 6410, 128, 128, true, local181, 6410, false);
			}
		}
	}
}
