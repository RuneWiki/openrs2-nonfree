import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class13_Sub4 extends Class13 {

	@OriginalMember(owner = "client!il", name = "z", descriptor = "I")
	private int anInt3216 = -1;

	@OriginalMember(owner = "client!il", name = "D", descriptor = "I")
	private int anInt3218 = -1;

	@OriginalMember(owner = "client!il", name = "x", descriptor = "I")
	public final int anInt3214;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!ht;IIZ[[BI)V")
	public Class13_Sub4(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt3214 = arg2;
		super.aClass109_Sub1_22.method2578(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt3197, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method2745(true);
	}

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!ht;II)V")
	public Class13_Sub4(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt3214 = arg2;
		super.aClass109_Sub1_22.method2578(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt3197, arg2, arg2, 0, Static315.method4741(super.anInt3197), 5121, null, 0);
		}
		this.method2745(true);
	}

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!ht;IIZ[[I)V")
	public Class13_Sub4(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt3214 = arg2;
		super.aClass109_Sub1_22.method2578(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static148.method2221(super.aClass109_Sub1_22.anInt3010, super.anInt3197, local30 + 34069, arg2, arg4[local30], arg2);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt3197, arg2, arg2, 0, 32993, super.aClass109_Sub1_22.anInt3010, arg4[local30], 0);
			}
		}
		this.method2745(true);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IBIII)V")
	public void method2752(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg0, arg1, super.anInt3202, 0);
		this.anInt3216 = arg0;
		this.anInt3218 = arg2;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
	@Override
	public void method4467() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt3218, this.anInt3216, 3553, 0, 0);
		this.anInt3216 = -1;
		this.anInt3218 = -1;
	}
}
