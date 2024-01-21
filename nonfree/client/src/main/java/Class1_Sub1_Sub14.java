import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sa", name = "eb", descriptor = "I")
	public int anInt2163;

	@OriginalMember(owner = "client!sa", name = "gb", descriptor = "I")
	public int anInt2165;

	@OriginalMember(owner = "client!sa", name = "wb", descriptor = "I")
	public int anInt2174;

	@OriginalMember(owner = "client!sa", name = "Db", descriptor = "I")
	public int anInt2179;

	@OriginalMember(owner = "client!sa", name = "Eb", descriptor = "I")
	private int anInt2180 = 0;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZLclient!id;)V")
	public void method1562(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		while (true) {
			@Pc(14) int local14 = arg1.method1837();
			if (local14 == 0) {
				return;
			}
			this.method1564(arg0, local14, arg1);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIILclient!id;)V")
	private void method1564(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub6 arg2) {
		if (arg1 == 1) {
			this.anInt2180 = arg2.method1868();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)V")
	private void method1566(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = 0.0D;
		@Pc(34) double local34 = 0.0D;
		@Pc(36) double local36 = local14;
		@Pc(38) double local38 = local14;
		if (local14 < local23) {
			local38 = local23;
		}
		if (local23 < local14) {
			local36 = local23;
		}
		if (local38 < local30) {
			local38 = local30;
		}
		if (local36 > local30) {
			local36 = local30;
		}
		@Pc(73) double local73 = (local38 + local36) / 2.0D;
		this.anInt2174 = (int) (local73 * 256.0D);
		if (local36 != local38) {
			if (local14 == local38) {
				local32 = (local23 - local30) / (local38 - local36);
			} else if (local38 == local23) {
				local32 = (local30 - local14) / (local38 - local36) + 2.0D;
			} else if (local30 == local38) {
				local32 = (local14 - local23) / (local38 - local36) + 4.0D;
			}
			if (local73 < 0.5D) {
				local34 = (local38 - local36) / (local38 + local36);
			}
			if (local73 >= 0.5D) {
				local34 = (local38 - local36) / (2.0D - local38 - local36);
			}
		}
		if (this.anInt2174 < 0) {
			this.anInt2174 = 0;
		} else if (this.anInt2174 > 255) {
			this.anInt2174 = 255;
		}
		if (local73 > 0.5D) {
			this.anInt2163 = (int) (local34 * 512.0D * (1.0D - local73));
		} else {
			this.anInt2163 = (int) (local73 * 512.0D * local34);
		}
		local32 /= 6.0D;
		this.anInt2165 = (int) (local34 * 256.0D);
		if (this.anInt2165 < 0) {
			this.anInt2165 = 0;
		} else if (this.anInt2165 > 255) {
			this.anInt2165 = 255;
		}
		if (this.anInt2163 < 1) {
			this.anInt2163 = 1;
		}
		this.anInt2179 = (int) (local32 * (double) this.anInt2163);
	}

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "(I)V")
	public void method1568() {
		this.method1566(this.anInt2180);
	}
}
