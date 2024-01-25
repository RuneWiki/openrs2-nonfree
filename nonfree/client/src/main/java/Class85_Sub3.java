import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class85_Sub3 extends Class85 {

	@OriginalMember(owner = "client!q", name = "w", descriptor = "I")
	private int anInt8235 = -1;

	@OriginalMember(owner = "client!q", name = "x", descriptor = "I")
	private int anInt8236 = -1;

	@OriginalMember(owner = "client!q", name = "z", descriptor = "I")
	public final int anInt8238;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!qo;II)V")
	public Class85_Sub3(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt8238 = arg2;
		super.aClass20_Sub3_41.method7358(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt10899, arg2, arg2, 0, Static206.method4083(super.anInt10899), 5121, null, 0);
		}
		this.method9102(true);
	}

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!qo;IIZ[[BI)V")
	public Class85_Sub3(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt8238 = arg2;
		super.aClass20_Sub3_41.method7358(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt10899, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method9102(true);
	}

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!qo;IIZ[[I)V")
	public Class85_Sub3(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt8238 = arg2;
		super.aClass20_Sub3_41.method7358(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static131.method3025(local30 + 34069, super.anInt10899, arg2, super.aClass20_Sub3_41.anInt8801, arg2, arg4[local30]);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt10899, arg2, arg2, 0, 32993, super.aClass20_Sub3_41.anInt8801, arg4[local30], 0);
			}
		}
		this.method9102(true);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIII)V")
	public void method7021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg2, arg1, super.anInt10900, 0);
		this.anInt8236 = arg0;
		this.anInt8235 = arg2;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	@Override
	public void method9094() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt8236, this.anInt8235, 3553, 0, 0);
		this.anInt8235 = -1;
		this.anInt8236 = -1;
	}
}
