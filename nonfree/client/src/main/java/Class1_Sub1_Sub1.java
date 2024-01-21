import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
	private int anInt29;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
	private int anInt30;

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "Z")
	public boolean aBoolean4 = false;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Lclient!gc;")
	private Class13 aClass13_1;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
	public int anInt25;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
	public int anInt26;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
	public int anInt27;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
	public int anInt28;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
	public int anInt24;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
	private int anInt23;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass13_1 = Class13.aClass13Array1[arg3];
		this.anInt25 = arg4;
		this.anInt26 = arg5;
		this.anInt27 = arg6;
		this.anInt28 = arg0;
		this.anInt24 = arg7 + arg2;
		this.aBoolean4 = false;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
	public void method19(@OriginalArg(0) int arg0) {
		this.anInt30 += arg0;
		while (this.anInt30 > this.aClass13_1.aClass11_1.anIntArray126[this.anInt29]) {
			this.anInt30 -= this.aClass13_1.aClass11_1.anIntArray126[this.anInt29] + 1;
			this.anInt29++;
			if (this.anInt29 >= this.aClass13_1.aClass11_1.anInt294) {
				this.anInt29 = 0;
				this.aBoolean4 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Lclient!db;")
	@Override
	public Class1_Sub3_Sub1 method479() {
		@Pc(9) Class1_Sub3_Sub1 local9 = this.aClass13_1.method245();
		@Pc(25) Class1_Sub3_Sub1 local25 = new Class1_Sub3_Sub1(true, !this.aClass13_1.aBoolean83, local9, 440, true, false);
		if (!this.aBoolean4) {
			local25.method159();
			local25.method160(this.aClass13_1.aClass11_1.anIntArray124[this.anInt29]);
			local25.anIntArrayArray8 = null;
			local25.anIntArrayArray7 = null;
		}
		local25.method169(64, 850, -30, -50, -30, true);
		return local25;
	}
}
