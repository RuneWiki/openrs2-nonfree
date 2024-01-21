import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!db", name = "D", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!db", name = "H", descriptor = "I")
	private int anInt627;

	@OriginalMember(owner = "client!db", name = "O", descriptor = "Z")
	private boolean aBoolean42;

	@OriginalMember(owner = "client!db", name = "R", descriptor = "Lclient!gb;")
	private Class20 aClass20_5;

	@OriginalMember(owner = "client!db", name = "Y", descriptor = "Z")
	private boolean aBoolean43;

	@OriginalMember(owner = "client!db", name = "cb", descriptor = "Lclient!sb;")
	private final Class53 aClass53_2;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!sb;)V")
	public Class14_Sub1(@OriginalArg(0) Class53 arg0) {
		this.aClass53_2 = arg0;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	@Override
	public void method1554() {
		if (this.aBoolean42) {
			try {
				Static116.method1742("midibox.src=\"c:/silence.mid\";", this.aClass53_2.anApplet1);
			} catch (@Pc(19) Throwable local19) {
			}
			this.aBoolean42 = false;
		}
		this.aClass20_5 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	@Override
	public void method1548() {
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)V")
	@Override
	public void method1557(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([BZIZ)V")
	@Override
	public void method1555(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		this.aClass20_5 = this.aClass53_2.method1633();
		if (this.aClass20_5 == null) {
			return;
		}
		if (arg1 == 0) {
			arg1 = 1;
		}
		this.anInt627 = Static82.method1423(arg1);
		this.aByteArray16 = arg0;
		this.aBoolean43 = arg2;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III)V")
	@Override
	public void method1549(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			arg0 = 1;
		}
		@Pc(24) int local24 = Static82.method1423(arg0) - arg1;
		if (this.aClass20_5 != null) {
			this.anInt627 = local24;
		} else if (this.aBoolean42) {
			try {
				Static116.method1742("midibox.volume=" + local24 + ";", this.aClass53_2.anApplet1);
			} catch (@Pc(51) Throwable local51) {
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	@Override
	public void method1550() {
		if (this.aClass20_5 == null || this.aClass20_5.anInt1156 == 0) {
			return;
		}
		if (this.aClass20_5.anInt1156 == 1) {
			@Pc(25) Class42 local25 = (Class42) this.aClass20_5.anObject4;
			try {
				local25.method1215(0, this.aByteArray16, this.aByteArray16.length);
				local25.method1216();
				try {
					Static116.method1742("midibox.loop=" + (this.aBoolean43 ? "\"infinite\"" : "0") + "; midibox.src=\"" + local25.method1213().getPath().replace('\\', '/') + "\"; midibox.volume=" + this.anInt627 + ";", this.aClass53_2.anApplet1);
					this.aBoolean42 = true;
				} catch (@Pc(77) Throwable local77) {
				}
			} catch (@Pc(79) Exception local79) {
				try {
					local25.method1216();
				} catch (@Pc(84) Exception local84) {
				}
			}
		}
		this.aClass20_5 = null;
	}
}
