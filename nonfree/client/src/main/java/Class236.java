import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class Class236 {

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
	public int anInt6382;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
	public int anInt6385;

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
	public int anInt6386;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)Z")
	public final boolean method5363() {
		return (this.anInt6386 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)Z")
	public final boolean method5365() {
		return (this.anInt6386 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)Z")
	public final boolean method5366() {
		return (this.anInt6386 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)Z")
	public final boolean method5367() {
		return (this.anInt6386 & 0x8) != 0;
	}
}
