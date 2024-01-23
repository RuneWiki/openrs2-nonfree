import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
	private int anInt4411;

	@OriginalMember(owner = "client!tj", name = "W", descriptor = "I")
	public int anInt4418;

	@OriginalMember(owner = "client!tj", name = "X", descriptor = "Lclient!hd;")
	private Class50 aClass50_26;

	@OriginalMember(owner = "client!tj", name = "bb", descriptor = "I")
	public int anInt4420;

	@OriginalMember(owner = "client!tj", name = "cb", descriptor = "Lclient!hd;")
	private Class50 aClass50_27;

	@OriginalMember(owner = "client!tj", name = "O", descriptor = "Lclient!sc;")
	private Class107 aClass107_1168 = Static139.aClass107_837;

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)V")
	private void method3276() {
		this.aClass50_27 = new Class50(this.aClass50_26.method1359());
		for (@Pc(18) Class1_Sub19 local18 = (Class1_Sub19) this.aClass50_26.method1358(); local18 != null; local18 = (Class1_Sub19) this.aClass50_26.method1361()) {
			@Pc(31) Class1_Sub29 local31 = new Class1_Sub29(local18.aClass107_816, (int) local18.aLong177);
			this.aClass50_27.method1362(local18.aClass107_816.method3110(), local31);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLclient!sc;)Z")
	public boolean method3277(@OriginalArg(1) Class107 arg0) {
		if (this.aClass50_26 == null) {
			return false;
		}
		if (this.aClass50_27 == null) {
			this.method3276();
		}
		for (@Pc(31) Class1_Sub29 local31 = (Class1_Sub29) this.aClass50_27.method1364(arg0.method3110()); local31 != null; local31 = (Class1_Sub29) this.aClass50_27.method1363()) {
			if (local31.aClass107_1354.method3071(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)I")
	public int method3278(@OriginalArg(1) int arg0) {
		if (this.aClass50_26 == null) {
			return this.anInt4411;
		} else {
			@Pc(23) Class1_Sub5 local23 = (Class1_Sub5) this.aClass50_26.method1364((long) arg0);
			return local23 == null ? this.anInt4411 : local23.anInt782;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)Lclient!sc;")
	public Class107 method3280(@OriginalArg(1) int arg0) {
		if (this.aClass50_26 == null) {
			return this.aClass107_1168;
		} else {
			@Pc(23) Class1_Sub19 local23 = (Class1_Sub19) this.aClass50_26.method1364((long) arg0);
			return local23 == null ? this.aClass107_1168 : local23.aClass107_816;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!vf;I)V")
	public void method3281(@OriginalArg(0) Class1_Sub26 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2945();
			if (local13 == 0) {
				return;
			}
			this.method3286(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "(I)V")
	private void method3283() {
		this.aClass50_27 = new Class50(this.aClass50_26.method1359());
		for (@Pc(25) Class1_Sub5 local25 = (Class1_Sub5) this.aClass50_26.method1358(); local25 != null; local25 = (Class1_Sub5) this.aClass50_26.method1361()) {
			@Pc(34) Class1_Sub5 local34 = new Class1_Sub5((int) local25.aLong177);
			this.aClass50_27.method1362((long) local25.anInt782, local34);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)Z")
	public boolean method3284(@OriginalArg(0) int arg0) {
		if (this.aClass50_26 == null) {
			return false;
		}
		if (this.aClass50_27 == null) {
			this.method3283();
		}
		@Pc(27) Class1_Sub5 local27 = (Class1_Sub5) this.aClass50_27.method1364((long) arg0);
		return local27 != null;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!vf;IB)V")
	private void method3286(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4418 = arg0.method2945();
		} else if (arg1 == 2) {
			this.anInt4420 = arg0.method2945();
		} else if (arg1 == 3) {
			this.aClass107_1168 = arg0.method2978();
		} else if (arg1 == 4) {
			this.anInt4411 = arg0.method2958();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(53) int local53 = arg0.method2964();
			this.aClass50_26 = new Class50(Static156.method2529(local53));
			for (@Pc(63) int local63 = 0; local63 < local53; local63++) {
				@Pc(69) int local69 = arg0.method2958();
				@Pc(79) Class1 local79;
				if (arg1 == 5) {
					local79 = new Class1_Sub19(arg0.method2978());
				} else {
					local79 = new Class1_Sub5(arg0.method2958());
				}
				this.aClass50_26.method1362((long) local69, local79);
			}
		}
	}
}
