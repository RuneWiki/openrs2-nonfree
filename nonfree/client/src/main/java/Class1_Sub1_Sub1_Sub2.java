import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DAUNRADK")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!DAUNRADK", name = "t", descriptor = "I")
	private int anInt142;

	@OriginalMember(owner = "client!DAUNRADK", name = "u", descriptor = "I")
	private int anInt143;

	@OriginalMember(owner = "client!DAUNRADK", name = "w", descriptor = "I")
	private int anInt144;

	@OriginalMember(owner = "client!DAUNRADK", name = "s", descriptor = "Z")
	public boolean aBoolean24 = false;

	@OriginalMember(owner = "client!DAUNRADK", name = "v", descriptor = "Z")
	private boolean aBoolean25 = false;

	@OriginalMember(owner = "client!DAUNRADK", name = "m", descriptor = "Lclient!UIVLSYQW;")
	private Class38 aClass38_1;

	@OriginalMember(owner = "client!DAUNRADK", name = "o", descriptor = "I")
	public int anInt138;

	@OriginalMember(owner = "client!DAUNRADK", name = "p", descriptor = "I")
	public int anInt139;

	@OriginalMember(owner = "client!DAUNRADK", name = "q", descriptor = "I")
	public int anInt140;

	@OriginalMember(owner = "client!DAUNRADK", name = "r", descriptor = "I")
	public int anInt141;

	@OriginalMember(owner = "client!DAUNRADK", name = "n", descriptor = "I")
	public int anInt137;

	@OriginalMember(owner = "client!DAUNRADK", name = "<init>", descriptor = "(IIIIIBII)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass38_1 = Class38.aClass38Array1[arg1];
			this.anInt138 = arg7;
			this.anInt139 = arg6;
			this.anInt140 = arg4;
			this.anInt141 = arg2;
			@Pc(29) boolean local29 = false;
			this.anInt137 = arg3 + arg0;
			this.aBoolean24 = false;
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("9947, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DAUNRADK", name = "a", descriptor = "(I)Lclient!HEQROJXW;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method547() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub4 local3 = this.aClass38_1.method513();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass38_1.aClass46_2.anIntArray196[this.anInt142];
			@Pc(26) Class1_Sub1_Sub1_Sub4 local26 = new Class1_Sub1_Sub1_Sub4(-167, false, true, Class37.method510(local15), local3);
			if (!this.aBoolean24) {
				local26.method277();
				local26.method278(local15);
				local26.anIntArrayArray12 = null;
				local26.anIntArrayArray11 = null;
			}
			if (this.aClass38_1.anInt680 != 128 || this.aClass38_1.anInt681 != 128) {
				local26.method286(this.aClass38_1.anInt681, this.aClass38_1.anInt680, this.aClass38_1.anInt680);
			}
			if (this.aClass38_1.anInt682 != 0) {
				if (this.aClass38_1.anInt682 == 90) {
					local26.method281();
				}
				if (this.aClass38_1.anInt682 == 180) {
					local26.method281();
					local26.method281();
				}
				if (this.aClass38_1.anInt682 == 270) {
					local26.method281();
					local26.method281();
					local26.method281();
				}
			}
			local26.method287(this.aClass38_1.anInt683 + 64, this.aClass38_1.anInt684 + 850, -30, -50, -30, true);
			return local26;
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("56209, " + 8 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DAUNRADK", name = "a", descriptor = "(II)V")
	public void method40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			this.anInt143 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt143 <= this.aClass38_1.aClass46_2.method542(this.anInt142, (byte) 2)) {
							return;
						}
						this.anInt143 -= this.aClass38_1.aClass46_2.method542(this.anInt142, (byte) 2) + 1;
						this.anInt142++;
					} while (this.anInt142 < this.aClass38_1.aClass46_2.anInt775);
				} while (this.anInt142 >= 0 && this.anInt142 < this.aClass38_1.aClass46_2.anInt775);
				this.anInt142 = 0;
				this.aBoolean24 = true;
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("6072, " + arg0 + ", " + arg1 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}
}
