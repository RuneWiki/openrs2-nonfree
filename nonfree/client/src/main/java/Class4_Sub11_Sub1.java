import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class4_Sub11_Sub1 extends Class4_Sub11 {

	@OriginalMember(owner = "client!bn", name = "Kb", descriptor = "Lclient!kl;")
	private Class196 aClass196_1;

	@OriginalMember(owner = "client!bn", name = "Qb", descriptor = "I")
	private int anInt1067;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(I)V")
	public Class4_Sub11_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(I[I)V")
	public void method985(@OriginalArg(1) int[] arg0) {
		this.aClass196_1 = new Class196(arg0);
	}

	@OriginalMember(owner = "client!bn", name = "x", descriptor = "(I)V")
	public void method986() {
		this.anInt1067 = super.anInt10466 * 8;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!kl;I)V")
	public void method987(@OriginalArg(0) Class196 arg0) {
		this.aClass196_1 = arg0;
	}

	@OriginalMember(owner = "client!bn", name = "m", descriptor = "(II)I")
	public int method988(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt1067 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt1067 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt1067 += arg0;
		while (arg0 > local18) {
			local20 += (super.aByteArray107[local10++] & Static609.anIntArray660[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (local18 == arg0) {
			local20 += Static609.anIntArray660[local18] & super.aByteArray107[local10];
		} else {
			local20 += super.aByteArray107[local10] >> local18 - arg0 & Static609.anIntArray660[arg0];
		}
		return local20;
	}

	@OriginalMember(owner = "client!bn", name = "n", descriptor = "(II)I")
	public int method989(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt1067;
	}

	@OriginalMember(owner = "client!bn", name = "y", descriptor = "(I)Z")
	public boolean method990() {
		@Pc(16) int local16 = super.aByteArray107[super.anInt10466] - this.aClass196_1.method4376() & 0xFF;
		return local16 >= 128;
	}

	@OriginalMember(owner = "client!bn", name = "z", descriptor = "(I)V")
	public void method992() {
		super.anInt10466 = (this.anInt1067 + 7) / 8;
	}

	@OriginalMember(owner = "client!bn", name = "n", descriptor = "(B)I")
	public int method993() {
		@Pc(22) int local22 = super.aByteArray107[super.anInt10466++] - this.aClass196_1.method4375() & 0xFF;
		return local22 < 128 ? local22 : (local22 - 128 << 8) + (super.aByteArray107[super.anInt10466++] - this.aClass196_1.method4375() & 0xFF);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III[B)V")
	public void method994(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (super.aByteArray107[super.anInt10466++] - this.aClass196_1.method4375());
		}
	}

	@OriginalMember(owner = "client!bn", name = "o", descriptor = "(II)V")
	public void method996(@OriginalArg(1) int arg0) {
		super.aByteArray107[super.anInt10466++] = (byte) (arg0 + this.aClass196_1.method4375());
	}
}
