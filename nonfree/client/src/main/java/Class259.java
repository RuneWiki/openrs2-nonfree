import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oia")
public final class Class259 {

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "[Lclient!aea;")
	private final Class8[] aClass8Array1 = new Class8[10];

	@OriginalMember(owner = "client!oia", name = "c", descriptor = "I")
	private int anInt7549;

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "I")
	private int anInt7548;

	@OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(Lclient!rv;)V")
	public Class259(@OriginalArg(0) Class5_Sub15 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method3642();
			if (local12 != 0) {
				arg0.anInt4144--;
				this.aClass8Array1[local7] = new Class8();
				this.aClass8Array1[local7].method167(arg0);
			}
		}
		this.anInt7549 = arg0.method3698();
		this.anInt7548 = arg0.method3698();
	}

	@OriginalMember(owner = "client!oia", name = "<init>", descriptor = "()V")
	private Class259() {
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "()I")
	public int method6431() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass8Array1[local3] != null && this.aClass8Array1[local3].anInt173 / 20 < local1) {
				local1 = this.aClass8Array1[local3].anInt173 / 20;
			}
		}
		if (this.anInt7549 < this.anInt7548 && this.anInt7549 / 20 < local1) {
			local1 = this.anInt7549 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass8Array1[local55] != null) {
				this.aClass8Array1[local55].anInt173 -= local1 * 20;
			}
		}
		if (this.anInt7549 < this.anInt7548) {
			this.anInt7549 -= local1 * 20;
			this.anInt7548 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "()[B")
	private byte[] method6433() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass8Array1[local3] != null && this.aClass8Array1[local3].anInt174 + this.aClass8Array1[local3].anInt173 > local1) {
				local1 = this.aClass8Array1[local3].anInt174 + this.aClass8Array1[local3].anInt173;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass8Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass8Array1[local54].anInt174 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass8Array1[local54].anInt173 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass8Array1[local54].method168(local70, this.aClass8Array1[local54].anInt174);
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

	@OriginalMember(owner = "client!oia", name = "c", descriptor = "()Lclient!bc;")
	public Class5_Sub9_Sub1 method6434() {
		@Pc(2) byte[] local2 = this.method6433();
		return new Class5_Sub9_Sub1(22050, local2, this.anInt7549 * 22050 / 1000, this.anInt7548 * 22050 / 1000);
	}
}
