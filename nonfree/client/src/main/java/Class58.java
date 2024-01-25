import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class58 {

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!dq", name = "k", descriptor = "Lclient!jr;")
	private Class127 aClass127_6;

	@OriginalMember(owner = "client!dq", name = "n", descriptor = "I")
	private int anInt1715;

	@OriginalMember(owner = "client!dq", name = "q", descriptor = "Lclient!jr;")
	public Class127 aClass127_7;

	@OriginalMember(owner = "client!dq", name = "r", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!dq", name = "t", descriptor = "Ljava/lang/String;")
	private String aString15 = "null";

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public boolean method1398(@OriginalArg(1) String arg0) {
		if (this.aClass127_7 == null) {
			return false;
		}
		if (this.aClass127_6 == null) {
			this.method1406();
		}
		for (@Pc(28) Class3_Sub19 local28 = (Class3_Sub19) this.aClass127_6.method3246(Static437.method5858(arg0)); local28 != null; local28 = (Class3_Sub19) this.aClass127_6.method3254()) {
			if (local28.aString23.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZLclient!bt;)V")
	public void method1400(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method6053();
			if (local3 == 0) {
				return;
			}
			this.method1408(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
	private void method1401() {
		this.aClass127_6 = new Class127(this.aClass127_7.method3255());
		for (@Pc(18) Class3_Sub25 local18 = (Class3_Sub25) this.aClass127_7.method3248(); local18 != null; local18 = (Class3_Sub25) this.aClass127_7.method3252()) {
			@Pc(34) Class3_Sub25 local34 = new Class3_Sub25((int) local18.aLong227);
			this.aClass127_6.method3257((long) local18.anInt4134, local34);
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)I")
	public int method1404(@OriginalArg(0) int arg0) {
		if (this.aClass127_7 == null) {
			return this.anInt1715;
		} else {
			@Pc(22) Class3_Sub25 local22 = (Class3_Sub25) this.aClass127_7.method3246((long) arg0);
			return local22 == null ? this.anInt1715 : local22.anInt4134;
		}
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(II)Z")
	public boolean method1405(@OriginalArg(0) int arg0) {
		if (this.aClass127_7 == null) {
			return false;
		}
		if (this.aClass127_6 == null) {
			this.method1401();
		}
		@Pc(22) Class3_Sub25 local22 = (Class3_Sub25) this.aClass127_6.method3246((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
	private void method1406() {
		this.aClass127_6 = new Class127(this.aClass127_7.method3255());
		for (@Pc(18) Class3_Sub37 local18 = (Class3_Sub37) this.aClass127_7.method3248(); local18 != null; local18 = (Class3_Sub37) this.aClass127_7.method3252()) {
			@Pc(34) Class3_Sub19 local34 = new Class3_Sub19(local18.aString58, (int) local18.aLong227);
			this.aClass127_6.method3257(Static437.method5858(local18.aString58), local34);
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BILclient!bt;)V")
	private void method1408(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static26.method717(arg1.method6011());
		} else if (arg0 == 2) {
			this.aChar3 = Static26.method717(arg1.method6011());
		} else if (arg0 == 3) {
			this.aString15 = arg1.method6027();
		} else if (arg0 == 4) {
			this.anInt1715 = arg1.method6014();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(63) int local63 = arg1.method6004();
			this.aClass127_7 = new Class127(Static350.method4984(local63));
			for (@Pc(73) int local73 = 0; local73 < local63; local73++) {
				@Pc(78) int local78 = arg1.method6014();
				@Pc(92) Class3 local92;
				if (arg0 == 5) {
					local92 = new Class3_Sub37(arg1.method6027());
				} else {
					local92 = new Class3_Sub25(arg1.method6014());
				}
				this.aClass127_7.method3257((long) local78, local92);
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "(II)Ljava/lang/String;")
	public String method1409(@OriginalArg(1) int arg0) {
		if (this.aClass127_7 == null) {
			return this.aString15;
		} else {
			@Pc(22) Class3_Sub37 local22 = (Class3_Sub37) this.aClass127_7.method3246((long) arg0);
			return local22 == null ? this.aString15 : local22.aString58;
		}
	}
}
