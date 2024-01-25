import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class162 {

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "Lclient!fd;")
	public Class31_Sub2 aClass31_Sub2_2 = null;

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "Lclient!fd;")
	public Class31_Sub2 aClass31_Sub2_3 = null;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "Lclient!fd;")
	public Class31_Sub2 aClass31_Sub2_1 = null;

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "[Lclient!cd;")
	public Class31_Sub1[] aClass31_Sub1Array1 = null;

	@OriginalMember(owner = "client!mm", name = "i", descriptor = "[Lclient!cd;")
	public Class31_Sub1[] aClass31_Sub1Array2 = null;

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "Z")
	public final boolean aBoolean276;

	static {
		new Class198(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
		new Class198(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!tt;)V")
	public Class162(@OriginalArg(0) Class200_Sub2 arg0) {
		this.aBoolean276 = arg0.aBoolean447;
		Static5.method82(arg0);
		if (this.aBoolean276) {
			@Pc(116) byte[] local116 = Static27.method444(false, Static153.anObject7);
			this.aClass31_Sub2_2 = new Class31_Sub2(arg0, 6410, 128, 128, 16, local116, 6410);
			@Pc(133) byte[] local133 = Static27.method444(false, Static36.anObject2);
			this.aClass31_Sub2_3 = new Class31_Sub2(arg0, 6410, 128, 128, 16, local133, 6410);
			@Pc(148) Class134 local148 = arg0.aClass134_1;
			if (local148.method2824()) {
				local116 = Static27.method444(false, Static408.anObject9);
				this.aClass31_Sub2_1 = new Class31_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(178) Class31_Sub2 local178 = new Class31_Sub2(arg0, 6409, 128, 128, 16, local116, 6409);
				if (local148.method2820(2.0F, this.aClass31_Sub2_1, local178)) {
					this.aClass31_Sub2_1.method4588();
				} else {
					this.aClass31_Sub2_1.method4582();
					this.aClass31_Sub2_1 = null;
				}
				local178.method4582();
			}
		} else {
			this.aClass31_Sub1Array1 = new Class31_Sub1[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(48) byte[] local48 = Static189.method2558(128 * 128 * local34 * 2, Static153.anObject7);
				this.aClass31_Sub1Array1[local34] = new Class31_Sub1(arg0, 3553, 6410, 128, 128, true, local48, 6410, false);
			}
			this.aClass31_Sub1Array2 = new Class31_Sub1[16];
			for (@Pc(74) int local74 = 0; local74 < 16; local74++) {
				@Pc(88) byte[] local88 = Static189.method2558(local74 * 128 * 128 * 2, Static36.anObject2);
				this.aClass31_Sub1Array2[local74] = new Class31_Sub1(arg0, 3553, 6410, 128, 128, true, local88, 6410, false);
			}
		}
	}
}
