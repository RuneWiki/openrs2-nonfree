import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class23 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "[Lclient!ah;")
	private final Class8[] aClass8Array1 = new Class8[10];

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!gk;)V")
	public Class23(@OriginalArg(0) Class7_Sub14 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method3981();
			if (local12 != 0) {
				arg0.anInt4989--;
				this.aClass8Array1[local7] = new Class8();
				this.aClass8Array1[local7].method47(arg0);
			}
		}
		this.anInt386 = arg0.method3943();
		this.anInt385 = arg0.method3943();
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "()I")
	public int method294() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass8Array1[local3] != null && this.aClass8Array1[local3].anInt52 / 20 < local1) {
				local1 = this.aClass8Array1[local3].anInt52 / 20;
			}
		}
		if (this.anInt386 < this.anInt385 && this.anInt386 / 20 < local1) {
			local1 = this.anInt386 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass8Array1[local55] != null) {
				this.aClass8Array1[local55].anInt52 -= local1 * 20;
			}
		}
		if (this.anInt386 < this.anInt385) {
			this.anInt386 -= local1 * 20;
			this.anInt385 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "()[B")
	private byte[] method296() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass8Array1[local3] != null && this.aClass8Array1[local3].anInt53 + this.aClass8Array1[local3].anInt52 > local1) {
				local1 = this.aClass8Array1[local3].anInt53 + this.aClass8Array1[local3].anInt52;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass8Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass8Array1[local54].anInt53 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass8Array1[local54].anInt52 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass8Array1[local54].method46(local70, this.aClass8Array1[local54].anInt53);
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

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "()Lclient!lv;")
	public Class7_Sub31_Sub1 method297() {
		@Pc(2) byte[] local2 = this.method296();
		return new Class7_Sub31_Sub1(22050, local2, this.anInt386 * 22050 / 1000, this.anInt385 * 22050 / 1000);
	}
}
