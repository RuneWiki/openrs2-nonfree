import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public final class Class2_Sub2_Sub5 extends Class2_Sub2 {

	@OriginalMember(owner = "client!d", name = "F", descriptor = "[I")
	public static final int[] anIntArray99 = new int[50];

	@OriginalMember(owner = "client!d", name = "J", descriptor = "[I")
	public static final int[] anIntArray100 = new int[2048];

	@OriginalMember(owner = "client!d", name = "N", descriptor = "I")
	public static int anInt1392 = -1;

	@OriginalMember(owner = "client!d", name = "B", descriptor = "I")
	public int anInt1387;

	@OriginalMember(owner = "client!d", name = "C", descriptor = "I")
	public int anInt1388;

	@OriginalMember(owner = "client!d", name = "E", descriptor = "I")
	public int anInt1389;

	@OriginalMember(owner = "client!d", name = "O", descriptor = "I")
	public int anInt1393;

	@OriginalMember(owner = "client!d", name = "P", descriptor = "I")
	public int anInt1394;

	@OriginalMember(owner = "client!d", name = "D", descriptor = "Lclient!nm;")
	public final Class163 aClass163_1;

	@OriginalMember(owner = "client!d", name = "K", descriptor = "Lclient!bp;")
	public final Class28 aClass28_1;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!nm;Lclient!oh;)V", line = 57)
	public Class2_Sub2_Sub5(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class12_Sub5 arg1) {
		this.aClass163_1 = arg0;
		this.aClass28_1 = Static291.method5368(arg0.anInt4323);
		this.method1566();
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V", line = 5)
	public void method1566() {
		this.anInt1393 = this.aClass163_1.anInt4322;
		this.anInt1388 = this.aClass163_1.anInt4328;
		this.anInt1394 = this.aClass163_1.anInt4330;
		if (this.aClass163_1.aClass14_5 != null) {
			this.aClass163_1.aClass14_5.method3935(this.aClass28_1.anInt754, this.aClass28_1.anInt748, this.aClass28_1.anInt741, Class2_Sub3_Sub34.anIntArray420);
		}
		this.anInt1387 = Class2_Sub3_Sub34.anIntArray420[0];
		this.anInt1389 = Class2_Sub3_Sub34.anIntArray420[2];
	}
}
