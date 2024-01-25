import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class59 implements Interface7 {

	@OriginalMember(owner = "client!dq", name = "p", descriptor = "Lclient!hi;")
	private final Class111 aClass111_1 = new Class111(256);

	@OriginalMember(owner = "client!dq", name = "i", descriptor = "Lclient!mn;")
	private final Class171 aClass171_20;

	@OriginalMember(owner = "client!dq", name = "j", descriptor = "Lclient!mn;")
	private final Class171 aClass171_21;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
	private final int anInt1267;

	@OriginalMember(owner = "client!dq", name = "h", descriptor = "[Lclient!vg;")
	private final Class257[] aClass257Array1;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lclient!mn;Lclient!mn;Lclient!mn;)V")
	public Class59(@OriginalArg(0) Class171 arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_20 = arg1;
		this.aClass171_21 = arg2;
		@Pc(24) Class2_Sub17 local24 = new Class2_Sub17(arg0.method3658(0, 0));
		this.anInt1267 = local24.method6148();
		this.aClass257Array1 = new Class257[this.anInt1267];
		for (@Pc(36) int local36 = 0; local36 < this.anInt1267; local36++) {
			if (local24.method6138() == 1) {
				this.aClass257Array1[local36] = new Class257();
			}
		}
		for (@Pc(57) int local57 = 0; local57 < this.anInt1267; local57++) {
			if (this.aClass257Array1[local57] != null) {
				this.aClass257Array1[local57].aBoolean485 = local24.method6138() == 0;
			}
		}
		for (@Pc(86) int local86 = 0; local86 < this.anInt1267; local86++) {
			if (this.aClass257Array1[local86] != null) {
				this.aClass257Array1[local86].aBoolean492 = local24.method6138() == 1;
			}
		}
		for (@Pc(119) int local119 = 0; local119 < this.anInt1267; local119++) {
			if (this.aClass257Array1[local119] != null) {
				this.aClass257Array1[local119].aBoolean493 = local24.method6138() == 1;
			}
		}
		for (@Pc(150) int local150 = 0; local150 < this.anInt1267; local150++) {
			if (this.aClass257Array1[local150] != null) {
				this.aClass257Array1[local150].aBoolean489 = local24.method6138() == 1;
			}
		}
		for (@Pc(177) int local177 = 0; local177 < this.anInt1267; local177++) {
			if (this.aClass257Array1[local177] != null) {
				this.aClass257Array1[local177].aByte93 = local24.method6120();
			}
		}
		for (@Pc(203) int local203 = 0; local203 < this.anInt1267; local203++) {
			if (this.aClass257Array1[local203] != null) {
				this.aClass257Array1[local203].aByte97 = local24.method6120();
			}
		}
		for (@Pc(225) int local225 = 0; local225 < this.anInt1267; local225++) {
			if (this.aClass257Array1[local225] != null) {
				this.aClass257Array1[local225].aByte96 = local24.method6120();
			}
		}
		for (@Pc(247) int local247 = 0; local247 < this.anInt1267; local247++) {
			if (this.aClass257Array1[local247] != null) {
				this.aClass257Array1[local247].aByte94 = local24.method6120();
			}
		}
		for (@Pc(273) int local273 = 0; local273 < this.anInt1267; local273++) {
			if (this.aClass257Array1[local273] != null) {
				this.aClass257Array1[local273].aShort101 = (short) local24.method6148();
			}
		}
		for (@Pc(296) int local296 = 0; local296 < this.anInt1267; local296++) {
			if (this.aClass257Array1[local296] != null) {
				this.aClass257Array1[local296].aByte92 = local24.method6120();
			}
		}
		for (@Pc(322) int local322 = 0; local322 < this.anInt1267; local322++) {
			if (this.aClass257Array1[local322] != null) {
				this.aClass257Array1[local322].aByte95 = local24.method6120();
			}
		}
		for (@Pc(344) int local344 = 0; local344 < this.anInt1267; local344++) {
			if (this.aClass257Array1[local344] != null) {
				this.aClass257Array1[local344].aBoolean491 = local24.method6138() == 1;
			}
		}
		for (@Pc(373) int local373 = 0; local373 < this.anInt1267; local373++) {
			if (this.aClass257Array1[local373] != null) {
				this.aClass257Array1[local373].aBoolean488 = local24.method6138() == 1;
			}
		}
		for (@Pc(406) int local406 = 0; local406 < this.anInt1267; local406++) {
			if (this.aClass257Array1[local406] != null) {
				this.aClass257Array1[local406].aByte91 = local24.method6120();
			}
		}
		for (@Pc(428) int local428 = 0; local428 < this.anInt1267; local428++) {
			if (this.aClass257Array1[local428] != null) {
				this.aClass257Array1[local428].aBoolean484 = local24.method6138() == 1;
			}
		}
		for (@Pc(457) int local457 = 0; local457 < this.anInt1267; local457++) {
			if (this.aClass257Array1[local457] != null) {
				this.aClass257Array1[local457].aBoolean490 = local24.method6138() == 1;
			}
		}
		for (@Pc(486) int local486 = 0; local486 < this.anInt1267; local486++) {
			if (this.aClass257Array1[local486] != null) {
				this.aClass257Array1[local486].aBoolean486 = local24.method6138() == 1;
			}
		}
		for (@Pc(515) int local515 = 0; local515 < this.anInt1267; local515++) {
			if (this.aClass257Array1[local515] != null) {
				this.aClass257Array1[local515].anInt7252 = local24.method6138();
			}
		}
		for (@Pc(537) int local537 = 0; local537 < this.anInt1267; local537++) {
			if (this.aClass257Array1[local537] != null) {
				this.aClass257Array1[local537].anInt7253 = local24.method6129();
			}
		}
		for (@Pc(559) int local559 = 0; local559 < this.anInt1267; local559++) {
			if (this.aClass257Array1[local559] != null) {
				this.aClass257Array1[local559].aBoolean487 = local24.method6138() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZIBFII)[F")
	@Override
	public float[] method1169(@OriginalArg(1) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method1173(arg2).method4114(this.aClass171_21, this.aClass257Array1[arg2].aBoolean488, this, arg3, arg0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)Lclient!ob;")
	private Class2_Sub1_Sub13 method1173(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1 local10 = this.aClass111_1.method2310((long) arg0);
		if (local10 != null) {
			return (Class2_Sub1_Sub13) local10;
		}
		@Pc(21) byte[] local21 = this.aClass171_20.method3664(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(33) Class2_Sub1_Sub13 local33 = new Class2_Sub1_Sub13(new Class2_Sub17(local21));
			this.aClass111_1.method2312(local33, (long) arg0);
			return local33;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(FIZZII)[I")
	@Override
	public int[] method1172(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method1173(arg2).method4108(arg3, arg1, this, this.aClass257Array1[arg2].aBoolean488, this.aClass171_21, (double) arg0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IB)Lclient!vg;")
	@Override
	public Class257 method1170(@OriginalArg(0) int arg0) {
		return this.aClass257Array1[arg0];
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method1168(@OriginalArg(1) int arg0) {
		@Pc(22) Class2_Sub1_Sub13 local22 = this.method1173(arg0);
		return local22 != null && local22.method4112(this, this.aClass171_21);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZFIIII)[I")
	@Override
	public int[] method1171(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		return this.method1173(arg2).method4109(this.aClass257Array1[arg2].aBoolean488, this, arg4, arg3, arg0, this.aClass171_21, (double) arg1);
	}
}
