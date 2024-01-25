import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class124_Sub4 extends Class124 {

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
	private final int anInt6845;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!ao;II[BI)V")
	public Class124_Sub4(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt6845 = arg2;
		@Pc(12) opengl local12 = arg0.anOpengl1;
		this.aClass4_Sub1_41.method602(this);
		local12.glPixelStorei(3317, 1);
		local12.glTexImage1D(this.anInt6844, 0, this.anInt6843, this.anInt6845, 0, arg4, 5121, ByteBuffer.wrap(arg3));
		local12.glPixelStorei(3317, 4);
		this.method5896(true);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BZ)V")
	public void method5905() {
		@Pc(3) opengl local3 = this.aClass4_Sub1_41.anOpengl1;
		this.aClass4_Sub1_41.method602(this);
		local3.glTexParameteri(this.anInt6844, 10242, 33071);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()V")
	@Override
	public void method5891() {
	}
}
