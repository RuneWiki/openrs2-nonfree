import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kka")
public abstract class Class2_Sub1_Sub5 extends Class2_Sub1 {

	@OriginalMember(owner = "client!kka", name = "<init>", descriptor = "(IIIII)V")
	public Class2_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte141 = (byte) arg4;
		super.anInt10006 = arg0;
		super.aByte140 = (byte) arg3;
		super.anInt10004 = arg1;
		super.anInt10001 = arg2;
	}

	@OriginalMember(owner = "client!kka", name = "d", descriptor = "(Z)Z")
	@Override
	public final boolean method8451() {
		return false;
	}

	@OriginalMember(owner = "client!kka", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method8461() {
		return Static443.aBooleanArrayArray8[(super.anInt10006 >> Static185.anInt3178) + Static514.anInt8546 - Static608.anInt9872][Static514.anInt8546 + (super.anInt10001 >> Static185.anInt3178) - Static370.anInt6309];
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(Z[Lclient!sca;)I")
	@Override
	public final int method8450(@OriginalArg(1) Class6_Sub17[] arg0) {
		return this.method8452(arg0, super.anInt10001 >> Static185.anInt3178, super.anInt10006 >> Static185.anInt3178);
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(Lclient!oq;IZILclient!ha;II)V")
	@Override
	public final void method8462(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class132 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kka", name = "e", descriptor = "(B)V")
	@Override
	public final void method8449() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8445(@OriginalArg(0) Class132 arg0) {
		@Pc(20) Class67 local20 = Static349.method5053(super.aByte140, super.anInt10006 >> Static185.anInt3178, super.anInt10001 >> Static185.anInt3178);
		return local20 != null && local20.aClass2_Sub1_Sub1_1.aBoolean703 ? Static325.method4615(super.aByte140, local20.aClass2_Sub1_Sub1_1.method8444() + this.method8444(), super.anInt10001 >> Static185.anInt3178, super.anInt10006 >> Static185.anInt3178) : Static354.method5134(super.anInt10006 >> Static185.anInt3178, super.anInt10001 >> Static185.anInt3178, super.aByte140);
	}
}
