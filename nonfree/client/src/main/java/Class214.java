import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mga")
public final class Class214 {

	@OriginalMember(owner = "client!mga", name = "e", descriptor = "I")
	private int anInt6762 = -1;

	@OriginalMember(owner = "client!mga", name = "d", descriptor = "I")
	private int anInt6761 = 0;

	@OriginalMember(owner = "client!mga", name = "k", descriptor = "Lclient!qia;")
	private Class276 aClass276_44 = new Class276();

	@OriginalMember(owner = "client!mga", name = "s", descriptor = "Z")
	public boolean aBoolean577 = false;

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "I")
	private final int anInt6759;

	@OriginalMember(owner = "client!mga", name = "f", descriptor = "I")
	private final int anInt6763;

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "[Lclient!qo;")
	private Class3_Sub40[] aClass3_Sub40Array1;

	@OriginalMember(owner = "client!mga", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(III)V")
	public Class214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6759 = arg1;
		this.anInt6763 = arg0;
		this.aClass3_Sub40Array1 = new Class3_Sub40[this.anInt6759];
		this.anIntArrayArrayArray3 = new int[this.anInt6763][3][arg2];
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(II)[[I")
	public int[][] method5655(@OriginalArg(1) int arg0) {
		if (this.anInt6759 == this.anInt6763) {
			this.aBoolean577 = this.aClass3_Sub40Array1[arg0] == null;
			this.aClass3_Sub40Array1[arg0] = Static73.aClass3_Sub40_1;
			return this.anIntArrayArrayArray3[arg0];
		} else if (this.anInt6763 == 1) {
			this.aBoolean577 = arg0 != this.anInt6762;
			this.anInt6762 = arg0;
			return this.anIntArrayArrayArray3[0];
		} else {
			@Pc(48) Class3_Sub40 local48 = this.aClass3_Sub40Array1[arg0];
			if (local48 == null) {
				this.aBoolean577 = true;
				if (this.anInt6763 <= this.anInt6761) {
					@Pc(68) Class3_Sub40 local68 = (Class3_Sub40) this.aClass276_44.method6915();
					local48 = new Class3_Sub40(arg0, local68.anInt8433);
					this.aClass3_Sub40Array1[local68.anInt8431] = null;
					local68.method8671();
				} else {
					local48 = new Class3_Sub40(arg0, this.anInt6761);
					this.anInt6761++;
				}
				this.aClass3_Sub40Array1[arg0] = local48;
			} else {
				this.aBoolean577 = false;
			}
			this.aClass276_44.method6905(local48);
			return this.anIntArrayArrayArray3[local48.anInt8433];
		}
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)[[[I")
	public int[][][] method5658() {
		if (this.anInt6763 != this.anInt6759) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt6763; local25++) {
			this.aClass3_Sub40Array1[local25] = Static73.aClass3_Sub40_1;
		}
		return this.anIntArrayArrayArray3;
	}

	@OriginalMember(owner = "client!mga", name = "c", descriptor = "(I)V")
	public void method5659() {
		for (@Pc(12) int local12 = 0; local12 < this.anInt6763; local12++) {
			this.anIntArrayArrayArray3[local12][0] = null;
			this.anIntArrayArrayArray3[local12][1] = null;
			this.anIntArrayArrayArray3[local12][2] = null;
			this.anIntArrayArrayArray3[local12] = null;
		}
		this.aClass3_Sub40Array1 = null;
		this.anIntArrayArrayArray3 = null;
		this.aClass276_44.method6910();
		this.aClass276_44 = null;
	}
}
