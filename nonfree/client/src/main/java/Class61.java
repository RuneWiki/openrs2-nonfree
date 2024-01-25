import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class61 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
	private int anInt1739;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "Lclient!wb;")
	private Class243 aClass243_6;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "Lclient!wb;")
	public Class243 aClass243_7;

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "Ljava/lang/String;")
	private String aString19 = "null";

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!vt;)V")
	public void method1372(@OriginalArg(1) Class2_Sub24 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5732();
			if (local13 == 0) {
				return;
			}
			this.method1374(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!vt;BI)V")
	private void method1374(@OriginalArg(0) Class2_Sub24 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static168.method2964(arg0.method5759());
		} else if (arg1 == 2) {
			this.aChar3 = Static168.method2964(arg0.method5759());
		} else if (arg1 == 3) {
			this.aString19 = arg0.method5744();
		} else if (arg1 == 4) {
			this.anInt1739 = arg0.method5776();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(43) int local43 = arg0.method5753();
			this.aClass243_7 = new Class243(Static279.method4638(local43));
			for (@Pc(53) int local53 = 0; local53 < local43; local53++) {
				@Pc(59) int local59 = arg0.method5776();
				@Pc(69) Class2 local69;
				if (arg1 == 5) {
					local69 = new Class2_Sub31(arg0.method5744());
				} else {
					local69 = new Class2_Sub16(arg0.method5776());
				}
				this.aClass243_7.method5968((long) local59, local69);
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
	private void method1375() {
		this.aClass243_6 = new Class243(this.aClass243_7.method5966());
		for (@Pc(22) Class2_Sub31 local22 = (Class2_Sub31) this.aClass243_7.method5975(); local22 != null; local22 = (Class2_Sub31) this.aClass243_7.method5973()) {
			@Pc(41) Class2_Sub18 local41 = new Class2_Sub18(local22.aString50, (int) local22.aLong213);
			this.aClass243_6.method5968(Static112.method1693(local22.aString50), local41);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method1376(@OriginalArg(0) String arg0) {
		if (this.aClass243_7 == null) {
			return false;
		}
		if (this.aClass243_6 == null) {
			this.method1375();
		}
		for (@Pc(25) Class2_Sub18 local25 = (Class2_Sub18) this.aClass243_6.method5967(Static112.method1693(arg0)); local25 != null; local25 = (Class2_Sub18) this.aClass243_6.method5971()) {
			if (local25.aString21.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)I")
	public int method1377(@OriginalArg(0) int arg0) {
		if (this.aClass243_7 == null) {
			return this.anInt1739;
		} else {
			@Pc(22) Class2_Sub16 local22 = (Class2_Sub16) this.aClass243_7.method5967((long) arg0);
			return local22 == null ? this.anInt1739 : local22.anInt2601;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)Z")
	public boolean method1378(@OriginalArg(0) int arg0) {
		if (this.aClass243_7 == null) {
			return false;
		}
		if (this.aClass243_6 == null) {
			this.method1379();
		}
		@Pc(22) Class2_Sub16 local22 = (Class2_Sub16) this.aClass243_6.method5967((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	private void method1379() {
		this.aClass243_6 = new Class243(this.aClass243_7.method5966());
		for (@Pc(20) Class2_Sub16 local20 = (Class2_Sub16) this.aClass243_7.method5975(); local20 != null; local20 = (Class2_Sub16) this.aClass243_7.method5973()) {
			@Pc(37) Class2_Sub16 local37 = new Class2_Sub16((int) local20.aLong213);
			this.aClass243_6.method5968((long) local20.anInt2601, local37);
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method1380(@OriginalArg(1) int arg0) {
		if (this.aClass243_7 == null) {
			return this.aString19;
		} else {
			@Pc(23) Class2_Sub31 local23 = (Class2_Sub31) this.aClass243_7.method5967((long) arg0);
			return local23 == null ? this.aString19 : local23.aString50;
		}
	}
}
