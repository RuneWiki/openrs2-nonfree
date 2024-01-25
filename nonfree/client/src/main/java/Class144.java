import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ida")
public final class Class144 {

	@OriginalMember(owner = "client!ida", name = "j", descriptor = "I")
	private int anInt4279 = -1;

	@OriginalMember(owner = "client!ida", name = "o", descriptor = "I")
	private int anInt4284 = 0;

	@OriginalMember(owner = "client!ida", name = "f", descriptor = "Lclient!hga;")
	private Class130 aClass130_22 = new Class130();

	@OriginalMember(owner = "client!ida", name = "p", descriptor = "Z")
	public boolean aBoolean326 = false;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "I")
	private final int anInt4274;

	@OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
	private final int anInt4275;

	@OriginalMember(owner = "client!ida", name = "h", descriptor = "[Lclient!ld;")
	private Class3_Sub29[] aClass3_Sub29Array1;

	@OriginalMember(owner = "client!ida", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(III)V")
	public Class144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4274 = arg0;
		this.anInt4275 = arg1;
		this.aClass3_Sub29Array1 = new Class3_Sub29[this.anInt4275];
		this.anIntArrayArrayArray7 = new int[this.anInt4274][3][arg2];
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)[[[I")
	public int[][][] method3780() {
		if (this.anInt4274 != this.anInt4275) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(19) int local19 = 0; local19 < this.anInt4274; local19++) {
			this.aClass3_Sub29Array1[local19] = Static444.aClass3_Sub29_1;
		}
		return this.anIntArrayArrayArray7;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(II)[[I")
	public int[][] method3782(@OriginalArg(0) int arg0) {
		if (this.anInt4274 == this.anInt4275) {
			this.aBoolean326 = this.aClass3_Sub29Array1[arg0] == null;
			this.aClass3_Sub29Array1[arg0] = Static444.aClass3_Sub29_1;
			return this.anIntArrayArrayArray7[arg0];
		} else if (this.anInt4274 == 1) {
			this.aBoolean326 = this.anInt4279 != arg0;
			this.anInt4279 = arg0;
			return this.anIntArrayArrayArray7[0];
		} else {
			@Pc(49) Class3_Sub29 local49 = this.aClass3_Sub29Array1[arg0];
			if (local49 == null) {
				this.aBoolean326 = true;
				if (this.anInt4284 < this.anInt4274) {
					local49 = new Class3_Sub29(arg0, this.anInt4284);
					this.anInt4284++;
				} else {
					@Pc(84) Class3_Sub29 local84 = (Class3_Sub29) this.aClass130_22.method3540();
					local49 = new Class3_Sub29(arg0, local84.anInt5346);
					this.aClass3_Sub29Array1[local84.anInt5345] = null;
					local84.method7812();
				}
				this.aClass3_Sub29Array1[arg0] = local49;
			} else {
				this.aBoolean326 = false;
			}
			this.aClass130_22.method3547(local49);
			return this.anIntArrayArrayArray7[local49.anInt5346];
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(B)V")
	public void method3784() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4274; local7++) {
			this.anIntArrayArrayArray7[local7][0] = null;
			this.anIntArrayArrayArray7[local7][1] = null;
			this.anIntArrayArrayArray7[local7][2] = null;
			this.anIntArrayArrayArray7[local7] = null;
		}
		this.anIntArrayArrayArray7 = null;
		this.aClass3_Sub29Array1 = null;
		this.aClass130_22.method3541();
		this.aClass130_22 = null;
	}
}
