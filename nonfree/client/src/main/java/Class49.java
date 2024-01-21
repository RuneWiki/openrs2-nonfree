import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZYLCKQCD")
public final class Class49 {

	@OriginalMember(owner = "client!ZYLCKQCD", name = "b", descriptor = "I")
	private int anInt817;

	@OriginalMember(owner = "client!ZYLCKQCD", name = "c", descriptor = "I")
	private int anInt818;

	@OriginalMember(owner = "client!ZYLCKQCD", name = "a", descriptor = "I")
	private int anInt816 = 8;

	@OriginalMember(owner = "client!ZYLCKQCD", name = "d", descriptor = "Lclient!RZDMTEAZ;")
	private Class4_Sub1 aClass4_Sub1_37 = new Class4_Sub1();

	@OriginalMember(owner = "client!ZYLCKQCD", name = "h", descriptor = "Lclient!NAZXUZWI;")
	private Class27 aClass27_2 = new Class27(0);

	@OriginalMember(owner = "client!ZYLCKQCD", name = "e", descriptor = "I")
	private int anInt819;

	@OriginalMember(owner = "client!ZYLCKQCD", name = "f", descriptor = "I")
	private int anInt820;

	@OriginalMember(owner = "client!ZYLCKQCD", name = "g", descriptor = "Lclient!WIZYUELH;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!ZYLCKQCD", name = "<init>", descriptor = "(BI)V")
	public Class49(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt819 = arg1;
			this.anInt820 = arg1;
			this.aClass39_1 = new Class39(8172, 1024);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("99312, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZYLCKQCD", name = "a", descriptor = "(J)Lclient!RZDMTEAZ;")
	public Class4_Sub1 method570(@OriginalArg(0) long arg0) {
		@Pc(5) Class4_Sub1 local5 = (Class4_Sub1) this.aClass39_1.method479(arg0);
		if (local5 == null) {
			this.anInt817++;
		} else {
			this.aClass27_2.method313(local5);
			this.anInt818++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ZYLCKQCD", name = "a", descriptor = "(Lclient!RZDMTEAZ;IJ)V")
	public void method571(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		try {
			if (this.anInt820 == 0) {
				@Pc(6) Class4_Sub1 local6 = this.aClass27_2.method314();
				local6.method556();
				local6.method557();
				if (local6 == this.aClass4_Sub1_37) {
					local6 = this.aClass27_2.method314();
					local6.method556();
					local6.method557();
				}
			} else {
				this.anInt820--;
			}
			this.aClass39_1.method480(arg0, arg2);
			if (arg1 == 8) {
				this.aClass27_2.method313(arg0);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("7857, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZYLCKQCD", name = "a", descriptor = "()V")
	public void method572() {
		while (true) {
			@Pc(3) Class4_Sub1 local3 = this.aClass27_2.method314();
			if (local3 == null) {
				this.anInt820 = this.anInt819;
				return;
			}
			local3.method556();
			local3.method557();
		}
	}
}
