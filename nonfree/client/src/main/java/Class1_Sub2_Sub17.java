import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ql", name = "A", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!ql", name = "B", descriptor = "Lclient!ik;")
	public Class70 aClass70_14;

	@OriginalMember(owner = "client!ql", name = "I", descriptor = "Lclient!ik;")
	private Class70 aClass70_15;

	@OriginalMember(owner = "client!ql", name = "N", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!ql", name = "O", descriptor = "I")
	private int anInt4316;

	@OriginalMember(owner = "client!ql", name = "G", descriptor = "Ljava/lang/String;")
	private String aString257 = "null";

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)V")
	private void method3429() {
		this.aClass70_15 = new Class70(this.aClass70_14.method2077());
		for (@Pc(28) Class1_Sub27 local28 = (Class1_Sub27) this.aClass70_14.method2074(); local28 != null; local28 = (Class1_Sub27) this.aClass70_14.method2079()) {
			@Pc(39) Class1_Sub31 local39 = new Class1_Sub31(local28.aString255, (int) local28.aLong205);
			this.aClass70_15.method2084(Static129.method2211(local28.aString255), local39);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)I")
	public int method3432(@OriginalArg(0) int arg0) {
		if (this.aClass70_14 == null) {
			return this.anInt4316;
		} else {
			@Pc(17) Class1_Sub29 local17 = (Class1_Sub29) this.aClass70_14.method2075((long) arg0);
			return local17 == null ? this.anInt4316 : local17.anInt4792;
		}
	}

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "(I)V")
	private void method3434() {
		this.aClass70_15 = new Class70(this.aClass70_14.method2077());
		for (@Pc(25) Class1_Sub29 local25 = (Class1_Sub29) this.aClass70_14.method2074(); local25 != null; local25 = (Class1_Sub29) this.aClass70_14.method2079()) {
			@Pc(35) Class1_Sub29 local35 = new Class1_Sub29((int) local25.aLong205);
			this.aClass70_15.method2084((long) local25.anInt4792, local35);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method3435(@OriginalArg(0) int arg0) {
		if (this.aClass70_14 == null) {
			return this.aString257;
		} else {
			@Pc(24) Class1_Sub27 local24 = (Class1_Sub27) this.aClass70_14.method2075((long) arg0);
			return local24 == null ? this.aString257 : local24.aString255;
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(II)Z")
	public boolean method3437(@OriginalArg(0) int arg0) {
		if (this.aClass70_14 == null) {
			return false;
		}
		if (this.aClass70_15 == null) {
			this.method3434();
		}
		@Pc(30) Class1_Sub29 local30 = (Class1_Sub29) this.aClass70_15.method2075((long) arg0);
		return local30 != null;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!cg;I)V")
	private void method3438(@OriginalArg(1) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static170.method2924(arg0.method2663());
		} else if (arg1 == 2) {
			this.aChar4 = Static170.method2924(arg0.method2663());
		} else if (arg1 == 3) {
			this.aString257 = arg0.method2629();
		} else if (arg1 == 4) {
			this.anInt4316 = arg0.method2643();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(53) int local53 = arg0.method2691();
			this.aClass70_14 = new Class70(Static161.method2789(local53));
			for (@Pc(63) int local63 = 0; local63 < local53; local63++) {
				@Pc(70) int local70 = arg0.method2643();
				@Pc(80) Class1 local80;
				if (arg1 == 5) {
					local80 = new Class1_Sub27(arg0.method2629());
				} else {
					local80 = new Class1_Sub29(arg0.method2643());
				}
				this.aClass70_14.method2084((long) local70, local80);
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!cg;)V")
	public void method3439(@OriginalArg(1) Class1_Sub11 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2690();
			if (local17 == 0) {
				return;
			}
			this.method3438(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method3441(@OriginalArg(0) String arg0) {
		if (this.aClass70_14 == null) {
			return false;
		}
		if (this.aClass70_15 == null) {
			this.method3429();
		}
		for (@Pc(38) Class1_Sub31 local38 = (Class1_Sub31) this.aClass70_15.method2075(Static129.method2211(arg0)); local38 != null; local38 = (Class1_Sub31) this.aClass70_15.method2085()) {
			if (local38.aString294.equals(arg0)) {
				return true;
			}
		}
		return false;
	}
}
