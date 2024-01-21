import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class3_Sub1_Sub11 extends Class3_Sub1 {

	@OriginalMember(owner = "client!pb", name = "nb", descriptor = "I")
	public int anInt1865;

	@OriginalMember(owner = "client!pb", name = "zb", descriptor = "I")
	public int anInt1871;

	@OriginalMember(owner = "client!pb", name = "Bb", descriptor = "I")
	public int anInt1873;

	@OriginalMember(owner = "client!pb", name = "Db", descriptor = "I")
	public int anInt1875;

	@OriginalMember(owner = "client!pb", name = "ib", descriptor = "I")
	private int anInt1862 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
	private void method1256(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(31) double local31 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(38) double local38 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(40) double local40 = local14;
		@Pc(42) double local42 = local14;
		@Pc(44) double local44 = 0.0D;
		if (local14 > local31) {
			local42 = local31;
		}
		if (local31 > local14) {
			local40 = local31;
		}
		if (local38 > local40) {
			local40 = local38;
		}
		if (local38 < local42) {
			local42 = local38;
		}
		@Pc(74) double local74 = (local42 + local40) / 2.0D;
		this.anInt1871 = (int) (local74 * 256.0D);
		@Pc(82) double local82 = 0.0D;
		if (this.anInt1871 < 0) {
			this.anInt1871 = 0;
		} else if (this.anInt1871 > 255) {
			this.anInt1871 = 255;
		}
		if (local42 != local40) {
			if (local74 < 0.5D) {
				local82 = (local40 - local42) / (local42 + local40);
			}
			if (local40 == local14) {
				local44 = (local31 - local38) / (local40 - local42);
			} else if (local31 == local40) {
				local44 = (local38 - local14) / (local40 - local42) + 2.0D;
			} else if (local38 == local40) {
				local44 = (local14 - local31) / (local40 - local42) + 4.0D;
			}
			if (local74 >= 0.5D) {
				local82 = (local40 - local42) / ((2.0D - local40) - local42);
			}
		}
		this.anInt1873 = (int) (local82 * 256.0D);
		if (this.anInt1873 < 0) {
			this.anInt1873 = 0;
		} else if (this.anInt1873 > 255) {
			this.anInt1873 = 255;
		}
		if (local74 > 0.5D) {
			this.anInt1875 = (int) (local82 * 512.0D * (1.0D - local74));
		} else {
			this.anInt1875 = (int) (local74 * 512.0D * local82);
		}
		local44 /= 6.0D;
		if (this.anInt1875 < 1) {
			this.anInt1875 = 1;
		}
		this.anInt1865 = (int) (local44 * (double) this.anInt1875);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!gb;II)V")
	private void method1259(@OriginalArg(1) Class3_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt1862 = arg0.method458();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILclient!gb;)V")
	public void method1260(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method446();
			if (local5 == 0) {
				return;
			}
			this.method1259(arg1, local5, arg0);
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(Z)V")
	public void method1264() {
		this.method1256(this.anInt1862);
	}
}
