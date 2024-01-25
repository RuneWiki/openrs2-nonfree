import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public final class Class6_Sub20 extends Class6 {

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(ILclient!hs;)V")
	public Class6_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub25 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!hs;)V")
	public Class6_Sub20(@OriginalArg(0) Class5_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "(I)I")
	public int method6668() {
		return super.anInt9925;
	}

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "(I)Z")
	public boolean method6669() {
		if (super.aClass5_Sub25_32.method3685()) {
			return false;
		} else {
			return super.aClass5_Sub25_32.method3682() == Static550.aClass63_6;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)I")
	@Override
	protected int method8535() {
		return 1;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8538(@OriginalArg(0) int arg0) {
		super.anInt9925 = arg0;
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)V")
	@Override
	public void method8537() {
		if (super.aClass5_Sub25_32.method3682() != Static550.aClass63_6) {
			super.anInt9925 = 1;
		} else if (super.aClass5_Sub25_32.method3685()) {
			super.anInt9925 = 0;
		}
		if (super.anInt9925 != 0 && super.anInt9925 != 1) {
			super.anInt9925 = this.method8535();
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)I")
	@Override
	public int method8536(@OriginalArg(1) int arg0) {
		if (super.aClass5_Sub25_32.method3685()) {
			return 3;
		} else if (super.aClass5_Sub25_32.method3682() == Static550.aClass63_6) {
			return 1;
		} else {
			return 3;
		}
	}
}
