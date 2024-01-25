import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public final class Class11_Sub36 extends Class11 {

	@OriginalMember(owner = "client!se", name = "k", descriptor = "I")
	public final int anInt5607;

	@OriginalMember(owner = "client!se", name = "q", descriptor = "I")
	public final int anInt5612;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(II)V")
	public Class11_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5607 = arg1;
		this.anInt5612 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)I")
	public int method4723() {
		return this.anInt5612 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)Z")
	public boolean method4724() {
		return (this.anInt5612 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)Z")
	public boolean method4726() {
		return (this.anInt5612 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(I)I")
	public int method4727() {
		return Static219.method3922(this.anInt5612);
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(I)Z")
	public boolean method4728() {
		return (this.anInt5612 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZI)Z")
	public boolean method4733(@OriginalArg(1) int arg0) {
		return (this.anInt5612 >> arg0 + 1 & 0x1) != 0;
	}
}
