import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class136 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	public int anInt4935;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
	public int anInt4941;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
	public int anInt4942;

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
	public int anInt4949;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	public int anInt4939 = -1;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
	public int anInt4940 = 128;

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "Z")
	public boolean aBoolean271 = true;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
	private int anInt4946 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)V")
	private void method3922(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(25) double local25 = local14;
		@Pc(32) double local32 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(34) double local34 = local14;
		if (local23 < local14) {
			local25 = local23;
		}
		@Pc(43) double local43 = 0.0D;
		@Pc(51) double local51 = 0.0D;
		if (local23 > local14) {
			local34 = local23;
		}
		if (local34 < local32) {
			local34 = local32;
		}
		if (local25 > local32) {
			local25 = local32;
		}
		@Pc(77) double local77 = (local34 + local25) / 2.0D;
		if (local34 != local25) {
			if (local77 < 0.5D) {
				local43 = (local34 - local25) / (local34 + local25);
			}
			if (local14 == local34) {
				local51 = (local23 - local32) / (local34 - local25);
			} else if (local34 == local23) {
				local51 = (local32 - local14) / (local34 - local25) + 2.0D;
			} else if (local32 == local34) {
				local51 = (local14 - local23) / (local34 - local25) + 4.0D;
			}
			if (local77 >= 0.5D) {
				local43 = (local34 - local25) / (2.0D - local34 - local25);
			}
		}
		this.anInt4942 = (int) (local43 * 256.0D);
		this.anInt4949 = (int) (local77 * 256.0D);
		if (local77 > 0.5D) {
			this.anInt4941 = (int) ((1.0D - local77) * local43 * 512.0D);
		} else {
			this.anInt4941 = (int) (local77 * local43 * 512.0D);
		}
		if (this.anInt4942 < 0) {
			this.anInt4942 = 0;
		} else if (this.anInt4942 > 255) {
			this.anInt4942 = 255;
		}
		if (this.anInt4941 < 1) {
			this.anInt4941 = 1;
		}
		if (this.anInt4949 < 0) {
			this.anInt4949 = 0;
		} else if (this.anInt4949 > 255) {
			this.anInt4949 = 255;
		}
		local51 /= 6.0D;
		this.anInt4935 = (int) ((double) this.anInt4941 * local51);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILclient!im;)V")
	private void method3924(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub16 arg2) {
		if (arg1 == 1) {
			this.anInt4946 = arg2.method2634();
			this.method3922(this.anInt4946);
		} else if (arg1 == 2) {
			this.anInt4939 = arg2.method2652();
			if (this.anInt4939 == 65535) {
				this.anInt4939 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt4940 = arg2.method2652();
		} else if (arg1 == 4) {
			this.aBoolean271 = false;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!im;II)V")
	public void method3925(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(13) int local13 = arg0.method2655();
			if (local13 == 0) {
				return;
			}
			this.method3924(arg1, local13, arg0);
		}
	}
}
