import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public abstract class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!aba", name = "F", descriptor = "S")
	public final short aShort127;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(IIIIII)V")
	protected Class3_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte131 = (byte) arg4;
		super.anInt10303 = arg0;
		super.anInt10310 = arg2;
		this.aShort127 = (short) arg5;
		super.anInt10306 = arg1;
		super.aByte132 = (byte) arg3;
	}

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "(B)Z")
	@Override
	public final boolean method8606() {
		return Static331.method5702(super.aByte131, super.anInt10303 >> Static151.anInt3896, super.anInt10310 >> Static151.anInt3896);
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "([Lclient!ab;I)I")
	@Override
	public final int method8608(@OriginalArg(0) Class2_Sub1[] arg0) {
		return this.method8614(arg0, super.anInt10303 >> Static151.anInt3896, super.anInt10310 >> Static151.anInt3896);
	}

	@OriginalMember(owner = "client!aba", name = "h", descriptor = "(I)Z")
	@Override
	public final boolean method8602() {
		return Static342.aBooleanArrayArray6[Static177.anInt4273 + (super.anInt10303 >> Static151.anInt3896) - Static120.anInt3199][(super.anInt10310 >> Static151.anInt3896) + Static177.anInt4273 - Static360.anInt7144];
	}
}
