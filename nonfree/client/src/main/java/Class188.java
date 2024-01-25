import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class188 {

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "Lclient!ho;")
	public Class4_Sub1 aClass4_Sub1_1 = null;

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "Lclient!ho;")
	public Class4_Sub1 aClass4_Sub1_2 = null;

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "[Lclient!hp;")
	public Class4_Sub2[] aClass4_Sub2Array2 = null;

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "Lclient!ho;")
	public Class4_Sub1 aClass4_Sub1_3 = null;

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "[Lclient!hp;")
	public Class4_Sub2[] aClass4_Sub2Array1 = null;

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "Z")
	public final boolean aBoolean404;

	static {
		new Class40("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class188(@OriginalArg(0) Class62_Sub3 arg0) {
		this.aBoolean404 = arg0.aBoolean287;
		Static57.method1141(arg0);
		if (this.aBoolean404) {
			@Pc(33) byte[] local33 = Static278.method4542(false, Static299.anObject15);
			this.aClass4_Sub1_1 = new Class4_Sub1(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static278.method4542(false, Static259.anObject12);
			this.aClass4_Sub1_3 = new Class4_Sub1(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class215 local65 = arg0.aClass215_1;
			if (local65.method5313()) {
				local33 = Static278.method4542(false, Static86.anObject2);
				this.aClass4_Sub1_2 = new Class4_Sub1(arg0, 6408, 128, 128, 16);
				@Pc(95) Class4_Sub1 local95 = new Class4_Sub1(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method5314(2.0F, this.aClass4_Sub1_2, local95)) {
					this.aClass4_Sub1_2.method5491();
				} else {
					this.aClass4_Sub1_2.method5494();
					this.aClass4_Sub1_2 = null;
				}
				local95.method5494();
				return;
			}
		} else {
			this.aClass4_Sub2Array2 = new Class4_Sub2[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(139) byte[] local139 = Static492.method6832(local127 * 256 * 128, Static299.anObject15);
				this.aClass4_Sub2Array2[local127] = new Class4_Sub2(arg0, 3553, 6410, 128, 128, true, local139, 6410, false);
			}
			this.aClass4_Sub2Array1 = new Class4_Sub2[16];
			for (@Pc(167) int local167 = 0; local167 < 16; local167++) {
				@Pc(179) byte[] local179 = Static492.method6832(local167 * 128 * 256, Static259.anObject12);
				this.aClass4_Sub2Array1[local167] = new Class4_Sub2(arg0, 3553, 6410, 128, 128, true, local179, 6410, false);
			}
		}
	}
}
