import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public final class Class4_Sub33 extends Class4 {

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
	public final int anInt5105;

	@OriginalMember(owner = "client!ns", name = "r", descriptor = "I")
	public final int anInt5110;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(II)V")
	public Class4_Sub33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5105 = arg0;
		this.anInt5110 = arg1;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)Z")
	public boolean method3903() {
		return (this.anInt5105 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)Z")
	public boolean method3904() {
		return (this.anInt5105 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)Z")
	public boolean method3905(@OriginalArg(0) int arg0) {
		return (this.anInt5105 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "(I)Z")
	public boolean method3906() {
		return (this.anInt5105 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "(I)I")
	public int method3910() {
		return this.anInt5105 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "(I)I")
	public int method3911() {
		return Static374.method4995(this.anInt5105);
	}
}
