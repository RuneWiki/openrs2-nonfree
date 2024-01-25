import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class11_Sub4 extends Class11 {

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
	private final int anInt3903;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!po;II[BI)V")
	public Class11_Sub4(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt3903 = arg2;
		@Pc(12) opengl local12 = arg0.anOpengl2;
		this.aClass59_Sub1_30.method4296(this);
		local12.glPixelStorei(3317, 1);
		local12.glTexImage1D(this.anInt3902, 0, this.anInt3900, this.anInt3903, 0, arg4, 5121, ByteBuffer.wrap(arg3));
		local12.glPixelStorei(3317, 4);
		this.method3575(true);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZ)V")
	public void method3583() {
		@Pc(3) opengl local3 = this.aClass59_Sub1_30.anOpengl2;
		this.aClass59_Sub1_30.method4296(this);
		local3.glTexParameteri(this.anInt3902, 10242, 33071);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "()V")
	@Override
	public void method5524() {
	}
}
