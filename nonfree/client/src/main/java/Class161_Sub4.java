import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class161_Sub4 extends Class161 {

	@OriginalMember(owner = "client!vr", name = "x", descriptor = "I")
	private int anInt10755 = -1;

	@OriginalMember(owner = "client!vr", name = "v", descriptor = "I")
	private int anInt10754 = -1;

	@OriginalMember(owner = "client!vr", name = "y", descriptor = "I")
	public final int anInt10753;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lclient!pi;IIZ[[I)V")
	public Class161_Sub4(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt10753 = arg2;
		super.aClass144_Sub3_42.method6982(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static518.method7672(super.aClass144_Sub3_42.anInt8089, super.anInt10745, arg2, arg4[local30], arg2, local30 + 34069);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt10745, arg2, arg2, 0, 32993, super.aClass144_Sub3_42.anInt8089, arg4[local30], 0);
			}
		}
		this.method9173(true);
	}

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lclient!pi;II)V")
	public Class161_Sub4(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt10753 = arg2;
		super.aClass144_Sub3_42.method6982(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt10745, arg2, arg2, 0, Static30.method478(super.anInt10745), 5121, (byte[]) null, 0);
		}
		this.method9173(true);
	}

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lclient!pi;IIZ[[BI)V")
	public Class161_Sub4(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt10753 = arg2;
		super.aClass144_Sub3_42.method6982(this);
		for (@Pc(26) int local26 = 0; local26 < 6; local26++) {
			OpenGL.glTexImage2Dub(local26 + 34069, 0, super.anInt10745, arg2, arg2, 0, arg5, 5121, arg4[local26], 0);
		}
		this.method9173(true);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V")
	@Override
	public void method9166() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt10754, this.anInt10755, 3553, 0, 0);
		this.anInt10754 = -1;
		this.anInt10755 = -1;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIII)V")
	public void method9177(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, arg2, super.anInt10748, 0);
		this.anInt10754 = arg0;
		this.anInt10755 = arg1;
	}
}
