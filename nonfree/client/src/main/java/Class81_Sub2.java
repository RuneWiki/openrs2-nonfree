import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class81_Sub2 extends Class81 {

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
	private final int anInt3187;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!cg;II[BI)V")
	public Class81_Sub2(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt3187 = arg2;
		@Pc(12) opengl local12 = arg0.anOpengl1;
		this.aClass37_Sub1_34.method767(this);
		local12.glPixelStorei(3317, 1);
		local12.glTexImage1D(this.anInt5610, 0, this.anInt5609, this.anInt3187, 0, arg4, 5121, ByteBuffer.wrap(arg3));
		local12.glPixelStorei(3317, 4);
		this.method4737(true);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)V")
	public void method2871() {
		@Pc(10) opengl local10 = this.aClass37_Sub1_34.anOpengl1;
		this.aClass37_Sub1_34.method767(this);
		local10.glTexParameteri(this.anInt5610, 10242, 33071);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "()V")
	@Override
	public void method5338() {
	}
}
