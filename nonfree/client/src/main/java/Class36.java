import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class36 {

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "[Lclient!ab;")
	private final Class3[] aClass3Array1 = new Class3[10];

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
	private int anInt1503;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
	private int anInt1502;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!tc;)V")
	public Class36(@OriginalArg(0) Class10_Sub10 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1111();
			if (local12 != 0) {
				arg0.anInt1957--;
				this.aClass3Array1[local7] = new Class3();
				this.aClass3Array1[local7].method23(arg0);
			}
		}
		this.anInt1503 = arg0.method1160();
		this.anInt1502 = arg0.method1160();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "()Lclient!oc;")
	public Class10_Sub9_Sub1 method825() {
		@Pc(2) byte[] local2 = this.method828();
		return new Class10_Sub9_Sub1(22050, local2, this.anInt1503 * 22050 / 1000, this.anInt1502 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "()I")
	public int method826() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass3Array1[local3] != null && this.aClass3Array1[local3].anInt12 / 20 < local1) {
				local1 = this.aClass3Array1[local3].anInt12 / 20;
			}
		}
		if (this.anInt1503 < this.anInt1502 && this.anInt1503 / 20 < local1) {
			local1 = this.anInt1503 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass3Array1[local55] != null) {
				this.aClass3Array1[local55].anInt12 -= local1 * 20;
			}
		}
		if (this.anInt1503 < this.anInt1502) {
			this.anInt1503 -= local1 * 20;
			this.anInt1502 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "()[B")
	private byte[] method828() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass3Array1[local3] != null && this.aClass3Array1[local3].anInt14 + this.aClass3Array1[local3].anInt12 > local1) {
				local1 = this.aClass3Array1[local3].anInt14 + this.aClass3Array1[local3].anInt12;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass3Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass3Array1[local54].anInt14 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass3Array1[local54].anInt12 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass3Array1[local54].method25(local70, this.aClass3Array1[local54].anInt14);
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
