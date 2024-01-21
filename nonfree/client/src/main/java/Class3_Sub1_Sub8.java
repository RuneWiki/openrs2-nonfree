import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class3_Sub1_Sub8 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
	public int anInt1013;

	@OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
	public int anInt1016;

	@OriginalMember(owner = "client!ge", name = "fb", descriptor = "I")
	public int anInt1019;

	@OriginalMember(owner = "client!ge", name = "rb", descriptor = "I")
	public int anInt1024;

	@OriginalMember(owner = "client!ge", name = "ob", descriptor = "I")
	private int anInt1022 = 0;

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)V")
	public void method624() {
		this.method626(this.anInt1022);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
	private void method626(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(23) double local23 = local14;
		@Pc(25) double local25 = local14;
		@Pc(34) double local34 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		if (local14 > local34) {
			local23 = local34;
		}
		if (local21 < local23) {
			local23 = local21;
		}
		if (local34 > local14) {
			local25 = local34;
		}
		if (local25 < local21) {
			local25 = local21;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(66) double local66 = (local23 + local25) / 2.0D;
		this.anInt1024 = (int) (local66 * 256.0D);
		@Pc(74) double local74 = 0.0D;
		if (local23 != local25) {
			if (local25 == local14) {
				local60 = (local34 - local21) / (-local23 + local25);
			} else if (local25 == local34) {
				local60 = (local21 - local14) / (local25 - local23) + 2.0D;
			} else if (local21 == local25) {
				local60 = (local14 - local34) / (local25 - local23) + 4.0D;
			}
			if (local66 < 0.5D) {
				local74 = (local25 - local23) / (local23 + local25);
			}
			if (local66 >= 0.5D) {
				local74 = (local25 - local23) / (2.0D - local25 - local23);
			}
		}
		local60 /= 6.0D;
		if (local66 > 0.5D) {
			this.anInt1016 = (int) ((1.0D - local66) * 512.0D * local74);
		} else {
			this.anInt1016 = (int) (local66 * local74 * 512.0D);
		}
		if (this.anInt1024 < 0) {
			this.anInt1024 = 0;
		} else if (this.anInt1024 > 255) {
			this.anInt1024 = 255;
		}
		if (this.anInt1016 < 1) {
			this.anInt1016 = 1;
		}
		this.anInt1013 = (int) (local74 * 256.0D);
		if (this.anInt1013 < 0) {
			this.anInt1013 = 0;
		} else if (this.anInt1013 > 255) {
			this.anInt1013 = 255;
		}
		this.anInt1019 = (int) ((double) this.anInt1016 * local60);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!kd;IB)V")
	public void method629(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(13) int local13 = arg0.method1803();
			if (local13 == 0) {
				return;
			}
			this.method630(arg0, arg1, local13);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!kd;III)V")
	private void method630(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt1022 = arg0.method1786();
		}
	}
}
