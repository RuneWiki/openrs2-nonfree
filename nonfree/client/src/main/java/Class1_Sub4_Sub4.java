import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public abstract class Class1_Sub4_Sub4 extends Class1_Sub4 {

	@OriginalMember(owner = "client!kj", name = "F", descriptor = "S")
	public final short aShort83;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(IIIIII)V")
	protected Class1_Sub4_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt9935 = arg2;
		this.aShort83 = (short) arg5;
		super.aByte126 = (byte) arg3;
		super.anInt9932 = arg1;
		super.aByte127 = (byte) arg4;
		super.anInt9934 = arg0;
	}

	@OriginalMember(owner = "client!kj", name = "j", descriptor = "(I)Z")
	@Override
	public final boolean method8126() {
		return Static522.aBooleanArrayArray18[Static579.anInt10075 + (super.anInt9934 >> Static145.anInt3093) - Static26.anInt403][Static579.anInt10075 + (super.anInt9935 >> Static145.anInt3093) - Static528.anInt9392];
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "([Lclient!ul;I)I")
	@Override
	public final int method8129(@OriginalArg(0) Class4_Sub24[] arg0) {
		return this.method8119(arg0, super.anInt9935 >> Static145.anInt3093, super.anInt9934 >> Static145.anInt3093);
	}

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "(B)Z")
	@Override
	public final boolean method8115() {
		return Static181.method3235(super.anInt9935 >> Static145.anInt3093, super.aByte127, super.anInt9934 >> Static145.anInt3093);
	}
}
