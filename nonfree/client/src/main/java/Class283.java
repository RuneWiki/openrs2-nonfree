import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public final class Class283 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
	public int anInt8244;

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
	public int anInt8245;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
	public int anInt8246;

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
	public int anInt8249;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "Lclient!pi;")
	public Class283 aClass283_1;

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
	public int anInt8251;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
	public int anInt8254;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
	public int anInt8255;

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
	public int anInt8257;

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
	public int anInt8263;

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
	private final int anInt8248;

	@OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
	public final int anInt8262;

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
	public final int anInt8258;

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "B")
	public final byte aByte110;

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
	public final int anInt8247;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIIIB)V")
	public Class283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt8248 = arg0;
		this.anInt8262 = arg2;
		this.anInt8258 = arg1;
		this.aByte110 = arg4;
		this.anInt8247 = arg3;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIII)Lclient!pi;")
	public Class283 method7370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class283(this.anInt8248, arg2, arg1, arg0, this.aByte110);
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)Lclient!qw;")
	public Class308 method7373() {
		return Static303.method5004(this.anInt8248);
	}
}
