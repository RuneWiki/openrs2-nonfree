import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public final class Class2_Sub23 extends Class2 {

	@OriginalMember(owner = "client!iga", name = "l", descriptor = "I")
	public final int anInt3330;

	@OriginalMember(owner = "client!iga", name = "i", descriptor = "I")
	public final int anInt3327;

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(II)V")
	public Class2_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3330 = arg0;
		this.anInt3327 = arg1;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(B)Z")
	public boolean method2764() {
		return (this.anInt3330 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)Z")
	public boolean method2766() {
		return (this.anInt3330 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "(I)I")
	public int method2767() {
		return Static284.method4050(this.anInt3330);
	}

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "(B)Z")
	public boolean method2768() {
		return (this.anInt3330 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(II)Z")
	public boolean method2771(@OriginalArg(0) int arg0) {
		return (this.anInt3330 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(Z)I")
	public int method2772() {
		return this.anInt3330 >> 18 & 0x7;
	}
}
