import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class39 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "[Lclient!ac;")
	private final Class3[] aClass3Array1 = new Class3[10];

	@OriginalMember(owner = "client!n", name = "c", descriptor = "I")
	private int anInt1935;

	@OriginalMember(owner = "client!n", name = "b", descriptor = "I")
	private int anInt1934;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!rc;)V")
	public Class39(@OriginalArg(0) Class1_Sub5 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method716();
			if (local12 != 0) {
				arg0.anInt1266--;
				this.aClass3Array1[local7] = new Class3();
				this.aClass3Array1[local7].method65(arg0);
			}
		}
		this.anInt1935 = arg0.method715();
		this.anInt1934 = arg0.method715();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "()I")
	public int method1231() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass3Array1[local3] != null && this.aClass3Array1[local3].anInt138 / 20 < local1) {
				local1 = this.aClass3Array1[local3].anInt138 / 20;
			}
		}
		if (this.anInt1935 < this.anInt1934 && this.anInt1935 / 20 < local1) {
			local1 = this.anInt1935 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass3Array1[local55] != null) {
				this.aClass3Array1[local55].anInt138 -= local1 * 20;
			}
		}
		if (this.anInt1935 < this.anInt1934) {
			this.anInt1935 -= local1 * 20;
			this.anInt1934 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "()Lclient!te;")
	public Class1_Sub9_Sub1 method1232() {
		@Pc(2) byte[] local2 = this.method1234();
		return new Class1_Sub9_Sub1(22050, local2, this.anInt1935 * 22050 / 1000, this.anInt1934 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "()[B")
	private byte[] method1234() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass3Array1[local3] != null && this.aClass3Array1[local3].anInt141 + this.aClass3Array1[local3].anInt138 > local1) {
				local1 = this.aClass3Array1[local3].anInt141 + this.aClass3Array1[local3].anInt138;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass3Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass3Array1[local54].anInt141 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass3Array1[local54].anInt138 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass3Array1[local54].method67(local70, this.aClass3Array1[local54].anInt141);
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
