import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class7_Sub7 extends Class7 {

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(ILclient!pp;)V")
	public Class7_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub44 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!pp;)V")
	public Class7_Sub7(@OriginalArg(0) Class6_Sub44 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(I)I")
	public int method1193() {
		return super.anInt10186;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)I")
	@Override
	protected int method8782() {
		return 0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BI)I")
	@Override
	public int method8786(@OriginalArg(1) int arg0) {
		@Pc(17) int local17 = super.aClass6_Sub44_34.method7074().method3411();
		if (local17 < 96) {
			return 3;
		} else if (arg0 > 1 && local17 < 128) {
			return 3;
		} else if (arg0 > 3 && local17 < 192) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(I)Z")
	public boolean method1194() {
		@Pc(10) int local10 = super.aClass6_Sub44_34.method7074().method3411();
		return local10 >= 96;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)V")
	@Override
	protected void method8783(@OriginalArg(1) int arg0) {
		super.anInt10186 = arg0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
	@Override
	public void method8785() {
		@Pc(10) int local10 = super.aClass6_Sub44_34.method7074().method3411();
		if (local10 < 96) {
			super.anInt10186 = 0;
		}
		if (super.anInt10186 > 1 && local10 < 128) {
			super.anInt10186 = 1;
		}
		if (super.anInt10186 > 2 && local10 < 192) {
			super.anInt10186 = 2;
		}
		if (super.anInt10186 < 0 || super.anInt10186 > 3) {
			super.anInt10186 = this.method8782();
		}
	}
}
