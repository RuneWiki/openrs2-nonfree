import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
	private int anInt627;

	@OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
	public final int anInt628;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!fu;IIZ[[BI)V")
	public Class20_Sub1(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass63_Sub2_42.anOpengl2;
		this.anInt628 = arg2;
		this.aClass63_Sub2_42.method2068(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt6334, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[local23]));
		}
		this.method5502(true);
	}

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!fu;IIZ[[I)V")
	public Class20_Sub1(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass63_Sub2_42.anOpengl2;
		this.anInt628 = arg2;
		this.aClass63_Sub2_42.method2068(this);
		@Pc(25) int local25;
		if (arg3) {
			for (local25 = 0; local25 < 6; local25++) {
				Static336.method5499(local14, local25 + 34069, this.anInt6334, arg2, arg2, this.aClass63_Sub2_42.anInt2099, arg4[local25]);
			}
		} else {
			for (local25 = 0; local25 < 6; local25++) {
				local14.glTexImage2D(local25 + 34069, 0, this.anInt6334, arg2, arg2, 0, 32993, this.aClass63_Sub2_42.anInt2099, IntBuffer.wrap(arg4[local25]));
			}
		}
		this.method5502(true);
	}

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!fu;II)V")
	public Class20_Sub1(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		@Pc(14) opengl local14 = this.aClass63_Sub2_42.anOpengl2;
		this.anInt628 = arg2;
		this.aClass63_Sub2_42.method2068(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt6334, arg2, arg2, 0, 32993, this.aClass63_Sub2_42.anInt2099, null);
		}
		this.method5502(true);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "()V")
	@Override
	public void method5494() {
		this.aClass63_Sub2_42.anOpengl2.glFramebufferTexture2DEXT(36160, this.anInt627, 3553, 0, 0);
		this.anInt627 = -1;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V")
	public void method541(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass63_Sub2_42.anOpengl2.glFramebufferTexture2DEXT(36160, arg0, arg1, this.anInt6332, 0);
		this.anInt627 = arg0;
	}
}
