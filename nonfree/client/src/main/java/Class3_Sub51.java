import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public abstract class Class3_Sub51 extends Class3 {

	@OriginalMember(owner = "client!vu", name = "D", descriptor = "Z")
	protected boolean aBoolean675;

	@OriginalMember(owner = "client!vu", name = "N", descriptor = "Z")
	protected boolean aBoolean677;

	@OriginalMember(owner = "client!vu", name = "W", descriptor = "Z")
	public boolean aBoolean681;

	@OriginalMember(owner = "client!vu", name = "w", descriptor = "Z")
	public boolean aBoolean673 = true;

	@OriginalMember(owner = "client!vu", name = "r", descriptor = "I")
	public int anInt9942 = 127;

	@OriginalMember(owner = "client!vu", name = "v", descriptor = "Z")
	public boolean aBoolean672 = true;

	@OriginalMember(owner = "client!vu", name = "q", descriptor = "I")
	public int anInt9941 = 0;

	@OriginalMember(owner = "client!vu", name = "y", descriptor = "I")
	public int anInt9944 = 2;

	@OriginalMember(owner = "client!vu", name = "C", descriptor = "I")
	protected int anInt9948 = 0;

	@OriginalMember(owner = "client!vu", name = "A", descriptor = "I")
	public int anInt9946 = 0;

	@OriginalMember(owner = "client!vu", name = "I", descriptor = "I")
	public int anInt9952 = 127;

	@OriginalMember(owner = "client!vu", name = "F", descriptor = "I")
	public int anInt9950 = 3;

	@OriginalMember(owner = "client!vu", name = "R", descriptor = "Z")
	public boolean aBoolean679 = true;

	@OriginalMember(owner = "client!vu", name = "M", descriptor = "I")
	public int anInt9955 = 2;

	@OriginalMember(owner = "client!vu", name = "u", descriptor = "Z")
	public boolean aBoolean671 = true;

	@OriginalMember(owner = "client!vu", name = "H", descriptor = "I")
	public int anInt9951 = 127;

	@OriginalMember(owner = "client!vu", name = "V", descriptor = "Z")
	public boolean aBoolean680 = true;

	@OriginalMember(owner = "client!vu", name = "s", descriptor = "Z")
	public boolean aBoolean670 = true;

	@OriginalMember(owner = "client!vu", name = "J", descriptor = "I")
	public int anInt9953 = 2;

	@OriginalMember(owner = "client!vu", name = "Q", descriptor = "Z")
	public boolean aBoolean678 = false;

	@OriginalMember(owner = "client!vu", name = "hb", descriptor = "I")
	protected int anInt9966 = 2;

	@OriginalMember(owner = "client!vu", name = "ib", descriptor = "Z")
	public boolean aBoolean685 = true;

	@OriginalMember(owner = "client!vu", name = "jb", descriptor = "Z")
	public boolean aBoolean686 = false;

	@OriginalMember(owner = "client!vu", name = "Z", descriptor = "Z")
	public boolean aBoolean682 = true;

	@OriginalMember(owner = "client!vu", name = "B", descriptor = "I")
	public int anInt9947 = 0;

	@OriginalMember(owner = "client!vu", name = "db", descriptor = "I")
	protected int anInt9963 = 0;

	@OriginalMember(owner = "client!vu", name = "x", descriptor = "Z")
	public boolean aBoolean674 = true;

	@OriginalMember(owner = "client!vu", name = "G", descriptor = "Z")
	public boolean aBoolean676 = true;

	@OriginalMember(owner = "client!vu", name = "Y", descriptor = "I")
	public int anInt9961 = 0;

	@OriginalMember(owner = "client!vu", name = "eb", descriptor = "I")
	public int anInt9964 = 0;

	@OriginalMember(owner = "client!vu", name = "mb", descriptor = "I")
	public int anInt9968 = 0;

	@OriginalMember(owner = "client!vu", name = "E", descriptor = "I")
	public int anInt9949 = 127;

	@OriginalMember(owner = "client!vu", name = "t", descriptor = "I")
	public int anInt9943 = 1;

	@OriginalMember(owner = "client!vu", name = "O", descriptor = "I")
	public int anInt9956 = 3;

	@OriginalMember(owner = "client!vu", name = "ab", descriptor = "Z")
	protected boolean aBoolean683 = true;

	@OriginalMember(owner = "client!vu", name = "T", descriptor = "I")
	public int anInt9958 = 127;

	@OriginalMember(owner = "client!vu", name = "ob", descriptor = "I")
	public int anInt9970 = 0;

	@OriginalMember(owner = "client!vu", name = "pb", descriptor = "Z")
	public boolean aBoolean687 = false;

	@OriginalMember(owner = "client!vu", name = "fb", descriptor = "Z")
	public boolean aBoolean684 = true;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "()V")
	protected Class3_Sub51() {
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IZI)V")
	public final void method7821(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static328.method4867(arg0)) {
			this.aBoolean677 = arg1;
		} else {
			this.aBoolean675 = arg1;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(II)Z")
	public final boolean method7824(@OriginalArg(1) int arg0) {
		return Static328.method4867(arg0) ? this.aBoolean677 : this.aBoolean675;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZLclient!ie;)V")
	public final void method7827(@OriginalArg(1) Class3_Sub26 arg0) {
		arg0.method6809(22);
		arg0.method6809(this.anInt9950);
		arg0.method6809(this.aBoolean683 ? 1 : 0);
		arg0.method6809(this.aBoolean671 ? 1 : 0);
		arg0.method6809(this.aBoolean682 ? 1 : 0);
		arg0.method6809(this.aBoolean679 ? 1 : 0);
		arg0.method6809(0);
		arg0.method6809(this.aBoolean673 ? 1 : 0);
		arg0.method6809(this.aBoolean680 ? 1 : 0);
		arg0.method6809(this.aBoolean684 ? 1 : 0);
		arg0.method6809(this.anInt9966);
		arg0.method6809(this.anInt9948);
		arg0.method6809(this.aBoolean677 ? 1 : 0);
		arg0.method6809(this.aBoolean675 ? 1 : 0);
		arg0.method6809(this.aBoolean674 ? 1 : 0);
		arg0.method6809(this.aBoolean670 ? 1 : 0);
		arg0.method6809(this.anInt9961);
		arg0.method6809(this.aBoolean676 ? 1 : 0);
		arg0.method6809(this.anInt9949);
		arg0.method6809(this.anInt9958);
		arg0.method6809(this.anInt9952);
		arg0.method6809(this.anInt9942);
		arg0.method6809(this.anInt9951);
		arg0.method6769(this.anInt9970);
		arg0.method6769(this.anInt9947);
		arg0.method6809(Static79.method1840());
		arg0.method6826(this.anInt9968);
		arg0.method6809(this.anInt9953);
		arg0.method6809(this.aBoolean687 ? 1 : 0);
		arg0.method6809(this.aBoolean681 ? 1 : 0);
		arg0.method6809(this.anInt9946);
		arg0.method6809(this.aBoolean686 ? 1 : 0);
		arg0.method6809(this.aBoolean672 ? 1 : 0);
		arg0.method6809(this.anInt9943);
		arg0.method6809(this.aBoolean685 ? 1 : 0);
		arg0.method6809(this.anInt9955);
		arg0.method6809(this.anInt9944);
		arg0.method6809(this.aBoolean678 ? 1 : 0);
		arg0.method6809(this.anInt9956);
		arg0.method6809(this.anInt9963);
		arg0.method6809(this.anInt9964);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIZ)V")
	public final void method7828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static328.method4867(arg0)) {
			this.anInt9966 = arg1;
		} else {
			this.anInt9948 = arg1;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZI)I")
	public final int method7830(@OriginalArg(1) int arg0) {
		return Static328.method4867(arg0) ? this.anInt9966 : this.anInt9948;
	}
}
