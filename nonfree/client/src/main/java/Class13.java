import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class13 {

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "[Lclient!pf;")
	private final Class71[] aClass71Array1 = new Class71[10];

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
	private int anInt555;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
	private int anInt554;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!h;)V")
	public Class13(@OriginalArg(0) Class4_Sub11 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1253();
			if (local12 != 0) {
				arg0.anInt1597--;
				this.aClass71Array1[local7] = new Class71();
				this.aClass71Array1[local7].method2339(arg0);
			}
		}
		this.anInt555 = arg0.method1252();
		this.anInt554 = arg0.method1252();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "()[B")
	private byte[] method353() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass71Array1[local3] != null && this.aClass71Array1[local3].anInt3175 + this.aClass71Array1[local3].anInt3176 > local1) {
				local1 = this.aClass71Array1[local3].anInt3175 + this.aClass71Array1[local3].anInt3176;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass71Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass71Array1[local54].anInt3175 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass71Array1[local54].anInt3176 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass71Array1[local54].method2338(local70, this.aClass71Array1[local54].anInt3175);
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

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "()Lclient!vf;")
	public Class4_Sub12_Sub1 method354() {
		@Pc(2) byte[] local2 = this.method353();
		return new Class4_Sub12_Sub1(22050, local2, this.anInt555 * 22050 / 1000, this.anInt554 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "()I")
	public int method355() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass71Array1[local3] != null && this.aClass71Array1[local3].anInt3176 / 20 < local1) {
				local1 = this.aClass71Array1[local3].anInt3176 / 20;
			}
		}
		if (this.anInt555 < this.anInt554 && this.anInt555 / 20 < local1) {
			local1 = this.anInt555 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass71Array1[local55] != null) {
				this.aClass71Array1[local55].anInt3176 -= local1 * 20;
			}
		}
		if (this.anInt555 < this.anInt554) {
			this.anInt555 -= local1 * 20;
			this.anInt554 -= local1 * 20;
		}
		return local1;
	}
}
