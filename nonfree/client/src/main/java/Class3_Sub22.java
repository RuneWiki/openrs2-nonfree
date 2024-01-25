import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public final class Class3_Sub22 extends Class3 implements Interface18 {

	@OriginalMember(owner = "client!gga", name = "k", descriptor = "J")
	public long aLong94;

	@OriginalMember(owner = "client!gga", name = "l", descriptor = "I")
	public int anInt3534;

	@OriginalMember(owner = "client!gga", name = "s", descriptor = "I")
	public int anInt3540;

	@OriginalMember(owner = "client!gga", name = "t", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!gga", name = "w", descriptor = "I")
	public int anInt3543;

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Z)J")
	@Override
	public long method3022() {
		return this.aLong94;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)C")
	@Override
	public char method3024() {
		return this.aChar4;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)I")
	@Override
	public int method3023() {
		return this.anInt3534;
	}

	@OriginalMember(owner = "client!gga", name = "c", descriptor = "(I)I")
	@Override
	public int method3026() {
		return this.anInt3540;
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(I)I")
	@Override
	public int method3025() {
		return this.anInt3543;
	}
}
