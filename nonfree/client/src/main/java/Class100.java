import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class100 {

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "Lclient!lj;")
	public Class137_Sub2 aClass137_Sub2_1 = null;

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "Lclient!lj;")
	public Class137_Sub2 aClass137_Sub2_2 = null;

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "[Lclient!wv;")
	public Class137_Sub1[] aClass137_Sub1Array1 = null;

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "[Lclient!wv;")
	public Class137_Sub1[] aClass137_Sub1Array2 = null;

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "Lclient!lj;")
	public Class137_Sub2 aClass137_Sub2_3 = null;

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "Z")
	public final boolean aBoolean215;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!nq;)V")
	public Class100(@OriginalArg(0) Class167_Sub1 arg0) {
		this.aBoolean215 = arg0.aBoolean348;
		Static291.method4182(arg0);
		if (this.aBoolean215) {
			@Pc(33) byte[] local33 = Static237.method3446(Static247.anObject10, false);
			this.aClass137_Sub2_2 = new Class137_Sub2(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static237.method3446(Static315.anObject8, false);
			this.aClass137_Sub2_1 = new Class137_Sub2(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class205 local65 = arg0.aClass205_1;
			if (local65.method4878()) {
				local33 = Static237.method3446(Static119.anObject2, false);
				this.aClass137_Sub2_3 = new Class137_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(95) Class137_Sub2 local95 = new Class137_Sub2(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method4877(local95, this.aClass137_Sub2_3, 2.0F)) {
					this.aClass137_Sub2_3.method5782();
				} else {
					this.aClass137_Sub2_3.method5779();
					this.aClass137_Sub2_3 = null;
				}
				local95.method5779();
				return;
			}
		} else {
			this.aClass137_Sub1Array1 = new Class137_Sub1[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(141) byte[] local141 = Static180.method2856(128 * 128 * local127 * 2, Static247.anObject10);
				this.aClass137_Sub1Array1[local127] = new Class137_Sub1(arg0, 3553, 6410, 128, 128, true, local141, 6410, false);
			}
			this.aClass137_Sub1Array2 = new Class137_Sub1[16];
			for (@Pc(169) int local169 = 0; local169 < 16; local169++) {
				@Pc(179) byte[] local179 = Static180.method2856(local169 * 32768, Static315.anObject8);
				this.aClass137_Sub1Array2[local169] = new Class137_Sub1(arg0, 3553, 6410, 128, 128, true, local179, 6410, false);
			}
		}
	}
}
