import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class81_Sub4 extends Class81 {

	@OriginalMember(owner = "client!on", name = "i", descriptor = "I")
	private final int anInt4833;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!ic;II[BI)V")
	public Class81_Sub4(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt4833 = arg2;
		@Pc(12) opengl local12 = arg0.anOpengl2;
		this.aClass48_Sub2_26.method2573(this);
		local12.glPixelStorei(3317, 1);
		local12.glTexImage1D(this.anInt4831, 0, this.anInt4829, this.anInt4833, 0, arg4, 5121, ByteBuffer.wrap(arg3));
		local12.glPixelStorei(3317, 4);
		this.method4350(true);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "()V")
	@Override
	public void method5235() {
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ZI)V")
	public void method4351() {
		@Pc(3) opengl local3 = this.aClass48_Sub2_26.anOpengl2;
		this.aClass48_Sub2_26.method2573(this);
		local3.glTexParameteri(this.anInt4831, 10242, 33071);
	}
}
