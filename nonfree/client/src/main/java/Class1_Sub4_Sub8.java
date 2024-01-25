import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class1_Sub4_Sub8 extends Class1_Sub4 {

	@OriginalMember(owner = "client!dj", name = "v", descriptor = "Lclient!tm;")
	public Class197 aClass197_4;

	@OriginalMember(owner = "client!dj", name = "x", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!dj", name = "A", descriptor = "Lclient!tm;")
	private Class197 aClass197_5;

	@OriginalMember(owner = "client!dj", name = "D", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!dj", name = "H", descriptor = "I")
	private int anInt1665;

	@OriginalMember(owner = "client!dj", name = "G", descriptor = "Ljava/lang/String;")
	private String aString18 = "null";

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)I")
	public int method1431(@OriginalArg(0) int arg0) {
		if (this.aClass197_4 == null) {
			return this.anInt1665;
		} else {
			@Pc(23) Class1_Sub13 local23 = (Class1_Sub13) this.aClass197_4.method5157((long) arg0);
			return local23 == null ? this.anInt1665 : local23.anInt1849;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLclient!bg;)V")
	public void method1432(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4532();
			if (local17 == 0) {
				return;
			}
			this.method1433(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!bg;Z)V")
	private void method1433(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static29.method765(arg1.method4558());
		} else if (arg0 == 2) {
			this.aChar2 = Static29.method765(arg1.method4558());
		} else if (arg0 == 3) {
			this.aString18 = arg1.method4534();
		} else if (arg0 == 4) {
			this.anInt1665 = arg1.method4545();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(49) int local49 = arg1.method4556();
			this.aClass197_4 = new Class197(Static194.method3745(local49));
			for (@Pc(59) int local59 = 0; local59 < local49; local59++) {
				@Pc(65) int local65 = arg1.method4545();
				@Pc(77) Class1 local77;
				if (arg0 == 5) {
					local77 = new Class1_Sub31(arg1.method4534());
				} else {
					local77 = new Class1_Sub13(arg1.method4545());
				}
				this.aClass197_4.method5166(local77, (long) local65);
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZ)Z")
	public boolean method1435(@OriginalArg(0) int arg0) {
		if (this.aClass197_4 == null) {
			return false;
		}
		if (this.aClass197_5 == null) {
			this.method1438();
		}
		@Pc(22) Class1_Sub13 local22 = (Class1_Sub13) this.aClass197_5.method5157((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method1436(@OriginalArg(0) String arg0) {
		if (this.aClass197_4 == null) {
			return false;
		}
		if (this.aClass197_5 == null) {
			this.method1437();
		}
		for (@Pc(25) Class1_Sub9 local25 = (Class1_Sub9) this.aClass197_5.method5157(Static45.method1053(arg0)); local25 != null; local25 = (Class1_Sub9) this.aClass197_5.method5160()) {
			if (local25.aString17.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
	private void method1437() {
		this.aClass197_5 = new Class197(this.aClass197_4.method5159());
		for (@Pc(26) Class1_Sub31 local26 = (Class1_Sub31) this.aClass197_4.method5161(); local26 != null; local26 = (Class1_Sub31) this.aClass197_4.method5154()) {
			@Pc(37) Class1_Sub9 local37 = new Class1_Sub9(local26.aString55, (int) local26.aLong213);
			this.aClass197_5.method5166(local37, Static45.method1053(local26.aString55));
		}
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V")
	private void method1438() {
		this.aClass197_5 = new Class197(this.aClass197_4.method5159());
		for (@Pc(25) Class1_Sub13 local25 = (Class1_Sub13) this.aClass197_4.method5161(); local25 != null; local25 = (Class1_Sub13) this.aClass197_4.method5154()) {
			@Pc(34) Class1_Sub13 local34 = new Class1_Sub13((int) local25.aLong213);
			this.aClass197_5.method5166(local34, (long) local25.anInt1849);
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method1440(@OriginalArg(1) int arg0) {
		if (this.aClass197_4 == null) {
			return this.aString18;
		} else {
			@Pc(23) Class1_Sub31 local23 = (Class1_Sub31) this.aClass197_4.method5157((long) arg0);
			return local23 == null ? this.aString18 : local23.aString55;
		}
	}
}
