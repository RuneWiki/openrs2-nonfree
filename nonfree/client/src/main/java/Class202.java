import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class202 {

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "[Lclient!ah;")
	public Class5_Sub1[] aClass5_Sub1Array3 = null;

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "Lclient!mi;")
	public Class5_Sub3 aClass5_Sub3_2 = null;

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "[Lclient!ah;")
	public Class5_Sub1[] aClass5_Sub1Array4 = null;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "Lclient!mi;")
	public Class5_Sub3 aClass5_Sub3_1 = null;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "Lclient!mi;")
	public Class5_Sub3 aClass5_Sub3_3 = null;

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "Z")
	public final boolean aBoolean437;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!od;)V")
	public Class202(@OriginalArg(0) Class128_Sub2 arg0) {
		this.aBoolean437 = arg0.aBoolean359;
		Static381.method4867(arg0);
		if (this.aBoolean437) {
			@Pc(33) byte[] local33 = Static153.method2152(false, Static287.anObject7);
			this.aClass5_Sub3_3 = new Class5_Sub3(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static153.method2152(false, Static122.anObject3);
			this.aClass5_Sub3_2 = new Class5_Sub3(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class161 local65 = arg0.aClass161_1;
			if (local65.method3266()) {
				local33 = Static153.method2152(false, Static56.anObject2);
				this.aClass5_Sub3_1 = new Class5_Sub3(arg0, 6408, 128, 128, 16);
				@Pc(95) Class5_Sub3 local95 = new Class5_Sub3(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method3269(local95, this.aClass5_Sub3_1, 2.0F)) {
					this.aClass5_Sub3_1.method5533();
				} else {
					this.aClass5_Sub3_1.method5538();
					this.aClass5_Sub3_1 = null;
				}
				local95.method5538();
				return;
			}
		} else {
			this.aClass5_Sub1Array4 = new Class5_Sub1[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(139) byte[] local139 = Static342.method4348(local127 * 256 * 128, Static287.anObject7);
				this.aClass5_Sub1Array4[local127] = new Class5_Sub1(arg0, 3553, 6410, 128, 128, true, local139, 6410, false);
			}
			this.aClass5_Sub1Array3 = new Class5_Sub1[16];
			for (@Pc(165) int local165 = 0; local165 < 16; local165++) {
				@Pc(175) byte[] local175 = Static342.method4348(local165 * 32768, Static122.anObject3);
				this.aClass5_Sub1Array3[local165] = new Class5_Sub1(arg0, 3553, 6410, 128, 128, true, local175, 6410, false);
			}
		}
	}
}
