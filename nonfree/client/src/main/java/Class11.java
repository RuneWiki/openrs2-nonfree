import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class11 {

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "[Lclient!ld;")
	private final Class43[] aClass43Array1 = new Class43[10];

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
	private int anInt444;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
	private int anInt445;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!mc;)V")
	public Class11(@OriginalArg(0) Class1_Sub12 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1190();
			if (local12 != 0) {
				arg0.anInt1694--;
				this.aClass43Array1[local7] = new Class43();
				this.aClass43Array1[local7].method1356(arg0);
			}
		}
		this.anInt444 = arg0.method1176();
		this.anInt445 = arg0.method1176();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "()I")
	public int method387() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass43Array1[local3] != null && this.aClass43Array1[local3].anInt1938 / 20 < local1) {
				local1 = this.aClass43Array1[local3].anInt1938 / 20;
			}
		}
		if (this.anInt444 < this.anInt445 && this.anInt444 / 20 < local1) {
			local1 = this.anInt444 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass43Array1[local55] != null) {
				this.aClass43Array1[local55].anInt1938 -= local1 * 20;
			}
		}
		if (this.anInt444 < this.anInt445) {
			this.anInt444 -= local1 * 20;
			this.anInt445 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "()Lclient!u;")
	public Class1_Sub14_Sub1 method388() {
		@Pc(2) byte[] local2 = this.method390();
		return new Class1_Sub14_Sub1(22050, local2, this.anInt444 * 22050 / 1000, this.anInt445 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "()[B")
	private byte[] method390() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass43Array1[local3] != null && this.aClass43Array1[local3].anInt1935 + this.aClass43Array1[local3].anInt1938 > local1) {
				local1 = this.aClass43Array1[local3].anInt1935 + this.aClass43Array1[local3].anInt1938;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass43Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass43Array1[local54].anInt1935 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass43Array1[local54].anInt1938 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass43Array1[local54].method1357(local70, this.aClass43Array1[local54].anInt1935);
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
