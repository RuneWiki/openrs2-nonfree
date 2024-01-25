import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class43 {

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
	private int anInt1314;

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!cq", name = "i", descriptor = "Lclient!hl;")
	private Class96 aClass96_5;

	@OriginalMember(owner = "client!cq", name = "l", descriptor = "Lclient!hl;")
	public Class96 aClass96_6;

	@OriginalMember(owner = "client!cq", name = "h", descriptor = "Ljava/lang/String;")
	private String aString8 = "null";

	static {
		new Class21(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BI)Z")
	public boolean method1204(@OriginalArg(1) int arg0) {
		if (this.aClass96_6 == null) {
			return false;
		}
		if (this.aClass96_5 == null) {
			this.method1214();
		}
		@Pc(34) Class4_Sub16 local34 = (Class4_Sub16) this.aClass96_5.method2797((long) arg0);
		return local34 != null;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method1205(@OriginalArg(1) String arg0) {
		if (this.aClass96_6 == null) {
			return false;
		}
		if (this.aClass96_5 == null) {
			this.method1207();
		}
		for (@Pc(27) Class4_Sub48 local27 = (Class4_Sub48) this.aClass96_5.method2797(Static289.method4467(arg0)); local27 != null; local27 = (Class4_Sub48) this.aClass96_5.method2803()) {
			if (local27.aString81.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
	private void method1207() {
		this.aClass96_5 = new Class96(this.aClass96_6.method2802());
		for (@Pc(28) Class4_Sub12 local28 = (Class4_Sub12) this.aClass96_6.method2798(); local28 != null; local28 = (Class4_Sub12) this.aClass96_6.method2796()) {
			@Pc(39) Class4_Sub48 local39 = new Class4_Sub48(local28.aString12, (int) local28.aLong228);
			this.aClass96_5.method2805(Static289.method4467(local28.aString12), local39);
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IILclient!wn;)V")
	private void method1208(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub20 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static154.method2864(arg1.method4576());
		} else if (arg0 == 2) {
			this.aChar1 = Static154.method2864(arg1.method4576());
		} else if (arg0 == 3) {
			this.aString8 = arg1.method4624();
		} else if (arg0 == 4) {
			this.anInt1314 = arg1.method4595();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(63) int local63 = arg1.method4560();
			this.aClass96_6 = new Class96(Static84.method6309(local63));
			for (@Pc(73) int local73 = 0; local73 < local63; local73++) {
				@Pc(79) int local79 = arg1.method4595();
				@Pc(91) Class4 local91;
				if (arg0 == 5) {
					local91 = new Class4_Sub12(arg1.method4624());
				} else {
					local91 = new Class4_Sub16(arg1.method4595());
				}
				this.aClass96_6.method2805((long) local79, local91);
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(BI)Ljava/lang/String;")
	public String method1209(@OriginalArg(1) int arg0) {
		if (this.aClass96_6 == null) {
			return this.aString8;
		} else {
			@Pc(22) Class4_Sub12 local22 = (Class4_Sub12) this.aClass96_6.method2797((long) arg0);
			return local22 == null ? this.aString8 : local22.aString12;
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IB)I")
	public int method1212(@OriginalArg(0) int arg0) {
		if (this.aClass96_6 == null) {
			return this.anInt1314;
		} else {
			@Pc(17) Class4_Sub16 local17 = (Class4_Sub16) this.aClass96_6.method2797((long) arg0);
			return local17 == null ? this.anInt1314 : local17.anInt2197;
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!wn;B)V")
	public void method1213(@OriginalArg(0) Class4_Sub20 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4614();
			if (local13 == 0) {
				return;
			}
			this.method1208(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V")
	private void method1214() {
		this.aClass96_5 = new Class96(this.aClass96_6.method2802());
		for (@Pc(20) Class4_Sub16 local20 = (Class4_Sub16) this.aClass96_6.method2798(); local20 != null; local20 = (Class4_Sub16) this.aClass96_6.method2796()) {
			@Pc(29) Class4_Sub16 local29 = new Class4_Sub16((int) local20.aLong228);
			this.aClass96_5.method2805((long) local20.anInt2197, local29);
		}
	}
}
