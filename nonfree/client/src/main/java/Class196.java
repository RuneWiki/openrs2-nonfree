import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class196 {

	@OriginalMember(owner = "client!u", name = "c", descriptor = "[Lclient!tl;")
	private final Class193[] aClass193Array1 = new Class193[10];

	@OriginalMember(owner = "client!u", name = "b", descriptor = "I")
	private int anInt5987;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "I")
	private int anInt5986;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!bk;)V")
	public Class196(@OriginalArg(0) Class5_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1832();
			if (local12 != 0) {
				arg0.anInt2029--;
				this.aClass193Array1[local7] = new Class193();
				this.aClass193Array1[local7].method5249(arg0);
			}
		}
		this.anInt5987 = arg0.method1845();
		this.anInt5986 = arg0.method1845();
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	private Class196() {
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "()Lclient!fp;")
	public Class5_Sub15_Sub1 method5322() {
		@Pc(2) byte[] local2 = this.method5325();
		return new Class5_Sub15_Sub1(22050, local2, this.anInt5987 * 22050 / 1000, this.anInt5986 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "()I")
	public int method5323() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass193Array1[local3] != null && this.aClass193Array1[local3].anInt5910 / 20 < local1) {
				local1 = this.aClass193Array1[local3].anInt5910 / 20;
			}
		}
		if (this.anInt5987 < this.anInt5986 && this.anInt5987 / 20 < local1) {
			local1 = this.anInt5987 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass193Array1[local55] != null) {
				this.aClass193Array1[local55].anInt5910 -= local1 * 20;
			}
		}
		if (this.anInt5987 < this.anInt5986) {
			this.anInt5987 -= local1 * 20;
			this.anInt5986 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "()[B")
	private byte[] method5325() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass193Array1[local3] != null && this.aClass193Array1[local3].anInt5909 + this.aClass193Array1[local3].anInt5910 > local1) {
				local1 = this.aClass193Array1[local3].anInt5909 + this.aClass193Array1[local3].anInt5910;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass193Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass193Array1[local54].anInt5909 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass193Array1[local54].anInt5910 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass193Array1[local54].method5247(local70, this.aClass193Array1[local54].anInt5909);
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
}
