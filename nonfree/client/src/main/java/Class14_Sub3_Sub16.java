import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sha")
public final class Class14_Sub3_Sub16 extends Class14_Sub3 {

	@OriginalMember(owner = "client!sha", name = "E", descriptor = "I")
	public int anInt9285 = -1;

	@OriginalMember(owner = "client!sha", name = "D", descriptor = "I")
	public int anInt9284 = 0;

	@OriginalMember(owner = "client!sha", name = "H", descriptor = "I")
	public int anInt9287 = 12800;

	@OriginalMember(owner = "client!sha", name = "O", descriptor = "I")
	public int anInt9293 = 12800;

	@OriginalMember(owner = "client!sha", name = "y", descriptor = "I")
	public int anInt9281 = -1;

	@OriginalMember(owner = "client!sha", name = "T", descriptor = "I")
	public int anInt9296 = 0;

	@OriginalMember(owner = "client!sha", name = "S", descriptor = "Z")
	public boolean aBoolean653 = true;

	@OriginalMember(owner = "client!sha", name = "C", descriptor = "I")
	public final int anInt9283;

	@OriginalMember(owner = "client!sha", name = "B", descriptor = "Ljava/lang/String;")
	public final String aString91;

	@OriginalMember(owner = "client!sha", name = "z", descriptor = "I")
	public final int anInt9282;

	@OriginalMember(owner = "client!sha", name = "F", descriptor = "Ljava/lang/String;")
	public final String aString92;

	@OriginalMember(owner = "client!sha", name = "M", descriptor = "Lclient!ok;")
	public final Class262 aClass262_63;

	@OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class14_Sub3_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aBoolean653 = arg5;
		this.anInt9283 = arg0;
		this.anInt9285 = arg4;
		this.anInt9281 = arg6;
		this.aString91 = arg2;
		this.anInt9282 = arg3;
		this.aString92 = arg1;
		if (this.anInt9281 == 255) {
			this.anInt9281 = 0;
		}
		this.aClass262_63 = new Class262();
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(ZII)Z")
	public boolean method7673(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(17) Class14_Sub35 local17 = (Class14_Sub35) this.aClass262_63.method6318(); local17 != null; local17 = (Class14_Sub35) this.aClass262_63.method6311()) {
			if (local17.method5573(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(II[II)Z")
	public boolean method7674(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(15) Class14_Sub35 local15 = (Class14_Sub35) this.aClass262_63.method6318(); local15 != null; local15 = (Class14_Sub35) this.aClass262_63.method6311()) {
			if (local15.method5574(arg0, arg2)) {
				local15.method5572(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sha", name = "e", descriptor = "(B)V")
	public void method7675() {
		this.anInt9296 = 0;
		this.anInt9287 = 12800;
		this.anInt9293 = 12800;
		this.anInt9284 = 0;
		for (@Pc(27) Class14_Sub35 local27 = (Class14_Sub35) this.aClass262_63.method6318(); local27 != null; local27 = (Class14_Sub35) this.aClass262_63.method6311()) {
			if (this.anInt9284 < local27.anInt6879) {
				this.anInt9284 = local27.anInt6879;
			}
			if (local27.anInt6868 < this.anInt9293) {
				this.anInt9293 = local27.anInt6868;
			}
			if (this.anInt9287 > local27.anInt6869) {
				this.anInt9287 = local27.anInt6869;
			}
			if (this.anInt9296 < local27.anInt6877) {
				this.anInt9296 = local27.anInt6877;
			}
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "([IZIII)Z")
	public boolean method7676(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(18) Class14_Sub35 local18 = (Class14_Sub35) this.aClass262_63.method6318(); local18 != null; local18 = (Class14_Sub35) this.aClass262_63.method6311()) {
			if (local18.method5571(arg2, arg1, arg3)) {
				local18.method5568(arg0, arg3, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(I[III)Z")
	public boolean method7680(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(16) Class14_Sub35 local16 = (Class14_Sub35) this.aClass262_63.method6318(); local16 != null; local16 = (Class14_Sub35) this.aClass262_63.method6311()) {
			if (local16.method5573(arg0, arg2)) {
				local16.method5568(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}
}
