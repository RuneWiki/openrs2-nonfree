import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public final class Class221 {

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
	private int anInt6437;

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
	private int anInt6438;

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!lv", name = "g", descriptor = "Lclient!rda;")
	private Class300 aClass300_28;

	@OriginalMember(owner = "client!lv", name = "i", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!lv", name = "m", descriptor = "Lclient!rda;")
	public Class300 aClass300_29;

	@OriginalMember(owner = "client!lv", name = "p", descriptor = "Ljava/lang/String;")
	private String aString54 = "null";

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IILclient!mc;)V")
	private void method5363(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub41 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static144.method2600(arg1.method7861());
		} else if (arg0 == 2) {
			this.aChar2 = Static144.method2600(arg1.method7861());
		} else if (arg0 == 3) {
			this.aString54 = arg1.method7847();
		} else if (arg0 == 4) {
			this.anInt6437 = arg1.method7804();
		} else if (arg0 == 5 || arg0 == 6) {
			this.anInt6438 = arg1.method7860();
			this.aClass300_29 = new Class300(Static67.method917(this.anInt6438));
			for (@Pc(55) int local55 = 0; local55 < this.anInt6438; local55++) {
				@Pc(60) int local60 = arg1.method7804();
				@Pc(72) Class5 local72;
				if (arg0 == 5) {
					local72 = new Class5_Sub11(arg1.method7847());
				} else {
					local72 = new Class5_Sub47(arg1.method7804());
				}
				this.aClass300_29.method7191(local72, (long) local60);
			}
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
	private void method5364() {
		this.aClass300_28 = new Class300(this.aClass300_29.method7186());
		for (@Pc(25) Class5_Sub47 local25 = (Class5_Sub47) this.aClass300_29.method7182(); local25 != null; local25 = (Class5_Sub47) this.aClass300_29.method7192()) {
			@Pc(33) Class5_Sub47 local33 = new Class5_Sub47((int) local25.aLong307);
			this.aClass300_28.method7191(local33, (long) local25.anInt8308);
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!mc;B)V")
	public void method5365(@OriginalArg(0) Class5_Sub41 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method7816();
			if (local7 == 0) {
				return;
			}
			this.method5363(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)I")
	public int method5367(@OriginalArg(0) int arg0) {
		if (this.aClass300_29 == null) {
			return this.anInt6437;
		} else {
			@Pc(17) Class5_Sub47 local17 = (Class5_Sub47) this.aClass300_29.method7188((long) arg0);
			return local17 == null ? this.anInt6437 : local17.anInt8308;
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method5368(@OriginalArg(1) String arg0) {
		if (this.aClass300_29 == null) {
			return false;
		}
		if (this.aClass300_28 == null) {
			this.method5371();
		}
		for (@Pc(31) Class5_Sub23 local31 = (Class5_Sub23) this.aClass300_28.method7188(Static403.method6566(arg0)); local31 != null; local31 = (Class5_Sub23) this.aClass300_28.method7187()) {
			if (local31.aString27.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(II)Z")
	public boolean method5369(@OriginalArg(1) int arg0) {
		if (this.aClass300_29 == null) {
			return false;
		}
		if (this.aClass300_28 == null) {
			this.method5364();
		}
		@Pc(27) Class5_Sub47 local27 = (Class5_Sub47) this.aClass300_28.method7188((long) arg0);
		return local27 != null;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method5370(@OriginalArg(1) int arg0) {
		if (this.aClass300_29 == null) {
			return this.aString54;
		} else {
			@Pc(22) Class5_Sub11 local22 = (Class5_Sub11) this.aClass300_29.method7188((long) arg0);
			return local22 == null ? this.aString54 : local22.aString8;
		}
	}

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "(I)V")
	private void method5371() {
		this.aClass300_28 = new Class300(this.aClass300_29.method7186());
		for (@Pc(22) Class5_Sub11 local22 = (Class5_Sub11) this.aClass300_29.method7182(); local22 != null; local22 = (Class5_Sub11) this.aClass300_29.method7192()) {
			@Pc(32) Class5_Sub23 local32 = new Class5_Sub23(local22.aString8, (int) local22.aLong307);
			this.aClass300_28.method7191(local32, Static403.method6566(local22.aString8));
		}
	}
}
