import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class12_Sub1(@OriginalArg(0) Class5_Sub50 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(ILclient!sf;)V")
	public Class12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub50 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)I")
	@Override
	protected int method8468() {
		return 0;
	}

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "(I)Z")
	public boolean method188() {
		@Pc(18) int local18 = super.aClass5_Sub50_31.method7528().method5982();
		return local18 >= 96;
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(II)I")
	@Override
	public int method8473(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = super.aClass5_Sub50_31.method7528().method5982();
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

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)V")
	@Override
	public void method8472() {
		@Pc(10) int local10 = super.aClass5_Sub50_31.method7528().method5982();
		if (local10 < 96) {
			super.anInt10229 = 0;
		}
		if (super.anInt10229 > 1 && local10 < 128) {
			super.anInt10229 = 1;
		}
		if (super.anInt10229 > 2 && local10 < 192) {
			super.anInt10229 = 2;
		}
		if (super.anInt10229 < 0 || super.anInt10229 > 3) {
			super.anInt10229 = this.method8468();
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Z)I")
	public int method191() {
		return super.anInt10229;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8470(@OriginalArg(0) int arg0) {
		super.anInt10229 = arg0;
	}
}
