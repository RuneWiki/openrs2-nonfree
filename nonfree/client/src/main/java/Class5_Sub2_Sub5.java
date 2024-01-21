import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class5_Sub2_Sub5 extends Class5_Sub2 {

	@OriginalMember(owner = "client!f", name = "N", descriptor = "I")
	public int anInt988;

	@OriginalMember(owner = "client!f", name = "O", descriptor = "I")
	public int anInt989;

	@OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
	public int anInt991;

	@OriginalMember(owner = "client!f", name = "X", descriptor = "I")
	public int anInt997;

	@OriginalMember(owner = "client!f", name = "U", descriptor = "I")
	private int anInt995 = -1;

	@OriginalMember(owner = "client!f", name = "R", descriptor = "I")
	private int anInt992 = 0;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(B)V")
	public void method669() {
		this.method675(this.anInt992);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!pa;B)V")
	public void method672(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub14 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method1471();
			if (local9 == 0) {
				return;
			}
			this.method673(arg0, arg1, local9);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZILclient!pa;I)V")
	private void method673(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub14 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt992 = arg1.method1439();
		} else if (arg2 == 2) {
			this.anInt995 = arg1.method1478();
			if (this.anInt995 == 65535) {
				this.anInt995 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)V")
	private void method675(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(31) double local31 = 0.0D;
		@Pc(33) double local33 = 0.0D;
		@Pc(42) double local42 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(44) double local44 = local42;
		@Pc(46) double local46 = local42;
		if (local42 < local14) {
			local46 = local14;
		}
		if (local46 < local21) {
			local46 = local21;
		}
		if (local14 < local42) {
			local44 = local14;
		}
		if (local21 < local44) {
			local44 = local21;
		}
		@Pc(76) double local76 = (local46 + local44) / 2.0D;
		this.anInt997 = (int) (local76 * 256.0D);
		if (local44 != local46) {
			if (local46 == local42) {
				local31 = (local14 - local21) / (local46 - local44);
			} else if (local14 == local46) {
				local31 = (local21 - local42) / (local46 - local44) + 2.0D;
			} else if (local46 == local21) {
				local31 = (local42 - local14) / (local46 - local44) + 4.0D;
			}
			if (local76 < 0.5D) {
				local33 = (local46 - local44) / (local44 + local46);
			}
			if (local76 >= 0.5D) {
				local33 = (local46 - local44) / (2.0D - local46 - local44);
			}
		}
		this.anInt991 = (int) (local33 * 256.0D);
		if (local76 > 0.5D) {
			this.anInt989 = (int) ((1.0D - local76) * local33 * 512.0D);
		} else {
			this.anInt989 = (int) (local76 * local33 * 512.0D);
		}
		if (this.anInt989 < 1) {
			this.anInt989 = 1;
		}
		local31 /= 6.0D;
		if (this.anInt991 < 0) {
			this.anInt991 = 0;
		} else if (this.anInt991 > 255) {
			this.anInt991 = 255;
		}
		this.anInt988 = (int) ((double) this.anInt989 * local31);
		if (this.anInt997 < 0) {
			this.anInt997 = 0;
		} else if (this.anInt997 > 255) {
			this.anInt997 = 255;
			return;
		}
	}
}
