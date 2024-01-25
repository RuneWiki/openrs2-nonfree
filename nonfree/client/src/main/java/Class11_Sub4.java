import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class11_Sub4 extends Class11 {

	@OriginalMember(owner = "client!vda", name = "D", descriptor = "I")
	private int anInt8893 = -1;

	@OriginalMember(owner = "client!vda", name = "I", descriptor = "I")
	private int anInt8898 = -1;

	@OriginalMember(owner = "client!vda", name = "F", descriptor = "I")
	public final int anInt8895;

	static {
		new Class67("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lclient!ad;II)V")
	public Class11_Sub4(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt8895 = arg2;
		super.aClass5_Sub1_43.method423(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt8889, arg2, arg2, 0, Static212.method3886(super.anInt8889), 5121, null, 0);
		}
		this.method7303(true);
	}

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lclient!ad;IIZ[[BI)V")
	public Class11_Sub4(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt8895 = arg2;
		super.aClass5_Sub1_43.method423(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt8889, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method7303(true);
	}

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lclient!ad;IIZ[[I)V")
	public Class11_Sub4(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt8895 = arg2;
		super.aClass5_Sub1_43.method423(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static58.method1165(local30 + 34069, super.aClass5_Sub1_43.anInt418, arg2, super.anInt8889, arg2, arg4[local30]);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt8889, arg2, arg2, 0, 32993, super.aClass5_Sub1_43.anInt418, arg4[local30], 0);
			}
		}
		this.method7303(true);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
	@Override
	public void method7295() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt8898, this.anInt8893, 3553, 0, 0);
		this.anInt8893 = -1;
		this.anInt8898 = -1;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIII)V")
	public void method7310(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, arg2, super.anInt8881, 0);
		this.anInt8898 = arg1;
		this.anInt8893 = arg0;
	}
}
