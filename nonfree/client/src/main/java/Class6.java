import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class6 {

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "[Lclient!vg;")
	private final Class87[] aClass87Array1 = new Class87[10];

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
	private int anInt333;

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
	private int anInt334;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!jg;)V")
	public Class6(@OriginalArg(0) Class1_Sub8 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method861();
			if (local12 != 0) {
				arg0.anInt1357--;
				this.aClass87Array1[local7] = new Class87();
				this.aClass87Array1[local7].method2985(arg0);
			}
		}
		this.anInt333 = arg0.method878();
		this.anInt334 = arg0.method878();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "()[B")
	private byte[] method172() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass87Array1[local3] != null && this.aClass87Array1[local3].anInt4180 + this.aClass87Array1[local3].anInt4183 > local1) {
				local1 = this.aClass87Array1[local3].anInt4180 + this.aClass87Array1[local3].anInt4183;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass87Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass87Array1[local54].anInt4180 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass87Array1[local54].anInt4183 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass87Array1[local54].method2988(local70, this.aClass87Array1[local54].anInt4180);
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

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "()Lclient!gf;")
	public Class1_Sub9_Sub1 method173() {
		@Pc(2) byte[] local2 = this.method172();
		return new Class1_Sub9_Sub1(22050, local2, this.anInt333 * 22050 / 1000, this.anInt334 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "()I")
	public int method174() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass87Array1[local3] != null && this.aClass87Array1[local3].anInt4183 / 20 < local1) {
				local1 = this.aClass87Array1[local3].anInt4183 / 20;
			}
		}
		if (this.anInt333 < this.anInt334 && this.anInt333 / 20 < local1) {
			local1 = this.anInt333 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass87Array1[local55] != null) {
				this.aClass87Array1[local55].anInt4183 -= local1 * 20;
			}
		}
		if (this.anInt333 < this.anInt334) {
			this.anInt333 -= local1 * 20;
			this.anInt334 -= local1 * 20;
		}
		return local1;
	}
}
