import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class31 {

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "[Lclient!tn;")
	private final Class283[] aClass283Array1 = new Class283[10];

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!rt;)V")
	public Class31(@OriginalArg(0) Class3_Sub27 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method7548();
			if (local12 != 0) {
				arg0.anInt9191--;
				this.aClass283Array1[local7] = new Class283();
				this.aClass283Array1[local7].method7011(arg0);
			}
		}
		this.anInt950 = arg0.method7591();
		this.anInt949 = arg0.method7591();
	}

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
	private Class31() {
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "()[B")
	private byte[] method877() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass283Array1[local3] != null && this.aClass283Array1[local3].anInt8469 + this.aClass283Array1[local3].anInt8471 > local1) {
				local1 = this.aClass283Array1[local3].anInt8469 + this.aClass283Array1[local3].anInt8471;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass283Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass283Array1[local54].anInt8469 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass283Array1[local54].anInt8471 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass283Array1[local54].method7013(local70, this.aClass283Array1[local54].anInt8469);
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

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "()I")
	public int method878() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass283Array1[local3] != null && this.aClass283Array1[local3].anInt8471 / 20 < local1) {
				local1 = this.aClass283Array1[local3].anInt8471 / 20;
			}
		}
		if (this.anInt950 < this.anInt949 && this.anInt950 / 20 < local1) {
			local1 = this.anInt950 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass283Array1[local55] != null) {
				this.aClass283Array1[local55].anInt8471 -= local1 * 20;
			}
		}
		if (this.anInt950 < this.anInt949) {
			this.anInt950 -= local1 * 20;
			this.anInt949 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "()Lclient!te;")
	public Class3_Sub42_Sub1 method879() {
		@Pc(2) byte[] local2 = this.method877();
		return new Class3_Sub42_Sub1(22050, local2, this.anInt950 * 22050 / 1000, this.anInt949 * 22050 / 1000);
	}
}
