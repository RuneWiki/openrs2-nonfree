import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public final class Class284 {

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
	public int anInt8316;

	@OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
	public int anInt8319;

	@OriginalMember(owner = "client!qv", name = "h", descriptor = "I")
	public int anInt8320;

	@OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
	public int anInt8322;

	@OriginalMember(owner = "client!qv", name = "m", descriptor = "I")
	public int anInt8324;

	@OriginalMember(owner = "client!qv", name = "n", descriptor = "I")
	public int anInt8325;

	@OriginalMember(owner = "client!qv", name = "q", descriptor = "I")
	public int anInt8328;

	@OriginalMember(owner = "client!qv", name = "r", descriptor = "Lclient!qv;")
	public Class284 aClass284_2;

	@OriginalMember(owner = "client!qv", name = "s", descriptor = "I")
	public int anInt8329;

	@OriginalMember(owner = "client!qv", name = "u", descriptor = "I")
	public int anInt8331;

	@OriginalMember(owner = "client!qv", name = "w", descriptor = "I")
	public final int anInt8333;

	@OriginalMember(owner = "client!qv", name = "o", descriptor = "I")
	public final int anInt8326;

	@OriginalMember(owner = "client!qv", name = "p", descriptor = "I")
	private final int anInt8327;

	@OriginalMember(owner = "client!qv", name = "l", descriptor = "I")
	public final int anInt8323;

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "B")
	public final byte aByte111;

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(IIIIB)V")
	public Class284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt8333 = arg1;
		this.anInt8326 = arg2;
		this.anInt8327 = arg0;
		this.anInt8323 = arg3;
		this.aByte111 = arg4;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Z)Lclient!va;")
	public Class349 method7144() {
		return Static289.method7333(this.anInt8327);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(BIII)Lclient!qv;")
	public Class284 method7149(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class284(this.anInt8327, arg0, arg1, arg2, this.aByte111);
	}
}
