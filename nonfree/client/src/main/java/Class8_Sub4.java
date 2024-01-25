import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class8_Sub4 extends Class8 {

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
	private int anInt5322;

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
	public final int anInt5321;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!sq;II)V")
	public Class8_Sub4(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		@Pc(14) opengl local14 = this.aClass46_Sub2_32.anOpengl1;
		this.anInt5321 = arg2;
		this.aClass46_Sub2_32.method5251(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt5319, arg2, arg2, 0, 32993, this.aClass46_Sub2_32.anInt5767, null);
		}
		this.method4741(true);
	}

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!sq;IIZ[[I)V")
	public Class8_Sub4(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass46_Sub2_32.anOpengl1;
		this.anInt5321 = arg2;
		this.aClass46_Sub2_32.method5251(this);
		@Pc(25) int local25;
		if (arg3) {
			for (local25 = 0; local25 < 6; local25++) {
				Static225.method4732(local14, local25 + 34069, this.anInt5319, arg2, arg2, this.aClass46_Sub2_32.anInt5767, arg4[local25]);
			}
		} else {
			for (local25 = 0; local25 < 6; local25++) {
				local14.glTexImage2D(local25 + 34069, 0, this.anInt5319, arg2, arg2, 0, 32993, this.aClass46_Sub2_32.anInt5767, IntBuffer.wrap(arg4[local25]));
			}
		}
		this.method4741(true);
	}

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!sq;IIZ[[BI)V")
	public Class8_Sub4(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass46_Sub2_32.anOpengl1;
		this.anInt5321 = arg2;
		this.aClass46_Sub2_32.method5251(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt5319, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[local23]));
		}
		this.method4741(true);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "()V")
	@Override
	public void method4731() {
		this.aClass46_Sub2_32.anOpengl1.glFramebufferTexture2DEXT(36160, this.anInt5322, 3553, 0, 0);
		this.anInt5322 = -1;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V")
	public void method4745(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass46_Sub2_32.anOpengl1.glFramebufferTexture2DEXT(36160, arg0, arg1, this.anInt5317, 0);
		this.anInt5322 = arg0;
	}
}
