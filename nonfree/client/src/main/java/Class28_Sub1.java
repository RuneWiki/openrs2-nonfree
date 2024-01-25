import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
	private int anInt645;

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
	public final int anInt644;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!ge;IIZ[[I)V")
	public Class28_Sub1(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass81_Sub1_26.anOpengl1;
		this.anInt644 = arg2;
		this.aClass81_Sub1_26.method2022(this);
		@Pc(25) int local25;
		if (arg3) {
			for (local25 = 0; local25 < 6; local25++) {
				Static199.method4121(local14, local25 + 34069, this.anInt4319, arg2, arg2, this.aClass81_Sub1_26.anInt1832, arg4[local25]);
			}
		} else {
			for (local25 = 0; local25 < 6; local25++) {
				local14.glTexImage2D(local25 + 34069, 0, this.anInt4319, arg2, arg2, 0, 32993, this.aClass81_Sub1_26.anInt1832, IntBuffer.wrap(arg4[local25]));
			}
		}
		this.method4124(true);
	}

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!ge;II)V")
	public Class28_Sub1(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		@Pc(14) opengl local14 = this.aClass81_Sub1_26.anOpengl1;
		this.anInt644 = arg2;
		this.aClass81_Sub1_26.method2022(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt4319, arg2, arg2, 0, 32993, this.aClass81_Sub1_26.anInt1832, null);
		}
		this.method4124(true);
	}

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!ge;IIZ[[BI)V")
	public Class28_Sub1(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass81_Sub1_26.anOpengl1;
		this.anInt644 = arg2;
		this.aClass81_Sub1_26.method2022(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt4319, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[local23]));
		}
		this.method4124(true);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V")
	public void method556(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass81_Sub1_26.anOpengl1.glFramebufferTexture2DEXT(36160, arg0, arg1, this.anInt4317, 0);
		this.anInt645 = arg0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "()V")
	@Override
	public void method4114() {
		this.aClass81_Sub1_26.anOpengl1.glFramebufferTexture2DEXT(36160, this.anInt645, 3553, 0, 0);
		this.anInt645 = -1;
	}
}
