import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class6_Sub3_Sub1_Sub6 extends Class6_Sub3_Sub1 {

	@OriginalMember(owner = "client!q", name = "pb", descriptor = "I")
	private int anInt2529 = 0;

	@OriginalMember(owner = "client!q", name = "ob", descriptor = "I")
	private int anInt2528 = 0;

	@OriginalMember(owner = "client!q", name = "Eb", descriptor = "Z")
	public boolean aBoolean129 = false;

	@OriginalMember(owner = "client!q", name = "wb", descriptor = "I")
	public final int anInt2535;

	@OriginalMember(owner = "client!q", name = "rb", descriptor = "I")
	public final int anInt2531;

	@OriginalMember(owner = "client!q", name = "xb", descriptor = "I")
	public final int anInt2536;

	@OriginalMember(owner = "client!q", name = "yb", descriptor = "I")
	public final int anInt2537;

	@OriginalMember(owner = "client!q", name = "Cb", descriptor = "I")
	private final int anInt2541;

	@OriginalMember(owner = "client!q", name = "ub", descriptor = "I")
	public final int anInt2533;

	@OriginalMember(owner = "client!q", name = "sb", descriptor = "Lclient!gd;")
	private Class6_Sub3_Sub7 aClass6_Sub3_Sub7_3;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(IIIIIII)V")
	public Class6_Sub3_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2535 = arg3;
		this.anInt2531 = arg6 + arg5;
		this.anInt2536 = arg1;
		this.anInt2537 = arg2;
		this.anInt2541 = arg0;
		this.anInt2533 = arg4;
		@Pc(37) int local37 = Static55.method1124(this.anInt2541).anInt2099;
		if (local37 == -1) {
			this.aBoolean129 = true;
		} else {
			this.aBoolean129 = false;
			this.aClass6_Sub3_Sub7_3 = Static30.method721(local37);
		}
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(IB)V")
	public void method1654(@OriginalArg(0) int arg0) {
		if (this.aBoolean129) {
			return;
		}
		this.anInt2528 += arg0;
		while (this.aClass6_Sub3_Sub7_3.anIntArray149[this.anInt2529] < this.anInt2528) {
			this.anInt2528 -= this.aClass6_Sub3_Sub7_3.anIntArray149[this.anInt2529];
			this.anInt2529++;
			if (this.anInt2529 >= this.aClass6_Sub3_Sub7_3.anIntArray152.length) {
				this.aBoolean129 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "g", descriptor = "(I)Lclient!df;")
	@Override
	public Class6_Sub3_Sub1_Sub3 method2062() {
		@Pc(8) Class6_Sub3_Sub12 local8 = Static55.method1124(this.anInt2541);
		@Pc(17) Class6_Sub3_Sub1_Sub3 local17;
		if (this.aBoolean129) {
			local17 = local8.method1417(-1);
		} else {
			local17 = local8.method1417(this.anInt2529);
		}
		return local17 == null ? null : local17;
	}
}
