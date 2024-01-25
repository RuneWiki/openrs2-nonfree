import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public final class Class6_Sub4_Sub3 extends Class6_Sub4 {

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
	public int anInt1352;

	@OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
	public int anInt1353;

	@OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
	public int anInt1354;

	@OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
	public int anInt1356;

	@OriginalMember(owner = "client!cf", name = "H", descriptor = "I")
	public int anInt1357;

	@OriginalMember(owner = "client!cf", name = "z", descriptor = "Lclient!mb;")
	public final Class218 aClass218_1;

	@OriginalMember(owner = "client!cf", name = "D", descriptor = "Lclient!fa;")
	public final Class99 aClass99_1;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!mb;Lclient!ju;)V")
	public Class6_Sub4_Sub3(@OriginalArg(0) Class218 arg0, @OriginalArg(1) Class2_Sub8 arg1) {
		this.aClass218_1 = arg0;
		this.aClass99_1 = this.aClass218_1.method5204();
		this.method1246();
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
	public void method1246() {
		this.anInt1352 = this.aClass218_1.anInt6152;
		this.anInt1357 = this.aClass218_1.anInt6150;
		this.anInt1353 = this.aClass218_1.anInt6153;
		if (this.aClass218_1.aClass207_20 != null) {
			this.aClass218_1.aClass207_20.method8205(this.aClass99_1.anInt2470, this.aClass99_1.anInt2474, this.aClass99_1.anInt2459, Static449.anIntArray503);
		}
		this.anInt1356 = Static449.anIntArray503[0];
		this.anInt1354 = Static449.anIntArray503[2];
	}
}
