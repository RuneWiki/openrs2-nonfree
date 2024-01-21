import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "Z")
	private boolean aBoolean58;

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "Lclient!ed;")
	private Class18 aClass18_5;

	@OriginalMember(owner = "client!ga", name = "J", descriptor = "Z")
	private boolean aBoolean59;

	@OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
	private int anInt1259;

	@OriginalMember(owner = "client!ga", name = "X", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!ga", name = "db", descriptor = "Lclient!lc;")
	private final Class34 aClass34_3;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!lc;)V")
	public Class14_Sub2(@OriginalArg(0) Class34 arg0) {
		this.aClass34_3 = arg0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V")
	@Override
	public void method1077(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
	@Override
	public void method1079() {
		if (this.aBoolean58) {
			try {
				Static119.method1235(this.aClass34_3.anApplet1, "midibox.src=\"c:/silence.mid\";");
			} catch (@Pc(17) Throwable local17) {
			}
			this.aBoolean58 = false;
		}
		this.aClass18_5 = null;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
	@Override
	public void method1078() {
		if (this.aClass18_5 == null || this.aClass18_5.anInt1028 == 0) {
			return;
		}
		if (this.aClass18_5.anInt1028 == 1) {
			@Pc(27) Class48 local27 = (Class48) this.aClass18_5.anObject3;
			try {
				local27.method1470(this.aByteArray8, 0, this.aByteArray8.length);
				local27.method1469();
				try {
					Static119.method1235(this.aClass34_3.anApplet1, "midibox.loop=" + (this.aBoolean59 ? "\"infinite\"" : "0") + "; midibox.src=\"" + local27.method1467().getPath().replace('\\', '/') + "\"; midibox.volume=" + this.anInt1259 + ";");
					this.aBoolean58 = true;
				} catch (@Pc(79) Throwable local79) {
				}
			} catch (@Pc(81) Exception local81) {
				try {
					local27.method1469();
				} catch (@Pc(86) Exception local86) {
				}
			}
		}
		this.aClass18_5 = null;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V")
	@Override
	public void method1082() {
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BII)V")
	@Override
	public void method1080(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			arg0 = 1;
		}
		@Pc(20) int local20 = Static56.method1238(arg0) - arg1;
		if (this.aClass18_5 != null) {
			this.anInt1259 = local20;
		} else if (this.aBoolean58) {
			try {
				Static119.method1235(this.aClass34_3.anApplet1, "midibox.volume=" + local20 + ";");
			} catch (@Pc(47) Throwable local47) {
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([BZII)V")
	@Override
	public void method1076(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		this.aClass18_5 = this.aClass34_3.method1264();
		if (this.aClass18_5 == null) {
			return;
		}
		if (arg2 == 0) {
			arg2 = 1;
		}
		this.anInt1259 = Static56.method1238(arg2);
		this.aByteArray8 = arg0;
		this.aBoolean59 = arg1;
	}
}
