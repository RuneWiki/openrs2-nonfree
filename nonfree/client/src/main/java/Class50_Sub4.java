import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class50_Sub4 extends Class50 {

	@OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
	private int anInt7846 = -1;

	@OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
	private int anInt7848 = -1;

	@OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
	public final int anInt7847;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!er;IIZ[[BI)V")
	public Class50_Sub4(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt7847 = arg2;
		super.aClass31_Sub2_37.method2535(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt7828, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method6153(true);
	}

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!er;IIZ[[I)V")
	public Class50_Sub4(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt7847 = arg2;
		super.aClass31_Sub2_37.method2535(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static188.method3314(arg4[local30], arg2, super.anInt7828, arg2, local30 + 34069, super.aClass31_Sub2_37.anInt3152);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt7828, arg2, arg2, 0, 32993, super.aClass31_Sub2_37.anInt3152, arg4[local30], 0);
			}
		}
		this.method6153(true);
	}

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!er;II)V")
	public Class50_Sub4(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt7847 = arg2;
		super.aClass31_Sub2_37.method2535(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt7828, arg2, arg2, 0, Static393.method5568(super.anInt7828), 5121, null, 0);
		}
		this.method6153(true);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
	@Override
	public void method6150() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt7848, this.anInt7846, 3553, 0, 0);
		this.anInt7848 = -1;
		this.anInt7846 = -1;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IBIII)V")
	public void method6163(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, arg2, super.anInt7832, 0);
		this.anInt7848 = arg0;
		this.anInt7846 = arg1;
	}
}
