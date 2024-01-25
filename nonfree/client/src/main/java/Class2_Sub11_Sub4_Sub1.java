import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public final class Class2_Sub11_Sub4_Sub1 extends Class2_Sub11_Sub4 {

	@OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
	public int anInt2251;

	@OriginalMember(owner = "client!ga", name = "U", descriptor = "Lclient!gb;")
	public Class71 aClass71_1;

	@OriginalMember(owner = "client!ga", name = "W", descriptor = "[B")
	public byte[] aByteArray39;

	static {
		new Class93("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)I")
	@Override
	public int method4518() {
		return super.aBoolean446 ? 0 : 100;
	}

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)[B")
	@Override
	public byte[] method4520() {
		if (super.aBoolean446) {
			throw new RuntimeException();
		}
		return this.aByteArray39;
	}
}
