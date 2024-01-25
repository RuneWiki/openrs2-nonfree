import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public final class Class7_Sub8 extends Class7 {

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!pp;)V")
	public Class7_Sub8(@OriginalArg(0) Class6_Sub44 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(ILclient!pp;)V")
	public Class7_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub44 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)I")
	@Override
	public int method8786(@OriginalArg(1) int arg0) {
		if (super.aClass6_Sub44_34.method7076()) {
			return 3;
		} else if (super.aClass6_Sub44_34.method7083() == Static517.aClass121_8) {
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)I")
	public int method1416() {
		return super.anInt10186;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
	@Override
	public void method8785() {
		if (super.aClass6_Sub44_34.method7083() != Static517.aClass121_8) {
			super.anInt10186 = 1;
		} else if (super.aClass6_Sub44_34.method7076()) {
			super.anInt10186 = 0;
		}
		if (super.anInt10186 != 0 && super.anInt10186 != 1) {
			super.anInt10186 = this.method8782();
		}
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)Z")
	public boolean method1418() {
		if (super.aClass6_Sub44_34.method7076()) {
			return false;
		} else {
			return super.aClass6_Sub44_34.method7083() == Static517.aClass121_8;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V")
	@Override
	protected void method8783(@OriginalArg(1) int arg0) {
		super.anInt10186 = arg0;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)I")
	@Override
	protected int method8782() {
		return 1;
	}
}
