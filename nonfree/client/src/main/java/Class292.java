import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class292 {

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "[Lclient!os;")
	private final Class277[] aClass277Array1 = new Class277[10];

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
	private int anInt8574;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
	private int anInt8575;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class292(@OriginalArg(0) Class3_Sub28 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method5322(-89);
			if (local12 != 0) {
				arg0.anInt6241--;
				this.aClass277Array1[local7] = new Class277();
				this.aClass277Array1[local7].method6930(arg0);
			}
		}
		this.anInt8574 = arg0.method5272();
		this.anInt8575 = arg0.method5272();
	}

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "()V")
	private Class292() {
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "()I")
	public int method7194() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass277Array1[local3] != null && this.aClass277Array1[local3].anInt8236 / 20 < local1) {
				local1 = this.aClass277Array1[local3].anInt8236 / 20;
			}
		}
		if (this.anInt8574 < this.anInt8575 && this.anInt8574 / 20 < local1) {
			local1 = this.anInt8574 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass277Array1[local55] != null) {
				this.aClass277Array1[local55].anInt8236 -= local1 * 20;
			}
		}
		if (this.anInt8574 < this.anInt8575) {
			this.anInt8574 -= local1 * 20;
			this.anInt8575 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "()Lclient!mca;")
	public Class3_Sub33_Sub1 method7195() {
		@Pc(2) byte[] local2 = this.method7196();
		return new Class3_Sub33_Sub1(22050, local2, this.anInt8574 * 22050 / 1000, this.anInt8575 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "()[B")
	private byte[] method7196() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass277Array1[local3] != null && this.aClass277Array1[local3].anInt8237 + this.aClass277Array1[local3].anInt8236 > local1) {
				local1 = this.aClass277Array1[local3].anInt8237 + this.aClass277Array1[local3].anInt8236;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass277Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass277Array1[local54].anInt8237 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass277Array1[local54].anInt8236 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass277Array1[local54].method6931(local70, this.aClass277Array1[local54].anInt8237);
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
