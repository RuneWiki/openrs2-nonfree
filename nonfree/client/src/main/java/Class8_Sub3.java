import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class8_Sub3 extends Class8 {

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
	private final int anInt2062;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!sq;II[BI)V")
	public Class8_Sub3(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt2062 = arg2;
		@Pc(12) opengl local12 = arg0.anOpengl1;
		this.aClass46_Sub2_32.method5251(this);
		local12.glPixelStorei(3317, 1);
		local12.glTexImage1D(this.anInt5318, 0, this.anInt5319, this.anInt2062, 0, arg4, 5121, ByteBuffer.wrap(arg3));
		local12.glPixelStorei(3317, 4);
		this.method4741(true);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)V")
	public void method2075() {
		@Pc(3) opengl local3 = this.aClass46_Sub2_32.anOpengl1;
		this.aClass46_Sub2_32.method5251(this);
		local3.glTexParameteri(this.anInt5318, 10242, 33071);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "()V")
	@Override
	public void method4731() {
	}
}
