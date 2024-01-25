import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class277 {

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "[Lclient!al;")
	private final Class14[] aClass14Array1 = new Class14[10];

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "I")
	private int anInt7329;

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "I")
	private int anInt7328;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lclient!eh;)V")
	public Class277(@OriginalArg(0) Class4_Sub9 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method6015();
			if (local12 != 0) {
				arg0.anInt7219--;
				this.aClass14Array1[local7] = new Class14();
				this.aClass14Array1[local7].method300(arg0);
			}
		}
		this.anInt7329 = arg0.method5982();
		this.anInt7328 = arg0.method5982();
	}

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "()V")
	private Class277() {
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "()I")
	public int method6078() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass14Array1[local3] != null && this.aClass14Array1[local3].anInt265 / 20 < local1) {
				local1 = this.aClass14Array1[local3].anInt265 / 20;
			}
		}
		if (this.anInt7329 < this.anInt7328 && this.anInt7329 / 20 < local1) {
			local1 = this.anInt7329 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass14Array1[local55] != null) {
				this.aClass14Array1[local55].anInt265 -= local1 * 20;
			}
		}
		if (this.anInt7329 < this.anInt7328) {
			this.anInt7329 -= local1 * 20;
			this.anInt7328 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "()[B")
	private byte[] method6079() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass14Array1[local3] != null && this.aClass14Array1[local3].anInt263 + this.aClass14Array1[local3].anInt265 > local1) {
				local1 = this.aClass14Array1[local3].anInt263 + this.aClass14Array1[local3].anInt265;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass14Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass14Array1[local54].anInt263 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass14Array1[local54].anInt265 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass14Array1[local54].method302(local70, this.aClass14Array1[local54].anInt263);
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

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "()Lclient!fc;")
	public Class4_Sub16_Sub1 method6080() {
		@Pc(2) byte[] local2 = this.method6079();
		return new Class4_Sub16_Sub1(22050, local2, this.anInt7329 * 22050 / 1000, this.anInt7328 * 22050 / 1000);
	}
}
