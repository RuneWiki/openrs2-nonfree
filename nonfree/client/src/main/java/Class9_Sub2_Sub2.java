import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public abstract class Class9_Sub2_Sub2 extends Class9_Sub2 {

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(IIIII)V")
	public Class9_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.anInt10158 = arg2;
		super.aByte127 = (byte) arg3;
		super.aByte128 = (byte) arg4;
		super.anInt10154 = arg1;
		super.anInt10152 = arg0;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLclient!ha;ZILclient!uq;II)V")
	@Override
	public final void method8609(@OriginalArg(1) Class82 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9_Sub2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8608(@OriginalArg(0) Class82 arg0) {
		@Pc(15) Class105 local15 = Static290.method4746(super.aByte127, super.anInt10152 >> Static485.anInt8241, super.anInt10158 >> Static485.anInt8241);
		return local15 != null && local15.aClass9_Sub2_Sub1_1.aBoolean771 ? Static405.method6308(local15.aClass9_Sub2_Sub1_1.method8613() + this.method8613(), super.anInt10158 >> Static485.anInt8241, super.anInt10152 >> Static485.anInt8241, super.aByte127) : Static348.method5647(super.anInt10158 >> Static485.anInt8241, super.aByte127, super.anInt10152 >> Static485.anInt8241);
	}

	@OriginalMember(owner = "client!lj", name = "m", descriptor = "(I)V")
	@Override
	public final void method8612() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([Lclient!tj;B)I")
	@Override
	public final int method8601(@OriginalArg(0) Class3_Sub22[] arg0) {
		return this.method8606(super.anInt10152 >> Static485.anInt8241, super.anInt10158 >> Static485.anInt8241, arg0);
	}

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "(I)Z")
	@Override
	public final boolean method8602() {
		return Static140.aBooleanArrayArray2[Static361.anInt6683 + (super.anInt10152 >> Static485.anInt8241) - Static281.anInt5392][Static361.anInt6683 + (super.anInt10158 >> Static485.anInt8241) - Static394.anInt7055];
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method8610() {
		return false;
	}
}
