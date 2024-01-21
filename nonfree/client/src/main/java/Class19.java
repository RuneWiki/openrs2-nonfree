import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public final class Class19 {

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
	public int anInt965;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
	public int anInt968;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "B")
	private byte aByte1;

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
	public int anInt970;

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
	public int anInt972;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	public Class19() {
	}

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!va;)V")
	public Class19(@OriginalArg(0) Class2_Sub11 arg0) {
		this.aByte1 = arg0.method1463();
		this.anInt972 = arg0.method1456();
		this.anInt965 = arg0.method1449();
		this.anInt970 = arg0.method1449();
		this.anInt968 = arg0.method1449();
		arg0.method1449();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)I")
	public int method784() {
		return this.aByte1 & 0x7;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)I")
	public int method786() {
		return (this.aByte1 & 0x8) == 8 ? 1 : 0;
	}
}
