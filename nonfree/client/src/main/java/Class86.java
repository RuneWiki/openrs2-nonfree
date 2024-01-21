import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class86 {

	@OriginalMember(owner = "client!w", name = "b", descriptor = "[Lclient!fc;")
	private final Class22[] aClass22Array1 = new Class22[10];

	@OriginalMember(owner = "client!w", name = "a", descriptor = "I")
	private int anInt4056;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "I")
	private int anInt4057;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!me;)V")
	public Class86(@OriginalArg(0) Class2_Sub13 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1402();
			if (local12 != 0) {
				arg0.anInt2154--;
				this.aClass22Array1[local7] = new Class22();
				this.aClass22Array1[local7].method846(arg0);
			}
		}
		this.anInt4056 = arg0.method1397();
		this.anInt4057 = arg0.method1397();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "()Lclient!qe;")
	public Class2_Sub19_Sub1 method2751() {
		@Pc(2) byte[] local2 = this.method2753();
		return new Class2_Sub19_Sub1(22050, local2, this.anInt4056 * 22050 / 1000, this.anInt4057 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()I")
	public int method2752() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass22Array1[local3] != null && this.aClass22Array1[local3].anInt1318 / 20 < local1) {
				local1 = this.aClass22Array1[local3].anInt1318 / 20;
			}
		}
		if (this.anInt4056 < this.anInt4057 && this.anInt4056 / 20 < local1) {
			local1 = this.anInt4056 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass22Array1[local55] != null) {
				this.aClass22Array1[local55].anInt1318 -= local1 * 20;
			}
		}
		if (this.anInt4056 < this.anInt4057) {
			this.anInt4056 -= local1 * 20;
			this.anInt4057 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "()[B")
	private byte[] method2753() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass22Array1[local3] != null && this.aClass22Array1[local3].anInt1316 + this.aClass22Array1[local3].anInt1318 > local1) {
				local1 = this.aClass22Array1[local3].anInt1316 + this.aClass22Array1[local3].anInt1318;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass22Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass22Array1[local54].anInt1316 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass22Array1[local54].anInt1318 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass22Array1[local54].method845(local70, this.aClass22Array1[local54].anInt1316);
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
