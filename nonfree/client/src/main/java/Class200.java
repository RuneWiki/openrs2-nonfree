import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class200 {

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!qu", name = "j", descriptor = "I")
	private int anInt5767;

	@OriginalMember(owner = "client!qu", name = "k", descriptor = "Lclient!ib;")
	public Class102 aClass102_32;

	@OriginalMember(owner = "client!qu", name = "m", descriptor = "Lclient!ib;")
	private Class102 aClass102_33;

	@OriginalMember(owner = "client!qu", name = "h", descriptor = "Ljava/lang/String;")
	private String aString58 = "null";

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
	private void method4532() {
		this.aClass102_33 = new Class102(this.aClass102_32.method2706());
		for (@Pc(26) Class4_Sub7 local26 = (Class4_Sub7) this.aClass102_32.method2705(); local26 != null; local26 = (Class4_Sub7) this.aClass102_32.method2704()) {
			@Pc(37) Class4_Sub35 local37 = new Class4_Sub35(local26.aString12, (int) local26.aLong224);
			this.aClass102_33.method2703(Static237.method5625(local26.aString12), local37);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)I")
	public int method4533(@OriginalArg(0) int arg0) {
		if (this.aClass102_32 == null) {
			return this.anInt5767;
		} else {
			@Pc(25) Class4_Sub37 local25 = (Class4_Sub37) this.aClass102_32.method2700((long) arg0);
			return local25 == null ? this.anInt5767 : local25.anInt5426;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILclient!iv;)V")
	public void method4534(@OriginalArg(1) Class4_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2490();
			if (local5 == 0) {
				return;
			}
			this.method4537(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method4535(@OriginalArg(1) String arg0) {
		if (this.aClass102_32 == null) {
			return false;
		}
		if (this.aClass102_33 == null) {
			this.method4532();
		}
		for (@Pc(30) Class4_Sub35 local30 = (Class4_Sub35) this.aClass102_33.method2700(Static237.method5625(arg0)); local30 != null; local30 = (Class4_Sub35) this.aClass102_33.method2697()) {
			if (local30.aString51.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZI)Z")
	public boolean method4536(@OriginalArg(1) int arg0) {
		if (this.aClass102_32 == null) {
			return false;
		}
		if (this.aClass102_33 == null) {
			this.method4539();
		}
		@Pc(22) Class4_Sub37 local22 = (Class4_Sub37) this.aClass102_33.method2700((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!iv;II)V")
	private void method4537(@OriginalArg(0) Class4_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static260.method3771(arg0.method2542());
		} else if (arg1 == 2) {
			this.aChar4 = Static260.method3771(arg0.method2542());
		} else if (arg1 == 3) {
			this.aString58 = arg0.method2537();
		} else if (arg1 == 4) {
			this.anInt5767 = arg0.method2529();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(31) int local31 = arg0.method2536();
			this.aClass102_32 = new Class102(Static370.method4949(local31));
			for (@Pc(43) int local43 = 0; local43 < local31; local43++) {
				@Pc(49) int local49 = arg0.method2529();
				@Pc(61) Class4 local61;
				if (arg1 == 5) {
					local61 = new Class4_Sub7(arg0.method2537());
				} else {
					local61 = new Class4_Sub37(arg0.method2529());
				}
				this.aClass102_32.method2703((long) local49, local61);
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method4538(@OriginalArg(1) int arg0) {
		if (this.aClass102_32 == null) {
			return this.aString58;
		} else {
			@Pc(17) Class4_Sub7 local17 = (Class4_Sub7) this.aClass102_32.method2700((long) arg0);
			return local17 == null ? this.aString58 : local17.aString12;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
	private void method4539() {
		this.aClass102_33 = new Class102(this.aClass102_32.method2706());
		for (@Pc(24) Class4_Sub37 local24 = (Class4_Sub37) this.aClass102_32.method2705(); local24 != null; local24 = (Class4_Sub37) this.aClass102_32.method2704()) {
			@Pc(33) Class4_Sub37 local33 = new Class4_Sub37((int) local24.aLong224);
			this.aClass102_33.method2703((long) local24.anInt5426, local33);
		}
	}
}
