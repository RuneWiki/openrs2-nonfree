import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public final class Class3_Sub7_Sub7 extends Class3_Sub7 {

	@OriginalMember(owner = "client!eda", name = "r", descriptor = "I")
	public int anInt2643;

	@OriginalMember(owner = "client!eda", name = "t", descriptor = "I")
	public int anInt2644;

	@OriginalMember(owner = "client!eda", name = "u", descriptor = "I")
	public int anInt2645;

	@OriginalMember(owner = "client!eda", name = "w", descriptor = "I")
	public int anInt2647;

	@OriginalMember(owner = "client!eda", name = "x", descriptor = "I")
	public int anInt2648;

	@OriginalMember(owner = "client!eda", name = "y", descriptor = "Lclient!nba;")
	public final Class232 aClass232_1;

	@OriginalMember(owner = "client!eda", name = "s", descriptor = "Lclient!gca;")
	public final Class121 aClass121_1;

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(Lclient!nba;Lclient!nha;)V")
	public Class3_Sub7_Sub7(@OriginalArg(0) Class232 arg0, @OriginalArg(1) Class9_Sub8 arg1) {
		this.aClass232_1 = arg0;
		this.aClass121_1 = this.aClass232_1.method5856();
		this.method2216();
	}

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(B)V")
	public void method2216() {
		this.anInt2647 = this.aClass232_1.anInt6733;
		this.anInt2648 = this.aClass232_1.anInt6731;
		this.anInt2643 = this.aClass232_1.anInt6729;
		if (this.aClass232_1.aClass31_26 != null) {
			this.aClass232_1.aClass31_26.method7932(this.aClass121_1.anInt3353, this.aClass121_1.anInt3356, this.aClass121_1.anInt3348, Static635.anIntArray658);
		}
		this.anInt2644 = Static635.anIntArray658[0];
		this.anInt2645 = Static635.anIntArray658[2];
	}
}
