import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public final class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
	public final int anInt750;

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
	public final int anInt748;

	static {
		new Class101("", 73);
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(II)V")
	public Class2_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt750 = arg0;
		this.anInt748 = arg1;
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)Z")
	public boolean method632() {
		return (this.anInt750 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)Z")
	public boolean method634(@OriginalArg(1) int arg0) {
		return (this.anInt750 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)I")
	public int method637() {
		return this.anInt750 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)Z")
	public boolean method638() {
		return (this.anInt750 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "(I)I")
	public int method642() {
		return Static174.method3091(this.anInt750);
	}

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "(I)Z")
	public boolean method643() {
		return (this.anInt750 >> 22 & 0x1) != 0;
	}
}
