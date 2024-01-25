import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class355 {

	@OriginalMember(owner = "client!ts", name = "k", descriptor = "I")
	public int anInt9851;

	@OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
	public int anInt9856;

	@OriginalMember(owner = "client!ts", name = "r", descriptor = "[[S")
	public short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "[[[S")
	public short[][][] aShortArrayArrayArray2;

	@OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
	public int anInt9850 = 4;

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "I")
	public int anInt9853 = 2;

	@OriginalMember(owner = "client!ts", name = "p", descriptor = "I")
	public int anInt9855 = -1;

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "Z")
	public boolean aBoolean679 = true;

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "[I")
	public int[] anIntArray531 = null;

	@OriginalMember(owner = "client!ts", name = "s", descriptor = "I")
	public int anInt9857 = 3;

	@OriginalMember(owner = "client!ts", name = "q", descriptor = "Z")
	public boolean aBoolean680 = true;

	@OriginalMember(owner = "client!ts", name = "m", descriptor = "[I")
	public int[] anIntArray532 = null;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!rg;)V")
	public Class355(@OriginalArg(0) Class310 arg0) {
		@Pc(30) byte[] local30 = arg0.method7795(3);
		this.method8454(new Class14_Sub21(local30));
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!jc;I)V")
	private void method8454(@OriginalArg(0) Class14_Sub21 arg0) {
		@Pc(14) boolean local14 = false;
		while (true) {
			while (true) {
				@Pc(18) int local18 = arg0.method7695(125);
				if (local18 == 0) {
					if (local14) {
						return;
					}
					if (this.anIntArray532 == null) {
						this.anIntArray532 = new int[4];
						this.anIntArray531 = new int[4];
						this.anInt9850 = 4;
					}
					for (local18 = 0; local18 < this.anIntArray532.length; local18++) {
						this.anIntArray532[local18] = 0;
						this.anIntArray531[local18] = local18 * 20;
					}
					return;
				}
				@Pc(47) int local47;
				if (local18 == 1) {
					if (this.anIntArray532 == null) {
						this.anInt9850 = 4;
						this.anIntArray532 = new int[4];
						this.anIntArray531 = new int[4];
					}
					for (local47 = 0; local47 < this.anIntArray532.length; local47++) {
						this.anIntArray532[local47] = arg0.method7752();
						this.anIntArray531[local47] = arg0.method7752();
					}
					local14 = true;
				} else if (local18 == 2) {
					this.anInt9855 = arg0.method7717(-1978450544);
				} else if (local18 == 3) {
					this.anInt9850 = arg0.method7695(102);
					this.anIntArray532 = new int[this.anInt9850];
					this.anIntArray531 = new int[this.anInt9850];
				} else if (local18 != 4) {
					if (local18 == 5) {
						this.anInt9851 = arg0.method7719();
					} else if (local18 == 6) {
						this.anInt9856 = arg0.method7719();
					} else if (local18 == 7) {
						this.aShortArrayArray5 = new short[10][4];
						this.aShortArrayArrayArray2 = new short[10][4][];
						for (local47 = 0; local47 < 10; local47++) {
							for (@Pc(182) int local182 = 0; local182 < 4; local182++) {
								@Pc(188) int local188 = arg0.method7717(-1978450544);
								if (local188 == 65535) {
									local188 = -1;
								}
								this.aShortArrayArray5[local47][local182] = (short) local188;
								@Pc(207) int local207 = arg0.method7717(-1978450544);
								this.aShortArrayArrayArray2[local47][local182] = new short[local207];
								for (@Pc(217) int local217 = 0; local217 < local207; local217++) {
									@Pc(223) int local223 = arg0.method7717(-1978450544);
									if (local223 == 65535) {
										local223 = -1;
									}
									this.aShortArrayArrayArray2[local47][local182][local217] = (short) local223;
								}
							}
						}
					} else if (local18 == 8) {
						this.aBoolean679 = false;
					} else if (local18 == 9) {
						this.anInt9853 = arg0.method7695(99);
					} else if (local18 == 10) {
						this.aBoolean680 = false;
					} else if (local18 == 11) {
						this.anInt9857 = arg0.method7695(109);
					}
				}
			}
		}
	}
}
