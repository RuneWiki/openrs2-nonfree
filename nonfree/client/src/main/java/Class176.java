import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class176 {

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "[Lclient!ja;")
	private final Class163[] aClass163Array1 = new Class163[10];

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
	private int anInt4720;

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
	private int anInt4719;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!io;)V")
	public Class176(@OriginalArg(0) Class1_Sub20 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method4393();
			if (local12 != 0) {
				arg0.anInt5238--;
				this.aClass163Array1[local7] = new Class163();
				this.aClass163Array1[local7].method3825(arg0);
			}
		}
		this.anInt4720 = arg0.method4426();
		this.anInt4719 = arg0.method4426();
	}

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V")
	private Class176() {
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "()Lclient!ql;")
	public Class1_Sub40_Sub1 method4025() {
		@Pc(2) byte[] local2 = this.method4026();
		return new Class1_Sub40_Sub1(22050, local2, this.anInt4720 * 22050 / 1000, this.anInt4719 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "()[B")
	private byte[] method4026() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass163Array1[local3] != null && this.aClass163Array1[local3].anInt4443 + this.aClass163Array1[local3].anInt4444 > local1) {
				local1 = this.aClass163Array1[local3].anInt4443 + this.aClass163Array1[local3].anInt4444;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass163Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass163Array1[local54].anInt4443 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass163Array1[local54].anInt4444 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass163Array1[local54].method3826(local70, this.aClass163Array1[local54].anInt4443);
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

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "()I")
	public int method4027() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass163Array1[local3] != null && this.aClass163Array1[local3].anInt4444 / 20 < local1) {
				local1 = this.aClass163Array1[local3].anInt4444 / 20;
			}
		}
		if (this.anInt4720 < this.anInt4719 && this.anInt4720 / 20 < local1) {
			local1 = this.anInt4720 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass163Array1[local55] != null) {
				this.aClass163Array1[local55].anInt4444 -= local1 * 20;
			}
		}
		if (this.anInt4720 < this.anInt4719) {
			this.anInt4720 -= local1 * 20;
			this.anInt4719 -= local1 * 20;
		}
		return local1;
	}
}
