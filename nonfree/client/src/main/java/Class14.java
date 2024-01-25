import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class14 {

	@OriginalMember(owner = "client!al", name = "f", descriptor = "Lclient!pj;")
	public Class3_Sub4 aClass3_Sub4_2 = null;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "[Lclient!aaa;")
	public Class3_Sub1[] aClass3_Sub1Array1 = null;

	@OriginalMember(owner = "client!al", name = "b", descriptor = "Lclient!pj;")
	public Class3_Sub4 aClass3_Sub4_1 = null;

	@OriginalMember(owner = "client!al", name = "g", descriptor = "Lclient!pj;")
	public Class3_Sub4 aClass3_Sub4_3 = null;

	@OriginalMember(owner = "client!al", name = "h", descriptor = "[Lclient!aaa;")
	public Class3_Sub1[] aClass3_Sub1Array2 = null;

	@OriginalMember(owner = "client!al", name = "e", descriptor = "Z")
	public final boolean aBoolean25;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!uca;)V")
	public Class14(@OriginalArg(0) Class162_Sub3 arg0) {
		this.aBoolean25 = arg0.aBoolean745;
		Static512.method6618(arg0);
		if (this.aBoolean25) {
			@Pc(33) byte[] local33 = Static479.method6201(false, Static45.anObject3);
			this.aClass3_Sub4_3 = new Class3_Sub4(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static479.method6201(false, Static422.anObject17);
			this.aClass3_Sub4_1 = new Class3_Sub4(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class178 local65 = arg0.aClass178_1;
			if (local65.method3646()) {
				local33 = Static479.method6201(false, Static83.anObject4);
				this.aClass3_Sub4_2 = new Class3_Sub4(arg0, 6408, 128, 128, 16);
				@Pc(95) Class3_Sub4 local95 = new Class3_Sub4(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method3644(local95, this.aClass3_Sub4_2, 2.0F)) {
					this.aClass3_Sub4_2.method5573();
				} else {
					this.aClass3_Sub4_2.method5569();
					this.aClass3_Sub4_2 = null;
				}
				local95.method5569();
				return;
			}
		} else {
			this.aClass3_Sub1Array2 = new Class3_Sub1[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(141) byte[] local141 = Static501.method6524(local127 * 128 * 128 * 2, Static45.anObject3);
				this.aClass3_Sub1Array2[local127] = new Class3_Sub1(arg0, 3553, 6410, 128, 128, true, local141, 6410, false);
			}
			this.aClass3_Sub1Array1 = new Class3_Sub1[16];
			for (@Pc(167) int local167 = 0; local167 < 16; local167++) {
				@Pc(179) byte[] local179 = Static501.method6524(256 * 128 * local167, Static422.anObject17);
				this.aClass3_Sub1Array1[local167] = new Class3_Sub1(arg0, 3553, 6410, 128, 128, true, local179, 6410, false);
			}
		}
	}
}
