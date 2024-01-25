import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class87 {

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
	private int anInt2123 = -1;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
	private int anInt2127 = 0;

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "Lclient!qw;")
	private Class302 aClass302_13 = new Class302();

	@OriginalMember(owner = "client!ds", name = "q", descriptor = "Z")
	public boolean aBoolean163 = false;

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
	private final int anInt2128;

	@OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
	private final int anInt2130;

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "[Lclient!jq;")
	private Class3_Sub31[] aClass3_Sub31Array1;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(III)V")
	public Class87(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2128 = arg1;
		this.anInt2130 = arg0;
		this.anIntArrayArray10 = new int[this.anInt2130][arg2];
		this.aClass3_Sub31Array1 = new Class3_Sub31[this.anInt2128];
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)[I")
	public int[] method1796(@OriginalArg(1) int arg0) {
		if (this.anInt2130 == this.anInt2128) {
			this.aBoolean163 = this.aClass3_Sub31Array1[arg0] == null;
			this.aClass3_Sub31Array1[arg0] = Static545.aClass3_Sub31_1;
			return this.anIntArrayArray10[arg0];
		} else if (this.anInt2130 == 1) {
			this.aBoolean163 = this.anInt2123 != arg0;
			this.anInt2123 = arg0;
			return this.anIntArrayArray10[0];
		} else {
			@Pc(45) Class3_Sub31 local45 = this.aClass3_Sub31Array1[arg0];
			if (local45 == null) {
				this.aBoolean163 = true;
				if (this.anInt2127 >= this.anInt2130) {
					@Pc(65) Class3_Sub31 local65 = (Class3_Sub31) this.aClass302_13.method6602();
					local45 = new Class3_Sub31(arg0, local65.anInt4894);
					this.aClass3_Sub31Array1[local65.anInt4892] = null;
					local65.method9034();
				} else {
					local45 = new Class3_Sub31(arg0, this.anInt2127);
					this.anInt2127++;
				}
				this.aClass3_Sub31Array1[arg0] = local45;
			} else {
				this.aBoolean163 = false;
			}
			this.aClass302_13.method6610(local45);
			return this.anIntArrayArray10[local45.anInt4894];
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)V")
	public void method1797() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2130; local3++) {
			this.anIntArrayArray10[local3] = null;
		}
		this.anIntArrayArray10 = null;
		this.aClass3_Sub31Array1 = null;
		this.aClass302_13.method6614();
		this.aClass302_13 = null;
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)[[I")
	public int[][] method1798() {
		if (this.anInt2128 != this.anInt2130) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt2130; local22++) {
			this.aClass3_Sub31Array1[local22] = Static545.aClass3_Sub31_1;
		}
		return this.anIntArrayArray10;
	}
}
