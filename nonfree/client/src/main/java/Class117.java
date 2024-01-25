import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class117 {

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "[Lclient!rha;")
	private final Class302[] aClass302Array1 = new Class302[10];

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
	private int anInt3048;

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
	private int anInt3049;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!ofa;)V")
	public Class117(@OriginalArg(0) Class5_Sub22 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method5966();
			if (local12 != 0) {
				arg0.anInt6629--;
				this.aClass302Array1[local7] = new Class302();
				this.aClass302Array1[local7].method7196(arg0);
			}
		}
		this.anInt3048 = arg0.method5968();
		this.anInt3049 = arg0.method5968();
	}

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
	private Class117() {
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "()Lclient!so;")
	public Class5_Sub37_Sub1 method2663() {
		@Pc(2) byte[] local2 = this.method2666();
		return new Class5_Sub37_Sub1(22050, local2, this.anInt3048 * 22050 / 1000, this.anInt3049 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "()I")
	public int method2665() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass302Array1[local3] != null && this.aClass302Array1[local3].anInt8273 / 20 < local1) {
				local1 = this.aClass302Array1[local3].anInt8273 / 20;
			}
		}
		if (this.anInt3048 < this.anInt3049 && this.anInt3048 / 20 < local1) {
			local1 = this.anInt3048 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass302Array1[local55] != null) {
				this.aClass302Array1[local55].anInt8273 -= local1 * 20;
			}
		}
		if (this.anInt3048 < this.anInt3049) {
			this.anInt3048 -= local1 * 20;
			this.anInt3049 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "()[B")
	private byte[] method2666() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass302Array1[local3] != null && this.aClass302Array1[local3].anInt8272 + this.aClass302Array1[local3].anInt8273 > local1) {
				local1 = this.aClass302Array1[local3].anInt8272 + this.aClass302Array1[local3].anInt8273;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass302Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass302Array1[local54].anInt8272 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass302Array1[local54].anInt8273 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass302Array1[local54].method7195(local70, this.aClass302Array1[local54].anInt8272);
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
