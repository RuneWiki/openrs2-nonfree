import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class21_Sub3 extends Class21 {

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class21_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class21_Sub3(@OriginalArg(0) Class14_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB)V")
	@Override
	protected void method9291(@OriginalArg(0) int arg0) {
		super.anInt11183 = arg0;
	}

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)Z")
	public boolean method962() {
		@Pc(15) int local15 = super.aClass14_Sub22_31.method3015().method8441();
		return local15 >= 96;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)I")
	@Override
	protected int method9292() {
		return 0;
	}

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)I")
	public int method964() {
		return super.anInt11183;
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(II)I")
	@Override
	public int method9289(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = super.aClass14_Sub22_31.method3015().method8441();
		if (local15 < 96) {
			return 3;
		} else if (arg0 > 1 && local15 < 128) {
			return 3;
		} else if (arg0 > 3 && local15 < 192) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	@Override
	public void method9290() {
		@Pc(10) int local10 = super.aClass14_Sub22_31.method3015().method8441();
		if (local10 < 96) {
			super.anInt11183 = 0;
		}
		if (super.anInt11183 > 1 && local10 < 128) {
			super.anInt11183 = 1;
		}
		if (super.anInt11183 > 2 && local10 < 192) {
			super.anInt11183 = 2;
		}
		if (super.anInt11183 < 0 || super.anInt11183 > 3) {
			super.anInt11183 = this.method9292();
		}
	}
}
