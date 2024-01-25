import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class137 {

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
	private int anInt4135 = 0;

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
	private int anInt4138 = -1;

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "Lclient!wq;")
	private Class216 aClass216_35 = new Class216();

	@OriginalMember(owner = "client!nj", name = "q", descriptor = "Z")
	public boolean aBoolean369 = false;

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
	private final int anInt4136;

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
	private final int anInt4143;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "[Lclient!gn;")
	private Class2_Sub19[] aClass2_Sub19Array1;

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray121;

	static {
		new Class93("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	}

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(III)V")
	public Class137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4136 = arg0;
		this.anInt4143 = arg1;
		this.aClass2_Sub19Array1 = new Class2_Sub19[this.anInt4143];
		this.anIntArrayArray121 = new int[this.anInt4136][arg2];
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)[[I")
	public int[][] method3808() {
		if (this.anInt4136 != this.anInt4143) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt4136; local26++) {
			this.aClass2_Sub19Array1[local26] = Static303.aClass2_Sub19_1;
		}
		return this.anIntArrayArray121;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
	public void method3809() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt4136; local11++) {
			this.anIntArrayArray121[local11] = null;
		}
		this.anIntArrayArray121 = null;
		this.aClass2_Sub19Array1 = null;
		this.aClass216_35.method5991();
		this.aClass216_35 = null;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZ)[I")
	public int[] method3812(@OriginalArg(0) int arg0) {
		if (this.anInt4143 == this.anInt4136) {
			this.aBoolean369 = this.aClass2_Sub19Array1[arg0] == null;
			this.aClass2_Sub19Array1[arg0] = Static303.aClass2_Sub19_1;
			return this.anIntArrayArray121[arg0];
		} else if (this.anInt4136 == 1) {
			this.aBoolean369 = arg0 != this.anInt4138;
			this.anInt4138 = arg0;
			return this.anIntArrayArray121[0];
		} else {
			@Pc(29) Class2_Sub19 local29 = this.aClass2_Sub19Array1[arg0];
			if (local29 == null) {
				this.aBoolean369 = true;
				if (this.anInt4136 > this.anInt4135) {
					local29 = new Class2_Sub19(arg0, this.anInt4135);
					this.anInt4135++;
				} else {
					@Pc(69) Class2_Sub19 local69 = (Class2_Sub19) this.aClass216_35.method5996();
					local29 = new Class2_Sub19(arg0, local69.anInt2411);
					this.aClass2_Sub19Array1[local69.anInt2408] = null;
					local69.method5945();
				}
				this.aClass2_Sub19Array1[arg0] = local29;
			} else {
				this.aBoolean369 = false;
			}
			this.aClass216_35.method5997(local29);
			return this.anIntArrayArray121[local29.anInt2411];
		}
	}
}
