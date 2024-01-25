import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public final class Class5_Sub2_Sub3_Sub1 extends Class5_Sub2_Sub3 {

	@OriginalMember(owner = "client!bh", name = "K", descriptor = "Lclient!cn;")
	public Class35 aClass35_1;

	@OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
	public int anInt616;

	@OriginalMember(owner = "client!bh", name = "M", descriptor = "[B")
	public byte[] aByteArray7;

	static {
		new Class198("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "(I)I")
	@Override
	public int method4878() {
		return super.aBoolean403 ? 0 : 100;
	}

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method4877() {
		if (super.aBoolean403) {
			throw new RuntimeException();
		}
		return this.aByteArray7;
	}
}
