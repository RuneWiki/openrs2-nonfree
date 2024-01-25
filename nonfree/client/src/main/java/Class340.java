import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class340 {

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
	private int anInt9242 = -1;

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
	private int anInt9241 = 0;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "Lclient!jia;")
	private Class193 aClass193_61 = new Class193();

	@OriginalMember(owner = "client!tn", name = "o", descriptor = "Z")
	public boolean aBoolean687 = false;

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
	private final int anInt9238;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
	private final int anInt9235;

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray97;

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "[Lclient!sba;")
	private Class3_Sub47[] aClass3_Sub47Array1;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(III)V")
	public Class340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9238 = arg1;
		this.anInt9235 = arg0;
		this.anIntArrayArray97 = new int[this.anInt9235][arg2];
		this.aClass3_Sub47Array1 = new Class3_Sub47[this.anInt9238];
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
	public void method7832() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt9235; local11++) {
			this.anIntArrayArray97[local11] = null;
		}
		this.aClass3_Sub47Array1 = null;
		this.anIntArrayArray97 = null;
		this.aClass193_61.method4458();
		this.aClass193_61 = null;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[I")
	public int[] method7837(@OriginalArg(1) int arg0) {
		if (this.anInt9238 == this.anInt9235) {
			this.aBoolean687 = this.aClass3_Sub47Array1[arg0] == null;
			this.aClass3_Sub47Array1[arg0] = Static86.aClass3_Sub47_1;
			return this.anIntArrayArray97[arg0];
		} else if (this.anInt9235 == 1) {
			this.aBoolean687 = arg0 != this.anInt9242;
			this.anInt9242 = arg0;
			return this.anIntArrayArray97[0];
		} else {
			@Pc(25) Class3_Sub47 local25 = this.aClass3_Sub47Array1[arg0];
			if (local25 == null) {
				this.aBoolean687 = true;
				if (this.anInt9241 < this.anInt9235) {
					local25 = new Class3_Sub47(arg0, this.anInt9241);
					this.anInt9241++;
				} else {
					@Pc(60) Class3_Sub47 local60 = (Class3_Sub47) this.aClass193_61.method4456();
					local25 = new Class3_Sub47(arg0, local60.anInt8779);
					this.aClass3_Sub47Array1[local60.anInt8780] = null;
					local60.method8770();
				}
				this.aClass3_Sub47Array1[arg0] = local25;
			} else {
				this.aBoolean687 = false;
			}
			this.aClass193_61.method4455(local25);
			return this.anIntArrayArray97[local25.anInt8779];
		}
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)[[I")
	public int[][] method7838() {
		if (this.anInt9238 != this.anInt9235) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(31) int local31 = 0; local31 < this.anInt9235; local31++) {
			this.aClass3_Sub47Array1[local31] = Static86.aClass3_Sub47_1;
		}
		return this.anIntArrayArray97;
	}
}
