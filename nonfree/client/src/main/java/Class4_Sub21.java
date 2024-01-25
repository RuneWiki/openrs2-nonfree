import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public final class Class4_Sub21 extends Class4 {

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(ILclient!w;)V")
	public Class4_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub54 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Lclient!w;)V")
	public Class4_Sub21(@OriginalArg(0) Class2_Sub54 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "(II)I")
	@Override
	public int method9223(@OriginalArg(0) int arg0) {
		if (super.aClass2_Sub54_31.method9544() != Static19.aClass229_3) {
			return 3;
		} else if (super.aClass2_Sub54_31.method9551()) {
			return 3;
		} else if (arg0 == 0 || super.aClass2_Sub54_31.aClass4_Sub8_1.method2456() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "(Z)V")
	@Override
	public void method9225() {
		if (super.aClass2_Sub54_31.method9544() != Static19.aClass229_3) {
			super.anInt10787 = 1;
		} else if (super.aClass2_Sub54_31.method9551()) {
			super.anInt10787 = 0;
		}
		if (super.anInt10787 != 0 && super.anInt10787 != 1) {
			super.anInt10787 = this.method9221();
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9227(@OriginalArg(1) int arg0) {
		super.anInt10787 = arg0;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Z)I")
	@Override
	protected int method9221() {
		return 1;
	}

	@OriginalMember(owner = "client!nha", name = "c", descriptor = "(I)I")
	public int method6610() {
		return super.anInt10787;
	}

	@OriginalMember(owner = "client!nha", name = "d", descriptor = "(I)Z")
	public boolean method6611() {
		if (super.aClass2_Sub54_31.method9544() == Static19.aClass229_3) {
			return !super.aClass2_Sub54_31.method9551();
		} else {
			return false;
		}
	}
}
