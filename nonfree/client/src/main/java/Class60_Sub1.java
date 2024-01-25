import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class60_Sub1 extends Class60 {

	@OriginalMember(owner = "client!el", name = "i", descriptor = "I")
	private final int anInt1441;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!mm;II[BI)V")
	public Class60_Sub1(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt1441 = arg2;
		@Pc(12) opengl local12 = arg0.anOpengl1;
		this.aClass55_Sub1_40.method3677(this);
		local12.glPixelStorei(3317, 1);
		local12.glTexImage1D(this.anInt6572, 0, this.anInt6570, this.anInt1441, 0, arg4, 5121, ByteBuffer.wrap(arg3));
		local12.glPixelStorei(3317, 4);
		this.method5836(true);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ZI)V")
	public void method1396() {
		@Pc(8) opengl local8 = this.aClass55_Sub1_40.anOpengl1;
		this.aClass55_Sub1_40.method3677(this);
		local8.glTexParameteri(this.anInt6572, 10242, 33071);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "()V")
	@Override
	public void method5833() {
	}
}
