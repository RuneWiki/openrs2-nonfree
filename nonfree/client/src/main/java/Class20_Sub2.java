import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
	private final int anInt1340;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!fu;II[BI)V")
	public Class20_Sub2(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt1340 = arg2;
		@Pc(12) opengl local12 = arg0.anOpengl2;
		this.aClass63_Sub2_42.method2068(this);
		local12.glPixelStorei(3317, 1);
		local12.glTexImage1D(this.anInt6331, 0, this.anInt6334, this.anInt1340, 0, arg4, 5121, ByteBuffer.wrap(arg3));
		local12.glPixelStorei(3317, 4);
		this.method5502(true);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)V")
	public void method1099() {
		@Pc(3) opengl local3 = this.aClass63_Sub2_42.anOpengl2;
		this.aClass63_Sub2_42.method2068(this);
		local3.glTexParameteri(this.anInt6331, 10242, 33071);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "()V")
	@Override
	public void method5494() {
	}
}
