import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class29_Sub23 extends Class29 {

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!fs;)V")
	public Class29_Sub23(@OriginalArg(0) Class6_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(ILclient!fs;)V")
	public Class29_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)I")
	public int method7364() {
		return super.anInt10604;
	}

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)Z")
	public boolean method7365() {
		@Pc(18) int local18 = super.aClass6_Sub22_31.method2368().method4181();
		return local18 >= 96;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)I")
	@Override
	protected int method8997() {
		return 0;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
	@Override
	public void method8995() {
		@Pc(15) int local15 = super.aClass6_Sub22_31.method2368().method4181();
		if (local15 < 96) {
			super.anInt10604 = 0;
		}
		if (super.anInt10604 > 1 && local15 < 128) {
			super.anInt10604 = 1;
		}
		if (super.anInt10604 > 2 && local15 < 192) {
			super.anInt10604 = 2;
		}
		if (super.anInt10604 < 0 || super.anInt10604 > 3) {
			super.anInt10604 = this.method8997();
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(II)I")
	@Override
	public int method8994(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = super.aClass6_Sub22_31.method2368().method4181();
		if (local18 < 96) {
			return 3;
		} else if (arg0 > 1 && local18 < 128) {
			return 3;
		} else if (arg0 > 3 && local18 < 192) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "(II)V")
	@Override
	protected void method9000(@OriginalArg(0) int arg0) {
		super.anInt10604 = arg0;
	}
}
