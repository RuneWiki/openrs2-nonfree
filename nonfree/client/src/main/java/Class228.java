import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class228 {

	@OriginalMember(owner = "client!to", name = "d", descriptor = "I")
	private int anInt5662 = 0;

	@OriginalMember(owner = "client!to", name = "c", descriptor = "I")
	private int anInt5661 = -1;

	@OriginalMember(owner = "client!to", name = "k", descriptor = "Lclient!at;")
	private Class17 aClass17_65 = new Class17();

	@OriginalMember(owner = "client!to", name = "o", descriptor = "Z")
	public boolean aBoolean523 = false;

	@OriginalMember(owner = "client!to", name = "e", descriptor = "I")
	private final int anInt5663;

	@OriginalMember(owner = "client!to", name = "m", descriptor = "I")
	private final int anInt5666;

	@OriginalMember(owner = "client!to", name = "g", descriptor = "[Lclient!ic;")
	private Class1_Sub16[] aClass1_Sub16Array1;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(III)V")
	public Class228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5663 = arg0;
		this.anInt5666 = arg1;
		this.aClass1_Sub16Array1 = new Class1_Sub16[this.anInt5666];
		this.anIntArrayArrayArray13 = new int[this.anInt5663][3][arg2];
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II)[[I")
	public int[][] method4874(@OriginalArg(1) int arg0) {
		if (this.anInt5663 == this.anInt5666) {
			this.aBoolean523 = this.aClass1_Sub16Array1[arg0] == null;
			this.aClass1_Sub16Array1[arg0] = Static258.aClass1_Sub16_1;
			return this.anIntArrayArrayArray13[arg0];
		} else if (this.anInt5663 == 1) {
			this.aBoolean523 = this.anInt5661 != arg0;
			this.anInt5661 = arg0;
			return this.anIntArrayArrayArray13[0];
		} else {
			@Pc(31) Class1_Sub16 local31 = this.aClass1_Sub16Array1[arg0];
			if (local31 == null) {
				this.aBoolean523 = true;
				if (this.anInt5663 > this.anInt5662) {
					local31 = new Class1_Sub16(arg0, this.anInt5662);
					this.anInt5662++;
				} else {
					@Pc(66) Class1_Sub16 local66 = (Class1_Sub16) this.aClass17_65.method200();
					local31 = new Class1_Sub16(arg0, local66.anInt2747);
					this.aClass1_Sub16Array1[local66.anInt2748] = null;
					local66.method5577();
				}
				this.aClass1_Sub16Array1[arg0] = local31;
			} else {
				this.aBoolean523 = false;
			}
			this.aClass17_65.method211(local31);
			return this.anIntArrayArrayArray13[local31.anInt2747];
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)[[[I")
	public int[][][] method4875() {
		if (this.anInt5663 != this.anInt5666) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt5663; local27++) {
			this.aClass1_Sub16Array1[local27] = Static258.aClass1_Sub16_1;
		}
		return this.anIntArrayArrayArray13;
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(I)V")
	public void method4877() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5663; local7++) {
			this.anIntArrayArrayArray13[local7][0] = null;
			this.anIntArrayArrayArray13[local7][1] = null;
			this.anIntArrayArrayArray13[local7][2] = null;
			this.anIntArrayArrayArray13[local7] = null;
		}
		this.anIntArrayArrayArray13 = null;
		this.aClass1_Sub16Array1 = null;
		this.aClass17_65.method205();
		this.aClass17_65 = null;
	}
}
