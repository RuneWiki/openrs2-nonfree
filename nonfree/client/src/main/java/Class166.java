import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class166 {

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
	private int anInt5327 = -1;

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
	private int anInt5334 = 0;

	@OriginalMember(owner = "client!uj", name = "r", descriptor = "Lclient!wn;")
	private Class182 aClass182_28 = new Class182();

	@OriginalMember(owner = "client!uj", name = "t", descriptor = "Z")
	public boolean aBoolean451 = false;

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
	private int anInt5339;

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
	private int anInt5328;

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "[Lclient!sa;")
	private Class8_Sub26[] aClass8_Sub26Array1;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(III)V")
	public Class166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5339 = arg0;
		this.anIntArrayArrayArray16 = new int[this.anInt5339][3][arg2];
		this.anInt5328 = arg1;
		this.aClass8_Sub26Array1 = new Class8_Sub26[this.anInt5328];
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)[[[I")
	public int[][][] method4034() {
		if (this.anInt5328 != this.anInt5339) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt5339; local22++) {
			this.aClass8_Sub26Array1[local22] = Static127.aClass8_Sub26_1;
		}
		return this.anIntArrayArrayArray16;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)[[I")
	public int[][] method4037(@OriginalArg(1) int arg0) {
		if (this.anInt5328 == this.anInt5339) {
			this.aBoolean451 = this.aClass8_Sub26Array1[arg0] == null;
			this.aClass8_Sub26Array1[arg0] = Static127.aClass8_Sub26_1;
			return this.anIntArrayArrayArray16[arg0];
		} else if (this.anInt5339 == 1) {
			this.aBoolean451 = this.anInt5327 != arg0;
			this.anInt5327 = arg0;
			return this.anIntArrayArrayArray16[0];
		} else {
			@Pc(49) Class8_Sub26 local49 = this.aClass8_Sub26Array1[arg0];
			if (local49 == null) {
				this.aBoolean451 = true;
				if (this.anInt5334 >= this.anInt5339) {
					@Pc(69) Class8_Sub26 local69 = (Class8_Sub26) this.aClass182_28.method4320();
					local49 = new Class8_Sub26(arg0, local69.anInt4771);
					this.aClass8_Sub26Array1[local69.anInt4773] = null;
					local69.method4273();
				} else {
					local49 = new Class8_Sub26(arg0, this.anInt5334);
					this.anInt5334++;
				}
				this.aClass8_Sub26Array1[arg0] = local49;
			} else {
				this.aBoolean451 = false;
			}
			this.aClass182_28.method4325(local49);
			return this.anIntArrayArrayArray16[local49.anInt4771];
		}
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V")
	public void method4038() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5339; local3++) {
			this.anIntArrayArrayArray16[local3][0] = null;
			this.anIntArrayArrayArray16[local3][1] = null;
			this.anIntArrayArrayArray16[local3][2] = null;
			this.anIntArrayArrayArray16[local3] = null;
		}
		this.aClass8_Sub26Array1 = null;
		this.anIntArrayArrayArray16 = null;
		this.aClass182_28.method4317();
		this.aClass182_28 = null;
	}
}
