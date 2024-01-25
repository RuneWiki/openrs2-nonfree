import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class43_Sub29 extends Class43 {

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!lha;)V")
	public Class43_Sub29(@OriginalArg(0) Class14_Sub26 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(ILclient!lha;)V")
	public Class43_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub26 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(II)I")
	@Override
	public int method8894(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = super.aClass14_Sub26_32.method5272().method8395();
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

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V")
	@Override
	public void method8892() {
		@Pc(10) int local10 = super.aClass14_Sub26_32.method5272().method8395();
		if (local10 < 96) {
			super.anInt10397 = 0;
		}
		if (super.anInt10397 > 1 && local10 < 128) {
			super.anInt10397 = 1;
		}
		if (super.anInt10397 > 2 && local10 < 192) {
			super.anInt10397 = 2;
		}
		if (super.anInt10397 < 0 || super.anInt10397 > 3) {
			super.anInt10397 = this.method8889();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)I")
	public int method8277() {
		return super.anInt10397;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I")
	@Override
	protected int method8889() {
		return 0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V")
	@Override
	protected void method8893(@OriginalArg(1) int arg0) {
		super.anInt10397 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)Z")
	public boolean method8278() {
		@Pc(19) int local19 = super.aClass14_Sub26_32.method5272().method8395();
		return local19 >= 96;
	}
}
