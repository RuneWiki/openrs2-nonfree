import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uka")
public final class Class378 {

	@OriginalMember(owner = "client!uka", name = "d", descriptor = "[[S")
	public short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!uka", name = "e", descriptor = "I")
	public int anInt10087;

	@OriginalMember(owner = "client!uka", name = "o", descriptor = "[[[S")
	public short[][][] aShortArrayArrayArray2;

	@OriginalMember(owner = "client!uka", name = "n", descriptor = "I")
	public int anInt10093;

	@OriginalMember(owner = "client!uka", name = "h", descriptor = "I")
	public int anInt10090 = 2;

	@OriginalMember(owner = "client!uka", name = "l", descriptor = "Z")
	public boolean aBoolean675 = true;

	@OriginalMember(owner = "client!uka", name = "c", descriptor = "I")
	public int anInt10091 = 4;

	@OriginalMember(owner = "client!uka", name = "m", descriptor = "Z")
	public boolean aBoolean676 = true;

	@OriginalMember(owner = "client!uka", name = "k", descriptor = "[I")
	public int[] anIntArray734 = null;

	@OriginalMember(owner = "client!uka", name = "f", descriptor = "I")
	public int anInt10092 = 3;

	@OriginalMember(owner = "client!uka", name = "r", descriptor = "I")
	public int anInt10088 = -1;

	@OriginalMember(owner = "client!uka", name = "a", descriptor = "[I")
	public int[] anIntArray735 = null;

	@OriginalMember(owner = "client!uka", name = "<init>", descriptor = "(Lclient!ik;)V")
	public Class378(@OriginalArg(0) Class182 arg0) {
		@Pc(30) byte[] local30 = arg0.method3961(3);
		this.method8601(new Class3_Sub2(local30));
	}

	@OriginalMember(owner = "client!uka", name = "a", descriptor = "(BLclient!ika;)V")
	private void method8601(@OriginalArg(1) Class3_Sub2 arg0) {
		@Pc(15) boolean local15 = false;
		while (true) {
			while (true) {
				@Pc(19) int local19 = arg0.method2048(255);
				if (local19 == 0) {
					if (local15) {
						return;
					}
					if (this.anIntArray735 == null) {
						this.anIntArray735 = new int[4];
						this.anInt10091 = 4;
						this.anIntArray734 = new int[4];
					}
					for (local19 = 0; local19 < this.anIntArray735.length; local19++) {
						this.anIntArray735[local19] = 0;
						this.anIntArray734[local19] = local19 * 20;
					}
					return;
				}
				@Pc(48) int local48;
				if (local19 == 1) {
					if (this.anIntArray735 == null) {
						this.anIntArray734 = new int[4];
						this.anInt10091 = 4;
						this.anIntArray735 = new int[4];
					}
					for (local48 = 0; local48 < this.anIntArray735.length; local48++) {
						this.anIntArray735[local48] = arg0.method2017();
						this.anIntArray734[local48] = arg0.method2017();
					}
					local15 = true;
				} else if (local19 == 2) {
					this.anInt10088 = arg0.method2028(-14795);
				} else if (local19 == 3) {
					this.anInt10091 = arg0.method2048(255);
					this.anIntArray735 = new int[this.anInt10091];
					this.anIntArray734 = new int[this.anInt10091];
				} else if (local19 != 4) {
					if (local19 == 5) {
						this.anInt10093 = arg0.method2061();
					} else if (local19 == 6) {
						this.anInt10087 = arg0.method2061();
					} else if (local19 == 7) {
						this.aShortArrayArray5 = new short[10][4];
						this.aShortArrayArrayArray2 = new short[10][4][];
						for (local48 = 0; local48 < 10; local48++) {
							for (@Pc(204) int local204 = 0; local204 < 4; local204++) {
								@Pc(210) int local210 = arg0.method2028(-14795);
								if (local210 == 65535) {
									local210 = -1;
								}
								this.aShortArrayArray5[local48][local204] = (short) local210;
								@Pc(229) int local229 = arg0.method2028(-14795);
								this.aShortArrayArrayArray2[local48][local204] = new short[local229];
								for (@Pc(239) int local239 = 0; local239 < local229; local239++) {
									@Pc(245) int local245 = arg0.method2028(-14795);
									if (local245 == 65535) {
										local245 = -1;
									}
									this.aShortArrayArrayArray2[local48][local204][local239] = (short) local245;
								}
							}
						}
					} else if (local19 == 8) {
						this.aBoolean676 = false;
					} else if (local19 == 9) {
						this.anInt10090 = arg0.method2048(255);
					} else if (local19 == 10) {
						this.aBoolean675 = false;
					} else if (local19 == 11) {
						this.anInt10092 = arg0.method2048(255);
					}
				}
			}
		}
	}
}
