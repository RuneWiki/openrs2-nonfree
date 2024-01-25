import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public abstract class Class12_Sub2_Sub3 extends Class12_Sub2 {

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(IIIII)V")
	public Class12_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte128 = (byte) arg3;
		super.anInt9375 = arg2;
		super.aByte127 = (byte) arg4;
		super.anInt9374 = arg0;
		super.anInt9373 = arg1;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILclient!r;ILclient!caa;ZII)V")
	@Override
	public final void method7507(@OriginalArg(0) int arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12_Sub2 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I[Lclient!tg;)I")
	@Override
	public final int method7505(@OriginalArg(1) Class2_Sub11[] arg0) {
		return this.method7508(super.anInt9374 >> Static562.anInt9207, super.anInt9375 >> Static562.anInt9207, arg0);
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(Z)Z")
	@Override
	public final boolean method7510() {
		return false;
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(B)V")
	@Override
	public final void method7511() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(Z)Z")
	@Override
	public final boolean method7506() {
		@Pc(20) Class180 local20 = Static505.method6533(super.aByte128, super.anInt9374 >> Static562.anInt9207, super.anInt9375 >> Static562.anInt9207);
		return local20 != null && local20.aClass12_Sub2_Sub1_1.aBoolean783 ? Static571.method7439(super.anInt9375 >> Static562.anInt9207, super.anInt9374 >> Static562.anInt9207, local20.aClass12_Sub2_Sub1_1.method7501() + this.method7501(), super.aByte128) : Static158.method6599(super.anInt9375 >> Static562.anInt9207, super.aByte128, super.anInt9374 >> Static562.anInt9207);
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method7499() {
		return Static590.aBooleanArrayArray10[(super.anInt9374 >> Static562.anInt9207) + (Static351.anInt6012 - Static258.anInt4281)][Static351.anInt6012 + (super.anInt9375 >> Static562.anInt9207) - Static505.anInt8016];
	}
}
