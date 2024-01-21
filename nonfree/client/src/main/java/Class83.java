import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class83 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "[Lclient!sa;")
	private final Class78[] aClass78Array1 = new Class78[10];

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
	private int anInt3950;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
	private int anInt3951;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!ce;)V")
	public Class83(@OriginalArg(0) Class1_Sub8 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1607();
			if (local12 != 0) {
				arg0.anInt2195--;
				this.aClass78Array1[local7] = new Class78();
				this.aClass78Array1[local7].method2617(arg0);
			}
		}
		this.anInt3950 = arg0.method1642();
		this.anInt3951 = arg0.method1642();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "()[B")
	private byte[] method2881() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass78Array1[local3] != null && this.aClass78Array1[local3].anInt3624 + this.aClass78Array1[local3].anInt3626 > local1) {
				local1 = this.aClass78Array1[local3].anInt3624 + this.aClass78Array1[local3].anInt3626;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass78Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass78Array1[local54].anInt3624 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass78Array1[local54].anInt3626 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass78Array1[local54].method2619(local70, this.aClass78Array1[local54].anInt3624);
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

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "()I")
	public int method2883() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass78Array1[local3] != null && this.aClass78Array1[local3].anInt3626 / 20 < local1) {
				local1 = this.aClass78Array1[local3].anInt3626 / 20;
			}
		}
		if (this.anInt3950 < this.anInt3951 && this.anInt3950 / 20 < local1) {
			local1 = this.anInt3950 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass78Array1[local55] != null) {
				this.aClass78Array1[local55].anInt3626 -= local1 * 20;
			}
		}
		if (this.anInt3950 < this.anInt3951) {
			this.anInt3950 -= local1 * 20;
			this.anInt3951 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "()Lclient!ai;")
	public Class1_Sub4_Sub1 method2884() {
		@Pc(2) byte[] local2 = this.method2881();
		return new Class1_Sub4_Sub1(22050, local2, this.anInt3950 * 22050 / 1000, this.anInt3951 * 22050 / 1000);
	}
}
