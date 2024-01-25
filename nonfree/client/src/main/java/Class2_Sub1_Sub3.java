import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public abstract class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!bq", name = "P", descriptor = "S")
	public final short aShort61;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(IIIIII)V")
	protected Class2_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.anInt10004 = arg1;
		super.anInt10006 = arg0;
		super.aByte141 = (byte) arg4;
		super.anInt10001 = arg2;
		this.aShort61 = (short) arg5;
		super.aByte140 = (byte) arg3;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8445(@OriginalArg(0) Class132 arg0) {
		return Static354.method5134(super.anInt10006 >> Static185.anInt3178, super.anInt10001 >> Static185.anInt3178, super.aByte141);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z[Lclient!sca;)I")
	@Override
	public final int method8450(@OriginalArg(1) Class6_Sub17[] arg0) {
		return this.method8452(arg0, super.anInt10001 >> Static185.anInt3178, super.anInt10006 >> Static185.anInt3178);
	}

	@OriginalMember(owner = "client!bq", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method8461() {
		return Static443.aBooleanArrayArray8[(super.anInt10006 >> Static185.anInt3178) + Static514.anInt8546 - Static608.anInt9872][Static514.anInt8546 + (super.anInt10001 >> Static185.anInt3178) - Static370.anInt6309];
	}
}
