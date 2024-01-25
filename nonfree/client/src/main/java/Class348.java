import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class348 {

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
	private int anInt9720 = 0;

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
	private int anInt9724 = -1;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "Lclient!tm;")
	private Class338 aClass338_222 = new Class338();

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "Z")
	public boolean aBoolean748 = false;

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
	private final int anInt9725;

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
	private final int anInt9719;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "[Lclient!aca;")
	private Class3_Sub2[] aClass3_Sub2Array1;

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(III)V")
	public Class348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9725 = arg0;
		this.anInt9719 = arg1;
		this.aClass3_Sub2Array1 = new Class3_Sub2[this.anInt9719];
		this.anIntArrayArrayArray19 = new int[this.anInt9725][3][arg2];
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)[[[I")
	public int[][][] method8550() {
		if (this.anInt9725 != this.anInt9719) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt9725; local27++) {
			this.aClass3_Sub2Array1[local27] = Static436.aClass3_Sub2_1;
		}
		return this.anIntArrayArrayArray19;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
	public void method8551() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9725; local7++) {
			this.anIntArrayArrayArray19[local7][0] = null;
			this.anIntArrayArrayArray19[local7][1] = null;
			this.anIntArrayArrayArray19[local7][2] = null;
			this.anIntArrayArrayArray19[local7] = null;
		}
		this.aClass3_Sub2Array1 = null;
		this.anIntArrayArrayArray19 = null;
		this.aClass338_222.method8175();
		this.aClass338_222 = null;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)[[I")
	public int[][] method8552(@OriginalArg(1) int arg0) {
		if (this.anInt9725 == this.anInt9719) {
			this.aBoolean748 = this.aClass3_Sub2Array1[arg0] == null;
			this.aClass3_Sub2Array1[arg0] = Static436.aClass3_Sub2_1;
			return this.anIntArrayArrayArray19[arg0];
		} else if (this.anInt9725 == 1) {
			this.aBoolean748 = arg0 != this.anInt9724;
			this.anInt9724 = arg0;
			return this.anIntArrayArrayArray19[0];
		} else {
			@Pc(41) Class3_Sub2 local41 = this.aClass3_Sub2Array1[arg0];
			if (local41 == null) {
				this.aBoolean748 = true;
				if (this.anInt9720 >= this.anInt9725) {
					@Pc(57) Class3_Sub2 local57 = (Class3_Sub2) this.aClass338_222.method8167();
					local41 = new Class3_Sub2(arg0, local57.anInt71);
					this.aClass3_Sub2Array1[local57.anInt74] = null;
					local57.method9380();
				} else {
					local41 = new Class3_Sub2(arg0, this.anInt9720);
					this.anInt9720++;
				}
				this.aClass3_Sub2Array1[arg0] = local41;
			} else {
				this.aBoolean748 = false;
			}
			this.aClass338_222.method8176(local41);
			return this.anIntArrayArrayArray19[local41.anInt71];
		}
	}
}
