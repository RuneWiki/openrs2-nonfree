import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public final class Class29 {

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
	public int anInt1780;

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
	public int anInt1782;

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
	public int anInt1783;

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
	public int anInt1786;

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
	public int anInt1787;

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "B")
	private byte aByte5;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	public Class29() {
	}

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!fa;)V")
	public Class29(@OriginalArg(0) Class1_Sub9 arg0) {
		this.aByte5 = arg0.method1243();
		this.anInt1787 = arg0.method1280();
		this.anInt1782 = arg0.method1273();
		this.anInt1783 = arg0.method1273();
		this.anInt1786 = arg0.method1273();
		this.anInt1780 = arg0.method1273();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)I")
	public int method1375() {
		return this.aByte5 & 0x7;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)I")
	public int method1377() {
		return (this.aByte5 & 0x8) == 8 ? 1 : 0;
	}
}
