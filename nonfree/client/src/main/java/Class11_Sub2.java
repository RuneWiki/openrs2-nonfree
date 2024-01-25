import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
	private int anInt528;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	public final int anInt529;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!po;II)V")
	public Class11_Sub2(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		@Pc(14) opengl local14 = this.aClass59_Sub1_30.anOpengl2;
		this.anInt529 = arg2;
		this.aClass59_Sub1_30.method4296(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt3900, arg2, arg2, 0, 32993, this.aClass59_Sub1_30.anInt4791, null);
		}
		this.method3575(true);
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!po;IIZ[[I)V")
	public Class11_Sub2(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass59_Sub1_30.anOpengl2;
		this.anInt529 = arg2;
		this.aClass59_Sub1_30.method4296(this);
		@Pc(25) int local25;
		if (arg3) {
			for (local25 = 0; local25 < 6; local25++) {
				Static89.method3582(local14, local25 + 34069, this.anInt3900, arg2, arg2, this.aClass59_Sub1_30.anInt4791, arg4[local25]);
			}
		} else {
			for (local25 = 0; local25 < 6; local25++) {
				local14.glTexImage2D(local25 + 34069, 0, this.anInt3900, arg2, arg2, 0, 32993, this.aClass59_Sub1_30.anInt4791, IntBuffer.wrap(arg4[local25]));
			}
		}
		this.method3575(true);
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!po;IIZ[[BI)V")
	public Class11_Sub2(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass59_Sub1_30.anOpengl2;
		this.anInt529 = arg2;
		this.aClass59_Sub1_30.method4296(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt3900, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[local23]));
		}
		this.method3575(true);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "()V")
	@Override
	public void method5524() {
		this.aClass59_Sub1_30.anOpengl2.glFramebufferTexture2DEXT(36160, this.anInt528, 3553, 0, 0);
		this.anInt528 = -1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)V")
	public void method544(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass59_Sub1_30.anOpengl2.glFramebufferTexture2DEXT(36160, arg0, arg1, this.anInt3901, 0);
		this.anInt528 = arg0;
	}
}
