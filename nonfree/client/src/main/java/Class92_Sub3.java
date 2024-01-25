import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class92_Sub3 extends Class92 {

	@OriginalMember(owner = "client!m", name = "j", descriptor = "I")
	private int anInt3843;

	@OriginalMember(owner = "client!m", name = "i", descriptor = "I")
	public final int anInt3842;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!hd;IIZ[[I)V")
	public Class92_Sub3(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass89_Sub1_30.anOpengl2;
		this.anInt3842 = arg2;
		this.aClass89_Sub1_30.method2445(this);
		@Pc(25) int local25;
		if (arg3) {
			for (local25 = 0; local25 < 6; local25++) {
				Static332.method3520(local14, local25 + 34069, this.anInt3877, arg2, arg2, this.aClass89_Sub1_30.anInt2640, arg4[local25]);
			}
		} else {
			for (local25 = 0; local25 < 6; local25++) {
				local14.glTexImage2D(local25 + 34069, 0, this.anInt3877, arg2, arg2, 0, 32993, this.aClass89_Sub1_30.anInt2640, IntBuffer.wrap(arg4[local25]));
			}
		}
		this.method3517(true);
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!hd;II)V")
	public Class92_Sub3(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		@Pc(14) opengl local14 = this.aClass89_Sub1_30.anOpengl2;
		this.anInt3842 = arg2;
		this.aClass89_Sub1_30.method2445(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt3877, arg2, arg2, 0, 32993, this.aClass89_Sub1_30.anInt2640, null);
		}
		this.method3517(true);
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!hd;IIZ[[BI)V")
	public Class92_Sub3(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass89_Sub1_30.anOpengl2;
		this.anInt3842 = arg2;
		this.aClass89_Sub1_30.method2445(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt3877, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[local23]));
		}
		this.method3517(true);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V")
	public void method3483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass89_Sub1_30.anOpengl2.glFramebufferTexture2DEXT(36160, arg0, arg1, this.anInt3878, 0);
		this.anInt3843 = arg0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "()V")
	@Override
	public void method4829() {
		this.aClass89_Sub1_30.anOpengl2.glFramebufferTexture2DEXT(36160, this.anInt3843, 3553, 0, 0);
		this.anInt3843 = -1;
	}
}
