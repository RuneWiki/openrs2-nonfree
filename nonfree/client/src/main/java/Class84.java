import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!efa")
public final class Class84 {

	@OriginalMember(owner = "client!efa", name = "e", descriptor = "I")
	private int anInt2651 = -1;

	@OriginalMember(owner = "client!efa", name = "j", descriptor = "I")
	private int anInt2654 = 0;

	@OriginalMember(owner = "client!efa", name = "d", descriptor = "Lclient!oe;")
	private Class244 aClass244_20 = new Class244();

	@OriginalMember(owner = "client!efa", name = "p", descriptor = "Z")
	public boolean aBoolean194 = false;

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "I")
	private final int anInt2648;

	@OriginalMember(owner = "client!efa", name = "f", descriptor = "I")
	private final int anInt2652;

	@OriginalMember(owner = "client!efa", name = "n", descriptor = "[Lclient!ada;")
	private Class4_Sub3[] aClass4_Sub3Array1;

	@OriginalMember(owner = "client!efa", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(III)V")
	public Class84(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2648 = arg1;
		this.anInt2652 = arg0;
		this.aClass4_Sub3Array1 = new Class4_Sub3[this.anInt2648];
		this.anIntArrayArrayArray1 = new int[this.anInt2652][3][arg2];
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)[[[I")
	public int[][][] method2455() {
		if (this.anInt2648 != this.anInt2652) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt2652; local17++) {
			this.aClass4_Sub3Array1[local17] = Static21.aClass4_Sub3_1;
		}
		return this.anIntArrayArrayArray1;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)V")
	public void method2456() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2652; local3++) {
			this.anIntArrayArrayArray1[local3][0] = null;
			this.anIntArrayArrayArray1[local3][1] = null;
			this.anIntArrayArrayArray1[local3][2] = null;
			this.anIntArrayArrayArray1[local3] = null;
		}
		this.aClass4_Sub3Array1 = null;
		this.anIntArrayArrayArray1 = null;
		this.aClass244_20.method5962();
		this.aClass244_20 = null;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(II)[[I")
	public int[][] method2457(@OriginalArg(0) int arg0) {
		if (this.anInt2648 == this.anInt2652) {
			this.aBoolean194 = this.aClass4_Sub3Array1[arg0] == null;
			this.aClass4_Sub3Array1[arg0] = Static21.aClass4_Sub3_1;
			return this.anIntArrayArrayArray1[arg0];
		} else if (this.anInt2652 == 1) {
			this.aBoolean194 = arg0 != this.anInt2651;
			this.anInt2651 = arg0;
			return this.anIntArrayArrayArray1[0];
		} else {
			@Pc(66) Class4_Sub3 local66 = this.aClass4_Sub3Array1[arg0];
			if (local66 == null) {
				this.aBoolean194 = true;
				if (this.anInt2652 <= this.anInt2654) {
					@Pc(89) Class4_Sub3 local89 = (Class4_Sub3) this.aClass244_20.method5971();
					local66 = new Class4_Sub3(arg0, local89.anInt181);
					this.aClass4_Sub3Array1[local89.anInt180] = null;
					local89.method8379();
				} else {
					local66 = new Class4_Sub3(arg0, this.anInt2654);
					this.anInt2654++;
				}
				this.aClass4_Sub3Array1[arg0] = local66;
			} else {
				this.aBoolean194 = false;
			}
			this.aClass244_20.method5964(local66);
			return this.anIntArrayArrayArray1[local66.anInt181];
		}
	}
}
