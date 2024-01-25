import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public abstract class Class204 {

	@OriginalMember(owner = "client!kda", name = "h", descriptor = "I")
	public int anInt6021;

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "I")
	public int anInt6024;

	@OriginalMember(owner = "client!kda", name = "d", descriptor = "I")
	public int anInt6029;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)Z")
	public final boolean method5426() {
		return (this.anInt6021 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Z)Z")
	public final boolean method5427() {
		return (this.anInt6021 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(B)Z")
	public final boolean method5429() {
		return (this.anInt6021 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)Z")
	public final boolean method5431() {
		return (this.anInt6021 & 0x4) != 0;
	}
}
