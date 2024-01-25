import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public final class Class15 {

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
	public int anInt363;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
	public int anInt364;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
	public int anInt365;

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
	public int anInt367;

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "B")
	private byte aByte7;

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
	public int anInt371;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	public Class15() {
	}

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class15(@OriginalArg(0) Class4_Sub11 arg0) {
		this.aByte7 = arg0.method3426();
		this.anInt371 = arg0.method3401();
		this.anInt365 = arg0.method3418();
		this.anInt363 = arg0.method3418();
		this.anInt364 = arg0.method3418();
		this.anInt367 = arg0.method3418();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)I")
	public int method313() {
		return this.aByte7 & 0x7;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)I")
	public int method315() {
		return (this.aByte7 & 0x8) == 8 ? 1 : 0;
	}
}
