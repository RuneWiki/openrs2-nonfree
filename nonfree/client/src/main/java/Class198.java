import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class198 {

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "Lclient!eh;")
	public Class65_Sub1 aClass65_Sub1_1 = null;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "Lclient!eh;")
	public Class65_Sub1 aClass65_Sub1_3 = null;

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "[Lclient!ml;")
	public Class65_Sub2[] aClass65_Sub2Array1 = null;

	@OriginalMember(owner = "client!pl", name = "m", descriptor = "[Lclient!ml;")
	public Class65_Sub2[] aClass65_Sub2Array2 = null;

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "Lclient!eh;")
	public Class65_Sub1 aClass65_Sub1_2 = null;

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "Z")
	public final boolean aBoolean363;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class198(@OriginalArg(0) Class135_Sub2 arg0) {
		this.aBoolean363 = arg0.aBoolean470;
		Static439.method5847(arg0);
		if (this.aBoolean363) {
			@Pc(33) byte[] local33 = Static59.method427(false, Static20.anObject8);
			this.aClass65_Sub1_3 = new Class65_Sub1(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static59.method427(false, Static371.anObject18);
			this.aClass65_Sub1_1 = new Class65_Sub1(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class113 local65 = arg0.aClass113_1;
			if (local65.method2117()) {
				local33 = Static59.method427(false, Static213.anObject4);
				this.aClass65_Sub1_2 = new Class65_Sub1(arg0, 6408, 128, 128, 16);
				@Pc(95) Class65_Sub1 local95 = new Class65_Sub1(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method2116(local95, this.aClass65_Sub1_2, 2.0F)) {
					this.aClass65_Sub1_2.method4769();
				} else {
					this.aClass65_Sub1_2.method4770();
					this.aClass65_Sub1_2 = null;
				}
				local95.method4770();
				return;
			}
		} else {
			this.aClass65_Sub2Array1 = new Class65_Sub2[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(139) byte[] local139 = Static247.method3256(local127 * 2 * 16384, Static20.anObject8);
				this.aClass65_Sub2Array1[local127] = new Class65_Sub2(arg0, 3553, 6410, 128, 128, true, local139, 6410, false);
			}
			this.aClass65_Sub2Array2 = new Class65_Sub2[16];
			for (@Pc(167) int local167 = 0; local167 < 16; local167++) {
				@Pc(177) byte[] local177 = Static247.method3256(local167 * 32768, Static371.anObject18);
				this.aClass65_Sub2Array2[local167] = new Class65_Sub2(arg0, 3553, 6410, 128, 128, true, local177, 6410, false);
			}
		}
	}
}
