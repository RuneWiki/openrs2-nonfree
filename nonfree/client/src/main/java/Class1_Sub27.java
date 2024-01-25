import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public final class Class1_Sub27 extends Class1 {

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	public final int anInt3891;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
	public final int anInt3884;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(II)V")
	public Class1_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3891 = arg0;
		this.anInt3884 = arg1;
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)Z")
	public boolean method3030() {
		return (this.anInt3891 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)Z")
	public boolean method3031() {
		return (this.anInt3891 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)I")
	public int method3032() {
		return this.anInt3891 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)Z")
	public boolean method3033() {
		return (this.anInt3891 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)I")
	public int method3034() {
		return Static55.method752(this.anInt3891);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)Z")
	public boolean method3035(@OriginalArg(0) int arg0) {
		return (this.anInt3891 >> arg0 + 1 & 0x1) != 0;
	}
}
