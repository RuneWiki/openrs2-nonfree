import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public abstract class Class4_Sub2_Sub5 extends Class4_Sub2 {

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(IIIII)V")
	public Class4_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte132 = (byte) arg3;
		super.anInt10229 = arg2;
		super.anInt10231 = arg0;
		super.anInt10228 = arg1;
		super.aByte131 = (byte) arg4;
	}

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "(I)V")
	@Override
	public final void method8726() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8714(@OriginalArg(1) Class133 arg0) {
		@Pc(15) Class290 local15 = Static316.method4834(super.aByte132, super.anInt10231 >> Static115.anInt2156, super.anInt10229 >> Static115.anInt2156);
		return local15 != null && local15.aClass4_Sub2_Sub1_1.aBoolean678 ? Static381.method5595(super.anInt10231 >> Static115.anInt2156, super.aByte132, super.anInt10229 >> Static115.anInt2156, local15.aClass4_Sub2_Sub1_1.method8734() + this.method8734()) : Static463.method6855(super.aByte132, super.anInt10231 >> Static115.anInt2156, super.anInt10229 >> Static115.anInt2156);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZILclient!ha;Lclient!ov;IIZ)V")
	@Override
	public final void method8715(@OriginalArg(1) int arg0, @OriginalArg(2) Class133 arg1, @OriginalArg(3) Class4_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(B)Z")
	@Override
	public final boolean method8717() {
		return Static475.aBooleanArrayArray8[Static51.anInt1064 + (super.anInt10231 >> Static115.anInt2156) - Static260.anInt4712][Static51.anInt1064 + (super.anInt10229 >> Static115.anInt2156) - Static598.anInt10044];
	}

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method8722() {
		return false;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "([Lclient!vt;I)I")
	@Override
	public final int method8729(@OriginalArg(0) Class5_Sub11[] arg0) {
		return this.method8731(super.anInt10231 >> Static115.anInt2156, arg0, super.anInt10229 >> Static115.anInt2156);
	}
}
