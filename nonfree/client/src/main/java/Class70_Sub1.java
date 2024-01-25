import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class70_Sub1 extends Class70 {

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
	private final int anInt1780;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!ql;II[BI)V")
	public Class70_Sub1(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt1780 = arg2;
		@Pc(12) opengl local12 = arg0.anOpengl2;
		this.aClass92_Sub2_15.method4548(this);
		local12.glPixelStorei(3317, 1);
		local12.glTexImage1D(this.anInt2351, 0, this.anInt2349, this.anInt1780, 0, arg4, 5121, ByteBuffer.wrap(arg3));
		local12.glPixelStorei(3317, 4);
		this.method1989(true);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZZ)V")
	public void method1495() {
		@Pc(6) opengl local6 = this.aClass92_Sub2_15.anOpengl2;
		this.aClass92_Sub2_15.method4548(this);
		local6.glTexParameteri(this.anInt2351, 10242, 33071);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "()V")
	@Override
	public void method5489() {
	}
}
