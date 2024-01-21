import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!g", name = "R", descriptor = "I")
	public int anInt1624;

	@OriginalMember(owner = "client!g", name = "S", descriptor = "I")
	public int anInt1625;

	@OriginalMember(owner = "client!g", name = "T", descriptor = "I")
	public int anInt1626;

	@OriginalMember(owner = "client!g", name = "V", descriptor = "I")
	public int anInt1628;

	@OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
	public int anInt1631;

	@OriginalMember(owner = "client!g", name = "bb", descriptor = "I")
	public int anInt1632;

	@OriginalMember(owner = "client!g", name = "M", descriptor = "I")
	public int anInt1619 = -1;

	@OriginalMember(owner = "client!g", name = "Q", descriptor = "I")
	public int anInt1623 = 0;

	@OriginalMember(owner = "client!g", name = "X", descriptor = "I")
	public int anInt1630 = -1;

	@OriginalMember(owner = "client!g", name = "Z", descriptor = "Z")
	public boolean aBoolean61 = true;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "(I)V")
	public void method1074() {
		if (this.anInt1630 != -1) {
			this.method1075(this.anInt1630);
			this.anInt1628 = this.anInt1632;
			this.anInt1624 = this.anInt1626;
			this.anInt1631 = this.anInt1625;
		}
		this.method1075(this.anInt1623);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)V")
	private void method1075(@OriginalArg(1) int arg0) {
		@Pc(12) double local12 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(27) double local27 = 0.0D;
		@Pc(29) double local29 = 0.0D;
		@Pc(38) double local38 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(40) double local40 = local38;
		if (local38 > local21) {
			local40 = local21;
		}
		@Pc(48) double local48 = local38;
		if (local21 > local38) {
			local48 = local21;
		}
		if (local12 > local48) {
			local48 = local12;
		}
		if (local40 > local12) {
			local40 = local12;
		}
		@Pc(72) double local72 = (local40 + local48) / 2.0D;
		this.anInt1626 = (int) (local72 * 256.0D);
		if (this.anInt1626 < 0) {
			this.anInt1626 = 0;
		} else if (this.anInt1626 > 255) {
			this.anInt1626 = 255;
		}
		if (local48 != local40) {
			if (local72 < 0.5D) {
				local29 = (local48 - local40) / (local48 + local40);
			}
			if (local48 == local38) {
				local27 = (local21 - local12) / (-local40 + local48);
			} else if (local21 == local48) {
				local27 = (local12 - local38) / (-local40 + local48) + 2.0D;
			} else if (local12 == local48) {
				local27 = (local38 - local21) / (local48 - local40) + 4.0D;
			}
			if (local72 >= 0.5D) {
				local29 = (local48 - local40) / (2.0D - local48 - local40);
			}
		}
		this.anInt1625 = (int) (local29 * 256.0D);
		local27 /= 6.0D;
		this.anInt1632 = (int) (local27 * 256.0D);
		if (this.anInt1625 < 0) {
			this.anInt1625 = 0;
		} else if (this.anInt1625 > 255) {
			this.anInt1625 = 255;
			return;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIILclient!hc;)V")
	private void method1076(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub6 arg2) {
		if (arg1 == 1) {
			this.anInt1623 = arg2.method501();
		} else if (arg1 == 2) {
			this.anInt1619 = arg2.method544();
		} else if (arg1 == 3) {
			this.anInt1619 = arg2.method546();
			if (this.anInt1619 == 65535) {
				this.anInt1619 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean61 = false;
		} else if (arg1 == 7) {
			this.anInt1630 = arg2.method501();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!hc;I)V")
	public void method1078(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(17) int local17 = arg0.method544();
			if (local17 == 0) {
				return;
			}
			this.method1076(arg1, local17, arg0);
		}
	}
}
