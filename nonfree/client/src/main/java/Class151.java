import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class151 {

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
	private int anInt4624 = -1;

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
	private int anInt4627 = 0;

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "Lclient!ar;")
	private Class14 aClass14_22 = new Class14();

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "Z")
	public boolean aBoolean368 = false;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
	private final int anInt4622;

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
	private final int anInt4621;

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "[Lclient!cs;")
	private Class1_Sub9[] aClass1_Sub9Array1;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(III)V")
	public Class151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4622 = arg1;
		this.anInt4621 = arg0;
		this.anIntArrayArrayArray11 = new int[this.anInt4621][3][arg2];
		this.aClass1_Sub9Array1 = new Class1_Sub9[this.anInt4622];
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)[[[I")
	public int[][][] method4014() {
		if (this.anInt4622 != this.anInt4621) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt4621; local26++) {
			this.aClass1_Sub9Array1[local26] = Class102.lb;
		}
		return this.anIntArrayArrayArray11;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)[[I")
	public int[][] method4015(@OriginalArg(1) int arg0) {
		if (this.anInt4622 == this.anInt4621) {
			this.aBoolean368 = this.aClass1_Sub9Array1[arg0] == null;
			this.aClass1_Sub9Array1[arg0] = Class102.lb;
			return this.anIntArrayArrayArray11[arg0];
		} else if (this.anInt4621 == 1) {
			this.aBoolean368 = this.anInt4624 != arg0;
			this.anInt4624 = arg0;
			return this.anIntArrayArrayArray11[0];
		} else {
			@Pc(25) Class1_Sub9 local25 = this.aClass1_Sub9Array1[arg0];
			if (local25 == null) {
				this.aBoolean368 = true;
				if (this.anInt4621 > this.anInt4627) {
					local25 = new Class1_Sub9(arg0, this.anInt4627);
					this.anInt4627++;
				} else {
					@Pc(56) Class1_Sub9 local56 = (Class1_Sub9) this.aClass14_22.method303();
					local25 = new Class1_Sub9(arg0, local56.anInt1194);
					this.aClass1_Sub9Array1[local56.anInt1196] = null;
					local56.method5796();
				}
				this.aClass1_Sub9Array1[arg0] = local25;
			} else {
				this.aBoolean368 = false;
			}
			this.aClass14_22.method306(local25);
			return this.anIntArrayArrayArray11[local25.anInt1194];
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V")
	public void method4017() {
		for (@Pc(14) int local14 = 0; local14 < this.anInt4621; local14++) {
			this.anIntArrayArrayArray11[local14][0] = null;
			this.anIntArrayArrayArray11[local14][1] = null;
			this.anIntArrayArrayArray11[local14][2] = null;
			this.anIntArrayArrayArray11[local14] = null;
		}
		this.aClass1_Sub9Array1 = null;
		this.anIntArrayArrayArray11 = null;
		this.aClass14_22.method305();
		this.aClass14_22 = null;
	}
}
