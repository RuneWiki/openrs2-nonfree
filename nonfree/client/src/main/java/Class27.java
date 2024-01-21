import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class27 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
	public int anInt959;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
	public int anInt960;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
	public int anInt961;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
	public int anInt962;

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
	public int anInt964;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "B")
	private byte aByte7;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
	public Class27() {
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!ce;)V")
	public Class27(@OriginalArg(0) Class3_Sub4 arg0) {
		this.aByte7 = arg0.method1248();
		this.anInt961 = arg0.method1270();
		this.anInt964 = arg0.method1245();
		this.anInt962 = arg0.method1245();
		this.anInt960 = arg0.method1245();
		this.anInt959 = arg0.method1245();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)I")
	public int method741() {
		return (this.aByte7 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)I")
	public int method743() {
		return this.aByte7 & 0x7;
	}
}
