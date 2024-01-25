import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!kq", name = "n", descriptor = "Lclient!kq;")
	public Class23_Sub1 aClass23_Sub1_7;

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "Lclient!kq;")
	public Class23_Sub1 aClass23_Sub1_8;

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)V")
	public final void method3683() {
		if (this.aClass23_Sub1_8 != null) {
			this.aClass23_Sub1_8.aClass23_Sub1_7 = this.aClass23_Sub1_7;
			this.aClass23_Sub1_7.aClass23_Sub1_8 = this.aClass23_Sub1_8;
			this.aClass23_Sub1_8 = null;
			this.aClass23_Sub1_7 = null;
		}
	}
}
