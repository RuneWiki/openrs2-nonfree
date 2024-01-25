import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class165 {

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
	private int anInt4581;

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "Lclient!gu;")
	private Class96 aClass96_30;

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "Lclient!gu;")
	public Class96 aClass96_31;

	@OriginalMember(owner = "client!mr", name = "p", descriptor = "Ljava/lang/String;")
	private String aString40 = "null";

	static {
		new Class7("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!hp;B)V")
	public void method3787(@OriginalArg(0) Class1_Sub5 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method5366();
			if (local3 == 0) {
				return;
			}
			this.method3795(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
	private void method3788() {
		this.aClass96_30 = new Class96(this.aClass96_31.method2333());
		for (@Pc(18) Class1_Sub43 local18 = (Class1_Sub43) this.aClass96_31.method2342(); local18 != null; local18 = (Class1_Sub43) this.aClass96_31.method2339()) {
			@Pc(34) Class1_Sub43 local34 = new Class1_Sub43((int) local18.aLong222);
			this.aClass96_30.method2341((long) local18.anInt6933, local34);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)I")
	public int method3789(@OriginalArg(0) int arg0) {
		if (this.aClass96_31 == null) {
			return this.anInt4581;
		} else {
			@Pc(17) Class1_Sub43 local17 = (Class1_Sub43) this.aClass96_31.method2335((long) arg0);
			return local17 == null ? this.anInt4581 : local17.anInt6933;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IB)Z")
	public boolean method3790(@OriginalArg(0) int arg0) {
		if (this.aClass96_31 == null) {
			return false;
		}
		if (this.aClass96_30 == null) {
			this.method3788();
		}
		@Pc(22) Class1_Sub43 local22 = (Class1_Sub43) this.aClass96_30.method2335((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method3793(@OriginalArg(1) String arg0) {
		if (this.aClass96_31 == null) {
			return false;
		}
		if (this.aClass96_30 == null) {
			this.method3797();
		}
		for (@Pc(31) Class1_Sub30 local31 = (Class1_Sub30) this.aClass96_30.method2335(Static140.method2348(arg0)); local31 != null; local31 = (Class1_Sub30) this.aClass96_30.method2340()) {
			if (local31.aString41.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method3794(@OriginalArg(1) int arg0) {
		if (this.aClass96_31 == null) {
			return this.aString40;
		} else {
			@Pc(25) Class1_Sub12 local25 = (Class1_Sub12) this.aClass96_31.method2335((long) arg0);
			return local25 == null ? this.aString40 : local25.aString11;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILclient!hp;B)V")
	private void method3795(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static246.method4274(arg1.method5416());
		} else if (arg0 == 2) {
			this.aChar2 = Static246.method4274(arg1.method5416());
		} else if (arg0 == 3) {
			this.aString40 = arg1.method5401();
		} else if (arg0 == 4) {
			this.anInt4581 = arg1.method5407();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(51) int local51 = arg1.method5362();
			this.aClass96_31 = new Class96(Static406.method5434(local51));
			for (@Pc(61) int local61 = 0; local61 < local51; local61++) {
				@Pc(66) int local66 = arg1.method5407();
				@Pc(78) Class1 local78;
				if (arg0 == 5) {
					local78 = new Class1_Sub12(arg1.method5401());
				} else {
					local78 = new Class1_Sub43(arg1.method5407());
				}
				this.aClass96_31.method2341((long) local66, local78);
			}
		}
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)V")
	private void method3797() {
		this.aClass96_30 = new Class96(this.aClass96_31.method2333());
		for (@Pc(26) Class1_Sub12 local26 = (Class1_Sub12) this.aClass96_31.method2342(); local26 != null; local26 = (Class1_Sub12) this.aClass96_31.method2339()) {
			@Pc(36) Class1_Sub30 local36 = new Class1_Sub30(local26.aString11, (int) local26.aLong222);
			this.aClass96_30.method2341(Static140.method2348(local26.aString11), local36);
		}
	}
}
