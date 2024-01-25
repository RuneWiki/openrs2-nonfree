import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class52_Sub4 extends Class52 {

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
	private int anInt6688;

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
	public final int anInt6687;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!ig;IIZ[[BI)V")
	public Class52_Sub4(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass47_Sub2_42.anOpengl2;
		this.anInt6687 = arg2;
		this.aClass47_Sub2_42.method2772(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt6684, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[local23]));
		}
		this.method5604(true);
	}

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!ig;II)V")
	public Class52_Sub4(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		@Pc(14) opengl local14 = this.aClass47_Sub2_42.anOpengl2;
		this.anInt6687 = arg2;
		this.aClass47_Sub2_42.method2772(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt6684, arg2, arg2, 0, 32993, this.aClass47_Sub2_42.anInt3095, null);
		}
		this.method5604(true);
	}

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!ig;IIZ[[I)V")
	public Class52_Sub4(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass47_Sub2_42.anOpengl2;
		this.anInt6687 = arg2;
		this.aClass47_Sub2_42.method2772(this);
		@Pc(25) int local25;
		if (arg3) {
			for (local25 = 0; local25 < 6; local25++) {
				Static71.method5609(local14, local25 + 34069, this.anInt6684, arg2, arg2, this.aClass47_Sub2_42.anInt3095, arg4[local25]);
			}
		} else {
			for (local25 = 0; local25 < 6; local25++) {
				local14.glTexImage2D(local25 + 34069, 0, this.anInt6684, arg2, arg2, 0, 32993, this.aClass47_Sub2_42.anInt3095, IntBuffer.wrap(arg4[local25]));
			}
		}
		this.method5604(true);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)V")
	public void method5616(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass47_Sub2_42.anOpengl2.glFramebufferTexture2DEXT(36160, arg0, arg1, this.anInt6683, 0);
		this.anInt6688 = arg0;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "()V")
	@Override
	public void method5602() {
		this.aClass47_Sub2_42.anOpengl2.glFramebufferTexture2DEXT(36160, this.anInt6688, 3553, 0, 0);
		this.anInt6688 = -1;
	}
}
