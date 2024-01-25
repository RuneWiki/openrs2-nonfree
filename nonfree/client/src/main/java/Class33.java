import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class Class33 {

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
	public int anInt6143;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
	public int anInt6148;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
	public int anInt6149;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Z")
	public final boolean method5449() {
		return (this.anInt6143 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)Z")
	public final boolean method5451() {
		return (this.anInt6143 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)Z")
	public final boolean method5452() {
		return (this.anInt6143 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)Z")
	public final boolean method5455() {
		return (this.anInt6143 & 0x4) != 0;
	}
}
