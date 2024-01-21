import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OOTLZHQB")
public final class Class30 {

	@OriginalMember(owner = "client!OOTLZHQB", name = "a", descriptor = "Z")
	private static boolean aBoolean104 = true;

	@OriginalMember(owner = "client!OOTLZHQB", name = "d", descriptor = "I")
	private int anInt525;

	@OriginalMember(owner = "client!OOTLZHQB", name = "e", descriptor = "I")
	private int anInt526;

	@OriginalMember(owner = "client!OOTLZHQB", name = "b", descriptor = "I")
	private int anInt524 = 573;

	@OriginalMember(owner = "client!OOTLZHQB", name = "c", descriptor = "Z")
	private boolean aBoolean105 = true;

	@OriginalMember(owner = "client!OOTLZHQB", name = "f", descriptor = "Lclient!AGCGSOQI;")
	private Class1_Sub1 aClass1_Sub1_29 = new Class1_Sub1();

	@OriginalMember(owner = "client!OOTLZHQB", name = "j", descriptor = "Lclient!BOZWYCIO;")
	private Class5 aClass5_1 = new Class5(aBoolean104);

	@OriginalMember(owner = "client!OOTLZHQB", name = "g", descriptor = "I")
	private int anInt527;

	@OriginalMember(owner = "client!OOTLZHQB", name = "h", descriptor = "I")
	private int anInt528;

	@OriginalMember(owner = "client!OOTLZHQB", name = "i", descriptor = "Lclient!BVBAURNI;")
	private Class6 aClass6_1;

	@OriginalMember(owner = "client!OOTLZHQB", name = "<init>", descriptor = "(II)V")
	public Class30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt527 = arg0;
			this.anInt528 = arg0;
			this.aClass6_1 = new Class6((byte) -87, 1024);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("8563, " + arg0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OOTLZHQB", name = "a", descriptor = "(J)Lclient!AGCGSOQI;")
	public Class1_Sub1 method329(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass6_1.method90(arg0);
		if (local5 == null) {
			this.anInt525++;
		} else {
			this.aClass5_1.method72(local5);
			this.anInt526++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!OOTLZHQB", name = "a", descriptor = "(JLclient!AGCGSOQI;B)V")
	public void method330(@OriginalArg(0) long arg0, @OriginalArg(1) Class1_Sub1 arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.anInt528 == 0) {
				@Pc(23) Class1_Sub1 local23 = this.aClass5_1.method73();
				local23.method544();
				local23.method545();
				if (local23 == this.aClass1_Sub1_29) {
					local23 = this.aClass5_1.method73();
					local23.method544();
					local23.method545();
				}
			} else {
				this.anInt528--;
			}
			this.aClass6_1.method91(arg1, arg0);
			this.aClass5_1.method72(arg1);
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("10067, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OOTLZHQB", name = "a", descriptor = "()V")
	public void method331() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass5_1.method73();
			if (local3 == null) {
				this.anInt528 = this.anInt527;
				return;
			}
			local3.method544();
			local3.method545();
		}
	}
}
