import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class307 {

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
	private int anInt9119 = -1;

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
	private int anInt9126 = 0;

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "Lclient!ada;")
	private Class8 aClass8_60 = new Class8();

	@OriginalMember(owner = "client!sl", name = "o", descriptor = "Z")
	public boolean aBoolean613 = false;

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
	private final int anInt9122;

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
	private final int anInt9125;

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "[Lclient!sg;")
	private Class6_Sub42[] aClass6_Sub42Array1;

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(III)V")
	public Class307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9122 = arg1;
		this.anInt9125 = arg0;
		this.aClass6_Sub42Array1 = new Class6_Sub42[this.anInt9122];
		this.anIntArrayArrayArray20 = new int[this.anInt9125][3][arg2];
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V")
	public void method7790() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9125; local3++) {
			this.anIntArrayArrayArray20[local3][0] = null;
			this.anIntArrayArrayArray20[local3][1] = null;
			this.anIntArrayArrayArray20[local3][2] = null;
			this.anIntArrayArrayArray20[local3] = null;
		}
		this.anIntArrayArrayArray20 = null;
		this.aClass6_Sub42Array1 = null;
		this.aClass8_60.method154();
		this.aClass8_60 = null;
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)[[[I")
	public int[][][] method7791() {
		if (this.anInt9125 != this.anInt9122) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt9125; local21++) {
			this.aClass6_Sub42Array1[local21] = Static368.aClass6_Sub42_1;
		}
		return this.anIntArrayArrayArray20;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IB)[[I")
	public int[][] method7792(@OriginalArg(0) int arg0) {
		if (this.anInt9122 == this.anInt9125) {
			this.aBoolean613 = this.aClass6_Sub42Array1[arg0] == null;
			this.aClass6_Sub42Array1[arg0] = Static368.aClass6_Sub42_1;
			return this.anIntArrayArrayArray20[arg0];
		} else if (this.anInt9125 == 1) {
			this.aBoolean613 = arg0 != this.anInt9119;
			this.anInt9119 = arg0;
			return this.anIntArrayArrayArray20[0];
		} else {
			@Pc(71) Class6_Sub42 local71 = this.aClass6_Sub42Array1[arg0];
			if (local71 == null) {
				this.aBoolean613 = true;
				if (this.anInt9126 < this.anInt9125) {
					local71 = new Class6_Sub42(arg0, this.anInt9126);
					this.anInt9126++;
				} else {
					@Pc(111) Class6_Sub42 local111 = (Class6_Sub42) this.aClass8_60.method159();
					local71 = new Class6_Sub42(arg0, local111.anInt9056);
					this.aClass6_Sub42Array1[local111.anInt9054] = null;
					local111.method9043();
				}
				this.aClass6_Sub42Array1[arg0] = local71;
			} else {
				this.aBoolean613 = false;
			}
			this.aClass8_60.method146(local71);
			return this.anIntArrayArrayArray20[local71.anInt9056];
		}
	}
}
