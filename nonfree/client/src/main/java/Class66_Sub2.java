import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class66_Sub2 extends Class66 {

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
	private final int anInt2161;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!se;II[BI)V")
	public Class66_Sub2(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt2161 = arg2;
		@Pc(12) opengl local12 = arg0.anOpengl2;
		this.aClass122_Sub2_35.method4864(this);
		local12.glPixelStorei(3317, 1);
		local12.glTexImage1D(this.anInt4752, 0, this.anInt4753, this.anInt2161, 0, arg4, 5121, ByteBuffer.wrap(arg3));
		local12.glPixelStorei(3317, 4);
		this.method4044(true);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "()V")
	@Override
	public void method4037() {
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZ)V")
	public void method1753() {
		@Pc(3) opengl local3 = this.aClass122_Sub2_35.anOpengl2;
		this.aClass122_Sub2_35.method4864(this);
		local3.glTexParameteri(this.anInt4752, 10242, 33071);
	}
}
