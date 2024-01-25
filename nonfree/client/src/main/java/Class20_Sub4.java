import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public final class Class20_Sub4 extends Class20 {

	@OriginalMember(owner = "client!oda", name = "D", descriptor = "I")
	private final int anInt6381;

	static {
		new Class114("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(Lclient!te;II[BI)V")
	public Class20_Sub4(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt6381 = arg2;
		super.aClass9_Sub3_36.method6701(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt7329, 0, super.anInt7318, this.anInt6381, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method6237(true);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V")
	@Override
	public void method6233() {
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZZ)V")
	public void method5529() {
		super.aClass9_Sub3_36.method6701(this);
		OpenGL.glTexParameteri(super.anInt7329, 10242, 33071);
	}
}
