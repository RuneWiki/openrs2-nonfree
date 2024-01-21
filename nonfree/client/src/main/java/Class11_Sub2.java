import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!oc", name = "v", descriptor = "Z")
	private boolean aBoolean90;

	@OriginalMember(owner = "client!oc", name = "x", descriptor = "Lclient!vb;")
	private Class70 aClass70_6;

	@OriginalMember(owner = "client!oc", name = "A", descriptor = "I")
	private int anInt1932;

	@OriginalMember(owner = "client!oc", name = "B", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!oc", name = "K", descriptor = "Z")
	private boolean aBoolean91;

	@OriginalMember(owner = "client!oc", name = "w", descriptor = "Lclient!ha;")
	private final Class29 aClass29_6;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!ha;)V")
	public Class11_Sub2(@OriginalArg(0) Class29 arg0) {
		this.aClass29_6 = arg0;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
	@Override
	public void method1280() {
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	@Override
	public void method1275() {
		if (this.aClass70_6 == null || this.aClass70_6.anInt2692 == 0) {
			return;
		}
		if (this.aClass70_6.anInt2692 == 1) {
			@Pc(31) Class31 local31 = (Class31) this.aClass70_6.anObject3;
			try {
				local31.method800(this.aByteArray20.length, this.aByteArray20, 0);
				local31.method802();
				try {
					Static126.method1617("midibox.loop=" + (this.aBoolean90 ? "\"infinite\"" : "0") + "; midibox.src=\"" + local31.method804().getPath().replace('\\', '/') + "\"; midibox.volume=" + this.anInt1932 + ";", this.aClass29_6.anApplet1);
					this.aBoolean91 = true;
				} catch (@Pc(87) Throwable local87) {
				}
			} catch (@Pc(89) Exception local89) {
				try {
					local31.method802();
				} catch (@Pc(94) Exception local94) {
				}
			}
		}
		this.aClass70_6 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
	@Override
	public void method1277() {
		if (this.aBoolean91) {
			try {
				Static126.method1617("midibox.src=\"c:/silence.mid\";", this.aClass29_6.anApplet1);
			} catch (@Pc(13) Throwable local13) {
			}
			this.aBoolean91 = false;
		}
		this.aClass70_6 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)V")
	@Override
	public void method1271(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V")
	@Override
	public void method1278(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			arg0 = 1;
		}
		@Pc(17) int local17 = Static23.method551(arg0) - arg1;
		if (this.aClass70_6 != null) {
			this.anInt1932 = local17;
		} else if (this.aBoolean91) {
			try {
				Static126.method1617("midibox.volume=" + local17 + ";", this.aClass29_6.anApplet1);
				return;
			} catch (@Pc(48) Throwable local48) {
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZI[B)V")
	@Override
	public void method1272(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		this.aClass70_6 = this.aClass29_6.method775();
		if (this.aClass70_6 == null) {
			return;
		}
		if (arg1 == 0) {
			arg1 = 1;
		}
		this.anInt1932 = Static23.method551(arg1);
		this.aByteArray20 = arg2;
		this.aBoolean90 = arg0;
	}
}
