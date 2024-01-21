import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class28 {

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
	private int anInt1341 = -1;

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
	private int anInt1336 = 0;

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "Lclient!sc;")
	private Class72 aClass72_18 = new Class72();

	@OriginalMember(owner = "client!gh", name = "A", descriptor = "Z")
	public boolean aBoolean89 = false;

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
	private final int anInt1340;

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "[Lclient!qb;")
	private Class3_Sub18[] aClass3_Sub18Array1;

	@OriginalMember(owner = "client!gh", name = "r", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
	private final int anInt1338;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(III)V")
	public Class28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1340 = arg1;
		this.aClass3_Sub18Array1 = new Class3_Sub18[arg1];
		this.anIntArrayArrayArray2 = new int[arg0][3][arg2];
		this.anInt1338 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)[[I")
	public int[][] method997(@OriginalArg(1) int arg0) {
		if (this.anInt1340 == this.anInt1338) {
			this.aBoolean89 = this.aClass3_Sub18Array1[arg0] == null;
			this.aClass3_Sub18Array1[arg0] = Static59.aClass3_Sub18_3;
			return this.anIntArrayArrayArray2[arg0];
		} else if (this.anInt1338 == 1) {
			this.aBoolean89 = this.anInt1341 != arg0;
			this.anInt1341 = arg0;
			return this.anIntArrayArrayArray2[0];
		} else {
			@Pc(42) Class3_Sub18 local42 = this.aClass3_Sub18Array1[arg0];
			if (this.aBoolean89 = local42 == null) {
				if (this.anInt1338 > this.anInt1336) {
					local42 = new Class3_Sub18(arg0, this.anInt1336);
					this.anInt1336++;
				} else {
					@Pc(81) Class3_Sub18 local81 = (Class3_Sub18) this.aClass72_18.method2403();
					local42 = new Class3_Sub18(arg0, local81.anInt3044);
					this.aClass3_Sub18Array1[local81.anInt3046] = null;
					local81.method2783();
				}
				this.aClass3_Sub18Array1[arg0] = local42;
			}
			this.aClass72_18.method2397(local42);
			return this.anIntArrayArrayArray2[local42.anInt3044];
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
	public void method999() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1338; local3++) {
			this.anIntArrayArrayArray2[local3][0] = null;
			this.anIntArrayArrayArray2[local3][1] = null;
			this.anIntArrayArrayArray2[local3][2] = null;
			this.anIntArrayArrayArray2[local3] = null;
		}
		this.anIntArrayArrayArray2 = null;
		this.aClass3_Sub18Array1 = null;
		this.aClass72_18.method2396();
		this.aClass72_18 = null;
	}
}
