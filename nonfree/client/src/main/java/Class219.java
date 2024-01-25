import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public final class Class219 {

	@OriginalMember(owner = "client!no", name = "d", descriptor = "I")
	public int anInt6361;

	@OriginalMember(owner = "client!no", name = "e", descriptor = "I")
	public int anInt6362;

	@OriginalMember(owner = "client!no", name = "f", descriptor = "I")
	public int anInt6363;

	@OriginalMember(owner = "client!no", name = "h", descriptor = "I")
	public int anInt6365;

	@OriginalMember(owner = "client!no", name = "i", descriptor = "I")
	public int anInt6366;

	@OriginalMember(owner = "client!no", name = "k", descriptor = "B")
	private byte aByte77;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V")
	public Class219() {
	}

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!daa;)V")
	public Class219(@OriginalArg(0) Class12_Sub8 arg0) {
		this.aByte77 = arg0.method5173();
		this.anInt6362 = arg0.method5199();
		this.anInt6365 = arg0.method5225();
		this.anInt6363 = arg0.method5225();
		this.anInt6366 = arg0.method5225();
		this.anInt6361 = arg0.method5225();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B)I")
	public int method5316() {
		return this.aByte77 & 0x7;
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(B)I")
	public int method5317() {
		return (this.aByte77 & 0x8) == 8 ? 1 : 0;
	}
}
