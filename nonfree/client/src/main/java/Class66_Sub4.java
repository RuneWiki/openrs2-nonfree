import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class66_Sub4 extends Class66 {

	@OriginalMember(owner = "client!qba", name = "t", descriptor = "I")
	private int anInt8232 = -1;

	@OriginalMember(owner = "client!qba", name = "z", descriptor = "I")
	private int anInt8237 = -1;

	@OriginalMember(owner = "client!qba", name = "v", descriptor = "I")
	public final int anInt8233;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lclient!qfa;IIZ[[BI)V")
	public Class66_Sub4(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt8233 = arg2;
		super.aClass137_Sub3_36.method7090(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt8228, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method6848(true);
	}

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lclient!qfa;II)V")
	public Class66_Sub4(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt8233 = arg2;
		super.aClass137_Sub3_36.method7090(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt8228, arg2, arg2, 0, Static679.method9322(super.anInt8228), 5121, (byte[]) null, 0);
		}
		this.method6848(true);
	}

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lclient!qfa;IIZ[[I)V")
	public Class66_Sub4(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt8233 = arg2;
		super.aClass137_Sub3_36.method7090(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static27.method612(arg2, local30 + 34069, arg2, super.aClass137_Sub3_36.anInt8556, arg4[local30], super.anInt8228);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt8228, arg2, arg2, 0, 32993, super.aClass137_Sub3_36.anInt8556, arg4[local30], 0);
			}
		}
		this.method6848(true);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V")
	@Override
	public void method6844() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt8237, this.anInt8232, 3553, 0, 0);
		this.anInt8237 = -1;
		this.anInt8232 = -1;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIZII)V")
	public void method6856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg0, arg1, super.anInt8224, 0);
		this.anInt8237 = arg2;
		this.anInt8232 = arg0;
	}
}
