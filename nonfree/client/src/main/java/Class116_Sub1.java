import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hfa")
public final class Class116_Sub1 extends Class116 {

	@OriginalMember(owner = "client!hfa", name = "F", descriptor = "I")
	private int anInt3521 = -1;

	@OriginalMember(owner = "client!hfa", name = "G", descriptor = "I")
	private int anInt3522 = -1;

	@OriginalMember(owner = "client!hfa", name = "H", descriptor = "I")
	public final int anInt3523;

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Lclient!pc;II)V")
	public Class116_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt3523 = arg2;
		super.aClass33_Sub3_36.method6340(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9737, arg2, arg2, 0, Static310.method4319(super.anInt9737), 5121, (byte[]) null, 0);
		}
		this.method8346(true);
	}

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Lclient!pc;IIZ[[I)V")
	public Class116_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt3523 = arg2;
		super.aClass33_Sub3_36.method6340(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static458.method6400(arg4[local30], super.aClass33_Sub3_36.anInt7281, arg2, arg2, super.anInt9737, local30 + 34069);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt9737, arg2, arg2, 0, 32993, super.aClass33_Sub3_36.anInt7281, arg4[local30], 0);
			}
		}
		this.method8346(true);
	}

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Lclient!pc;IIZ[[BI)V")
	public Class116_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt3523 = arg2;
		super.aClass33_Sub3_36.method6340(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9737, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method8346(true);
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V")
	@Override
	public void method8676() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt3522, this.anInt3521, 3553, 0, 0);
		this.anInt3522 = -1;
		this.anInt3521 = -1;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIIII)V")
	public void method3245(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg2, arg1, super.anInt9729, 0);
		this.anInt3522 = arg0;
		this.anInt3521 = arg2;
	}
}
