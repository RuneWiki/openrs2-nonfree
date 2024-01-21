import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "Z")
	private boolean aBoolean10;

	@OriginalMember(owner = "client!ca", name = "z", descriptor = "Lclient!u;")
	private Class62 aClass62_7;

	@OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!ca", name = "I", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!ca", name = "K", descriptor = "Z")
	private boolean aBoolean11;

	@OriginalMember(owner = "client!ca", name = "x", descriptor = "Lclient!ra;")
	private final Class54 aClass54_1;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!ra;)V")
	public Class11_Sub1(@OriginalArg(0) Class54 arg0) {
		this.aClass54_1 = arg0;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V")
	@Override
	public void method1111() {
		if (this.aClass62_7 == null || this.aClass62_7.anInt2572 == 0) {
			return;
		}
		if (this.aClass62_7.anInt2572 == 1) {
			@Pc(31) Class60 local31 = (Class60) this.aClass62_7.anObject4;
			try {
				local31.method1653(0, this.aByteArray2, this.aByteArray2.length);
				local31.method1658();
				try {
					Static118.method469(this.aClass54_1.anApplet1, "midibox.loop=" + (this.aBoolean10 ? "\"infinite\"" : "0") + "; midibox.src=\"" + local31.method1657().getPath().replace('\\', '/') + "\"; midibox.volume=" + this.anInt269 + ";");
					this.aBoolean11 = true;
				} catch (@Pc(83) Throwable local83) {
				}
			} catch (@Pc(85) Exception local85) {
				try {
					local31.method1658();
				} catch (@Pc(90) Exception local90) {
				}
			}
		}
		this.aClass62_7 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V")
	@Override
	public void method1107(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			arg0 = 1;
		}
		@Pc(23) int local23 = Static106.method1801(arg0) - arg1;
		if (this.aClass62_7 != null) {
			this.anInt269 = local23;
		} else if (this.aBoolean11) {
			try {
				Static118.method469(this.aClass54_1.anApplet1, "midibox.volume=" + local23 + ";");
				return;
			} catch (@Pc(46) Throwable local46) {
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(BI)V")
	@Override
	public void method1105(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I[BZI)V")
	@Override
	public void method1104(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2) {
		this.aClass62_7 = this.aClass54_1.method1485();
		if (this.aClass62_7 == null) {
			return;
		}
		if (arg0 == 0) {
			arg0 = 1;
		}
		this.anInt269 = Static106.method1801(arg0);
		this.aBoolean10 = arg2;
		this.aByteArray2 = arg1;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V")
	@Override
	public void method1114() {
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	@Override
	public void method1103() {
		if (this.aBoolean11) {
			try {
				Static118.method469(this.aClass54_1.anApplet1, "midibox.src=\"c:/silence.mid\";");
			} catch (@Pc(11) Throwable local11) {
			}
			this.aBoolean11 = false;
		}
		this.aClass62_7 = null;
	}
}
