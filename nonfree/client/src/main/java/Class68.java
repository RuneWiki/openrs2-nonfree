import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public final class Class68 {

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
	public int anInt3016;

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
	public int anInt3017;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
	public int anInt3018;

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "B")
	private byte aByte6;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
	public int anInt3022;

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
	public int anInt3023;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
	public Class68() {
	}

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!h;)V")
	public Class68(@OriginalArg(0) Class4_Sub11 arg0) {
		this.aByte6 = arg0.method1241();
		this.anInt3017 = arg0.method1252();
		this.anInt3023 = arg0.method1263();
		this.anInt3018 = arg0.method1263();
		this.anInt3016 = arg0.method1263();
		this.anInt3022 = arg0.method1263();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)I")
	public int method2237() {
		return this.aByte6 & 0x7;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)I")
	public int method2241() {
		return (this.aByte6 & 0x8) == 8 ? 1 : 0;
	}
}
