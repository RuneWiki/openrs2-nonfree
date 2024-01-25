import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class11_Sub15 extends Class11 {

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(ILclient!gl;)V")
	public Class11_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub30 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!gl;)V")
	public Class11_Sub15(@OriginalArg(0) Class2_Sub30 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V")
	@Override
	protected void method9613(@OriginalArg(1) int arg0) {
		super.anInt11012 = arg0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)I")
	@Override
	public int method9614(@OriginalArg(0) int arg0) {
		if (Static34.method7588(arg0)) {
			if (super.aClass2_Sub30_32.aClass11_Sub20_2.method4858() && !Static463.method6694(super.aClass2_Sub30_32.aClass11_Sub20_2.method4863())) {
				return 3;
			}
			if (super.aClass2_Sub30_32.aClass11_Sub30_2.method9623() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static34.method7588(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)I")
	@Override
	protected int method9617() {
		return 0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)Z")
	public boolean method3260() {
		return true;
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)Z")
	public boolean method3262() {
		return Static34.method7588(super.anInt11012);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	@Override
	public void method9616() {
		if (this.method3262()) {
			if (super.aClass2_Sub30_32.aClass11_Sub20_2.method4858() && !Static463.method6694(super.aClass2_Sub30_32.aClass11_Sub20_2.method4863())) {
				super.anInt11012 = 1;
			}
			if (super.aClass2_Sub30_32.aClass11_Sub30_2.method9623() == 1) {
				super.anInt11012 = 1;
			}
		}
		if (super.anInt11012 == 3) {
			super.anInt11012 = 2;
		}
		if (super.anInt11012 < 0 || super.anInt11012 > 3) {
			super.anInt11012 = this.method9617();
		}
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)I")
	public int method3264() {
		return super.anInt11012;
	}
}
