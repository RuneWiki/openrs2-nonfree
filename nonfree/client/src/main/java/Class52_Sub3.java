import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class52_Sub3 extends Class52 {

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
	private final int anInt6548;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lclient!ig;II[BI)V")
	public Class52_Sub3(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt6548 = arg2;
		@Pc(12) opengl local12 = arg0.anOpengl2;
		this.aClass47_Sub2_42.method2772(this);
		local12.glPixelStorei(3317, 1);
		local12.glTexImage1D(this.anInt6685, 0, this.anInt6684, this.anInt6548, 0, arg4, 5121, ByteBuffer.wrap(arg3));
		local12.glPixelStorei(3317, 4);
		this.method5604(true);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "()V")
	@Override
	public void method5602() {
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZB)V")
	public void method5496() {
		@Pc(3) opengl local3 = this.aClass47_Sub2_42.anOpengl2;
		this.aClass47_Sub2_42.method2772(this);
		local3.glTexParameteri(this.anInt6685, 10242, 33071);
	}
}
