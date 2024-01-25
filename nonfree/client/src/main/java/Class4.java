import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "[I")
	public static final int[] anIntArray8 = new int[4096];

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
	private int anInt77 = -1;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
	private int anInt78 = 0;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "Lclient!kr;")
	private Class138 aClass138_1 = new Class138();

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "Z")
	public boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
	private final int anInt75;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
	private final int anInt73;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "[Lclient!fs;")
	private Class3_Sub14[] aClass3_Sub14Array1;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	static {
		for (@Pc(9) int local9 = 0; local9 < 4096; local9++) {
			anIntArray8[local9] = Static295.method4558(local9);
		}
	}

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(III)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt75 = arg1;
		this.anInt73 = arg0;
		this.aClass3_Sub14Array1 = new Class3_Sub14[this.anInt75];
		this.anIntArrayArray1 = new int[this.anInt73][arg2];
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	public void method59() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt73; local3++) {
			this.anIntArrayArray1[local3] = null;
		}
		this.anIntArrayArray1 = null;
		this.aClass3_Sub14Array1 = null;
		this.aClass138_1.method3046();
		this.aClass138_1 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)[[I")
	public int[][] method60() {
		if (this.anInt75 != this.anInt73) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(23) int local23 = 0; local23 < this.anInt73; local23++) {
			this.aClass3_Sub14Array1[local23] = Static379.aClass3_Sub14_1;
		}
		return this.anIntArrayArray1;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)[I")
	public int[] method61(@OriginalArg(0) int arg0) {
		if (this.anInt75 == this.anInt73) {
			this.aBoolean7 = this.aClass3_Sub14Array1[arg0] == null;
			this.aClass3_Sub14Array1[arg0] = Static379.aClass3_Sub14_1;
			return this.anIntArrayArray1[arg0];
		} else if (this.anInt73 == 1) {
			this.aBoolean7 = arg0 != this.anInt77;
			this.anInt77 = arg0;
			return this.anIntArrayArray1[0];
		} else {
			@Pc(69) Class3_Sub14 local69 = this.aClass3_Sub14Array1[arg0];
			if (local69 == null) {
				this.aBoolean7 = true;
				if (this.anInt73 <= this.anInt78) {
					@Pc(85) Class3_Sub14 local85 = (Class3_Sub14) this.aClass138_1.method3055();
					local69 = new Class3_Sub14(arg0, local85.anInt2150);
					this.aClass3_Sub14Array1[local85.anInt2144] = null;
					local85.method5700();
				} else {
					local69 = new Class3_Sub14(arg0, this.anInt78);
					this.anInt78++;
				}
				this.aClass3_Sub14Array1[arg0] = local69;
			} else {
				this.aBoolean7 = false;
			}
			this.aClass138_1.method3054(local69);
			return this.anIntArrayArray1[local69.anInt2150];
		}
	}
}
