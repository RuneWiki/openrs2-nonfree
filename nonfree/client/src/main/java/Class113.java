import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class113 {

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
	private int anInt3553 = -1;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
	private int anInt3556 = 0;

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "Lclient!tm;")
	private Class338 aClass338_95 = new Class338();

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "Z")
	public boolean aBoolean275 = false;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
	private final int anInt3552;

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
	private final int anInt3555;

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "[Lclient!lb;")
	private Class3_Sub36[] aClass3_Sub36Array1;

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(III)V")
	public Class113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3552 = arg1;
		this.anInt3555 = arg0;
		this.aClass3_Sub36Array1 = new Class3_Sub36[this.anInt3552];
		this.anIntArrayArray19 = new int[this.anInt3555][arg2];
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)[[I")
	public int[][] method3238() {
		if (this.anInt3555 != this.anInt3552) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt3555; local17++) {
			this.aClass3_Sub36Array1[local17] = Static625.aClass3_Sub36_1;
		}
		return this.anIntArrayArray19;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)[I")
	public int[] method3239(@OriginalArg(0) int arg0) {
		if (this.anInt3555 == this.anInt3552) {
			this.aBoolean275 = this.aClass3_Sub36Array1[arg0] == null;
			this.aClass3_Sub36Array1[arg0] = Static625.aClass3_Sub36_1;
			return this.anIntArrayArray19[arg0];
		} else if (this.anInt3555 == 1) {
			this.aBoolean275 = this.anInt3553 != arg0;
			this.anInt3553 = arg0;
			return this.anIntArrayArray19[0];
		} else {
			@Pc(48) Class3_Sub36 local48 = this.aClass3_Sub36Array1[arg0];
			if (local48 == null) {
				this.aBoolean275 = true;
				if (this.anInt3555 <= this.anInt3556) {
					@Pc(73) Class3_Sub36 local73 = (Class3_Sub36) this.aClass338_95.method8167();
					local48 = new Class3_Sub36(arg0, local73.anInt5487);
					this.aClass3_Sub36Array1[local73.anInt5488] = null;
					local73.method9380();
				} else {
					local48 = new Class3_Sub36(arg0, this.anInt3556);
					this.anInt3556++;
				}
				this.aClass3_Sub36Array1[arg0] = local48;
			} else {
				this.aBoolean275 = false;
			}
			this.aClass338_95.method8176(local48);
			return this.anIntArrayArray19[local48.anInt5487];
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
	public void method3240() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3555; local3++) {
			this.anIntArrayArray19[local3] = null;
		}
		this.aClass3_Sub36Array1 = null;
		this.anIntArrayArray19 = null;
		this.aClass338_95.method8175();
		this.aClass338_95 = null;
	}
}
