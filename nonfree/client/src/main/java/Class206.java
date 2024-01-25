import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public final class Class206 {

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "I")
	public int anInt5066;

	@OriginalMember(owner = "client!lea", name = "i", descriptor = "Lclient!lea;")
	public Class206 aClass206_1;

	@OriginalMember(owner = "client!lea", name = "k", descriptor = "I")
	public int anInt5070;

	@OriginalMember(owner = "client!lea", name = "l", descriptor = "I")
	public int anInt5071;

	@OriginalMember(owner = "client!lea", name = "m", descriptor = "I")
	public int anInt5072;

	@OriginalMember(owner = "client!lea", name = "n", descriptor = "I")
	public int anInt5073;

	@OriginalMember(owner = "client!lea", name = "p", descriptor = "I")
	public int anInt5075;

	@OriginalMember(owner = "client!lea", name = "v", descriptor = "I")
	public int anInt5081;

	@OriginalMember(owner = "client!lea", name = "w", descriptor = "I")
	public int anInt5082;

	@OriginalMember(owner = "client!lea", name = "x", descriptor = "I")
	public int anInt5083;

	@OriginalMember(owner = "client!lea", name = "t", descriptor = "I")
	public final int anInt5079;

	@OriginalMember(owner = "client!lea", name = "s", descriptor = "I")
	public final int anInt5078;

	@OriginalMember(owner = "client!lea", name = "u", descriptor = "I")
	public final int anInt5080;

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "B")
	public final byte aByte77;

	@OriginalMember(owner = "client!lea", name = "f", descriptor = "I")
	private final int anInt5067;

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(IIIIB)V")
	public Class206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt5079 = arg2;
		this.anInt5078 = arg1;
		this.anInt5080 = arg3;
		this.aByte77 = arg4;
		this.anInt5067 = arg0;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)Lclient!nw;")
	public Class243 method4130() {
		return Static98.method5019(this.anInt5067);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIII)Lclient!lea;")
	public Class206 method4131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class206(this.anInt5067, arg1, arg0, arg2, this.aByte77);
	}
}
