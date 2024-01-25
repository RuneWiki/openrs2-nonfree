import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class15_Sub24 extends Class15 {

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(ILclient!hb;)V")
	public Class15_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!hb;)V")
	public Class15_Sub24(@OriginalArg(0) Class6_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)Z")
	public boolean method8341() {
		@Pc(17) int local17 = super.aClass6_Sub22_31.method3527().method8502();
		return local17 >= 96;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(II)I")
	@Override
	public int method8990(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = super.aClass6_Sub22_31.method3527().method8502();
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

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V")
	@Override
	protected void method8985(@OriginalArg(1) int arg0) {
		super.anInt10701 = arg0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)I")
	@Override
	protected int method8986() {
		return 0;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V")
	@Override
	public void method8989() {
		@Pc(10) int local10 = super.aClass6_Sub22_31.method3527().method8502();
		if (local10 < 96) {
			super.anInt10701 = 0;
		}
		if (super.anInt10701 > 1 && local10 < 128) {
			super.anInt10701 = 1;
		}
		if (super.anInt10701 > 2 && local10 < 192) {
			super.anInt10701 = 2;
		}
		if (super.anInt10701 < 0 || super.anInt10701 > 3) {
			super.anInt10701 = this.method8986();
		}
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(I)I")
	public int method8343() {
		return super.anInt10701;
	}
}
