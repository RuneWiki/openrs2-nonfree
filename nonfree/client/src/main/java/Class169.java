import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class169 {

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
	public int anInt5018;

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
	public int anInt5020;

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
	public int anInt5021;

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "B")
	private byte aByte51;

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
	public int anInt5025;

	@OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
	public int anInt5028;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "()V")
	public Class169() {
	}

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!eb;)V")
	public Class169(@OriginalArg(0) Class1_Sub7 arg0) {
		this.aByte51 = arg0.method3130();
		this.anInt5021 = arg0.method3115();
		this.anInt5020 = arg0.method3125();
		this.anInt5018 = arg0.method3125();
		this.anInt5028 = arg0.method3125();
		this.anInt5025 = arg0.method3125();
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)I")
	public int method4564() {
		return this.aByte51 & 0x7;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(B)I")
	public int method4565() {
		return (this.aByte51 & 0x8) == 8 ? 1 : 0;
	}
}
