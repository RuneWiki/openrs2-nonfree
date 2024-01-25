import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class323 {

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "[Lclient!bt;")
	private final Class43[] aClass43Array1 = new Class43[10];

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
	private int anInt9602;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
	private int anInt9601;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!ek;)V")
	public Class323(@OriginalArg(0) Class4_Sub13 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method7004();
			if (local12 != 0) {
				arg0.anInt9170--;
				this.aClass43Array1[local7] = new Class43();
				this.aClass43Array1[local7].method1170(arg0);
			}
		}
		this.anInt9602 = arg0.method7054();
		this.anInt9601 = arg0.method7054();
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	private Class323() {
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()I")
	public int method7394() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass43Array1[local3] != null && this.aClass43Array1[local3].anInt1340 / 20 < local1) {
				local1 = this.aClass43Array1[local3].anInt1340 / 20;
			}
		}
		if (this.anInt9602 < this.anInt9601 && this.anInt9602 / 20 < local1) {
			local1 = this.anInt9602 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass43Array1[local55] != null) {
				this.aClass43Array1[local55].anInt1340 -= local1 * 20;
			}
		}
		if (this.anInt9602 < this.anInt9601) {
			this.anInt9602 -= local1 * 20;
			this.anInt9601 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "()[B")
	private byte[] method7395() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass43Array1[local3] != null && this.aClass43Array1[local3].anInt1343 + this.aClass43Array1[local3].anInt1340 > local1) {
				local1 = this.aClass43Array1[local3].anInt1343 + this.aClass43Array1[local3].anInt1340;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass43Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass43Array1[local54].anInt1343 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass43Array1[local54].anInt1340 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass43Array1[local54].method1172(local70, this.aClass43Array1[local54].anInt1343);
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

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "()Lclient!tk;")
	public Class4_Sub42_Sub1 method7396() {
		@Pc(2) byte[] local2 = this.method7395();
		return new Class4_Sub42_Sub1(22050, local2, this.anInt9602 * 22050 / 1000, this.anInt9601 * 22050 / 1000);
	}
}
