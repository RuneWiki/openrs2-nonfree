import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class44_Sub3 extends Class44 {

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
	private final int anInt6432;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lclient!nf;II[BI)V")
	public Class44_Sub3(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt6432 = arg2;
		@Pc(12) opengl local12 = arg0.anOpengl1;
		this.aClass105_Sub1_41.method3591(this);
		local12.glPixelStorei(3317, 1);
		local12.glTexImage1D(this.anInt6476, 0, this.anInt6475, this.anInt6432, 0, arg4, 5121, ByteBuffer.wrap(arg3));
		local12.glPixelStorei(3317, 4);
		this.method5572(true);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZB)V")
	public void method5538() {
		@Pc(3) opengl local3 = this.aClass105_Sub1_41.anOpengl1;
		this.aClass105_Sub1_41.method3591(this);
		local3.glTexParameteri(this.anInt6476, 10242, 33071);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "()V")
	@Override
	public void method5567() {
	}
}
