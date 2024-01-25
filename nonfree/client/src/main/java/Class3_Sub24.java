import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public final class Class3_Sub24 extends Class3 {

	@OriginalMember(owner = "client!gv", name = "s", descriptor = "I")
	public final int anInt3988;

	@OriginalMember(owner = "client!gv", name = "u", descriptor = "I")
	public final int anInt3989;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(II)V")
	public Class3_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3988 = arg0;
		this.anInt3989 = arg1;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)I")
	public int method3240() {
		return this.anInt3988 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)Z")
	public boolean method3241() {
		return (this.anInt3988 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)I")
	public int method3242() {
		return Static447.method6192(this.anInt3988);
	}

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "(I)Z")
	public boolean method3243() {
		return (this.anInt3988 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)Z")
	public boolean method3244(@OriginalArg(0) int arg0) {
		return (this.anInt3988 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "(I)Z")
	public boolean method3245() {
		return (this.anInt3988 >> 21 & 0x1) != 0;
	}
}
