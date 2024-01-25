import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!maa")
public final class Class80_Sub4 extends Class80 {

	@OriginalMember(owner = "client!maa", name = "u", descriptor = "I")
	private int anInt6515 = -1;

	@OriginalMember(owner = "client!maa", name = "D", descriptor = "I")
	private int anInt6520 = -1;

	@OriginalMember(owner = "client!maa", name = "y", descriptor = "I")
	public final int anInt6519;

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lclient!ck;IIZ[[BI)V")
	public Class80_Sub4(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt6519 = arg2;
		super.aClass65_Sub1_32.method1286(this);
		for (@Pc(26) int local26 = 0; local26 < 6; local26++) {
			OpenGL.glTexImage2Dub(local26 + 34069, 0, super.anInt8332, arg2, arg2, 0, arg5, 5121, arg4[local26], 0);
		}
		this.method7142(true);
	}

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lclient!ck;II)V")
	public Class80_Sub4(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt6519 = arg2;
		super.aClass65_Sub1_32.method1286(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt8332, arg2, arg2, 0, Static149.method2714(super.anInt8332), 5121, (byte[]) null, 0);
		}
		this.method7142(true);
	}

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lclient!ck;IIZ[[I)V")
	public Class80_Sub4(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt6519 = arg2;
		super.aClass65_Sub1_32.method1286(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static361.method5432(super.anInt8332, arg2, local30 + 34069, super.aClass65_Sub1_32.anInt1410, arg4[local30], arg2);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt8332, arg2, arg2, 0, 32993, super.aClass65_Sub1_32.anInt1410, arg4[local30], 0);
			}
		}
		this.method7142(true);
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)V")
	@Override
	public void method7433() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt6520, this.anInt6515, 3553, 0, 0);
		this.anInt6520 = -1;
		this.anInt6515 = -1;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IBIII)V")
	public void method5430(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg2, arg0, super.anInt8337, 0);
		this.anInt6520 = arg1;
		this.anInt6515 = arg2;
	}
}
