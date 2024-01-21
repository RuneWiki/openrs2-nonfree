import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
	public int anInt50;

	@OriginalMember(owner = "client!ac", name = "H", descriptor = "[I")
	public int[] anIntArray3;

	@OriginalMember(owner = "client!ac", name = "N", descriptor = "[Lclient!lf;")
	public Class49[] aClass49Array1;

	@OriginalMember(owner = "client!ac", name = "P", descriptor = "I")
	public int anInt53;

	@OriginalMember(owner = "client!ac", name = "S", descriptor = "[I")
	public int[] anIntArray4;

	@OriginalMember(owner = "client!ac", name = "bb", descriptor = "I")
	public int anInt58;

	@OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
	public int anInt51 = 0;

	@OriginalMember(owner = "client!ac", name = "Z", descriptor = "Lclient!lf;")
	public Class49 aClass49_47 = Static133.aClass49_1661;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLclient!ja;)V")
	public void method48(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2962();
			if (local5 == 0) {
				return;
			}
			this.method49(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBLclient!ja;)V")
	private void method49(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt53 = arg1.method2962();
		} else if (arg0 == 2) {
			this.anInt58 = arg1.method2962();
		} else if (arg0 == 3) {
			this.aClass49_47 = arg1.method2926();
		} else if (arg0 == 4) {
			this.anInt50 = arg1.method2946();
		} else {
			@Pc(57) int local57;
			if (arg0 == 5) {
				this.anInt51 = arg1.method2933();
				this.aClass49Array1 = new Class49[this.anInt51];
				this.anIntArray4 = new int[this.anInt51];
				for (local57 = 0; local57 < this.anInt51; local57++) {
					this.anIntArray4[local57] = arg1.method2946();
					this.aClass49Array1[local57] = arg1.method2926();
				}
			} else if (arg0 == 6) {
				this.anInt51 = arg1.method2933();
				this.anIntArray4 = new int[this.anInt51];
				this.anIntArray3 = new int[this.anInt51];
				for (local57 = 0; local57 < this.anInt51; local57++) {
					this.anIntArray4[local57] = arg1.method2946();
					this.anIntArray3[local57] = arg1.method2946();
				}
			}
		}
	}
}
