import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public final class Class4_Sub24_Sub2 extends Class4_Sub24 {

	@OriginalMember(owner = "client!qga", name = "t", descriptor = "I")
	public int anInt8208;

	@OriginalMember(owner = "client!qga", name = "z", descriptor = "I")
	public int anInt8213;

	@OriginalMember(owner = "client!qga", name = "B", descriptor = "J")
	public long aLong218;

	@OriginalMember(owner = "client!qga", name = "F", descriptor = "I")
	public int anInt8217;

	@OriginalMember(owner = "client!qga", name = "H", descriptor = "I")
	public int anInt8219;

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)I")
	@Override
	public int method6389() {
		return this.anInt8208;
	}

	@OriginalMember(owner = "client!qga", name = "d", descriptor = "(I)I")
	@Override
	public int method6394() {
		return this.anInt8217;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Z)I")
	@Override
	public int method6390() {
		return this.anInt8219;
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)J")
	@Override
	public long method6392() {
		return this.aLong218;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)I")
	@Override
	public int method6391() {
		return this.anInt8213;
	}
}
