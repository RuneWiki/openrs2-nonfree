import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class5_Sub4_Sub1 extends Class5_Sub4 {

	@OriginalMember(owner = "client!av", name = "B", descriptor = "I")
	public int anInt516 = 0;

	@OriginalMember(owner = "client!av", name = "A", descriptor = "I")
	public int anInt515 = 12800;

	@OriginalMember(owner = "client!av", name = "O", descriptor = "I")
	public int anInt526 = 0;

	@OriginalMember(owner = "client!av", name = "Q", descriptor = "Z")
	public boolean aBoolean44 = true;

	@OriginalMember(owner = "client!av", name = "K", descriptor = "I")
	public int anInt523 = 12800;

	@OriginalMember(owner = "client!av", name = "N", descriptor = "I")
	public int anInt525 = -1;

	@OriginalMember(owner = "client!av", name = "T", descriptor = "I")
	public int anInt529 = -1;

	@OriginalMember(owner = "client!av", name = "L", descriptor = "Ljava/lang/String;")
	public final String aString10;

	@OriginalMember(owner = "client!av", name = "I", descriptor = "I")
	public final int anInt521;

	@OriginalMember(owner = "client!av", name = "E", descriptor = "I")
	public final int anInt518;

	@OriginalMember(owner = "client!av", name = "S", descriptor = "Ljava/lang/String;")
	public final String aString11;

	@OriginalMember(owner = "client!av", name = "D", descriptor = "Lclient!ro;")
	public final Class306 aClass306_5;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class5_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt529 = arg4;
		this.aBoolean44 = arg5;
		this.aString10 = arg2;
		this.anInt521 = arg0;
		this.anInt518 = arg3;
		this.anInt525 = arg6;
		this.aString11 = arg1;
		if (this.anInt525 == 255) {
			this.anInt525 = 0;
		}
		this.aClass306_5 = new Class306();
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
	public void method540() {
		this.anInt516 = 0;
		this.anInt515 = 12800;
		this.anInt526 = 0;
		this.anInt523 = 12800;
		for (@Pc(28) Class5_Sub48 local28 = (Class5_Sub48) this.aClass306_5.method7313(); local28 != null; local28 = (Class5_Sub48) this.aClass306_5.method7301()) {
			if (this.anInt515 > local28.anInt9760) {
				this.anInt515 = local28.anInt9760;
			}
			if (this.anInt526 < local28.anInt9756) {
				this.anInt526 = local28.anInt9756;
			}
			if (this.anInt523 > local28.anInt9749) {
				this.anInt523 = local28.anInt9749;
			}
			if (local28.anInt9753 > this.anInt516) {
				this.anInt516 = local28.anInt9753;
			}
		}
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(III)Z")
	public boolean method541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(18) Class5_Sub48 local18 = (Class5_Sub48) this.aClass306_5.method7313(); local18 != null; local18 = (Class5_Sub48) this.aClass306_5.method7301()) {
			if (local18.method8363(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "([IIIII)Z")
	public boolean method543(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(18) Class5_Sub48 local18 = (Class5_Sub48) this.aClass306_5.method7313(); local18 != null; local18 = (Class5_Sub48) this.aClass306_5.method7301()) {
			if (local18.method8362(arg2, arg1, arg3)) {
				local18.method8360(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(III[I)Z")
	public boolean method545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(16) Class5_Sub48 local16 = (Class5_Sub48) this.aClass306_5.method7313(); local16 != null; local16 = (Class5_Sub48) this.aClass306_5.method7301()) {
			if (local16.method8364(arg0, arg1)) {
				local16.method8359(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I[III)Z")
	public boolean method546(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) Class5_Sub48 local11 = (Class5_Sub48) this.aClass306_5.method7313(); local11 != null; local11 = (Class5_Sub48) this.aClass306_5.method7301()) {
			if (local11.method8363(arg2, arg0)) {
				local11.method8360(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}
}
