import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class24 {

	@OriginalMember(owner = "client!f", name = "b", descriptor = "[Lclient!b;")
	private final Class5[] aClass5Array1 = new Class5[10];

	@OriginalMember(owner = "client!f", name = "c", descriptor = "I")
	private int anInt1169;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "I")
	private int anInt1168;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!rd;)V")
	public Class24(@OriginalArg(0) Class3_Sub4 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method191();
			if (local12 != 0) {
				arg0.anInt232--;
				this.aClass5Array1[local7] = new Class5();
				this.aClass5Array1[local7].method279(arg0);
			}
		}
		this.anInt1169 = arg0.method208();
		this.anInt1168 = arg0.method208();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "()I")
	public int method847() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass5Array1[local3] != null && this.aClass5Array1[local3].anInt351 / 20 < local1) {
				local1 = this.aClass5Array1[local3].anInt351 / 20;
			}
		}
		if (this.anInt1169 < this.anInt1168 && this.anInt1169 / 20 < local1) {
			local1 = this.anInt1169 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass5Array1[local55] != null) {
				this.aClass5Array1[local55].anInt351 -= local1 * 20;
			}
		}
		if (this.anInt1169 < this.anInt1168) {
			this.anInt1169 -= local1 * 20;
			this.anInt1168 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "()[B")
	private byte[] method848() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass5Array1[local3] != null && this.aClass5Array1[local3].anInt348 + this.aClass5Array1[local3].anInt351 > local1) {
				local1 = this.aClass5Array1[local3].anInt348 + this.aClass5Array1[local3].anInt351;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass5Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass5Array1[local54].anInt348 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass5Array1[local54].anInt351 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass5Array1[local54].method282(local70, this.aClass5Array1[local54].anInt348);
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

	@OriginalMember(owner = "client!f", name = "c", descriptor = "()Lclient!wc;")
	public Class3_Sub9_Sub1 method849() {
		@Pc(2) byte[] local2 = this.method848();
		return new Class3_Sub9_Sub1(22050, local2, this.anInt1169 * 22050 / 1000, this.anInt1168 * 22050 / 1000);
	}
}
