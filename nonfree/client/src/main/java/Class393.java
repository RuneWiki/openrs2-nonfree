import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class393 {

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "[Lclient!ea;")
	private final Class86[] aClass86Array1 = new Class86[10];

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
	private int anInt10344;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
	private int anInt10343;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!jc;)V")
	public Class393(@OriginalArg(0) Class6_Sub15 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method3030();
			if (local12 != 0) {
				arg0.anInt3174--;
				this.aClass86Array1[local7] = new Class86();
				this.aClass86Array1[local7].method2171(arg0);
			}
		}
		this.anInt10344 = arg0.method3018();
		this.anInt10343 = arg0.method3018();
	}

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
	private Class393() {
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "()I")
	public int method8919() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass86Array1[local3] != null && this.aClass86Array1[local3].anInt2274 / 20 < local1) {
				local1 = this.aClass86Array1[local3].anInt2274 / 20;
			}
		}
		if (this.anInt10344 < this.anInt10343 && this.anInt10344 / 20 < local1) {
			local1 = this.anInt10344 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass86Array1[local55] != null) {
				this.aClass86Array1[local55].anInt2274 -= local1 * 20;
			}
		}
		if (this.anInt10344 < this.anInt10343) {
			this.anInt10344 -= local1 * 20;
			this.anInt10343 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "()[B")
	private byte[] method8921() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass86Array1[local3] != null && this.aClass86Array1[local3].anInt2277 + this.aClass86Array1[local3].anInt2274 > local1) {
				local1 = this.aClass86Array1[local3].anInt2277 + this.aClass86Array1[local3].anInt2274;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass86Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass86Array1[local54].anInt2277 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass86Array1[local54].anInt2274 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass86Array1[local54].method2174(local70, this.aClass86Array1[local54].anInt2277);
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

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "()Lclient!vfa;")
	public Class6_Sub54_Sub1 method8922() {
		@Pc(2) byte[] local2 = this.method8921();
		return new Class6_Sub54_Sub1(22050, local2, this.anInt10344 * 22050 / 1000, this.anInt10343 * 22050 / 1000);
	}
}
