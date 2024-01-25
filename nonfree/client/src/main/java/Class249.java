import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oba")
public final class Class249 {

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "[Lclient!ww;")
	private final Class367[] aClass367Array1 = new Class367[10];

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "I")
	private int anInt6617;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "I")
	private int anInt6616;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Lclient!ac;)V")
	public Class249(@OriginalArg(0) Class1_Sub3 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method7974();
			if (local12 != 0) {
				arg0.anInt9802--;
				this.aClass367Array1[local7] = new Class367();
				this.aClass367Array1[local7].method7990(arg0);
			}
		}
		this.anInt6617 = arg0.method7945();
		this.anInt6616 = arg0.method7945();
	}

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "()V")
	private Class249() {
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "()[B")
	private byte[] method5367() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass367Array1[local3] != null && this.aClass367Array1[local3].anInt9820 + this.aClass367Array1[local3].anInt9819 > local1) {
				local1 = this.aClass367Array1[local3].anInt9820 + this.aClass367Array1[local3].anInt9819;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass367Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass367Array1[local54].anInt9820 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass367Array1[local54].anInt9819 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass367Array1[local54].method7989(local70, this.aClass367Array1[local54].anInt9820);
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

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "()Lclient!bu;")
	public Class1_Sub13_Sub1 method5369() {
		@Pc(2) byte[] local2 = this.method5367();
		return new Class1_Sub13_Sub1(22050, local2, this.anInt6617 * 22050 / 1000, this.anInt6616 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "()I")
	public int method5370() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass367Array1[local3] != null && this.aClass367Array1[local3].anInt9819 / 20 < local1) {
				local1 = this.aClass367Array1[local3].anInt9819 / 20;
			}
		}
		if (this.anInt6617 < this.anInt6616 && this.anInt6617 / 20 < local1) {
			local1 = this.anInt6617 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass367Array1[local55] != null) {
				this.aClass367Array1[local55].anInt9819 -= local1 * 20;
			}
		}
		if (this.anInt6617 < this.anInt6616) {
			this.anInt6617 -= local1 * 20;
			this.anInt6616 -= local1 * 20;
		}
		return local1;
	}
}
