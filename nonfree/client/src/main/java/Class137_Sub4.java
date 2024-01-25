import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class137_Sub4 extends Class137 {

	@OriginalMember(owner = "client!us", name = "z", descriptor = "I")
	private int anInt7151 = -1;

	@OriginalMember(owner = "client!us", name = "x", descriptor = "I")
	private int anInt7149 = -1;

	@OriginalMember(owner = "client!us", name = "C", descriptor = "I")
	public final int anInt7153;

	static {
		new Class174("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!nq;II)V")
	public Class137_Sub4(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt7153 = arg2;
		super.aClass167_Sub1_43.method4028(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt7134, arg2, arg2, 0, Static29.method4785(super.anInt7134), 5121, null, 0);
		}
		this.method5783(true);
	}

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!nq;IIZ[[BI)V")
	public Class137_Sub4(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt7153 = arg2;
		super.aClass167_Sub1_43.method4028(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt7134, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method5783(true);
	}

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!nq;IIZ[[I)V")
	public Class137_Sub4(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt7153 = arg2;
		super.aClass167_Sub1_43.method4028(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static359.method5018(local30 + 34069, arg2, super.anInt7134, super.aClass167_Sub1_43.anInt4900, arg2, arg4[local30]);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt7134, arg2, arg2, 0, 32993, super.aClass167_Sub1_43.anInt4900, arg4[local30], 0);
			}
		}
		this.method5783(true);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIII)V")
	public void method5788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg2, arg0, super.anInt7144, 0);
		this.anInt7151 = arg1;
		this.anInt7149 = arg2;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Z)V")
	@Override
	public void method5778() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt7151, this.anInt7149, 3553, 0, 0);
		this.anInt7151 = -1;
		this.anInt7149 = -1;
	}
}
