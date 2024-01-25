import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class66_Sub4 extends Class66 {

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
	private int anInt4755;

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
	public final int anInt4756;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!se;IIZ[[I)V")
	public Class66_Sub4(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass122_Sub2_35.anOpengl2;
		this.anInt4756 = arg2;
		this.aClass122_Sub2_35.method4864(this);
		@Pc(25) int local25;
		if (arg3) {
			for (local25 = 0; local25 < 6; local25++) {
				Static101.method4043(local14, local25 + 34069, this.anInt4753, arg2, arg2, this.aClass122_Sub2_35.anInt5642, arg4[local25]);
			}
		} else {
			for (local25 = 0; local25 < 6; local25++) {
				local14.glTexImage2D(local25 + 34069, 0, this.anInt4753, arg2, arg2, 0, 32993, this.aClass122_Sub2_35.anInt5642, IntBuffer.wrap(arg4[local25]));
			}
		}
		this.method4044(true);
	}

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!se;IIZ[[BI)V")
	public Class66_Sub4(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass122_Sub2_35.anOpengl2;
		this.anInt4756 = arg2;
		this.aClass122_Sub2_35.method4864(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt4753, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[local23]));
		}
		this.method4044(true);
	}

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!se;II)V")
	public Class66_Sub4(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		@Pc(14) opengl local14 = this.aClass122_Sub2_35.anOpengl2;
		this.anInt4756 = arg2;
		this.aClass122_Sub2_35.method4864(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt4753, arg2, arg2, 0, 32993, this.aClass122_Sub2_35.anInt5642, null);
		}
		this.method4044(true);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V")
	public void method4051(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass122_Sub2_35.anOpengl2.glFramebufferTexture2DEXT(36160, arg0, arg1, this.anInt4751, 0);
		this.anInt4755 = arg0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "()V")
	@Override
	public void method4037() {
		this.aClass122_Sub2_35.anOpengl2.glFramebufferTexture2DEXT(36160, this.anInt4755, 3553, 0, 0);
		this.anInt4755 = -1;
	}
}
