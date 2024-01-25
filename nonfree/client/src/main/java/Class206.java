import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class206 {

	@OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
	private int anInt5244 = -1;

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
	private int anInt5240 = 0;

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "Lclient!kr;")
	private Class138 aClass138_38 = new Class138();

	@OriginalMember(owner = "client!rn", name = "s", descriptor = "Z")
	public boolean aBoolean409 = false;

	@OriginalMember(owner = "client!rn", name = "p", descriptor = "I")
	private final int anInt5249;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
	private final int anInt5242;

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "[Lclient!gm;")
	private Class3_Sub17[] aClass3_Sub17Array1;

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(III)V")
	public Class206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5249 = arg1;
		this.anInt5242 = arg0;
		this.aClass3_Sub17Array1 = new Class3_Sub17[this.anInt5249];
		this.anIntArrayArrayArray14 = new int[this.anInt5242][3][arg2];
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)[[I")
	public int[][] method4681(@OriginalArg(1) int arg0) {
		if (this.anInt5249 == this.anInt5242) {
			this.aBoolean409 = this.aClass3_Sub17Array1[arg0] == null;
			this.aClass3_Sub17Array1[arg0] = Static230.aClass3_Sub17_1;
			return this.anIntArrayArrayArray14[arg0];
		} else if (this.anInt5242 == 1) {
			this.aBoolean409 = this.anInt5244 != arg0;
			this.anInt5244 = arg0;
			return this.anIntArrayArrayArray14[0];
		} else {
			@Pc(29) Class3_Sub17 local29 = this.aClass3_Sub17Array1[arg0];
			if (local29 == null) {
				this.aBoolean409 = true;
				if (this.anInt5242 > this.anInt5240) {
					local29 = new Class3_Sub17(arg0, this.anInt5240);
					this.anInt5240++;
				} else {
					@Pc(60) Class3_Sub17 local60 = (Class3_Sub17) this.aClass138_38.method3055();
					local29 = new Class3_Sub17(arg0, local60.anInt2267);
					this.aClass3_Sub17Array1[local60.anInt2263] = null;
					local60.method5700();
				}
				this.aClass3_Sub17Array1[arg0] = local29;
			} else {
				this.aBoolean409 = false;
			}
			this.aClass138_38.method3054(local29);
			return this.anIntArrayArrayArray14[local29.anInt2267];
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)[[[I")
	public int[][][] method4684() {
		if (this.anInt5242 != this.anInt5249) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt5242; local25++) {
			this.aClass3_Sub17Array1[local25] = Static230.aClass3_Sub17_1;
		}
		return this.anIntArrayArrayArray14;
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)V")
	public void method4689() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5242; local3++) {
			this.anIntArrayArrayArray14[local3][0] = null;
			this.anIntArrayArrayArray14[local3][1] = null;
			this.anIntArrayArrayArray14[local3][2] = null;
			this.anIntArrayArrayArray14[local3] = null;
		}
		this.anIntArrayArrayArray14 = null;
		this.aClass3_Sub17Array1 = null;
		this.aClass138_38.method3046();
		this.aClass138_38 = null;
	}
}
