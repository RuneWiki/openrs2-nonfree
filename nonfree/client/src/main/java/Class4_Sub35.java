import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class Class4_Sub35 extends Class4 {

	@OriginalMember(owner = "client!oc", name = "G", descriptor = "Z")
	public boolean aBoolean674;

	@OriginalMember(owner = "client!oc", name = "L", descriptor = "Z")
	protected boolean aBoolean678;

	@OriginalMember(owner = "client!oc", name = "Q", descriptor = "Z")
	protected boolean aBoolean681;

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "Z")
	public boolean aBoolean667 = true;

	@OriginalMember(owner = "client!oc", name = "z", descriptor = "Z")
	public boolean aBoolean672 = false;

	@OriginalMember(owner = "client!oc", name = "E", descriptor = "I")
	public int anInt9918 = 0;

	@OriginalMember(owner = "client!oc", name = "I", descriptor = "Z")
	public boolean aBoolean675 = false;

	@OriginalMember(owner = "client!oc", name = "x", descriptor = "Z")
	public boolean aBoolean671 = true;

	@OriginalMember(owner = "client!oc", name = "F", descriptor = "I")
	public int anInt9919 = 0;

	@OriginalMember(owner = "client!oc", name = "w", descriptor = "Z")
	public boolean aBoolean670 = true;

	@OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
	protected int anInt9920 = 2;

	@OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
	public int anInt9914 = 0;

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "Z")
	public boolean aBoolean669 = false;

	@OriginalMember(owner = "client!oc", name = "P", descriptor = "Z")
	public boolean aBoolean680 = true;

	@OriginalMember(owner = "client!oc", name = "A", descriptor = "I")
	public int anInt9915 = 0;

	@OriginalMember(owner = "client!oc", name = "K", descriptor = "Z")
	public boolean aBoolean677 = true;

	@OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
	public int anInt9927 = 127;

	@OriginalMember(owner = "client!oc", name = "C", descriptor = "I")
	public int anInt9916 = 127;

	@OriginalMember(owner = "client!oc", name = "B", descriptor = "Z")
	public boolean aBoolean673 = true;

	@OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
	public int anInt9912 = 0;

	@OriginalMember(owner = "client!oc", name = "X", descriptor = "I")
	public int anInt9928 = 0;

	@OriginalMember(owner = "client!oc", name = "U", descriptor = "I")
	public int anInt9926 = 127;

	@OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
	public int anInt9923 = 0;

	@OriginalMember(owner = "client!oc", name = "Y", descriptor = "I")
	public int anInt9929 = 127;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "Z")
	public boolean aBoolean668 = true;

	@OriginalMember(owner = "client!oc", name = "cb", descriptor = "I")
	protected int anInt9932 = 0;

	@OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
	public int anInt9917 = 2;

	@OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
	public int anInt9913 = 3;

	@OriginalMember(owner = "client!oc", name = "eb", descriptor = "Z")
	public boolean aBoolean684 = true;

	@OriginalMember(owner = "client!oc", name = "fb", descriptor = "I")
	public int anInt9934 = 3;

	@OriginalMember(owner = "client!oc", name = "Z", descriptor = "Z")
	public boolean aBoolean683 = true;

	@OriginalMember(owner = "client!oc", name = "gb", descriptor = "I")
	protected int anInt9935 = 0;

	@OriginalMember(owner = "client!oc", name = "ab", descriptor = "I")
	public int anInt9930 = 127;

	@OriginalMember(owner = "client!oc", name = "db", descriptor = "I")
	public int anInt9933 = 2;

	@OriginalMember(owner = "client!oc", name = "M", descriptor = "Z")
	public boolean aBoolean679 = true;

	@OriginalMember(owner = "client!oc", name = "V", descriptor = "Z")
	protected boolean aBoolean682 = true;

	@OriginalMember(owner = "client!oc", name = "J", descriptor = "Z")
	public boolean aBoolean676 = true;

	@OriginalMember(owner = "client!oc", name = "bb", descriptor = "I")
	public int anInt9931 = 1;

	@OriginalMember(owner = "client!oc", name = "jb", descriptor = "I")
	public int anInt9938 = 2;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	protected Class4_Sub35() {
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZI)V")
	public final void method7611(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (Static517.method8194(arg1)) {
			this.aBoolean681 = arg0;
		} else {
			this.aBoolean678 = arg0;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!ek;I)V")
	public final void method7612(@OriginalArg(0) Class4_Sub13 arg0) {
		arg0.method7052(22);
		arg0.method7052(this.anInt9913);
		arg0.method7052(this.aBoolean682 ? 1 : 0);
		arg0.method7052(this.aBoolean671 ? 1 : 0);
		arg0.method7052(this.aBoolean667 ? 1 : 0);
		arg0.method7052(this.aBoolean676 ? 1 : 0);
		arg0.method7052(0);
		arg0.method7052(this.aBoolean683 ? 1 : 0);
		arg0.method7052(this.aBoolean680 ? 1 : 0);
		arg0.method7052(this.aBoolean684 ? 1 : 0);
		arg0.method7052(this.anInt9920);
		arg0.method7052(this.anInt9932);
		arg0.method7052(this.aBoolean681 ? 1 : 0);
		arg0.method7052(this.aBoolean678 ? 1 : 0);
		arg0.method7052(this.aBoolean677 ? 1 : 0);
		arg0.method7052(this.aBoolean673 ? 1 : 0);
		arg0.method7052(this.anInt9928);
		arg0.method7052(this.aBoolean668 ? 1 : 0);
		arg0.method7052(this.anInt9916);
		arg0.method7052(this.anInt9930);
		arg0.method7052(this.anInt9926);
		arg0.method7052(this.anInt9929);
		arg0.method7052(this.anInt9927);
		arg0.method7038(this.anInt9919);
		arg0.method7038(this.anInt9912);
		arg0.method7052(Static488.method7101());
		arg0.method7032(this.anInt9915);
		arg0.method7052(this.anInt9917);
		arg0.method7052(this.aBoolean672 ? 1 : 0);
		arg0.method7052(this.aBoolean674 ? 1 : 0);
		arg0.method7052(this.anInt9923);
		arg0.method7052(this.aBoolean669 ? 1 : 0);
		arg0.method7052(this.aBoolean679 ? 1 : 0);
		arg0.method7052(this.anInt9931);
		arg0.method7052(this.aBoolean670 ? 1 : 0);
		arg0.method7052(this.anInt9933);
		arg0.method7052(this.anInt9938);
		arg0.method7052(this.aBoolean675 ? 1 : 0);
		arg0.method7052(this.anInt9934);
		arg0.method7052(this.anInt9935);
		arg0.method7052(this.anInt9918);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZ)I")
	public final int method7614(@OriginalArg(0) int arg0) {
		return Static517.method8194(arg0) ? this.anInt9920 : this.anInt9932;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)Z")
	public final boolean method7615(@OriginalArg(1) int arg0) {
		return Static517.method8194(arg0) ? this.aBoolean681 : this.aBoolean678;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V")
	public final void method7618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static517.method8194(arg0)) {
			this.anInt9920 = arg1;
		} else {
			this.anInt9932 = arg1;
		}
	}
}
