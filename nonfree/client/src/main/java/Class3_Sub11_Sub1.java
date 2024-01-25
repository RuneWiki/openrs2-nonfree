import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class3_Sub11_Sub1 extends Class3_Sub11 {

	@OriginalMember(owner = "client!bw", name = "Hb", descriptor = "I")
	private int anInt1239;

	@OriginalMember(owner = "client!bw", name = "Qb", descriptor = "Lclient!rh;")
	private Class287 aClass287_1;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(I)V")
	public Class3_Sub11_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bw", name = "z", descriptor = "(I)V")
	public void method989() {
		super.anInt3520 = (this.anInt1239 + 7) / 8;
	}

	@OriginalMember(owner = "client!bw", name = "n", descriptor = "(II)I")
	public int method990(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt1239 >> 3;
		@Pc(17) int local17 = 8 - (this.anInt1239 & 0x7);
		@Pc(19) int local19 = 0;
		this.anInt1239 += arg0;
		while (local17 < arg0) {
			local19 += (Static325.anIntArray452[local17] & super.aByteArray36[local10++]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (local17 == arg0) {
			local19 += super.aByteArray36[local10] & Static325.anIntArray452[local17];
		} else {
			local19 += super.aByteArray36[local10] >> local17 - arg0 & Static325.anIntArray452[arg0];
		}
		return local19;
	}

	@OriginalMember(owner = "client!bw", name = "m", descriptor = "(B)V")
	public void method992() {
		this.anInt1239 = super.anInt3520 * 8;
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(III[B)V")
	public void method993(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (super.aByteArray36[super.anInt3520++] - this.aClass287_1.method6311());
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILclient!rh;)V")
	public void method994(@OriginalArg(1) Class287 arg0) {
		this.aClass287_1 = arg0;
	}

	@OriginalMember(owner = "client!bw", name = "n", descriptor = "(B)Z")
	public boolean method995() {
		@Pc(22) int local22 = super.aByteArray36[super.anInt3520] - this.aClass287_1.method6309() & 0xFF;
		return local22 >= 128;
	}

	@OriginalMember(owner = "client!bw", name = "o", descriptor = "(II)V")
	public void method996(@OriginalArg(1) int arg0) {
		super.aByteArray36[super.anInt3520++] = (byte) (this.aClass287_1.method6311() + arg0);
	}

	@OriginalMember(owner = "client!bw", name = "p", descriptor = "(II)I")
	public int method997(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt1239;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "([II)V")
	public void method998(@OriginalArg(0) int[] arg0) {
		this.aClass287_1 = new Class287(arg0);
	}

	@OriginalMember(owner = "client!bw", name = "p", descriptor = "(B)I")
	public int method1000() {
		@Pc(29) int local29 = super.aByteArray36[super.anInt3520++] - this.aClass287_1.method6311() & 0xFF;
		return local29 < 128 ? local29 : (local29 - 128 << 8) + (super.aByteArray36[super.anInt3520++] - this.aClass287_1.method6311() & 0xFF);
	}
}
