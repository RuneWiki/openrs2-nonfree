import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class1_Sub3_Sub4_Sub7 extends Class1_Sub3_Sub4 {

	@OriginalMember(owner = "client!k", name = "vb", descriptor = "I")
	private int anInt1440 = 0;

	@OriginalMember(owner = "client!k", name = "yb", descriptor = "Z")
	public boolean aBoolean40 = false;

	@OriginalMember(owner = "client!k", name = "Db", descriptor = "I")
	private int anInt1444 = 0;

	@OriginalMember(owner = "client!k", name = "rb", descriptor = "I")
	public final int anInt1438;

	@OriginalMember(owner = "client!k", name = "tb", descriptor = "I")
	public final int anInt1439;

	@OriginalMember(owner = "client!k", name = "pb", descriptor = "I")
	public final int anInt1436;

	@OriginalMember(owner = "client!k", name = "Fb", descriptor = "I")
	public final int anInt1446;

	@OriginalMember(owner = "client!k", name = "zb", descriptor = "I")
	private final int anInt1442;

	@OriginalMember(owner = "client!k", name = "Eb", descriptor = "I")
	public final int anInt1445;

	@OriginalMember(owner = "client!k", name = "sb", descriptor = "Lclient!nc;")
	private Class1_Sub3_Sub11 aClass1_Sub3_Sub11_3;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(IIIIIII)V")
	public Class1_Sub3_Sub4_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1438 = arg2;
		this.anInt1439 = arg1;
		this.anInt1436 = arg4;
		this.anInt1446 = arg6 + arg5;
		this.anInt1442 = arg0;
		this.anInt1445 = arg3;
		@Pc(36) int local36 = Static82.method1448(this.anInt1442).anInt834;
		if (local36 == -1) {
			this.aBoolean40 = true;
		} else {
			this.aBoolean40 = false;
			this.aClass1_Sub3_Sub11_3 = Static77.method1316(local36);
		}
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub4_Sub4 method2148() {
		@Pc(4) Class1_Sub3_Sub7 local4 = Static82.method1448(this.anInt1442);
		@Pc(26) Class1_Sub3_Sub4_Sub4 local26;
		if (this.aBoolean40) {
			local26 = local4.method584(-1);
		} else {
			local26 = local4.method584(this.anInt1440);
		}
		return local26 == null ? null : local26;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI)V")
	public void method1090(@OriginalArg(1) int arg0) {
		if (this.aBoolean40) {
			return;
		}
		this.anInt1444 += arg0;
		while (this.aClass1_Sub3_Sub11_3.anIntArray318[this.anInt1440] < this.anInt1444) {
			this.anInt1444 -= this.aClass1_Sub3_Sub11_3.anIntArray318[this.anInt1440];
			this.anInt1440++;
			if (this.anInt1440 >= this.aClass1_Sub3_Sub11_3.anIntArray315.length) {
				this.aBoolean40 = true;
				return;
			}
		}
	}
}
