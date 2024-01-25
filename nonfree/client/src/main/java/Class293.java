import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public final class Class293 {

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "I")
	public int anInt7302;

	@OriginalMember(owner = "client!rca", name = "f", descriptor = "I")
	public int anInt7305;

	@OriginalMember(owner = "client!rca", name = "g", descriptor = "Lclient!rca;")
	public Class293 aClass293_1;

	@OriginalMember(owner = "client!rca", name = "h", descriptor = "I")
	public int anInt7306;

	@OriginalMember(owner = "client!rca", name = "m", descriptor = "I")
	public int anInt7310;

	@OriginalMember(owner = "client!rca", name = "o", descriptor = "I")
	public int anInt7312;

	@OriginalMember(owner = "client!rca", name = "r", descriptor = "I")
	public int anInt7315;

	@OriginalMember(owner = "client!rca", name = "s", descriptor = "I")
	public int anInt7316;

	@OriginalMember(owner = "client!rca", name = "t", descriptor = "I")
	public int anInt7317;

	@OriginalMember(owner = "client!rca", name = "u", descriptor = "I")
	public int anInt7318;

	@OriginalMember(owner = "client!rca", name = "l", descriptor = "I")
	private final int anInt7309;

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "I")
	public final int anInt7304;

	@OriginalMember(owner = "client!rca", name = "p", descriptor = "I")
	public final int anInt7313;

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "B")
	public final byte aByte102;

	@OriginalMember(owner = "client!rca", name = "k", descriptor = "I")
	public final int anInt7308;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(IIIIB)V")
	public Class293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt7309 = arg0;
		this.anInt7304 = arg1;
		this.anInt7313 = arg3;
		this.aByte102 = arg4;
		this.anInt7308 = arg2;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIII)Lclient!rca;")
	public Class293 method5931(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class293(this.anInt7309, arg1, arg2, arg0, this.aByte102);
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(I)Lclient!th;")
	public Class326 method5933() {
		return Static470.method6059(this.anInt7309);
	}
}
