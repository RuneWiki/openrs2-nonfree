import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class125 {

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "[Lclient!td;")
	public static final Class191[] aClass191Array1 = new Class191[5];

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
	public int anInt3628;

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
	public int anInt3635;

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
	public int anInt3636;

	@OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
	public int anInt3640;

	@OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
	public int anInt3642;

	@OriginalMember(owner = "client!kq", name = "s", descriptor = "B")
	private byte aByte43;

	static {
		for (@Pc(10) int local10 = 0; local10 < aClass191Array1.length; local10++) {
			aClass191Array1[local10] = new Class191();
		}
	}

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V")
	public Class125() {
	}

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!ap;)V")
	public Class125(@OriginalArg(0) Class7_Sub3 arg0) {
		this.aByte43 = arg0.method2779();
		this.anInt3628 = arg0.method2764();
		this.anInt3642 = arg0.method2767();
		this.anInt3636 = arg0.method2767();
		this.anInt3640 = arg0.method2767();
		this.anInt3635 = arg0.method2767();
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)I")
	public int method3291() {
		return (this.aByte43 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)I")
	public int method3293() {
		return this.aByte43 & 0x7;
	}
}
