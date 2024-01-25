import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uea")
public final class Class331 {

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "[Lclient!wn;")
	private final Class361[] aClass361Array1 = new Class361[10];

	@OriginalMember(owner = "client!uea", name = "c", descriptor = "I")
	private int anInt8748;

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "I")
	private int anInt8747;

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class331(@OriginalArg(0) Class2_Sub15 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method4325();
			if (local12 != 0) {
				arg0.anInt5241--;
				this.aClass361Array1[local7] = new Class361();
				this.aClass361Array1[local7].method7953(arg0);
			}
		}
		this.anInt8748 = arg0.method4294();
		this.anInt8747 = arg0.method4294();
	}

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "()V")
	private Class331() {
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "()[B")
	private byte[] method7302() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass361Array1[local3] != null && this.aClass361Array1[local3].anInt9568 + this.aClass361Array1[local3].anInt9566 > local1) {
				local1 = this.aClass361Array1[local3].anInt9568 + this.aClass361Array1[local3].anInt9566;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass361Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass361Array1[local54].anInt9568 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass361Array1[local54].anInt9566 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass361Array1[local54].method7956(local70, this.aClass361Array1[local54].anInt9568);
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

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "()I")
	public int method7304() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass361Array1[local3] != null && this.aClass361Array1[local3].anInt9566 / 20 < local1) {
				local1 = this.aClass361Array1[local3].anInt9566 / 20;
			}
		}
		if (this.anInt8748 < this.anInt8747 && this.anInt8748 / 20 < local1) {
			local1 = this.anInt8748 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass361Array1[local55] != null) {
				this.aClass361Array1[local55].anInt9566 -= local1 * 20;
			}
		}
		if (this.anInt8748 < this.anInt8747) {
			this.anInt8748 -= local1 * 20;
			this.anInt8747 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!uea", name = "c", descriptor = "()Lclient!oaa;")
	public Class2_Sub7_Sub1 method7305() {
		@Pc(2) byte[] local2 = this.method7302();
		return new Class2_Sub7_Sub1(22050, local2, this.anInt8748 * 22050 / 1000, this.anInt8747 * 22050 / 1000);
	}
}
