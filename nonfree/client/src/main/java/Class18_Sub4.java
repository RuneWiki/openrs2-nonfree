import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class18_Sub4 extends Class18 {

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
	private int anInt5458 = -1;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
	private final int anInt5456;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
	private final int anInt5457;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
	private final int anInt5459;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!hj;IIII[BI)V")
	public Class18_Sub4(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt5456 = arg2;
		this.anInt5457 = arg3;
		this.anInt5459 = arg4;
		@Pc(25) opengl local25 = arg0.anOpengl1;
		this.aClass2_Sub1_34.method2376(this);
		local25.glTexImage3D(this.anInt5452, 0, this.anInt5454, this.anInt5456, this.anInt5457, this.anInt5459, 0, arg6, 5121, ByteBuffer.wrap(arg5));
		this.method4852(true);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "()V")
	@Override
	public void method5354() {
		this.aClass2_Sub1_34.anOpengl1.glFramebufferTexture3DEXT(36160, this.anInt5458, this.anInt5452, 0, 0, 0);
		this.anInt5458 = -1;
	}
}
