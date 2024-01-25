import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
	private int anInt1968 = -1;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
	private final int anInt1965;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
	private final int anInt1967;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
	private final int anInt1966;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!sq;IIII[BI)V")
	public Class8_Sub2(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt1965 = arg2;
		this.anInt1967 = arg3;
		this.anInt1966 = arg4;
		@Pc(25) opengl local25 = arg0.anOpengl1;
		this.aClass46_Sub2_32.method5251(this);
		local25.glTexImage3D(this.anInt5318, 0, this.anInt5319, this.anInt1965, this.anInt1967, this.anInt1966, 0, arg6, 5121, ByteBuffer.wrap(arg5));
		this.method4741(true);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "()V")
	@Override
	public void method4731() {
		this.aClass46_Sub2_32.anOpengl1.glFramebufferTexture3DEXT(36160, this.anInt1968, this.anInt5318, 0, 0, 0);
		this.anInt1968 = -1;
	}
}
