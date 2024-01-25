import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class168 {

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!nv", name = "i", descriptor = "Lclient!qo;")
	private Class196 aClass196_23;

	@OriginalMember(owner = "client!nv", name = "o", descriptor = "I")
	private int anInt4870;

	@OriginalMember(owner = "client!nv", name = "s", descriptor = "Lclient!qo;")
	public Class196 aClass196_24;

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "Ljava/lang/String;")
	private String aString49 = "null";

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)V")
	private void method3714() {
		this.aClass196_23 = new Class196(this.aClass196_24.method4476());
		for (@Pc(24) Class4_Sub15 local24 = (Class4_Sub15) this.aClass196_24.method4482(); local24 != null; local24 = (Class4_Sub15) this.aClass196_24.method4472()) {
			@Pc(33) Class4_Sub15 local33 = new Class4_Sub15((int) local24.aLong225);
			this.aClass196_23.method4474((long) local24.anInt2603, local33);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZLclient!tl;)V")
	public void method3715(@OriginalArg(1) Class4_Sub30 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4864();
			if (local5 == 0) {
				return;
			}
			this.method3721(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)Z")
	public boolean method3716(@OriginalArg(1) int arg0) {
		if (this.aClass196_24 == null) {
			return false;
		}
		if (this.aClass196_23 == null) {
			this.method3714();
		}
		@Pc(28) Class4_Sub15 local28 = (Class4_Sub15) this.aClass196_23.method4477((long) arg0);
		return local28 != null;
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(II)I")
	public int method3717(@OriginalArg(1) int arg0) {
		if (this.aClass196_24 == null) {
			return this.anInt4870;
		} else {
			@Pc(17) Class4_Sub15 local17 = (Class4_Sub15) this.aClass196_24.method4477((long) arg0);
			return local17 == null ? this.anInt4870 : local17.anInt2603;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method3718(@OriginalArg(0) int arg0) {
		if (this.aClass196_24 == null) {
			return this.aString49;
		} else {
			@Pc(25) Class4_Sub25 local25 = (Class4_Sub25) this.aClass196_24.method4477((long) arg0);
			return local25 == null ? this.aString49 : local25.aString45;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILclient!tl;Z)V")
	private void method3721(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub30 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static414.method5433(arg1.method4865());
		} else if (arg0 == 2) {
			this.aChar4 = Static414.method5433(arg1.method4865());
		} else if (arg0 == 3) {
			this.aString49 = arg1.method4867();
		} else if (arg0 == 4) {
			this.anInt4870 = arg1.method4872();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(43) int local43 = arg1.method4877();
			this.aClass196_24 = new Class196(Static183.method2711(local43));
			for (@Pc(53) int local53 = 0; local53 < local43; local53++) {
				@Pc(59) int local59 = arg1.method4872();
				@Pc(69) Class4 local69;
				if (arg0 == 5) {
					local69 = new Class4_Sub25(arg1.method4867());
				} else {
					local69 = new Class4_Sub15(arg1.method4872());
				}
				this.aClass196_24.method4474((long) local59, local69);
			}
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method3723(@OriginalArg(1) String arg0) {
		if (this.aClass196_24 == null) {
			return false;
		}
		if (this.aClass196_23 == null) {
			this.method3724();
		}
		for (@Pc(23) Class4_Sub3 local23 = (Class4_Sub3) this.aClass196_23.method4477(Static128.method1910(arg0)); local23 != null; local23 = (Class4_Sub3) this.aClass196_23.method4479()) {
			if (local23.aString6.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V")
	private void method3724() {
		this.aClass196_23 = new Class196(this.aClass196_24.method4476());
		for (@Pc(25) Class4_Sub25 local25 = (Class4_Sub25) this.aClass196_24.method4482(); local25 != null; local25 = (Class4_Sub25) this.aClass196_24.method4472()) {
			@Pc(36) Class4_Sub3 local36 = new Class4_Sub3(local25.aString45, (int) local25.aLong225);
			this.aClass196_23.method4474(Static128.method1910(local25.aString45), local36);
		}
	}
}
