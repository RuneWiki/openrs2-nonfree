import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class48 {

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
	public int anInt1625;

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
	public int anInt1632;

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
	public int anInt1637;

	@OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
	public int anInt1639;

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
	private int anInt1628 = 0;

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "Z")
	public boolean aBoolean105 = true;

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
	public int anInt1634 = -1;

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
	public int anInt1630 = 128;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)V")
	private void method1671(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local32 + local46) / 2.0D;
		if (local46 != local32) {
			if (local73 < 0.5D) {
				local67 = (local46 - local32) / (local32 + local46);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local73 >= 0.5D) {
				local67 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		this.anInt1637 = (int) (local73 * 256.0D);
		this.anInt1639 = (int) (local67 * 256.0D);
		local60 /= 6.0D;
		if (this.anInt1637 < 0) {
			this.anInt1637 = 0;
		} else if (this.anInt1637 > 255) {
			this.anInt1637 = 255;
		}
		if (local73 > 0.5D) {
			this.anInt1625 = (int) ((1.0D - local73) * local67 * 512.0D);
		} else {
			this.anInt1625 = (int) (local73 * local67 * 512.0D);
		}
		if (this.anInt1639 < 0) {
			this.anInt1639 = 0;
		} else if (this.anInt1639 > 255) {
			this.anInt1639 = 255;
		}
		if (this.anInt1625 < 1) {
			this.anInt1625 = 1;
		}
		this.anInt1632 = (int) ((double) this.anInt1625 * local60);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!jg;II)V")
	public void method1672(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method2548();
			if (local9 == 0) {
				return;
			}
			this.method1673(arg0, local9, arg1);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!jg;III)V")
	private void method1673(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt1628 = arg0.method2501();
			this.method1671(this.anInt1628);
		} else if (arg1 == 2) {
			this.anInt1634 = arg0.method2498();
			if (this.anInt1634 == 65535) {
				this.anInt1634 = -1;
				return;
			}
		} else if (arg1 == 3) {
			this.anInt1630 = arg0.method2498();
			return;
		} else if (arg1 == 4) {
			this.aBoolean105 = false;
			return;
		} else {
			return;
		}
	}
}
