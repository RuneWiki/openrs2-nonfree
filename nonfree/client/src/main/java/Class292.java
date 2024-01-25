import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class292 {

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!rm", name = "m", descriptor = "Lclient!sga;")
	public Class307 aClass307_45;

	@OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
	private int anInt8745;

	@OriginalMember(owner = "client!rm", name = "p", descriptor = "Lclient!sga;")
	private Class307 aClass307_46;

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "Ljava/lang/String;")
	private String aString97 = "null";

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)I")
	public int method7212(@OriginalArg(0) int arg0) {
		if (this.aClass307_45 == null) {
			return this.anInt8745;
		} else {
			@Pc(17) Class3_Sub8 local17 = (Class3_Sub8) this.aClass307_45.method7424((long) arg0);
			return local17 == null ? this.anInt8745 : local17.anInt706;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public boolean method7213(@OriginalArg(1) String arg0) {
		if (this.aClass307_45 == null) {
			return false;
		}
		if (this.aClass307_46 == null) {
			this.method7214();
		}
		for (@Pc(33) Class3_Sub28 local33 = (Class3_Sub28) this.aClass307_46.method7424(Static517.method7435(arg0)); local33 != null; local33 = (Class3_Sub28) this.aClass307_46.method7422()) {
			if (local33.aString50.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
	private void method7214() {
		this.aClass307_46 = new Class307(this.aClass307_45.method7429());
		for (@Pc(25) Class3_Sub44 local25 = (Class3_Sub44) this.aClass307_45.method7421(); local25 != null; local25 = (Class3_Sub44) this.aClass307_45.method7428()) {
			@Pc(36) Class3_Sub28 local36 = new Class3_Sub28(local25.aString102, (int) local25.aLong277);
			this.aClass307_46.method7425(Static517.method7435(local25.aString102), local36);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method7216(@OriginalArg(1) int arg0) {
		if (this.aClass307_45 == null) {
			return this.aString97;
		} else {
			@Pc(17) Class3_Sub44 local17 = (Class3_Sub44) this.aClass307_45.method7424((long) arg0);
			return local17 == null ? this.aString97 : local17.aString102;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
	private void method7217() {
		this.aClass307_46 = new Class307(this.aClass307_45.method7429());
		for (@Pc(28) Class3_Sub8 local28 = (Class3_Sub8) this.aClass307_45.method7421(); local28 != null; local28 = (Class3_Sub8) this.aClass307_45.method7428()) {
			@Pc(37) Class3_Sub8 local37 = new Class3_Sub8((int) local28.aLong277);
			this.aClass307_46.method7425((long) local28.anInt706, local37);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!tn;BI)V")
	private void method7218(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static278.method6290(arg0.method8440());
		} else if (arg1 == 2) {
			this.aChar5 = Static278.method6290(arg0.method8440());
		} else if (arg1 == 3) {
			this.aString97 = arg0.method8413();
		} else if (arg1 == 4) {
			this.anInt8745 = arg0.method8402();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(29) int local29 = arg0.method8414();
			this.aClass307_45 = new Class307(Static95.method2482(local29));
			for (@Pc(39) int local39 = 0; local39 < local29; local39++) {
				@Pc(45) int local45 = arg0.method8402();
				@Pc(55) Class3 local55;
				if (arg1 == 5) {
					local55 = new Class3_Sub44(arg0.method8413());
				} else {
					local55 = new Class3_Sub8(arg0.method8402());
				}
				this.aClass307_45.method7425((long) local45, local55);
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(II)Z")
	public boolean method7219(@OriginalArg(0) int arg0) {
		if (this.aClass307_45 == null) {
			return false;
		}
		if (this.aClass307_46 == null) {
			this.method7217();
		}
		@Pc(22) Class3_Sub8 local22 = (Class3_Sub8) this.aClass307_46.method7424((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!tn;I)V")
	public void method7220(@OriginalArg(0) Class3_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8401();
			if (local5 == 0) {
				return;
			}
			this.method7218(arg0, local5);
		}
	}
}
