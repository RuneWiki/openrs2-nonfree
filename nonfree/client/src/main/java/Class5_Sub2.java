import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!n", name = "v", descriptor = "Lclient!va;")
	private Class64 aClass64_6;

	@OriginalMember(owner = "client!n", name = "A", descriptor = "I")
	private int anInt1732;

	@OriginalMember(owner = "client!n", name = "C", descriptor = "Z")
	private boolean aBoolean91;

	@OriginalMember(owner = "client!n", name = "K", descriptor = "Z")
	private boolean aBoolean92;

	@OriginalMember(owner = "client!n", name = "M", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!n", name = "T", descriptor = "Lclient!jb;")
	private final Class32 aClass32_3;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!jb;)V")
	public Class5_Sub2(@OriginalArg(0) Class32 arg0) {
		this.aClass32_3 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IBI)V")
	@Override
	public void method1226(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			arg1 = 1;
		}
		@Pc(16) int local16 = Static28.method621(arg1) - arg0;
		if (this.aClass64_6 != null) {
			this.anInt1732 = local16;
		} else if (this.aBoolean92) {
			try {
				Static112.method313(this.aClass32_3.anApplet1, "midibox.volume=" + local16 + ";");
			} catch (@Pc(44) Throwable local44) {
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
	@Override
	public void method1228() {
		if (this.aClass64_6 == null || this.aClass64_6.anInt2678 == 0) {
			return;
		}
		if (this.aClass64_6.anInt2678 == 1) {
			@Pc(27) Class59 local27 = (Class59) this.aClass64_6.anObject6;
			try {
				local27.method1758(0, this.aByteArray14, this.aByteArray14.length);
				local27.method1757();
				try {
					Static112.method313(this.aClass32_3.anApplet1, "midibox.loop=" + (this.aBoolean91 ? "\"infinite\"" : "0") + "; midibox.src=\"" + local27.method1756().getPath().replace('\\', '/') + "\"; midibox.volume=" + this.anInt1732 + ";");
					this.aBoolean92 = true;
				} catch (@Pc(79) Throwable local79) {
				}
			} catch (@Pc(81) Exception local81) {
				try {
					local27.method1757();
				} catch (@Pc(86) Exception local86) {
				}
			}
		}
		this.aClass64_6 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZI)V")
	@Override
	public void method1233(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
	@Override
	public void method1231() {
		if (this.aBoolean92) {
			try {
				Static112.method313(this.aClass32_3.anApplet1, "midibox.src=\"c:/silence.mid\";");
			} catch (@Pc(21) Throwable local21) {
			}
			this.aBoolean92 = false;
		}
		this.aClass64_6 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZBI[B)V")
	@Override
	public void method1234(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		this.aClass64_6 = this.aClass32_3.method954();
		if (this.aClass64_6 == null) {
			return;
		}
		if (arg1 == 0) {
			arg1 = 1;
		}
		this.anInt1732 = Static28.method621(arg1);
		this.aByteArray14 = arg2;
		this.aBoolean91 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
	@Override
	public void method1230() {
	}
}
