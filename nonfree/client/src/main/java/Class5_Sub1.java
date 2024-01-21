import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OBKNBIRU")
public class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!OBKNBIRU", name = "f", descriptor = "Lclient!OBKNBIRU;")
	public Class5_Sub1 aClass5_Sub1_36;

	@OriginalMember(owner = "client!OBKNBIRU", name = "g", descriptor = "Lclient!OBKNBIRU;")
	public Class5_Sub1 aClass5_Sub1_37;

	@OriginalMember(owner = "client!OBKNBIRU", name = "e", descriptor = "Z")
	private boolean aBoolean199 = false;

	@OriginalMember(owner = "client!OBKNBIRU", name = "b", descriptor = "()V")
	public final void method543() {
		if (this.aClass5_Sub1_37 != null) {
			this.aClass5_Sub1_37.aClass5_Sub1_36 = this.aClass5_Sub1_36;
			this.aClass5_Sub1_36.aClass5_Sub1_37 = this.aClass5_Sub1_37;
			this.aClass5_Sub1_36 = null;
			this.aClass5_Sub1_37 = null;
		}
	}
}
