import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class110 {

	@OriginalMember(owner = "client!in", name = "c", descriptor = "[Lclient!kq;")
	private final Class136[] aClass136Array1 = new Class136[10];

	@OriginalMember(owner = "client!in", name = "a", descriptor = "I")
	private int anInt3376;

	@OriginalMember(owner = "client!in", name = "b", descriptor = "I")
	private int anInt3377;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!wn;)V")
	public Class110(@OriginalArg(0) Class4_Sub20 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method4614();
			if (local12 != 0) {
				arg0.anInt5526--;
				this.aClass136Array1[local7] = new Class136();
				this.aClass136Array1[local7].method3701(arg0);
			}
		}
		this.anInt3376 = arg0.method4560();
		this.anInt3377 = arg0.method4560();
	}

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
	private Class110() {
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "()[B")
	private byte[] method3022() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass136Array1[local3] != null && this.aClass136Array1[local3].anInt4288 + this.aClass136Array1[local3].anInt4286 > local1) {
				local1 = this.aClass136Array1[local3].anInt4288 + this.aClass136Array1[local3].anInt4286;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass136Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass136Array1[local54].anInt4288 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass136Array1[local54].anInt4286 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass136Array1[local54].method3702(local70, this.aClass136Array1[local54].anInt4288);
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

	@OriginalMember(owner = "client!in", name = "b", descriptor = "()Lclient!cv;")
	public Class4_Sub9_Sub1 method3023() {
		@Pc(2) byte[] local2 = this.method3022();
		return new Class4_Sub9_Sub1(22050, local2, this.anInt3376 * 22050 / 1000, this.anInt3377 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "()I")
	public int method3024() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass136Array1[local3] != null && this.aClass136Array1[local3].anInt4286 / 20 < local1) {
				local1 = this.aClass136Array1[local3].anInt4286 / 20;
			}
		}
		if (this.anInt3376 < this.anInt3377 && this.anInt3376 / 20 < local1) {
			local1 = this.anInt3376 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass136Array1[local55] != null) {
				this.aClass136Array1[local55].anInt4286 -= local1 * 20;
			}
		}
		if (this.anInt3376 < this.anInt3377) {
			this.anInt3376 -= local1 * 20;
			this.anInt3377 -= local1 * 20;
		}
		return local1;
	}
}
