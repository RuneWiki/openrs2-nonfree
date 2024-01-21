import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class35 {

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "[Lclient!c;")
	private final Class9[] aClass9Array1 = new Class9[10];

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
	private int anInt1645;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
	private int anInt1646;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!fe;)V")
	public Class35(@OriginalArg(0) Class2_Sub8 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1410();
			if (local12 != 0) {
				arg0.anInt2342--;
				this.aClass9Array1[local7] = new Class9();
				this.aClass9Array1[local7].method259(arg0);
			}
		}
		this.anInt1645 = arg0.method1396();
		this.anInt1646 = arg0.method1396();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "()[B")
	private byte[] method963() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass9Array1[local3] != null && this.aClass9Array1[local3].anInt410 + this.aClass9Array1[local3].anInt409 > local1) {
				local1 = this.aClass9Array1[local3].anInt410 + this.aClass9Array1[local3].anInt409;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass9Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass9Array1[local54].anInt410 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass9Array1[local54].anInt409 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass9Array1[local54].method260(local70, this.aClass9Array1[local54].anInt410);
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

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "()Lclient!nd;")
	public Class2_Sub4_Sub1 method965() {
		@Pc(2) byte[] local2 = this.method963();
		return new Class2_Sub4_Sub1(22050, local2, this.anInt1645 * 22050 / 1000, this.anInt1646 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "()I")
	public int method966() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass9Array1[local3] != null && this.aClass9Array1[local3].anInt409 / 20 < local1) {
				local1 = this.aClass9Array1[local3].anInt409 / 20;
			}
		}
		if (this.anInt1645 < this.anInt1646 && this.anInt1645 / 20 < local1) {
			local1 = this.anInt1645 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass9Array1[local55] != null) {
				this.aClass9Array1[local55].anInt409 -= local1 * 20;
			}
		}
		if (this.anInt1645 < this.anInt1646) {
			this.anInt1645 -= local1 * 20;
			this.anInt1646 -= local1 * 20;
		}
		return local1;
	}
}
