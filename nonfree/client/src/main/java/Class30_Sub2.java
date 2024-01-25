import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class30_Sub2 extends Class30 {

	@OriginalMember(owner = "client!bu", name = "j", descriptor = "I")
	private int anInt621 = -1;

	@OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
	private final int anInt622;

	@OriginalMember(owner = "client!bu", name = "i", descriptor = "I")
	private final int anInt620;

	@OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
	private final int anInt623;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lclient!mi;IIII[BI)V")
	public Class30_Sub2(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt622 = arg2;
		this.anInt620 = arg3;
		this.anInt623 = arg4;
		@Pc(25) opengl local25 = arg0.anOpengl1;
		this.aClass155_Sub1_35.method3585(this);
		local25.glTexImage3D(this.anInt5155, 0, this.anInt5154, this.anInt622, this.anInt620, this.anInt623, 0, arg6, 5121, ByteBuffer.wrap(arg5));
		this.method4607(true);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "()V")
	@Override
	public void method4599() {
		this.aClass155_Sub1_35.anOpengl1.glFramebufferTexture3DEXT(36160, this.anInt621, this.anInt5155, 0, 0, 0);
		this.anInt621 = -1;
	}
}
