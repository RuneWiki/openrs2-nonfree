import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class33 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "[Lclient!mo;")
	private final Class215[] aClass215Array1 = new Class215[10];

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
	private int anInt1202;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
	private int anInt1201;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!iaa;)V")
	public Class33(@OriginalArg(0) Class6_Sub26 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method4966();
			if (local12 != 0) {
				arg0.anInt5769--;
				this.aClass215Array1[local7] = new Class215();
				this.aClass215Array1[local7].method5263(arg0);
			}
		}
		this.anInt1202 = arg0.method4999();
		this.anInt1201 = arg0.method4999();
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	private Class33() {
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "()Lclient!wb;")
	public Class6_Sub12_Sub1 method1085() {
		@Pc(2) byte[] local2 = this.method1087();
		return new Class6_Sub12_Sub1(22050, local2, this.anInt1202 * 22050 / 1000, this.anInt1201 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "()[B")
	private byte[] method1087() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass215Array1[local3] != null && this.aClass215Array1[local3].anInt6169 + this.aClass215Array1[local3].anInt6170 > local1) {
				local1 = this.aClass215Array1[local3].anInt6169 + this.aClass215Array1[local3].anInt6170;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass215Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass215Array1[local54].anInt6169 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass215Array1[local54].anInt6170 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass215Array1[local54].method5262(local70, this.aClass215Array1[local54].anInt6169);
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

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "()I")
	public int method1088() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass215Array1[local3] != null && this.aClass215Array1[local3].anInt6170 / 20 < local1) {
				local1 = this.aClass215Array1[local3].anInt6170 / 20;
			}
		}
		if (this.anInt1202 < this.anInt1201 && this.anInt1202 / 20 < local1) {
			local1 = this.anInt1202 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass215Array1[local55] != null) {
				this.aClass215Array1[local55].anInt6170 -= local1 * 20;
			}
		}
		if (this.anInt1202 < this.anInt1201) {
			this.anInt1202 -= local1 * 20;
			this.anInt1201 -= local1 * 20;
		}
		return local1;
	}
}
