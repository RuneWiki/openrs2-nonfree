import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public abstract class Class127 {

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
	public int anInt6375;

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
	public int anInt6376;

	@OriginalMember(owner = "client!kq", name = "o", descriptor = "I")
	public int anInt6384;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)Z")
	public final boolean method5481() {
		return (this.anInt6376 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)Z")
	public final boolean method5482() {
		return (this.anInt6376 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)Z")
	public final boolean method5483() {
		return (this.anInt6376 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)Z")
	public final boolean method5487() {
		return (this.anInt6376 & 0x4) != 0;
	}
}
