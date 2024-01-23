import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class43 {

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "[Lclient!gb;")
	private Class42[] aClass42Array1 = new Class42[10];

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
	private int anInt1596;

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
	private int anInt1597;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!vf;)V")
	public Class43(@OriginalArg(0) Class1_Sub26 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method2945();
			if (local12 != 0) {
				arg0.anInt4021--;
				this.aClass42Array1[local7] = new Class42();
				this.aClass42Array1[local7].method1230(arg0);
			}
		}
		this.anInt1596 = arg0.method2964();
		this.anInt1597 = arg0.method2964();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "()Lclient!ee;")
	public Class1_Sub7_Sub1 method1253() {
		@Pc(2) byte[] local2 = this.method1255();
		return new Class1_Sub7_Sub1(22050, local2, this.anInt1596 * 22050 / 1000, this.anInt1597 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "()I")
	public int method1254() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass42Array1[local3] != null && this.aClass42Array1[local3].anInt1564 / 20 < local1) {
				local1 = this.aClass42Array1[local3].anInt1564 / 20;
			}
		}
		if (this.anInt1596 < this.anInt1597 && this.anInt1596 / 20 < local1) {
			local1 = this.anInt1596 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass42Array1[local55] != null) {
				this.aClass42Array1[local55].anInt1564 -= local1 * 20;
			}
		}
		if (this.anInt1596 < this.anInt1597) {
			this.anInt1596 -= local1 * 20;
			this.anInt1597 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "()[B")
	private byte[] method1255() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass42Array1[local3] != null && this.aClass42Array1[local3].anInt1562 + this.aClass42Array1[local3].anInt1564 > local1) {
				local1 = this.aClass42Array1[local3].anInt1562 + this.aClass42Array1[local3].anInt1564;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass42Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass42Array1[local54].anInt1562 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass42Array1[local54].anInt1564 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass42Array1[local54].method1232(local70, this.aClass42Array1[local54].anInt1562);
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
