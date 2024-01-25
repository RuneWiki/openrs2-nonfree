import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class241 {

	@OriginalMember(owner = "client!to", name = "a", descriptor = "I")
	private int anInt6677 = 0;

	@OriginalMember(owner = "client!to", name = "g", descriptor = "I")
	private int anInt6680 = -1;

	@OriginalMember(owner = "client!to", name = "e", descriptor = "Lclient!mf;")
	private Class163 aClass163_41 = new Class163();

	@OriginalMember(owner = "client!to", name = "n", descriptor = "Z")
	public boolean aBoolean440 = false;

	@OriginalMember(owner = "client!to", name = "j", descriptor = "I")
	private final int anInt6682;

	@OriginalMember(owner = "client!to", name = "d", descriptor = "I")
	private final int anInt6679;

	@OriginalMember(owner = "client!to", name = "l", descriptor = "[Lclient!cm;")
	private Class10_Sub11[] aClass10_Sub11Array1;

	@OriginalMember(owner = "client!to", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(III)V")
	public Class241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6682 = arg0;
		this.anInt6679 = arg1;
		this.aClass10_Sub11Array1 = new Class10_Sub11[this.anInt6679];
		this.anIntArrayArray64 = new int[this.anInt6682][arg2];
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
	public void method5236() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6682; local7++) {
			this.anIntArrayArray64[local7] = null;
		}
		this.anIntArrayArray64 = null;
		this.aClass10_Sub11Array1 = null;
		this.aClass163_41.method3619();
		this.aClass163_41 = null;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)[[I")
	public int[][] method5237() {
		if (this.anInt6682 != this.anInt6679) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt6682; local25++) {
			this.aClass10_Sub11Array1[local25] = Static50.aClass10_Sub11_1;
		}
		return this.anIntArrayArray64;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IB)[I")
	public int[] method5238(@OriginalArg(0) int arg0) {
		if (this.anInt6679 == this.anInt6682) {
			this.aBoolean440 = this.aClass10_Sub11Array1[arg0] == null;
			this.aClass10_Sub11Array1[arg0] = Static50.aClass10_Sub11_1;
			return this.anIntArrayArray64[arg0];
		} else if (this.anInt6682 == 1) {
			this.aBoolean440 = arg0 != this.anInt6680;
			this.anInt6680 = arg0;
			return this.anIntArrayArray64[0];
		} else {
			@Pc(29) Class10_Sub11 local29 = this.aClass10_Sub11Array1[arg0];
			if (local29 == null) {
				this.aBoolean440 = true;
				if (this.anInt6682 > this.anInt6677) {
					local29 = new Class10_Sub11(arg0, this.anInt6677);
					this.anInt6677++;
				} else {
					@Pc(64) Class10_Sub11 local64 = (Class10_Sub11) this.aClass163_41.method3612();
					local29 = new Class10_Sub11(arg0, local64.anInt1106);
					this.aClass10_Sub11Array1[local64.anInt1107] = null;
					local64.method6033();
				}
				this.aClass10_Sub11Array1[arg0] = local29;
			} else {
				this.aBoolean440 = false;
			}
			this.aClass163_41.method3615(local29);
			return this.anIntArrayArray64[local29.anInt1106];
		}
	}
}
