import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class1_Sub5_Sub1 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ah", name = "Eb", descriptor = "Lclient!ke;")
	private Class132 aClass132_1;

	@OriginalMember(owner = "client!ah", name = "Mb", descriptor = "I")
	private int anInt344;

	static {
		new Class7("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(I)V")
	public Class1_Sub5_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "(I)Z")
	public boolean method308() {
		@Pc(23) int local23 = super.aByteArray89[super.anInt6475] - this.aClass132_1.method3240() & 0xFF;
		return local23 >= 128;
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(ZI)I")
	public int method309(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt344;
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(I[BII)V")
	public void method310(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (super.aByteArray89[super.anInt6475++] - this.aClass132_1.method3239());
		}
	}

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "(I)V")
	public void method312() {
		this.anInt344 = super.anInt6475 * 8;
	}

	@OriginalMember(owner = "client!ah", name = "r", descriptor = "(I)V")
	public void method313() {
		super.anInt6475 = (this.anInt344 + 7) / 8;
	}

	@OriginalMember(owner = "client!ah", name = "s", descriptor = "(I)I")
	public int method314() {
		@Pc(22) int local22 = super.aByteArray89[super.anInt6475++] - this.aClass132_1.method3239() & 0xFF;
		return local22 < 128 ? local22 : (local22 - 128 << 8) + (super.aByteArray89[super.anInt6475++] - this.aClass132_1.method3239() & 0xFF);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B[I)V")
	public void method315(@OriginalArg(1) int[] arg0) {
		this.aClass132_1 = new Class132(arg0);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZ)I")
	public int method316(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt344 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt344 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt344 += arg0;
		while (local18 < arg0) {
			local20 += (Static47.anIntArray69[local18] & super.aByteArray89[local10++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local20 += super.aByteArray89[local10] & Static47.anIntArray69[local18];
		} else {
			local20 += super.aByteArray89[local10] >> local18 - arg0 & Static47.anIntArray69[arg0];
		}
		return local20;
	}

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "(BI)V")
	public void method317(@OriginalArg(1) int arg0) {
		super.aByteArray89[super.anInt6475++] = (byte) (this.aClass132_1.method3239() + arg0);
	}
}
