import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public final class Class179 {

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "B")
	private byte aByte86;

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
	public int anInt5064;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
	public int anInt5065;

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
	public int anInt5066;

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
	public int anInt5067;

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
	public int anInt5068;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
	public Class179() {
	}

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class179(@OriginalArg(0) Class1_Sub28 arg0) {
		this.aByte86 = arg0.method5367();
		this.anInt5065 = arg0.method5335();
		this.anInt5066 = arg0.method5355();
		this.anInt5067 = arg0.method5355();
		this.anInt5068 = arg0.method5355();
		this.anInt5064 = arg0.method5355();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)I")
	public int method3968() {
		return (this.aByte86 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)I")
	public int method3971() {
		return this.aByte86 & 0x7;
	}
}
