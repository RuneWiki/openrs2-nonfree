import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class190 {

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
	private int anInt5594 = 0;

	@OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
	private int anInt5601 = -1;

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "Lclient!jo;")
	private Class96 aClass96_29 = new Class96();

	@OriginalMember(owner = "client!wj", name = "r", descriptor = "Z")
	public boolean aBoolean527 = false;

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
	private int anInt5593;

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
	private int anInt5592;

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "[Lclient!pn;")
	private Class1_Sub25[] aClass1_Sub25Array1;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(III)V")
	public Class190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5593 = arg0;
		this.anIntArrayArray43 = new int[this.anInt5593][arg2];
		this.anInt5592 = arg1;
		this.aClass1_Sub25Array1 = new Class1_Sub25[this.anInt5592];
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)[I")
	public int[] method4648(@OriginalArg(0) int arg0) {
		if (this.anInt5592 == this.anInt5593) {
			this.aBoolean527 = this.aClass1_Sub25Array1[arg0] == null;
			this.aClass1_Sub25Array1[arg0] = Static24.aClass1_Sub25_1;
			return this.anIntArrayArray43[arg0];
		} else if (this.anInt5593 == 1) {
			this.aBoolean527 = this.anInt5601 != arg0;
			this.anInt5601 = arg0;
			return this.anIntArrayArray43[0];
		} else {
			@Pc(45) Class1_Sub25 local45 = this.aClass1_Sub25Array1[arg0];
			if (local45 == null) {
				this.aBoolean527 = true;
				if (this.anInt5594 < this.anInt5593) {
					local45 = new Class1_Sub25(arg0, this.anInt5594);
					this.anInt5594++;
				} else {
					@Pc(86) Class1_Sub25 local86 = (Class1_Sub25) this.aClass96_29.method2345();
					local45 = new Class1_Sub25(arg0, local86.anInt4101);
					this.aClass1_Sub25Array1[local86.anInt4102] = null;
					local86.method4573();
				}
				this.aClass1_Sub25Array1[arg0] = local45;
			} else {
				this.aBoolean527 = false;
			}
			this.aClass96_29.method2337(local45);
			return this.anIntArrayArray43[local45.anInt4101];
		}
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)[[I")
	public int[][] method4649() {
		if (this.anInt5593 != this.anInt5592) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt5593; local25++) {
			this.aClass1_Sub25Array1[local25] = Static24.aClass1_Sub25_1;
		}
		return this.anIntArrayArray43;
	}

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V")
	public void method4651() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5593; local3++) {
			this.anIntArrayArray43[local3] = null;
		}
		this.anIntArrayArray43 = null;
		this.aClass1_Sub25Array1 = null;
		this.aClass96_29.method2341();
		this.aClass96_29 = null;
	}
}
