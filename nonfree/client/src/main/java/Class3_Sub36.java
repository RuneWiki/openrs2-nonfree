import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public final class Class3_Sub36 extends Class3 {

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
	public final int anInt6063;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
	public final int anInt6062;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(II)V")
	public Class3_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6063 = arg0;
		this.anInt6062 = arg1;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)Z")
	public boolean method5120() {
		return (this.anInt6063 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)I")
	public int method5121() {
		return Static562.method7586(this.anInt6063);
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)Z")
	public boolean method5122(@OriginalArg(0) int arg0) {
		return (this.anInt6063 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)Z")
	public boolean method5123() {
		return (this.anInt6063 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)Z")
	public boolean method5124() {
		return (this.anInt6063 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)I")
	public int method5126() {
		return this.anInt6063 >> 18 & 0x7;
	}
}
