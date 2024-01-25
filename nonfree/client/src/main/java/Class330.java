import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class330 {

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "[Lclient!il;")
	public Class3_Sub2[] aClass3_Sub2Array3 = null;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "Lclient!fp;")
	public Class3_Sub3 aClass3_Sub3_1 = null;

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "Lclient!fp;")
	public Class3_Sub3 aClass3_Sub3_2 = null;

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "[Lclient!il;")
	public Class3_Sub2[] aClass3_Sub2Array4 = null;

	@OriginalMember(owner = "client!ul", name = "m", descriptor = "Lclient!fp;")
	public Class3_Sub3 aClass3_Sub3_3 = null;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "Z")
	public final boolean aBoolean660;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!kfa;)V")
	public Class330(@OriginalArg(0) Class7_Sub2 arg0) {
		this.aBoolean660 = arg0.aBoolean395;
		Static202.method3284(arg0);
		if (this.aBoolean660) {
			@Pc(33) byte[] local33 = Static141.method8245(Static127.anObject37, false);
			this.aClass3_Sub3_1 = new Class3_Sub3(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static141.method8245(Static517.anObject156, false);
			this.aClass3_Sub3_2 = new Class3_Sub3(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class332 local65 = arg0.aClass332_1;
			if (local65.method7541()) {
				local33 = Static141.method8245(Static580.anObject103, false);
				this.aClass3_Sub3_3 = new Class3_Sub3(arg0, 6408, 128, 128, 16);
				@Pc(95) Class3_Sub3 local95 = new Class3_Sub3(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method7539(2.0F, local95, this.aClass3_Sub3_3)) {
					this.aClass3_Sub3_3.method2747();
				} else {
					this.aClass3_Sub3_3.method2746();
					this.aClass3_Sub3_3 = null;
				}
				local95.method2746();
				return;
			}
		} else {
			this.aClass3_Sub2Array4 = new Class3_Sub2[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(141) byte[] local141 = Static161.method2668(Static127.anObject37, 2 * 128 * local127 * 128);
				this.aClass3_Sub2Array4[local127] = new Class3_Sub2(arg0, 3553, 6410, 128, 128, true, local141, 6410, false);
			}
			this.aClass3_Sub2Array3 = new Class3_Sub2[16];
			for (@Pc(169) int local169 = 0; local169 < 16; local169++) {
				@Pc(183) byte[] local183 = Static161.method2668(Static517.anObject156, local169 * 128 * 128 * 2);
				this.aClass3_Sub2Array3[local169] = new Class3_Sub2(arg0, 3553, 6410, 128, 128, true, local183, 6410, false);
			}
		}
	}
}
