import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public final class Class40 {

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
	public int anInt759;

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
	public int anInt760;

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
	public int anInt761;

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
	public int anInt762;

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "Lclient!ck;")
	public Class40 aClass40_1;

	@OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
	public int anInt763;

	@OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
	public int anInt766;

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
	public int anInt767;

	@OriginalMember(owner = "client!ck", name = "s", descriptor = "I")
	public int anInt768;

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
	public int anInt769;

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
	private final int anInt757;

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
	public final int anInt764;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
	public final int anInt756;

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "B")
	public final byte aByte19;

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
	public final int anInt765;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(IIIIB)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt757 = arg0;
		this.anInt764 = arg2;
		this.anInt756 = arg3;
		this.aByte19 = arg4;
		this.anInt765 = arg1;
	}

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!ck;I)V")
	public Class40(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		this.aClass40_1 = arg0;
		this.anInt756 = this.aClass40_1.anInt756 + arg1;
		this.anInt757 = this.aClass40_1.anInt757;
		this.aByte19 = this.aClass40_1.aByte19;
		this.anInt764 = arg1 + this.aClass40_1.anInt764;
		this.anInt765 = arg1 + this.aClass40_1.anInt765;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)Lclient!ui;")
	public Class250 method698() {
		return Static377.method4868(this.anInt757);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIII)Lclient!ck;")
	public Class40 method700(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class40(this.anInt757, arg2, arg1, arg0, this.aByte19);
	}
}
