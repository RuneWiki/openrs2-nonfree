import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class210 {

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "[Lclient!rw;")
	private final Class315[] aClass315Array1 = new Class315[10];

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
	private int anInt5875;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
	private int anInt5874;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lclient!dt;)V")
	public Class210(@OriginalArg(0) Class3_Sub4 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method7954();
			if (local12 != 0) {
				arg0.anInt9739--;
				this.aClass315Array1[local7] = new Class315();
				this.aClass315Array1[local7].method6880(arg0);
			}
		}
		this.anInt5875 = arg0.method7951();
		this.anInt5874 = arg0.method7951();
	}

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	private Class210() {
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "()[B")
	private byte[] method4985() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass315Array1[local3] != null && this.aClass315Array1[local3].anInt8362 + this.aClass315Array1[local3].anInt8360 > local1) {
				local1 = this.aClass315Array1[local3].anInt8362 + this.aClass315Array1[local3].anInt8360;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass315Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass315Array1[local54].anInt8362 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass315Array1[local54].anInt8360 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass315Array1[local54].method6881(local70, this.aClass315Array1[local54].anInt8362);
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

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "()Lclient!pv;")
	public Class3_Sub39_Sub1 method4986() {
		@Pc(2) byte[] local2 = this.method4985();
		return new Class3_Sub39_Sub1(22050, local2, this.anInt5875 * 22050 / 1000, this.anInt5874 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "()I")
	public int method4987() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass315Array1[local3] != null && this.aClass315Array1[local3].anInt8360 / 20 < local1) {
				local1 = this.aClass315Array1[local3].anInt8360 / 20;
			}
		}
		if (this.anInt5875 < this.anInt5874 && this.anInt5875 / 20 < local1) {
			local1 = this.anInt5875 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass315Array1[local55] != null) {
				this.aClass315Array1[local55].anInt8360 -= local1 * 20;
			}
		}
		if (this.anInt5875 < this.anInt5874) {
			this.anInt5875 -= local1 * 20;
			this.anInt5874 -= local1 * 20;
		}
		return local1;
	}
}
