import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public abstract class Class12_Sub2_Sub4 extends Class12_Sub2 {

	@OriginalMember(owner = "client!fg", name = "z", descriptor = "S")
	public short aShort60;

	@OriginalMember(owner = "client!fg", name = "B", descriptor = "S")
	public short aShort61;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class12_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.anInt9375 = arg2;
		this.aShort60 = (short) arg6;
		super.anInt9374 = arg0;
		super.anInt9373 = arg1;
		super.aByte128 = (byte) arg3;
		this.aShort61 = (short) arg5;
		super.aByte127 = (byte) arg4;
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method7499() {
		return Static590.aBooleanArrayArray10[(super.anInt9374 >> Static562.anInt9207) + Static351.anInt6012 - Static258.anInt4281][(super.anInt9375 >> Static562.anInt9207) + Static351.anInt6012 - Static505.anInt8016];
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(B)V")
	@Override
	public final void method7511() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!r;ILclient!caa;ZII)V")
	@Override
	public final void method7507(@OriginalArg(0) int arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12_Sub2 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(Z)Z")
	@Override
	public final boolean method7510() {
		return false;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I[Lclient!tg;)I")
	@Override
	public final int method7505(@OriginalArg(1) Class2_Sub11[] arg0) {
		return this.method7508(super.anInt9374 >> Static562.anInt9207, super.anInt9375 >> Static562.anInt9207, arg0);
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(Z)Z")
	@Override
	public final boolean method7506() {
		return Static571.method7439(super.anInt9375 >> Static562.anInt9207, super.anInt9374 >> Static562.anInt9207, this.method7501(), super.aByte127);
	}
}
