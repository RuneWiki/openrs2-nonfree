import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class2_Sub22 extends Class2 {

	@OriginalMember(owner = "client!sr", name = "v", descriptor = "[C")
	private static final char[] aCharArray8 = new char[64];

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray8[local4] = (char) (local4 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray8[local20] = (char) (local20 + 97 - 26);
		}
		for (@Pc(36) int local36 = 52; local36 < 62; local36++) {
			aCharArray8[local36] = (char) (local36 + 48 - 52);
		}
		aCharArray8[63] = '/';
		aCharArray8[62] = '+';
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lclient!mfa;)V")
	public Class2_Sub22(@OriginalArg(0) Class5_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(ILclient!mfa;)V")
	public Class2_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(BI)V")
	@Override
	protected void method8769(@OriginalArg(1) int arg0) {
		super.anInt10576 = arg0;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BI)I")
	@Override
	public int method8763(@OriginalArg(1) int arg0) {
		if (Static442.method6604(arg0)) {
			if (super.aClass5_Sub36_31.aClass2_Sub23_1.method7837() && !Static620.method8297(super.aClass5_Sub36_31.aClass2_Sub23_1.method7836())) {
				return 3;
			}
			if (super.aClass5_Sub36_31.aClass2_Sub12_1.method5866() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static442.method6604(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)Z")
	public boolean method7577() {
		return true;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)I")
	@Override
	protected int method8764() {
		return 0;
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V")
	@Override
	public void method8765() {
		if (this.method7579()) {
			if (super.aClass5_Sub36_31.aClass2_Sub23_1.method7837() && !Static620.method8297(super.aClass5_Sub36_31.aClass2_Sub23_1.method7836())) {
				super.anInt10576 = 1;
			}
			if (super.aClass5_Sub36_31.aClass2_Sub12_1.method5866() == 1) {
				super.anInt10576 = 1;
			}
		}
		if (super.anInt10576 == 3) {
			super.anInt10576 = 2;
		}
		if (super.anInt10576 < 0 || super.anInt10576 > 3) {
			super.anInt10576 = this.method8764();
		}
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)I")
	public int method7578() {
		return super.anInt10576;
	}

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "(I)Z")
	public boolean method7579() {
		return Static442.method6604(super.anInt10576);
	}
}
