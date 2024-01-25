import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public final class Class287 {

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
	public int anInt7571;

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
	public int anInt7575;

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "Lclient!qi;")
	public Class287 aClass287_2;

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
	public int anInt7578;

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
	public int anInt7579;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
	public int anInt7580;

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
	public int anInt7581;

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
	public int anInt7584;

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
	public int anInt7585;

	@OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
	public int anInt7586;

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
	private final int anInt7577;

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "B")
	public final byte aByte98;

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
	public final int anInt7583;

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
	public final int anInt7574;

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
	public final int anInt7576;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIIB)V")
	public Class287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt7577 = arg0;
		this.aByte98 = arg4;
		this.anInt7583 = arg2;
		this.anInt7574 = arg3;
		this.anInt7576 = arg1;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)Lclient!bm;")
	public Class40 method6664() {
		return Static238.method6994(this.anInt7577);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIII)Lclient!qi;")
	public Class287 method6665(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class287(this.anInt7577, arg2, arg1, arg0, this.aByte98);
	}
}
