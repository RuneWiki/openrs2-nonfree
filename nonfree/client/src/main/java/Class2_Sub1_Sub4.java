import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public abstract class Class2_Sub1_Sub4 extends Class2_Sub1 {

	@OriginalMember(owner = "client!jg", name = "K", descriptor = "S")
	public short aShort112;

	@OriginalMember(owner = "client!jg", name = "J", descriptor = "S")
	public short aShort111;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class2_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aShort112 = (short) arg5;
		super.anInt10006 = arg0;
		super.aByte141 = (byte) arg4;
		this.aShort111 = (short) arg6;
		super.anInt10001 = arg2;
		super.anInt10004 = arg1;
		super.aByte140 = (byte) arg3;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z[Lclient!sca;)I")
	@Override
	public final int method8450(@OriginalArg(1) Class6_Sub17[] arg0) {
		return this.method8452(arg0, super.anInt10001 >> Static185.anInt3178, super.anInt10006 >> Static185.anInt3178);
	}

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method8461() {
		return Static443.aBooleanArrayArray8[(super.anInt10006 >> Static185.anInt3178) + Static514.anInt8546 - Static608.anInt9872][(super.anInt10001 >> Static185.anInt3178) + Static514.anInt8546 - Static370.anInt6309];
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!oq;IZILclient!ha;II)V")
	@Override
	public final void method8462(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class132 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "(B)V")
	@Override
	public final void method8449() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8445(@OriginalArg(0) Class132 arg0) {
		return Static325.method4615(super.aByte141, this.method8444(), super.anInt10001 >> Static185.anInt3178, super.anInt10006 >> Static185.anInt3178);
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(Z)Z")
	@Override
	public final boolean method8451() {
		return false;
	}
}
