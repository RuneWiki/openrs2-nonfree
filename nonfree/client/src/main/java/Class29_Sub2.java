import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class29_Sub2 extends Class29 {

	@OriginalMember(owner = "client!ue", name = "M", descriptor = "I")
	private int anInt2742;

	@OriginalMember(owner = "client!ue", name = "O", descriptor = "Z")
	private boolean aBoolean128;

	@OriginalMember(owner = "client!ue", name = "S", descriptor = "Lclient!jd;")
	private Class34 aClass34_7;

	@OriginalMember(owner = "client!ue", name = "X", descriptor = "Z")
	private boolean aBoolean129;

	@OriginalMember(owner = "client!ue", name = "cb", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!ue", name = "N", descriptor = "Lclient!c;")
	private final Class11 aClass11_3;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!c;)V")
	public Class29_Sub2(@OriginalArg(0) Class11 arg0) {
		this.aClass11_3 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
	@Override
	public void method1929() {
		if (this.aClass34_7 == null || this.aClass34_7.anInt1269 == 0) {
			return;
		}
		if (this.aClass34_7.anInt1269 == 1) {
			@Pc(30) Class16 local30 = (Class16) this.aClass34_7.anObject2;
			try {
				local30.method349(this.aByteArray24, 0, this.aByteArray24.length);
				local30.method345();
				try {
					Static123.method837(this.aClass11_3.anApplet1, "midibox.loop=" + (this.aBoolean129 ? "\"infinite\"" : "0") + "; midibox.src=\"" + local30.method346().getPath().replace('\\', '/') + "\"; midibox.volume=" + this.anInt2742 + ";");
					this.aBoolean128 = true;
				} catch (@Pc(82) Throwable local82) {
				}
			} catch (@Pc(84) Exception local84) {
				try {
					local30.method345();
				} catch (@Pc(89) Exception local89) {
				}
			}
		}
		this.aClass34_7 = null;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	@Override
	public void method1933() {
		if (this.aBoolean128) {
			try {
				Static123.method837(this.aClass11_3.anApplet1, "midibox.src=\"c:/silence.mid\";");
			} catch (@Pc(11) Throwable local11) {
			}
			this.aBoolean128 = false;
		}
		this.aClass34_7 = null;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z[BII)V")
	@Override
	public void method1935(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass34_7 = this.aClass11_3.method233();
		if (this.aClass34_7 == null) {
			return;
		}
		if (arg2 == 0) {
			arg2 = 1;
		}
		this.anInt2742 = Static67.method1164(arg2);
		this.aByteArray24 = arg1;
		this.aBoolean129 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
	@Override
	public void method1936() {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)V")
	@Override
	public void method1934(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
	@Override
	public void method1930(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			arg1 = 1;
		}
		@Pc(23) int local23 = Static67.method1164(arg1) - arg0;
		if (this.aClass34_7 != null) {
			this.anInt2742 = local23;
		} else if (this.aBoolean128) {
			try {
				Static123.method837(this.aClass11_3.anApplet1, "midibox.volume=" + local23 + ";");
			} catch (@Pc(50) Throwable local50) {
			}
		}
	}
}
