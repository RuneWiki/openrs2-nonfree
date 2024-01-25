import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dja")
public final class Class65 {

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "[Lclient!aaa;")
	public Class2_Sub1[] aClass2_Sub1Array2 = null;

	@OriginalMember(owner = "client!dja", name = "d", descriptor = "[Lclient!aaa;")
	public Class2_Sub1[] aClass2_Sub1Array3 = null;

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "Lclient!qj;")
	public Class2_Sub4 aClass2_Sub4_1 = null;

	@OriginalMember(owner = "client!dja", name = "f", descriptor = "Lclient!qj;")
	public Class2_Sub4 aClass2_Sub4_3 = null;

	@OriginalMember(owner = "client!dja", name = "c", descriptor = "Lclient!qj;")
	public Class2_Sub4 aClass2_Sub4_2 = null;

	@OriginalMember(owner = "client!dja", name = "e", descriptor = "Z")
	public final boolean aBoolean234;

	@OriginalMember(owner = "client!dja", name = "<init>", descriptor = "(Lclient!ac;)V")
	public Class65(@OriginalArg(0) Class5_Sub1 arg0) {
		this.aBoolean234 = arg0.aBoolean32;
		Static142.method2805(arg0);
		if (this.aBoolean234) {
			@Pc(33) byte[] local33 = Static56.method1712(Static313.anObject14, false);
			this.aClass2_Sub4_2 = new Class2_Sub4(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static56.method1712(Static249.anObject11, false);
			this.aClass2_Sub4_3 = new Class2_Sub4(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class135 local65 = arg0.aClass135_1;
			if (local65.method3846()) {
				local33 = Static56.method1712(Static458.anObject18, false);
				this.aClass2_Sub4_1 = new Class2_Sub4(arg0, 6408, 128, 128, 16);
				@Pc(95) Class2_Sub4 local95 = new Class2_Sub4(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method3847(local95, 2.0F, this.aClass2_Sub4_1)) {
					this.aClass2_Sub4_1.method6975();
				} else {
					this.aClass2_Sub4_1.method6979();
					this.aClass2_Sub4_1 = null;
				}
				local95.method6979();
				return;
			}
		} else {
			this.aClass2_Sub1Array3 = new Class2_Sub1[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(141) byte[] local141 = Static337.method5604(128 * 128 * local127 * 2, Static313.anObject14);
				this.aClass2_Sub1Array3[local127] = new Class2_Sub1(arg0, 3553, 6410, 128, 128, true, local141, 6410, false);
			}
			this.aClass2_Sub1Array2 = new Class2_Sub1[16];
			for (@Pc(169) int local169 = 0; local169 < 16; local169++) {
				@Pc(181) byte[] local181 = Static337.method5604(local169 * 16384 * 2, Static249.anObject11);
				this.aClass2_Sub1Array2[local169] = new Class2_Sub1(arg0, 3553, 6410, 128, 128, true, local181, 6410, false);
			}
		}
	}
}
