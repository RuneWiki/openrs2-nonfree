import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class70_Sub2 extends Class70 {

	@OriginalMember(owner = "client!g", name = "j", descriptor = "I")
	private int anInt2162;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "I")
	public final int anInt2161;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!ql;IIZ[[I)V")
	public Class70_Sub2(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass92_Sub2_15.anOpengl2;
		this.anInt2161 = arg2;
		this.aClass92_Sub2_15.method4548(this);
		@Pc(25) int local25;
		if (arg3) {
			for (local25 = 0; local25 < 6; local25++) {
				Static201.method1978(local14, local25 + 34069, this.anInt2349, arg2, arg2, this.aClass92_Sub2_15.anInt5410, arg4[local25]);
			}
		} else {
			for (local25 = 0; local25 < 6; local25++) {
				local14.glTexImage2D(local25 + 34069, 0, this.anInt2349, arg2, arg2, 0, 32993, this.aClass92_Sub2_15.anInt5410, IntBuffer.wrap(arg4[local25]));
			}
		}
		this.method1989(true);
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!ql;II)V")
	public Class70_Sub2(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		@Pc(14) opengl local14 = this.aClass92_Sub2_15.anOpengl2;
		this.anInt2161 = arg2;
		this.aClass92_Sub2_15.method4548(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt2349, arg2, arg2, 0, 32993, this.aClass92_Sub2_15.anInt5410, null);
		}
		this.method1989(true);
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!ql;IIZ[[BI)V")
	public Class70_Sub2(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass92_Sub2_15.anOpengl2;
		this.anInt2161 = arg2;
		this.aClass92_Sub2_15.method4548(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt2349, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[local23]));
		}
		this.method1989(true);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(III)V")
	public void method1753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass92_Sub2_15.anOpengl2.glFramebufferTexture2DEXT(36160, arg0, arg1, this.anInt2352, 0);
		this.anInt2162 = arg0;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "()V")
	@Override
	public void method5489() {
		this.aClass92_Sub2_15.anOpengl2.glFramebufferTexture2DEXT(36160, this.anInt2162, 3553, 0, 0);
		this.anInt2162 = -1;
	}
}
