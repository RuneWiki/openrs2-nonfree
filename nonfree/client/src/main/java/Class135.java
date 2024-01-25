import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class135 {

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "[Lclient!ad;")
	private final Class5[] aClass5Array1 = new Class5[10];

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
	private int anInt4440;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
	private int anInt4439;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ef;)V")
	public Class135(@OriginalArg(0) Class2_Sub12 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method3124();
			if (local12 != 0) {
				arg0.anInt3606--;
				this.aClass5Array1[local7] = new Class5();
				this.aClass5Array1[local7].method75(arg0);
			}
		}
		this.anInt4440 = arg0.method3104();
		this.anInt4439 = arg0.method3104();
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
	private Class135() {
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "()I")
	public int method3856() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass5Array1[local3] != null && this.aClass5Array1[local3].anInt79 / 20 < local1) {
				local1 = this.aClass5Array1[local3].anInt79 / 20;
			}
		}
		if (this.anInt4440 < this.anInt4439 && this.anInt4440 / 20 < local1) {
			local1 = this.anInt4440 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass5Array1[local55] != null) {
				this.aClass5Array1[local55].anInt79 -= local1 * 20;
			}
		}
		if (this.anInt4440 < this.anInt4439) {
			this.anInt4440 -= local1 * 20;
			this.anInt4439 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "()[B")
	private byte[] method3858() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass5Array1[local3] != null && this.aClass5Array1[local3].anInt77 + this.aClass5Array1[local3].anInt79 > local1) {
				local1 = this.aClass5Array1[local3].anInt77 + this.aClass5Array1[local3].anInt79;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass5Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass5Array1[local54].anInt77 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass5Array1[local54].anInt79 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass5Array1[local54].method76(local70, this.aClass5Array1[local54].anInt77);
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

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "()Lclient!ar;")
	public Class2_Sub5_Sub1 method3859() {
		@Pc(2) byte[] local2 = this.method3858();
		return new Class2_Sub5_Sub1(22050, local2, this.anInt4440 * 22050 / 1000, this.anInt4439 * 22050 / 1000);
	}
}
