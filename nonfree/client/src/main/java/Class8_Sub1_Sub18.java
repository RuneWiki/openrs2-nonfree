import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class8_Sub1_Sub18 extends Class8_Sub1 {

	@OriginalMember(owner = "client!sm", name = "E", descriptor = "Lclient!pd;")
	public Class129 aClass129_26;

	@OriginalMember(owner = "client!sm", name = "J", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!sm", name = "N", descriptor = "Lclient!pd;")
	private Class129 aClass129_27;

	@OriginalMember(owner = "client!sm", name = "O", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!sm", name = "R", descriptor = "I")
	private int anInt4924;

	@OriginalMember(owner = "client!sm", name = "D", descriptor = "Ljava/lang/String;")
	private String aString173 = "null";

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V")
	private void method3680() {
		this.aClass129_27 = new Class129(this.aClass129_26.method3041());
		for (@Pc(28) Class8_Sub28 local28 = (Class8_Sub28) this.aClass129_26.method3035(); local28 != null; local28 = (Class8_Sub28) this.aClass129_26.method3048()) {
			@Pc(37) Class8_Sub28 local37 = new Class8_Sub28((int) local28.aLong203);
			this.aClass129_27.method3039(local37, (long) local28.anInt4870);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method3681(@OriginalArg(1) String arg0) {
		if (this.aClass129_26 == null) {
			return false;
		}
		if (this.aClass129_27 == null) {
			this.method3682();
		}
		for (@Pc(36) Class8_Sub21 local36 = (Class8_Sub21) this.aClass129_27.method3043(Static17.method318(arg0)); local36 != null; local36 = (Class8_Sub21) this.aClass129_27.method3037()) {
			if (local36.aString119.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V")
	private void method3682() {
		this.aClass129_27 = new Class129(this.aClass129_26.method3041());
		for (@Pc(25) Class8_Sub7 local25 = (Class8_Sub7) this.aClass129_26.method3035(); local25 != null; local25 = (Class8_Sub7) this.aClass129_26.method3048()) {
			@Pc(36) Class8_Sub21 local36 = new Class8_Sub21(local25.aString35, (int) local25.aLong203);
			this.aClass129_27.method3039(local36, Static17.method318(local25.aString35));
		}
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(Lclient!aj;I)V")
	public void method3683(@OriginalArg(0) Class8_Sub2 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method2334();
			if (local12 == 0) {
				return;
			}
			this.method3687(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!aj;II)V")
	private void method3687(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static274.method4077(arg0.method2374());
		} else if (arg1 == 2) {
			this.aChar3 = Static274.method4077(arg0.method2374());
		} else if (arg1 == 3) {
			this.aString173 = arg0.method2372();
		} else if (arg1 == 4) {
			this.anInt4924 = arg0.method2352();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(64) int local64 = arg0.method2375();
			this.aClass129_26 = new Class129(Static95.method1518(local64));
			for (@Pc(76) int local76 = 0; local76 < local64; local76++) {
				@Pc(87) int local87 = arg0.method2352();
				@Pc(97) Class8 local97;
				if (arg1 == 5) {
					local97 = new Class8_Sub7(arg0.method2372());
				} else {
					local97 = new Class8_Sub28(arg0.method2352());
				}
				this.aClass129_26.method3039(local97, (long) local87);
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)I")
	public int method3688(@OriginalArg(0) int arg0) {
		if (this.aClass129_26 == null) {
			return this.anInt4924;
		} else {
			@Pc(25) Class8_Sub28 local25 = (Class8_Sub28) this.aClass129_26.method3043((long) arg0);
			return local25 == null ? this.anInt4924 : local25.anInt4870;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IB)Z")
	public boolean method3689(@OriginalArg(0) int arg0) {
		if (this.aClass129_26 == null) {
			return false;
		}
		if (this.aClass129_27 == null) {
			this.method3680();
		}
		@Pc(25) Class8_Sub28 local25 = (Class8_Sub28) this.aClass129_27.method3043((long) arg0);
		return local25 != null;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method3690(@OriginalArg(0) int arg0) {
		if (this.aClass129_26 == null) {
			return this.aString173;
		} else {
			@Pc(18) Class8_Sub7 local18 = (Class8_Sub7) this.aClass129_26.method3043((long) arg0);
			return local18 == null ? this.aString173 : local18.aString35;
		}
	}
}
