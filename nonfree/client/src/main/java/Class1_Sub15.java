import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public final class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!f", name = "q", descriptor = "I")
	public final int anInt2505;

	@OriginalMember(owner = "client!f", name = "p", descriptor = "I")
	public final int anInt2504;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(II)V")
	public Class1_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2505 = arg0;
		this.anInt2504 = arg1;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)I")
	public int method2100() {
		return this.anInt2505 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Z")
	public boolean method2101() {
		return (this.anInt2505 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)Z")
	public boolean method2102() {
		return (this.anInt2505 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)I")
	public int method2103() {
		return Static538.method7476(this.anInt2505);
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(B)Z")
	public boolean method2104() {
		return (this.anInt2505 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Z")
	public boolean method2106(@OriginalArg(1) int arg0) {
		return (this.anInt2505 >> arg0 + 1 & 0x1) != 0;
	}
}
