import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class213 {

	@OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
	private int anInt5640 = -1;

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
	private int anInt5639 = 0;

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "Lclient!gk;")
	private Class112 aClass112_38 = new Class112();

	@OriginalMember(owner = "client!mp", name = "p", descriptor = "Z")
	public boolean aBoolean407 = false;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
	private final int anInt5635;

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
	private final int anInt5642;

	@OriginalMember(owner = "client!mp", name = "n", descriptor = "[Lclient!tca;")
	private Class3_Sub46[] aClass3_Sub46Array1;

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray127;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(III)V")
	public Class213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5635 = arg0;
		this.anInt5642 = arg1;
		this.aClass3_Sub46Array1 = new Class3_Sub46[this.anInt5642];
		this.anIntArrayArray127 = new int[this.anInt5635][arg2];
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IB)[I")
	public int[] method4803(@OriginalArg(0) int arg0) {
		if (this.anInt5642 == this.anInt5635) {
			this.aBoolean407 = this.aClass3_Sub46Array1[arg0] == null;
			this.aClass3_Sub46Array1[arg0] = Static550.aClass3_Sub46_1;
			return this.anIntArrayArray127[arg0];
		} else if (this.anInt5635 == 1) {
			this.aBoolean407 = this.anInt5640 != arg0;
			this.anInt5640 = arg0;
			return this.anIntArrayArray127[0];
		} else {
			@Pc(51) Class3_Sub46 local51 = this.aClass3_Sub46Array1[arg0];
			if (local51 == null) {
				this.aBoolean407 = true;
				if (this.anInt5639 >= this.anInt5635) {
					@Pc(72) Class3_Sub46 local72 = (Class3_Sub46) this.aClass112_38.method3086();
					local51 = new Class3_Sub46(arg0, local72.anInt8139);
					this.aClass3_Sub46Array1[local72.anInt8137] = null;
					local72.method7825();
				} else {
					local51 = new Class3_Sub46(arg0, this.anInt5639);
					this.anInt5639++;
				}
				this.aClass3_Sub46Array1[arg0] = local51;
			} else {
				this.aBoolean407 = false;
			}
			this.aClass112_38.method3091(local51);
			return this.anIntArrayArray127[local51.anInt8139];
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
	public void method4804() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5635; local3++) {
			this.anIntArrayArray127[local3] = null;
		}
		this.aClass3_Sub46Array1 = null;
		this.anIntArrayArray127 = null;
		this.aClass112_38.method3092();
		this.aClass112_38 = null;
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)[[I")
	public int[][] method4805() {
		if (this.anInt5642 != this.anInt5635) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt5635; local22++) {
			this.aClass3_Sub46Array1[local22] = Static550.aClass3_Sub46_1;
		}
		return this.anIntArrayArray127;
	}
}
