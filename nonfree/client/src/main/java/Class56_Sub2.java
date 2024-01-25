import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class56_Sub2 extends Class56 {

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
	private final int anInt1607;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!tb;II[BI)V")
	public Class56_Sub2(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt1607 = arg2;
		@Pc(12) opengl local12 = arg0.anOpengl2;
		this.aClass129_Sub2_26.method5084(this);
		local12.glPixelStorei(3317, 1);
		local12.glTexImage1D(this.anInt3010, 0, this.anInt3011, this.anInt1607, 0, arg4, 5121, ByteBuffer.wrap(arg3));
		local12.glPixelStorei(3317, 4);
		this.method2542(true);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "()V")
	@Override
	public void method5673() {
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZ)V")
	public void method1316() {
		@Pc(3) opengl local3 = this.aClass129_Sub2_26.anOpengl2;
		this.aClass129_Sub2_26.method5084(this);
		local3.glTexParameteri(this.anInt3010, 10242, 33071);
	}
}
