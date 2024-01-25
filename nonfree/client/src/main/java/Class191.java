import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public final class Class191 {

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "Lclient!ol;")
	public Class191 aClass191_1;

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
	public int anInt5317;

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
	public int anInt5319;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
	public int anInt5320;

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
	public int anInt5322;

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
	public int anInt5323;

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
	public int anInt5324;

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
	public int anInt5325;

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
	public int anInt5327;

	@OriginalMember(owner = "client!ol", name = "w", descriptor = "I")
	public int anInt5332;

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "B")
	public final byte aByte66;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
	public final int anInt5316;

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
	private final int anInt5326;

	@OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
	public final int anInt5329;

	@OriginalMember(owner = "client!ol", name = "u", descriptor = "I")
	public final int anInt5331;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(IIIIB)V")
	public Class191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte66 = arg4;
		this.anInt5316 = arg1;
		this.anInt5326 = arg0;
		this.anInt5329 = arg3;
		this.anInt5331 = arg2;
	}

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!ol;I)V")
	public Class191(@OriginalArg(0) Class191 arg0, @OriginalArg(1) int arg1) {
		this.aClass191_1 = arg0;
		this.anInt5331 = arg1 + this.aClass191_1.anInt5331;
		this.aByte66 = this.aClass191_1.aByte66;
		this.anInt5329 = this.aClass191_1.anInt5329 + arg1;
		this.anInt5316 = arg1 + this.aClass191_1.anInt5316;
		this.anInt5326 = this.aClass191_1.anInt5326;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)Lclient!ks;")
	public Class153 method4243() {
		return Static81.method1194(this.anInt5326);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZII)Lclient!ol;")
	public Class191 method4246(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class191(this.anInt5326, arg2, arg1, arg0, this.aByte66);
	}
}
