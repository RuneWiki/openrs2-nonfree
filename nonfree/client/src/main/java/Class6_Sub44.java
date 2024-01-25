import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public final class Class6_Sub44 extends Class6 {

	@OriginalMember(owner = "client!sca", name = "k", descriptor = "I")
	public final int anInt7805;

	@OriginalMember(owner = "client!sca", name = "j", descriptor = "I")
	public final int anInt7804;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(II)V")
	public Class6_Sub44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7805 = arg0;
		this.anInt7804 = arg1;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)Z")
	public boolean method6468() {
		return (this.anInt7805 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)I")
	public int method6470() {
		return this.anInt7805 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(Z)I")
	public int method6471() {
		return Static377.method5518(this.anInt7805);
	}

	@OriginalMember(owner = "client!sca", name = "c", descriptor = "(I)Z")
	public boolean method6472() {
		return (this.anInt7805 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(IB)Z")
	public boolean method6473(@OriginalArg(0) int arg0) {
		return (this.anInt7805 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sca", name = "f", descriptor = "(I)Z")
	public boolean method6474() {
		return (this.anInt7805 & 0x1) != 0;
	}
}
