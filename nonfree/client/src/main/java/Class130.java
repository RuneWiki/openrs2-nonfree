import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class130 {

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
	private int anInt4005 = 0;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
	private int anInt3998 = -1;

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "Lclient!pu;")
	private Class203 aClass203_33 = new Class203();

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "Z")
	public boolean aBoolean246 = false;

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
	private final int anInt4000;

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
	private final int anInt4003;

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "[Lclient!ps;")
	private Class1_Sub36[] aClass1_Sub36Array1;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(III)V")
	public Class130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4000 = arg0;
		this.anInt4003 = arg1;
		this.anIntArrayArrayArray12 = new int[this.anInt4000][3][arg2];
		this.aClass1_Sub36Array1 = new Class1_Sub36[this.anInt4003];
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(Z)[[[I")
	public int[][][] method3106() {
		if (this.anInt4003 != this.anInt4000) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt4000; local26++) {
			this.aClass1_Sub36Array1[local26] = Static262.aClass1_Sub36_3;
		}
		return this.anIntArrayArrayArray12;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
	public void method3107() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4000; local7++) {
			this.anIntArrayArrayArray12[local7][0] = null;
			this.anIntArrayArrayArray12[local7][1] = null;
			this.anIntArrayArrayArray12[local7][2] = null;
			this.anIntArrayArrayArray12[local7] = null;
		}
		this.anIntArrayArrayArray12 = null;
		this.aClass1_Sub36Array1 = null;
		this.aClass203_33.method4553();
		this.aClass203_33 = null;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)[[I")
	public int[][] method3108(@OriginalArg(0) int arg0) {
		if (this.anInt4003 == this.anInt4000) {
			this.aBoolean246 = this.aClass1_Sub36Array1[arg0] == null;
			this.aClass1_Sub36Array1[arg0] = Static262.aClass1_Sub36_3;
			return this.anIntArrayArrayArray12[arg0];
		} else if (this.anInt4000 == 1) {
			this.aBoolean246 = this.anInt3998 != arg0;
			this.anInt3998 = arg0;
			return this.anIntArrayArrayArray12[0];
		} else {
			@Pc(66) Class1_Sub36 local66 = this.aClass1_Sub36Array1[arg0];
			if (local66 == null) {
				this.aBoolean246 = true;
				if (this.anInt4000 > this.anInt4005) {
					local66 = new Class1_Sub36(arg0, this.anInt4005);
					this.anInt4005++;
				} else {
					@Pc(101) Class1_Sub36 local101 = (Class1_Sub36) this.aClass203_33.method4556();
					local66 = new Class1_Sub36(arg0, local101.anInt5936);
					this.aClass1_Sub36Array1[local101.anInt5941] = null;
					local101.method6178();
				}
				this.aClass1_Sub36Array1[arg0] = local66;
			} else {
				this.aBoolean246 = false;
			}
			this.aClass203_33.method4555(local66);
			return this.anIntArrayArrayArray12[local66.anInt5936];
		}
	}
}
