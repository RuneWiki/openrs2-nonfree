import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public final class Class401 {

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "I")
	public int anInt11112;

	@OriginalMember(owner = "client!wfa", name = "g", descriptor = "I")
	public int anInt11113;

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "I")
	public int anInt11115;

	@OriginalMember(owner = "client!wfa", name = "k", descriptor = "I")
	public int anInt11118;

	@OriginalMember(owner = "client!wfa", name = "i", descriptor = "I")
	private final int anInt11119;

	@OriginalMember(owner = "client!wfa", name = "j", descriptor = "I")
	public final int anInt11114;

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class401(@OriginalArg(0) Class3_Sub2 arg0) {
		this.anInt11119 = arg0.method2030();
		this.anInt11114 = arg0.method2048(255);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIIBI)V")
	public void method9460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static341.method4872(this.anInt11114, arg1, arg2, arg0, this.anInt11119, arg3, Static637.anIntArray649[this.anInt11114]);
		this.anInt11112 = arg0;
		this.anInt11113 = arg3;
		this.anInt11118 = arg2;
		this.anInt11115 = arg1;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V")
	public void method9461() {
		Static341.method4872(this.anInt11114, this.anInt11115, this.anInt11118, this.anInt11112, -1, this.anInt11113, Static637.anIntArray649[this.anInt11114]);
	}
}
