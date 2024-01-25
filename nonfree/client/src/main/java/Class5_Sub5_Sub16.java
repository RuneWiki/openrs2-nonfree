import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pha")
public final class Class5_Sub5_Sub16 extends Class5_Sub5 {

	@OriginalMember(owner = "client!pha", name = "v", descriptor = "Z")
	public boolean aBoolean525 = true;

	@OriginalMember(owner = "client!pha", name = "A", descriptor = "I")
	public int anInt7397 = 12800;

	@OriginalMember(owner = "client!pha", name = "C", descriptor = "I")
	public int anInt7398 = 0;

	@OriginalMember(owner = "client!pha", name = "N", descriptor = "I")
	public int anInt7405 = 0;

	@OriginalMember(owner = "client!pha", name = "J", descriptor = "I")
	public int anInt7402 = -1;

	@OriginalMember(owner = "client!pha", name = "F", descriptor = "I")
	public int anInt7400 = 12800;

	@OriginalMember(owner = "client!pha", name = "y", descriptor = "I")
	public int anInt7395 = -1;

	@OriginalMember(owner = "client!pha", name = "B", descriptor = "Ljava/lang/String;")
	public final String aString79;

	@OriginalMember(owner = "client!pha", name = "I", descriptor = "I")
	public final int anInt7401;

	@OriginalMember(owner = "client!pha", name = "w", descriptor = "I")
	public final int anInt7393;

	@OriginalMember(owner = "client!pha", name = "G", descriptor = "Ljava/lang/String;")
	public final String aString80;

	@OriginalMember(owner = "client!pha", name = "M", descriptor = "Lclient!tg;")
	public final Class330 aClass330_43;

	@OriginalMember(owner = "client!pha", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class5_Sub5_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString79 = arg2;
		this.anInt7401 = arg0;
		this.anInt7393 = arg3;
		this.anInt7395 = arg4;
		this.anInt7402 = arg6;
		this.aString80 = arg1;
		this.aBoolean525 = arg5;
		if (this.anInt7402 == 255) {
			this.anInt7402 = 0;
		}
		this.aClass330_43 = new Class330();
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(I[IZI)Z")
	public boolean method6557(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class5_Sub15 local11 = (Class5_Sub15) this.aClass330_43.method7908(); local11 != null; local11 = (Class5_Sub15) this.aClass330_43.method7914()) {
			if (local11.method1413(arg2, arg0)) {
				local11.method1418(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "([IBIII)Z")
	public boolean method6558(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) Class5_Sub15 local11 = (Class5_Sub15) this.aClass330_43.method7908(); local11 != null; local11 = (Class5_Sub15) this.aClass330_43.method7914()) {
			if (local11.method1412(arg2, arg3, arg1)) {
				local11.method1416(arg1, arg3, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(ZII)Z")
	public boolean method6561(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class5_Sub15 local11 = (Class5_Sub15) this.aClass330_43.method7908(); local11 != null; local11 = (Class5_Sub15) this.aClass330_43.method7914()) {
			if (local11.method1415(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(III[I)Z")
	public boolean method6563(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(20) Class5_Sub15 local20 = (Class5_Sub15) this.aClass330_43.method7908(); local20 != null; local20 = (Class5_Sub15) this.aClass330_43.method7914()) {
			if (local20.method1415(arg1, arg0)) {
				local20.method1416(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pha", name = "f", descriptor = "(I)V")
	public void method6564() {
		this.anInt7398 = 0;
		this.anInt7400 = 12800;
		this.anInt7397 = 12800;
		this.anInt7405 = 0;
		for (@Pc(23) Class5_Sub15 local23 = (Class5_Sub15) this.aClass330_43.method7908(); local23 != null; local23 = (Class5_Sub15) this.aClass330_43.method7914()) {
			if (local23.anInt1746 < this.anInt7400) {
				this.anInt7400 = local23.anInt1746;
			}
			if (local23.anInt1745 > this.anInt7398) {
				this.anInt7398 = local23.anInt1745;
			}
			if (local23.anInt1732 > this.anInt7405) {
				this.anInt7405 = local23.anInt1732;
			}
			if (local23.anInt1739 < this.anInt7397) {
				this.anInt7397 = local23.anInt1739;
			}
		}
	}
}
