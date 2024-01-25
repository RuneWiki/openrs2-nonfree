import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class21_Sub23 extends Class21 {

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!eha;)V")
	public Class21_Sub23(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(ILclient!eha;)V")
	public Class21_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(II)V")
	@Override
	protected void method9240(@OriginalArg(1) int arg0) {
		super.anInt10876 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(II)I")
	@Override
	public int method9238(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = super.aClass3_Sub22_34.method2416().method3942();
		if (local12 < 96) {
			return 3;
		} else if (arg0 > 1 && local12 < 128) {
			return 3;
		} else if (arg0 > 3 && local12 < 192) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)I")
	@Override
	protected int method9239() {
		return 0;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)I")
	public int method7366() {
		return super.anInt10876;
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)Z")
	public boolean method7367() {
		@Pc(10) int local10 = super.aClass3_Sub22_34.method2416().method3942();
		return local10 >= 96;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
	@Override
	public void method9235() {
		@Pc(12) int local12 = super.aClass3_Sub22_34.method2416().method3942();
		if (local12 < 96) {
			super.anInt10876 = 0;
		}
		if (super.anInt10876 > 1 && local12 < 128) {
			super.anInt10876 = 1;
		}
		if (super.anInt10876 > 2 && local12 < 192) {
			super.anInt10876 = 2;
		}
		if (super.anInt10876 < 0 || super.anInt10876 > 3) {
			super.anInt10876 = this.method9239();
		}
	}
}
