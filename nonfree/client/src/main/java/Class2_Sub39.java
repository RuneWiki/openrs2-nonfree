import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class2_Sub39 extends Class2 {

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
	public final int anInt7446;

	@OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
	public final int anInt7452;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(II)V")
	public Class2_Sub39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7446 = arg0;
		this.anInt7452 = arg1;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)I")
	public int method6270() {
		return this.anInt7446 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)Z")
	public boolean method6271() {
		return (this.anInt7446 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)I")
	public int method6272() {
		return Static244.method3751(this.anInt7446);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)Z")
	public boolean method6275() {
		return (this.anInt7446 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)Z")
	public boolean method6276() {
		return (this.anInt7446 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)Z")
	public boolean method6277(@OriginalArg(1) int arg0) {
		return (this.anInt7446 >> arg0 + 1 & 0x1) != 0;
	}
}
