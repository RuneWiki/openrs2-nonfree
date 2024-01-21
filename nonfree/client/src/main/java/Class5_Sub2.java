import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!oe", name = "O", descriptor = "Z")
	private boolean aBoolean97;

	@OriginalMember(owner = "client!oe", name = "P", descriptor = "Z")
	private boolean aBoolean98;

	@OriginalMember(owner = "client!oe", name = "T", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!oe", name = "U", descriptor = "I")
	private int anInt2102;

	@OriginalMember(owner = "client!oe", name = "Y", descriptor = "Lclient!gd;")
	private Class25 aClass25_6;

	@OriginalMember(owner = "client!oe", name = "N", descriptor = "Lclient!fb;")
	private final Class20 aClass20_3;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!fb;)V")
	public Class5_Sub2(@OriginalArg(0) Class20 arg0) {
		this.aClass20_3 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)V")
	@Override
	public void method1607() {
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
	@Override
	public void method1598() {
		if (this.aClass25_6 == null || this.aClass25_6.anInt1212 == 0) {
			return;
		}
		if (this.aClass25_6.anInt1212 == 1) {
			@Pc(27) Class29 local27 = (Class29) this.aClass25_6.anObject3;
			try {
				local27.method913(this.aByteArray10, 0, this.aByteArray10.length);
				local27.method912();
				try {
					Static118.method1072(this.aClass20_3.anApplet1, "midibox.loop=" + (this.aBoolean98 ? "\"infinite\"" : "0") + "; midibox.src=\"" + local27.method911().getPath().replace('\\', '/') + "\"; midibox.volume=" + this.anInt2102 + ";");
					this.aBoolean97 = true;
				} catch (@Pc(79) Throwable local79) {
				}
			} catch (@Pc(81) Exception local81) {
				try {
					local27.method912();
				} catch (@Pc(86) Exception local86) {
				}
			}
		}
		this.aClass25_6 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([BZII)V")
	@Override
	public void method1600(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass25_6 = this.aClass20_3.method720();
		if (this.aClass25_6 == null) {
			return;
		}
		if (arg2 == 0) {
			arg2 = 1;
		}
		this.anInt2102 = Static94.method1797(arg2);
		this.aBoolean98 = arg1;
		this.aByteArray10 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZI)V")
	@Override
	public void method1604(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			arg0 = 1;
		}
		@Pc(13) int local13 = Static94.method1797(arg0) - arg1;
		if (this.aClass25_6 != null) {
			this.anInt2102 = local13;
		} else if (this.aBoolean97) {
			try {
				Static118.method1072(this.aClass20_3.anApplet1, "midibox.volume=" + local13 + ";");
			} catch (@Pc(41) Throwable local41) {
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)V")
	@Override
	public void method1602(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	@Override
	public void method1606() {
		if (this.aBoolean97) {
			try {
				Static118.method1072(this.aClass20_3.anApplet1, "midibox.src=\"c:/silence.mid\";");
			} catch (@Pc(11) Throwable local11) {
			}
			this.aBoolean97 = false;
		}
		this.aClass25_6 = null;
	}
}
