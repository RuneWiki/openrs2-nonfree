import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class43 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "[Lclient!je;")
	private final Class29[] aClass29Array1 = new Class29[10];

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
	private int anInt1815;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
	private int anInt1814;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "()I", line = 12)
	public int method1215() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass29Array1[local3] != null && this.aClass29Array1[local3].anInt1147 / 20 < local1) {
				local1 = this.aClass29Array1[local3].anInt1147 / 20;
			}
		}
		if (this.anInt1815 < this.anInt1814 && this.anInt1815 / 20 < local1) {
			local1 = this.anInt1815 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass29Array1[local55] != null) {
				this.aClass29Array1[local55].anInt1147 -= local1 * 20;
			}
		}
		if (this.anInt1815 < this.anInt1814) {
			this.anInt1815 -= local1 * 20;
			this.anInt1814 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "()Lclient!ed;", line = 55)
	public Class2_Sub4_Sub1 method1216() {
		@Pc(2) byte[] local2 = this.method1217();
		return new Class2_Sub4_Sub1(22050, local2, this.anInt1815 * 22050 / 1000, this.anInt1814 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "()[B", line = 69)
	private byte[] method1217() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass29Array1[local3] != null && this.aClass29Array1[local3].anInt1149 + this.aClass29Array1[local3].anInt1147 > local1) {
				local1 = this.aClass29Array1[local3].anInt1149 + this.aClass29Array1[local3].anInt1147;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass29Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass29Array1[local54].anInt1149 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass29Array1[local54].anInt1147 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass29Array1[local54].method844(local70, this.aClass29Array1[local54].anInt1149);
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

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!eb;)V", line = 127)
	public Class43(@OriginalArg(0) Class2_Sub3 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1708();
			if (local12 != 0) {
				arg0.anInt2546--;
				this.aClass29Array1[local7] = new Class29();
				this.aClass29Array1[local7].method843(arg0);
			}
		}
		this.anInt1815 = arg0.method1704();
		this.anInt1814 = arg0.method1704();
	}
}
