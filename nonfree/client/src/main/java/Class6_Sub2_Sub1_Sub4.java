import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PKNSNRDF")
public final class Class6_Sub2_Sub1_Sub4 extends Class6_Sub2_Sub1 {

	@OriginalMember(owner = "client!PKNSNRDF", name = "q", descriptor = "I")
	private int anInt438;

	@OriginalMember(owner = "client!PKNSNRDF", name = "r", descriptor = "I")
	private int anInt439;

	@OriginalMember(owner = "client!PKNSNRDF", name = "p", descriptor = "Z")
	private boolean aBoolean139 = true;

	@OriginalMember(owner = "client!PKNSNRDF", name = "s", descriptor = "Z")
	public boolean aBoolean140 = false;

	@OriginalMember(owner = "client!PKNSNRDF", name = "t", descriptor = "I")
	private int anInt440 = -479;

	@OriginalMember(owner = "client!PKNSNRDF", name = "n", descriptor = "Lclient!PHXJLMVH;")
	private Class31 aClass31_1;

	@OriginalMember(owner = "client!PKNSNRDF", name = "u", descriptor = "I")
	public int anInt441;

	@OriginalMember(owner = "client!PKNSNRDF", name = "v", descriptor = "I")
	public int anInt442;

	@OriginalMember(owner = "client!PKNSNRDF", name = "w", descriptor = "I")
	public int anInt443;

	@OriginalMember(owner = "client!PKNSNRDF", name = "x", descriptor = "I")
	public int anInt444;

	@OriginalMember(owner = "client!PKNSNRDF", name = "o", descriptor = "I")
	public int anInt437;

	@OriginalMember(owner = "client!PKNSNRDF", name = "<init>", descriptor = "(IIIBIIII)V")
	public Class6_Sub2_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass31_1 = Class31.aClass31Array1[arg2];
			this.anInt441 = arg0;
			this.anInt442 = arg6;
			@Pc(28) boolean local28 = false;
			this.anInt443 = arg1;
			this.anInt444 = arg7;
			this.anInt437 = arg4 + arg5;
			this.aBoolean140 = false;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("91502, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKNSNRDF", name = "a", descriptor = "(I)Lclient!JUQSYEMB;")
	@Override
	protected Class6_Sub2_Sub1_Sub3 method529(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) Class6_Sub2_Sub1_Sub3 local7 = this.aClass31_1.method337();
			if (local7 == null) {
				return null;
			}
			@Pc(19) int local19 = this.aClass31_1.aClass21_2.anIntArray108[this.anInt438];
			@Pc(30) Class6_Sub2_Sub1_Sub3 local30 = new Class6_Sub2_Sub1_Sub3(false, true, (byte) 119, local7, Class48.method536(local19));
			if (!this.aBoolean140) {
				local30.method140();
				local30.method141(local19);
				local30.anIntArrayArray5 = null;
				local30.anIntArrayArray4 = null;
			}
			if (this.aClass31_1.anInt430 != 128 || this.aClass31_1.anInt431 != 128) {
				local30.method149(this.aClass31_1.anInt430, this.aClass31_1.anInt431, this.aClass31_1.anInt430, this.anInt440);
			}
			if (this.aClass31_1.anInt432 != 0) {
				if (this.aClass31_1.anInt432 == 90) {
					local30.method144();
				}
				if (this.aClass31_1.anInt432 == 180) {
					local30.method144();
					local30.method144();
				}
				if (this.aClass31_1.anInt432 == 270) {
					local30.method144();
					local30.method144();
					local30.method144();
				}
			}
			local30.method150(this.aClass31_1.anInt433 + 64, this.aClass31_1.anInt434 + 850, -30, -50, -30, true);
			return local30;
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("26004, " + arg0 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKNSNRDF", name = "a", descriptor = "(II)V")
	public void method342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 0) {
				this.aBoolean139 = !this.aBoolean139;
			}
			this.anInt439 += arg1;
			while (true) {
				do {
					do {
						if (this.anInt439 <= this.aClass31_1.aClass21_2.method176(this.anInt438, 642)) {
							return;
						}
						this.anInt439 -= this.aClass31_1.aClass21_2.method176(this.anInt438, 642) + 1;
						this.anInt438++;
					} while (this.anInt438 < this.aClass31_1.aClass21_2.anInt344);
				} while (this.anInt438 >= 0 && this.anInt438 < this.aClass31_1.aClass21_2.anInt344);
				this.anInt438 = 0;
				this.aBoolean140 = true;
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("73906, " + arg0 + ", " + arg1 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}
}
