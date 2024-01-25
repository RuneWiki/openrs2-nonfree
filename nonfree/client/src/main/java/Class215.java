import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class215 {

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "[Lclient!ji;")
	private final Class127[] aClass127Array1 = new Class127[10];

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
	private int anInt6518;

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
	private int anInt6517;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!ti;)V")
	public Class215(@OriginalArg(0) Class1_Sub14 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method4548();
			if (local12 != 0) {
				arg0.anInt5695--;
				this.aClass127Array1[local7] = new Class127();
				this.aClass127Array1[local7].method2970(arg0);
			}
		}
		this.anInt6518 = arg0.method4498();
		this.anInt6517 = arg0.method4498();
	}

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "()V")
	private Class215() {
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "()I")
	public int method5096() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass127Array1[local3] != null && this.aClass127Array1[local3].anInt3464 / 20 < local1) {
				local1 = this.aClass127Array1[local3].anInt3464 / 20;
			}
		}
		if (this.anInt6518 < this.anInt6517 && this.anInt6518 / 20 < local1) {
			local1 = this.anInt6518 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass127Array1[local55] != null) {
				this.aClass127Array1[local55].anInt3464 -= local1 * 20;
			}
		}
		if (this.anInt6518 < this.anInt6517) {
			this.anInt6518 -= local1 * 20;
			this.anInt6517 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "()[B")
	private byte[] method5097() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass127Array1[local3] != null && this.aClass127Array1[local3].anInt3462 + this.aClass127Array1[local3].anInt3464 > local1) {
				local1 = this.aClass127Array1[local3].anInt3462 + this.aClass127Array1[local3].anInt3464;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass127Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass127Array1[local54].anInt3462 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass127Array1[local54].anInt3464 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass127Array1[local54].method2971(local70, this.aClass127Array1[local54].anInt3462);
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

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "()Lclient!bv;")
	public Class1_Sub6_Sub1 method5098() {
		@Pc(2) byte[] local2 = this.method5097();
		return new Class1_Sub6_Sub1(22050, local2, this.anInt6518 * 22050 / 1000, this.anInt6517 * 22050 / 1000);
	}
}
