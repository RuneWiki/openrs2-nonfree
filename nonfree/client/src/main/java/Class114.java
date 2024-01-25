import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class114 {

	@OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
	private int anInt2865 = 0;

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
	private int anInt2868 = -1;

	@OriginalMember(owner = "client!hm", name = "m", descriptor = "Lclient!nj;")
	private Class181 aClass181_12 = new Class181();

	@OriginalMember(owner = "client!hm", name = "q", descriptor = "Z")
	public boolean aBoolean180 = false;

	@OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
	private final int anInt2867;

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
	private final int anInt2863;

	@OriginalMember(owner = "client!hm", name = "i", descriptor = "[Lclient!h;")
	private Class2_Sub13[] aClass2_Sub13Array1;

	@OriginalMember(owner = "client!hm", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(III)V")
	public Class114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2867 = arg1;
		this.anInt2863 = arg0;
		this.aClass2_Sub13Array1 = new Class2_Sub13[this.anInt2867];
		this.anIntArrayArrayArray13 = new int[this.anInt2863][3][arg2];
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(B)[[[I")
	public int[][][] method2344() {
		if (this.anInt2867 != this.anInt2863) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt2863; local29++) {
			this.aClass2_Sub13Array1[local29] = Static324.aClass2_Sub13_1;
		}
		return this.anIntArrayArrayArray13;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)[[I")
	public int[][] method2346(@OriginalArg(0) int arg0) {
		if (this.anInt2863 == this.anInt2867) {
			this.aBoolean180 = this.aClass2_Sub13Array1[arg0] == null;
			this.aClass2_Sub13Array1[arg0] = Static324.aClass2_Sub13_1;
			return this.anIntArrayArrayArray13[arg0];
		} else if (this.anInt2863 == 1) {
			this.aBoolean180 = this.anInt2868 != arg0;
			this.anInt2868 = arg0;
			return this.anIntArrayArrayArray13[0];
		} else {
			@Pc(74) Class2_Sub13 local74 = this.aClass2_Sub13Array1[arg0];
			if (local74 == null) {
				this.aBoolean180 = true;
				if (this.anInt2863 <= this.anInt2865) {
					@Pc(99) Class2_Sub13 local99 = (Class2_Sub13) this.aClass181_12.method3974();
					local74 = new Class2_Sub13(arg0, local99.anInt2683);
					this.aClass2_Sub13Array1[local99.anInt2682] = null;
					local99.method6260();
				} else {
					local74 = new Class2_Sub13(arg0, this.anInt2865);
					this.anInt2865++;
				}
				this.aClass2_Sub13Array1[arg0] = local74;
			} else {
				this.aBoolean180 = false;
			}
			this.aClass181_12.method3965(local74);
			return this.anIntArrayArrayArray13[local74.anInt2683];
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
	public void method2348() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2863; local7++) {
			this.anIntArrayArrayArray13[local7][0] = null;
			this.anIntArrayArrayArray13[local7][1] = null;
			this.anIntArrayArrayArray13[local7][2] = null;
			this.anIntArrayArrayArray13[local7] = null;
		}
		this.anIntArrayArrayArray13 = null;
		this.aClass2_Sub13Array1 = null;
		this.aClass181_12.method3969();
		this.aClass181_12 = null;
	}
}
