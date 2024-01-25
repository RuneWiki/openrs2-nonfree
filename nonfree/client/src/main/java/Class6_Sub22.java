import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class6_Sub22 extends Class6 {

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!hs;)V")
	public Class6_Sub22(@OriginalArg(0) Class5_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(ILclient!hs;)V")
	public Class6_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub25 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)I")
	public int method6865() {
		return super.anInt9925;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)I")
	@Override
	public int method8536(@OriginalArg(1) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8538(@OriginalArg(0) int arg0) {
		super.anInt9925 = arg0;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V")
	@Override
	public void method8537() {
		super.anInt9925 = this.method8535();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)I")
	@Override
	protected int method8535() {
		return super.aClass5_Sub25_32.method3685() ? 1 : 0;
	}
}
