import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class1_Sub1_Sub8_Sub4 extends Class1_Sub1_Sub8 {

	@OriginalMember(owner = "client!pd", name = "pb", descriptor = "Z")
	public boolean aBoolean111 = false;

	@OriginalMember(owner = "client!pd", name = "Bb", descriptor = "I")
	private int anInt1984 = 0;

	@OriginalMember(owner = "client!pd", name = "Lb", descriptor = "I")
	private int anInt1989 = 0;

	@OriginalMember(owner = "client!pd", name = "ob", descriptor = "I")
	public final int anInt1977;

	@OriginalMember(owner = "client!pd", name = "Kb", descriptor = "I")
	public final int anInt1988;

	@OriginalMember(owner = "client!pd", name = "Fb", descriptor = "I")
	public final int anInt1986;

	@OriginalMember(owner = "client!pd", name = "ub", descriptor = "I")
	public final int anInt1981;

	@OriginalMember(owner = "client!pd", name = "vb", descriptor = "I")
	public final int anInt1982;

	@OriginalMember(owner = "client!pd", name = "wb", descriptor = "I")
	private final int anInt1983;

	@OriginalMember(owner = "client!pd", name = "Db", descriptor = "Lclient!s;")
	private Class1_Sub1_Sub14 aClass1_Sub1_Sub14_1;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIIIIII)V")
	public Class1_Sub1_Sub8_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1977 = arg4;
		this.anInt1988 = arg6 + arg5;
		this.anInt1986 = arg3;
		this.anInt1981 = arg1;
		this.anInt1982 = arg2;
		this.anInt1983 = arg0;
		@Pc(37) int local37 = Static53.method1838(this.anInt1983).anInt1784;
		if (local37 == -1) {
			this.aBoolean111 = true;
		} else {
			this.aBoolean111 = false;
			this.aClass1_Sub1_Sub14_1 = Static30.method574(local37);
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)Lclient!pc;")
	@Override
	protected Class1_Sub1_Sub8_Sub3 method1835() {
		@Pc(15) Class1_Sub1_Sub11 local15 = Static53.method1838(this.anInt1983);
		@Pc(23) Class1_Sub1_Sub8_Sub3 local23;
		if (this.aBoolean111) {
			local23 = local15.method1256(-1);
		} else {
			local23 = local15.method1256(this.anInt1989);
		}
		return local23 == null ? null : local23;
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(II)V")
	public void method1414(@OriginalArg(1) int arg0) {
		if (this.aBoolean111) {
			return;
		}
		this.anInt1984 += arg0;
		while (this.aClass1_Sub1_Sub14_1.anIntArray357[this.anInt1989] < this.anInt1984) {
			this.anInt1984 -= this.aClass1_Sub1_Sub14_1.anIntArray357[this.anInt1989];
			this.anInt1989++;
			if (this.aClass1_Sub1_Sub14_1.anIntArray355.length <= this.anInt1989) {
				this.aBoolean111 = true;
				break;
			}
		}
	}
}
