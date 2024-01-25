import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class2_Sub50 extends Class2 {

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
	public final int anInt10795;

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
	public final int anInt10800;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(II)V")
	public Class2_Sub50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10795 = arg1;
		this.anInt10800 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZ)Z")
	public boolean method9002(@OriginalArg(0) int arg0) {
		return (this.anInt10800 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)Z")
	public boolean method9003() {
		return (this.anInt10800 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)Z")
	public boolean method9004() {
		return (this.anInt10800 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)I")
	public int method9005() {
		return this.anInt10800 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)Z")
	public boolean method9006() {
		return (this.anInt10800 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)I")
	public int method9008() {
		return Static218.method4234(this.anInt10800);
	}
}
