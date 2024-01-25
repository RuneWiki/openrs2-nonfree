import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public final class Class4_Sub4_Sub2_Sub1 extends Class4_Sub4_Sub2 {

	@OriginalMember(owner = "client!bo", name = "M", descriptor = "I")
	public int anInt634;

	@OriginalMember(owner = "client!bo", name = "Q", descriptor = "B")
	public byte aByte9;

	@OriginalMember(owner = "client!bo", name = "U", descriptor = "Lclient!lf;")
	public Class4_Sub11 aClass4_Sub11_3;

	static {
		new Class159("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(Z)I")
	@Override
	public int method2405() {
		return this.aClass4_Sub11_3 == null ? 0 : this.aClass4_Sub11_3.anInt3768 * 100 / (this.aClass4_Sub11_3.aByteArray55.length - this.aByte9);
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)[B")
	@Override
	public byte[] method2408() {
		if (super.aBoolean197 || this.aClass4_Sub11_3.aByteArray55.length - this.aByte9 > this.aClass4_Sub11_3.anInt3768) {
			throw new RuntimeException();
		}
		return this.aClass4_Sub11_3.aByteArray55;
	}
}
