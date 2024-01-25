import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class56_Sub1 extends Class56 {

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
	private int anInt1225;

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
	public final int anInt1226;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!tb;II)V")
	public Class56_Sub1(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		@Pc(14) opengl local14 = this.aClass129_Sub2_26.anOpengl2;
		this.anInt1226 = arg2;
		this.aClass129_Sub2_26.method5084(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt3011, arg2, arg2, 0, 32993, this.aClass129_Sub2_26.anInt5892, null);
		}
		this.method2542(true);
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!tb;IIZ[[I)V")
	public Class56_Sub1(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass129_Sub2_26.anOpengl2;
		this.anInt1226 = arg2;
		this.aClass129_Sub2_26.method5084(this);
		@Pc(25) int local25;
		if (arg3) {
			for (local25 = 0; local25 < 6; local25++) {
				Static317.method2544(local14, local25 + 34069, this.anInt3011, arg2, arg2, this.aClass129_Sub2_26.anInt5892, arg4[local25]);
			}
		} else {
			for (local25 = 0; local25 < 6; local25++) {
				local14.glTexImage2D(local25 + 34069, 0, this.anInt3011, arg2, arg2, 0, 32993, this.aClass129_Sub2_26.anInt5892, IntBuffer.wrap(arg4[local25]));
			}
		}
		this.method2542(true);
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!tb;IIZ[[BI)V")
	public Class56_Sub1(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass129_Sub2_26.anOpengl2;
		this.anInt1226 = arg2;
		this.aClass129_Sub2_26.method5084(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt3011, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[local23]));
		}
		this.method2542(true);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)V")
	public void method975(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass129_Sub2_26.anOpengl2.glFramebufferTexture2DEXT(36160, arg0, arg1, this.anInt3009, 0);
		this.anInt1225 = arg0;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "()V")
	@Override
	public void method5673() {
		this.aClass129_Sub2_26.anOpengl2.glFramebufferTexture2DEXT(36160, this.anInt1225, 3553, 0, 0);
		this.anInt1225 = -1;
	}
}
