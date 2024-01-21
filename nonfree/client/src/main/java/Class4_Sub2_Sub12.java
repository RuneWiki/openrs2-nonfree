import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class4_Sub2_Sub12 extends Class4_Sub2 {

	@OriginalMember(owner = "client!of", name = "X", descriptor = "I")
	public int anInt2189;

	@OriginalMember(owner = "client!of", name = "bb", descriptor = "I")
	public int anInt2191;

	@OriginalMember(owner = "client!of", name = "hb", descriptor = "I")
	public int anInt2196;

	@OriginalMember(owner = "client!of", name = "lb", descriptor = "I")
	public int anInt2197;

	@OriginalMember(owner = "client!of", name = "ob", descriptor = "I")
	public int anInt2200;

	@OriginalMember(owner = "client!of", name = "pb", descriptor = "I")
	public int anInt2201;

	@OriginalMember(owner = "client!of", name = "gb", descriptor = "I")
	public int anInt2195 = -1;

	@OriginalMember(owner = "client!of", name = "W", descriptor = "I")
	public int anInt2188 = -1;

	@OriginalMember(owner = "client!of", name = "fb", descriptor = "Z")
	public boolean aBoolean110 = true;

	@OriginalMember(owner = "client!of", name = "rb", descriptor = "I")
	public int anInt2203 = 0;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(B)V")
	public void method1606() {
		if (this.anInt2195 != -1) {
			this.method1609(this.anInt2195);
			this.anInt2191 = this.anInt2189;
			this.anInt2196 = this.anInt2200;
			this.anInt2201 = this.anInt2197;
		}
		this.method1609(this.anInt2203);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BIILclient!s;)V")
	private void method1607(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub16 arg2) {
		if (arg1 == 1) {
			this.anInt2203 = arg2.method1475();
		} else if (arg1 == 2) {
			this.anInt2188 = arg2.method1474();
		} else if (arg1 == 5) {
			this.aBoolean110 = false;
		} else if (arg1 == 7) {
			this.anInt2195 = arg2.method1475();
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLclient!s;I)V")
	public void method1608(@OriginalArg(1) Class4_Sub16 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method1474();
			if (local9 == 0) {
				return;
			}
			this.method1607(arg1, local9, arg0);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)V")
	private void method1609(@OriginalArg(1) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(19) double local19 = local10;
		@Pc(32) double local32 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		if (local32 < local10) {
			local19 = local32;
		}
		@Pc(40) double local40 = local10;
		if (local32 > local10) {
			local40 = local32;
		}
		if (local40 < local17) {
			local40 = local17;
		}
		if (local19 > local17) {
			local19 = local17;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local40 + local19) / 2.0D;
		if (local19 != local40) {
			if (local10 == local40) {
				local60 = (local32 - local17) / (local40 - local19);
			} else if (local32 == local40) {
				local60 = (local17 - local10) / (-local19 + local40) + 2.0D;
			} else if (local17 == local40) {
				local60 = (local10 - local32) / (local40 - local19) + 4.0D;
			}
			if (local68 < 0.5D) {
				local62 = (local40 - local19) / (local19 + local40);
			}
			if (local68 >= 0.5D) {
				local62 = (local40 - local19) / ((2.0D - local40) - local19);
			}
		}
		local60 /= 6.0D;
		this.anInt2200 = (int) (local60 * 256.0D);
		this.anInt2189 = (int) (local62 * 256.0D);
		if (this.anInt2189 < 0) {
			this.anInt2189 = 0;
		} else if (this.anInt2189 > 255) {
			this.anInt2189 = 255;
		}
		this.anInt2197 = (int) (local68 * 256.0D);
		if (this.anInt2197 < 0) {
			this.anInt2197 = 0;
		} else if (this.anInt2197 > 255) {
			this.anInt2197 = 255;
		}
	}
}
