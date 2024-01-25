import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class28_Sub2 extends Class28 {

	@OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
	private final int anInt1174;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lclient!ge;II[BI)V")
	public Class28_Sub2(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt1174 = arg2;
		@Pc(12) opengl local12 = arg0.anOpengl1;
		this.aClass81_Sub1_26.method2022(this);
		local12.glPixelStorei(3317, 1);
		local12.glTexImage1D(this.anInt4318, 0, this.anInt4319, this.anInt1174, 0, arg4, 5121, ByteBuffer.wrap(arg3));
		local12.glPixelStorei(3317, 4);
		this.method4124(true);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZB)V")
	public void method1052() {
		@Pc(3) opengl local3 = this.aClass81_Sub1_26.anOpengl1;
		this.aClass81_Sub1_26.method2022(this);
		local3.glTexParameteri(this.anInt4318, 10242, 33071);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "()V")
	@Override
	public void method4114() {
	}
}
