import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!v", name = "db", descriptor = "I")
	public int anInt2813;

	@OriginalMember(owner = "client!v", name = "gb", descriptor = "I")
	public int anInt2814;

	@OriginalMember(owner = "client!v", name = "ib", descriptor = "I")
	public int anInt2816;

	@OriginalMember(owner = "client!v", name = "pb", descriptor = "I")
	public int anInt2822;

	@OriginalMember(owner = "client!v", name = "ub", descriptor = "I")
	public int anInt2824;

	@OriginalMember(owner = "client!v", name = "wb", descriptor = "I")
	public int anInt2826;

	@OriginalMember(owner = "client!v", name = "bb", descriptor = "I")
	public int anInt2812 = -1;

	@OriginalMember(owner = "client!v", name = "ob", descriptor = "I")
	public int anInt2821 = -1;

	@OriginalMember(owner = "client!v", name = "tb", descriptor = "Z")
	public boolean aBoolean118 = true;

	@OriginalMember(owner = "client!v", name = "mb", descriptor = "I")
	public int anInt2819 = 0;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)V")
	private void method1985(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local23;
		if (local14 < local23) {
			local32 = local14;
		}
		@Pc(48) double local48 = local23;
		@Pc(50) double local50 = 0.0D;
		if (local30 < local32) {
			local32 = local30;
		}
		if (local23 < local14) {
			local48 = local14;
		}
		if (local48 < local30) {
			local48 = local30;
		}
		@Pc(74) double local74 = (local48 + local32) / 2.0D;
		@Pc(76) double local76 = 0.0D;
		if (local48 != local32) {
			if (local23 == local48) {
				local50 = (local14 - local30) / (local48 - local32);
			} else if (local14 == local48) {
				local50 = (local30 - local23) / (-local32 + local48) + 2.0D;
			} else if (local48 == local30) {
				local50 = (local23 - local14) / (local48 - local32) + 4.0D;
			}
			if (local74 < 0.5D) {
				local76 = (local48 - local32) / (local48 + local32);
			}
			if (local74 >= 0.5D) {
				local76 = (local48 - local32) / (2.0D - local32 - local48);
			}
		}
		this.anInt2822 = (int) (local74 * 256.0D);
		this.anInt2814 = (int) (local76 * 256.0D);
		local50 /= 6.0D;
		if (this.anInt2814 < 0) {
			this.anInt2814 = 0;
		} else if (this.anInt2814 > 255) {
			this.anInt2814 = 255;
		}
		this.anInt2816 = (int) (local50 * 256.0D);
		if (this.anInt2822 < 0) {
			this.anInt2822 = 0;
		} else if (this.anInt2822 > 255) {
			this.anInt2822 = 255;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IBLclient!mc;)V")
	public void method1986(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub12 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method1190();
			if (local9 == 0) {
				return;
			}
			this.method1988(arg1, arg0, local9);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BLclient!mc;II)V")
	private void method1988(@OriginalArg(1) Class1_Sub12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt2819 = arg0.method1215();
		} else if (arg2 == 2) {
			this.anInt2812 = arg0.method1190();
		} else if (arg2 == 5) {
			this.aBoolean118 = false;
		} else if (arg2 == 7) {
			this.anInt2821 = arg0.method1215();
		}
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(B)V")
	public void method1991() {
		if (this.anInt2821 != -1) {
			this.method1985(this.anInt2821);
			this.anInt2826 = this.anInt2816;
			this.anInt2813 = this.anInt2822;
			this.anInt2824 = this.anInt2814;
		}
		this.method1985(this.anInt2819);
	}
}
