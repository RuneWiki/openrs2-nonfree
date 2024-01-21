import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AEQBPGLT")
public final class Class1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!AEQBPGLT", name = "m", descriptor = "I")
	private int anInt11;

	@OriginalMember(owner = "client!AEQBPGLT", name = "n", descriptor = "I")
	private int anInt12;

	@OriginalMember(owner = "client!AEQBPGLT", name = "w", descriptor = "I")
	private int anInt19;

	@OriginalMember(owner = "client!AEQBPGLT", name = "t", descriptor = "Z")
	public boolean aBoolean7 = false;

	@OriginalMember(owner = "client!AEQBPGLT", name = "v", descriptor = "I")
	private int anInt18 = 1;

	@OriginalMember(owner = "client!AEQBPGLT", name = "u", descriptor = "Lclient!XYSJIYWF;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!AEQBPGLT", name = "o", descriptor = "I")
	public int anInt13;

	@OriginalMember(owner = "client!AEQBPGLT", name = "p", descriptor = "I")
	public int anInt14;

	@OriginalMember(owner = "client!AEQBPGLT", name = "q", descriptor = "I")
	public int anInt15;

	@OriginalMember(owner = "client!AEQBPGLT", name = "r", descriptor = "I")
	public int anInt16;

	@OriginalMember(owner = "client!AEQBPGLT", name = "s", descriptor = "I")
	public int anInt17;

	@OriginalMember(owner = "client!AEQBPGLT", name = "<init>", descriptor = "(IBIIIIII)V")
	public Class1_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass46_1 = Class46.aClass46Array1[arg3];
			this.anInt13 = arg2;
			this.anInt14 = arg0;
			this.anInt15 = arg6;
			this.anInt16 = arg7;
			this.anInt17 = arg5 + arg4;
			this.aBoolean7 = false;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("95620, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AEQBPGLT", name = "a", descriptor = "(I)Lclient!OJGAHFXC;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method504(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass46_1.method554();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass46_1.aClass7_2.anIntArray27[this.anInt11];
			@Pc(26) Class1_Sub1_Sub1_Sub5 local26 = new Class1_Sub1_Sub1_Sub5(Class23.method343(local15, (byte) 1), false, true, -900, local3);
			if (!this.aBoolean7) {
				local26.method386(this.anInt19);
				local26.method387(local15);
				local26.anIntArrayArray11 = null;
				local26.anIntArrayArray10 = null;
			}
			if (this.aClass46_1.anInt818 != 128 || this.aClass46_1.anInt819 != 128) {
				local26.method395(this.aClass46_1.anInt818, this.anInt18, this.aClass46_1.anInt819, this.aClass46_1.anInt818);
			}
			if (this.aClass46_1.anInt820 != 0) {
				if (this.aClass46_1.anInt820 == 90) {
					local26.method390();
				}
				if (this.aClass46_1.anInt820 == 180) {
					local26.method390();
					local26.method390();
				}
				if (this.aClass46_1.anInt820 == 270) {
					local26.method390();
					local26.method390();
					local26.method390();
				}
			}
			local26.method396(this.aClass46_1.anInt821 + 64, this.aClass46_1.anInt822 + 850, -30, -50, -30, true);
			@Pc(123) boolean local123 = false;
			return local26;
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("72982, " + arg0 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AEQBPGLT", name = "a", descriptor = "(II)V")
	public void method12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt12 += arg1;
			@Pc(9) boolean local9 = false;
			while (true) {
				do {
					do {
						if (this.anInt12 <= this.aClass46_1.aClass7_2.method103((byte) 6, this.anInt11)) {
							return;
						}
						this.anInt12 -= this.aClass46_1.aClass7_2.method103((byte) 6, this.anInt11);
						this.anInt11++;
					} while (this.anInt11 < this.aClass46_1.aClass7_2.anInt237);
				} while (this.anInt11 >= 0 && this.anInt11 < this.aClass46_1.aClass7_2.anInt237);
				this.anInt11 = 0;
				this.aBoolean7 = true;
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("15247, " + arg0 + ", " + arg1 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}
}
