import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class51 implements Interface9 {

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "Lclient!nfa;")
	private final Class236 aClass236_1 = new Class236(256);

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "Lclient!mv;")
	private final Class229 aClass229_17;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "Lclient!mv;")
	private final Class229 aClass229_18;

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
	private final int anInt1130;

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "[Lclient!raa;")
	private final Class291[] aClass291Array1;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!mv;Lclient!mv;Lclient!mv;)V")
	public Class51(@OriginalArg(0) Class229 arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(2) Class229 arg2) {
		this.aClass229_17 = arg1;
		this.aClass229_18 = arg2;
		@Pc(24) Class2_Sub7 local24 = new Class2_Sub7(arg0.method4980(0, 0));
		this.anInt1130 = local24.method4518();
		this.aClass291Array1 = new Class291[this.anInt1130];
		for (@Pc(36) int local36 = 0; local36 < this.anInt1130; local36++) {
			if (local24.method4464() == 1) {
				this.aClass291Array1[local36] = new Class291();
			}
		}
		for (@Pc(57) int local57 = 0; local57 < this.anInt1130; local57++) {
			if (this.aClass291Array1[local57] != null) {
				this.aClass291Array1[local57].aBoolean603 = local24.method4464() == 0;
			}
		}
		for (@Pc(90) int local90 = 0; local90 < this.anInt1130; local90++) {
			if (this.aClass291Array1[local90] != null) {
				this.aClass291Array1[local90].aBoolean601 = local24.method4464() == 1;
			}
		}
		for (@Pc(119) int local119 = 0; local119 < this.anInt1130; local119++) {
			if (this.aClass291Array1[local119] != null) {
				this.aClass291Array1[local119].aBoolean602 = local24.method4464() == 1;
			}
		}
		for (@Pc(150) int local150 = 0; local150 < this.anInt1130; local150++) {
			if (this.aClass291Array1[local150] != null) {
				this.aClass291Array1[local150].aBoolean598 = local24.method4464() == 1;
			}
		}
		for (@Pc(183) int local183 = 0; local183 < this.anInt1130; local183++) {
			if (this.aClass291Array1[local183] != null) {
				this.aClass291Array1[local183].aByte101 = local24.method4477();
			}
		}
		for (@Pc(209) int local209 = 0; local209 < this.anInt1130; local209++) {
			if (this.aClass291Array1[local209] != null) {
				this.aClass291Array1[local209].aByte98 = local24.method4477();
			}
		}
		for (@Pc(231) int local231 = 0; local231 < this.anInt1130; local231++) {
			if (this.aClass291Array1[local231] != null) {
				this.aClass291Array1[local231].aByte96 = local24.method4477();
			}
		}
		for (@Pc(253) int local253 = 0; local253 < this.anInt1130; local253++) {
			if (this.aClass291Array1[local253] != null) {
				this.aClass291Array1[local253].aByte95 = local24.method4477();
			}
		}
		for (@Pc(275) int local275 = 0; local275 < this.anInt1130; local275++) {
			if (this.aClass291Array1[local275] != null) {
				this.aClass291Array1[local275].aShort88 = (short) local24.method4518();
			}
		}
		for (@Pc(298) int local298 = 0; local298 < this.anInt1130; local298++) {
			if (this.aClass291Array1[local298] != null) {
				this.aClass291Array1[local298].aByte97 = local24.method4477();
			}
		}
		for (@Pc(320) int local320 = 0; local320 < this.anInt1130; local320++) {
			if (this.aClass291Array1[local320] != null) {
				this.aClass291Array1[local320].aByte100 = local24.method4477();
			}
		}
		for (@Pc(346) int local346 = 0; local346 < this.anInt1130; local346++) {
			if (this.aClass291Array1[local346] != null) {
				this.aClass291Array1[local346].aBoolean595 = local24.method4464() == 1;
			}
		}
		for (@Pc(375) int local375 = 0; local375 < this.anInt1130; local375++) {
			if (this.aClass291Array1[local375] != null) {
				this.aClass291Array1[local375].aBoolean604 = local24.method4464() == 1;
			}
		}
		for (@Pc(404) int local404 = 0; local404 < this.anInt1130; local404++) {
			if (this.aClass291Array1[local404] != null) {
				this.aClass291Array1[local404].aByte99 = local24.method4477();
			}
		}
		for (@Pc(426) int local426 = 0; local426 < this.anInt1130; local426++) {
			if (this.aClass291Array1[local426] != null) {
				this.aClass291Array1[local426].aBoolean597 = local24.method4464() == 1;
			}
		}
		for (@Pc(453) int local453 = 0; local453 < this.anInt1130; local453++) {
			if (this.aClass291Array1[local453] != null) {
				this.aClass291Array1[local453].aBoolean600 = local24.method4464() == 1;
			}
		}
		for (@Pc(480) int local480 = 0; local480 < this.anInt1130; local480++) {
			if (this.aClass291Array1[local480] != null) {
				this.aClass291Array1[local480].aBoolean596 = local24.method4464() == 1;
			}
		}
		for (@Pc(511) int local511 = 0; local511 < this.anInt1130; local511++) {
			if (this.aClass291Array1[local511] != null) {
				this.aClass291Array1[local511].anInt7229 = local24.method4464();
			}
		}
		for (@Pc(533) int local533 = 0; local533 < this.anInt1130; local533++) {
			if (this.aClass291Array1[local533] != null) {
				this.aClass291Array1[local533].anInt7228 = local24.method4509();
			}
		}
		for (@Pc(555) int local555 = 0; local555 < this.anInt1130; local555++) {
			if (this.aClass291Array1[local555] != null) {
				this.aClass291Array1[local555].aBoolean599 = local24.method4464() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZFIII)[F")
	@Override
	public float[] method1072(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method1080(arg2).method5104(this.aClass229_18, arg0, this.aClass291Array1[arg2].aBoolean604, this, arg3);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)Lclient!nj;")
	private Class2_Sub2_Sub14 method1080(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub2 local10 = this.aClass236_1.method5075((long) arg0);
		if (local10 != null) {
			return (Class2_Sub2_Sub14) local10;
		}
		@Pc(21) byte[] local21 = this.aClass229_17.method4966(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(38) Class2_Sub2_Sub14 local38 = new Class2_Sub2_Sub14(new Class2_Sub7(local21));
			this.aClass236_1.method5071(local38, (long) arg0);
			return local38;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)I")
	@Override
	public int method1077() {
		return this.anInt1130;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)Lclient!raa;")
	@Override
	public Class291 method1074(@OriginalArg(1) int arg0) {
		return this.aClass291Array1[arg0];
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1073(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub2_Sub14 local8 = this.method1080(arg0);
		return local8 != null && local8.method5108(this.aClass229_18, this);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIZFI)[I")
	@Override
	public int[] method1075(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3) {
		return this.method1080(arg3).method5106(arg1, this.aClass291Array1[arg3].aBoolean604, this, this.aClass229_18, (double) arg2, arg0);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(FIIZII)[I")
	@Override
	public int[] method1076(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method1080(arg4).method5105(arg1, this.aClass291Array1[arg4].aBoolean604, arg3, arg2, (double) arg0, this.aClass229_18, this);
	}
}
