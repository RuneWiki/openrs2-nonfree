import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class43_Sub8 extends Class43 {

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(ILclient!lha;)V")
	public Class43_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub26 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!lha;)V")
	public Class43_Sub8(@OriginalArg(0) Class14_Sub26 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)I")
	@Override
	protected int method8889() {
		return 2;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)I")
	public int method2751() {
		return super.anInt10397;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)I")
	@Override
	public int method8894(@OriginalArg(0) int arg0) {
		if (super.aClass14_Sub26_32.method5276()) {
			return 3;
		} else if (super.aClass14_Sub26_32.aClass43_Sub5_1.method1872() == 0) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)V")
	@Override
	public void method8892() {
		if (super.aClass14_Sub26_32.method5276()) {
			super.anInt10397 = 0;
		}
		if (super.aClass14_Sub26_32.aClass43_Sub5_1.method1872() == 0) {
			super.anInt10397 = 0;
		}
		if (super.anInt10397 < 0 || super.anInt10397 > 2) {
			super.anInt10397 = this.method8889();
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)Z")
	public boolean method2754() {
		if (super.aClass14_Sub26_32.method5276()) {
			return false;
		} else {
			return super.aClass14_Sub26_32.aClass43_Sub5_1.method1872() != 0;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
	@Override
	protected void method8893(@OriginalArg(1) int arg0) {
		super.anInt10397 = arg0;
	}
}
