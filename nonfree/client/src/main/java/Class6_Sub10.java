import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public final class Class6_Sub10 extends Class6 {

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!hs;)V")
	public Class6_Sub10(@OriginalArg(0) Class5_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(ILclient!hs;)V")
	public Class6_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub25 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V")
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

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)I")
	@Override
	public int method8536(@OriginalArg(1) int arg0) {
		if (super.aClass5_Sub25_32.method3685()) {
			return 3;
		} else if (super.aClass5_Sub25_32.method3682() == Static550.aClass63_6) {
			if (arg0 == 0) {
				if (super.aClass5_Sub25_32.aClass6_Sub2_1.method114() == 1) {
					return 2;
				}
				if (super.aClass5_Sub25_32.aClass6_Sub16_1.method4732() == 1) {
					return 2;
				}
				if (super.aClass5_Sub25_32.aClass6_Sub25_1.method7878() > 0) {
					return 2;
				}
			}
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8538(@OriginalArg(0) int arg0) {
		super.anInt9925 = arg0;
	}

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)Z")
	public boolean method2364() {
		if (super.aClass5_Sub25_32.method3685()) {
			return false;
		} else {
			return super.aClass5_Sub25_32.method3682() == Static550.aClass63_6;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)I")
	@Override
	protected int method8535() {
		return 1;
	}

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "(I)I")
	public int method2365() {
		return super.anInt9925;
	}
}
