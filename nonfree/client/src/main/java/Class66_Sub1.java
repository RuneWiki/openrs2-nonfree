import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class66_Sub1 extends Class66 implements Interface8 {

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!pi;IZ[[I)V")
	public Class66_Sub1(@OriginalArg(0) Class42_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static306.aClass72_5, Static155.aClass114_6, arg1 * 6 * arg1, arg2);
		super.aClass42_Sub1_Sub2_9.method5868(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method6978(arg3[local22], arg1, local22 + 34069, arg1);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method6976(), arg1, arg1, 0, Static37.method6278(super.aClass72_14), super.aClass42_Sub1_Sub2_9.anInt7221, arg3[local22], 0);
			}
		}
	}
}
