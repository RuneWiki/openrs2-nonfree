import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class8_Sub3 extends Class8 {

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
	private int anInt5158;

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
	public final int anInt5157;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!bf;II)V", line = 9)
	public Class8_Sub3(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		@Pc(14) opengl local14 = this.aClass19_Sub1_40.anOpengl1;
		this.anInt5157 = arg2;
		this.aClass19_Sub1_40.method848(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt6870, arg2, arg2, 0, 32993, this.aClass19_Sub1_40.anInt592, null);
		}
		this.method6161(true);
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!bf;IIZ[[BI)V", line = 28)
	public Class8_Sub3(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass19_Sub1_40.anOpengl1;
		this.anInt5157 = arg2;
		this.aClass19_Sub1_40.method848(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt6870, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[local23]));
		}
		this.method6161(true);
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!bf;IIZ[[I)V", line = 50)
	public Class8_Sub3(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass19_Sub1_40.anOpengl1;
		this.anInt5157 = arg2;
		this.aClass19_Sub1_40.method848(this);
		@Pc(25) int local25;
		if (arg3) {
			for (local25 = 0; local25 < 6; local25++) {
				Static381.method6165(local14, local25 + 34069, this.anInt6870, arg2, arg2, this.aClass19_Sub1_40.anInt592, arg4[local25]);
			}
		} else {
			for (local25 = 0; local25 < 6; local25++) {
				local14.glTexImage2D(local25 + 34069, 0, this.anInt6870, arg2, arg2, 0, 32993, this.aClass19_Sub1_40.anInt592, IntBuffer.wrap(arg4[local25]));
			}
		}
		this.method6161(true);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "()V", line = 24)
	@Override
	public void method6153() {
		this.aClass19_Sub1_40.anOpengl1.glFramebufferTexture2DEXT(36160, this.anInt5158, 3553, 0, 0);
		this.anInt5158 = -1;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V", line = 45)
	public void method4741(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass19_Sub1_40.anOpengl1.glFramebufferTexture2DEXT(36160, arg0, arg1, this.anInt6868, 0);
		this.anInt5158 = arg0;
	}
}
