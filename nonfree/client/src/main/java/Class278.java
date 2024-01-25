import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public final class Class278 {

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
	public int anInt8394;

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "Ljava/lang/String;")
	public String aString94;

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
	public int anInt8395 = 443;

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "Z")
	private boolean aBoolean720 = false;

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
	public int anInt8398 = 43594;

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "Z")
	private boolean aBoolean721 = true;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZLclient!ql;)Z")
	public boolean method6938(@OriginalArg(1) Class278 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt8394 == arg0.anInt8394 && this.aString94.equals(arg0.aString94);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLclient!nga;)Lclient!wp;")
	public Class376 method6939(@OriginalArg(1) Class228 arg0) {
		return arg0.method5940(this.aString94, this.aBoolean720, this.aBoolean721 ? this.anInt8395 : this.anInt8398);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
	public void method6940() {
		if (!this.aBoolean721) {
			this.aBoolean720 = true;
			this.aBoolean721 = true;
		} else if (this.aBoolean720) {
			this.aBoolean720 = false;
		} else {
			this.aBoolean721 = false;
		}
	}
}
