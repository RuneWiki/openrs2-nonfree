import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!md", name = "E", descriptor = "Z")
	private boolean aBoolean90;

	@OriginalMember(owner = "client!md", name = "F", descriptor = "Lclient!ud;")
	private Class59 aClass59_1;

	@OriginalMember(owner = "client!md", name = "P", descriptor = "Z")
	private boolean aBoolean91;

	@OriginalMember(owner = "client!md", name = "R", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!md", name = "U", descriptor = "I")
	private int anInt1532;

	@OriginalMember(owner = "client!md", name = "z", descriptor = "Lclient!vb;")
	private final Class60 aClass60_2;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!vb;)V")
	public Class14_Sub2(@OriginalArg(0) Class60 arg0) {
		this.aClass60_2 = arg0;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V")
	@Override
	public void method1426() {
		if (this.aBoolean91) {
			try {
				Static112.method281("midibox.src=\"c:/silence.mid\";", this.aClass60_2.anApplet1);
			} catch (@Pc(15) Throwable local15) {
			}
			this.aBoolean91 = false;
		}
		this.aClass59_1 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	@Override
	public void method1420() {
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
	@Override
	public void method1424() {
		if (this.aClass59_1 == null || this.aClass59_1.anInt2522 == 0) {
			return;
		}
		if (this.aClass59_1.anInt2522 == 1) {
			@Pc(32) Class36 local32 = (Class36) this.aClass59_1.anObject3;
			try {
				local32.method892(this.aByteArray19, this.aByteArray19.length, 0);
				local32.method887();
				try {
					Static112.method281("midibox.loop=" + (this.aBoolean90 ? "\"infinite\"" : "0") + "; midibox.src=\"" + local32.method889().getPath().replace('\\', '/') + "\"; midibox.volume=" + this.anInt1532 + ";", this.aClass60_2.anApplet1);
					this.aBoolean91 = true;
				} catch (@Pc(84) Throwable local84) {
				}
			} catch (@Pc(86) Exception local86) {
				try {
					local32.method887();
				} catch (@Pc(91) Exception local91) {
				}
			}
		}
		this.aClass59_1 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IBI)V")
	@Override
	public void method1423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			arg1 = 1;
		}
		@Pc(17) int local17 = Static87.method1575(arg1) - arg0;
		if (this.aClass59_1 != null) {
			this.anInt1532 = local17;
		} else if (this.aBoolean91) {
			try {
				Static112.method281("midibox.volume=" + local17 + ";", this.aClass60_2.anApplet1);
			} catch (@Pc(52) Throwable local52) {
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I[BIZ)V")
	@Override
	public void method1421(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		this.aClass59_1 = this.aClass60_2.method1806();
		if (this.aClass59_1 == null) {
			return;
		}
		if (arg1 == 0) {
			arg1 = 1;
		}
		this.anInt1532 = Static87.method1575(arg1);
		this.aBoolean90 = arg2;
		this.aByteArray19 = arg0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)V")
	@Override
	public void method1425(@OriginalArg(0) int arg0) {
	}
}
