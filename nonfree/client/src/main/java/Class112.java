import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class112 {

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "[Lclient!eg;")
	private final Class72[] aClass72Array1 = new Class72[10];

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
	private int anInt3449;

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "I")
	private int anInt3450;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lclient!ia;)V")
	public Class112(@OriginalArg(0) Class1_Sub3 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1171();
			if (local12 != 0) {
				arg0.anInt1710--;
				this.aClass72Array1[local7] = new Class72();
				this.aClass72Array1[local7].method1635(arg0);
			}
		}
		this.anInt3449 = arg0.method1177();
		this.anInt3450 = arg0.method1177();
	}

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V")
	private Class112() {
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "()[B")
	private byte[] method2689() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass72Array1[local3] != null && this.aClass72Array1[local3].anInt2270 + this.aClass72Array1[local3].anInt2269 > local1) {
				local1 = this.aClass72Array1[local3].anInt2270 + this.aClass72Array1[local3].anInt2269;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass72Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass72Array1[local54].anInt2270 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass72Array1[local54].anInt2269 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass72Array1[local54].method1634(local70, this.aClass72Array1[local54].anInt2270);
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

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "()Lclient!mg;")
	public Class1_Sub12_Sub1 method2690() {
		@Pc(2) byte[] local2 = this.method2689();
		return new Class1_Sub12_Sub1(22050, local2, this.anInt3449 * 22050 / 1000, this.anInt3450 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "()I")
	public int method2691() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass72Array1[local3] != null && this.aClass72Array1[local3].anInt2269 / 20 < local1) {
				local1 = this.aClass72Array1[local3].anInt2269 / 20;
			}
		}
		if (this.anInt3449 < this.anInt3450 && this.anInt3449 / 20 < local1) {
			local1 = this.anInt3449 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass72Array1[local55] != null) {
				this.aClass72Array1[local55].anInt2269 -= local1 * 20;
			}
		}
		if (this.anInt3449 < this.anInt3450) {
			this.anInt3449 -= local1 * 20;
			this.anInt3450 -= local1 * 20;
		}
		return local1;
	}
}
