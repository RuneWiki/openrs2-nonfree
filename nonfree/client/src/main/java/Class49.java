import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class49 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "[Lclient!va;")
	private final Class63[] aClass63Array1 = new Class63[10];

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
	private int anInt1965;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
	private int anInt1964;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class49(@OriginalArg(0) Class3_Sub8 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1803();
			if (local12 != 0) {
				arg0.anInt2704--;
				this.aClass63Array1[local7] = new Class63();
				this.aClass63Array1[local7].method1714(arg0);
			}
		}
		this.anInt1965 = arg0.method1789();
		this.anInt1964 = arg0.method1789();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "()Lclient!fd;")
	public Class3_Sub5_Sub1 method1189() {
		@Pc(2) byte[] local2 = this.method1191();
		return new Class3_Sub5_Sub1(22050, local2, this.anInt1965 * 22050 / 1000, this.anInt1964 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "()[B")
	private byte[] method1191() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass63Array1[local3] != null && this.aClass63Array1[local3].anInt2655 + this.aClass63Array1[local3].anInt2654 > local1) {
				local1 = this.aClass63Array1[local3].anInt2655 + this.aClass63Array1[local3].anInt2654;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass63Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass63Array1[local54].anInt2655 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass63Array1[local54].anInt2654 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass63Array1[local54].method1711(local70, this.aClass63Array1[local54].anInt2655);
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

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "()I")
	public int method1192() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass63Array1[local3] != null && this.aClass63Array1[local3].anInt2654 / 20 < local1) {
				local1 = this.aClass63Array1[local3].anInt2654 / 20;
			}
		}
		if (this.anInt1965 < this.anInt1964 && this.anInt1965 / 20 < local1) {
			local1 = this.anInt1965 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass63Array1[local55] != null) {
				this.aClass63Array1[local55].anInt2654 -= local1 * 20;
			}
		}
		if (this.anInt1965 < this.anInt1964) {
			this.anInt1965 -= local1 * 20;
			this.anInt1964 -= local1 * 20;
		}
		return local1;
	}
}
