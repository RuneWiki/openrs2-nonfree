import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class44_Sub3 extends Class44 {

	@OriginalMember(owner = "client!mu", name = "G", descriptor = "I")
	private int anInt6609 = -1;

	@OriginalMember(owner = "client!mu", name = "B", descriptor = "I")
	private int anInt6606 = -1;

	@OriginalMember(owner = "client!mu", name = "A", descriptor = "I")
	public final int anInt6605;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!kv;IIZ[[I)V")
	public Class44_Sub3(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt6605 = arg2;
		super.aClass143_Sub2_32.method4945(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static98.method1637(arg4[local30], local30 + 34069, arg2, arg2, super.anInt7885, super.aClass143_Sub2_32.anInt5857);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt7885, arg2, arg2, 0, 32993, super.aClass143_Sub2_32.anInt5857, arg4[local30], 0);
			}
		}
		this.method6706(true);
	}

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!kv;II)V")
	public Class44_Sub3(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt6605 = arg2;
		super.aClass143_Sub2_32.method4945(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt7885, arg2, arg2, 0, Static423.method6426(super.anInt7885), 5121, (byte[]) null, 0);
		}
		this.method6706(true);
	}

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!kv;IIZ[[BI)V")
	public Class44_Sub3(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt6605 = arg2;
		super.aClass143_Sub2_32.method4945(this);
		for (@Pc(26) int local26 = 0; local26 < 6; local26++) {
			OpenGL.glTexImage2Dub(local26 + 34069, 0, super.anInt7885, arg2, arg2, 0, arg5, 5121, arg4[local26], 0);
		}
		this.method6706(true);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIB)V")
	public void method5571(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, arg2, super.anInt7886, 0);
		this.anInt6609 = arg0;
		this.anInt6606 = arg1;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V")
	@Override
	public void method6695() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt6609, this.anInt6606, 3553, 0, 0);
		this.anInt6609 = -1;
		this.anInt6606 = -1;
	}
}
