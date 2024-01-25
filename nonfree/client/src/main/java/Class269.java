import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public final class Class269 {

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
	public int anInt7662;

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
	public int anInt7663;

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
	public int anInt7664;

	@OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
	public int anInt7665;

	@OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
	public int anInt7667;

	@OriginalMember(owner = "client!wv", name = "k", descriptor = "I")
	public int anInt7669;

	@OriginalMember(owner = "client!wv", name = "o", descriptor = "I")
	public int anInt7673;

	@OriginalMember(owner = "client!wv", name = "q", descriptor = "I")
	public int anInt7674;

	@OriginalMember(owner = "client!wv", name = "t", descriptor = "I")
	public int anInt7677;

	@OriginalMember(owner = "client!wv", name = "u", descriptor = "Lclient!wv;")
	public Class269 aClass269_2;

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "B")
	public final byte aByte104;

	@OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
	public final int anInt7670;

	@OriginalMember(owner = "client!wv", name = "n", descriptor = "I")
	private final int anInt7672;

	@OriginalMember(owner = "client!wv", name = "m", descriptor = "I")
	public final int anInt7671;

	@OriginalMember(owner = "client!wv", name = "r", descriptor = "I")
	public final int anInt7675;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(IIIIB)V")
	public Class269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte104 = arg4;
		this.anInt7670 = arg3;
		this.anInt7672 = arg0;
		this.anInt7671 = arg2;
		this.anInt7675 = arg1;
	}

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!wv;I)V")
	public Class269(@OriginalArg(0) Class269 arg0, @OriginalArg(1) int arg1) {
		this.aClass269_2 = arg0;
		this.anInt7675 = this.aClass269_2.anInt7675 + arg1;
		this.aByte104 = this.aClass269_2.aByte104;
		this.anInt7672 = this.aClass269_2.anInt7672;
		this.anInt7670 = this.aClass269_2.anInt7670 + arg1;
		this.anInt7671 = this.aClass269_2.anInt7671 + arg1;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIII)Lclient!wv;")
	public Class269 method5990(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class269(this.anInt7672, arg0, arg1, arg2, this.aByte104);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)Lclient!nc;")
	public Class160 method5995() {
		return Static49.method873(this.anInt7672);
	}
}
