import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uia")
public final class Class354 {

	@OriginalMember(owner = "client!uia", name = "b", descriptor = "[Lclient!kga;")
	private final Class198[] aClass198Array1 = new Class198[10];

	@OriginalMember(owner = "client!uia", name = "c", descriptor = "I")
	private int anInt10208;

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "I")
	private int anInt10207;

	@OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(Lclient!so;)V")
	public Class354(@OriginalArg(0) Class14_Sub29 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method5866();
			if (local12 != 0) {
				arg0.anInt7264--;
				this.aClass198Array1[local7] = new Class198();
				this.aClass198Array1[local7].method4418(arg0);
			}
		}
		this.anInt10208 = arg0.method5900();
		this.anInt10207 = arg0.method5900();
	}

	@OriginalMember(owner = "client!uia", name = "<init>", descriptor = "()V")
	private Class354() {
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "()I")
	public int method8491() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass198Array1[local3] != null && this.aClass198Array1[local3].anInt5276 / 20 < local1) {
				local1 = this.aClass198Array1[local3].anInt5276 / 20;
			}
		}
		if (this.anInt10208 < this.anInt10207 && this.anInt10208 / 20 < local1) {
			local1 = this.anInt10208 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass198Array1[local55] != null) {
				this.aClass198Array1[local55].anInt5276 -= local1 * 20;
			}
		}
		if (this.anInt10208 < this.anInt10207) {
			this.anInt10208 -= local1 * 20;
			this.anInt10207 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!uia", name = "b", descriptor = "()[B")
	private byte[] method8492() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass198Array1[local3] != null && this.aClass198Array1[local3].anInt5277 + this.aClass198Array1[local3].anInt5276 > local1) {
				local1 = this.aClass198Array1[local3].anInt5277 + this.aClass198Array1[local3].anInt5276;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass198Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass198Array1[local54].anInt5277 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass198Array1[local54].anInt5276 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass198Array1[local54].method4419(local70, this.aClass198Array1[local54].anInt5277);
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

	@OriginalMember(owner = "client!uia", name = "c", descriptor = "()Lclient!dga;")
	public Class14_Sub14_Sub1 method8493() {
		@Pc(2) byte[] local2 = this.method8492();
		return new Class14_Sub14_Sub1(22050, local2, this.anInt10208 * 22050 / 1000, this.anInt10207 * 22050 / 1000);
	}
}
