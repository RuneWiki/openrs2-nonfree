import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public final class Class100 {

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
	public int anInt2294;

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
	public int anInt2296;

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
	public int anInt2299;

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "Lclient!ho;")
	public Class100 aClass100_2;

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
	public int anInt2300;

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
	public int anInt2303;

	@OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
	public int anInt2307;

	@OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
	public int anInt2308;

	@OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
	public int anInt2309;

	@OriginalMember(owner = "client!ho", name = "u", descriptor = "I")
	public int anInt2311;

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
	public final int anInt2295;

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
	public final int anInt2301;

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
	public final int anInt2302;

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
	public final int anInt2304;

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "B")
	public final byte aByte42;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(IIIIB)V")
	public Class100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt2295 = arg0;
		this.anInt2301 = arg1;
		this.anInt2302 = arg2;
		this.anInt2304 = arg3;
		this.aByte42 = arg4;
	}

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!ho;I)V")
	public Class100(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1) {
		this.aClass100_2 = arg0;
		this.anInt2304 = this.aClass100_2.anInt2304 + arg1;
		this.anInt2302 = arg1 + this.aClass100_2.anInt2302;
		this.anInt2301 = arg1 + this.aClass100_2.anInt2301;
		this.aByte42 = this.aClass100_2.aByte42;
		this.anInt2295 = this.aClass100_2.anInt2295;
	}
}
