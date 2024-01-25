import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public final class Class6_Sub24 extends Class6 {

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lclient!hs;)V")
	public Class6_Sub24(@OriginalArg(0) Class5_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(ILclient!hs;)V")
	public Class6_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub25 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)I")
	@Override
	public int method8536(@OriginalArg(1) int arg0) {
		if (Static55.method942(arg0)) {
			if (super.aClass5_Sub25_32.aClass6_Sub11_1.method3984() && !Static547.method7979(super.aClass5_Sub25_32.aClass6_Sub11_1.method3988())) {
				return 3;
			}
			if (super.aClass5_Sub25_32.aClass6_Sub8_1.method2208() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static55.method942(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "(I)Z")
	public boolean method7733() {
		return true;
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V")
	@Override
	public void method8537() {
		if (this.method7737()) {
			if (super.aClass5_Sub25_32.aClass6_Sub11_1.method3984() && !Static547.method7979(super.aClass5_Sub25_32.aClass6_Sub11_1.method3988())) {
				super.anInt9925 = 1;
			}
			if (super.aClass5_Sub25_32.aClass6_Sub8_1.method2208() == 1) {
				super.anInt9925 = 1;
			}
		}
		if (super.anInt9925 == 3) {
			super.anInt9925 = 2;
		}
		if (super.anInt9925 < 0 || super.anInt9925 > 3) {
			super.anInt9925 = this.method8535();
		}
	}

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "(I)I")
	public int method7735() {
		return super.anInt9925;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)I")
	@Override
	protected int method8535() {
		return 0;
	}

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "(I)Z")
	public boolean method7737() {
		return Static55.method942(super.anInt9925);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8538(@OriginalArg(0) int arg0) {
		super.anInt9925 = arg0;
	}
}
