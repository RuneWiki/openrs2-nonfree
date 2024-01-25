import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aha")
public final class Class15 {

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "[Lclient!si;")
	private final Class330[] aClass330Array1 = new Class330[10];

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "I")
	private int anInt180;

	@OriginalMember(owner = "client!aha", name = "c", descriptor = "I")
	private int anInt181;

	@OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(Lclient!jc;)V")
	public Class15(@OriginalArg(0) Class14_Sub21 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method7695(115);
			if (local12 != 0) {
				arg0.anInt8936--;
				this.aClass330Array1[local7] = new Class330();
				this.aClass330Array1[local7].method8076(arg0);
			}
		}
		this.anInt180 = arg0.method7717(-1978450544);
		this.anInt181 = arg0.method7717(-1978450544);
	}

	@OriginalMember(owner = "client!aha", name = "<init>", descriptor = "()V")
	private Class15() {
	}

	@OriginalMember(owner = "client!aha", name = "c", descriptor = "()I")
	public int method240() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass330Array1[local3] != null && this.aClass330Array1[local3].anInt9364 / 20 < local1) {
				local1 = this.aClass330Array1[local3].anInt9364 / 20;
			}
		}
		if (this.anInt180 < this.anInt181 && this.anInt180 / 20 < local1) {
			local1 = this.anInt180 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass330Array1[local55] != null) {
				this.aClass330Array1[local55].anInt9364 -= local1 * 20;
			}
		}
		if (this.anInt180 < this.anInt181) {
			this.anInt180 -= local1 * 20;
			this.anInt181 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "()[B")
	private byte[] method241() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass330Array1[local3] != null && this.aClass330Array1[local3].anInt9366 + this.aClass330Array1[local3].anInt9364 > local1) {
				local1 = this.aClass330Array1[local3].anInt9366 + this.aClass330Array1[local3].anInt9364;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass330Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass330Array1[local54].anInt9366 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass330Array1[local54].anInt9364 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass330Array1[local54].method8078(local70, this.aClass330Array1[local54].anInt9366);
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

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "()Lclient!pd;")
	public Class14_Sub19_Sub1 method242() {
		@Pc(2) byte[] local2 = this.method241();
		return new Class14_Sub19_Sub1(22050, local2, this.anInt180 * 22050 / 1000, this.anInt181 * 22050 / 1000);
	}
}
