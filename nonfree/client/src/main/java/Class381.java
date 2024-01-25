import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class381 {

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "Lclient!dj;")
	private Class66 aClass66_45;

	@OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
	private int anInt10158;

	@OriginalMember(owner = "client!vs", name = "l", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!vs", name = "m", descriptor = "C")
	public char aChar6;

	@OriginalMember(owner = "client!vs", name = "o", descriptor = "Lclient!dj;")
	public Class66 aClass66_46;

	@OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
	private int anInt10161;

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "Ljava/lang/String;")
	private String aString121 = "null";

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)Z")
	public boolean method8601(@OriginalArg(1) int arg0) {
		if (this.aClass66_46 == null) {
			return false;
		}
		if (this.aClass66_45 == null) {
			this.method8610();
		}
		@Pc(29) Class4_Sub24 local29 = (Class4_Sub24) this.aClass66_45.method1994((long) arg0);
		return local29 != null;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method8602(@OriginalArg(1) String arg0) {
		if (this.aClass66_46 == null) {
			return false;
		}
		if (this.aClass66_45 == null) {
			this.method8606();
		}
		for (@Pc(30) Class4_Sub19 local30 = (Class4_Sub19) this.aClass66_45.method1994(Static166.method4116(arg0)); local30 != null; local30 = (Class4_Sub19) this.aClass66_45.method1991()) {
			if (local30.aString31.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method8604(@OriginalArg(0) int arg0) {
		if (this.aClass66_46 == null) {
			return this.aString121;
		} else {
			@Pc(17) Class4_Sub46 local17 = (Class4_Sub46) this.aClass66_46.method1994((long) arg0);
			return local17 == null ? this.aString121 : local17.aString110;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
	private void method8606() {
		this.aClass66_45 = new Class66(this.aClass66_46.method1993());
		for (@Pc(24) Class4_Sub46 local24 = (Class4_Sub46) this.aClass66_46.method1992(); local24 != null; local24 = (Class4_Sub46) this.aClass66_46.method1984()) {
			@Pc(35) Class4_Sub19 local35 = new Class4_Sub19(local24.aString110, (int) local24.aLong307);
			this.aClass66_45.method1985(local35, Static166.method4116(local24.aString110));
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILclient!es;I)V")
	private void method8608(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static305.method4280(arg1.method8861());
		} else if (arg0 == 2) {
			this.aChar6 = Static305.method4280(arg1.method8861());
		} else if (arg0 == 3) {
			this.aString121 = arg1.method8853();
		} else if (arg0 == 4) {
			this.anInt10158 = arg1.method8850();
		} else if (arg0 == 5 || arg0 == 6) {
			this.anInt10161 = arg1.method8859();
			this.aClass66_46 = new Class66(Static162.method2593(this.anInt10161));
			for (@Pc(71) int local71 = 0; local71 < this.anInt10161; local71++) {
				@Pc(77) int local77 = arg1.method8850();
				@Pc(87) Class4 local87;
				if (arg0 == 5) {
					local87 = new Class4_Sub46(arg1.method8853());
				} else {
					local87 = new Class4_Sub24(arg1.method8850());
				}
				this.aClass66_46.method1985(local87, (long) local77);
			}
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!es;I)V")
	public void method8609(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method8865();
			if (local12 == 0) {
				return;
			}
			this.method8608(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)V")
	private void method8610() {
		this.aClass66_45 = new Class66(this.aClass66_46.method1993());
		for (@Pc(26) Class4_Sub24 local26 = (Class4_Sub24) this.aClass66_46.method1992(); local26 != null; local26 = (Class4_Sub24) this.aClass66_46.method1984()) {
			@Pc(35) Class4_Sub24 local35 = new Class4_Sub24((int) local26.aLong307);
			this.aClass66_45.method1985(local35, (long) local26.anInt4156);
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IZ)I")
	public int method8611(@OriginalArg(0) int arg0) {
		if (this.aClass66_46 == null) {
			return this.anInt10158;
		} else {
			@Pc(17) Class4_Sub24 local17 = (Class4_Sub24) this.aClass66_46.method1994((long) arg0);
			return local17 == null ? this.anInt10158 : local17.anInt4156;
		}
	}
}
