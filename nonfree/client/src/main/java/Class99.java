import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class99 {

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
	private int anInt3973 = 0;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
	private int anInt3967 = -1;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "Lclient!bg;")
	private Class13 aClass13_17 = new Class13();

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "Z")
	public boolean aBoolean176 = false;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
	private final int anInt3976;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
	private final int anInt3969;

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "[Lclient!pa;")
	private Class2_Sub17[] aClass2_Sub17Array1;

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(III)V")
	public Class99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3976 = arg1;
		this.anInt3969 = arg0;
		this.aClass2_Sub17Array1 = new Class2_Sub17[this.anInt3976];
		this.anIntArrayArrayArray9 = new int[this.anInt3969][3][arg2];
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)[[I")
	public int[][] method2748(@OriginalArg(1) int arg0) {
		if (this.anInt3969 == this.anInt3976) {
			this.aBoolean176 = this.aClass2_Sub17Array1[arg0] == null;
			this.aClass2_Sub17Array1[arg0] = Static167.aClass2_Sub17_1;
			return this.anIntArrayArrayArray9[arg0];
		} else if (this.anInt3969 == 1) {
			this.aBoolean176 = this.anInt3967 != arg0;
			this.anInt3967 = arg0;
			return this.anIntArrayArrayArray9[0];
		} else {
			@Pc(48) Class2_Sub17 local48 = this.aClass2_Sub17Array1[arg0];
			if (local48 == null) {
				this.aBoolean176 = true;
				if (this.anInt3973 >= this.anInt3969) {
					@Pc(68) Class2_Sub17 local68 = (Class2_Sub17) this.aClass13_17.method308();
					local48 = new Class2_Sub17(arg0, local68.anInt3174);
					this.aClass2_Sub17Array1[local68.anInt3173] = null;
					local68.method3183();
				} else {
					local48 = new Class2_Sub17(arg0, this.anInt3973);
					this.anInt3973++;
				}
				this.aClass2_Sub17Array1[arg0] = local48;
			} else {
				this.aBoolean176 = false;
			}
			this.aClass13_17.method306(local48);
			return this.anIntArrayArrayArray9[local48.anInt3174];
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)[[[I")
	public int[][][] method2749() {
		if (this.anInt3976 != this.anInt3969) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt3969; local25++) {
			this.aClass2_Sub17Array1[local25] = Static167.aClass2_Sub17_1;
		}
		return this.anIntArrayArrayArray9;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	public void method2750() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt3969; local13++) {
			this.anIntArrayArrayArray9[local13][0] = null;
			this.anIntArrayArrayArray9[local13][1] = null;
			this.anIntArrayArrayArray9[local13][2] = null;
			this.anIntArrayArrayArray9[local13] = null;
		}
		this.anIntArrayArrayArray9 = null;
		this.aClass2_Sub17Array1 = null;
		this.aClass13_17.method314();
		this.aClass13_17 = null;
	}
}
