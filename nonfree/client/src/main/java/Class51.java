import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class51 {

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "[Lclient!ut;")
	private final Class348[] aClass348Array1 = new Class348[10];

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
	private int anInt2418;

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
	private int anInt2419;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class51(@OriginalArg(0) Class6_Sub8 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method8246();
			if (local12 != 0) {
				arg0.anInt10061--;
				this.aClass348Array1[local7] = new Class348();
				this.aClass348Array1[local7].method8077(arg0);
			}
		}
		this.anInt2418 = arg0.method8220();
		this.anInt2419 = arg0.method8220();
	}

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
	private Class51() {
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "()I")
	public int method2093() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass348Array1[local3] != null && this.aClass348Array1[local3].anInt9900 / 20 < local1) {
				local1 = this.aClass348Array1[local3].anInt9900 / 20;
			}
		}
		if (this.anInt2418 < this.anInt2419 && this.anInt2418 / 20 < local1) {
			local1 = this.anInt2418 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass348Array1[local55] != null) {
				this.aClass348Array1[local55].anInt9900 -= local1 * 20;
			}
		}
		if (this.anInt2418 < this.anInt2419) {
			this.anInt2418 -= local1 * 20;
			this.anInt2419 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "()Lclient!ib;")
	public Class6_Sub27_Sub1 method2094() {
		@Pc(2) byte[] local2 = this.method2095();
		return new Class6_Sub27_Sub1(22050, local2, this.anInt2418 * 22050 / 1000, this.anInt2419 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "()[B")
	private byte[] method2095() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass348Array1[local3] != null && this.aClass348Array1[local3].anInt9902 + this.aClass348Array1[local3].anInt9900 > local1) {
				local1 = this.aClass348Array1[local3].anInt9902 + this.aClass348Array1[local3].anInt9900;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass348Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass348Array1[local54].anInt9902 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass348Array1[local54].anInt9900 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass348Array1[local54].method8079(local70, this.aClass348Array1[local54].anInt9902);
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
