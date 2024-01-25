import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class5_Sub3_Sub1 extends Class5_Sub3 {

	@OriginalMember(owner = "client!aj", name = "Hb", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!aj", name = "Sb", descriptor = "Lclient!h;")
	private Class121 aClass121_1;

	static {
		new Class40("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	}

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(I)V")
	public Class5_Sub3_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aj", name = "y", descriptor = "(I)V")
	public void method519() {
		this.anInt392 = super.anInt4960 * 8;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I[I)V")
	public void method520(@OriginalArg(1) int[] arg0) {
		this.aClass121_1 = new Class121(arg0);
	}

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "(B)Z")
	public boolean method522() {
		@Pc(21) int local21 = super.aByteArray66[super.anInt4960] - this.aClass121_1.method3026() & 0xFF;
		return local21 >= 128;
	}

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "(II)I")
	public int method524(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt392 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt392 & 0x7);
		this.anInt392 += arg0;
		@Pc(26) int local26 = 0;
		while (local18 < arg0) {
			local26 += (super.aByteArray66[local10++] & Static56.anIntArray155[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local26 += super.aByteArray66[local10] & Static56.anIntArray155[local18];
		} else {
			local26 += super.aByteArray66[local10] >> local18 - arg0 & Static56.anIntArray155[arg0];
		}
		return local26;
	}

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "(II)I")
	public int method525(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt392;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZ[BI)V")
	public void method526(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			arg0[local12] = (byte) (super.aByteArray66[super.anInt4960++] - this.aClass121_1.method3024());
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(IB)V")
	public void method527(@OriginalArg(0) int arg0) {
		super.aByteArray66[super.anInt4960++] = (byte) (arg0 + this.aClass121_1.method3024());
	}

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "(B)I")
	public int method531() {
		@Pc(22) int local22 = super.aByteArray66[super.anInt4960++] - this.aClass121_1.method3024() & 0xFF;
		return local22 < 128 ? local22 : (super.aByteArray66[super.anInt4960++] - this.aClass121_1.method3024() & 0xFF) + (local22 - 128 << 8);
	}

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "(B)V")
	public void method532() {
		super.anInt4960 = (this.anInt392 + 7) / 8;
	}
}
