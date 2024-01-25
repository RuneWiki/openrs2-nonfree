import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class2_Sub3_Sub9 extends Class2_Sub3 {

	@OriginalMember(owner = "client!er", name = "N", descriptor = "I")
	private int anInt1599 = 0;

	@OriginalMember(owner = "client!er", name = "J", descriptor = "I")
	private int anInt1595 = 4096;

	static {
		new Class140("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub9() {
		super(1, true);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			@Pc(27) int[] local27 = this.method5700(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static263.anInt5504; local29++) {
				@Pc(35) int local35 = local27[local29];
				local17[local29] = this.anInt1599 <= local35 && this.anInt1595 >= local35 ? 4096 : 0;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt1599 = arg1.method3104();
		} else if (arg0 == 1) {
			this.anInt1595 = arg1.method3104();
		}
	}
}
