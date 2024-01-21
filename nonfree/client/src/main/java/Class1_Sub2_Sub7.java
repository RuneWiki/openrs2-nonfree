import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class1_Sub2_Sub7 extends Class1_Sub2 {

	@OriginalMember(owner = "client!f", name = "N", descriptor = "[I")
	public int[] anIntArray175;

	@OriginalMember(owner = "client!f", name = "O", descriptor = "[Lclient!fc;")
	public Class25[] aClass25Array5;

	@OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
	public int anInt896;

	@OriginalMember(owner = "client!f", name = "U", descriptor = "I")
	public int anInt899;

	@OriginalMember(owner = "client!f", name = "Y", descriptor = "[I")
	public int[] anIntArray176;

	@OriginalMember(owner = "client!f", name = "eb", descriptor = "I")
	public int anInt904;

	@OriginalMember(owner = "client!f", name = "cb", descriptor = "I")
	public int anInt903 = 0;

	@OriginalMember(owner = "client!f", name = "ib", descriptor = "Lclient!fc;")
	public Class25 aClass25_384 = Static27.aClass25_332;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!dc;I)V")
	private void method731(@OriginalArg(1) Class1_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt904 = arg0.method672();
		} else if (arg1 == 2) {
			this.anInt899 = arg0.method672();
		} else if (arg1 == 3) {
			this.aClass25_384 = arg0.method654();
		} else if (arg1 == 4) {
			this.anInt896 = arg0.method663();
		} else {
			@Pc(59) int local59;
			if (arg1 == 5) {
				this.anInt903 = arg0.method651();
				this.anIntArray175 = new int[this.anInt903];
				this.aClass25Array5 = new Class25[this.anInt903];
				for (local59 = 0; local59 < this.anInt903; local59++) {
					this.anIntArray175[local59] = arg0.method663();
					this.aClass25Array5[local59] = arg0.method654();
				}
			} else if (arg1 == 6) {
				this.anInt903 = arg0.method651();
				this.anIntArray175 = new int[this.anInt903];
				this.anIntArray176 = new int[this.anInt903];
				for (local59 = 0; local59 < this.anInt903; local59++) {
					this.anIntArray175[local59] = arg0.method663();
					this.anIntArray176[local59] = arg0.method663();
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!dc;B)V")
	public void method733(@OriginalArg(0) Class1_Sub5 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method672();
			if (local13 == 0) {
				return;
			}
			this.method731(arg0, local13);
		}
	}
}
