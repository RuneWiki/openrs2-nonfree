import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class159 {

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "[Lclient!iaa;")
	private final Class132[] aClass132Array1 = new Class132[10];

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
	private int anInt4747;

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
	private int anInt4746;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class159(@OriginalArg(0) Class1_Sub6 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method3922();
			if (local12 != 0) {
				arg0.anInt4555--;
				this.aClass132Array1[local7] = new Class132();
				this.aClass132Array1[local7].method3428(arg0);
			}
		}
		this.anInt4747 = arg0.method3967();
		this.anInt4746 = arg0.method3967();
	}

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V")
	private Class159() {
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "()[B")
	private byte[] method4067() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass132Array1[local3] != null && this.aClass132Array1[local3].anInt3878 + this.aClass132Array1[local3].anInt3875 > local1) {
				local1 = this.aClass132Array1[local3].anInt3878 + this.aClass132Array1[local3].anInt3875;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass132Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass132Array1[local54].anInt3878 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass132Array1[local54].anInt3875 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass132Array1[local54].method3429(local70, this.aClass132Array1[local54].anInt3878);
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

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "()I")
	public int method4068() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass132Array1[local3] != null && this.aClass132Array1[local3].anInt3875 / 20 < local1) {
				local1 = this.aClass132Array1[local3].anInt3875 / 20;
			}
		}
		if (this.anInt4747 < this.anInt4746 && this.anInt4747 / 20 < local1) {
			local1 = this.anInt4747 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass132Array1[local55] != null) {
				this.aClass132Array1[local55].anInt3875 -= local1 * 20;
			}
		}
		if (this.anInt4747 < this.anInt4746) {
			this.anInt4747 -= local1 * 20;
			this.anInt4746 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "()Lclient!ti;")
	public Class1_Sub37_Sub1 method4069() {
		@Pc(2) byte[] local2 = this.method4067();
		return new Class1_Sub37_Sub1(22050, local2, this.anInt4747 * 22050 / 1000, this.anInt4746 * 22050 / 1000);
	}
}
