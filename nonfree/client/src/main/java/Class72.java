import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class72 {

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "[Lclient!na;")
	private final Class52[] aClass52Array1 = new Class52[10];

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
	private int anInt2737;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
	private int anInt2738;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!of;)V")
	public Class72(@OriginalArg(0) Class1_Sub19 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method2072();
			if (local12 != 0) {
				arg0.anInt3111--;
				this.aClass52Array1[local7] = new Class52();
				this.aClass52Array1[local7].method1375(arg0);
			}
		}
		this.anInt2737 = arg0.method2051();
		this.anInt2738 = arg0.method2051();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "()Lclient!m;")
	public Class1_Sub17_Sub1 method1826() {
		@Pc(2) byte[] local2 = this.method1827();
		return new Class1_Sub17_Sub1(22050, local2, this.anInt2737 * 22050 / 1000, this.anInt2738 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "()[B")
	private byte[] method1827() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass52Array1[local3] != null && this.aClass52Array1[local3].anInt2104 + this.aClass52Array1[local3].anInt2105 > local1) {
				local1 = this.aClass52Array1[local3].anInt2104 + this.aClass52Array1[local3].anInt2105;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass52Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass52Array1[local54].anInt2104 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass52Array1[local54].anInt2105 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass52Array1[local54].method1373(local70, this.aClass52Array1[local54].anInt2104);
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

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "()I")
	public int method1829() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass52Array1[local3] != null && this.aClass52Array1[local3].anInt2105 / 20 < local1) {
				local1 = this.aClass52Array1[local3].anInt2105 / 20;
			}
		}
		if (this.anInt2737 < this.anInt2738 && this.anInt2737 / 20 < local1) {
			local1 = this.anInt2737 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass52Array1[local55] != null) {
				this.aClass52Array1[local55].anInt2105 -= local1 * 20;
			}
		}
		if (this.anInt2737 < this.anInt2738) {
			this.anInt2737 -= local1 * 20;
			this.anInt2738 -= local1 * 20;
		}
		return local1;
	}
}
