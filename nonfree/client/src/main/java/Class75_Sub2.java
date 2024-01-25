import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class75_Sub2 extends Class75 {

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
	private int anInt4403 = 0;

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "Lclient!kg;")
	private final Class86 aClass86_1 = new Class86();

	static {
		new Class306("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLclient!rg;)V")
	@Override
	public void method3837(@OriginalArg(1) Class255 arg0) {
		super.aByteArray65[super.anInt4400] = 21;
		super.anObjectArray3[super.anInt4400] = arg0;
		super.anInt4400++;
		if (super.anInt4400 >= 5000) {
			super.anInt4400 = 0;
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)V")
	@Override
	public void method3834(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
	@Override
	public void method3839(@OriginalArg(0) int arg0) {
		super.aByteArray65[super.anInt4400] = (byte) arg0;
		super.anInt4400++;
		if (super.anInt4400 >= 5000) {
			super.anInt4400 = 0;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!rg;)V")
	@Override
	public void method3842(@OriginalArg(1) Class255 arg0) {
		super.anInt4392--;
		if (super.anInt4392 < 0) {
			super.anInt4392 = 4999;
		}
		super.aByteArray65[super.anInt4392] = 21;
		super.anObjectArray3[super.anInt4392] = arg0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!rg;B)V")
	@Override
	public void method3835(@OriginalArg(0) Class255 arg0) {
		super.aByteArray65[super.anInt4400] = 20;
		super.anObjectArray3[super.anInt4400] = arg0;
		super.anInt4400++;
		if (super.anInt4400 >= 5000) {
			super.anInt4400 = 0;
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(Z)V")
	private void method3845() {
		@Pc(13) int local13 = super.anInt4392++;
		if (super.anInt4392 >= 5000) {
			super.anInt4392 = 0;
		}
		this.anInt4403 = super.aByteArray65[local13];
		@Pc(39) Object local39 = super.anObjectArray3[local13];
		super.anObjectArray3[local13] = null;
		if (this.anInt4403 == 21) {
			Static342.method5171(this.aClass86_1, (Class255) local39);
		} else if (this.anInt4403 == 20) {
			@Pc(65) Class255 local65 = (Class255) local39;
			if (local65.aClass49_Sub1_3 != null) {
				local65.aClass49_Sub1_3.method7455(Static416.aClass122_7);
			}
			if (local65.aClass49_Sub1_2 != null) {
				local65.aClass49_Sub1_2.method7455(Static416.aClass122_7);
			}
			if (local65.aClass49_Sub3_1 != null) {
				local65.aClass49_Sub3_1.method7455(Static416.aClass122_7);
			}
			if (local65.aClass49_Sub3_2 != null) {
				local65.aClass49_Sub3_2.method7455(Static416.aClass122_7);
			}
			if (local65.aClass49_Sub5_2 != null) {
				local65.aClass49_Sub5_2.method7455(Static416.aClass122_7);
			}
			for (@Pc(108) Class63 local108 = local65.aClass63_3; local108 != null; local108 = local108.aClass63_1) {
				local108.aClass49_Sub2_1.method7455(Static416.aClass122_7);
			}
		} else if (this.anInt4403 >= 30 && this.anInt4403 <= 33) {
			((Class205) local39).method6750(Static393.anInt7097, Static211.anInt4100, Static251.anInt4913, Static149.aBooleanArrayArray5, this.anInt4403 - 30 == 0);
		} else if (this.anInt4403 >= 40 && this.anInt4403 <= 43) {
			((Class205) local39).method6750(Static393.anInt7097, Static211.anInt4100, Static251.anInt4913, Static360.aBooleanArrayArray6, this.anInt4403 - 40 == 0);
		} else if (this.anInt4403 == 22) {
			Static416.aClass122_7.q(-1, 1583160, 40, 127);
		} else if (this.anInt4403 == 23) {
			Static416.aClass122_7.xa();
		} else if (this.anInt4403 == 24) {
			Static416.aClass122_7.method7264(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZIILclient!sa;)V")
	@Override
	public void method3831(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class205 arg2) {
		super.aByteArray65[super.anInt4400] = (byte) (arg0 ? arg1 + 40 : arg1 + 30);
		super.anObjectArray3[super.anInt4400] = arg2;
		super.anInt4400++;
		if (super.anInt4400 >= 5000) {
			super.anInt4400 = 0;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
	@Override
	public void method3836() {
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
	@Override
	public void method3840() {
		while (super.anInt4400 != super.anInt4392) {
			this.method3845();
		}
	}
}
