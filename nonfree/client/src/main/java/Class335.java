import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class335 {

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "Lclient!cd;")
	public Class24_Sub2 aClass24_Sub2_1 = null;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "Lclient!cd;")
	public Class24_Sub2 aClass24_Sub2_2 = null;

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "[Lclient!g;")
	public Class24_Sub1[] aClass24_Sub1Array3 = null;

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "[Lclient!g;")
	public Class24_Sub1[] aClass24_Sub1Array4 = null;

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "Lclient!cd;")
	public Class24_Sub2 aClass24_Sub2_3 = null;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Z")
	public final boolean aBoolean649;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class335(@OriginalArg(0) Class45_Sub3 arg0) {
		this.aBoolean649 = arg0.aBoolean695;
		Static535.method7132(arg0);
		if (this.aBoolean649) {
			@Pc(33) byte[] local33 = Static73.method1566(false, Static260.anObject9);
			this.aClass24_Sub2_2 = new Class24_Sub2(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static73.method1566(false, Static255.anObject8);
			this.aClass24_Sub2_3 = new Class24_Sub2(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class146 local65 = arg0.aClass146_1;
			if (local65.method3529()) {
				local33 = Static73.method1566(false, Static376.anObject14);
				this.aClass24_Sub2_1 = new Class24_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(95) Class24_Sub2 local95 = new Class24_Sub2(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method3531(2.0F, this.aClass24_Sub2_1, local95)) {
					this.aClass24_Sub2_1.method2799();
				} else {
					this.aClass24_Sub2_1.method2797();
					this.aClass24_Sub2_1 = null;
				}
				local95.method2797();
				return;
			}
		} else {
			this.aClass24_Sub1Array3 = new Class24_Sub1[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(141) byte[] local141 = Static442.method6191(local127 * 128 * 128 * 2, Static260.anObject9);
				this.aClass24_Sub1Array3[local127] = new Class24_Sub1(arg0, 3553, 6410, 128, 128, true, local141, 6410, false);
			}
			this.aClass24_Sub1Array4 = new Class24_Sub1[16];
			for (@Pc(167) int local167 = 0; local167 < 16; local167++) {
				@Pc(179) byte[] local179 = Static442.method6191(local167 * 128 * 256, Static255.anObject8);
				this.aClass24_Sub1Array4[local167] = new Class24_Sub1(arg0, 3553, 6410, 128, 128, true, local179, 6410, false);
			}
		}
	}
}
