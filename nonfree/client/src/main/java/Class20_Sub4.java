import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public abstract class Class20_Sub4 extends Class20 {

	@OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
	public int anInt7239;

	@OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
	public final int anInt7240;

	@OriginalMember(owner = "client!qn", name = "t", descriptor = "I")
	public final int anInt7244;

	@OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
	public int anInt7242;

	@OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
	protected final int anInt7234;

	@OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
	public int anInt7238;

	@OriginalMember(owner = "client!qn", name = "u", descriptor = "I")
	public int anInt7245;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class20_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt7239 = arg0;
		this.anInt7240 = arg6;
		this.anInt7244 = arg3;
		this.anInt7242 = arg2;
		this.anInt7234 = arg1;
		this.anInt7238 = arg4;
		this.anInt7245 = arg5;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZLclient!oe;ILclient!qa;III)V")
	@Override
	public final void method8034(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(B)V")
	@Override
	public final void method8036() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)I")
	public abstract int method6522();

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method8038() {
		return false;
	}
}
