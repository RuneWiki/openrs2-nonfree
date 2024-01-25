import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public final class Class228 {

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "I")
	public int anInt6684;

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
	public int anInt6686;

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
	public int anInt6687;

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "I")
	public int anInt6690;

	@OriginalMember(owner = "client!mv", name = "k", descriptor = "I")
	public int anInt6693;

	@OriginalMember(owner = "client!mv", name = "l", descriptor = "I")
	public int anInt6694;

	@OriginalMember(owner = "client!mv", name = "n", descriptor = "Lclient!mv;")
	public Class228 aClass228_2;

	@OriginalMember(owner = "client!mv", name = "o", descriptor = "I")
	public int anInt6696;

	@OriginalMember(owner = "client!mv", name = "r", descriptor = "I")
	public int anInt6699;

	@OriginalMember(owner = "client!mv", name = "s", descriptor = "I")
	public int anInt6700;

	@OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
	private final int anInt6692;

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "B")
	public final byte aByte76;

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
	public final int anInt6685;

	@OriginalMember(owner = "client!mv", name = "i", descriptor = "I")
	public final int anInt6691;

	@OriginalMember(owner = "client!mv", name = "q", descriptor = "I")
	public final int anInt6698;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(IIIIB)V")
	public Class228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt6692 = arg0;
		this.aByte76 = arg4;
		this.anInt6685 = arg3;
		this.anInt6691 = arg1;
		this.anInt6698 = arg2;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IZII)Lclient!mv;")
	public Class228 method5813(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class228(this.anInt6692, arg1, arg0, arg2, this.aByte76);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)Lclient!df;")
	public Class68 method5815() {
		return Static237.method4043(this.anInt6692);
	}
}
