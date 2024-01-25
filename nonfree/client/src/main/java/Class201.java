import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class201 {

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "Lclient!gh;")
	public Class62_Sub1 aClass62_Sub1_1 = null;

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "Lclient!gh;")
	public Class62_Sub1 aClass62_Sub1_2 = null;

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "[Lclient!uk;")
	public Class62_Sub2[] aClass62_Sub2Array2 = null;

	@OriginalMember(owner = "client!pt", name = "g", descriptor = "Lclient!gh;")
	public Class62_Sub1 aClass62_Sub1_3 = null;

	@OriginalMember(owner = "client!pt", name = "k", descriptor = "[Lclient!uk;")
	public Class62_Sub2[] aClass62_Sub2Array3 = null;

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "Z")
	public final boolean aBoolean428;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!bt;)V")
	public Class201(@OriginalArg(0) Class30_Sub1 arg0) {
		this.aBoolean428 = arg0.aBoolean46;
		Static75.method1638(arg0);
		if (this.aBoolean428) {
			@Pc(33) byte[] local33 = Static141.method6328(false, Static375.anObject10);
			this.aClass62_Sub1_2 = new Class62_Sub1(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static141.method6328(false, Static257.anObject5);
			this.aClass62_Sub1_1 = new Class62_Sub1(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class146 local65 = arg0.aClass146_1;
			if (local65.method3827()) {
				local33 = Static141.method6328(false, Static298.anObject8);
				this.aClass62_Sub1_3 = new Class62_Sub1(arg0, 6408, 128, 128, 16);
				@Pc(95) Class62_Sub1 local95 = new Class62_Sub1(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method3830(local95, this.aClass62_Sub1_3, 2.0F)) {
					this.aClass62_Sub1_3.method5352();
				} else {
					this.aClass62_Sub1_3.method5353();
					this.aClass62_Sub1_3 = null;
				}
				local95.method5353();
				return;
			}
		} else {
			this.aClass62_Sub2Array3 = new Class62_Sub2[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(141) byte[] local141 = Static281.method4419(2 * 128 * 128 * local127, Static375.anObject10);
				this.aClass62_Sub2Array3[local127] = new Class62_Sub2(arg0, 3553, 6410, 128, 128, true, local141, 6410, false);
			}
			this.aClass62_Sub2Array2 = new Class62_Sub2[16];
			for (@Pc(169) int local169 = 0; local169 < 16; local169++) {
				@Pc(183) byte[] local183 = Static281.method4419(128 * 128 * local169 * 2, Static257.anObject5);
				this.aClass62_Sub2Array2[local169] = new Class62_Sub2(arg0, 3553, 6410, 128, 128, true, local183, 6410, false);
			}
		}
	}
}
