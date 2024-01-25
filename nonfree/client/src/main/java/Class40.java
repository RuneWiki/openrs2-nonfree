import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class40 {

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "Lclient!waa;")
	private Class350 aClass350_3;

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "Lclient!waa;")
	public Class350 aClass350_4;

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
	private int anInt750;

	@OriginalMember(owner = "client!bt", name = "q", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!bt", name = "s", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "Ljava/lang/String;")
	private String aString4 = "null";

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)Z")
	public boolean method669(@OriginalArg(0) int arg0) {
		if (this.aClass350_4 == null) {
			return false;
		}
		if (this.aClass350_3 == null) {
			this.method671();
		}
		@Pc(30) Class4_Sub38 local30 = (Class4_Sub38) this.aClass350_3.method8207((long) arg0);
		return local30 != null;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)V")
	private void method671() {
		this.aClass350_3 = new Class350(this.aClass350_4.method8208());
		for (@Pc(27) Class4_Sub38 local27 = (Class4_Sub38) this.aClass350_4.method8198(); local27 != null; local27 = (Class4_Sub38) this.aClass350_4.method8205()) {
			@Pc(36) Class4_Sub38 local36 = new Class4_Sub38((int) local27.aLong268);
			this.aClass350_3.method8199((long) local27.anInt8496, local36);
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method673(@OriginalArg(1) int arg0) {
		if (this.aClass350_4 == null) {
			return this.aString4;
		} else {
			@Pc(23) Class4_Sub50 local23 = (Class4_Sub50) this.aClass350_4.method8207((long) arg0);
			return local23 == null ? this.aString4 : local23.aString105;
		}
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(II)I")
	public int method674(@OriginalArg(0) int arg0) {
		if (this.aClass350_4 == null) {
			return this.anInt750;
		} else {
			@Pc(23) Class4_Sub38 local23 = (Class4_Sub38) this.aClass350_4.method8207((long) arg0);
			return local23 == null ? this.anInt750 : local23.anInt8496;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
	private void method676() {
		this.aClass350_3 = new Class350(this.aClass350_4.method8208());
		for (@Pc(27) Class4_Sub50 local27 = (Class4_Sub50) this.aClass350_4.method8198(); local27 != null; local27 = (Class4_Sub50) this.aClass350_4.method8205()) {
			@Pc(38) Class4_Sub26 local38 = new Class4_Sub26(local27.aString105, (int) local27.aLong268);
			this.aClass350_3.method8199(Static29.method365(local27.aString105), local38);
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILclient!un;)V")
	public void method677(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4905();
			if (local5 == 0) {
				return;
			}
			this.method678(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILclient!un;)V")
	private void method678(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static103.method2211(arg1.method4925());
		} else if (arg0 == 2) {
			this.aChar3 = Static103.method2211(arg1.method4925());
		} else if (arg0 == 3) {
			this.aString4 = arg1.method4920();
		} else if (arg0 == 4) {
			this.anInt750 = arg1.method4931();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(57) int local57 = arg1.method4936();
			this.aClass350_4 = new Class350(Static341.method5553(local57));
			for (@Pc(67) int local67 = 0; local67 < local57; local67++) {
				@Pc(73) int local73 = arg1.method4931();
				@Pc(83) Class4 local83;
				if (arg0 == 5) {
					local83 = new Class4_Sub50(arg1.method4920());
				} else {
					local83 = new Class4_Sub38(arg1.method4931());
				}
				this.aClass350_4.method8199((long) local73, local83);
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method679(@OriginalArg(1) String arg0) {
		if (this.aClass350_4 == null) {
			return false;
		}
		if (this.aClass350_3 == null) {
			this.method676();
		}
		for (@Pc(33) Class4_Sub26 local33 = (Class4_Sub26) this.aClass350_3.method8207(Static29.method365(arg0)); local33 != null; local33 = (Class4_Sub26) this.aClass350_3.method8200()) {
			if (local33.aString59.equals(arg0)) {
				return true;
			}
		}
		return false;
	}
}
