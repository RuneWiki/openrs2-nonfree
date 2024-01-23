import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class56 {

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "[Lclient!pa;")
	private Class128[] aClass128Array1 = new Class128[10];

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
	private int anInt1745;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
	private int anInt1744;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class56(@OriginalArg(0) Class4_Sub24 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(14) int local14 = arg0.method3110();
			if (local14 != 0) {
				arg0.anInt3822--;
				this.aClass128Array1[local7] = new Class128();
				this.aClass128Array1[local7].method3252(arg0);
			}
		}
		this.anInt1745 = arg0.method3085();
		this.anInt1744 = arg0.method3085();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "()[B")
	private byte[] method1432() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass128Array1[local3] != null && this.aClass128Array1[local3].anInt4024 + this.aClass128Array1[local3].anInt4027 > local1) {
				local1 = this.aClass128Array1[local3].anInt4024 + this.aClass128Array1[local3].anInt4027;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		local3 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local3];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass128Array1[local54] != null) {
				@Pc(72) int local72 = this.aClass128Array1[local54].anInt4024 * 22050 / 1000;
				@Pc(82) int local82 = this.aClass128Array1[local54].anInt4027 * 22050 / 1000;
				@Pc(94) int[] local94 = this.aClass128Array1[local54].method3254(local72, this.aClass128Array1[local54].anInt4024);
				for (@Pc(96) int local96 = 0; local96 < local72; local96++) {
					@Pc(111) int local111 = local52[local96 + local82] + (local94[local96] >> 8);
					if ((local111 + 128 & 0xFFFFFF00) != 0) {
						local111 = local111 >> 31 ^ 0x7F;
					}
					local52[local96 + local82] = (byte) local111;
				}
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "()I")
	public int method1433() {
		@Pc(1) int local1 = 9999999;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass128Array1[local3] != null && this.aClass128Array1[local3].anInt4027 / 20 < local1) {
				local1 = this.aClass128Array1[local3].anInt4027 / 20;
			}
		}
		if (this.anInt1745 < this.anInt1744 && this.anInt1745 / 20 < local1) {
			local1 = this.anInt1745 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (local3 = 0; local3 < 10; local3++) {
			if (this.aClass128Array1[local3] != null) {
				this.aClass128Array1[local3].anInt4027 -= local1 * 20;
			}
		}
		if (this.anInt1745 < this.anInt1744) {
			this.anInt1745 -= local1 * 20;
			this.anInt1744 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "()Lclient!ri;")
	public Class4_Sub5_Sub1 method1434() {
		@Pc(2) byte[] local2 = this.method1432();
		return new Class4_Sub5_Sub1(22050, local2, this.anInt1745 * 22050 / 1000, this.anInt1744 * 22050 / 1000);
	}
}
