import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class156 {

	@OriginalMember(owner = "client!im", name = "g", descriptor = "[C")
	private static final char[] aCharArray5 = new char[64];

	@OriginalMember(owner = "client!im", name = "a", descriptor = "I")
	public int anInt4278;

	@OriginalMember(owner = "client!im", name = "b", descriptor = "Lclient!wba;")
	public Class352 aClass352_1;

	@OriginalMember(owner = "client!im", name = "f", descriptor = "I")
	private int anInt4282;

	@OriginalMember(owner = "client!im", name = "j", descriptor = "I")
	public int anInt4285;

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray5[local4] = (char) (local4 + 65);
		}
		for (@Pc(18) int local18 = 26; local18 < 52; local18++) {
			aCharArray5[local18] = (char) (local18 + 71);
		}
		for (@Pc(34) int local34 = 52; local34 < 62; local34++) {
			aCharArray5[local34] = (char) (local34 + 48 - 52);
		}
		aCharArray5[63] = '/';
		aCharArray5[62] = '+';
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!io;I)V")
	public void method3678(@OriginalArg(0) Class1_Sub20 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4393();
			if (local17 == 0) {
				return;
			}
			this.method3683(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)Lclient!tq;")
	public synchronized Class318 method3679() {
		@Pc(13) Class318 local13 = (Class318) this.aClass352_1.aClass326_56.method7238((long) this.anInt4282);
		if (local13 != null) {
			return local13;
		}
		local13 = Static604.method7062(this.aClass352_1.aClass111_124, this.anInt4282, 0);
		if (local13 != null) {
			this.aClass352_1.aClass326_56.method7236(local13, (long) this.anInt4282);
		}
		return local13;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IBLclient!io;)V")
	private void method3683(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt4282 = arg1.method4426();
		} else if (arg0 == 2) {
			this.anInt4285 = arg1.method4393();
			this.anInt4278 = arg1.method4393();
		}
	}
}
