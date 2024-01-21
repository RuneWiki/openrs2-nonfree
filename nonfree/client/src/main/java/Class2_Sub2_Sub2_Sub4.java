import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class2_Sub2_Sub2_Sub4 extends Class2_Sub2_Sub2 {

	@OriginalMember(owner = "client!ja", name = "Bb", descriptor = "Z")
	public boolean aBoolean49 = false;

	@OriginalMember(owner = "client!ja", name = "Ib", descriptor = "I")
	private int anInt1328 = 0;

	@OriginalMember(owner = "client!ja", name = "sb", descriptor = "I")
	private int anInt1319 = 0;

	@OriginalMember(owner = "client!ja", name = "Kb", descriptor = "I")
	public final int anInt1330;

	@OriginalMember(owner = "client!ja", name = "Jb", descriptor = "I")
	private final int anInt1329;

	@OriginalMember(owner = "client!ja", name = "qb", descriptor = "I")
	public final int anInt1317;

	@OriginalMember(owner = "client!ja", name = "ub", descriptor = "I")
	public final int anInt1320;

	@OriginalMember(owner = "client!ja", name = "ob", descriptor = "I")
	public final int anInt1315;

	@OriginalMember(owner = "client!ja", name = "zb", descriptor = "I")
	public final int anInt1324;

	@OriginalMember(owner = "client!ja", name = "Db", descriptor = "Lclient!ma;")
	private Class2_Sub2_Sub11 aClass2_Sub2_Sub11_3;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(IIIIIII)V")
	public Class2_Sub2_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1330 = arg4;
		this.anInt1329 = arg0;
		this.anInt1317 = arg3;
		this.anInt1320 = arg2;
		this.anInt1315 = arg1;
		this.anInt1324 = arg5 + arg6;
		@Pc(36) int local36 = Static38.method653(this.anInt1329).anInt417;
		if (local36 == -1) {
			this.aBoolean49 = true;
		} else {
			this.aBoolean49 = false;
			this.aClass2_Sub2_Sub11_3 = Static12.method270(local36);
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)Lclient!na;")
	@Override
	public Class2_Sub2_Sub2_Sub5 method1855() {
		@Pc(16) Class2_Sub2_Sub4 local16 = Static38.method653(this.anInt1329);
		@Pc(24) Class2_Sub2_Sub2_Sub5 local24;
		if (this.aBoolean49) {
			local24 = local16.method341(-1);
		} else {
			local24 = local16.method341(this.anInt1328);
		}
		return local24 == null ? null : local24;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)V")
	public void method915(@OriginalArg(0) int arg0) {
		if (this.aBoolean49) {
			return;
		}
		this.anInt1319 += arg0;
		while (this.aClass2_Sub2_Sub11_3.anIntArray191[this.anInt1328] < this.anInt1319) {
			this.anInt1319 -= this.aClass2_Sub2_Sub11_3.anIntArray191[this.anInt1328];
			this.anInt1328++;
			if (this.anInt1328 >= this.aClass2_Sub2_Sub11_3.anIntArray192.length) {
				this.aBoolean49 = true;
				break;
			}
		}
	}
}
