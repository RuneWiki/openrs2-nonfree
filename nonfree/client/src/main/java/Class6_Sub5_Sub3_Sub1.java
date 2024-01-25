import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public final class Class6_Sub5_Sub3_Sub1 extends Class6_Sub5_Sub3 {

	@OriginalMember(owner = "client!ifa", name = "E", descriptor = "I")
	public int anInt4087;

	@OriginalMember(owner = "client!ifa", name = "F", descriptor = "Lclient!fo;")
	public Class109 aClass109_4;

	@OriginalMember(owner = "client!ifa", name = "G", descriptor = "[B")
	public byte[] aByteArray54;

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "(Z)[B")
	@Override
	public byte[] method5767() {
		if (super.aBoolean492) {
			throw new RuntimeException();
		}
		return this.aByteArray54;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)I")
	@Override
	public int method5769() {
		return super.aBoolean492 ? 0 : 100;
	}
}
