import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public final class Class5_Sub49 extends Class5 {

	@OriginalMember(owner = "client!wfa", name = "j", descriptor = "I")
	public final int anInt10258;

	@OriginalMember(owner = "client!wfa", name = "p", descriptor = "I")
	public final int anInt10264;

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(II)V")
	public Class5_Sub49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10258 = arg1;
		this.anInt10264 = arg0;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)I")
	public int method8723() {
		return this.anInt10264 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)Z")
	public boolean method8724() {
		return (this.anInt10264 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "(I)Z")
	public boolean method8725() {
		return (this.anInt10264 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)Z")
	public boolean method8727(@OriginalArg(0) int arg0) {
		return (this.anInt10264 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)Z")
	public boolean method8729() {
		return (this.anInt10264 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "(I)I")
	public int method8730() {
		return Static72.method1165(this.anInt10264);
	}
}
