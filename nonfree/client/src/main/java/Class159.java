import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class159 {

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "[Lclient!lj;")
	private final Class145[] aClass145Array1 = new Class145[10];

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
	private int anInt3833;

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
	private int anInt3834;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!re;)V")
	public Class159(@OriginalArg(0) Class1_Sub33 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method5174();
			if (local12 != 0) {
				arg0.lb--;
				this.aClass145Array1[local7] = new Class145();
				this.aClass145Array1[local7].method2944(arg0);
			}
		}
		this.anInt3833 = arg0.method5177();
		this.anInt3834 = arg0.method5177();
	}

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
	private Class159() {
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "()I")
	public int method3167() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass145Array1[local3] != null && this.aClass145Array1[local3].anInt3610 / 20 < local1) {
				local1 = this.aClass145Array1[local3].anInt3610 / 20;
			}
		}
		if (this.anInt3833 < this.anInt3834 && this.anInt3833 / 20 < local1) {
			local1 = this.anInt3833 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass145Array1[local55] != null) {
				this.aClass145Array1[local55].anInt3610 -= local1 * 20;
			}
		}
		if (this.anInt3833 < this.anInt3834) {
			this.anInt3833 -= local1 * 20;
			this.anInt3834 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "()Lclient!uk;")
	public Class1_Sub31_Sub1 method3168() {
		@Pc(2) byte[] local2 = this.method3169();
		return new Class1_Sub31_Sub1(22050, local2, this.anInt3833 * 22050 / 1000, this.anInt3834 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "()[B")
	private byte[] method3169() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass145Array1[local3] != null && this.aClass145Array1[local3].anInt3609 + this.aClass145Array1[local3].anInt3610 > local1) {
				local1 = this.aClass145Array1[local3].anInt3609 + this.aClass145Array1[local3].anInt3610;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass145Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass145Array1[local54].anInt3609 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass145Array1[local54].anInt3610 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass145Array1[local54].method2941(local70, this.aClass145Array1[local54].anInt3609);
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
}
