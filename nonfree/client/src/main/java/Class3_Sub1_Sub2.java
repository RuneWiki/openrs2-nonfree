import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
	public int anInt94;

	@OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
	public int anInt95;

	@OriginalMember(owner = "client!ad", name = "W", descriptor = "I")
	public int anInt100;

	@OriginalMember(owner = "client!ad", name = "Z", descriptor = "I")
	public int anInt103;

	@OriginalMember(owner = "client!ad", name = "ab", descriptor = "I")
	private int anInt104 = -1;

	@OriginalMember(owner = "client!ad", name = "X", descriptor = "I")
	private int anInt101 = 0;

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "(I)V")
	public void method62() {
		this.method64(this.anInt101);
		Static109.method1953(this.anInt95 * 256 / this.anInt94, this.anInt103, this.anInt100);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ff;IB)V")
	public void method63(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(14) int local14 = arg0.method1354();
			if (local14 == 0) {
				return;
			}
			this.method66(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)V")
	private void method64(@OriginalArg(0) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(25) double local25 = local10;
		if (local10 > local23) {
			local25 = local23;
		}
		@Pc(33) double local33 = local10;
		@Pc(40) double local40 = (double) (arg0 & 0xFF) / 256.0D;
		if (local23 > local10) {
			local33 = local23;
		}
		if (local40 > local33) {
			local33 = local40;
		}
		if (local25 > local40) {
			local25 = local40;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local25 + local33) / 2.0D;
		this.anInt103 = (int) (local68 * 256.0D);
		if (local33 != local25) {
			if (local10 == local33) {
				local60 = (local23 - local40) / (-local25 + local33);
			} else if (local23 == local33) {
				local60 = (local40 - local10) / (-local25 + local33) + 2.0D;
			} else if (local33 == local40) {
				local60 = (local10 - local23) / (-local25 + local33) + 4.0D;
			}
			if (local68 < 0.5D) {
				local62 = (local33 - local25) / (local25 + local33);
			}
			if (local68 >= 0.5D) {
				local62 = (local33 - local25) / (2.0D - local33 - local25);
			}
		}
		this.anInt100 = (int) (local62 * 256.0D);
		local60 /= 6.0D;
		if (this.anInt100 < 0) {
			this.anInt100 = 0;
		} else if (this.anInt100 > 255) {
			this.anInt100 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt94 = (int) ((1.0D - local68) * 512.0D * local62);
		} else {
			this.anInt94 = (int) (local68 * 512.0D * local62);
		}
		if (this.anInt94 < 1) {
			this.anInt94 = 1;
		}
		if (this.anInt103 < 0) {
			this.anInt103 = 0;
		} else if (this.anInt103 > 255) {
			this.anInt103 = 255;
		}
		this.anInt95 = (int) ((double) this.anInt94 * local60);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!ff;II)V")
	private void method66(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub12 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			this.anInt101 = arg1.method1376();
		} else if (arg0 == 2) {
			this.anInt104 = arg1.method1359();
			if (this.anInt104 == 65535) {
				this.anInt104 = -1;
			}
		} else if (arg0 == 3) {
			arg1.method1359();
		}
	}
}
