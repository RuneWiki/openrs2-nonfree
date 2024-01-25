import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fia")
public final class Class115 {

	@OriginalMember(owner = "client!fia", name = "c", descriptor = "[Lclient!aj;")
	private final Class15[] aClass15Array1 = new Class15[10];

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "I")
	private int anInt3039;

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "I")
	private int anInt3038;

	@OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(Lclient!wq;)V")
	public Class115(@OriginalArg(0) Class5_Sub36 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method7291();
			if (local12 != 0) {
				arg0.anInt8456--;
				this.aClass15Array1[local7] = new Class15();
				this.aClass15Array1[local7].method229(arg0);
			}
		}
		this.anInt3039 = arg0.method7333();
		this.anInt3038 = arg0.method7333();
	}

	@OriginalMember(owner = "client!fia", name = "<init>", descriptor = "()V")
	private Class115() {
	}

	@OriginalMember(owner = "client!fia", name = "c", descriptor = "()[B")
	private byte[] method2835() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass15Array1[local3] != null && this.aClass15Array1[local3].anInt180 + this.aClass15Array1[local3].anInt179 > local1) {
				local1 = this.aClass15Array1[local3].anInt180 + this.aClass15Array1[local3].anInt179;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass15Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass15Array1[local54].anInt180 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass15Array1[local54].anInt179 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass15Array1[local54].method228(local70, this.aClass15Array1[local54].anInt180);
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

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "()Lclient!jg;")
	public Class5_Sub27_Sub1 method2836() {
		@Pc(2) byte[] local2 = this.method2835();
		return new Class5_Sub27_Sub1(22050, local2, this.anInt3039 * 22050 / 1000, this.anInt3038 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "()I")
	public int method2838() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass15Array1[local3] != null && this.aClass15Array1[local3].anInt179 / 20 < local1) {
				local1 = this.aClass15Array1[local3].anInt179 / 20;
			}
		}
		if (this.anInt3039 < this.anInt3038 && this.anInt3039 / 20 < local1) {
			local1 = this.anInt3039 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass15Array1[local55] != null) {
				this.aClass15Array1[local55].anInt179 -= local1 * 20;
			}
		}
		if (this.anInt3039 < this.anInt3038) {
			this.anInt3039 -= local1 * 20;
			this.anInt3038 -= local1 * 20;
		}
		return local1;
	}
}
