import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class2_Sub1_Sub11 extends Class2_Sub1 {

	@OriginalMember(owner = "client!md", name = "tb", descriptor = "I")
	public int anInt1915;

	@OriginalMember(owner = "client!md", name = "vb", descriptor = "I")
	public int anInt1916;

	@OriginalMember(owner = "client!md", name = "yb", descriptor = "I")
	public int anInt1917;

	@OriginalMember(owner = "client!md", name = "Eb", descriptor = "I")
	public int anInt1921;

	@OriginalMember(owner = "client!md", name = "Jb", descriptor = "I")
	private int anInt1925 = 0;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(IB)V")
	private void method1325(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local30) {
			local32 = local30;
		}
		if (local21 < local32) {
			local32 = local21;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local30) {
			local46 = local30;
		}
		@Pc(54) double local54 = 0.0D;
		if (local46 < local21) {
			local46 = local21;
		}
		@Pc(66) double local66 = (local46 + local32) / 2.0D;
		this.anInt1915 = (int) (local66 * 256.0D);
		@Pc(74) double local74 = 0.0D;
		if (local46 != local32) {
			if (local66 < 0.5D) {
				local74 = (local46 - local32) / (local46 + local32);
			}
			if (local66 >= 0.5D) {
				local74 = (local46 - local32) / (2.0D - local32 - local46);
			}
			if (local14 == local46) {
				local54 = (local30 - local21) / (local46 - local32);
			} else if (local46 == local30) {
				local54 = (local21 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local21) {
				local54 = (local14 - local30) / (-local32 + local46) + 4.0D;
			}
		}
		local54 /= 6.0D;
		if (this.anInt1915 < 0) {
			this.anInt1915 = 0;
		} else if (this.anInt1915 > 255) {
			this.anInt1915 = 255;
		}
		if (local66 > 0.5D) {
			this.anInt1917 = (int) ((1.0D - local66) * local74 * 512.0D);
		} else {
			this.anInt1917 = (int) (local66 * local74 * 512.0D);
		}
		this.anInt1921 = (int) (local74 * 256.0D);
		if (this.anInt1917 < 1) {
			this.anInt1917 = 1;
		}
		this.anInt1916 = (int) (local54 * (double) this.anInt1917);
		if (this.anInt1921 < 0) {
			this.anInt1921 = 0;
		} else if (this.anInt1921 > 255) {
			this.anInt1921 = 255;
			return;
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(Z)V")
	public void method1327() {
		this.method1325(this.anInt1925);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BILclient!ba;)V")
	public void method1330(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method791();
			if (local5 == 0) {
				return;
			}
			this.method1332(local5, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BILclient!ba;I)V")
	private void method1332(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub3 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt1925 = arg1.method811();
		}
	}
}
