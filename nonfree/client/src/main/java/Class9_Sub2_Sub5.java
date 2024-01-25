import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public abstract class Class9_Sub2_Sub5 extends Class9_Sub2 {

	@OriginalMember(owner = "client!ki", name = "J", descriptor = "S")
	public short aShort98;

	@OriginalMember(owner = "client!ki", name = "C", descriptor = "S")
	public short aShort97;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class9_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.anInt10158 = arg2;
		super.anInt10152 = arg0;
		super.aByte127 = (byte) arg3;
		this.aShort98 = (short) arg5;
		this.aShort97 = (short) arg6;
		super.aByte128 = (byte) arg4;
		super.anInt10154 = arg1;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method8610() {
		return false;
	}

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "(I)Z")
	@Override
	public final boolean method8602() {
		return Static140.aBooleanArrayArray2[Static361.anInt6683 + (super.anInt10152 >> Static485.anInt8241) - Static281.anInt5392][Static361.anInt6683 + (super.anInt10158 >> Static485.anInt8241) - Static394.anInt7055];
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLclient!ha;ZILclient!uq;II)V")
	@Override
	public final void method8609(@OriginalArg(1) Class82 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9_Sub2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "(I)V")
	@Override
	public final void method8612() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "([Lclient!tj;B)I")
	@Override
	public final int method8601(@OriginalArg(0) Class3_Sub22[] arg0) {
		return this.method8606(super.anInt10152 >> Static485.anInt8241, super.anInt10158 >> Static485.anInt8241, arg0);
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8608(@OriginalArg(0) Class82 arg0) {
		return Static405.method6308(this.method8613(), super.anInt10158 >> Static485.anInt8241, super.anInt10152 >> Static485.anInt8241, super.aByte128);
	}
}
