import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class4_Sub13_Sub2 extends Class4_Sub13 {

	@OriginalMember(owner = "client!sj", name = "Ub", descriptor = "I")
	private int anInt9192;

	@OriginalMember(owner = "client!sj", name = "Wb", descriptor = "Lclient!we;")
	private Class356 aClass356_2;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(I)V")
	public Class4_Sub13_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([II)V")
	public void method7055(@OriginalArg(0) int[] arg0) {
		this.aClass356_2 = new Class356(arg0);
	}

	@OriginalMember(owner = "client!sj", name = "q", descriptor = "(B)I")
	public int method7056() {
		@Pc(30) int local30 = super.aByteArray88[super.anInt9170++] - this.aClass356_2.method8114() & 0xFF;
		return local30 < 128 ? local30 : (super.aByteArray88[super.anInt9170++] - this.aClass356_2.method8114() & 0xFF) + (local30 - 128 << 8);
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(ZI)I")
	public int method7057(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt9192;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!we;I)V")
	public void method7058(@OriginalArg(0) Class356 arg0) {
		this.aClass356_2 = arg0;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I[BII)V")
	public void method7059(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = (byte) (super.aByteArray88[super.anInt9170++] - this.aClass356_2.method8114());
		}
	}

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "(II)V")
	public void method7060(@OriginalArg(1) int arg0) {
		super.aByteArray88[super.anInt9170++] = (byte) (this.aClass356_2.method8114() + arg0);
	}

	@OriginalMember(owner = "client!sj", name = "s", descriptor = "(I)V")
	public void method7062() {
		super.anInt9170 = (this.anInt9192 + 7) / 8;
	}

	@OriginalMember(owner = "client!sj", name = "r", descriptor = "(B)V")
	public void method7063() {
		this.anInt9192 = super.anInt9170 * 8;
	}

	@OriginalMember(owner = "client!sj", name = "t", descriptor = "(I)Z")
	public boolean method7064() {
		@Pc(17) int local17 = super.aByteArray88[super.anInt9170] - this.aClass356_2.method8113() & 0xFF;
		return local17 >= 128;
	}

	@OriginalMember(owner = "client!sj", name = "l", descriptor = "(II)I")
	public int method7065(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt9192 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt9192 & 0x7);
		this.anInt9192 += arg0;
		@Pc(34) int local34 = 0;
		while (local18 < arg0) {
			local34 += (super.aByteArray88[local10++] & Static451.anIntArray499[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local34 += Static451.anIntArray499[local18] & super.aByteArray88[local10];
		} else {
			local34 += super.aByteArray88[local10] >> local18 - arg0 & Static451.anIntArray499[arg0];
		}
		return local34;
	}
}
