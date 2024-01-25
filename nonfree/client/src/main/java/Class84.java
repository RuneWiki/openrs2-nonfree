import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class84 {

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
	private int anInt2570 = 0;

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
	private int anInt2574 = -1;

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "Lclient!m;")
	private Class127 aClass127_13 = new Class127();

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "Z")
	public boolean aBoolean144 = false;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
	private final int anInt2567;

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
	private final int anInt2575;

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "[Lclient!gb;")
	private Class3_Sub20[] aClass3_Sub20Array1;

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(III)V")
	public Class84(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2567 = arg0;
		this.anInt2575 = arg1;
		this.aClass3_Sub20Array1 = new Class3_Sub20[this.anInt2575];
		this.anIntArrayArrayArray3 = new int[this.anInt2567][3][arg2];
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)[[I")
	public int[][] method2091(@OriginalArg(1) int arg0) {
		if (this.anInt2567 == this.anInt2575) {
			this.aBoolean144 = this.aClass3_Sub20Array1[arg0] == null;
			this.aClass3_Sub20Array1[arg0] = Static296.aClass3_Sub20_1;
			return this.anIntArrayArrayArray3[arg0];
		} else if (this.anInt2567 == 1) {
			this.aBoolean144 = this.anInt2574 != arg0;
			this.anInt2574 = arg0;
			return this.anIntArrayArrayArray3[0];
		} else {
			@Pc(68) Class3_Sub20 local68 = this.aClass3_Sub20Array1[arg0];
			if (local68 == null) {
				this.aBoolean144 = true;
				if (this.anInt2570 >= this.anInt2567) {
					@Pc(84) Class3_Sub20 local84 = (Class3_Sub20) this.aClass127_13.method3391();
					local68 = new Class3_Sub20(arg0, local84.anInt2136);
					this.aClass3_Sub20Array1[local84.anInt2137] = null;
					local84.method5717();
				} else {
					local68 = new Class3_Sub20(arg0, this.anInt2570);
					this.anInt2570++;
				}
				this.aClass3_Sub20Array1[arg0] = local68;
			} else {
				this.aBoolean144 = false;
			}
			this.aClass127_13.method3403(local68);
			return this.anIntArrayArrayArray3[local68.anInt2136];
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
	public void method2092() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2567; local3++) {
			this.anIntArrayArrayArray3[local3][0] = null;
			this.anIntArrayArrayArray3[local3][1] = null;
			this.anIntArrayArrayArray3[local3][2] = null;
			this.anIntArrayArrayArray3[local3] = null;
		}
		this.anIntArrayArrayArray3 = null;
		this.aClass3_Sub20Array1 = null;
		this.aClass127_13.method3401();
		this.aClass127_13 = null;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)[[[I")
	public int[][][] method2094() {
		if (this.anInt2575 != this.anInt2567) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt2567; local29++) {
			this.aClass3_Sub20Array1[local29] = Static296.aClass3_Sub20_1;
		}
		return this.anIntArrayArrayArray3;
	}
}
