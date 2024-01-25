import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public final class Class3_Sub11 extends Class3 {

	@OriginalMember(owner = "client!cr", name = "x", descriptor = "I")
	public final int anInt1877;

	@OriginalMember(owner = "client!cr", name = "v", descriptor = "I")
	public final int anInt1876;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(II)V")
	public Class3_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1877 = arg0;
		this.anInt1876 = arg1;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)I")
	public int method1757() {
		return Static316.method5506(this.anInt1877);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)Z")
	public boolean method1758(@OriginalArg(1) int arg0) {
		return (this.anInt1877 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "(B)Z")
	public boolean method1760() {
		return (this.anInt1877 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)I")
	public int method1761() {
		return this.anInt1877 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)Z")
	public boolean method1762() {
		return (this.anInt1877 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)Z")
	public boolean method1763() {
		return (this.anInt1877 >> 22 & 0x1) != 0;
	}
}
