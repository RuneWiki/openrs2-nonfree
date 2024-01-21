import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OJEALINP")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!OJEALINP", name = "v", descriptor = "I")
	private int anInt552;

	@OriginalMember(owner = "client!OJEALINP", name = "w", descriptor = "I")
	private int anInt553;

	@OriginalMember(owner = "client!OJEALINP", name = "r", descriptor = "Z")
	private boolean aBoolean135 = true;

	@OriginalMember(owner = "client!OJEALINP", name = "s", descriptor = "I")
	private int anInt551 = 9;

	@OriginalMember(owner = "client!OJEALINP", name = "t", descriptor = "Z")
	public boolean aBoolean136 = false;

	@OriginalMember(owner = "client!OJEALINP", name = "u", descriptor = "Lclient!MUDLUUBC;")
	private Class25 aClass25_1;

	@OriginalMember(owner = "client!OJEALINP", name = "m", descriptor = "I")
	public int anInt546;

	@OriginalMember(owner = "client!OJEALINP", name = "n", descriptor = "I")
	public int anInt547;

	@OriginalMember(owner = "client!OJEALINP", name = "o", descriptor = "I")
	public int anInt548;

	@OriginalMember(owner = "client!OJEALINP", name = "p", descriptor = "I")
	public int anInt549;

	@OriginalMember(owner = "client!OJEALINP", name = "q", descriptor = "I")
	public int anInt550;

	@OriginalMember(owner = "client!OJEALINP", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass25_1 = Class25.aClass25Array1[arg4];
			this.anInt546 = arg0;
			this.anInt547 = arg7;
			this.anInt548 = arg6;
			this.anInt549 = arg5;
			this.anInt550 = arg1 + arg3;
			this.aBoolean136 = false;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("97569, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OJEALINP", name = "a", descriptor = "(I)Lclient!ZKARKDQW;")
	@Override
	protected Class1_Sub1_Sub2_Sub6 method529() {
		try {
			@Pc(10) Class1_Sub1_Sub2_Sub6 local10 = this.aClass25_1.method309();
			if (local10 == null) {
				return null;
			}
			@Pc(22) int local22 = this.aClass25_1.aClass22_1.anIntArray76[this.anInt552];
			@Pc(33) Class1_Sub1_Sub2_Sub6 local33 = new Class1_Sub1_Sub2_Sub6(9, true, Class37.method456(local22), false, local10);
			if (!this.aBoolean136) {
				local33.method541();
				local33.method542(local22);
				local33.anIntArrayArray19 = null;
				local33.anIntArrayArray18 = null;
			}
			if (this.aClass25_1.anInt488 != 128 || this.aClass25_1.anInt489 != 128) {
				local33.method550(this.aClass25_1.anInt488, this.aClass25_1.anInt488, this.anInt551, this.aClass25_1.anInt489);
			}
			if (this.aClass25_1.anInt490 != 0) {
				if (this.aClass25_1.anInt490 == 90) {
					local33.method545();
				}
				if (this.aClass25_1.anInt490 == 180) {
					local33.method545();
					local33.method545();
				}
				if (this.aClass25_1.anInt490 == 270) {
					local33.method545();
					local33.method545();
					local33.method545();
				}
			}
			local33.method551(this.aClass25_1.anInt491 + 64, this.aClass25_1.anInt492 + 850, -30, -50, -30, true);
			return local33;
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("45504, " + 4016 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OJEALINP", name = "a", descriptor = "(IZ)V")
	public void method372(@OriginalArg(0) int arg0) {
		try {
			this.anInt553 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt553 <= this.aClass25_1.aClass22_1.method252(this.anInt552)) {
							return;
						}
						this.anInt553 -= this.aClass25_1.aClass22_1.method252(this.anInt552) + 1;
						this.anInt552++;
					} while (this.anInt552 < this.aClass25_1.aClass22_1.anInt433);
				} while (this.anInt552 >= 0 && this.anInt552 < this.aClass25_1.aClass22_1.anInt433);
				this.anInt552 = 0;
				this.aBoolean136 = true;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("99687, " + arg0 + ", " + true + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
