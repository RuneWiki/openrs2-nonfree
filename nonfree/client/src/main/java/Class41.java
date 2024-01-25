import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public final class Class41 {

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
	public int anInt1186;

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
	public int anInt1187;

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
	public int anInt1190;

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "B")
	private byte aByte6;

	@OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
	public int anInt1192;

	@OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
	public int anInt1193;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
	public Class41() {
	}

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!bk;)V")
	public Class41(@OriginalArg(0) Class5_Sub1 arg0) {
		this.aByte6 = arg0.method1863();
		this.anInt1192 = arg0.method1845();
		this.anInt1187 = arg0.method1826();
		this.anInt1193 = arg0.method1826();
		this.anInt1190 = arg0.method1826();
		this.anInt1186 = arg0.method1826();
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)I")
	public int method1046() {
		return (this.aByte6 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)I")
	public int method1048() {
		return this.aByte6 & 0x7;
	}
}
