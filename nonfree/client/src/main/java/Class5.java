import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BMKJVFXV")
public final class Class5 {

	@OriginalMember(owner = "client!BMKJVFXV", name = "c", descriptor = "I")
	private int anInt67;

	@OriginalMember(owner = "client!BMKJVFXV", name = "d", descriptor = "I")
	private int anInt68;

	@OriginalMember(owner = "client!BMKJVFXV", name = "a", descriptor = "Z")
	private boolean aBoolean40 = true;

	@OriginalMember(owner = "client!BMKJVFXV", name = "b", descriptor = "B")
	private byte aByte11 = -108;

	@OriginalMember(owner = "client!BMKJVFXV", name = "e", descriptor = "Lclient!ICYNFRTV;")
	private Class2_Sub1 aClass2_Sub1_9 = new Class2_Sub1();

	@OriginalMember(owner = "client!BMKJVFXV", name = "i", descriptor = "Lclient!ELLPUVEP;")
	private Class11 aClass11_1 = new Class11((byte) 5);

	@OriginalMember(owner = "client!BMKJVFXV", name = "f", descriptor = "I")
	private int anInt69;

	@OriginalMember(owner = "client!BMKJVFXV", name = "g", descriptor = "I")
	private int anInt70;

	@OriginalMember(owner = "client!BMKJVFXV", name = "h", descriptor = "Lclient!LTJSGGCA;")
	private Class26 aClass26_1;

	@OriginalMember(owner = "client!BMKJVFXV", name = "<init>", descriptor = "(II)V")
	public Class5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt69 = arg1;
			this.anInt70 = arg1;
			this.aClass26_1 = new Class26(1024, -645);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("50920, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BMKJVFXV", name = "a", descriptor = "(J)Lclient!ICYNFRTV;")
	public Class2_Sub1 method77(@OriginalArg(0) long arg0) {
		@Pc(5) Class2_Sub1 local5 = (Class2_Sub1) this.aClass26_1.method312(arg0);
		if (local5 == null) {
			this.anInt67++;
		} else {
			this.aClass11_1.method180(local5);
			this.anInt68++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!BMKJVFXV", name = "a", descriptor = "(JLclient!ICYNFRTV;B)V")
	public void method78(@OriginalArg(0) long arg0, @OriginalArg(1) Class2_Sub1 arg1, @OriginalArg(2) byte arg2) {
		try {
			if (this.anInt70 == 0) {
				@Pc(8) Class2_Sub1 local8 = this.aClass11_1.method181();
				local8.method530();
				local8.method487();
				if (local8 == this.aClass2_Sub1_9) {
					local8 = this.aClass11_1.method181();
					local8.method530();
					local8.method487();
				}
			} else {
				this.anInt70--;
			}
			this.aClass26_1.method313(arg1, arg0);
			if (arg2 != -108) {
				for (@Pc(43) int local43 = 1; local43 > 0; local43++) {
				}
			}
			this.aClass11_1.method180(arg1);
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("42708, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BMKJVFXV", name = "a", descriptor = "()V")
	public void method79() {
		while (true) {
			@Pc(3) Class2_Sub1 local3 = this.aClass11_1.method181();
			if (local3 == null) {
				this.anInt70 = this.anInt69;
				return;
			}
			local3.method530();
			local3.method487();
		}
	}
}
