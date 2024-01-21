import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class4_Sub4_Sub1_Sub1 extends Class4_Sub4_Sub1 {

	@OriginalMember(owner = "client!be", name = "sb", descriptor = "Z")
	public boolean aBoolean7 = false;

	@OriginalMember(owner = "client!be", name = "qb", descriptor = "I")
	private int anInt238 = 0;

	@OriginalMember(owner = "client!be", name = "Db", descriptor = "I")
	private int anInt244 = 0;

	@OriginalMember(owner = "client!be", name = "ob", descriptor = "I")
	public final int anInt237;

	@OriginalMember(owner = "client!be", name = "W", descriptor = "I")
	public final int anInt227;

	@OriginalMember(owner = "client!be", name = "vb", descriptor = "I")
	private final int anInt241;

	@OriginalMember(owner = "client!be", name = "nb", descriptor = "I")
	public final int anInt236;

	@OriginalMember(owner = "client!be", name = "eb", descriptor = "I")
	public final int anInt230;

	@OriginalMember(owner = "client!be", name = "Bb", descriptor = "I")
	public final int anInt243;

	@OriginalMember(owner = "client!be", name = "Ab", descriptor = "Lclient!t;")
	private Class4_Sub4_Sub14 aClass4_Sub4_Sub14_1;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(IIIIIII)V")
	public Class4_Sub4_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt237 = arg2;
		this.anInt227 = arg6 + arg5;
		this.anInt241 = arg0;
		this.anInt236 = arg4;
		this.anInt230 = arg1;
		this.anInt243 = arg3;
		@Pc(37) int local37 = Static92.method1610(this.anInt241).anInt1231;
		if (local37 == -1) {
			this.aBoolean7 = true;
		} else {
			this.aBoolean7 = false;
			this.aClass4_Sub4_Sub14_1 = Static127.method2102(local37);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)V")
	public void method196(@OriginalArg(0) int arg0) {
		if (this.aBoolean7) {
			return;
		}
		this.anInt244 += arg0;
		while (this.anInt244 > this.aClass4_Sub4_Sub14_1.anIntArray294[this.anInt238]) {
			this.anInt244 -= this.aClass4_Sub4_Sub14_1.anIntArray294[this.anInt238];
			this.anInt238++;
			if (this.aClass4_Sub4_Sub14_1.anIntArray295.length <= this.anInt238) {
				this.aBoolean7 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(B)Lclient!rb;")
	@Override
	public Class4_Sub4_Sub1_Sub6 method1976() {
		@Pc(10) Class4_Sub4_Sub7 local10 = Static92.method1610(this.anInt241);
		@Pc(18) Class4_Sub4_Sub1_Sub6 local18;
		if (this.aBoolean7) {
			local18 = local10.method853(-1);
		} else {
			local18 = local10.method853(this.anInt238);
		}
		return local18 == null ? null : local18;
	}
}
