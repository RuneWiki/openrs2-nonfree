import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class61 {

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "[Lclient!laa;")
	private final Class186[] aClass186Array1 = new Class186[10];

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
	private int anInt2245;

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
	private int anInt2246;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!cea;)V")
	public Class61(@OriginalArg(0) Class2_Sub11 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method8383();
			if (local12 != 0) {
				arg0.anInt10066--;
				this.aClass186Array1[local7] = new Class186();
				this.aClass186Array1[local7].method5476(arg0);
			}
		}
		this.anInt2245 = arg0.method8326();
		this.anInt2246 = arg0.method8326();
	}

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
	private Class61() {
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "()Lclient!ob;")
	public Class2_Sub29_Sub1 method2137() {
		@Pc(2) byte[] local2 = this.method2139();
		return new Class2_Sub29_Sub1(22050, local2, this.anInt2245 * 22050 / 1000, this.anInt2246 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "()I")
	public int method2138() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass186Array1[local3] != null && this.aClass186Array1[local3].anInt6430 / 20 < local1) {
				local1 = this.aClass186Array1[local3].anInt6430 / 20;
			}
		}
		if (this.anInt2245 < this.anInt2246 && this.anInt2245 / 20 < local1) {
			local1 = this.anInt2245 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass186Array1[local55] != null) {
				this.aClass186Array1[local55].anInt6430 -= local1 * 20;
			}
		}
		if (this.anInt2245 < this.anInt2246) {
			this.anInt2245 -= local1 * 20;
			this.anInt2246 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "()[B")
	private byte[] method2139() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass186Array1[local3] != null && this.aClass186Array1[local3].anInt6431 + this.aClass186Array1[local3].anInt6430 > local1) {
				local1 = this.aClass186Array1[local3].anInt6431 + this.aClass186Array1[local3].anInt6430;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass186Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass186Array1[local54].anInt6431 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass186Array1[local54].anInt6430 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass186Array1[local54].method5478(local70, this.aClass186Array1[local54].anInt6431);
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
