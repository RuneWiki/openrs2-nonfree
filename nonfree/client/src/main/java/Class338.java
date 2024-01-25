import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class338 {

	@OriginalMember(owner = "client!so", name = "k", descriptor = "I")
	private int anInt9677 = -1;

	@OriginalMember(owner = "client!so", name = "l", descriptor = "I")
	private int anInt9678 = 0;

	@OriginalMember(owner = "client!so", name = "f", descriptor = "Lclient!ow;")
	private Class271 aClass271_60 = new Class271();

	@OriginalMember(owner = "client!so", name = "r", descriptor = "Z")
	public boolean aBoolean712 = false;

	@OriginalMember(owner = "client!so", name = "b", descriptor = "I")
	private final int anInt9671;

	@OriginalMember(owner = "client!so", name = "c", descriptor = "I")
	private final int anInt9672;

	@OriginalMember(owner = "client!so", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!so", name = "j", descriptor = "[Lclient!tl;")
	private Class2_Sub48[] aClass2_Sub48Array1;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(III)V")
	public Class338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9671 = arg1;
		this.anInt9672 = arg0;
		this.anIntArrayArray49 = new int[this.anInt9672][arg2];
		this.aClass2_Sub48Array1 = new Class2_Sub48[this.anInt9671];
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(B)[[I")
	public int[][] method8467() {
		if (this.anInt9672 != this.anInt9671) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(19) int local19 = 0; local19 < this.anInt9672; local19++) {
			this.aClass2_Sub48Array1[local19] = Static125.aClass2_Sub48_1;
		}
		return this.anIntArrayArray49;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BI)[I")
	public int[] method8470(@OriginalArg(1) int arg0) {
		if (this.anInt9671 == this.anInt9672) {
			this.aBoolean712 = this.aClass2_Sub48Array1[arg0] == null;
			this.aClass2_Sub48Array1[arg0] = Static125.aClass2_Sub48_1;
			return this.anIntArrayArray49[arg0];
		} else if (this.anInt9672 == 1) {
			this.aBoolean712 = arg0 != this.anInt9677;
			this.anInt9677 = arg0;
			return this.anIntArrayArray49[0];
		} else {
			@Pc(31) Class2_Sub48 local31 = this.aClass2_Sub48Array1[arg0];
			if (local31 == null) {
				this.aBoolean712 = true;
				if (this.anInt9672 > this.anInt9678) {
					local31 = new Class2_Sub48(arg0, this.anInt9678);
					this.anInt9678++;
				} else {
					@Pc(71) Class2_Sub48 local71 = (Class2_Sub48) this.aClass271_60.method7170();
					local31 = new Class2_Sub48(arg0, local71.anInt10052);
					this.aClass2_Sub48Array1[local71.anInt10050] = null;
					local71.method9825();
				}
				this.aClass2_Sub48Array1[arg0] = local31;
			} else {
				this.aBoolean712 = false;
			}
			this.aClass271_60.method7171(local31);
			return this.anIntArrayArray49[local31.anInt10052];
		}
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(B)V")
	public void method8471() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9672; local3++) {
			this.anIntArrayArray49[local3] = null;
		}
		this.aClass2_Sub48Array1 = null;
		this.anIntArrayArray49 = null;
		this.aClass271_60.method7181();
		this.aClass271_60 = null;
	}
}
