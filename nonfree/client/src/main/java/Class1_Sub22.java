import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public final class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!ol", name = "x", descriptor = "I")
	public int anInt4031;

	@OriginalMember(owner = "client!ol", name = "A", descriptor = "I")
	public int anInt4034;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(II)V")
	public Class1_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4031 = arg0;
		this.anInt4034 = arg1;
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)Z")
	public boolean method3232() {
		return (this.anInt4031 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)I")
	public int method3233() {
		return Static40.method724(this.anInt4031);
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(Z)Z")
	public boolean method3234() {
		return (this.anInt4031 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)Z")
	public boolean method3235() {
		return (this.anInt4031 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "(I)Z")
	public boolean method3236() {
		return (this.anInt4031 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(Z)Z")
	public boolean method3238() {
		return (this.anInt4031 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "(I)I")
	public int method3240() {
		return this.anInt4031 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)Z")
	public boolean method3241() {
		return (this.anInt4031 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)Z")
	public boolean method3242() {
		return (this.anInt4031 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)Z")
	public boolean method3243(@OriginalArg(1) int arg0) {
		return (this.anInt4031 >> arg0 + 1 & 0x1) != 0;
	}
}
