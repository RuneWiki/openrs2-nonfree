import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class43 {

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "[Lclient!ga;")
	private final Class107[] aClass107Array1 = new Class107[10];

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "I")
	private int anInt1173;

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "I")
	private int anInt1174;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Lclient!np;)V")
	public Class43(@OriginalArg(0) Class3_Sub11 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method5175();
			if (local12 != 0) {
				arg0.anInt6128--;
				this.aClass107Array1[local7] = new Class107();
				this.aClass107Array1[local7].method2962(arg0);
			}
		}
		this.anInt1173 = arg0.method5198();
		this.anInt1174 = arg0.method5198();
	}

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "()V")
	private Class43() {
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "()I")
	public int method995() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass107Array1[local3] != null && this.aClass107Array1[local3].anInt3294 / 20 < local1) {
				local1 = this.aClass107Array1[local3].anInt3294 / 20;
			}
		}
		if (this.anInt1173 < this.anInt1174 && this.anInt1173 / 20 < local1) {
			local1 = this.anInt1173 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass107Array1[local55] != null) {
				this.aClass107Array1[local55].anInt3294 -= local1 * 20;
			}
		}
		if (this.anInt1173 < this.anInt1174) {
			this.anInt1173 -= local1 * 20;
			this.anInt1174 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "()[B")
	private byte[] method997() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass107Array1[local3] != null && this.aClass107Array1[local3].anInt3293 + this.aClass107Array1[local3].anInt3294 > local1) {
				local1 = this.aClass107Array1[local3].anInt3293 + this.aClass107Array1[local3].anInt3294;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass107Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass107Array1[local54].anInt3293 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass107Array1[local54].anInt3294 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass107Array1[local54].method2960(local70, this.aClass107Array1[local54].anInt3293);
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

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "()Lclient!ug;")
	public Class3_Sub48_Sub1 method998() {
		@Pc(2) byte[] local2 = this.method997();
		return new Class3_Sub48_Sub1(22050, local2, this.anInt1173 * 22050 / 1000, this.anInt1174 * 22050 / 1000);
	}
}
