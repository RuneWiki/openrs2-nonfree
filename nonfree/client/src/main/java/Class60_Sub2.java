import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class60_Sub2 extends Class60 {

	@OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
	private int anInt1839;

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
	public final int anInt1838;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!mm;II)V")
	public Class60_Sub2(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		@Pc(14) opengl local14 = this.aClass55_Sub1_40.anOpengl1;
		this.anInt1838 = arg2;
		this.aClass55_Sub1_40.method3677(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt6570, arg2, arg2, 0, 32993, this.aClass55_Sub1_40.anInt4012, null);
		}
		this.method5836(true);
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!mm;IIZ[[I)V")
	public Class60_Sub2(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass55_Sub1_40.anOpengl1;
		this.anInt1838 = arg2;
		this.aClass55_Sub1_40.method3677(this);
		@Pc(25) int local25;
		if (arg3) {
			for (local25 = 0; local25 < 6; local25++) {
				Static302.method5840(local14, local25 + 34069, this.anInt6570, arg2, arg2, this.aClass55_Sub1_40.anInt4012, arg4[local25]);
			}
		} else {
			for (local25 = 0; local25 < 6; local25++) {
				local14.glTexImage2D(local25 + 34069, 0, this.anInt6570, arg2, arg2, 0, 32993, this.aClass55_Sub1_40.anInt4012, IntBuffer.wrap(arg4[local25]));
			}
		}
		this.method5836(true);
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!mm;IIZ[[BI)V")
	public Class60_Sub2(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass55_Sub1_40.anOpengl1;
		this.anInt1838 = arg2;
		this.aClass55_Sub1_40.method3677(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt6570, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[local23]));
		}
		this.method5836(true);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "()V")
	@Override
	public void method5833() {
		this.aClass55_Sub1_40.anOpengl1.glFramebufferTexture2DEXT(36160, this.anInt1839, 3553, 0, 0);
		this.anInt1839 = -1;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)V")
	public void method1749(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass55_Sub1_40.anOpengl1.glFramebufferTexture2DEXT(36160, arg0, arg1, this.anInt6571, 0);
		this.anInt1839 = arg0;
	}
}
