import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public final class Class67 {

	@OriginalMember(owner = "client!cu", name = "i", descriptor = "Lclient!wm;")
	public Class2_Sub13_Sub1 aClass2_Sub13_Sub1_1;

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "Lclient!fb;")
	public Class100 aClass100_1;

	@OriginalMember(owner = "client!cu", name = "o", descriptor = "Lclient!lca;")
	public Class2_Sub3_Sub3 aClass2_Sub3_Sub3_1;

	@OriginalMember(owner = "client!cu", name = "q", descriptor = "Lclient!pda;")
	public Class2_Sub37 aClass2_Sub37_1;

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "I")
	public final int anInt1393;

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "Lclient!caa;")
	public final Class12_Sub2 aClass12_Sub2_1;

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "I")
	public final int anInt1391;

	@OriginalMember(owner = "client!cu", name = "r", descriptor = "I")
	public int anInt1395;

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
	public final int anInt1390;

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
	public final int anInt1392;

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "B")
	public final byte aByte17;

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
	public final int anInt1388;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(BIIIIIILclient!caa;)V")
	public Class67(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class12_Sub2 arg7) {
		this.anInt1393 = arg4;
		this.aClass12_Sub2_1 = arg7;
		this.anInt1391 = arg6;
		this.anInt1395 = arg3;
		this.anInt1390 = arg1;
		this.anInt1392 = arg2;
		this.aByte17 = arg0;
		this.anInt1388 = arg5;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)Z")
	public boolean method1223() {
		return this.aByte17 == 2 || this.aByte17 == 3;
	}
}
