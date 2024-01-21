import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	private int anInt39;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
	private int anInt40;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "Z")
	private boolean aBoolean13 = false;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "Z")
	public boolean aBoolean14 = false;

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "Lclient!hc;")
	private Class15 aClass15_2;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
	public int anInt35;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
	public int anInt36;

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
	public int anInt37;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
	public int anInt38;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
	public int anInt34;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IZIIIIII)V")
	public Class1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass15_2 = Class15.aClass15Array1[arg5];
			this.anInt35 = arg7;
			this.anInt36 = arg3;
			this.anInt37 = arg0;
			this.anInt38 = arg2;
			this.anInt34 = arg6 + arg4;
			this.aBoolean14 = false;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("44979, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)V")
	public void method23(@OriginalArg(0) int arg0) {
		try {
			this.anInt40 += arg0;
			while (this.anInt40 > this.aClass15_2.aClass13_1.anIntArray132[this.anInt39]) {
				this.anInt40 -= this.aClass15_2.aClass13_1.anIntArray132[this.anInt39] + 1;
				this.anInt39++;
				if (this.anInt39 >= this.aClass15_2.aClass13_1.anInt332) {
					this.anInt39 = 0;
					this.aBoolean14 = true;
				}
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("90370, " + arg0 + ", " + false + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub1 method513() {
		try {
			@Pc(12) Class1_Sub3_Sub1 local12 = this.aClass15_2.method292();
			@Pc(28) Class1_Sub3_Sub1 local28 = new Class1_Sub3_Sub1(-428, true, local12, true, false, !this.aClass15_2.aBoolean102);
			if (!this.aBoolean14) {
				local28.method206();
				local28.method207(this.aClass15_2.aClass13_1.anIntArray130[this.anInt39]);
				local28.anIntArrayArray8 = null;
				local28.anIntArrayArray7 = null;
			}
			local28.method216(64, 850, -30, -50, -30, true);
			return local28;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("86513, " + ", " + local61.toString());
			throw new RuntimeException();
		}
	}
}
