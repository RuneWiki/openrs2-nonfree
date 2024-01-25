import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public abstract class Class4_Sub2_Sub2 extends Class4_Sub2 {

	@OriginalMember(owner = "client!mj", name = "D", descriptor = "S")
	public final short aShort64;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IIIIII)V")
	protected Class4_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt10228 = arg1;
		super.aByte131 = (byte) arg4;
		super.anInt10229 = arg2;
		super.aByte132 = (byte) arg3;
		super.anInt10231 = arg0;
		this.aShort64 = (short) arg5;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8714(@OriginalArg(1) Class133 arg0) {
		return Static463.method6855(super.aByte131, super.anInt10231 >> Static115.anInt2156, super.anInt10229 >> Static115.anInt2156);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "([Lclient!vt;I)I")
	@Override
	public final int method8729(@OriginalArg(0) Class5_Sub11[] arg0) {
		return this.method8731(super.anInt10231 >> Static115.anInt2156, arg0, super.anInt10229 >> Static115.anInt2156);
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)Z")
	@Override
	public final boolean method8717() {
		return Static475.aBooleanArrayArray8[(super.anInt10231 >> Static115.anInt2156) + Static51.anInt1064 - Static260.anInt4712][(super.anInt10229 >> Static115.anInt2156) + Static51.anInt1064 - Static598.anInt10044];
	}
}
