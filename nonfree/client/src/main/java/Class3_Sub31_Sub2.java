import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public final class Class3_Sub31_Sub2 extends Class3_Sub31 {

	@OriginalMember(owner = "client!pw", name = "i", descriptor = "I")
	public int anInt7960;

	@OriginalMember(owner = "client!pw", name = "j", descriptor = "I")
	public int anInt7961;

	@OriginalMember(owner = "client!pw", name = "k", descriptor = "I")
	public int anInt7962;

	@OriginalMember(owner = "client!pw", name = "l", descriptor = "J")
	public long aLong217;

	@OriginalMember(owner = "client!pw", name = "m", descriptor = "I")
	public int anInt7963;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)I")
	@Override
	public int method6920() {
		return this.anInt7962;
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(I)I")
	@Override
	public int method6921() {
		return this.anInt7960;
	}

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "(Z)I")
	@Override
	public int method6924() {
		return this.anInt7963;
	}

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "(I)I")
	@Override
	public int method6923() {
		return this.anInt7961;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)J")
	@Override
	public long method6919() {
		return this.aLong217;
	}
}
