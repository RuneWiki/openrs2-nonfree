import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class141 {

	@OriginalMember(owner = "client!id", name = "b", descriptor = "[Lclient!rw;")
	private final Class296[] aClass296Array1 = new Class296[10];

	@OriginalMember(owner = "client!id", name = "c", descriptor = "I")
	private int anInt4137;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "I")
	private int anInt4136;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class141(@OriginalArg(0) Class6_Sub21 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method6069();
			if (local12 != 0) {
				arg0.anInt7338--;
				this.aClass296Array1[local7] = new Class296();
				this.aClass296Array1[local7].method6511(arg0);
			}
		}
		this.anInt4137 = arg0.method6003();
		this.anInt4136 = arg0.method6003();
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	private Class141() {
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "()[B")
	private byte[] method3636() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass296Array1[local3] != null && this.aClass296Array1[local3].anInt8001 + this.aClass296Array1[local3].anInt8003 > local1) {
				local1 = this.aClass296Array1[local3].anInt8001 + this.aClass296Array1[local3].anInt8003;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass296Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass296Array1[local54].anInt8001 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass296Array1[local54].anInt8003 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass296Array1[local54].method6513(local70, this.aClass296Array1[local54].anInt8001);
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

	@OriginalMember(owner = "client!id", name = "b", descriptor = "()Lclient!ft;")
	public Class6_Sub19_Sub1 method3637() {
		@Pc(2) byte[] local2 = this.method3636();
		return new Class6_Sub19_Sub1(22050, local2, this.anInt4137 * 22050 / 1000, this.anInt4136 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "()I")
	public int method3638() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass296Array1[local3] != null && this.aClass296Array1[local3].anInt8003 / 20 < local1) {
				local1 = this.aClass296Array1[local3].anInt8003 / 20;
			}
		}
		if (this.anInt4137 < this.anInt4136 && this.anInt4137 / 20 < local1) {
			local1 = this.anInt4137 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass296Array1[local55] != null) {
				this.aClass296Array1[local55].anInt8003 -= local1 * 20;
			}
		}
		if (this.anInt4137 < this.anInt4136) {
			this.anInt4137 -= local1 * 20;
			this.anInt4136 -= local1 * 20;
		}
		return local1;
	}
}
