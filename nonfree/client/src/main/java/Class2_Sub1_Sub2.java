import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ba", name = "X", descriptor = "I")
	public int anInt223;

	@OriginalMember(owner = "client!ba", name = "Y", descriptor = "I")
	public int anInt224;

	@OriginalMember(owner = "client!ba", name = "ab", descriptor = "I")
	public int anInt226;

	@OriginalMember(owner = "client!ba", name = "hb", descriptor = "I")
	public int anInt230;

	@OriginalMember(owner = "client!ba", name = "db", descriptor = "I")
	private int anInt227 = 0;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)V")
	private void method129(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		@Pc(34) double local34 = local14;
		if (local30 < local14) {
			local34 = local30;
		}
		if (local30 > local14) {
			local32 = local30;
		}
		if (local21 < local34) {
			local34 = local21;
		}
		if (local21 > local32) {
			local32 = local21;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(66) double local66 = (local34 + local32) / 2.0D;
		@Pc(68) double local68 = 0.0D;
		this.anInt223 = (int) (local66 * 256.0D);
		if (local32 != local34) {
			if (local66 < 0.5D) {
				local68 = (local32 - local34) / (local34 + local32);
			}
			if (local66 >= 0.5D) {
				local68 = (local32 - local34) / (2.0D - local34 - local32);
			}
			if (local14 == local32) {
				local60 = (local30 - local21) / (-local34 + local32);
			} else if (local32 == local30) {
				local60 = (local21 - local14) / (local32 - local34) + 2.0D;
			} else if (local32 == local21) {
				local60 = (local14 - local30) / (local32 - local34) + 4.0D;
			}
		}
		if (this.anInt223 < 0) {
			this.anInt223 = 0;
		} else if (this.anInt223 > 255) {
			this.anInt223 = 255;
		}
		local60 /= 6.0D;
		if (local66 > 0.5D) {
			this.anInt224 = (int) ((1.0D - local66) * local68 * 512.0D);
		} else {
			this.anInt224 = (int) (local68 * local66 * 512.0D);
		}
		this.anInt226 = (int) (local68 * 256.0D);
		if (this.anInt226 < 0) {
			this.anInt226 = 0;
		} else if (this.anInt226 > 255) {
			this.anInt226 = 255;
		}
		if (this.anInt224 < 1) {
			this.anInt224 = 1;
		}
		this.anInt230 = (int) ((double) this.anInt224 * local60);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIILclient!wb;)V")
	private void method130(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub17 arg2) {
		if (arg1 == 1) {
			this.anInt227 = arg2.method1795();
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILclient!wb;)V")
	public void method131(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		while (true) {
			@Pc(15) int local15 = arg1.method1780();
			if (local15 == 0) {
				return;
			}
			this.method130(arg0, local15, arg1);
		}
	}

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "(B)V")
	public void method135() {
		this.method129(this.anInt227);
	}
}
