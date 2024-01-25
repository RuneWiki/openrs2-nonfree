import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class90 {

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
	private int anInt2601 = 0;

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
	private int anInt2607 = -1;

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "Lclient!sf;")
	private Class180 aClass180_18 = new Class180();

	@OriginalMember(owner = "client!hg", name = "s", descriptor = "Z")
	public boolean aBoolean257 = false;

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
	private final int anInt2606;

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
	private final int anInt2604;

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "[Lclient!rj;")
	private Class2_Sub36[] aClass2_Sub36Array1;

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(III)V")
	public Class90(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2606 = arg1;
		this.anInt2604 = arg0;
		this.aClass2_Sub36Array1 = new Class2_Sub36[this.anInt2606];
		this.anIntArrayArrayArray5 = new int[this.anInt2604][3][arg2];
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)[[[I")
	public int[][][] method2389() {
		if (this.anInt2606 != this.anInt2604) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt2604; local29++) {
			this.aClass2_Sub36Array1[local29] = Static31.aClass2_Sub36_1;
		}
		return this.anIntArrayArrayArray5;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZ)[[I")
	public int[][] method2391(@OriginalArg(0) int arg0) {
		if (this.anInt2606 == this.anInt2604) {
			this.aBoolean257 = this.aClass2_Sub36Array1[arg0] == null;
			this.aClass2_Sub36Array1[arg0] = Static31.aClass2_Sub36_1;
			return this.anIntArrayArrayArray5[arg0];
		} else if (this.anInt2604 == 1) {
			this.aBoolean257 = this.anInt2607 != arg0;
			this.anInt2607 = arg0;
			return this.anIntArrayArrayArray5[0];
		} else {
			@Pc(47) Class2_Sub36 local47 = this.aClass2_Sub36Array1[arg0];
			if (local47 == null) {
				this.aBoolean257 = true;
				if (this.anInt2604 > this.anInt2601) {
					local47 = new Class2_Sub36(arg0, this.anInt2601);
					this.anInt2601++;
				} else {
					@Pc(82) Class2_Sub36 local82 = (Class2_Sub36) this.aClass180_18.method4920();
					local47 = new Class2_Sub36(arg0, local82.anInt5696);
					this.aClass2_Sub36Array1[local82.anInt5697] = null;
					local82.method5723();
				}
				this.aClass2_Sub36Array1[arg0] = local47;
			} else {
				this.aBoolean257 = false;
			}
			this.aClass180_18.method4918(local47);
			return this.anIntArrayArrayArray5[local47.anInt5696];
		}
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
	public void method2394() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2604; local3++) {
			this.anIntArrayArrayArray5[local3][0] = null;
			this.anIntArrayArrayArray5[local3][1] = null;
			this.anIntArrayArrayArray5[local3][2] = null;
			this.anIntArrayArrayArray5[local3] = null;
		}
		this.anIntArrayArrayArray5 = null;
		this.aClass2_Sub36Array1 = null;
		this.aClass180_18.method4917();
		this.aClass180_18 = null;
	}
}
