import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class2_Sub1_Sub4_Sub4 extends Class2_Sub1_Sub4 {

	@OriginalMember(owner = "client!sc", name = "ob", descriptor = "Z")
	public boolean aBoolean111 = false;

	@OriginalMember(owner = "client!sc", name = "sb", descriptor = "I")
	private int anInt2520 = 0;

	@OriginalMember(owner = "client!sc", name = "Jb", descriptor = "I")
	private int anInt2533 = 0;

	@OriginalMember(owner = "client!sc", name = "tb", descriptor = "I")
	private final int anInt2521;

	@OriginalMember(owner = "client!sc", name = "yb", descriptor = "I")
	public final int anInt2525;

	@OriginalMember(owner = "client!sc", name = "Cb", descriptor = "I")
	public final int anInt2528;

	@OriginalMember(owner = "client!sc", name = "pb", descriptor = "I")
	public final int anInt2517;

	@OriginalMember(owner = "client!sc", name = "Ab", descriptor = "I")
	public final int anInt2526;

	@OriginalMember(owner = "client!sc", name = "Ib", descriptor = "I")
	public final int anInt2532;

	@OriginalMember(owner = "client!sc", name = "Kb", descriptor = "Lclient!s;")
	private Class2_Sub1_Sub14 aClass2_Sub1_Sub14_1;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(IIIIIII)V")
	public Class2_Sub1_Sub4_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2521 = arg0;
		this.anInt2525 = arg3;
		this.anInt2528 = arg1;
		this.anInt2517 = arg6 + arg5;
		this.anInt2526 = arg4;
		this.anInt2532 = arg2;
		@Pc(36) int local36 = Static99.method1476(this.anInt2521).anInt1677;
		if (local36 == -1) {
			this.aBoolean111 = true;
		} else {
			this.aBoolean111 = false;
			this.aClass2_Sub1_Sub14_1 = Static56.method1045(local36);
		}
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(B)Lclient!fd;")
	@Override
	public Class2_Sub1_Sub4_Sub1 method2031() {
		@Pc(15) Class2_Sub1_Sub11 local15 = Static99.method1476(this.anInt2521);
		@Pc(23) Class2_Sub1_Sub4_Sub1 local23;
		if (this.aBoolean111) {
			local23 = local15.method1152(-1);
		} else {
			local23 = local15.method1152(this.anInt2520);
		}
		return local23 == null ? null : local23;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)V")
	public void method1790(@OriginalArg(0) int arg0) {
		if (this.aBoolean111) {
			return;
		}
		this.anInt2533 += arg0;
		while (this.anInt2533 > this.aClass2_Sub1_Sub14_1.anIntArray288[this.anInt2520]) {
			this.anInt2533 -= this.aClass2_Sub1_Sub14_1.anIntArray288[this.anInt2520];
			this.anInt2520++;
			if (this.aClass2_Sub1_Sub14_1.anIntArray287.length <= this.anInt2520) {
				this.aBoolean111 = true;
				return;
			}
		}
	}
}
