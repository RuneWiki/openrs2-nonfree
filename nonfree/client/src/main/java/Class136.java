import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class136 {

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "[Lclient!dj;")
	private final Class52[] aClass52Array1 = new Class52[10];

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
	private int anInt4176;

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
	private int anInt4177;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!bt;)V")
	public Class136(@OriginalArg(0) Class3_Sub2 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method6053();
			if (local12 != 0) {
				arg0.anInt7620--;
				this.aClass52Array1[local7] = new Class52();
				this.aClass52Array1[local7].method1346(arg0);
			}
		}
		this.anInt4176 = arg0.method6004();
		this.anInt4177 = arg0.method6004();
	}

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
	private Class136() {
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "()[B")
	private byte[] method3434() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass52Array1[local3] != null && this.aClass52Array1[local3].anInt1640 + this.aClass52Array1[local3].anInt1639 > local1) {
				local1 = this.aClass52Array1[local3].anInt1640 + this.aClass52Array1[local3].anInt1639;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass52Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass52Array1[local54].anInt1640 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass52Array1[local54].anInt1639 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass52Array1[local54].method1345(local70, this.aClass52Array1[local54].anInt1640);
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

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "()I")
	public int method3435() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass52Array1[local3] != null && this.aClass52Array1[local3].anInt1639 / 20 < local1) {
				local1 = this.aClass52Array1[local3].anInt1639 / 20;
			}
		}
		if (this.anInt4176 < this.anInt4177 && this.anInt4176 / 20 < local1) {
			local1 = this.anInt4176 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass52Array1[local55] != null) {
				this.aClass52Array1[local55].anInt1639 -= local1 * 20;
			}
		}
		if (this.anInt4176 < this.anInt4177) {
			this.anInt4176 -= local1 * 20;
			this.anInt4177 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "()Lclient!eb;")
	public Class3_Sub13_Sub1 method3437() {
		@Pc(2) byte[] local2 = this.method3434();
		return new Class3_Sub13_Sub1(22050, local2, this.anInt4176 * 22050 / 1000, this.anInt4177 * 22050 / 1000);
	}
}
