import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public final class Class212 {

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "Ljava/lang/String;")
	public String aString157;

	@OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
	public int anInt6145;

	@OriginalMember(owner = "client!mq", name = "h", descriptor = "I")
	public int anInt6142 = 443;

	@OriginalMember(owner = "client!mq", name = "k", descriptor = "Z")
	private boolean aBoolean433 = false;

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
	public int anInt6137 = 43594;

	@OriginalMember(owner = "client!mq", name = "g", descriptor = "Z")
	private boolean aBoolean432 = false;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BLclient!k;)Lclient!sw;")
	public Class309 method4971(@OriginalArg(1) Class168 arg0) {
		return arg0.method4084(this.aBoolean433, this.aString157, this.aBoolean432 ? this.anInt6142 : this.anInt6137);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
	public void method4973() {
		if (!this.aBoolean432) {
			this.aBoolean433 = true;
			this.aBoolean432 = true;
		} else if (this.aBoolean433) {
			this.aBoolean433 = false;
		} else {
			this.aBoolean432 = false;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!mq;B)Z")
	public boolean method4974(@OriginalArg(0) Class212 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt6145 == this.anInt6145 && this.aString157.equals(arg0.aString157);
		}
	}
}
