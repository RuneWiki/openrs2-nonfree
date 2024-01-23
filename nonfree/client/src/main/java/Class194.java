import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class194 {

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
	private int anInt6272 = 0;

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
	private int anInt6278 = -1;

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "Lclient!ci;")
	private Class26 aClass26_59 = new Class26();

	@OriginalMember(owner = "client!wk", name = "s", descriptor = "Z")
	public boolean aBoolean411 = false;

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
	private int anInt6276;

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "[Lclient!sd;")
	private Class1_Sub24[] aClass1_Sub24Array1;

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
	private int anInt6277;

	@OriginalMember(owner = "client!wk", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray79;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(III)V")
	public Class194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6276 = arg1;
		this.aClass1_Sub24Array1 = new Class1_Sub24[this.anInt6276];
		this.anInt6277 = arg0;
		this.anIntArrayArray79 = new int[this.anInt6277][arg2];
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V")
	public void method4737() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6277; local3++) {
			this.anIntArrayArray79[local3] = null;
		}
		this.aClass1_Sub24Array1 = null;
		this.anIntArrayArray79 = null;
		this.aClass26_59.method667();
		this.aClass26_59 = null;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)[I")
	public int[] method4738(@OriginalArg(0) int arg0) {
		if (this.anInt6277 == this.anInt6276) {
			this.aBoolean411 = this.aClass1_Sub24Array1[arg0] == null;
			this.aClass1_Sub24Array1[arg0] = Static99.aClass1_Sub24_1;
			return this.anIntArrayArray79[arg0];
		} else if (this.anInt6277 == 1) {
			this.aBoolean411 = this.anInt6278 != arg0;
			this.anInt6278 = arg0;
			return this.anIntArrayArray79[0];
		} else {
			@Pc(43) Class1_Sub24 local43 = this.aClass1_Sub24Array1[arg0];
			if (local43 == null) {
				this.aBoolean411 = true;
				if (this.anInt6272 < this.anInt6277) {
					local43 = new Class1_Sub24(arg0, this.anInt6272);
					this.anInt6272++;
				} else {
					@Pc(75) Class1_Sub24 local75 = (Class1_Sub24) this.aClass26_59.method677();
					local43 = new Class1_Sub24(arg0, local75.anInt5116);
					this.aClass1_Sub24Array1[local75.anInt5115] = null;
					local75.method4767();
				}
				this.aClass1_Sub24Array1[arg0] = local43;
			} else {
				this.aBoolean411 = false;
			}
			this.aClass26_59.method665(local43);
			return this.anIntArrayArray79[local43.anInt5116];
		}
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)[[I")
	public int[][] method4740() {
		if (this.anInt6276 != this.anInt6277) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(24) int local24 = 0; local24 < this.anInt6277; local24++) {
			this.aClass1_Sub24Array1[local24] = Static99.aClass1_Sub24_1;
		}
		return this.anIntArrayArray79;
	}
}
