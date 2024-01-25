import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class204 {

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
	private int anInt5854;

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "Lclient!ub;")
	public Class240 aClass240_24;

	@OriginalMember(owner = "client!qr", name = "m", descriptor = "Lclient!ub;")
	private Class240 aClass240_25;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "Ljava/lang/String;")
	private String aString49 = "null";

	static {
		new Class256(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)I")
	public int method4680(@OriginalArg(1) int arg0) {
		if (this.aClass240_24 == null) {
			return this.anInt5854;
		} else {
			@Pc(25) Class2_Sub16 local25 = (Class2_Sub16) this.aClass240_24.method5439((long) arg0);
			return local25 == null ? this.anInt5854 : local25.anInt2428;
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
	private void method4681() {
		this.aClass240_25 = new Class240(this.aClass240_24.method5440());
		for (@Pc(20) Class2_Sub16 local20 = (Class2_Sub16) this.aClass240_24.method5438(); local20 != null; local20 = (Class2_Sub16) this.aClass240_24.method5436()) {
			@Pc(29) Class2_Sub16 local29 = new Class2_Sub16((int) local20.aLong227);
			this.aClass240_25.method5430((long) local20.anInt2428, local29);
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method4682(@OriginalArg(0) String arg0) {
		if (this.aClass240_24 == null) {
			return false;
		}
		if (this.aClass240_25 == null) {
			this.method4687();
		}
		for (@Pc(27) Class2_Sub39 local27 = (Class2_Sub39) this.aClass240_25.method5439(Static9.method190(arg0)); local27 != null; local27 = (Class2_Sub39) this.aClass240_25.method5434()) {
			if (local27.aString59.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method4683(@OriginalArg(0) int arg0) {
		if (this.aClass240_24 == null) {
			return this.aString49;
		} else {
			@Pc(23) Class2_Sub31 local23 = (Class2_Sub31) this.aClass240_24.method5439((long) arg0);
			return local23 == null ? this.aString49 : local23.aString43;
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!md;I)V")
	public void method4684(@OriginalArg(0) Class2_Sub20 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method3737();
			if (local17 == 0) {
				return;
			}
			this.method4688(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "(II)Z")
	public boolean method4686(@OriginalArg(1) int arg0) {
		if (this.aClass240_24 == null) {
			return false;
		}
		if (this.aClass240_25 == null) {
			this.method4681();
		}
		@Pc(27) Class2_Sub16 local27 = (Class2_Sub16) this.aClass240_25.method5439((long) arg0);
		return local27 != null;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
	private void method4687() {
		this.aClass240_25 = new Class240(this.aClass240_24.method5440());
		for (@Pc(26) Class2_Sub31 local26 = (Class2_Sub31) this.aClass240_24.method5438(); local26 != null; local26 = (Class2_Sub31) this.aClass240_24.method5436()) {
			@Pc(37) Class2_Sub39 local37 = new Class2_Sub39(local26.aString43, (int) local26.aLong227);
			this.aClass240_25.method5430(Static9.method190(local26.aString43), local37);
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BLclient!md;I)V")
	private void method4688(@OriginalArg(1) Class2_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static82.method1460(arg0.method3693());
		} else if (arg1 == 2) {
			this.aChar4 = Static82.method1460(arg0.method3693());
		} else if (arg1 == 3) {
			this.aString49 = arg0.method3717();
		} else if (arg1 == 4) {
			this.anInt5854 = arg0.method3731();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(45) int local45 = arg0.method3711();
			this.aClass240_24 = new Class240(Static316.method4530(local45));
			for (@Pc(55) int local55 = 0; local55 < local45; local55++) {
				@Pc(61) int local61 = arg0.method3731();
				@Pc(71) Class2 local71;
				if (arg1 == 5) {
					local71 = new Class2_Sub31(arg0.method3717());
				} else {
					local71 = new Class2_Sub16(arg0.method3731());
				}
				this.aClass240_24.method5430((long) local61, local71);
			}
		}
	}
}
