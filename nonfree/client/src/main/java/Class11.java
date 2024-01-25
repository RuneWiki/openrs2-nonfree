import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class11 {

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "Lclient!gja;")
	private Class19_Sub1_Sub3_Sub2_Sub1 aClass19_Sub1_Sub3_Sub2_Sub1_1 = null;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "Lclient!oba;")
	private Class19_Sub1_Sub3_Sub2_Sub2 aClass19_Sub1_Sub3_Sub2_Sub2_1 = null;

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "Z")
	public boolean aBoolean10 = false;

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
	private final int anInt298;

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
	public final int anInt296;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lclient!rba;I)V")
	public Class11(@OriginalArg(0) Class3_Sub28 arg0, @OriginalArg(1) int arg1) {
		this.anInt298 = arg1;
		@Pc(19) int local19 = arg0.method5322(-65);
		if (local19 == 0) {
			this.anInt296 = arg0.method5275();
		} else if (local19 == 1) {
			this.anInt296 = -1;
		} else {
			this.anInt296 = -1;
		}
		arg0.method5295();
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
	public void method290() {
		this.aClass19_Sub1_Sub3_Sub2_Sub1_1 = null;
		this.aBoolean10 = false;
		this.aClass19_Sub1_Sub3_Sub2_Sub2_1 = null;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBIII)V")
	public void method293(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!this.aBoolean10) {
			this.aBoolean10 = true;
			if (this.anInt296 >= 0) {
				this.aClass19_Sub1_Sub3_Sub2_Sub1_1 = new Class19_Sub1_Sub3_Sub2_Sub1(25);
				this.aClass19_Sub1_Sub3_Sub2_Sub1_1.anInt7815 = Static269.anInt4883;
				this.aClass19_Sub1_Sub3_Sub2_Sub1_1.anInt7796 = this.anInt298;
				this.aClass19_Sub1_Sub3_Sub2_Sub1_1.method3434(Static631.aClass85_2.method2214(this.anInt296));
				this.aClass19_Sub1_Sub3_Sub2_Sub1_1.method6599(this.aClass19_Sub1_Sub3_Sub2_Sub1_1.aClass18_1.anInt437);
				this.aClass19_Sub1_Sub3_Sub2_Sub1_1.anInt7774 = Static246.anInt4581++;
				this.aClass19_Sub1_Sub3_Sub2_Sub1_1.anInt7818 = this.aClass19_Sub1_Sub3_Sub2_Sub1_1.aClass18_1.anInt464 << 3;
			} else {
				this.aClass19_Sub1_Sub3_Sub2_Sub2_1 = new Class19_Sub1_Sub3_Sub2_Sub2(25);
				this.aClass19_Sub1_Sub3_Sub2_Sub2_1.method6615((byte) -116, Static247.aClass3_Sub28_8);
				this.aClass19_Sub1_Sub3_Sub2_Sub2_1.anInt7796 = this.anInt298;
				this.aClass19_Sub1_Sub3_Sub2_Sub2_1.anInt7774 = Static246.anInt4581++;
				this.aClass19_Sub1_Sub3_Sub2_Sub2_1.anInt7815 = Static269.anInt4883;
			}
		}
		if (this.anInt296 >= 0) {
			this.aClass19_Sub1_Sub3_Sub2_Sub1_1.method3441(arg0, arg1, arg2, this.aClass19_Sub1_Sub3_Sub2_Sub1_1.method6592(), true);
			this.aClass19_Sub1_Sub3_Sub2_Sub1_1.method6597(arg3, true);
		} else {
			this.aClass19_Sub1_Sub3_Sub2_Sub2_1.aByte146 = this.aClass19_Sub1_Sub3_Sub2_Sub2_1.aByte145 = (byte) arg1;
			this.aClass19_Sub1_Sub3_Sub2_Sub2_1.method6616(arg0, arg2);
			this.aClass19_Sub1_Sub3_Sub2_Sub2_1.method6597(arg3, true);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIII)V")
	public void method294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass19_Sub1_Sub3_Sub2_Sub1_1 == null) {
			this.aClass19_Sub1_Sub3_Sub2_Sub2_1.aByte146 = this.aClass19_Sub1_Sub3_Sub2_Sub2_1.aByte145 = (byte) arg1;
			this.aClass19_Sub1_Sub3_Sub2_Sub2_1.method6616(arg0, arg2);
		} else {
			this.aClass19_Sub1_Sub3_Sub2_Sub1_1.method3441(arg0, arg1, arg2, this.aClass19_Sub1_Sub3_Sub2_Sub1_1.method6592(), true);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)Lclient!wka;")
	public Class19_Sub1_Sub3_Sub2 method295() {
		return this.aClass19_Sub1_Sub3_Sub2_Sub1_1 == null ? this.aClass19_Sub1_Sub3_Sub2_Sub2_1 : this.aClass19_Sub1_Sub3_Sub2_Sub1_1;
	}
}
