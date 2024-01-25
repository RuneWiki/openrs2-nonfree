import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class4_Sub25 extends Class4 {

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(ILclient!w;)V")
	public Class4_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub54 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lclient!w;)V")
	public Class4_Sub25(@OriginalArg(0) Class2_Sub54 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(II)I")
	@Override
	public int method9223(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = super.aClass2_Sub54_31.method9553().method131();
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

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(I)I")
	public int method8512() {
		return super.anInt10787;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9227(@OriginalArg(1) int arg0) {
		super.anInt10787 = arg0;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Z)I")
	@Override
	protected int method9221() {
		return 0;
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(Z)V")
	@Override
	public void method9225() {
		@Pc(10) int local10 = super.aClass2_Sub54_31.method9553().method131();
		if (local10 < 96) {
			super.anInt10787 = 0;
		}
		if (super.anInt10787 > 1 && local10 < 128) {
			super.anInt10787 = 1;
		}
		if (super.anInt10787 > 2 && local10 < 192) {
			super.anInt10787 = 2;
		}
		if (super.anInt10787 < 0 || super.anInt10787 > 3) {
			super.anInt10787 = this.method9221();
		}
	}

	@OriginalMember(owner = "client!st", name = "c", descriptor = "(I)Z")
	public boolean method8514() {
		@Pc(14) int local14 = super.aClass2_Sub54_31.method9553().method131();
		return local14 >= 96;
	}
}
