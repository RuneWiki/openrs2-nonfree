import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RYXFUVWJ")
public final class Class31 {

	@OriginalMember(owner = "client!RYXFUVWJ", name = "c", descriptor = "B")
	private static byte aByte32 = 8;

	@OriginalMember(owner = "client!RYXFUVWJ", name = "e", descriptor = "I")
	private int anInt621;

	@OriginalMember(owner = "client!RYXFUVWJ", name = "f", descriptor = "I")
	private int anInt622;

	@OriginalMember(owner = "client!RYXFUVWJ", name = "a", descriptor = "Z")
	private boolean aBoolean152 = false;

	@OriginalMember(owner = "client!RYXFUVWJ", name = "b", descriptor = "B")
	private byte aByte31 = 2;

	@OriginalMember(owner = "client!RYXFUVWJ", name = "d", descriptor = "Z")
	private boolean aBoolean153 = false;

	@OriginalMember(owner = "client!RYXFUVWJ", name = "g", descriptor = "Lclient!FFAASUKE;")
	private Class2_Sub1 aClass2_Sub1_33 = new Class2_Sub1();

	@OriginalMember(owner = "client!RYXFUVWJ", name = "k", descriptor = "Lclient!KHIOJPOB;")
	private Class20 aClass20_2 = new Class20(aByte32);

	@OriginalMember(owner = "client!RYXFUVWJ", name = "h", descriptor = "I")
	private int anInt623;

	@OriginalMember(owner = "client!RYXFUVWJ", name = "i", descriptor = "I")
	private int anInt624;

	@OriginalMember(owner = "client!RYXFUVWJ", name = "j", descriptor = "Lclient!VWNUVMOR;")
	private Class40 aClass40_1;

	@OriginalMember(owner = "client!RYXFUVWJ", name = "<init>", descriptor = "(II)V")
	public Class31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt623 = arg0;
			this.anInt624 = arg0;
			this.aClass40_1 = new Class40(1024, 26357);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("93998, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RYXFUVWJ", name = "a", descriptor = "(J)Lclient!FFAASUKE;")
	public Class2_Sub1 method449(@OriginalArg(0) long arg0) {
		@Pc(5) Class2_Sub1 local5 = (Class2_Sub1) this.aClass40_1.method490(arg0);
		if (local5 == null) {
			this.anInt621++;
		} else {
			this.aClass20_2.method237(local5);
			this.anInt622++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!RYXFUVWJ", name = "a", descriptor = "(ZLclient!FFAASUKE;J)V")
	public void method450(@OriginalArg(1) Class2_Sub1 arg0, @OriginalArg(2) long arg1) {
		try {
			if (this.anInt624 == 0) {
				@Pc(8) Class2_Sub1 local8 = this.aClass20_2.method238();
				local8.method504();
				local8.method505();
				if (local8 == this.aClass2_Sub1_33) {
					local8 = this.aClass20_2.method238();
					local8.method504();
					local8.method505();
				}
			} else {
				this.anInt624--;
			}
			this.aClass40_1.method491(arg0, arg1);
			this.aClass20_2.method237(arg0);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("95743, " + true + ", " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RYXFUVWJ", name = "a", descriptor = "()V")
	public void method451() {
		while (true) {
			@Pc(3) Class2_Sub1 local3 = this.aClass20_2.method238();
			if (local3 == null) {
				this.anInt624 = this.anInt623;
				return;
			}
			local3.method504();
			local3.method505();
		}
	}
}
