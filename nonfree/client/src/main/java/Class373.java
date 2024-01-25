import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vja")
public final class Class373 {

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "I")
	public int anInt10545;

	@OriginalMember(owner = "client!vja", name = "b", descriptor = "Lclient!vja;")
	public Class373 aClass373_2;

	@OriginalMember(owner = "client!vja", name = "c", descriptor = "I")
	public int anInt10546;

	@OriginalMember(owner = "client!vja", name = "d", descriptor = "I")
	public int anInt10547;

	@OriginalMember(owner = "client!vja", name = "g", descriptor = "I")
	public int anInt10550;

	@OriginalMember(owner = "client!vja", name = "h", descriptor = "I")
	public int anInt10551;

	@OriginalMember(owner = "client!vja", name = "k", descriptor = "I")
	public int anInt10554;

	@OriginalMember(owner = "client!vja", name = "r", descriptor = "I")
	public int anInt10560;

	@OriginalMember(owner = "client!vja", name = "s", descriptor = "I")
	public int anInt10561;

	@OriginalMember(owner = "client!vja", name = "u", descriptor = "I")
	public int anInt10563;

	@OriginalMember(owner = "client!vja", name = "w", descriptor = "B")
	public final byte aByte148;

	@OriginalMember(owner = "client!vja", name = "o", descriptor = "I")
	private final int anInt10558;

	@OriginalMember(owner = "client!vja", name = "q", descriptor = "I")
	public final int anInt10559;

	@OriginalMember(owner = "client!vja", name = "e", descriptor = "I")
	public final int anInt10548;

	@OriginalMember(owner = "client!vja", name = "n", descriptor = "I")
	public final int anInt10557;

	@OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(IIIIB)V")
	public Class373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte148 = arg4;
		this.anInt10558 = arg0;
		this.anInt10559 = arg2;
		this.anInt10548 = arg3;
		this.anInt10557 = arg1;
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(IIII)Lclient!vja;")
	public Class373 method8644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class373(this.anInt10558, arg1, arg2, arg0, this.aByte148);
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(I)Lclient!rfa;")
	public Class307 method8647() {
		return Static672.method8958(this.anInt10558);
	}
}
