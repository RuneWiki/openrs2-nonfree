import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class6_Sub21_Sub2 extends Class6_Sub21 {

	@OriginalMember(owner = "client!qf", name = "Cb", descriptor = "I")
	private int anInt7356;

	@OriginalMember(owner = "client!qf", name = "Fb", descriptor = "Lclient!tu;")
	private Class324 aClass324_2;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(I)V")
	public Class6_Sub21_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLclient!tu;)V")
	public void method6072(@OriginalArg(1) Class324 arg0) {
		this.aClass324_2 = arg0;
	}

	@OriginalMember(owner = "client!qf", name = "u", descriptor = "(I)I")
	public int method6074() {
		@Pc(22) int local22 = super.aByteArray93[super.anInt7338++] - this.aClass324_2.method7158() & 0xFF;
		return local22 < 128 ? local22 : (local22 - 128 << 8) + (super.aByteArray93[super.anInt7338++] - this.aClass324_2.method7158() & 0xFF);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[I)V")
	public void method6075(@OriginalArg(1) int[] arg0) {
		this.aClass324_2 = new Class324(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "(B)V")
	public void method6076() {
		super.anInt7338 = (this.anInt7356 + 7) / 8;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B[BII)V")
	public void method6077(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (super.aByteArray93[super.anInt7338++] - this.aClass324_2.method7158());
		}
	}

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "(II)I")
	public int method6078(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt7356 >> 3;
		@Pc(17) int local17 = 8 - (this.anInt7356 & 0x7);
		@Pc(19) int local19 = 0;
		this.anInt7356 += arg0;
		while (arg0 > local17) {
			local19 += (Static351.anIntArray714[local17] & super.aByteArray93[local10++]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (arg0 == local17) {
			local19 += super.aByteArray93[local10] & Static351.anIntArray714[local17];
		} else {
			local19 += super.aByteArray93[local10] >> local17 - arg0 & Static351.anIntArray714[arg0];
		}
		return local19;
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "(BI)V")
	public void method6080(@OriginalArg(1) int arg0) {
		super.aByteArray93[super.anInt7338++] = (byte) (arg0 + this.aClass324_2.method7158());
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "(IB)I")
	public int method6081(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt7356;
	}

	@OriginalMember(owner = "client!qf", name = "v", descriptor = "(I)V")
	public void method6082() {
		this.anInt7356 = super.anInt7338 * 8;
	}

	@OriginalMember(owner = "client!qf", name = "w", descriptor = "(I)Z")
	public boolean method6086() {
		@Pc(25) int local25 = super.aByteArray93[super.anInt7338] - this.aClass324_2.method7159() & 0xFF;
		return local25 >= 128;
	}
}
