import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public abstract class Class9_Sub2_Sub4 extends Class9_Sub2 {

	@OriginalMember(owner = "client!uda", name = "F", descriptor = "S")
	public final short aShort93;

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(IIIIII)V")
	protected Class9_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt10152 = arg0;
		this.aShort93 = (short) arg5;
		super.aByte127 = (byte) arg3;
		super.anInt10154 = arg1;
		super.anInt10158 = arg2;
		super.aByte128 = (byte) arg4;
	}

	@OriginalMember(owner = "client!uda", name = "k", descriptor = "(I)Z")
	@Override
	public final boolean method8602() {
		return Static140.aBooleanArrayArray2[(super.anInt10152 >> Static485.anInt8241) + Static361.anInt6683 - Static281.anInt5392][(super.anInt10158 >> Static485.anInt8241) + Static361.anInt6683 - Static394.anInt7055];
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "([Lclient!tj;B)I")
	@Override
	public final int method8601(@OriginalArg(0) Class3_Sub22[] arg0) {
		return this.method8606(super.anInt10152 >> Static485.anInt8241, super.anInt10158 >> Static485.anInt8241, arg0);
	}

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8608(@OriginalArg(0) Class82 arg0) {
		return Static348.method5647(super.anInt10158 >> Static485.anInt8241, super.aByte128, super.anInt10152 >> Static485.anInt8241);
	}
}
