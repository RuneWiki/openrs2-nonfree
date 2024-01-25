import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public final class Class208 {

	@OriginalMember(owner = "client!lda", name = "j", descriptor = "I")
	public int anInt6177;

	@OriginalMember(owner = "client!lda", name = "l", descriptor = "I")
	public int anInt6179;

	@OriginalMember(owner = "client!lda", name = "m", descriptor = "I")
	public int anInt6180;

	@OriginalMember(owner = "client!lda", name = "p", descriptor = "I")
	public int anInt6183;

	@OriginalMember(owner = "client!lda", name = "h", descriptor = "I")
	public int anInt6175 = 512;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "Z")
	public boolean aBoolean429 = true;

	@OriginalMember(owner = "client!lda", name = "n", descriptor = "I")
	private int anInt6181 = 0;

	@OriginalMember(owner = "client!lda", name = "k", descriptor = "I")
	public int anInt6178 = -1;

	@OriginalMember(owner = "client!lda", name = "q", descriptor = "Z")
	public boolean aBoolean430 = true;

	static {
		new BitSet(65536);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)V")
	private void method5120(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local32 - local46);
			}
		}
		this.anInt6183 = (int) (local62 * 256.0D);
		this.anInt6180 = (int) (local68 * 256.0D);
		local60 /= 6.0D;
		if (this.anInt6183 < 0) {
			this.anInt6183 = 0;
		} else if (this.anInt6183 > 255) {
			this.anInt6183 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt6177 = (int) ((1.0D - local68) * local62 * 512.0D);
		} else {
			this.anInt6177 = (int) (local62 * 512.0D * local68);
		}
		if (this.anInt6180 < 0) {
			this.anInt6180 = 0;
		} else if (this.anInt6180 > 255) {
			this.anInt6180 = 255;
		}
		if (this.anInt6177 < 1) {
			this.anInt6177 = 1;
		}
		this.anInt6179 = (int) (local60 * (double) this.anInt6177);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IILclient!so;)V")
	private void method5121(@OriginalArg(0) int arg0, @OriginalArg(2) Class14_Sub29 arg1) {
		if (arg0 == 1) {
			this.anInt6181 = arg1.method5862();
			this.method5120(this.anInt6181);
		} else if (arg0 == 2) {
			this.anInt6178 = arg1.method5900();
			if (this.anInt6178 == 65535) {
				this.anInt6178 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt6175 = arg1.method5900() << 2;
		} else if (arg0 == 4) {
			this.aBoolean429 = false;
		} else if (arg0 == 5) {
			this.aBoolean430 = false;
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lclient!so;I)V")
	public void method5123(@OriginalArg(0) Class14_Sub29 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5866();
			if (local13 == 0) {
				return;
			}
			this.method5121(local13, arg0);
		}
	}
}
