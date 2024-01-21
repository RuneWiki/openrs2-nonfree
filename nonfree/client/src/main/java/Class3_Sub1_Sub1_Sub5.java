import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class3_Sub1_Sub1_Sub5 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!ud", name = "vb", descriptor = "Z")
	public boolean aBoolean146 = false;

	@OriginalMember(owner = "client!ud", name = "Mb", descriptor = "I")
	private int anInt2738 = 0;

	@OriginalMember(owner = "client!ud", name = "Pb", descriptor = "I")
	private int anInt2739 = 0;

	@OriginalMember(owner = "client!ud", name = "eb", descriptor = "I")
	public final int anInt2724;

	@OriginalMember(owner = "client!ud", name = "gb", descriptor = "I")
	public final int anInt2726;

	@OriginalMember(owner = "client!ud", name = "db", descriptor = "I")
	public final int anInt2723;

	@OriginalMember(owner = "client!ud", name = "Kb", descriptor = "I")
	public final int anInt2737;

	@OriginalMember(owner = "client!ud", name = "zb", descriptor = "I")
	public final int anInt2735;

	@OriginalMember(owner = "client!ud", name = "cb", descriptor = "I")
	private final int anInt2722;

	@OriginalMember(owner = "client!ud", name = "kb", descriptor = "Lclient!ne;")
	private Class3_Sub1_Sub11 aClass3_Sub1_Sub11_3;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(IIIIIII)V")
	public Class3_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2724 = arg1;
		this.anInt2726 = arg2;
		this.anInt2723 = arg3;
		this.anInt2737 = arg4;
		this.anInt2735 = arg5 + arg6;
		this.anInt2722 = arg0;
		@Pc(36) int local36 = Static61.method1063(this.anInt2722).anInt2934;
		if (local36 == -1) {
			this.aBoolean146 = true;
		} else {
			this.aBoolean146 = false;
			this.aClass3_Sub1_Sub11_3 = Static31.method778(local36);
		}
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)V")
	public void method1774(@OriginalArg(0) int arg0) {
		if (this.aBoolean146) {
			return;
		}
		this.anInt2738 += arg0;
		while (this.anInt2738 > this.aClass3_Sub1_Sub11_3.anIntArray219[this.anInt2739]) {
			this.anInt2738 -= this.aClass3_Sub1_Sub11_3.anIntArray219[this.anInt2739];
			this.anInt2739++;
			if (this.anInt2739 >= this.aClass3_Sub1_Sub11_3.anIntArray221.length) {
				this.aBoolean146 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(Z)Lclient!v;")
	@Override
	public Class3_Sub1_Sub1_Sub6 method1792() {
		@Pc(4) Class3_Sub1_Sub18 local4 = Static61.method1063(this.anInt2722);
		@Pc(23) Class3_Sub1_Sub1_Sub6 local23;
		if (this.aBoolean146) {
			local23 = local4.method1935(-1);
		} else {
			local23 = local4.method1935(this.anInt2739);
		}
		return local23 == null ? null : local23;
	}
}
