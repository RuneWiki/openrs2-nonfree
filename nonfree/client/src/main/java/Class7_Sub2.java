import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
	private final int anInt256;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!qi;II[BI)V")
	public Class7_Sub2(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt256 = arg2;
		@Pc(12) opengl local12 = arg0.anOpengl2;
		this.aClass82_Sub2_33.method4614(this);
		local12.glPixelStorei(3317, 1);
		local12.glTexImage1D(this.anInt5432, 0, this.anInt5433, this.anInt256, 0, arg4, 5121, ByteBuffer.wrap(arg3));
		local12.glPixelStorei(3317, 4);
		this.method4734(true);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZ)V")
	public void method320() {
		@Pc(9) opengl local9 = this.aClass82_Sub2_33.anOpengl2;
		this.aClass82_Sub2_33.method4614(this);
		local9.glTexParameteri(this.anInt5432, 10242, 33071);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "()V")
	@Override
	public void method4731() {
	}
}
