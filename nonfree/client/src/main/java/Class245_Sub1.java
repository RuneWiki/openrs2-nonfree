import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class245_Sub1 extends Class245 {

	@OriginalMember(owner = "client!mr", name = "D", descriptor = "I")
	private int anInt7221 = -1;

	@OriginalMember(owner = "client!mr", name = "y", descriptor = "I")
	private int anInt7223 = -1;

	@OriginalMember(owner = "client!mr", name = "x", descriptor = "I")
	public final int anInt7222;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!gia;II)V")
	public Class245_Sub1(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt7222 = arg2;
		super.aClass67_Sub2_40.method3234(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt10366, arg2, arg2, 0, Static668.method2973(super.anInt10366), 5121, (byte[]) null, 0);
		}
		this.method8672(true);
	}

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!gia;IIZ[[I)V")
	public Class245_Sub1(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt7222 = arg2;
		super.aClass67_Sub2_40.method3234(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static25.method374(arg4[local30], local30 + 34069, super.anInt10366, arg2, super.aClass67_Sub2_40.anInt3899, arg2);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt10366, arg2, arg2, 0, 32993, super.aClass67_Sub2_40.anInt3899, arg4[local30], 0);
			}
		}
		this.method8672(true);
	}

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!gia;IIZ[[BI)V")
	public Class245_Sub1(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt7222 = arg2;
		super.aClass67_Sub2_40.method3234(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt10366, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method8672(true);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIIII)V")
	public void method6047(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg1, arg0, super.anInt10370, 0);
		this.anInt7223 = arg1;
		this.anInt7221 = arg2;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
	@Override
	public void method8671() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt7221, this.anInt7223, 3553, 0, 0);
		this.anInt7221 = -1;
		this.anInt7223 = -1;
	}
}
