import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JLTMYUOM")
public final class Class18 {

	@OriginalMember(owner = "client!JLTMYUOM", name = "a", descriptor = "I")
	private int anInt349;

	@OriginalMember(owner = "client!JLTMYUOM", name = "c", descriptor = "I")
	private int anInt351;

	@OriginalMember(owner = "client!JLTMYUOM", name = "d", descriptor = "I")
	private int anInt352;

	@OriginalMember(owner = "client!JLTMYUOM", name = "b", descriptor = "I")
	private int anInt350 = -17619;

	@OriginalMember(owner = "client!JLTMYUOM", name = "e", descriptor = "Lclient!LMGYBGQR;")
	private Class1_Sub1 aClass1_Sub1_19 = new Class1_Sub1();

	@OriginalMember(owner = "client!JLTMYUOM", name = "i", descriptor = "Lclient!RKSMLTCN;")
	private Class37 aClass37_1 = new Class37(42993);

	@OriginalMember(owner = "client!JLTMYUOM", name = "f", descriptor = "I")
	private int anInt353;

	@OriginalMember(owner = "client!JLTMYUOM", name = "g", descriptor = "I")
	private int anInt354;

	@OriginalMember(owner = "client!JLTMYUOM", name = "h", descriptor = "Lclient!DKRLEWQI;")
	private Class10 aClass10_1;

	@OriginalMember(owner = "client!JLTMYUOM", name = "<init>", descriptor = "(ZI)V")
	public Class18(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt353 = arg1;
			this.anInt354 = arg1;
			this.aClass10_1 = new Class10(false, 1024);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("60453, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JLTMYUOM", name = "a", descriptor = "(J)Lclient!LMGYBGQR;")
	public Class1_Sub1 method216(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass10_1.method64(arg0);
		if (local5 == null) {
			this.anInt351++;
		} else {
			this.aClass37_1.method344(local5);
			this.anInt352++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!JLTMYUOM", name = "a", descriptor = "(IJLclient!LMGYBGQR;)V")
	public void method217(@OriginalArg(1) long arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		try {
			if (this.anInt354 == 0) {
				@Pc(8) Class1_Sub1 local8 = this.aClass37_1.method345();
				local8.method565();
				local8.method566();
				if (local8 == this.aClass1_Sub1_19) {
					local8 = this.aClass37_1.method345();
					local8.method565();
					local8.method566();
				}
			} else {
				this.anInt354--;
			}
			this.aClass10_1.method65(arg0, arg1);
			this.aClass37_1.method344(arg1);
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("80382, " + -561 + ", " + arg0 + ", " + arg1 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JLTMYUOM", name = "a", descriptor = "()V")
	public void method218() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass37_1.method345();
			if (local3 == null) {
				this.anInt354 = this.anInt353;
				return;
			}
			local3.method565();
			local3.method566();
		}
	}
}
