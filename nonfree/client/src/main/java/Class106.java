import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class106 {

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "[Lclient!jg;")
	private final Class123[] aClass123Array1 = new Class123[10];

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
	private int anInt2681;

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
	private int anInt2682;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!sv;)V")
	public Class106(@OriginalArg(0) Class2_Sub13 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method3580();
			if (local12 != 0) {
				arg0.anInt4347--;
				this.aClass123Array1[local7] = new Class123();
				this.aClass123Array1[local7].method2542(arg0);
			}
		}
		this.anInt2681 = arg0.method3555();
		this.anInt2682 = arg0.method3555();
	}

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V")
	private Class106() {
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "()I")
	public int method2203() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass123Array1[local3] != null && this.aClass123Array1[local3].anInt3137 / 20 < local1) {
				local1 = this.aClass123Array1[local3].anInt3137 / 20;
			}
		}
		if (this.anInt2681 < this.anInt2682 && this.anInt2681 / 20 < local1) {
			local1 = this.anInt2681 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass123Array1[local55] != null) {
				this.aClass123Array1[local55].anInt3137 -= local1 * 20;
			}
		}
		if (this.anInt2681 < this.anInt2682) {
			this.anInt2681 -= local1 * 20;
			this.anInt2682 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "()[B")
	private byte[] method2205() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass123Array1[local3] != null && this.aClass123Array1[local3].anInt3135 + this.aClass123Array1[local3].anInt3137 > local1) {
				local1 = this.aClass123Array1[local3].anInt3135 + this.aClass123Array1[local3].anInt3137;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass123Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass123Array1[local54].anInt3135 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass123Array1[local54].anInt3137 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass123Array1[local54].method2543(local70, this.aClass123Array1[local54].anInt3135);
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

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "()Lclient!he;")
	public Class2_Sub22_Sub1 method2206() {
		@Pc(2) byte[] local2 = this.method2205();
		return new Class2_Sub22_Sub1(22050, local2, this.anInt2681 * 22050 / 1000, this.anInt2682 * 22050 / 1000);
	}
}
