import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class85 {

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
	private int anInt2713 = -1;

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
	private int anInt2717 = 0;

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "Lclient!gj;")
	private Class59 aClass59_22 = new Class59();

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "Z")
	public boolean aBoolean171 = false;

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
	private int anInt2709;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
	private int anInt2711;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "[Lclient!td;")
	private Class1_Sub29[] aClass1_Sub29Array1;

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(III)V")
	public Class85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2709 = arg1;
		this.anInt2711 = arg0;
		this.aClass1_Sub29Array1 = new Class1_Sub29[this.anInt2709];
		this.anIntArrayArrayArray9 = new int[this.anInt2711][3][arg2];
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)[[I")
	public int[][] method2339(@OriginalArg(0) int arg0) {
		if (this.anInt2709 == this.anInt2711) {
			this.aBoolean171 = this.aClass1_Sub29Array1[arg0] == null;
			this.aClass1_Sub29Array1[arg0] = Static310.aClass1_Sub29_1;
			return this.anIntArrayArrayArray9[arg0];
		} else if (this.anInt2711 == 1) {
			this.aBoolean171 = arg0 != this.anInt2713;
			this.anInt2713 = arg0;
			return this.anIntArrayArrayArray9[0];
		} else {
			@Pc(52) Class1_Sub29 local52 = this.aClass1_Sub29Array1[arg0];
			if (local52 == null) {
				this.aBoolean171 = true;
				if (this.anInt2711 <= this.anInt2717) {
					@Pc(77) Class1_Sub29 local77 = (Class1_Sub29) this.aClass59_22.method1708();
					local52 = new Class1_Sub29(arg0, local77.anInt4886);
					this.aClass1_Sub29Array1[local77.anInt4881] = null;
					local77.method4779();
				} else {
					local52 = new Class1_Sub29(arg0, this.anInt2717);
					this.anInt2717++;
				}
				this.aClass1_Sub29Array1[arg0] = local52;
			} else {
				this.aBoolean171 = false;
			}
			this.aClass59_22.method1702(local52);
			return this.anIntArrayArrayArray9[local52.anInt4886];
		}
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
	public void method2340() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2711; local3++) {
			this.anIntArrayArrayArray9[local3][0] = null;
			this.anIntArrayArrayArray9[local3][1] = null;
			this.anIntArrayArrayArray9[local3][2] = null;
			this.anIntArrayArrayArray9[local3] = null;
		}
		this.aClass1_Sub29Array1 = null;
		this.anIntArrayArrayArray9 = null;
		this.aClass59_22.method1703();
		this.aClass59_22 = null;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)[[[I")
	public int[][][] method2341() {
		if (this.anInt2711 != this.anInt2709) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt2711; local21++) {
			this.aClass1_Sub29Array1[local21] = Static310.aClass1_Sub29_1;
		}
		return this.anIntArrayArrayArray9;
	}
}
