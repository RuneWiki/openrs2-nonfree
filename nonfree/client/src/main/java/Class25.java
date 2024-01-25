import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class25 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "Lclient!tca;")
	public Class333 aClass333_4;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "Lclient!tca;")
	private Class333 aClass333_5;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
	private int anInt831;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "Ljava/lang/String;")
	private String aString13 = "null";

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	private void method722() {
		this.aClass333_5 = new Class333(this.aClass333_4.method7491());
		for (@Pc(20) Class3_Sub24 local20 = (Class3_Sub24) this.aClass333_4.method7490(); local20 != null; local20 = (Class3_Sub24) this.aClass333_4.method7487()) {
			@Pc(34) Class3_Sub24 local34 = new Class3_Sub24((int) local20.aLong313);
			this.aClass333_5.method7488((long) local20.anInt3846, local34);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
	public int method725(@OriginalArg(0) int arg0) {
		if (this.aClass333_4 == null) {
			return this.anInt829;
		} else {
			@Pc(22) Class3_Sub24 local22 = (Class3_Sub24) this.aClass333_4.method7489((long) arg0);
			return local22 == null ? this.anInt829 : local22.anInt3846;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method726(@OriginalArg(1) String arg0) {
		if (this.aClass333_4 == null) {
			return false;
		}
		if (this.aClass333_5 == null) {
			this.method729();
		}
		for (@Pc(27) Class3_Sub45 local27 = (Class3_Sub45) this.aClass333_5.method7489(Static621.method8395(arg0)); local27 != null; local27 = (Class3_Sub45) this.aClass333_5.method7484()) {
			if (local27.aString103.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)Z")
	public boolean method727(@OriginalArg(0) int arg0) {
		if (this.aClass333_4 == null) {
			return false;
		}
		if (this.aClass333_5 == null) {
			this.method722();
		}
		@Pc(27) Class3_Sub24 local27 = (Class3_Sub24) this.aClass333_5.method7489((long) arg0);
		return local27 != null;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(II)Ljava/lang/String;")
	public String method728(@OriginalArg(0) int arg0) {
		if (this.aClass333_4 == null) {
			return this.aString13;
		} else {
			@Pc(17) Class3_Sub19 local17 = (Class3_Sub19) this.aClass333_4.method7489((long) arg0);
			return local17 == null ? this.aString13 : local17.aString42;
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
	private void method729() {
		this.aClass333_5 = new Class333(this.aClass333_4.method7491());
		for (@Pc(28) Class3_Sub19 local28 = (Class3_Sub19) this.aClass333_4.method7490(); local28 != null; local28 = (Class3_Sub19) this.aClass333_4.method7487()) {
			@Pc(39) Class3_Sub45 local39 = new Class3_Sub45(local28.aString42, (int) local28.aLong313);
			this.aClass333_5.method7488(Static621.method8395(local28.aString42), local39);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!dt;II)V")
	private void method730(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static363.method8911(arg0.method7960());
		} else if (arg1 == 2) {
			this.aChar1 = Static363.method8911(arg0.method7960());
		} else if (arg1 == 3) {
			this.aString13 = arg0.method7922();
		} else if (arg1 == 4) {
			this.anInt829 = arg0.method7895();
		} else if (arg1 == 5 || arg1 == 6) {
			this.anInt831 = arg0.method7951();
			this.aClass333_4 = new Class333(Static585.method7772(this.anInt831));
			for (@Pc(56) int local56 = 0; local56 < this.anInt831; local56++) {
				@Pc(62) int local62 = arg0.method7895();
				@Pc(72) Class3 local72;
				if (arg1 == 5) {
					local72 = new Class3_Sub19(arg0.method7922());
				} else {
					local72 = new Class3_Sub24(arg0.method7895());
				}
				this.aClass333_4.method7488((long) local62, local72);
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!dt;B)V")
	public void method732(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7954();
			if (local5 == 0) {
				return;
			}
			this.method730(arg0, local5);
		}
	}
}
