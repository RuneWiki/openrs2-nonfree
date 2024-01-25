import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class73_Sub4 extends Class73 {

	@OriginalMember(owner = "client!sk", name = "D", descriptor = "I")
	private int anInt7638 = -1;

	@OriginalMember(owner = "client!sk", name = "A", descriptor = "I")
	private int anInt7635 = -1;

	@OriginalMember(owner = "client!sk", name = "E", descriptor = "I")
	public final int anInt7639;

	static {
		new Class306("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!uq;II)V")
	public Class73_Sub4(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt7639 = arg2;
		super.aClass122_Sub3_35.method6850(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt7624, arg2, arg2, 0, Static463.method6529(super.anInt7624), 5121, null, 0);
		}
		this.method6348(true);
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!uq;IIZ[[I)V")
	public Class73_Sub4(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt7639 = arg2;
		super.aClass122_Sub3_35.method6850(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static158.method2476(local30 + 34069, arg2, arg4[local30], super.aClass122_Sub3_35.anInt8431, super.anInt7624, arg2);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt7624, arg2, arg2, 0, 32993, super.aClass122_Sub3_35.anInt8431, arg4[local30], 0);
			}
		}
		this.method6348(true);
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!uq;IIZ[[BI)V")
	public Class73_Sub4(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt7639 = arg2;
		super.aClass122_Sub3_35.method6850(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt7624, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method6348(true);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BIIII)V")
	public void method6360(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, arg2, super.anInt7632, 0);
		this.anInt7635 = arg0;
		this.anInt7638 = arg1;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
	@Override
	public void method6345() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt7635, this.anInt7638, 3553, 0, 0);
		this.anInt7635 = -1;
		this.anInt7638 = -1;
	}
}
