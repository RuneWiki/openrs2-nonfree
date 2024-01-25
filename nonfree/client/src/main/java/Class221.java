import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class221 {

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
	private int anInt6943 = -1;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
	private int anInt6946 = 0;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "Lclient!rk;")
	private Class249 aClass249_48 = new Class249();

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "Z")
	public boolean aBoolean523 = false;

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
	private final int anInt6941;

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
	private final int anInt6944;

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray63;

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "[Lclient!eu;")
	private Class2_Sub20[] aClass2_Sub20Array1;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(III)V")
	public Class221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6941 = arg0;
		this.anInt6944 = arg1;
		this.anIntArrayArray63 = new int[this.anInt6941][arg2];
		this.aClass2_Sub20Array1 = new Class2_Sub20[this.anInt6944];
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
	public void method5899() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt6941; local15++) {
			this.anIntArrayArray63[local15] = null;
		}
		this.anIntArrayArray63 = null;
		this.aClass2_Sub20Array1 = null;
		this.aClass249_48.method6530();
		this.aClass249_48 = null;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)[[I")
	public int[][] method5900() {
		if (this.anInt6941 != this.anInt6944) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt6941; local26++) {
			this.aClass2_Sub20Array1[local26] = Static259.aClass2_Sub20_2;
		}
		return this.anIntArrayArray63;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[I")
	public int[] method5903(@OriginalArg(1) int arg0) {
		if (this.anInt6941 == this.anInt6944) {
			this.aBoolean523 = this.aClass2_Sub20Array1[arg0] == null;
			this.aClass2_Sub20Array1[arg0] = Static259.aClass2_Sub20_2;
			return this.anIntArrayArray63[arg0];
		} else if (this.anInt6941 == 1) {
			this.aBoolean523 = arg0 != this.anInt6943;
			this.anInt6943 = arg0;
			return this.anIntArrayArray63[0];
		} else {
			@Pc(29) Class2_Sub20 local29 = this.aClass2_Sub20Array1[arg0];
			if (local29 == null) {
				this.aBoolean523 = true;
				if (this.anInt6946 >= this.anInt6941) {
					@Pc(54) Class2_Sub20 local54 = (Class2_Sub20) this.aClass249_48.method6521();
					local29 = new Class2_Sub20(arg0, local54.anInt2347);
					this.aClass2_Sub20Array1[local54.anInt2344] = null;
					local54.method7802();
				} else {
					local29 = new Class2_Sub20(arg0, this.anInt6946);
					this.anInt6946++;
				}
				this.aClass2_Sub20Array1[arg0] = local29;
			} else {
				this.aBoolean523 = false;
			}
			this.aClass249_48.method6520(local29);
			return this.anIntArrayArray63[local29.anInt2347];
		}
	}
}
