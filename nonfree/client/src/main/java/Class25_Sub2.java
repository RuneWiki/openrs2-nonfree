import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class25_Sub2 extends Class25 {

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "Z")
	private boolean aBoolean81;

	@OriginalMember(owner = "client!mb", name = "O", descriptor = "Lclient!sc;")
	private Class58 aClass58_6;

	@OriginalMember(owner = "client!mb", name = "Q", descriptor = "Z")
	private boolean aBoolean82;

	@OriginalMember(owner = "client!mb", name = "ab", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
	private int anInt1800;

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "Lclient!ed;")
	private final Class23 aClass23_4;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!ed;)V")
	public Class25_Sub2(@OriginalArg(0) Class23 arg0) {
		this.aClass23_4 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(IB)V")
	@Override
	public void method1156(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)V")
	@Override
	public void method1151() {
		if (this.aBoolean81) {
			try {
				Static123.method1779("midibox.src=\"c:/silence.mid\";", this.aClass23_4.anApplet1);
			} catch (@Pc(15) Throwable local15) {
			}
			this.aBoolean81 = false;
		}
		this.aClass58_6 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V")
	@Override
	public void method1158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			arg1 = 1;
		}
		@Pc(11) int local11 = Static68.method995(arg1) - arg0;
		if (this.aClass58_6 != null) {
			this.anInt1800 = local11;
		} else if (this.aBoolean81) {
			try {
				Static123.method1779("midibox.volume=" + local11 + ";", this.aClass23_4.anApplet1);
				return;
			} catch (@Pc(38) Throwable local38) {
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	@Override
	public void method1150() {
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	@Override
	public void method1157() {
		if (this.aClass58_6 == null || this.aClass58_6.anInt2474 == 0) {
			return;
		}
		if (this.aClass58_6.anInt2474 == 1) {
			@Pc(25) Class10 local25 = (Class10) this.aClass58_6.anObject4;
			try {
				local25.method291(this.aByteArray13.length, 0, this.aByteArray13);
				local25.method286();
				try {
					Static123.method1779("midibox.loop=" + (this.aBoolean82 ? "\"infinite\"" : "0") + "; midibox.src=\"" + local25.method287().getPath().replace('\\', '/') + "\"; midibox.volume=" + this.anInt1800 + ";", this.aClass23_4.anApplet1);
					this.aBoolean81 = true;
				} catch (@Pc(77) Throwable local77) {
				}
			} catch (@Pc(79) Exception local79) {
				try {
					local25.method286();
				} catch (@Pc(84) Exception local84) {
				}
			}
		}
		this.aClass58_6 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[BBZ)V")
	@Override
	public void method1154(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2) {
		this.aClass58_6 = this.aClass23_4.method528();
		if (this.aClass58_6 == null) {
			return;
		}
		if (arg0 == 0) {
			arg0 = 1;
		}
		this.anInt1800 = Static68.method995(arg0);
		this.aByteArray13 = arg1;
		this.aBoolean82 = arg2;
	}
}
