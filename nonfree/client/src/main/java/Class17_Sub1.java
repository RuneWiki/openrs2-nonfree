import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class17_Sub1 extends Class17 {

	@OriginalMember(owner = "client!db", name = "N", descriptor = "I")
	private int anInt615;

	@OriginalMember(owner = "client!db", name = "Q", descriptor = "Lclient!ma;")
	private Class48 aClass48_1;

	@OriginalMember(owner = "client!db", name = "S", descriptor = "Z")
	private boolean aBoolean43;

	@OriginalMember(owner = "client!db", name = "Y", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!db", name = "ab", descriptor = "Z")
	private boolean aBoolean44;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "Lclient!g;")
	private final Class28 aClass28_3;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!g;)V")
	public Class17_Sub1(@OriginalArg(0) Class28 arg0) {
		this.aClass28_3 = arg0;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
	@Override
	public void method2009(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
	@Override
	public void method2004() {
		if (this.aClass48_1 == null || this.aClass48_1.anInt1534 == 0) {
			return;
		}
		if (this.aClass48_1.anInt1534 == 1) {
			@Pc(27) Class53 local27 = (Class53) this.aClass48_1.anObject5;
			try {
				local27.method1238(this.aByteArray5.length, this.aByteArray5, 0);
				local27.method1239();
				try {
					Static127.method1096(this.aClass28_3.anApplet1, "midibox.loop=" + (this.aBoolean43 ? "\"infinite\"" : "0") + "; midibox.src=\"" + local27.method1242().getPath().replace('\\', '/') + "\"; midibox.volume=" + this.anInt615 + ";");
					this.aBoolean44 = true;
				} catch (@Pc(81) Throwable local81) {
				}
			} catch (@Pc(83) Exception local83) {
				try {
					local27.method1239();
				} catch (@Pc(88) Exception local88) {
				}
			}
		}
		this.aClass48_1 = null;
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
	@Override
	public void method2008() {
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III)V")
	@Override
	public void method2000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			arg1 = 1;
		}
		@Pc(22) int local22 = Static86.method1415(arg1) - arg0;
		if (this.aClass48_1 != null) {
			this.anInt615 = local22;
		} else if (this.aBoolean44) {
			try {
				Static127.method1096(this.aClass28_3.anApplet1, "midibox.volume=" + local22 + ";");
			} catch (@Pc(49) Throwable local49) {
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZIB[B)V")
	@Override
	public void method2007(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		this.aClass48_1 = this.aClass28_3.method577();
		if (this.aClass48_1 == null) {
			return;
		}
		if (arg1 == 0) {
			arg1 = 1;
		}
		this.anInt615 = Static86.method1415(arg1);
		this.aBoolean43 = arg0;
		this.aByteArray5 = arg2;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	@Override
	public void method2001() {
		if (this.aBoolean44) {
			try {
				Static127.method1096(this.aClass28_3.anApplet1, "midibox.src=\"c:/silence.mid\";");
			} catch (@Pc(11) Throwable local11) {
			}
			this.aBoolean44 = false;
		}
		this.aClass48_1 = null;
	}
}
