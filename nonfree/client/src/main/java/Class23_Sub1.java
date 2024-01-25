import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!aw", name = "z", descriptor = "I")
	private int anInt335 = -1;

	@OriginalMember(owner = "client!aw", name = "C", descriptor = "I")
	private int anInt338 = -1;

	@OriginalMember(owner = "client!aw", name = "w", descriptor = "I")
	public final int anInt333;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!ih;IIZ[[BI)V")
	public Class23_Sub1(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt333 = arg2;
		super.aClass117_Sub1_42.method2504(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt7166, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method5805(true);
	}

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!ih;IIZ[[I)V")
	public Class23_Sub1(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt333 = arg2;
		super.aClass117_Sub1_42.method2504(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static206.method2990(local30 + 34069, arg4[local30], arg2, arg2, super.aClass117_Sub1_42.anInt3134, super.anInt7166);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt7166, arg2, arg2, 0, 32993, super.aClass117_Sub1_42.anInt3134, arg4[local30], 0);
			}
		}
		this.method5805(true);
	}

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!ih;II)V")
	public Class23_Sub1(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt333 = arg2;
		super.aClass117_Sub1_42.method2504(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt7166, arg2, arg2, 0, Static19.method304(super.anInt7166), 5121, null, 0);
		}
		this.method5805(true);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIII)V")
	public void method336(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg2, arg1, super.anInt7153, 0);
		this.anInt338 = arg0;
		this.anInt335 = arg2;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
	@Override
	public void method5797() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt338, this.anInt335, 3553, 0, 0);
		this.anInt335 = -1;
		this.anInt338 = -1;
	}
}
