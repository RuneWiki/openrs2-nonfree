import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WIUIWDML")
public final class Class45 {

	@OriginalMember(owner = "client!WIUIWDML", name = "b", descriptor = "Z")
	private static boolean aBoolean183;

	@OriginalMember(owner = "client!WIUIWDML", name = "c", descriptor = "I")
	private int anInt699;

	@OriginalMember(owner = "client!WIUIWDML", name = "d", descriptor = "I")
	private int anInt700;

	@OriginalMember(owner = "client!WIUIWDML", name = "a", descriptor = "I")
	private int anInt698 = 635;

	@OriginalMember(owner = "client!WIUIWDML", name = "e", descriptor = "Lclient!OBKNBIRU;")
	private Class5_Sub1 aClass5_Sub1_35 = new Class5_Sub1();

	@OriginalMember(owner = "client!WIUIWDML", name = "i", descriptor = "Lclient!HIGYXWXY;")
	private Class19 aClass19_2 = new Class19(aBoolean183);

	@OriginalMember(owner = "client!WIUIWDML", name = "f", descriptor = "I")
	private int anInt701;

	@OriginalMember(owner = "client!WIUIWDML", name = "g", descriptor = "I")
	private int anInt702;

	@OriginalMember(owner = "client!WIUIWDML", name = "h", descriptor = "Lclient!LIHJZCBF;")
	private Class24 aClass24_1;

	@OriginalMember(owner = "client!WIUIWDML", name = "<init>", descriptor = "(II)V")
	public Class45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt701 = arg1;
			this.anInt702 = arg1;
			this.aClass24_1 = new Class24(1024, (byte) -5);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("90953, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WIUIWDML", name = "a", descriptor = "(J)Lclient!OBKNBIRU;")
	public Class5_Sub1 method477(@OriginalArg(0) long arg0) {
		@Pc(5) Class5_Sub1 local5 = (Class5_Sub1) this.aClass24_1.method168(arg0);
		if (local5 == null) {
			this.anInt699++;
		} else {
			this.aClass19_2.method125(local5);
			this.anInt700++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!WIUIWDML", name = "a", descriptor = "(IJLclient!OBKNBIRU;)V")
	public void method478(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class5_Sub1 arg2) {
		try {
			if (this.anInt702 == 0) {
				@Pc(8) Class5_Sub1 local8 = this.aClass19_2.method126();
				local8.method542();
				local8.method543();
				if (local8 == this.aClass5_Sub1_35) {
					local8 = this.aClass19_2.method126();
					local8.method542();
					local8.method543();
				}
			} else {
				this.anInt702--;
			}
			this.aClass24_1.method169(arg2, arg1);
			@Pc(42) int local42 = 78 / arg0;
			this.aClass19_2.method125(arg2);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("14214, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WIUIWDML", name = "a", descriptor = "()V")
	public void method479() {
		while (true) {
			@Pc(3) Class5_Sub1 local3 = this.aClass19_2.method126();
			if (local3 == null) {
				this.anInt702 = this.anInt701;
				return;
			}
			local3.method542();
			local3.method543();
		}
	}
}
