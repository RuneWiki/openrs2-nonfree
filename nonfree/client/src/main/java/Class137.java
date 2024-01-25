import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class137 {

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
	private int anInt4634 = 0;

	@OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
	private int anInt4635 = -1;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "Lclient!sf;")
	private Class180 aClass180_27 = new Class180();

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "Z")
	public boolean aBoolean400 = false;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
	private final int anInt4624;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	private final int anInt4620;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "[Lclient!lh;")
	private Class2_Sub24[] aClass2_Sub24Array1;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(III)V")
	public Class137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4624 = arg0;
		this.anInt4620 = arg1;
		this.anIntArrayArray40 = new int[this.anInt4624][arg2];
		this.aClass2_Sub24Array1 = new Class2_Sub24[this.anInt4620];
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)[[I")
	public int[][] method3983() {
		if (this.anInt4624 != this.anInt4620) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt4624; local17++) {
			this.aClass2_Sub24Array1[local17] = Static237.aClass2_Sub24_1;
		}
		return this.anIntArrayArray40;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[I")
	public int[] method3984(@OriginalArg(1) int arg0) {
		if (this.anInt4624 == this.anInt4620) {
			this.aBoolean400 = this.aClass2_Sub24Array1[arg0] == null;
			this.aClass2_Sub24Array1[arg0] = Static237.aClass2_Sub24_1;
			return this.anIntArrayArray40[arg0];
		} else if (this.anInt4624 == 1) {
			this.aBoolean400 = this.anInt4635 != arg0;
			this.anInt4635 = arg0;
			return this.anIntArrayArray40[0];
		} else {
			@Pc(43) Class2_Sub24 local43 = this.aClass2_Sub24Array1[arg0];
			if (local43 == null) {
				this.aBoolean400 = true;
				if (this.anInt4624 > this.anInt4634) {
					local43 = new Class2_Sub24(arg0, this.anInt4634);
					this.anInt4634++;
				} else {
					@Pc(79) Class2_Sub24 local79 = (Class2_Sub24) this.aClass180_27.method4920();
					local43 = new Class2_Sub24(arg0, local79.anInt4070);
					this.aClass2_Sub24Array1[local79.anInt4072] = null;
					local79.method5723();
				}
				this.aClass2_Sub24Array1[arg0] = local43;
			} else {
				this.aBoolean400 = false;
			}
			this.aClass180_27.method4918(local43);
			return this.anIntArrayArray40[local43.anInt4070];
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
	public void method3989() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4624; local3++) {
			this.anIntArrayArray40[local3] = null;
		}
		this.anIntArrayArray40 = null;
		this.aClass2_Sub24Array1 = null;
		this.aClass180_27.method4917();
		this.aClass180_27 = null;
	}
}
