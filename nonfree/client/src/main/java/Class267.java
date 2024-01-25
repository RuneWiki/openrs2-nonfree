import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class267 {

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "[Lclient!rk;")
	private final Class214[] aClass214Array1 = new Class214[10];

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "I")
	private int anInt7822;

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
	private int anInt7823;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!md;)V")
	public Class267(@OriginalArg(0) Class2_Sub20 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method3737();
			if (local12 != 0) {
				arg0.anInt4608--;
				this.aClass214Array1[local7] = new Class214();
				this.aClass214Array1[local7].method4792(arg0);
			}
		}
		this.anInt7822 = arg0.method3711();
		this.anInt7823 = arg0.method3711();
	}

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "()V")
	private Class267() {
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "()Lclient!uo;")
	public Class2_Sub41_Sub1 method6067() {
		@Pc(2) byte[] local2 = this.method6069();
		return new Class2_Sub41_Sub1(22050, local2, this.anInt7822 * 22050 / 1000, this.anInt7823 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "()I")
	public int method6068() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass214Array1[local3] != null && this.aClass214Array1[local3].anInt5997 / 20 < local1) {
				local1 = this.aClass214Array1[local3].anInt5997 / 20;
			}
		}
		if (this.anInt7822 < this.anInt7823 && this.anInt7822 / 20 < local1) {
			local1 = this.anInt7822 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass214Array1[local55] != null) {
				this.aClass214Array1[local55].anInt5997 -= local1 * 20;
			}
		}
		if (this.anInt7822 < this.anInt7823) {
			this.anInt7822 -= local1 * 20;
			this.anInt7823 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "()[B")
	private byte[] method6069() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass214Array1[local3] != null && this.aClass214Array1[local3].anInt5994 + this.aClass214Array1[local3].anInt5997 > local1) {
				local1 = this.aClass214Array1[local3].anInt5994 + this.aClass214Array1[local3].anInt5997;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass214Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass214Array1[local54].anInt5994 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass214Array1[local54].anInt5997 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass214Array1[local54].method4789(local70, this.aClass214Array1[local54].anInt5994);
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
