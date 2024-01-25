import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public final class Class136_Sub3 extends Class136 implements Interface11 {

	@OriginalMember(owner = "client!oca", name = "A", descriptor = "I")
	private final int anInt7108;

	@OriginalMember(owner = "client!oca", name = "z", descriptor = "I")
	private final int anInt7107;

	@OriginalMember(owner = "client!oca", name = "F", descriptor = "I")
	private final int anInt7110;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lclient!eea;Lclient!kca;III[B)V")
	public Class136_Sub3(@OriginalArg(0) Class87_Sub1_Sub1 arg0, @OriginalArg(1) Class187 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static545.aClass324_12, arg4 * arg2 * arg3, false);
		this.anInt7108 = arg3;
		this.anInt7107 = arg2;
		this.anInt7110 = arg4;
		super.aClass87_Sub1_Sub1_9.method5079(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt8495, 0, this.method7146(), this.anInt7107, this.anInt7108, this.anInt7110, 0, Static253.method4172(super.aClass187_14), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
