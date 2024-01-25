import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class21_Sub4 extends Class21 {

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(ILclient!gp;)V")
	public Class21_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub27 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!gp;)V")
	public Class21_Sub4(@OriginalArg(0) Class3_Sub27 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)I")
	@Override
	protected int method8636() {
		return 0;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8634(@OriginalArg(1) int arg0) {
		super.anInt10079 = arg0;
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "(Z)I")
	public int method1459() {
		return super.anInt10079;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZI)I")
	@Override
	public int method8635(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = super.aClass3_Sub27_31.method3236().method7990();
		if (local10 < 96) {
			return 3;
		} else if (arg0 > 1 && local10 < 128) {
			return 3;
		} else if (arg0 > 3 && local10 < 192) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(Z)V")
	@Override
	public void method8639() {
		@Pc(10) int local10 = super.aClass3_Sub27_31.method3236().method7990();
		if (local10 < 96) {
			super.anInt10079 = 0;
		}
		if (super.anInt10079 > 1 && local10 < 128) {
			super.anInt10079 = 1;
		}
		if (super.anInt10079 > 2 && local10 < 192) {
			super.anInt10079 = 2;
		}
		if (super.anInt10079 < 0 || super.anInt10079 > 3) {
			super.anInt10079 = this.method8636();
		}
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)Z")
	public boolean method1461() {
		@Pc(10) int local10 = super.aClass3_Sub27_31.method3236().method7990();
		return local10 >= 96;
	}
}
