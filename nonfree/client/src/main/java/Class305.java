import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class305 {

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!vo", name = "h", descriptor = "Lclient!dea;")
	private Class68 aClass68_79;

	@OriginalMember(owner = "client!vo", name = "l", descriptor = "Lclient!dea;")
	public Class68 aClass68_80;

	@OriginalMember(owner = "client!vo", name = "o", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
	private int anInt9333;

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "Ljava/lang/String;")
	private String aString106 = "null";

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI)I")
	public int method7719(@OriginalArg(1) int arg0) {
		if (this.aClass68_80 == null) {
			return this.anInt9333;
		} else {
			@Pc(22) Class12_Sub18 local22 = (Class12_Sub18) this.aClass68_80.method1917((long) arg0);
			return local22 == null ? this.anInt9333 : local22.anInt3978;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
	private void method7720() {
		this.aClass68_79 = new Class68(this.aClass68_80.method1919());
		for (@Pc(20) Class12_Sub16 local20 = (Class12_Sub16) this.aClass68_80.method1923(); local20 != null; local20 = (Class12_Sub16) this.aClass68_80.method1920()) {
			@Pc(31) Class12_Sub32 local31 = new Class12_Sub32(local20.aString30, (int) local20.aLong248);
			this.aClass68_79.method1916(local31, Static42.method845(local20.aString30));
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!daa;I)V")
	public void method7721(@OriginalArg(0) Class12_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5216();
			if (local9 == 0) {
				return;
			}
			this.method7725(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)V")
	private void method7722() {
		this.aClass68_79 = new Class68(this.aClass68_80.method1919());
		for (@Pc(28) Class12_Sub18 local28 = (Class12_Sub18) this.aClass68_80.method1923(); local28 != null; local28 = (Class12_Sub18) this.aClass68_80.method1920()) {
			@Pc(37) Class12_Sub18 local37 = new Class12_Sub18((int) local28.aLong248);
			this.aClass68_79.method1916(local37, (long) local28.anInt3978);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)Z")
	public boolean method7723(@OriginalArg(1) int arg0) {
		if (this.aClass68_80 == null) {
			return false;
		}
		if (this.aClass68_79 == null) {
			this.method7722();
		}
		@Pc(22) Class12_Sub18 local22 = (Class12_Sub18) this.aClass68_79.method1917((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(BI)Ljava/lang/String;")
	public String method7724(@OriginalArg(1) int arg0) {
		if (this.aClass68_80 == null) {
			return this.aString106;
		} else {
			@Pc(17) Class12_Sub16 local17 = (Class12_Sub16) this.aClass68_80.method1917((long) arg0);
			return local17 == null ? this.aString106 : local17.aString30;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLclient!daa;I)V")
	private void method7725(@OriginalArg(1) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static485.method7249(arg0.method5173());
		} else if (arg1 == 2) {
			this.aChar4 = Static485.method7249(arg0.method5173());
		} else if (arg1 == 3) {
			this.aString106 = arg0.method5206();
		} else if (arg1 == 4) {
			this.anInt9333 = arg0.method5225();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(59) int local59 = arg0.method5199();
			this.aClass68_80 = new Class68(Static37.method6277(local59));
			for (@Pc(69) int local69 = 0; local69 < local59; local69++) {
				@Pc(75) int local75 = arg0.method5225();
				@Pc(87) Class12 local87;
				if (arg1 == 5) {
					local87 = new Class12_Sub16(arg0.method5206());
				} else {
					local87 = new Class12_Sub18(arg0.method5225());
				}
				this.aClass68_80.method1916(local87, (long) local75);
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method7726(@OriginalArg(0) String arg0) {
		if (this.aClass68_80 == null) {
			return false;
		}
		if (this.aClass68_79 == null) {
			this.method7720();
		}
		for (@Pc(27) Class12_Sub32 local27 = (Class12_Sub32) this.aClass68_79.method1917(Static42.method845(arg0)); local27 != null; local27 = (Class12_Sub32) this.aClass68_79.method1918()) {
			if (local27.aString61.equals(arg0)) {
				return true;
			}
		}
		return false;
	}
}
