import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class5_Sub12_Sub2 extends Class5_Sub12 {

	@OriginalMember(owner = "client!sm", name = "Hb", descriptor = "I")
	private int anInt5768;

	@OriginalMember(owner = "client!sm", name = "Ib", descriptor = "Lclient!kb;")
	private Class110 aClass110_1;

	static {
		new Class85("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
		new Class85("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(I)V")
	public Class5_Sub12_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "(B)I")
	public int method5117() {
		return super.aByteArray90[super.anInt5731++] - this.aClass110_1.method2871() & 0xFF;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I[I)V")
	public void method5118(@OriginalArg(1) int[] arg0) {
		this.aClass110_1 = new Class110(arg0);
	}

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "(II)I")
	public int method5119(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt5768;
	}

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "(BI)I")
	public int method5120(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt5768 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt5768 & 0x7);
		this.anInt5768 += arg0;
		@Pc(31) int local31 = 0;
		while (local23 < arg0) {
			local31 += (Static121.anIntArray219[local23] & super.aByteArray90[local10++]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (arg0 == local23) {
			local31 += super.aByteArray90[local10] & Static121.anIntArray219[local23];
		} else {
			local31 += super.aByteArray90[local10] >> local23 - arg0 & Static121.anIntArray219[arg0];
		}
		return local31;
	}

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "(B)V")
	public void method5121() {
		super.anInt5731 = (this.anInt5768 + 7) / 8;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "([BIII)V")
	public void method5122(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (super.aByteArray90[super.anInt5731++] - this.aClass110_1.method2871());
		}
	}

	@OriginalMember(owner = "client!sm", name = "u", descriptor = "(I)V")
	public void method5124() {
		this.anInt5768 = super.anInt5731 * 8;
	}

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "(IB)V")
	public void method5125(@OriginalArg(0) int arg0) {
		super.aByteArray90[super.anInt5731++] = (byte) (this.aClass110_1.method2871() + arg0);
	}
}
