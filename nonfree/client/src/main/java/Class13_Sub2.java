import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class13_Sub2 extends Class13 {

	@OriginalMember(owner = "client!u", name = "o", descriptor = "Lclient!fa;")
	private Class19 aClass19_8;

	@OriginalMember(owner = "client!u", name = "t", descriptor = "I")
	private int anInt2435;

	@OriginalMember(owner = "client!u", name = "E", descriptor = "Z")
	private boolean aBoolean110;

	@OriginalMember(owner = "client!u", name = "G", descriptor = "Z")
	private boolean aBoolean111;

	@OriginalMember(owner = "client!u", name = "P", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!u", name = "L", descriptor = "Lclient!s;")
	private final Class55 aClass55_4;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!s;)V")
	public Class13_Sub2(@OriginalArg(0) Class55 arg0) {
		this.aClass55_4 = arg0;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
	@Override
	public void method1505() {
		if (this.aClass19_8 == null || this.aClass19_8.anInt879 == 0) {
			return;
		}
		if (this.aClass19_8.anInt879 == 1) {
			@Pc(27) Class52 local27 = (Class52) this.aClass19_8.anObject2;
			try {
				local27.method1260(this.aByteArray17.length, this.aByteArray17, 0);
				local27.method1263();
				try {
					Static115.method1623(this.aClass55_4.anApplet1, "midibox.loop=" + (this.aBoolean110 ? "\"infinite\"" : "0") + "; midibox.src=\"" + local27.method1259().getPath().replace('\\', '/') + "\"; midibox.volume=" + this.anInt2435 + ";");
					this.aBoolean111 = true;
				} catch (@Pc(79) Throwable local79) {
				}
			} catch (@Pc(81) Exception local81) {
				try {
					local27.method1263();
				} catch (@Pc(86) Exception local86) {
				}
			}
		}
		this.aClass19_8 = null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)V")
	@Override
	public void method1504(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIB)V")
	@Override
	public void method1503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			arg0 = 1;
		}
		@Pc(21) int local21 = Static56.method821(arg0) - arg1;
		if (this.aClass19_8 != null) {
			this.anInt2435 = local21;
		} else if (this.aBoolean111) {
			try {
				Static115.method1623(this.aClass55_4.anApplet1, "midibox.volume=" + local21 + ";");
				return;
			} catch (@Pc(48) Throwable local48) {
				return;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	@Override
	public void method1501() {
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I[BIZ)V")
	@Override
	public void method1500(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2) {
		this.aClass19_8 = this.aClass55_4.method1403();
		if (this.aClass19_8 == null) {
			return;
		}
		if (arg0 == 0) {
			arg0 = 1;
		}
		this.anInt2435 = Static56.method821(arg0);
		this.aBoolean110 = arg2;
		this.aByteArray17 = arg1;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
	@Override
	public void method1506() {
		if (this.aBoolean111) {
			try {
				Static115.method1623(this.aClass55_4.anApplet1, "midibox.src=\"c:/silence.mid\";");
			} catch (@Pc(15) Throwable local15) {
			}
			this.aBoolean111 = false;
		}
		this.aClass19_8 = null;
	}
}
