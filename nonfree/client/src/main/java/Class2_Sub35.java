import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public final class Class2_Sub35 extends Class2 {

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
	public final int anInt6464;

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
	public final int anInt6469;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(II)V")
	public Class2_Sub35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6464 = arg0;
		this.anInt6469 = arg1;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)Z")
	public boolean method5419() {
		return (this.anInt6464 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)I")
	public int method5420() {
		return Static348.method5192(this.anInt6464);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(Z)I")
	public int method5421() {
		return this.anInt6464 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)Z")
	public boolean method5422() {
		return (this.anInt6464 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IB)Z")
	public boolean method5423(@OriginalArg(0) int arg0) {
		return (this.anInt6464 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)Z")
	public boolean method5424() {
		return (this.anInt6464 & 0x1) != 0;
	}
}
