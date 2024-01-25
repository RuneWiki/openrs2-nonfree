import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class341 {

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "[Lclient!sp;")
	private final Class335[] aClass335Array1 = new Class335[10];

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
	private int anInt8685;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
	private int anInt8684;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class341(@OriginalArg(0) Class4_Sub11 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method8865();
			if (local12 != 0) {
				arg0.anInt10466--;
				this.aClass335Array1[local7] = new Class335();
				this.aClass335Array1[local7].method7398(arg0);
			}
		}
		this.anInt8685 = arg0.method8859();
		this.anInt8684 = arg0.method8859();
	}

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	private Class341() {
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "()I")
	public int method7488() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass335Array1[local3] != null && this.aClass335Array1[local3].anInt8577 / 20 < local1) {
				local1 = this.aClass335Array1[local3].anInt8577 / 20;
			}
		}
		if (this.anInt8685 < this.anInt8684 && this.anInt8685 / 20 < local1) {
			local1 = this.anInt8685 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass335Array1[local55] != null) {
				this.aClass335Array1[local55].anInt8577 -= local1 * 20;
			}
		}
		if (this.anInt8685 < this.anInt8684) {
			this.anInt8685 -= local1 * 20;
			this.anInt8684 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "()[B")
	private byte[] method7489() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass335Array1[local3] != null && this.aClass335Array1[local3].anInt8576 + this.aClass335Array1[local3].anInt8577 > local1) {
				local1 = this.aClass335Array1[local3].anInt8576 + this.aClass335Array1[local3].anInt8577;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass335Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass335Array1[local54].anInt8576 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass335Array1[local54].anInt8577 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass335Array1[local54].method7396(local70, this.aClass335Array1[local54].anInt8576);
				for (@Pc(94) int local94 = 0; local94 < local70; local94++) {
					@Pc(107) int local107 = local52[local94 + local80] + (local92[local94] >> 8);
					if ((local107 + 128 & 0xFFFFFF00) != 0) {
						local107 = local107 >> 31 ^ 0x7F;
					}
					local52[local94 + local80] = (byte) local107;
				}
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "()Lclient!aia;")
	public Class4_Sub4_Sub1 method7490() {
		@Pc(2) byte[] local2 = this.method7489();
		return new Class4_Sub4_Sub1(22050, local2, this.anInt8685 * 22050 / 1000, this.anInt8684 * 22050 / 1000);
	}
}
