import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class2_Sub1_Sub3_Sub1 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
	private int anInt116 = 0;

	@OriginalMember(owner = "client!ad", name = "cb", descriptor = "I")
	private int anInt124 = 0;

	@OriginalMember(owner = "client!ad", name = "hb", descriptor = "Z")
	public boolean aBoolean6 = false;

	@OriginalMember(owner = "client!ad", name = "kb", descriptor = "I")
	public final int anInt128;

	@OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
	public final int anInt115;

	@OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
	public final int anInt118;

	@OriginalMember(owner = "client!ad", name = "ib", descriptor = "I")
	public final int anInt127;

	@OriginalMember(owner = "client!ad", name = "Z", descriptor = "I")
	private final int anInt121;

	@OriginalMember(owner = "client!ad", name = "ab", descriptor = "I")
	public final int anInt122;

	@OriginalMember(owner = "client!ad", name = "eb", descriptor = "Lclient!ke;")
	private Class2_Sub1_Sub9 aClass2_Sub1_Sub9_1;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(IIIIIII)V")
	public Class2_Sub1_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt128 = arg1;
		this.anInt115 = arg6 + arg5;
		this.anInt118 = arg3;
		this.anInt127 = arg4;
		this.anInt121 = arg0;
		this.anInt122 = arg2;
		@Pc(37) int local37 = Static76.method1260(this.anInt121).anInt783;
		if (local37 == -1) {
			this.aBoolean6 = true;
		} else {
			this.aBoolean6 = false;
			this.aClass2_Sub1_Sub9_1 = Static19.method325(local37);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V")
	public void method85(@OriginalArg(1) int arg0) {
		if (this.aBoolean6) {
			return;
		}
		this.anInt116 += arg0;
		while (this.aClass2_Sub1_Sub9_1.anIntArray217[this.anInt124] < this.anInt116) {
			this.anInt116 -= this.aClass2_Sub1_Sub9_1.anIntArray217[this.anInt124];
			this.anInt124++;
			if (this.anInt124 >= this.aClass2_Sub1_Sub9_1.anIntArray214.length) {
				this.aBoolean6 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)Lclient!bh;")
	@Override
	public Class2_Sub1_Sub3_Sub3 method2544() {
		@Pc(8) Class2_Sub1_Sub5 local8 = Static76.method1260(this.anInt121);
		@Pc(21) Class2_Sub1_Sub3_Sub3 local21;
		if (this.aBoolean6) {
			local21 = local8.method612(-1);
		} else {
			local21 = local8.method612(this.anInt124);
		}
		return local21 == null ? null : local21;
	}
}
