import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class66 {

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "[Lclient!sa;")
	private final Class70[] aClass70Array1 = new Class70[10];

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
	private int anInt3095;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
	private int anInt3094;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!ff;)V")
	public Class66(@OriginalArg(0) Class3_Sub12 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1354();
			if (local12 != 0) {
				arg0.anInt1793--;
				this.aClass70Array1[local7] = new Class70();
				this.aClass70Array1[local7].method2391(arg0);
			}
		}
		this.anInt3095 = arg0.method1359();
		this.anInt3094 = arg0.method1359();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "()I")
	public int method2239() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass70Array1[local3] != null && this.aClass70Array1[local3].anInt3302 / 20 < local1) {
				local1 = this.aClass70Array1[local3].anInt3302 / 20;
			}
		}
		if (this.anInt3095 < this.anInt3094 && this.anInt3095 / 20 < local1) {
			local1 = this.anInt3095 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass70Array1[local55] != null) {
				this.aClass70Array1[local55].anInt3302 -= local1 * 20;
			}
		}
		if (this.anInt3095 < this.anInt3094) {
			this.anInt3095 -= local1 * 20;
			this.anInt3094 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "()Lclient!bb;")
	public Class3_Sub4_Sub1 method2240() {
		@Pc(2) byte[] local2 = this.method2242();
		return new Class3_Sub4_Sub1(22050, local2, this.anInt3095 * 22050 / 1000, this.anInt3094 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "()[B")
	private byte[] method2242() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass70Array1[local3] != null && this.aClass70Array1[local3].anInt3301 + this.aClass70Array1[local3].anInt3302 > local1) {
				local1 = this.aClass70Array1[local3].anInt3301 + this.aClass70Array1[local3].anInt3302;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass70Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass70Array1[local54].anInt3301 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass70Array1[local54].anInt3302 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass70Array1[local54].method2390(local70, this.aClass70Array1[local54].anInt3301);
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
