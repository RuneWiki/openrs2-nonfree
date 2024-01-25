import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public final class Class88_Sub3 extends Class88 implements Interface9 {

	@OriginalMember(owner = "client!rca", name = "A", descriptor = "I")
	private final int anInt7284;

	@OriginalMember(owner = "client!rca", name = "F", descriptor = "I")
	private final int anInt7288;

	@OriginalMember(owner = "client!rca", name = "E", descriptor = "I")
	private final int anInt7287;

	static {
		new Class306("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lclient!ph;Lclient!uda;III[B)V")
	public Class88_Sub3(@OriginalArg(0) Class122_Sub2_Sub2 arg0, @OriginalArg(1) Class292 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static431.aClass264_15, arg4 * arg3 * arg2, false);
		this.anInt7284 = arg4;
		this.anInt7288 = arg2;
		this.anInt7287 = arg3;
		super.aClass122_Sub2_Sub2_10.method5651(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt8877, 0, this.method7309(), this.anInt7288, this.anInt7287, this.anInt7284, 0, Static168.method4654(super.aClass292_16), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
