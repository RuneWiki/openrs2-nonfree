import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public final class Class2_Sub10_Sub9_Sub1 extends Class2_Sub10_Sub9 {

	@OriginalMember(owner = "client!gq", name = "Q", descriptor = "Lclient!kk;")
	public Class2_Sub16 aClass2_Sub16_4;

	@OriginalMember(owner = "client!gq", name = "R", descriptor = "B")
	public byte aByte24;

	@OriginalMember(owner = "client!gq", name = "S", descriptor = "I")
	public int anInt2494;

	static {
		new Class32("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "(I)I")
	@Override
	public int method4241() {
		return this.aClass2_Sub16_4 == null ? 0 : this.aClass2_Sub16_4.anInt6145 * 100 / (this.aClass2_Sub16_4.aByteArray112.length - this.aByte24);
	}

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "(I)[B")
	@Override
	public byte[] method4243() {
		if (super.aBoolean362 || this.aClass2_Sub16_4.aByteArray112.length - this.aByte24 > this.aClass2_Sub16_4.anInt6145) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub16_4.aByteArray112;
	}
}
