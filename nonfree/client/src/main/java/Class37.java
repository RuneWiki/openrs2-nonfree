import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VLLJSJTJ")
public final class Class37 {

	@OriginalMember(owner = "client!VLLJSJTJ", name = "g", descriptor = "Lclient!WWONSPNF;")
	private Class8 aClass8_38;

	@OriginalMember(owner = "client!VLLJSJTJ", name = "a", descriptor = "I")
	private int anInt714 = -918;

	@OriginalMember(owner = "client!VLLJSJTJ", name = "b", descriptor = "Z")
	private boolean aBoolean162 = false;

	@OriginalMember(owner = "client!VLLJSJTJ", name = "c", descriptor = "I")
	private int anInt715 = 280;

	@OriginalMember(owner = "client!VLLJSJTJ", name = "d", descriptor = "Z")
	private boolean aBoolean163 = true;

	@OriginalMember(owner = "client!VLLJSJTJ", name = "e", descriptor = "I")
	private int anInt716 = 504;

	@OriginalMember(owner = "client!VLLJSJTJ", name = "f", descriptor = "Lclient!WWONSPNF;")
	private Class8 aClass8_37 = new Class8();

	@OriginalMember(owner = "client!VLLJSJTJ", name = "<init>", descriptor = "(B)V")
	public Class37(@OriginalArg(0) byte arg0) {
		try {
			this.aClass8_37.aClass8_41 = this.aClass8_37;
			this.aClass8_37.aClass8_42 = this.aClass8_37;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("42353, " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLLJSJTJ", name = "a", descriptor = "(Lclient!WWONSPNF;)V")
	public void method488(@OriginalArg(0) Class8 arg0) {
		if (arg0.aClass8_42 != null) {
			arg0.method554();
		}
		arg0.aClass8_42 = this.aClass8_37.aClass8_42;
		arg0.aClass8_41 = this.aClass8_37;
		arg0.aClass8_42.aClass8_41 = arg0;
		arg0.aClass8_41.aClass8_42 = arg0;
	}

	@OriginalMember(owner = "client!VLLJSJTJ", name = "a", descriptor = "(ILclient!WWONSPNF;)V")
	public void method489(@OriginalArg(1) Class8 arg0) {
		try {
			if (arg0.aClass8_42 != null) {
				arg0.method554();
			}
			arg0.aClass8_42 = this.aClass8_37;
			arg0.aClass8_41 = this.aClass8_37.aClass8_41;
			arg0.aClass8_42.aClass8_41 = arg0;
			arg0.aClass8_41.aClass8_42 = arg0;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("13509, " + -593 + ", " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLLJSJTJ", name = "a", descriptor = "()Lclient!WWONSPNF;")
	public Class8 method490() {
		@Pc(3) Class8 local3 = this.aClass8_37.aClass8_41;
		if (local3 == this.aClass8_37) {
			return null;
		} else {
			local3.method554();
			return local3;
		}
	}

	@OriginalMember(owner = "client!VLLJSJTJ", name = "b", descriptor = "()Lclient!WWONSPNF;")
	public Class8 method491() {
		@Pc(3) Class8 local3 = this.aClass8_37.aClass8_41;
		if (local3 == this.aClass8_37) {
			this.aClass8_38 = null;
			return null;
		} else {
			this.aClass8_38 = local3.aClass8_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!VLLJSJTJ", name = "a", descriptor = "(I)Lclient!WWONSPNF;")
	public Class8 method492() {
		try {
			@Pc(10) Class8 local10 = this.aClass8_37.aClass8_42;
			if (local10 == this.aClass8_37) {
				this.aClass8_38 = null;
				return null;
			} else {
				this.aClass8_38 = local10.aClass8_42;
				return local10;
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("39663, " + 22498 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLLJSJTJ", name = "a", descriptor = "(Z)Lclient!WWONSPNF;")
	public Class8 method493() {
		try {
			@Pc(2) Class8 local2 = this.aClass8_38;
			if (local2 == this.aClass8_37) {
				this.aClass8_38 = null;
				return null;
			} else {
				this.aClass8_38 = local2.aClass8_41;
				return local2;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("50574, " + true + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLLJSJTJ", name = "b", descriptor = "(I)Lclient!WWONSPNF;")
	public Class8 method494() {
		try {
			@Pc(2) Class8 local2 = this.aClass8_38;
			if (local2 == this.aClass8_37) {
				this.aClass8_38 = null;
				return null;
			} else {
				this.aClass8_38 = local2.aClass8_42;
				return local2;
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("21828, " + 280 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLLJSJTJ", name = "c", descriptor = "()V")
	public void method495() {
		if (this.aClass8_37.aClass8_41 == this.aClass8_37) {
			return;
		}
		while (true) {
			@Pc(10) Class8 local10 = this.aClass8_37.aClass8_41;
			if (local10 == this.aClass8_37) {
				return;
			}
			local10.method554();
		}
	}
}
