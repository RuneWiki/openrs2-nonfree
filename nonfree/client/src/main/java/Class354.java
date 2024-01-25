import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vea")
public final class Class354 {

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "[Lclient!ia;")
	private final Class139[] aClass139Array1 = new Class139[10];

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "I")
	private int anInt10188;

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "I")
	private int anInt10189;

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lclient!ig;)V")
	public Class354(@OriginalArg(0) Class8_Sub8 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method8525();
			if (local12 != 0) {
				arg0.anInt10588--;
				this.aClass139Array1[local7] = new Class139();
				this.aClass139Array1[local7].method4114(arg0);
			}
		}
		this.anInt10188 = arg0.method8578();
		this.anInt10189 = arg0.method8578();
	}

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "()V")
	private Class354() {
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "()Lclient!cba;")
	public Class8_Sub9_Sub1 method8221() {
		@Pc(2) byte[] local2 = this.method8224();
		return new Class8_Sub9_Sub1(22050, local2, this.anInt10188 * 22050 / 1000, this.anInt10189 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "()I")
	public int method8223() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass139Array1[local3] != null && this.aClass139Array1[local3].anInt5018 / 20 < local1) {
				local1 = this.aClass139Array1[local3].anInt5018 / 20;
			}
		}
		if (this.anInt10188 < this.anInt10189 && this.anInt10188 / 20 < local1) {
			local1 = this.anInt10188 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass139Array1[local55] != null) {
				this.aClass139Array1[local55].anInt5018 -= local1 * 20;
			}
		}
		if (this.anInt10188 < this.anInt10189) {
			this.anInt10188 -= local1 * 20;
			this.anInt10189 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "()[B")
	private byte[] method8224() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass139Array1[local3] != null && this.aClass139Array1[local3].anInt5017 + this.aClass139Array1[local3].anInt5018 > local1) {
				local1 = this.aClass139Array1[local3].anInt5017 + this.aClass139Array1[local3].anInt5018;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass139Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass139Array1[local54].anInt5017 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass139Array1[local54].anInt5018 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass139Array1[local54].method4115(local70, this.aClass139Array1[local54].anInt5017);
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
