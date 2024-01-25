import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public final class Class176 {

	@OriginalMember(owner = "client!iga", name = "c", descriptor = "I")
	public int anInt4157;

	@OriginalMember(owner = "client!iga", name = "i", descriptor = "Ljava/lang/String;")
	public String aString48;

	@OriginalMember(owner = "client!iga", name = "d", descriptor = "I")
	public int anInt4154 = 43594;

	@OriginalMember(owner = "client!iga", name = "e", descriptor = "Z")
	private boolean aBoolean372 = false;

	@OriginalMember(owner = "client!iga", name = "h", descriptor = "Z")
	private boolean aBoolean373 = true;

	@OriginalMember(owner = "client!iga", name = "f", descriptor = "I")
	public int anInt4161 = 443;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(Lclient!iga;B)Z")
	public boolean method3772(@OriginalArg(0) Class176 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt4157 == arg0.anInt4157 && this.aString48.equals(arg0.aString48);
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(B)V")
	public void method3776() {
		if (!this.aBoolean373) {
			this.aBoolean372 = true;
			this.aBoolean373 = true;
		} else if (this.aBoolean372) {
			this.aBoolean372 = false;
		} else {
			this.aBoolean373 = false;
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZLclient!vo;)Lclient!hma;")
	public Class163 method3777(@OriginalArg(1) Class389 arg0) {
		return arg0.method9279(this.aString48, this.aBoolean372, this.aBoolean373 ? this.anInt4161 : this.anInt4154);
	}
}
