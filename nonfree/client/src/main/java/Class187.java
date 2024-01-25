import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class187 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "Lclient!sd;")
	private Class267 aClass267_27;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "[I")
	private int[] anIntArray517;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "[I")
	private int[] anIntArray518;

	@OriginalMember(owner = "client!m", name = "h", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray34;

	@OriginalMember(owner = "client!m", name = "i", descriptor = "[I")
	private int[] anIntArray519;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray35;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "Ljava/lang/String;")
	private String aString43;

	@OriginalMember(owner = "client!m", name = "p", descriptor = "[I")
	private int[] anIntArray520;

	@OriginalMember(owner = "client!m", name = "r", descriptor = "[I")
	private int[] anIntArray522;

	@OriginalMember(owner = "client!m", name = "s", descriptor = "[I")
	private int[] anIntArray523;

	@OriginalMember(owner = "client!m", name = "t", descriptor = "[I")
	private int[] anIntArray524;

	@OriginalMember(owner = "client!m", name = "v", descriptor = "Ljava/lang/String;")
	private String aString44;

	@OriginalMember(owner = "client!m", name = "w", descriptor = "[I")
	private int[] anIntArray525;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "I")
	public int anInt5848 = -1;

	static {
		new Class67("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!rt;II)V")
	private void method4869(@OriginalArg(0) Class3_Sub27 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString44 = arg0.method7572();
		} else if (arg1 == 2) {
			this.aString43 = arg0.method7572();
		} else {
			@Pc(66) int local66;
			@Pc(72) int local72;
			if (arg1 == 3) {
				local66 = arg0.method7548();
				this.anIntArrayArray53 = new int[local66][3];
				for (local72 = 0; local72 < local66; local72++) {
					this.anIntArrayArray53[local72][0] = arg0.method7591();
					this.anIntArrayArray53[local72][1] = arg0.method7549();
					this.anIntArrayArray53[local72][2] = arg0.method7549();
				}
			} else if (arg1 == 4) {
				local66 = arg0.method7548();
				this.anIntArrayArray54 = new int[local66][3];
				for (local72 = 0; local72 < local66; local72++) {
					this.anIntArrayArray54[local72][0] = arg0.method7591();
					this.anIntArrayArray54[local72][1] = arg0.method7549();
					this.anIntArrayArray54[local72][2] = arg0.method7549();
				}
			} else if (arg1 == 5) {
				arg0.method7591();
			} else if (arg1 == 6) {
				arg0.method7548();
			} else if (arg1 == 7) {
				arg0.method7548();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method7548();
				} else if (arg1 == 10) {
					local66 = arg0.method7548();
					this.anIntArray518 = new int[local66];
					for (local72 = 0; local72 < local66; local72++) {
						this.anIntArray518[local72] = arg0.method7549();
					}
				} else if (arg1 == 12) {
					arg0.method7549();
				} else if (arg1 == 13) {
					local66 = arg0.method7548();
					this.anIntArray525 = new int[local66];
					for (local72 = 0; local72 < local66; local72++) {
						this.anIntArray525[local72] = arg0.method7591();
					}
				} else if (arg1 == 14) {
					local66 = arg0.method7548();
					this.anIntArrayArray55 = new int[local66][2];
					for (local72 = 0; local72 < local66; local72++) {
						this.anIntArrayArray55[local72][0] = arg0.method7548();
						this.anIntArrayArray55[local72][1] = arg0.method7548();
					}
				} else if (arg1 == 15) {
					arg0.method7591();
				} else if (arg1 == 17) {
					this.anInt5848 = arg0.method7591();
				} else if (arg1 == 18) {
					local66 = arg0.method7548();
					this.anIntArray520 = new int[local66];
					this.anIntArray517 = new int[local66];
					this.aStringArray34 = new String[local66];
					this.anIntArray523 = new int[local66];
					for (local72 = 0; local72 < local66; local72++) {
						this.anIntArray517[local72] = arg0.method7549();
						this.anIntArray523[local72] = arg0.method7549();
						this.anIntArray520[local72] = arg0.method7549();
						this.aStringArray34[local72] = arg0.method7589();
					}
				} else if (arg1 == 19) {
					local66 = arg0.method7548();
					this.anIntArray522 = new int[local66];
					this.aStringArray35 = new String[local66];
					this.anIntArray519 = new int[local66];
					this.anIntArray524 = new int[local66];
					for (local72 = 0; local72 < local66; local72++) {
						this.anIntArray524[local72] = arg0.method7549();
						this.anIntArray519[local72] = arg0.method7549();
						this.anIntArray522[local72] = arg0.method7549();
						this.aStringArray35[local72] = arg0.method7589();
					}
				} else if (arg1 == 249) {
					local66 = arg0.method7548();
					if (this.aClass267_27 == null) {
						local72 = Static483.method7134(local66);
						this.aClass267_27 = new Class267(local72);
					}
					for (local72 = 0; local72 < local66; local72++) {
						@Pc(202) boolean local202 = arg0.method7548() == 1;
						@Pc(206) int local206 = arg0.method7551();
						@Pc(215) Class3 local215;
						if (local202) {
							local215 = new Class3_Sub35(arg0.method7589());
						} else {
							local215 = new Class3_Sub47(arg0.method7549());
						}
						this.aClass267_27.method6640(local215, (long) local206);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!rt;B)V")
	public void method4870(@OriginalArg(0) Class3_Sub27 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7548();
			if (local5 == 0) {
				return;
			}
			this.method4869(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	public void method4872() {
		if (this.aString43 == null) {
			this.aString43 = this.aString44;
		}
	}
}
