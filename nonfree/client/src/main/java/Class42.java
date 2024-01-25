import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class42 {

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
	public int anInt1329;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
	public int anInt1332;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
	public int anInt1334;

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
	public int anInt1335;

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "B")
	private byte aByte18;

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
	public int anInt1336;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	public Class42() {
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!os;)V")
	public Class42(@OriginalArg(0) Class1_Sub17 arg0) {
		this.aByte18 = arg0.method4482();
		this.anInt1332 = arg0.method4494();
		this.anInt1334 = arg0.method4481();
		this.anInt1336 = arg0.method4481();
		this.anInt1329 = arg0.method4481();
		this.anInt1335 = arg0.method4481();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)I")
	public int method1408() {
		return (this.aByte18 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)I")
	public int method1409() {
		return this.aByte18 & 0x7;
	}
}
