import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!tb", name = "B", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!tb", name = "D", descriptor = "Z")
	private boolean aBoolean112;

	@OriginalMember(owner = "client!tb", name = "L", descriptor = "Lclient!f;")
	private Class19 aClass19_8;

	@OriginalMember(owner = "client!tb", name = "R", descriptor = "Z")
	private boolean aBoolean114;

	@OriginalMember(owner = "client!tb", name = "fb", descriptor = "I")
	private int anInt2518;

	@OriginalMember(owner = "client!tb", name = "bb", descriptor = "Lclient!cc;")
	private final Class12 aClass12_4;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!cc;)V")
	public Class11_Sub2(@OriginalArg(0) Class12 arg0) {
		this.aClass12_4 = arg0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V")
	@Override
	public void method1859(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			arg0 = 1;
		}
		@Pc(14) int local14 = Static94.method1793(arg0) - arg1;
		if (this.aClass19_8 != null) {
			this.anInt2518 = local14;
		} else if (this.aBoolean114) {
			try {
				Static110.method126("midibox.volume=" + local14 + ";", this.aClass12_4.anApplet1);
				return;
			} catch (@Pc(37) Throwable local37) {
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
	@Override
	public void method1861() {
		if (this.aBoolean114) {
			try {
				Static110.method126("midibox.src=\"c:/silence.mid\";", this.aClass12_4.anApplet1);
			} catch (@Pc(19) Throwable local19) {
			}
			this.aBoolean114 = false;
		}
		this.aClass19_8 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)V")
	@Override
	public void method1867(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)V")
	@Override
	public void method1868() {
		if (this.aClass19_8 == null || this.aClass19_8.anInt799 == 0) {
			return;
		}
		if (this.aClass19_8.anInt799 == 1) {
			@Pc(29) Class58 local29 = (Class58) this.aClass19_8.anObject3;
			try {
				local29.method1713(0, this.aByteArray23, this.aByteArray23.length);
				local29.method1709();
				try {
					Static110.method126("midibox.loop=" + (this.aBoolean112 ? "\"infinite\"" : "0") + "; midibox.src=\"" + local29.method1711().getPath().replace('\\', '/') + "\"; midibox.volume=" + this.anInt2518 + ";", this.aClass12_4.anApplet1);
					this.aBoolean114 = true;
				} catch (@Pc(81) Throwable local81) {
				}
			} catch (@Pc(83) Exception local83) {
				try {
					local29.method1709();
				} catch (@Pc(88) Exception local88) {
				}
			}
		}
		this.aClass19_8 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BZI[B)V")
	@Override
	public void method1862(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		this.aClass19_8 = this.aClass12_4.method333();
		if (this.aClass19_8 == null) {
			return;
		}
		if (arg1 == 0) {
			arg1 = 1;
		}
		this.anInt2518 = Static94.method1793(arg1);
		this.aBoolean112 = arg0;
		this.aByteArray23 = arg2;
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
	@Override
	public void method1866() {
	}
}
