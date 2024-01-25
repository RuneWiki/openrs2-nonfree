import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class Class1_Sub7_Sub1 extends Class1_Sub7 {

	@OriginalMember(owner = "client!me", name = "q", descriptor = "J")
	public long aLong131;

	@OriginalMember(owner = "client!me", name = "v", descriptor = "I")
	public int anInt4408;

	@OriginalMember(owner = "client!me", name = "y", descriptor = "I")
	public int anInt4411;

	@OriginalMember(owner = "client!me", name = "A", descriptor = "I")
	public int anInt4413;

	static {
		new Class7(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)I")
	@Override
	public int method3628() {
		return this.anInt4411;
	}

	@OriginalMember(owner = "client!me", name = "h", descriptor = "(I)I")
	@Override
	public int method3632() {
		return this.anInt4408;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)I")
	@Override
	public int method3633() {
		return this.anInt4413;
	}

	@OriginalMember(owner = "client!me", name = "g", descriptor = "(I)J")
	@Override
	public long method3630() {
		return this.aLong131;
	}
}
