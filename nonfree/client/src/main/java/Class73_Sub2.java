import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kba")
public final class Class73_Sub2 extends Class73 {

	@OriginalMember(owner = "client!kba", name = "E", descriptor = "[I")
	public static final int[] anIntArray464 = new int[32];

	@OriginalMember(owner = "client!kba", name = "C", descriptor = "I")
	private final int anInt4827;

	static {
		@Pc(6) int local6 = 2;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			anIntArray464[local8] = local6 - 1;
			local6 += local6;
		}
	}

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lclient!uq;II[BI)V")
	public Class73_Sub2(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt4827 = arg2;
		super.aClass122_Sub3_35.method6850(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt7616, 0, super.anInt7624, this.anInt4827, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method6348(true);
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)V")
	@Override
	public void method6345() {
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(BZ)V")
	public void method4173() {
		super.aClass122_Sub3_35.method6850(this);
		OpenGL.glTexParameteri(super.anInt7616, 10242, 33071);
	}
}
