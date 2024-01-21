import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WUMSOEQS")
public final class Class46 {

	@OriginalMember(owner = "client!WUMSOEQS", name = "b", descriptor = "I")
	private int anInt783;

	@OriginalMember(owner = "client!WUMSOEQS", name = "c", descriptor = "I")
	private int anInt784;

	@OriginalMember(owner = "client!WUMSOEQS", name = "a", descriptor = "I")
	private int anInt782 = 22419;

	@OriginalMember(owner = "client!WUMSOEQS", name = "d", descriptor = "Lclient!MUOTSYDS;")
	private Class1_Sub1 aClass1_Sub1_37 = new Class1_Sub1();

	@OriginalMember(owner = "client!WUMSOEQS", name = "h", descriptor = "Lclient!KZFVEUEL;")
	private Class20 aClass20_2 = new Class20(9);

	@OriginalMember(owner = "client!WUMSOEQS", name = "e", descriptor = "I")
	private int anInt785;

	@OriginalMember(owner = "client!WUMSOEQS", name = "f", descriptor = "I")
	private int anInt786;

	@OriginalMember(owner = "client!WUMSOEQS", name = "g", descriptor = "Lclient!GRIRTYPY;")
	private Class13 aClass13_1;

	@OriginalMember(owner = "client!WUMSOEQS", name = "<init>", descriptor = "(BI)V")
	public Class46(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt785 = arg1;
			@Pc(23) boolean local23 = false;
			this.anInt786 = arg1;
			this.aClass13_1 = new Class13((byte) 2, 1024);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("66038, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WUMSOEQS", name = "a", descriptor = "(J)Lclient!MUOTSYDS;")
	public Class1_Sub1 method557(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass13_1.method145(arg0);
		if (local5 == null) {
			this.anInt783++;
		} else {
			this.aClass20_2.method245(local5);
			this.anInt784++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!WUMSOEQS", name = "a", descriptor = "(IJLclient!MUOTSYDS;)V")
	public void method558(@OriginalArg(1) long arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		try {
			if (this.anInt786 == 0) {
				@Pc(8) Class1_Sub1 local8 = this.aClass20_2.method246();
				local8.method560();
				local8.method511();
				if (local8 == this.aClass1_Sub1_37) {
					local8 = this.aClass20_2.method246();
					local8.method560();
					local8.method511();
				}
			} else {
				this.anInt786--;
			}
			this.aClass13_1.method146(arg1, arg0);
			this.aClass20_2.method245(arg1);
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("57332, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WUMSOEQS", name = "a", descriptor = "()V")
	public void method559() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass20_2.method246();
			if (local3 == null) {
				this.anInt786 = this.anInt785;
				return;
			}
			local3.method560();
			local3.method511();
		}
	}
}
