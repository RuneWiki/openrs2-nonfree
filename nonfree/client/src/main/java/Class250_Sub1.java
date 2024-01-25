import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Class250_Sub1 extends Class250 {

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "J")
	public long aLong206;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "Lclient!ve;")
	public Class250_Sub1 aClass250_Sub1_4;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "Z")
	public boolean aBoolean480;

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
	public int anInt6875;

	@OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
	public int anInt6876;

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)J")
	@Override
	public long method5640() {
		return this.aLong206;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I")
	@Override
	public int method5641() {
		return this.anInt6875;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5638() {
		return this.aBoolean480;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)I")
	@Override
	public int method5639() {
		return this.anInt6876;
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)C")
	@Override
	public char method5645() {
		return this.aChar5;
	}
}
